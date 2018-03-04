package com.sws.mapper;

        import com.sws.entity.User;

public interface UserMapper {
    public User findUserById(int id) throws Exception;

}
