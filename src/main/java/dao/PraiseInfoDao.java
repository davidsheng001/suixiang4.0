package dao;

import entity.Praise;

import java.util.List;

public interface PraiseInfoDao {
    //点赞
    int insertPraise(Praise praise);
    //取消点赞
    int deletePraise(int praId);
    //查看点赞信息
    List<Praise> getPraiseById(int praId);
    //查看点赞数
    int getPraiseCount(int blogId);
}