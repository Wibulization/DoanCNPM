package com.example;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class TimKiemTest {
    WebDriver driver;

    @Before
    public void Starting() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Diluc-Kun\\Downloads\\Homework\\OOP\\Java\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.get("https://hikiyoshi.github.io/testweb1/");


        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2) );
        // WebElement ele = driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button']")) ;
        // ele.click();
    }

    @Test
    public void timkiem() {
        try {
            //TH1: tìm kiếm trên bảng tìm kiếm
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id='tktxt']")).sendKeys("Iphone");
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id='menu']/ul/div/i")).click();
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id='tktxt']")).sendKeys("Xiaomi");
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id='menu']/ul/div/i")).click();
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id='tktxt']")).sendKeys("Samsung");
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id='menu']/ul/div/i")).click();
            driver.findElement(By.xpath("//*[@id='tktxt']")).sendKeys("1234");
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id='menu']/ul/div/i")).click();
            driver.findElement(By.xpath("//*[@id='tktxt']")).sendKeys("I");
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id='menu']/ul/div/i")).click();
            Thread.sleep(1500);
        }catch(Exception e)
        {

        }
    }
    @Test
    public void timkiem_theogiatri()
    {
        try{
            //TH2: Tìm kiếm theo giá trị
            driver.findElement(By.xpath("//*[@id='tkt']")).sendKeys("200");
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id='tkc']")).sendKeys("300");
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id='loctheogia']/div/i")).click();
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id='tkt']")).sendKeys("0");
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id='tkc']")).sendKeys("0");
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id='loctheogia']/div/i")).click();
            //Nhap cac ki tu
            driver.findElement(By.xpath("//*[@id='tkt']")).clear();
            driver.findElement(By.xpath("//*[@id='tkc']")).clear();
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id='tkt']")).sendKeys("abc");
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id='tkc']")).sendKeys("lck");
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id='loctheogia']/div/i")).click();
            Thread.sleep(1500);
            //Nhap gia tri min > gia tri max
            driver.findElement(By.xpath("//*[@id='tkt']")).clear();
            driver.findElement(By.xpath("//*[@id='tkc']")).clear();
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id='tkt']")).sendKeys("300");
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id='tkc']")).sendKeys("200");
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id='loctheogia']/div/i")).click();
            Thread.sleep(1500);
        }
        catch (Exception e) {

        }

    }
    
    @After
    public void Finish()
    {
        try{
            Thread.sleep(4000);
            driver.quit();
            }
            catch (Exception e)
            {
    
            }
    }
}


