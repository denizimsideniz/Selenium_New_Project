package day_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilkclass {
    /*
       En temel haliyle bir otomasyon yapmak için
       Class'ımıza otomasyon için gerekli olan webdriver'in yerini göstermemiz gerekir
       bunun için java kutuphanesinde System.setProperty() method'unu kullanırız
       ve metthod'un içine ilk olarak driver'i yazarız. İkinci olarak onun fiziki yolunu kopyalarız
        */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://techproeducation.com/");
    }
}
