package pages.googleSearch;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class GoogleMainPage {
public SelenideElement searchInput = $x("//input[@title='Szukaj']");
public SelenideElement searchButton = $x("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']");
public SelenideElement pupUpAcceptButton = $x("//*[@id=\"L2AGLb\"]/div");
}
