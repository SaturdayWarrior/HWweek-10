import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
    public static void main(String[] args) {
        String base = "https://www.wcht.org.uk/";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(base);
        driver.manage().window().maximize();
        String obj = driver.getTitle();
        System.out.println(obj);
        driver.close();

    }
}
