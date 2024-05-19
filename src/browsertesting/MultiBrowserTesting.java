package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Scanner;

public class MultiBrowserTesting {
    static WebDriver driver;
    static String baseUrl = "https://courses.ultimateqa.com/";                        //Base Url

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter browser name to : ");
        String browser = scanner.nextLine();
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong browser name");
        }

        driver.get(baseUrl);                                                          //Open the url into browseer
        driver.manage().window().maximize();                                          //Maximize window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));            //Implict wait
        System.out.println("Title of the page is : " + driver.getTitle());            //Print title
        System.out.println("Current Url is : " + driver.getCurrentUrl());             //Print current Url
        System.out.println("Page source is : " + driver.getPageSource());             //Print page source
        driver.findElement(By.linkText("Sign In")).click();                           //Click on sign in link
        System.out.println("Current Url is : " + driver.getCurrentUrl());             //Print current Url
        driver.findElement(By.id("user[email]")).sendKeys("nishitchitaliya@gmail.com"); //Enter email
        driver.findElement(By.id("user[password]")).sendKeys("Nishit8664");             //Enter password
        driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click(); //Click on sign in buttone                           //Click login button
        driver.navigate().to(baseUrl);                                                //Navigate to base url
        driver.navigate().forward();                                                  //Navigate to forward
        driver.navigate().back();                                                     //Navigate back
        driver.navigate().refresh();                                                  //Refresh
        driver.quit();                                                                //Quit browser
        scanner.close();
    }
}
