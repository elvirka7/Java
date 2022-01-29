package practice_01_26_2022.final_package;

public class TestData {

    public static final String username = "username";
    public static final String password = "123";

    //username="abcd";

    public  final void finalMethod(){
        System.out.println("Final method");
    }

}

class Child extends TestData{

//    @Override
//    public void finalMethod() {
//        super.finalMethod();
//    }
}

