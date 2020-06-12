import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.assertTrue;

public class SeleniumTest {
    private WebDriver driver;

    @Before
    public void setUp(){

        ChromeOptions chromeOptions= new ChromeOptions();
        chromeOptions.setBinary("/opt/chromedriver");
      //  System.setProperty("webdriver.chrome.driver","/opt/chromedriver");
        driver = new ChromeDriver(chromeOptions);
    }
    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void seleniumTest(){
        driver.navigate().to("https://theindianaura.com/");
        String title = driver.getTitle();
        assertTrue(title.contains("The Indian Aura"));
    }
}
