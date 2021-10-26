package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {
    @Parameters("movieName")
    @Test
    public void SearchTest(String movieName) {
        app.mainPage.open();
        app.mainPage.search(movieName);

        Assert.assertTrue(app.searchResultPage.isResultIncludedMovieName(movieName));

        app.searchResultPage.clickOnFirstResult();

        Assert.assertEquals(app.moviePage.getTitle(), movieName);
    }}
