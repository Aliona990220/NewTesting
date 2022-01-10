import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
   private WebDriver driver;


    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
    @FindBy(xpath = "//a[@class='HeaderMenu-link flex-shrink-0 no-underline']")
    private WebElement siginInButton ;

    @FindBy(xpath = "//a[@class=//a[@class='HeaderMenu-link flex-shrink-0 d-inline-block no-underline border color-border-default rounded px-2 py-1']]")
    private WebElement sigenUpButton ;

    public WebElement siginUpButtonv2(){
        return(this.driver.findElement(By.xpath("//a[@class=//a[@class='HeaderMenu-link flex-shrink-0 d-inline-block no-underline border color-border-default rounded px-2 py-1']]")));

    }
    @FindBy(xpath =("//button[@class='btn-mktg width-full width-sm-auto btn-signup-mktg']"))
    private WebElement siginUpButtonv3 ;


    public LoginPage clikSeginIn() {
        siginInButton.click();
        return new LoginPage(driver);

    }
    public SeginUpPage clikSiginUp() {
        sigenUpButton.click();
        return new SeginUpPage(driver);

    }
    public SeginUpPage clikSiginUpButtonv3() {
        siginUpButtonv3.click();
        return new SeginUpPage(driver);

    }




}


