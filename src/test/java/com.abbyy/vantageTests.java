package com.abbyy;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class vantageTests extends vantageTestBase{
    @Tag("remote")
    @Test
    void smokeSlotegratorMainPageTest() {


        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Open main page", () -> open(baseUrl));
        step("Check if Products & Solutions menu is working", () -> {
            $(byText("Products & Solutions")).hover()
                    .shouldBe(visible)
                    .click();

        });

        step("Check if Insights menu is working", () -> {
            $(byText("Insights")).hover()
                    .shouldBe(visible)
                    .click();
        });

        step("Check if Partners menu is working", () -> {
            $(byText("Partners")).hover()
                    .shouldBe(visible)
                    .click();
        });

        step("Check if Support & Services menu is working", () -> {
            $(byText("Support & Services")).hover()
                    .shouldBe(visible)
                    .click();
        });

        step("Check if Company menu is working", () -> {
            $(byText("Company")).hover()
                    .shouldBe(visible)
                    .click();
        });

        step("Check if change language is working", () -> {
            $(byText("English")).hover()
                    .shouldBe(visible)
                    .click();
        });

        step("Click on Contact Us", () -> {
            $(byText("Contact Us")).hover()
                    .shouldBe(visible, Duration.ofSeconds(2))
                    .click();
        });

        step("Fill contact form", () -> {

            $("#firstname-f1933e9f-c6d9-4c86-a8ec-6c376b31a77d")
                    .shouldBe(visible, Duration.ofSeconds(5))
                    .setValue("Vladimir");
            $("#lastname-f1933e9f-c6d9-4c86-a8ec-6c376b31a77d")
                    .shouldBe(visible, Duration.ofSeconds(2))
                    .setValue("Borchevskiy");
            $("#email-f1933e9f-c6d9-4c86-a8ec-6c376b31a77d")
                    .shouldBe(visible, Duration.ofSeconds(2))
                    .setValue("arsenaljkeeee10@gmail.com");
            $("#email-f1933e9f-c6d9-4c86-a8ec-6c376b31a77d")
                    .shouldBe(visible, Duration.ofSeconds(2))
                    .setValue("arsenaljkeeee10@gmail.com");
            $("#phone-f1933e9f-c6d9-4c86-a8ec-6c376b31a77d")
                    .shouldBe(visible, Duration.ofSeconds(2))
                    .setValue("+995597078392");
            $("#label-projectdescriptiontemp-f1933e9f-c6d9-4c86-a8ec-6c376b31a77d\n")
                    .shouldBe(visible, Duration.ofSeconds(2))
                    .setValue("Hello, i'm Vladimir, Quality Assurance Engineer with a demonstrated history of working in software product-based companies, and i inspired by ABBYY and would like to assure an outstanding quality in Vantage, lets have an interview!");

        });

        sleep(50000);

    }
}





