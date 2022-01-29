package practice_01_26_2022.inheritance;

public class Instagram extends MobileApp{

    public Instagram(String version){
        super("Instagram",version);
    }

    public void postPhoto(){
        System.out.println("Posting photo");
    }

    @Override
    public void useTheApp(int minutes) {
        super.useTheApp(minutes);
        System.out.println("Using Intagram");
        postPhoto();
    }
}
