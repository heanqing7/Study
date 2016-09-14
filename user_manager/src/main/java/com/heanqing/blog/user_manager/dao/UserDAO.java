package com.heanqing.blog.user_manager.dao;

import com.heanqing.blog.user_manager.vo.User;

import java.util.List;

/**
 * Created by heanqing on 16/9/14.
 */
public interface UserDAO {
    public int create(User user);

    public int delete(User user);

    public int update(User user);

    public User findUserById(int id);

    public List<User> findAll();

    //public void findByConditionPage(UserQueryModel model);
}
