package gui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.googleSearch.GoogleSearchPage;

public class SearchSteps {

    public final GoogleSearchPage googleSearchPage;

    public SearchSteps() {
        this.googleSearchPage = new GoogleSearchPage();
    }


    @And("User check the number of pages")
    public void userCheckTheNumberOfPages() {
        String result = googleSearchPage.resultStats.getText();
        System.out.println(result);
    }
    @When("User click on first link on page")
    public void userClickOnFirstLinkOnPage() {
        googleSearchPage.wikiKomarowate.click();
    }
}
