import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeginUpPage {
    private WebDriver driver;

    public SeginUpPage(WebDriver driver) {
        this.driver = driver;
    }
    private By email = By.xpath("//label[@class='text-mono signup-text-prompt']");
    private By emptyInputField = By.xpath("//div[@class='d-flex flex-items-center width-full']");
    private By emailErr = By.xpath("//p[@id='email-err']");
    private By alreadyHave = By.xpath("//span[@class='mr-2 text-gray-mktg hide-sm']");
    private By seginIn = By.xpath("//a[@class='color-fg-on-emphasis']");
public String getEmailText(){
    return driver.findElement(email).getText();
}
    public SeginUpPage typEmptyInputField(String email) {
        WebElement em = driver.findElement(emptyInputField);
        em.click();
        em.sendKeys("email.com");
        return this;
    }
    public String incorecteemail(String email) {
        this.typEmptyInputField(email);
        return driver.findElement(emailErr).getText();
    }
    public String getAlreadyHaveText() {
        return driver.findElement(alreadyHave).getText();
    }
    public LoginPage clikSeginIn() {
        driver.findElement(seginIn).click();
        return new LoginPage(driver);

    }

}

