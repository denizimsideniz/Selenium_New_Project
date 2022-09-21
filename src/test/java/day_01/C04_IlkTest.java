package day_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_IlkTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        /*
        1- Amazon sayfasina gidiniz
        2- Basligin "Amazon" icerdigini test ediniz
        3- URL'in amazon icerdigini test edin
        4- Sayfayı kapatın
         */

        // 1- Amazon sayfasina gidiniz
        driver.get("https://amazon.com");

        //  2- Basligin "Amazon" icerdigini test ediniz
        String actualTitle = driver.getTitle();
        String istenenTitle = "Amazon";

        if (actualTitle.contains(istenenTitle)){
            System.out.println("Title Test : PASSED");
        }else System.out.println("Title Test : FAILED");

        /*
         String actualTitle = driver.getTitle();
         String istenenKelime = "Amazon";
         if (driver.getPageSource().contains(istenenKelime)){
         System.out.println("Title testi PASSED");
         }else System.out.println("Title testi FAILED");

         Olarak da yapılabilir.
         */

        //3- URL'in amazon icerdigini test edin
        String actualUrl = driver.getCurrentUrl();
        String arananKelime = "amazon";

        if (actualUrl.contains(arananKelime)){
            System.out.println("Url Testi : PASSED");
        }else System.out.println("Url Test : FAILED");

        // 4- Sayfayi kapatin
        driver.close();

    }
}
