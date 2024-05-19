package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
/**
 * Project-5 - ProjectName : com-utimateqa
 * BaseUrl = https://courses.ultimateqa.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Click on ‘Sign In’ link
 * 7. Print the current url
 * 8. Enter the email to email field.
 * 9. Enter the password to password field.
 * 10. Click on Login Button.
 * 11. Navigate to baseUrl.
 * 12. Navigate forward to Homepage.
 * 13. Navigate back to baseUrl.
 * 14. Refresh the page.
 * 15. Close the browser
 */
public class ChromeBrowser {
    static String baseUrl = "https://courses.ultimateqa.com/";                        //Base Url

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();                                        //Launch chrome browser
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
    }
}
