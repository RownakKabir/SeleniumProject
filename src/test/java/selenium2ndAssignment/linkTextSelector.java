package selenium2ndAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkTextSelector {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/links.php");
        Thread.sleep(1000);

        driver.findElement(By.linkText("Home")).click();

    }
}
