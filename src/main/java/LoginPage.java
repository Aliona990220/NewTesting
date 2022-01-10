import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    private By userName = By.xpath("//input[@id='login_field']");
    private By passWord = By.xpath("//input[@id='login_field']");
    private By siginInButtonToo = By.xpath("//a[@class='btn btn-primary btn-block js-sign-in-button']");
    private By heading = By.xpath("//div[@class='auth-form-header p-0']/h1");
    private By error = By.xpath("//div[@class='flash flash-full flash-error']");
    private By createAnAccountLink = By.xpath("//a[text()='Create an account']");

    public LoginPage typUserName(String username){
        WebElement usname = driver.findElement(userName);
        usname.click();
        usname.clear();
        usname.sendKeys(username);
        return this;
    }
    public LoginPage typpassWord(String password){
        WebElement pasW = driver.findElement(passWord);
        pasW.click();
        pasW.clear();
        pasW.sendKeys(password);
        return this;
    }
    public SeginUpPage createAnAccount(){
        driver.findElement(createAnAccountLink).click();
        return new SeginUpPage(driver);

    }
    public LoginPage incorectLogin(String username, String password) {
        this.typUserName(username);
        this.typpassWord(password);
        driver.findElement(siginInButtonToo).click();
        return new LoginPage(driver);
    }
    public String getHeadingText(){
      return driver.findElement(heading).getText();

    }
    public String getErrorText(){

        return driver.findElement(error).getText();
    }
}
