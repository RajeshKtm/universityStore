package mum.universitystore.dao;

import mum.universitystore.model.User;


public interface UserDao {

	User findByUserName(String username);

}