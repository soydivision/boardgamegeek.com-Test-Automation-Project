package com.github.passmesomesugar.smoke;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverConditions.url;
import static com.codeborne.selenide.WebDriverConditions.urlStartingWith;

public class MainPageAccessTest extends BasicTestConditions {
    @Test(groups = "smoke")
    public void openMainPageAndCheckURL() {
        Configuration.timeout = URL_CHECKS_TIMEOUT;
        open(BASEURL);
        Selenide.webdriver().shouldHave(url("https://boardgamegeek.com/"));
        Selenide.webdriver().shouldNotHave(url("http://yandex.ru"));
        Selenide.webdriver().shouldNotHave(urlStartingWith("http://boardgamegeek"));
    }
}
