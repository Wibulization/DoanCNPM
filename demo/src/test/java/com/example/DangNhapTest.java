package com.example;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class DangNhapTest {
    /**
     * Rigorous Test :-)
     */


    WebDriver driver;

    @Before
    public void Starting() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Diluc-Kun\\Downloads\\Homework\\OOP\\Java\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.get("https://hikiyoshi.github.io/testweb1/");


        
    }

    

///************Test code chức năng đăng nhập***************************


        @Test
    public void dangnhap_rong() {
        try {
            //TH1 chua nhap j het
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id='dangnhap']")).click();
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id='giaodien']/div[3]/input")).click();
            Thread.sleep(1500);
        }
        catch(Exception e)
        {

        }
    }
    @Test
    public void dangnhap_khongmatkhau() 
    {
        try {
            //TH2 chua nhap mat khau
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id='dangnhap']")).click();
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id='tk']")).sendKeys("user");
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id='giaodien']/div[3]/input")).click();
            Thread.sleep(1500);
        } catch (Exception e) {
           
        }
            
    }
    @Test
    public void dangnhap_khongtaikhoan()
    {
        try {
            //TH3 chua nhap tai khoan
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id='dangnhap']")).click();
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id='mk']")).sendKeys("123456");
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id='giaodien']/div[3]/input")).click();
            Thread.sleep(1500);
        } catch (Exception e) {
            // TODO: handle exception
        }
            
    }
    @Test
    public void dangnhap_saitaikhoan()
    {
        try {
            //TH4 nhap sai tai khoan
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id='dangnhap']")).click();
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id='tk']")).sendKeys("use");
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id='mk']")).sendKeys("123456");
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id='giaodien']/div[3]/input")).click();
            Thread.sleep(1500);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
            
    @Test
    public void dangnhap_saimatkhau()
    {
        try {
            //TH5 nhap sai mat khau
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id='dangnhap']")).click();
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id='tk']")).sendKeys("user");
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id='mk']")).sendKeys("12345");
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id='giaodien']/div[3]/input")).click();
            Thread.sleep(1500);
        } catch (Exception e) {
            // TODO: handle exception
        }
            
    }
    @Test
    public void dangnhap_dung()
    {
        try{
            //TH6 nhap dung tai khoan va mat khau
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id='dangnhap']")).click();
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id='tk']")).sendKeys("user");
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id='mk']")).sendKeys("123456");
            Thread.sleep(1500);
            driver.findElement(By.xpath("//*[@id='giaodien']/div[3]/input")).click();
            Thread.sleep(1500);
            driver.switchTo().alert().accept();
        } catch (Exception e) {

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


