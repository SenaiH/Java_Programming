package day_31_MethodOverriding.browserTask;

public class ChromeBrowser extends Browser {
    @Override
    public void openBrowser() {
        System.out.println("opening chrome browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing chrome browser");
    }
}
