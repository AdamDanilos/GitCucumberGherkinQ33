package pages.googleSearch;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class GoogleSearchPage {
    public SelenideElement resultStats = $x("//div[@id='result-stats']");
    public SelenideElement wikiKomarowate = $x("//h3[contains(text(),'Komarowate – Wikipedia, wolna encyklopedia')]");
}
