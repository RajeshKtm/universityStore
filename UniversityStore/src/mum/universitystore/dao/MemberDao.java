package mum.universitystore.dao;

import mum.universitystore.model.Member;



public interface MemberDao {

	Member findByUserName(String username);

}