package mapper;

import domain.BoardAttachVO;

import java.util.List;

public interface BoardAttachMapper {
    public void insert(BoardAttachVO vo);

    public void delete(BoardAttachVO vo);

    public List<BoardAttachVO> findByBno(Long bno);
}
