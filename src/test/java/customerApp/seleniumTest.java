package customerApp;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class seleniumTest {
    WebDriver driver;
    @Before
    public void beforetest(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\khush\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.MILLISECONDS);
        driver.manage().deleteAllCookies();
    }

    @Test
    public void testTitleOfVinsys(){
        String expected="Training & Certification Courses - Professional & Corporate";
        driver.get("https://www.vinsys.com");
        driver.navigate();
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        assertTrue((driver.getTitle()).equals(expected));
        driver.close();
    }
}
