import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    protected static WebDriver driver;
    public WebElement element(By Locator){
        return driver.findElement(Locator);
    }

    @BeforeClass
    public static void before(){
        String s = System.setProperty("webdriver.chrome.driver", "C:\\Users\\oz-ka\\IdeaProjects\\ChromeDriver");
        driver=new ChromeDriver();
    }
    @AfterClass
    public static void after() throws InterruptedException{
        Thread.sleep(3000);
    }

    public WebDriver getDriver(){
        return driver;
    }
}
