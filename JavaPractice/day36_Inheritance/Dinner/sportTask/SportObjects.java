package day36_Inheritance.Dinner.sportTask;

public class SportObjects {
    public static void main(String[] args) {

        Basketball basketball = new Basketball();
        basketball.setInfo("NBA", 10, 2,13);
        basketball.play();
        basketball.crossover();
        basketball.wraparound();
        basketball.dribble();
        System.out.println("basketball = " + basketball);


        Baseball baseball= new Baseball();
        baseball.setInfo("Pirates", 9,7,15);
        baseball.play();
        baseball.pitch();
        baseball.sacrifice();
        System.out.println("baseball = " + baseball);


        Football football = new Football();
        football.setInfo("NFL", 11, 3,17);
        football.play();
        football.head();
        football.mark();
        football.pass();
        football.save();
        System.out.println("football = " + football);


        AmericanFootball americanFootball= new AmericanFootball();
        americanFootball.setInfo("Gridiron", 11,7,18);
        americanFootball.play();
        americanFootball.sweep();
        americanFootball.toss();
        americanFootball.trap();
        System.out.println("americanFootball = " + americanFootball);



    }
}
