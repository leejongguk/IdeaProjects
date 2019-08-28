package iBatis1.dao;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import iBatis1.model.Member;

@Repository
public class MemberDaoImpl implements MemberDao {
	
	private static SqlMapClient sqlMapper;
	static {
		try {
			Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
			sqlMapper = SqlMapClientBuilder.buildSqlMapClient(reader);
			reader.close();
		} catch (IOException e) {
			System.out.println("salMap에러 : "+e.getMessage());
		}
	}
	
	public Member select(String id) {
		Member member = null;
		try { 
			member = (Member)sqlMapper.queryForObject("select",id);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return member;
	}
	
	public int insert(Member member) {
		int result = 0;
		try { 
			sqlMapper.insert("insert",member);
			result = 1;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return result;
	}
}