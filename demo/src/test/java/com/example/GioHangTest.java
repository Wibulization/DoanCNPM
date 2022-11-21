package com.example;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Unit test for simple App.
 */
public class GioHangTest 
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
        
        
        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2) );
        // WebElement ele = driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button']")) ;
        // ele.click();
        dangnhap();
    }
    public void dangnhap()
    {
        try{
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='dangnhap']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='tk']")).sendKeys("user");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='mk']")).sendKeys("123456");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='giaodien']/div[3]/input")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        }
        catch (Exception e)
        {
            
        }
    }
    @Test
    public void giohangchuadangnhap()
    {
        try {
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id='dangnhap']")).click();
            driver.findElement(By.xpath("//*[@id='0']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id='order']")).click();
        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }
     @Test
     public void khongco_sanphamgiohang()
     {
         driver.findElement(By.xpath("//*[@id='nutGH']")).click();
     }
     @Test
     public void them1sanpham()
     {
         try{
            driver.findElement(By.xpath("//*[@id='0']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id='order']")).click();
            Thread.sleep(1000);
            driver.switchTo().alert().accept();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id='BangTTSP']/div[3]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id='nutGH']")).click();
         }
         catch (Exception e)
         {

         }
    }

    
     @Test
    public void tangsosanpham()
    {
        try{
        
        driver.findElement(By.xpath("//*[@id='0']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='order']")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='BangTTSP']/div[3]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='nutGH']")).click();
        WebElement soluong = driver.findElement(By.xpath("//input[@id='GH0']"));
        Thread.sleep(1000);
        soluong.clear();
        for(int i=0;i<3;i++)
        {
            Thread.sleep(500);
            soluong.sendKeys(Keys.ARROW_UP);
        }
        }
        catch (Exception e)
        {}
    }
    @Test
    public void themnhieusanpham()
    {
        try{
            //Them sp1
            driver.findElement(By.xpath("//*[@id='0']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id='order']")).click();
            Thread.sleep(800);
            driver.switchTo().alert().accept();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id='BangTTSP']/div[3]")).click();
            //Them sp2
            driver.findElement(By.xpath("//*[@id='1']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id='order']")).click();
            Thread.sleep(800);
            driver.switchTo().alert().accept();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id='BangTTSP']/div[3]")).click();
            //Them sp3
            driver.findElement(By.xpath("//*[@id='2']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id='order']")).click();
            Thread.sleep(800);
            driver.switchTo().alert().accept();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id='BangTTSP']/div[3]")).click();
            //An nut gio hang
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id='nutGH']")).click();
        }
        catch (Exception e)
        {

        }
    }
    @Test
    public void xoasp()
    {
        try {
            themnhieusanpham();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id='contentGH']/div/div[4]")).click();
            
        } catch (Exception e) {
            
        }
    }
    @Test
    public void xoanhieusp()
    {
        try {
            
            themnhieusanpham();
            while(driver.findElement(By.xpath("//*[@id='contentGH']/div/div[4]"))!= null)
            {
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id='contentGH']/div/div[4]")).click();
            }
            
        } catch (Exception e) {
            
        }
    }
    @Test
    public void soam_sanpham()
    {
        try{
        
        driver.findElement(By.xpath("//*[@id='0']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='order']")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='BangTTSP']/div[3]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='nutGH']")).click();
        WebElement soluong = driver.findElement(By.xpath("//input[@id='GH0']"));
        Thread.sleep(1000);
        soluong.clear();
        //so am
        Thread.sleep(500);
        soluong.sendKeys("-2");
        
        }
        catch (Exception e)
        {}
    }
    @Test
    public void kitu_sanpham()
    {
        try{
        
        driver.findElement(By.xpath("//*[@id='0']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='order']")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='BangTTSP']/div[3]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='nutGH']")).click();
        WebElement soluong = driver.findElement(By.xpath("//input[@id='GH0']"));
        Thread.sleep(1000);
        soluong.clear();
        //so am
        Thread.sleep(500);
        soluong.sendKeys("abc");
        
        }
        catch (Exception e)
        {}
    }
    @Test
    public void thanhtoan_chuso_sanpham()
    {
        try{
        driver.findElement(By.xpath("//*[@id='0']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='order']")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='BangTTSP']/div[3]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='nutGH']")).click();
        WebElement soluong = driver.findElement(By.xpath("//input[@id='GH0']"));
        Thread.sleep(1000);
        soluong.clear();
        //chu 
        Thread.sleep(500);
        soluong.sendKeys("abc");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='bottomGH']/div[3]")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='topGH']/div[2]")).click();
        }
        catch (Exception e)
        {}
    }
    @Test
    public void thanhtoan_soam_sanpham()
    {
        try{
        driver.findElement(By.xpath("//*[@id='0']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='order']")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='BangTTSP']/div[3]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='nutGH']")).click();
        WebElement soluong = driver.findElement(By.xpath("//input[@id='GH0']"));
        Thread.sleep(1000);
        soluong.clear();
        //so am
        Thread.sleep(500);
        soluong.sendKeys("-2");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='bottomGH']/div[3]")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='topGH']/div[2]")).click();
        }
        catch (Exception e)
        {}
    }
    @Test
    public void koco_sanpham_thanhtoan()
    {
        try{
            driver.findElement(By.xpath("//*[@id='nutGH']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id='bottomGH']/div[3]")).click();
        }
        catch(Exception e)
        {
            
            
        }
    }
    @Test
    public void dongtrinhduyet()
    {
        try {
            String originalwindow = driver.getWindowHandle();
            driver.findElement(By.xpath("//*[@id='0']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id='order']")).click();
            Thread.sleep(1000);
            driver.switchTo().alert().accept();
            Thread.sleep(1000);
            driver.switchTo().newWindow(WindowType.WINDOW);
            String newWin = driver.getWindowHandle();
            Thread.sleep(1000);
            driver.switchTo().window(originalwindow);
            Thread.sleep(1000);
            driver.close();
            Thread.sleep(700);
            driver.switchTo().window(newWin);
            driver.get("https://hikiyoshi.github.io/testweb1/");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id='nutGH']")).click();
            driver.findElement(By.xpath("//*[@id='dangnhap']")).click();
            
            
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
