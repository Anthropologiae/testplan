package methods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import  parcer.parcer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class methods extends parcer {

    public static WebDriver driver;

    public WebElement element;






    public void start(String start) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        vait("1000");

        driver.get(url);

    }

    public void click(String xpath){
        try {
            driver.findElement(new By.ByXPath(but)).click();
        }
        catch (Exception e){
            System.out.println("Ошибка при нажатии кнопки");
        }
    }

    public void vait (String xpath) throws InterruptedException {

        Thread.sleep(Long.parseLong(ms));
    }

    public void down() throws InterruptedException {
        vait("3000"); //чисто для посмотреть
        driver.close();
    }

    public void scroll(){

        try {
            element = driver.findElement(By.xpath(xpath));
            Actions act = new Actions(driver);
            act.moveToElement(element);
            act.perform();
        }
        catch(Exception e){
            System.out.println("Ошибка при надатии кнопки");
        }
    }

    public void open (String Url) {
        driver.get(url);
    }

    public void input (String inpt) {

       element = driver.findElement(new By.ByXPath(input));

    }









}
