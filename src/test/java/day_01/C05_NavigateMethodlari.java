package day_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://amazon.com");
        // driver.navigate().to() methodu sayfada ileri geri yapacaksak kullanilir

        // driver.get() methodu gibi bizi istedigimiz URL'ye goturur

        driver.navigate().to("https://techproeducation.com");

        // Tekrar amazon sayfasina donelim
        Thread.sleep(3000);
        driver.navigate().back();

        // Tekrar techpro sayfasina donelim
        Thread.sleep(3000);
        driver.navigate().forward(); // ilk sayfadan ileriye gider

        // Techproed sayfasini yenileyelim
        Thread.sleep(3000);
        driver.navigate().refresh(); // sayfayi yeniler

        // son olarak sayfayi kapatiniz
        driver.close();




    }
}
