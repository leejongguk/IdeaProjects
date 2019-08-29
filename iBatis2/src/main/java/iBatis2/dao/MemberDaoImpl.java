package iBatis2.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import iBatis2.model.Member;

@Repository
public class MemberDaoImpl implements MemberDao {
	@Autowired
	private SqlMapClientTemplate smp;

	public Member select(String id) {
		return (Member) smp.queryForObject("select", id);
	}

	public int insert(Member member) {
		int result = 0;
		try {
			smp.insert("insert", member);
			result = 1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return result;
	}

	public int loginChk(String id, String password) {
		int result = 0;
		Member member = select(id);
		if (member != null) {
			String dbPass = member.getPassword();
			if (dbPass.equals(password))
				result = 1;
		} else
			result = -1;
		return result;
	}

	public int update(Member member) {
		return smp.update("update", member);
	}

	public int delete(String id) {
		return smp.delete("delete", id);
	}
}