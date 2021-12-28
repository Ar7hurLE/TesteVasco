package Steps;

import Pages.VascoPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStep {

    private VascoPage driver;

    @Given("^estamos no google$")
    public void estamos_no_google() throws Throwable {
     driver = new VascoPage();
    }

    @When("^procuramos por vasco da gama$")
    public void procuramos_por_vasco_da_gama() throws Throwable {
       driver.search("Vasco da gama");
    }

    @And("^clicamos no resultado que obtém url do site oficial$")
    public void clicamos_no_resultado_que_obtém_url_do_site_oficial() throws Throwable {
        driver.siteVasco();
    }

    @And("^entramos no site$")
    public void entramos_no_site() throws Throwable {
        driver.verificaSite();
    }

    @Then("^o brasão do Vasco deve estar lá$")
    public void o_brasão_do_Vasco_deve_estar_lá() throws Throwable {
        driver.verificaBrasao();
        driver.quit();
    }
}




