package day_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_WindowHandle {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://amazon.com");

        System.out.println(driver.getWindowHandle()); // CDwindow-E8B8202F9E09D5B42B73C65267401603
        // Burasi bize her calismada yeni bir hascode verir
        // Farkli pencereler arasinda gezinebilmek icin get.WindowHandle() methodunu kullaniriz
    }
}
