package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Properties;

public class MoviePage extends BasePage {

    @FindBy(xpath = "//*[@data-testid='hero-title-block__title']")
    WebElement Title;

    public MoviePage(WebDriver driver, WebDriverWait wait, Properties properties) {
        super(driver, wait, properties);
    }

    public String getTitle() {
        return Title.getText();
    }
}
