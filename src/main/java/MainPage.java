import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
   private WebDriver driver;


    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
    private By siginInButton = By.xpath("//a[@class='HeaderMenu-link flex-shrink-0 no-underline']");
    private By siginUpButton = By.xpath("//a[@class='HeaderMenu-link flex-shrink-0 d-inline-block no-underline border color-border-default rounded px-2 py-1']");


    public LoginPage clikSiginIn() {
        driver.findElement(siginInButton).click();
        return new LoginPage(driver);

    }
    public SeginUpPage clikSiginUp() {
        driver.findElement(siginUpButton).click();
        return new SeginUpPage(driver);

    }




}


