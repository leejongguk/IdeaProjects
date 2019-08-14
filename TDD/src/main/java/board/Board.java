package board;

import java.util.ArrayList;

public class Board {


        ArrayList<Article> list = new ArrayList<Article>();
        int index=1;

        public int getArticleCount() {
            return list.size();
        }


        public void write(User a, String content) {
            Article article = new Article(index, content, a.name);
            list.add(article);
            index++;
        /*
        번호: 1 (index)
        내용:"안녕하세요"(content)
        글쓴이:A(a.name)
        날짜:2019-08-13(date)
        */
        }

        public String getWriter(int i) {
              for (int j = 0; j < list.size(); j++) {
                   Article article = (Article) list.get(j);
                   if(article.index==i)
                       return article.name;

                }
        return null;
    }

    public void display(){
        for (int j = 0; j < list.size() ; j++) {
            Article article = list.get(j);
            System.out.println(article);
        }
    }

    public void delete(User user, int i) {
        for (int j = 0; j < list.size() ; j++) {
            Article article = list.get(j);
            boolean cond1 = article.name.equals(user.name);
            boolean cond2 = article.index==1;
            if(cond1&&cond2){
                list.remove(j);
            }
            System.out.println(article);
        }
    }
}
