package com.selenium.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 * To export the runnable program Right click on the project ,click on export . From the java option choose "Runnable jar file" then next screen choose the second option "package required libraries into generated jar"
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "Hello World!" );
        //For running in browser mode below driver need to setup in the local system
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\arup.ghosh\\Desktop\\TCS\\Study\\devops\\chromedriver-win64\\chromedriver.exe");
        
        //For make it independent of chrome driver ,we need to use the pom.xml dependency of chrome webdrivermanager. below property need to add
        WebDriverManager.chromedriver().setup();
        
        ChromeOptions chromeOptions = new ChromeOptions();
        
        //For making the test without openning the browser in the front end headless properties need to add
        
        chromeOptions.addArguments("--headless");
        WebDriver driver = new ChromeDriver(chromeOptions);
        
        // open browser and access to get the application url
        driver.get("http://3.92.128.136:8080/AddressBookDeploy/");
        
        //enable wait of 2 seconds
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        
        //click on newcontact button id =gwt-uid-2
        driver.findElement(By.className("v-button")).click(); 
        
        //locate firstname field  and enter details
        
        driver.findElement(By.id("gwt-uid-5")).sendKeys("Arup");
        
        //Thread.sleep(1000);
        
        //locate lastName field  and enter details
        
        driver.findElement(By.id("gwt-uid-7")).sendKeys("Ghosh");
        //Thread.sleep(1000);
        
        //locate phone field  and enter details
        
        driver.findElement(By.id("gwt-uid-9")).sendKeys("111111");
        //Thread.sleep(1000);
        
         //locate email field  and enter details
        
        driver.findElement(By.id("gwt-uid-11")).sendKeys("arupcemk@gmail.com");
        //Thread.sleep(1000);
        
 //locate date of Birth field  and enter details
        
        driver.findElement(By.id("gwt-uid-13")).sendKeys("26/04/1987");
        //Thread.sleep(1000);
        
 //locate save field  and click on save
        
        driver.findElement(By.className("v-button-primary")).click();
        Thread.sleep(1000);
        
//To asses the actual result and the expected result below section can be used .
        //String text = driver.findElement(By.className("v-Notification")).getText();
        //System.out.println(text);
       // assertEquals("Saved 'Arup Ghosh'.",text);
//To asses the actual result and the expected result above section can be used .
        driver.quit();
        System.out.println("Srcipt executed successfully");
        
    }

	private static void assertEquals(String string, String text) {
		// TODO Auto-generated method stub
		
	}
}
