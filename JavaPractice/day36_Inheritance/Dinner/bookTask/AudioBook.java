package day36_Inheritance.Dinner.bookTask;

public class AudioBook extends Book {

    public int length;
    public String narrator;

    public void setInfo(int length, String narrator) {
        this.length = length;
        this.narrator = narrator;
    }

    public void listen(){
        System.out.println("Everyone is listening to "+title+" narrated by "+narrator);
    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "length=" + length +
                ", narrator='" + narrator + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

}
