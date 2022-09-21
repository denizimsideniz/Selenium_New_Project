package day_01;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");

        //Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());

        //Sayfa basliginin “Amazon” icerdigini test edin
        String actualTitle = driver.getTitle();
        String istenenBaslik = "Amazon";

        if (actualTitle.contains(istenenBaslik)){
            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAILED");

        //Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());

        //Sayfa url’inin “amazon” icerdigini test edin.
        String actualUrl = driver.getCurrentUrl();
        String istenenKelime = "amazon";

        if (actualUrl.contains(istenenKelime)){
            System.out.println("Passed");
        }else System.out.println("Failed");

        //Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());

       //Sayfadaki kaynak kodlari yazdiriniz
        System.out.println(driver.getPageSource());
        System.out.println("***********************");

        //Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String gecenKelime = "Gateway";
        if (driver.getPageSource().contains(gecenKelime)){
            System.out.println("PASSED");
        } else System.out.println("FAILED");

        //Sayfayi kapatin.
        driver.close();
    }

}
