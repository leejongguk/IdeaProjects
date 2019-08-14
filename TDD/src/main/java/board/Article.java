package board;

import java.util.Date;

public class Article {

    int index;
    String content;
    String name;
    String date;

    public Article(int index, String content, String name) {
        String date = new Date().toString();
        this.index = index;
        this.content = content;
        this.name = name;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Article[index=" + index + ", cointent=" + content + ",name=" + name + ",date=" + date + "]";
    }
}
