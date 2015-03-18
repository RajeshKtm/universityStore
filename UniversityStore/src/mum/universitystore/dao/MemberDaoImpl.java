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
		// TODO Auto-generated method stub
		return null;
	}

	// @Autowired
	// private SessionFactory sessionFactory;
	//
	// @SuppressWarnings("unchecked")
	// public Member findByUserName(String username) {
	//
	// List<Member> members = sessionFactory.getCurrentSession()
	// .createQuery("from User where username=?")
	// .setParameter(0, username).list();
	// if (members != null && members.size() == 1)
	// return members.get(0);
	// else
	// return null;
	// }
}