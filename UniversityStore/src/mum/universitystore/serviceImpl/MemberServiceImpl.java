package mum.universitystore.serviceImpl;

import java.util.List;

import mum.universitystore.model.Member;
import mum.universitystore.repository.MemberRepository;
import mum.universitystore.service.CredentialsService;
import mum.universitystore.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberRepository memberRepository;

	@Autowired
	CredentialsService credentialsService;

	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public void saveFull(Member member) {
		credentialsService.save(member.getCredentials());
		memberRepository.save(member);
	}

	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public void save(Member member) {
		memberRepository.save(member);
	}

	public List<Member> findAll() {
		return (List<Member>) memberRepository.findAll();
	}

	public Member findByMemberNumber(int memberId) {
		return memberRepository.findByMemberNumber(memberId);
	}

}
