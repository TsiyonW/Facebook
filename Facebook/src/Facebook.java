/*
 *   Tsiyon Wuletaw
 *   section 2 SE
 *   ATR/0672/08
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class Facebook {

    WebDriver driver = new ChromeDriver();

    public void metod1(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter username: ");
        String inputUsername ;
        inputUsername= input.next();
        System.out.println("Enter your password: ");
        String inputPassword;
        inputPassword = input.next();
        driver.get("http://www.facebook.com/");

        WebElement username = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("pass"));
        WebElement loginBtn = driver.findElement(By.id("loginbutton"));

        username.sendKeys(inputUsername);
        password.sendKeys(inputPassword);

        loginBtn.click();

        driver.get("http://www.facebook.com/");
        WebElement notificationCount = driver.findElement(By.id("notificationsCountValue"));
        System.out.println("You have "+ notificationCount.getText()+" notifications");


        driver.close();
    }
    public static void main(String [] args){
        Facebook facebook = new Facebook();
        facebook.metod1();

    }
}
