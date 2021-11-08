import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
    public static void main(String[] args) {
        String base = "https://www.x-cart.com";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver drive = new FirefoxDriver();
        drive.get(base);
        drive.manage().window().maximize();
        String obj = drive.getTitle();
        System.out.println(obj);
        drive.close();
    }
}
