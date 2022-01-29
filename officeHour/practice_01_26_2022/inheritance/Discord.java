package practice_01_26_2022.inheritance;

public class Discord extends MobileApp{

    public Discord(String version){
        super("Discord",version);
    }

    public void chat(String someone){
        System.out.println("Chatting with "+someone);
    }

    @Override
    public void useTheApp(int minutes) {
        super.useTheApp(minutes);
        System.out.println("Using Discord");
        chat("Mom");
    }
}
