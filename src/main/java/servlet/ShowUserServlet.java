package servlet;

import dao.TranspondInfoDao;
import dao.TranspondInfoDaoImpl;
import dao.UserInfoDaoImpl;
import entity.Transpond;
import entity.User;
import net.sf.json.JSONArray;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/ShowUser")
public class ShowUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("utf-8");
        response.setCharacterEncoding("utf-8");
        //不好用
//        UserInfoDaoImpl userdao = new UserInfoDaoImpl();
//        List<User> userList = userdao.getAllUser();
//        JSONArray users = JSONArray.fromObject(userList);
        //转发 好使
//        TranspondInfoDao transImpl = new TranspondInfoDaoImpl();
//        Transpond transpond = new Transpond(1,2);
//        int a = transImpl.insertTranspond(transpond);
        PrintWriter out = response.getWriter();
        out.println();
        out.flush();
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
