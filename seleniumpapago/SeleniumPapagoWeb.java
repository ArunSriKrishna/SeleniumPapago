
package seleniumpapago;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.*;
import static org.openqa.selenium.By.name;
import org.openqa.selenium.JavascriptExecutor;
 

public class SeleniumPapagoWeb  
{
    static String baseurl = "";
    static String[] language = {"auto", "ko", "en", "ja", "zh-CN", "zh-TW", "es", "fr", "de", "ru", "pt", "it", "vi", "th", "id", "hi"};
    

    public static void main(String[] args) throws InterruptedException
    {

    System.setProperty("webdriver.chrome.driver", "<chrome driver>");
    WebDriver driver = new ChromeDriver();
    driver.manage().window();
    
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    driver.get("https://papago.naver.net/website?locale=en&source=auto&target=en&url="+baseurl));
   
    driver.switchTo().frame("translatedFrame");
    WebElement text = driver.findElement(By.xpath("/html/body/div[1]/div/article/div"));
    
    System.out.println(text.getText());
    
    }
    
}
