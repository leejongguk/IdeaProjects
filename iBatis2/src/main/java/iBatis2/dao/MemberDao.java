package iBatis2.dao;

import iBatis2.model.Member;

public interface MemberDao {
	Member select(String id);

	int insert(Member member);

	int loginChk(String id, String password);

	int update(Member member);

	int delete(String id);

}