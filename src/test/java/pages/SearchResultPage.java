package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Properties;

public class SearchResultPage extends BasePage {

    @FindBy(xpath = "//*[@class='findList']")
    WebElement resultTable;

    @FindBy(xpath = "//*[@class='findList']//a")
    WebElement firstSearchResult;

    public SearchResultPage(WebDriver driver, WebDriverWait wait, Properties properties) {
        super(driver, wait, properties);
    }

    public boolean isResultIncludedMovieName(String movieName) {
        try {
            resultTable.findElement(By.linkText(movieName));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void clickOnFirstResult () {
        firstSearchResult.click();
    }
}
