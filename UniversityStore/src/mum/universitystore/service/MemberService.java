package mum.universitystore.service;

import java.util.List;

import mum.universitystore.model.Member;

public interface MemberService {

	public void save(Member member);

	public List<Member> findAll();

	public Member findByMemberNumber(Long memberId);

	public void saveAll(Member member);
}
