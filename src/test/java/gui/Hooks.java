package gui;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.selenide.AllureSelenide;

public class Hooks {

    @Before
    public void beforeGui(Scenario scenario){
        System.out.println("###############RUN TESTS - SETUP##############");
        SelenideLogger.addListener(
                "allureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
        Configuration.screenshots = true;
        Configuration.reportsFolder = "target/selenide-screenshots";
        Configuration.downloadsFolder = "target/selenide-downloads";
        Configuration.headless = false;
        Configuration.timeout = 45000;
        System.out.println("Uruchomiono scenariusz: " + scenario.getName());
    }
}
