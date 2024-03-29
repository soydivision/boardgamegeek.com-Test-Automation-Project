package com.github.soydivision.tests.page_links_tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.github.soydivision.CommonTestConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public class SocialMediaLinks extends CommonTestConditions {

    @Test(groups = {"sanity", "all"}, description = "Accessing Facebook - BGG Group page")
    public void facebookAccess() {
        getIndexPage().openPage();
        getIndexPage().clickFacebook();
        Selenide.webdriver().shouldHave(urlContaining("https://www.facebook.com/groups"));
        element(Selectors.byText("BoardGameGeek")).should(Condition.exist);
    }

    @Test(groups = {"sanity", "all"}, description = "Accessing Twitter - BGG page")
    public void twitterAccess() {
        getIndexPage().openPage();
        getIndexPage().clickTwitter();
        Selenide.webdriver().shouldHave(urlContaining("https://twitter.com/boardgamegeek"));
        element(Selectors.byText("BoardGameGeek")).should(Condition.exist);
    }

    @Test(groups = {"sanity", "all"}, description = "Accessing Instagram - BGG page")
    public void instagramAccess() {
        getIndexPage().openPage();
        getIndexPage().clickInstagram();
        Selenide.webdriver().shouldHave(urlContaining("instagram.com"));
    }

    @Test(groups = {"sanity", "all"}, description = "Accessing YouTube - BGG page")
    public void youtubeAccess() {
        getIndexPage().openPage();
        getIndexPage().clickYoutube();
        Selenide.webdriver().shouldHave(urlContaining("www.youtube.com"));
        element(Selectors.byText("BoardGameGeek")).should(Condition.exist);
    }

    @Test(groups = {"sanity", "all"}, description = "Accessing Twitch - BGG page")
    public void twitchAccess() {
        getIndexPage().openPage();
        getIndexPage().clickTwitch();
        Selenide.webdriver().shouldHave(urlContaining("https://www.twitch.tv/boardgamegeektv"));
    }

    @Test(groups = {"sanity", "all"}, description = "Accessing Discord - BGG page")
    public void discordAccess() {
        getIndexPage().openPage();
        getIndexPage().clickDiscord();
        Selenide.webdriver().shouldHave(urlContaining("https://discord.com/"));
        element(Selectors.byText("BoardGameGeek")).should(Condition.exist);
    }
}
