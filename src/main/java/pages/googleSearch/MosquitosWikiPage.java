package pages.googleSearch;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MosquitosWikiPage {
    public SelenideElement title = $x("//h1[@id='firstHeading']");
}
