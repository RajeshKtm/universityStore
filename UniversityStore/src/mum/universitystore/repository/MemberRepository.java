package mum.universitystore.repository;

import mum.universitystore.model.Member;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends CrudRepository<Member, String> {
	//

	// public Member findByMemberNumber(int memberNumber);
}
