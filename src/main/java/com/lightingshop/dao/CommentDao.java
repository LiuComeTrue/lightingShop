package com.lightingshop.dao;

public interface CommentDao {

    /**
     * 获取灯饰产品的评论总数
     * @param lightID
     * @return
     */
    Integer CountComments(Integer lightID);
}
