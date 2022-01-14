package day38_Inheritance.browserTask;

import java.util.ArrayList;
import java.util.Arrays;

public class BrowserObjects {
    public static void main(String[] args) {

        ChromeBrowser chrome = new ChromeBrowser();
        FireFox fireFox = new FireFox();
        Opera opera = new Opera();
        Safari safari = new Safari();

        ArrayList<Browser> browserList = new ArrayList<>(Arrays.asList(chrome,fireFox,opera,safari));

        for (Browser browser : browserList) {
            browser.openBrowser();
            browser.closeBrowser();
        }

        System.out.println(browserList);


    }
}
