import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeginUpPageTest {
    private WebDriver driver;
    private SeginUpPage seginUpPage;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
        seginUpPage = new SeginUpPage(driver);
    }
    @Test
    public void typEmptyInputFieldTest() {
        SeginUpPage newseginUpPagee = seginUpPage.typEmptyInputField("email.com");
        String error = newseginUpPagee.getEmailText();
        Assert.assertEquals("Email is invalid or already taken", error);

    }
    @Test
    public void getAlreadyHaveTextTest(){
        String newseginUpPage = seginUpPage.getAlreadyHaveText();
        String error = newseginUpPage.getAlreadyHaveText();
        Assert.assertTrue("It`s o",newseginUpPage =="Already have an account?");

    }
    @Test
    public void clikSeginInTest(){
        LoginPage loginPage = seginUpPage.clikSeginIn();
        String heading = loginPage.getHeadingText();
        Assert.assertEquals("Sign in to GitHub", heading);


    }




    @After
    public void tearDown(){
        driver.quit();
    }


}
