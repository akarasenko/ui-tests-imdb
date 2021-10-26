package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Properties;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver, WebDriverWait wait, Properties properties) {
        super(driver, wait, properties);
    }
}
