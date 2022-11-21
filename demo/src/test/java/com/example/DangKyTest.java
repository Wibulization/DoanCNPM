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
public class DangKyTest
{
    /**
     * Rigorous Test :-)
     */
    
    
    WebDriver driver;
    @Before 
    public void Starting()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Diluc-Kun\\Downloads\\Homework\\OOP\\Java\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.get("https://hikiyoshi.github.io/testweb1/");
        dangky();
    }
    
    @Test
    //TestDangKy
    public void dangky()
    {
    	String[] user={"usertest","123456","tester","0123456789"};
    	try {
    		//TH1:KhongNhapGi
    		Thread.sleep(1500);
    		driver.findElement(By.xpath("//*[@id='dangnhap']")).click();
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("//*[contains(text(),'Đăng ký')]")).click();
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("//*[@id='giaodien']/a[1]/input")).click();
    		
    		//TH2:BoSot1TruongBatKy
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("//input[@id='tk']")).sendKeys(user[0]);
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("//input[@id='mk']")).sendKeys(user[1]);
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("//input[@id='ph']")).sendKeys(user[3]);
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("//*[@id='giaodien']/a[1]/input")).click();
    		
    		//TH3:NhapUsernameItHon5KyTu
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("//input[@id='tk']")).clear();
    		driver.findElement(By.xpath("//input[@id='tk']")).sendKeys("abcd");
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(user[2]);
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("//*[@id='giaodien']/a[1]/input")).click();
    		
    		//TH4:NhapPasswordItHon5KyTu
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("//input[@id='tk']")).clear();
    		driver.findElement(By.xpath("//input[@id='tk']")).sendKeys(user[0]);
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("//input[@id='mk']")).clear();
    		driver.findElement(By.xpath("//input[@id='mk']")).sendKeys("1234");
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("//*[@id='giaodien']/a[1]/input")).click();
    		
    		//TH5:NhapSDTKhac10So
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("//input[@id='mk']")).clear();
    		driver.findElement(By.xpath("//input[@id='mk']")).sendKeys(user[1]);
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("//input[@id='ph']")).clear();
    		driver.findElement(By.xpath("//input[@id='ph']")).sendKeys("123456789");
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("//*[@id='giaodien']/a[1]/input")).click();
    		
    		
    		//TH6:NhapSDTKhacDangSo
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("//input[@id='ph']")).clear();
    		driver.findElement(By.xpath("//input[@id='ph']")).sendKeys("asbvdgd");
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("//*[@id='giaodien']/a[1]/input")).click();
    		Thread.sleep(1000);
    		driver.switchTo().alert().accept();
    		
    		//TH7:TaiKhoanDaCo
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("//input[@id='tk']")).clear();
    		driver.findElement(By.xpath("//input[@id='tk']")).sendKeys("admin");
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("//input[@id='ph']")).clear();
    		driver.findElement(By.xpath("//input[@id='ph']")).sendKeys(user[3]);
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("//*[@id='giaodien']/a[1]/input")).click();
    		Thread.sleep(1000);
    		driver.switchTo().alert().accept();
    		
    		//TH8:TatcaThongTinHopLe
    		Thread.sleep(2000);
    		driver.findElement(By.xpath("//input[@id='tk']")).clear();
    		driver.findElement(By.xpath("//input[@id='tk']")).sendKeys(user[0]);
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("//*[@id='giaodien']/a[1]/input")).click();
    		Thread.sleep(1000);
    		driver.switchTo().alert().accept();
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("//input[@id='tk']")).sendKeys(user[0]);
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("//input[@id='mk']")).sendKeys(user[1]);
    		driver.findElement(By.xpath("//*[@id='giaodien']/div[3]/input")).click();
    		Thread.sleep(1000);
    		driver.switchTo().alert().accept();
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
