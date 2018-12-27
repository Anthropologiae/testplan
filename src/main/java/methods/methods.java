package methods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import  parcer.parcer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class methods extends parcer {

    public static WebDriver driver;

    public WebElement element;





    public void start(String start) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(start);
        //driver.get(input);

    }

    public void click(String path){
        try {
            element = driver.findElement(By.xpath(path));
            //element = driver.findElement(new By.ByXPath(xpath));
                    element.click();
        }
        catch (Exception e){
            System.out.println("Ошибка при нажатии кнопки");
        }
    }

    public void wait (String mill) throws InterruptedException {

        Thread.sleep(Long.parseLong(mill));
        //Thread.sleep(Long.parseLong(input));
    }

    public void down() throws InterruptedException {
        wait("3000"); //чисто для посмотреть
        driver.close();
        System.out.println("Успешное завершение");
    }

    public void scroll(String scroll){

        try {
            element = driver.findElement(By.xpath(scroll));
            //element = driver.findElement(new By.ByXPath(xpath));
            Actions act = new Actions(driver);
            act.moveToElement(element);
            act.perform();
        }
        catch(Exception e){
            System.out.println("Ошибка при скроле страницы");
        }
    }

    public void open (String Url) {
        driver.get(Url);
        // driver.get(input);
    }

    public void input (String inpt) {

       element = driver.findElement(By.xpath(inpt));

    }



    public void refresh() {
        driver.navigate().refresh();
    }

   /* public void checkCurrentURL(String url) {
        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = resolveVars(getPropertyOrStringVariableOrValue(url));
        assertThat("Текущий URL не совпадает с ожидаемым", currentUrl, is(expectedUrl));
        }*/




    public void newtab() {
        driver.navigate().refresh();
    }










}
