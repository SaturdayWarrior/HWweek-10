import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
    public static void main(String[] args) {
        String base = "https://www.nopcommerce.com/demo";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver drive = new EdgeDriver();
        drive.get(base);
        drive.manage().window().maximize();
        String obj =drive.getTitle();
        System.out.println(obj);
        drive.close();
    }
}
