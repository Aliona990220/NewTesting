package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class Profile {
    private WebDriver driver;

    public Profile(WebDriver driver) {
        this.driver = driver;
    }

    //Constructor, as every page needs a Webdriver to find elements
    public void Profile(WebDriver driver){
        this.driver=driver;
    }

    @FindBys({
            @FindBy(id="books-wrapper"),
            @FindBy(id="userName-value")

    })
    WebElement user;

    @CacheLookup
    @FindBy(id="submit")
    WebElement logoutBtn;
    @FindBy(id="name")
    WebElement name;


    public void Profele(WebDriver driver) {
        this.driver = driver;
    }


    public String getErrorText(){

        return driver.findElement((By) name).getText();



}
}


