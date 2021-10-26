package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Properties;

public class MainPage extends BasePage {

    @FindBy (xpath = "//*[@id='suggestion-search']")
    WebElement searchLine;

    public MainPage(WebDriver driver, WebDriverWait wait, Properties properties) {
        super(driver, wait, properties);
    }

    public void search(String text) {
        searchLine.sendKeys(text);
        searchLine.submit();
    }
}
