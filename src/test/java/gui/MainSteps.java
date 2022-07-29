package gui;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.googleSearch.GoogleMainPage;

import java.util.Map;

import static com.codeborne.selenide.Selenide.*;

public class MainSteps {

    private final GoogleMainPage googleMainPage;

    public MainSteps() {
        this.googleMainPage = new GoogleMainPage();
    }

    @Given("User is on landing page")
    public void userIsOnLandingPage(){
        open("https://www.google.com/");
        googleMainPage.pupUpAcceptButton.click();
    }

    @And("User input searching terms")
    public void userInputSearchingTerms(DataTable dataTable) {
        Map <String, String> listValues = dataTable.asMaps().get(0);

        googleMainPage.searchInput.setValue(listValues.get("sesearchingTerms"));
    }

    @And("^User set (.+)$")
    public void userSet(String searchingterms) {
        googleMainPage.searchInput.sendKeys(searchingterms);
    }

    @And("User click search button")
    public void userClickSearchButton() {

        googleMainPage.searchButton.click();
    }
}
