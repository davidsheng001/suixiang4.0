package servlet;

import dao.BlogInfoDao;
import dao.BlogInfoDaoImpl;
import entity.Blog;
import entity.User;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import util.JsonDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

@WebServlet("/ShowBlogInfo")
public class ShowBlogServlet extends HttpServlet {
    int userId;
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String method = request.getParameter("method");//得到传入的值下面根据传入的值执行不同的方法！！
        System.out.println("method="+method);
        if(method.equals("showMyBlogCount"))
        {
            showMyBlogCount(request, response);//执行blogCount代码
        } else if(method.equals("showMyBlogInfo")){
            showMyBlogInfo(request, response);//执行BlogInfo代码
        }

    }

    private void showMyBlogCount(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException
    {
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        userId = user.getUserId();
        BlogInfoDao blogInfoDao = new BlogInfoDaoImpl();
        int myBlogCount = blogInfoDao.getCountBlog(userId);
        PrintWriter out = response.getWriter();
        out.print(myBlogCount);
        out.flush();
        out.close();
    }

    private void showMyBlogInfo(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException
    {
        String ip = request.getHeader("x-forwarded-for");
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        BlogInfoDao blogInfoDao = new BlogInfoDaoImpl();
        List<Blog> myBlogInfoList = blogInfoDao.getAllBlog(userId);
        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.registerJsonValueProcessor(Date.class , new JsonDate());
        JSONArray array = JSONArray.fromObject(myBlogInfoList,jsonConfig);
        System.out.println(ip);
        PrintWriter out = response.getWriter();
        out.print(array);
        out.flush();
        out.close();
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}