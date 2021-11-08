import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
    public static void main(String[] args) {
        String base = "https://www.harrow.gov.uk";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(base);
        String obj = driver.getTitle();
        System.out.println(obj);
        driver.manage().window().maximize();
        driver.close();

    }
}
