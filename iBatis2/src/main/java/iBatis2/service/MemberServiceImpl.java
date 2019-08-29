package iBatis2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iBatis2.dao.MemberDao;
import iBatis2.model.Member;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDao md;

	public Member select(String id) {
		return md.select(id);
	}

	public int insert(Member member) {
		return md.insert(member);
	}

	public int loginChk(String id, String password) {
		return md.loginChk(id, password);
	}

	public int update(Member member) {
		return md.update(member);
	}

	public int delete(String id) {
		return md.delete(id);
	}
}