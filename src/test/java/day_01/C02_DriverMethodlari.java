package day_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize(); // Acilan pencereyi max. boyutuna getirir

        //  Amazon sayfasina gidiniz
        driver.get("https://amazon.com");

        // Kaynak kodlari icinde "Gateway" kelimesinin oldugunu test ediniz

        System.out.println(driver.getPageSource()); // Sayfadaki kaynak kodlari bize verir

        System.out.println("***************************************************");

        String istenenKelime = "Gateway";
        if(driver.getPageSource().contains(istenenKelime)){
            System.out.println("PageSource testi PASSED");
        }else {
            System.out.println("PageSource testi FAILED");
        }
        driver.close(); // Sayfayı kapatmayı saglar
        // driver.quit(); // Birden fazla sayfa varsa hepsini kapatir
    }
}
