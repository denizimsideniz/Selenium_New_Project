package day_03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.time.Duration;

public class GetMethodlari {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //   -Amazon sayfasına gidiniz
        driver.get("https://amazon.com");

        //   -Arama kutusunu locate ediniz
        WebElement aramakutusu = driver.findElement(By.id("twotabsearchtextbox"));

        //   -Arama kutusunun tagName'inin input olduğunu test ediniz
        String expectedTagname = "input";
        String actualTagName = aramakutusu.getTagName();

        if (actualTagName.equals(expectedTagname)) {
            System.out.println("Tagname Test PASSED " + actualTagName);
        } else System.out.println("Tagname Test FAILED");

        //   -Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
        String expectedAtributuName = "field-keywords";
        String actualAtributuName = aramakutusu.getAttribute("name");

        if (actualAtributuName.equals(expectedAtributuName)) {
            System.out.println("Attribute Testi PASSED");
        } else System.out.println("Attribute Testi FAILED");


        // arama kutusunun konumunu yazdırınız
        System.out.println("Arama kutusu konumu: " + aramakutusu.getLocation());

        //   -Sayfayı kapatınız
        driver.close();


    }
}