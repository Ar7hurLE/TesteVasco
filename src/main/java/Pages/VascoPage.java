package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class VascoPage {

    static WebDriver navegate;

    public VascoPage() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/HP/IdeaProjects/TesteVasco/src/drivers/chromedriver.exe");
        navegate = new ChromeDriver();
        maximiza();
        navegate.get("https://google.com/");
    }
    public void search(String search) {
        WebElement Busca = navegate.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        Busca.sendKeys(search);
        Busca.submit();
    }
    public void siteVasco() {
        navegate.findElement(By.xpath("//*[@id=\"rso\"]/div[3]/div/div[1]/div/div/div/div[1]")).click();
    }
    public void verificaSite() {
        Assert.assertFalse(navegate.getCurrentUrl().equals("https://google.com/"));
    }
    public void verificaBrasao() {
        navegate.findElement(By.xpath("//*[@id=\"navigation-sticky\"]/div/div/div/div[2]/div/a/img"));
    }

    public void quit() {navegate.quit();}

    public void maximiza() {navegate.manage().window().maximize();}
}
