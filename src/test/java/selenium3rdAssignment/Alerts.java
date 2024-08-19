package selenium3rdAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();


        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.manage().window().maximize();

        driver.findElement(By.id("OKTab")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);


        driver.findElement(By.cssSelector("a[href$='CancelTab']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("CancelTab")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(2000);



        driver.findElement(By.cssSelector("a[href$='#Textbox']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("Textbox")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("Rownak");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();







    }
}
