package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStep {

    WebDriver driver;

    @Given("^estamos no google$")
    public void estamos_no_google() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:/Users/HP/IdeaProjects/TesteVasco/src/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://google.com/");
    }

    @When("^procuramos por vasco da gama$")
    public void procuramos_por_vasco_da_gama() throws Throwable {
        WebElement Busca = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        Busca.sendKeys("Vasco da gama");
        Busca.submit();
    }

    @And("^clicamos no resultado que obtém url do site oficial$")
    public void clicamos_no_resultado_que_obtém_url_do_site_oficial() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[3]/div/div[1]/div/div/div/div[1]")).click();
    }

    @And("^entramos no site$")
    public void entramos_no_site() throws Throwable {
        Assert.assertFalse(driver.getCurrentUrl().equals("https://google.com/"));
    }

    @Then("^o brasão do Vasco deve estar lá$")
    public void o_brasão_do_Vasco_deve_estar_lá() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"navigation-sticky\"]/div/div/div/div[2]/div/a/img"));
        driver.quit();
    }
}




