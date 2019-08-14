import board.Board;
import board.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BoardTests {


    @Test
    public void test(){
        Board board= new Board();
        User a =new User("A");
        assertNotNull(board);
        assertNotNull(a);
        //게시글이 0개냐
        assertEquals(0,board.getArticleCount());
        board.write(a, "안녕하세요");
        assertEquals(1,board.getArticleCount());
        assertEquals('A',board.getWriter(1));

        User b = new User("B");
        board.write(b,"반갑슴");
        board.display();
        assertEquals(2,board.getArticleCount());
        board.delete(a,1);
        assertEquals(1,board.getArticleCount());
        board.write(a,"물어볼게잇ㅇ엉");
        assertEquals(2,board.getArticleCount());
        board.display();
    }


}
