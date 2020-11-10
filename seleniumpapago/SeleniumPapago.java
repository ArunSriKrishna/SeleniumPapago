
package seleniumpapago;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class SeleniumPapago
{
    static String base_url = "https://papago.naver.com/";
    static String[] language = {"auto", "ko", "en", "ja", "zh-CN", "zh-TW", "es", "fr", "de", "ru", "pt", "it", "vi", "th", "id", "hi"};
    
    
    static String chrome_driver_location = ""; //location of the ChromeDriver
    static String source_lang = language[1]; //source text language code, assign language[0] for auto-detect
    static String trans_lang = language[2]; //translated text language code 
    
    public static void main(String[] args) throws InterruptedException 
    {

        base_url += "?sk=" + source_lang + "&tk=" + trans_lang;
        
        String source = "무언가에 쫓기는 듯 연신 뒤를 돌아보며 허겁지겁 도망치던 남자의 얼굴은 공포에 질려 있었다.";
        String[] translated = {"", ""};
        
        
        int chapter_count = 1;
        int i = 0;

        System.setProperty("webdriver.chrome.driver", chrome_driver_location);
        WebDriver driver = new ChromeDriver();
        driver.manage().window();

        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get(base_url);
        WebElement source_text = driver.findElement(By.xpath("/html/body/div/div/div[1]/section/div/div[1]/div[1]/div/div[3]/label/textarea"));    
        source_text.sendKeys(source);

        while(translated[0].equals("") == true || translated[0].equals("...") == true)
        {

        Thread.sleep(100);
        WebElement translated_text = driver.findElement(By.xpath("//*[@id=\"txtTarget\"]"));
        translated[0] = translated_text.getText();

            while(translated[0].equals(translated[1]) == true || translated[1].equals("") == true || translated[1].equals("...") == true)
            {
                i++;
                Thread.sleep(100);
                translated[1] = translated_text.getText();
                if(i>10)
                {
                    break;
                }
                
            }

        }

        System.out.println("source: " + source);
        System.out.println("traslated: " + translated[0]);

        if(translated[0].equals(translated[1]) == false)
        {
            System.out.println("traslated-refined: " + translated[1]);        
        }
    
    }
    
}
