package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MainPage;
import pages.MoviePage;
import pages.SearchResultPage;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class Application {

    WebDriver driver;
    WebDriverWait wait;
    Properties properties;

    public MainPage mainPage;
    public SearchResultPage searchResultPage;
    public MoviePage moviePage;

    public Application() throws IOException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--lang=en");

        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, 5);

        properties = new Properties();
        FileReader file = new FileReader(new File(String.format("src/test/resources/%s.properties", System.getProperty("target", "local"))));
        properties.load(file);

        mainPage = new MainPage(driver, wait, properties);
        searchResultPage = new SearchResultPage(driver, wait, properties);
        moviePage = new MoviePage(driver, wait, properties);
    }

    public void quit() {
        driver.quit();
    }

    public void takeScreenshot(String fileName) {
        ScreenSaver.takeScreenshot(driver, fileName);
    }
}
