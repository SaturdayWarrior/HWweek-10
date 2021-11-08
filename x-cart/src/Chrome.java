import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
    public static void main(String[] args) {
        String base = "https://www.x-cart.com";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver drive = new ChromeDriver();
        drive.get(base);
        drive.manage().window().maximize();
        String ob = drive.getTitle();
        System.out.println(ob);
        drive.close();
    }
}
