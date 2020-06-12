import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class SeleniumTest {
    private WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","/var/lib/jenkins/workspace/selenium-test/chromedriver");
        driver = new ChromeDriver();
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
