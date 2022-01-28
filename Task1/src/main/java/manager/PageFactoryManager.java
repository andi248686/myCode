package manager;

import org.openqa.selenium.WebDriver;
import pages.InitPage;
import pages.HomePage;

public class PageFactoryManager {
    WebDriver driver;

    public PageFactoryManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {
        return new HomePage(driver);
    }

    public InitPage getInitPage() {
        return new InitPage(driver);
    }
}
