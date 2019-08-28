package iBatis1.dao;

import com.sun.swing.internal.plaf.synth.resources.synth_sv;
import iBatis1.model.Member;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.springframework.http.converter.json.GsonBuilderUtils;

public interface MemberDao {
	Member select(String id);

	int insert(Member member);

}