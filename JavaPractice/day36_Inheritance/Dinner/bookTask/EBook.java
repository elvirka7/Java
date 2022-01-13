package day36_Inheritance.Dinner.bookTask;

public class EBook extends Book{
    public String size;
    public int pages;

    public void setInfo(String size, int pages) {
        this.size = size;
        this.pages = pages;
    }


    public void readBook() {
        System.out.println("Everyone is reading "+title+" by "+author);

    }

    @Override
    public String toString() {
        return "EBook{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                ", pages=" + pages +
                '}';
    }
}
