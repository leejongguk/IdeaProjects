package iBatis1.service;

import iBatis1.model.Member;

public interface MemberService {
	Member select(String id);

	int insert(Member member);

}