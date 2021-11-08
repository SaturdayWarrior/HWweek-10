import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
    public static void main(String[] args) {
        String base = "https://www.wcht.org.uk/";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(base);
        driver.manage().window().maximize();
        String obj  =driver.getTitle();
        System.out.println(obj);
        driver.close();
    }
}
