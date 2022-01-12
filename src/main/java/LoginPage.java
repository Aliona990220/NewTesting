import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    private By loginField = By.xpath("//input[@id='login_field']");
    private By passWordField = By.xpath("//input[@id='login_field']");
    private By siginInButton = By.xpath("//input[@class='btn btn-primary btn-block js-sign-in-button']");
    private By heading = By.xpath("//div[@class='auth-form-header p-0']/h1");
    private By error = By.xpath("//div[@class='container-lg px-2']");
    private By createAnAccountLink = By.xpath("//a[text()='Create an account']");
    private By forgotPassword = By.xpath("//a[text()='Forgot password?']");

    public LoginPage typUserName(String username){
        WebElement usname = driver.findElement(loginField);
        usname.click();
        usname.clear();
        usname.sendKeys(username);
        return this;
    }
    public LoginPage typpassWord(String password){
        WebElement pasW = driver.findElement(passWordField);
        pasW.click();
        pasW.clear();
        pasW.sendKeys(password);
        return this;
    }
    public SeginUpPage createAnAccount() {
        driver.findElement(createAnAccountLink).click();
        return new SeginUpPage(driver);

    }
    public LoginPage LoginPage (String username, String password) {
        this.typUserName(username);
        this.typpassWord(password);
        driver.findElement(siginInButton).click();
        return new LoginPage(driver);
    }
    public LoginPage loginWithInvalidCreads(String username, String password) {
        this.typUserName(username);
        this.typpassWord(password);
        driver.findElement(siginInButton).click();
        return new LoginPage(driver);
    }
    public LoginPage loginWithEmtyCredetion(String username, String password) {
        this.typUserName(username);
        this.typpassWord(password);
        driver.findElement(siginInButton).click();
        return new LoginPage(driver);
    }
    public String getHeadingText(){
      return driver.findElement(heading).getText();

    }
    public String getErrorText(){
        return driver.findElement(error).getText();
    }

}

