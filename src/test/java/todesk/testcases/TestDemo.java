package todesk.testcases;

/**
 * HelloTestNg
 *
 * @author chenchao
 * @date 2023/2/9
 * @since 1.0.0
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;


public class TestDemo {

        private WebDriver driver;

        @BeforeMethod
        public void setBefore() {

            System.setProperty("webdriver.chrome.driver", "src//test//resources//chromedriver");
            //打开浏览器，使其最大化，并隐性等待两秒钟
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        }

        @AfterMethod
        public void setAfter() {
            //结束驱动程序进程，关闭浏览器
            driver.quit();
        }

        @Test(description = "定位百度一下")
        public void testBaiDu() {
            //输入网址
            driver.get("https://www.baidu.com/");
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            //定位到百度一下按钮
            WebElement name = driver.findElement(By.id("su"));
            String text = name.getAttribute("value");
            Assert.assertEquals(text, "百度一下");
        }

        @Test(groups = {"fast"})
        public void aFastTest() {
            System.out.println("Fast test");
        }

        @Test(groups = {"slow"})
        public void aSlowTest() {
            System.out.println("Slow test");
        }


}
