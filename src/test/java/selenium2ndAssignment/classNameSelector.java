package selenium2ndAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classNameSelector {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/forgot_password");
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("jannatkabir@gmail.com");
        driver.findElement(By.className("radius")).click();
    }
}
