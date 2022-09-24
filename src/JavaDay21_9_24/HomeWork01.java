package JavaDay21_9_24;

import java.util.ArrayList;

@SuppressWarnings({"all"})
public class HomeWork01 {
    public static void main(String[] args) {
        News news = new News("title", "text");
       // System.out.println(news);
        News news1 = new News("title10000000000");
       // System.out.println(news1);
        News news2 = new News("title2");
      //  System.out.println(news2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(news1);
        arrayList.add(news2);

        for (Object o :arrayList) {
          //  System.out.println(o);
        }
        for (int i = arrayList.size()-1; i >=0; i--) {
           News news3= (News)arrayList.get(i);
            System.out.println(processTitle(news3.getTitle()));
        }

    }
    public static String processTitle(String title) {
        if (title == null) {
            return "";
        }
        if(title.length()>15){
            return title.substring(0,15)+"...";
        }else {
            return title;
        }
    }
}
class News{
    private String title;
    private String text;

    public News(String title) {
        this.title = title;
    }

    public News(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                '}';
    }
}