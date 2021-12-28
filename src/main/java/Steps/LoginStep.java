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

    @Given("estamos no google")
    public void estamos_no_google() throws Throwable {
        System.setProperty("webdriver.chhrome.driver", "C:/Users/HP/IdeaProjects/TesteVasco/src/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://google.com/");
    }

        @When("procuramos por 'vasco'")
                public void pesquisa() throws Throwable {
            WebElement Busca = driver.findElement(By.id("input"));
            Busca.sendKeys("Vasco");
            Busca.submit();
        }

        @And("clicamos no resultado que obtém url 'https://vasco.com.br/'$")
    public void entrar_site() throws Throwable{
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[4]/div/div/div[1]/a/h3")).click();
    }

        @And("entramos no site")
    public void verifica() throws Throwable{
            Assert.assertFalse(driver.getCurrentUrl().equals("https://google.com/"));
            Assert.assertTrue(driver.getCurrentUrl().equals("https://vasco.com/"));
        }

        @Then("o brasão do Vasco deve estar lá")
        public void brasao() throws Throwable{
        Assert.assertEquals(By.id("navigation-sticky"), driver.findElement(By.id("navigation-sticky")));
        driver.quit();
        }

    }


