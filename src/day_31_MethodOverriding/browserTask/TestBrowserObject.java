package day_31_MethodOverriding.browserTask;

public class TestBrowserObject {
    public static void main(String[] args) {

        ChromeBrowser ch = new ChromeBrowser();
        FireFox fr = new FireFox();
        Opera op = new Opera();
        Safari sf = new Safari();

        ch.openBrowser();
        fr.closeBrowser();
        op.openBrowser();
        sf.closeBrowser();
    }
}
