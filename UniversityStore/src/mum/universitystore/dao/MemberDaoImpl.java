package mum.universitystore.dao;

import java.util.List;

import mum.universitystore.model.Member;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDaoImpl implements MemberDao {

	@Override
	public Member findByUserName(String username) {
		return null;
	}
}