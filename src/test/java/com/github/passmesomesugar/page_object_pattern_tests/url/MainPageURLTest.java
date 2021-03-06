package com.github.passmesomesugar.page_object_pattern_tests.url;

import com.codeborne.selenide.Selenide;
import com.github.passmesomesugar.CommonTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverConditions.url;
import static com.codeborne.selenide.WebDriverConditions.urlStartingWith;

public class MainPageURLTest extends CommonTestConditions {
    @Test(groups = "smoke", description = "checking AUT url for errors")
    public void openMainPageAndCheckURL() {
        open(MAIN_URL);
        Selenide.webdriver().shouldHave(url("https://boardgamegeek.com/"));
        Selenide.webdriver().shouldNotHave(url("http://example.com"));
        Selenide.webdriver().shouldNotHave(urlStartingWith("http://"));
        Selenide.webdriver().shouldNotHave(urlStartingWith("ftp://"));
        open(BLANK_PAGE);
    }
}
