package class23;

public interface WebDriver {
    /*
    Create a WebDriver Interface that will have the following unimplemented
     behaviour: openBrowser(), closeBrowser(), maximizeWindow(), findElement().
     Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
     */
    void openBrowser();
     void closeBrowser();
     void maximizeWindow();
     void findElement();

    void get(String s);
}
 abstract class ChromeDriver implements WebDriver {
    @Override
    public void openBrowser() {
        System.out.println("Opening Chrome browser");
    }
    @Override
    public void closeBrowser() {
        System.out.println("Closing Chrome browser");
    }
    @Override
    public void maximizeWindow() {
        System.out.println("Maximizing Chrome window");
    }
    @Override
    public void findElement() {
        System.out.println("Finding element in Chrome");
    }
}
 abstract class FirefoxDriver implements WebDriver {
    @Override
    public void openBrowser() {
        System.out.println("Opening Firefox browser");
    }
    @Override
    public void closeBrowser() {
        System.out.println("Closing Firefox browser");
    }
    @Override
    public void maximizeWindow() {
        System.out.println("Maximizing Firefox window");
    }
    @Override
    public void findElement() {
        System.out.println("Finding element in Firefox");
    }
}

