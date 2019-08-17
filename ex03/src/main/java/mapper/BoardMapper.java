package mapper;

import domain.BoardAttachVO;
import domain.BoardVO;
import domain.Criteria;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BoardMapper {

	public List<BoardVO> getList();

	public List<BoardVO> getListWithPaging(Criteria cri);

	public void insert(BoardVO board);

	public Integer insertSelectKey(BoardVO board);

	public BoardVO read(Long bno);

	public int delete(Long bno);

	public int update(BoardVO board);

	public int getTotalCount(Criteria cri);

	public void updateReplyCnt(@Param("bno") Long bno, @Param("amount") int amount);

	public List<BoardAttachVO> findByBno(Long bno);

}
