import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
    public static void main(String[] args) {
        String base = "https://www.x-cart.com";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver drive = new EdgeDriver();
        drive.get(base);
        drive.manage().window().maximize();
        String xy = drive.getTitle();
        System.out.println(xy);
        drive.close();
    }
}
