import board2.Board2;
import org.junit.Test;
import board2.User2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BoardTest2 {

    @Test
    public void test(){

        Board2 board = new Board2();
        User2 k = new User2("K");
        User2 l = new User2("L");
        assertNotNull(board);
        assertNotNull(k);
        assertNotNull(l);
        assertEquals(0,board.getArticleCount()); //게시글이 하나도 없다.
        board.write(k,"안녕하세요","1234");
        assertEquals(1,board.getArticleCount());
        board.write(l,"반갑습니다.","1111");
        assertEquals(2,board.getArticleCount());
        assertEquals("안녕하세요",board.getArticleCount(0).content); //0번 글 내용확인

        board.update(k,0,"9999","안녕");
        assertEquals("안녕하세요",board.getArticleCount(0).content);
        board.update(k,0,"1234","안녕");
        assertEquals("안녕", board.getArticleCount(0).content);
    }
}
