package board2;

import java.util.ArrayList;

public class Board2 {
    ArrayList<Article2> list = new ArrayList<Article2>();
     int index=0;
    public int getArticleCount() {
        return list.size();
    }

    public void write(User2 user2, String content, String password) {
        list.add(new Article2(index, user2.name, content, password));
        index++;
    }


    public Article2 getArticleCount(int no) {
        for (Article2 article2 : list ) {
            if(article2.index ==no)
                return article2;
        }

        return null;
    }

    public void update(User2 user2, int no, String password, String newContent) {
        //유저 이름 일치하는가, 게시글 번호 일치하는가,비번 일치하는가 -> 일치하면 content 수정
        for (int i = 0; i < list.size(); i++) {
            Article2 article2 = list.get(i);

            boolean cond1 = article2.name.equals(user2.name);
            boolean cond2 = article2.index==index;
            boolean cond3 = article2.password.equals(password);
            if(cond1 && cond2 && cond3){
                article2.content = newContent;
                list.set(i,article2);
            }
        }

    }
}
