package JavaFastTrack.javaFastTrack1.day06;

public class Test {
	public static void main(String[] args) {
		AbstractPractice inst1 = new PolymorphismPract();
		
		PolymorphismPract inst2 = new PolymorphismPract();
		
		inst1.print();
		inst1.method3();
		inst1.method();
		
		inst2.print();
		inst2.method2();
	}
}
