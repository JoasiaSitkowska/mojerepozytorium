package com.selenium.web;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

/**
 * Created by Asia on 2016-03-13.
 */
public class Mail {

    @Test

    public void goToPage() throws IOException, InterruptedException, AWTException {

        File file = new File("C:\\Selenium\\IEDriverServer_Win32_2.52.0\\IEDriverServer.exe");
        System.setProperty("webdriver.ie.driver", file.getAbsolutePath());

        WebDriver driver = new InternetExplorerDriver();
        driver.get("http://www.google.pl/");

        WebElement gmail = driver.findElement(By.cssSelector("div[class='gb_Q gb_R'] a[data-pid='23']"));
        gmail.click();

        WebElement poleEmail = driver.findElement(By.cssSelector("input[id='Email']"));
        poleEmail.sendKeys("login"); //podaj login


        WebElement dalejbutn = driver.findElement(By.cssSelector("input[id='next']"));
        dalejbutn.click();

        WebElement polePassword = driver.findElement(By.cssSelector("input[id='Passwd']"));
        polePassword.sendKeys("haslo"); //podaj haslo

        WebElement logbutn = driver.findElement(By.cssSelector("input[id='signIn']"));
        logbutn.click();

        WebElement utworzbutn = driver.findElement(By.cssSelector("div[class='z0'] div[tabindex='0']"));
        utworzbutn.click();

        WebElement poleDo = driver.findElement(By.cssSelector("div[class='wO nr l1'] textarea[id=':nf']"));
        poleDo.sendKeys("mail@gmail.com"); // podaj adres email

        WebElement temat = driver.findElement(By.cssSelector("input[id=':mz']"));
        temat.sendKeys("test");

        WebElement poletxt = driver.findElement(By.cssSelector("div[id=':o4']"));
        poletxt.sendKeys("TO JEST TEST NAPISANY W SELENIUM Z ZALACZNIKIEM");


        Thread.sleep(15000);


        WebElement zalacznik = driver.findElement(By.cssSelector("div[class='a1 aaA aMZ']"));
        zalacznik.click();

        //Thread.sleep(15000);

        StringSelection ss = new StringSelection("C:\\Users\\Public\\Pictures\\Sample Pictures.Koala.jpg");

        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        Robot robot = new Robot();
        Thread.sleep(5000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        Thread.sleep(6000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(10000);



        WebElement wysli = driver.findElement(By.cssSelector("div[id=':mp']"));
        wysli.click();

    }
}
