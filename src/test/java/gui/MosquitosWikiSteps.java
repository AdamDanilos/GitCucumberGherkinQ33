package gui;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.googleSearch.GoogleSearchPage;
import pages.googleSearch.MosquitosWikiPage;

public class MosquitosWikiSteps {

    public final MosquitosWikiPage mosquitosWikiPage;

    public MosquitosWikiSteps() {
        this.mosquitosWikiPage = new MosquitosWikiPage();
    }

    @And("User check title of page")
    public void userCheckTitleOfPage() {
        mosquitosWikiPage.title.shouldBe(Condition.visible);
        String title = mosquitosWikiPage.title.getText();
        System.out.println(title);
    }
    @Then("User quit page")
    public void userQuitPage() {
        Selenide.closeWebDriver();
    }
}
