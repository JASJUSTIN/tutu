import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Parallel {


   WebDriver driver;

    @Test
    public void test1() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\SeleniumParallelTestingFinal\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Testing");

    }

    @Test
    public void test2() {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\IdeaProjects\\SeleniumParallelTestingFinal\\src\\main\\resources\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();


        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Testing");
    }

    public static void main(String[] args) throws Exception {

        System.out.println("WELCOME TO WORLD JESUS");



    }


    @AfterMethod
    public void tearDown()
    {

    }
}