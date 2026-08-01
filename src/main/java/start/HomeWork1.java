package start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomeWork1
{
    WebDriver driver = new ChromeDriver();

    @Test
    public void phoneBookTests()
    {
        driver.manage().window().maximize();

        driver.get("https://telranedu.web.app/home");
        pause(2000);

        WebElement linkAbout =
                driver.findElement(By.cssSelector("a[href='/about']"));
        linkAbout.click();
        pause(2000);

        WebElement linkHome =
                driver.findElement(By.cssSelector("*[href='/home']"));
        linkHome.click();
        pause(2000);

        WebElement linkLogin =
                driver.findElement(By.linkText("LOGIN"));
        linkLogin.click();
        pause(2000);

        WebElement activeLink =
                driver.findElement(By.cssSelector(".active"));
        System.out.println(activeLink.getText());

        WebElement fieldEmail =
                driver.findElement(By.cssSelector("*[placeholder='Email']"));
        System.out.println(fieldEmail.getTagName());

        WebElement fieldPassword =
                driver.findElement(By.cssSelector("input[placeholder='Password']"));
        System.out.println(fieldPassword.getAttribute("name"));

        WebElement buttonLogin =
                driver.findElement(By.cssSelector("button[type='submit']:nth-child(4)"));
        System.out.println(buttonLogin.getText());

        WebElement buttonRegistration =
                driver.findElement(By.cssSelector("button[type='submit']:last-child"));
        System.out.println(buttonRegistration.getText());

        WebElement containerHeader =
                driver.findElement(By.cssSelector("div[class*='nav']"));
        System.out.println(containerHeader.getAttribute("class"));

        WebElement containerLogin =
                driver.findElement(By.cssSelector("div[class^='login']"));
        System.out.println(containerLogin.getAttribute("class"));

        driver.quit();
    }

    @Test
    public void ilCarroTest()
    {
        driver.manage().window().maximize();

        driver.get("https://ilcarro.web.app/search");
        pause(2000);

        WebElement imageFirst =
                driver.findElement(By.cssSelector("img"));
        System.out.println(imageFirst.getAttribute("src"));

        WebElement fieldCity =
                driver.findElement(By.cssSelector("input#city"));
        System.out.println(fieldCity.getAttribute("class"));

        WebElement fieldDates =
                driver.findElement(By.cssSelector("#dates"));
        System.out.println(fieldDates.getAttribute("class"));

        WebElement buttonSubmit =
                driver.findElement(By.cssSelector("button[type='submit']"));
        System.out.println(buttonSubmit.getText());

        WebElement linkLetCarWork =
                driver.findElement(By.cssSelector("a[href^='/let']"));
        linkLetCarWork.click();
        pause(2000);

        WebElement linkTermsOfUse =
                driver.findElement(By.cssSelector(".navigation-link[href$='-use']"));
        linkTermsOfUse.click();
        pause(2000);

        WebElement linkSignUp =
                driver.findElement(By.cssSelector("a.navigation-link[href*='registration']"));
        linkSignUp.click();
        pause(2000);

        WebElement linkLogIn =
                driver.findElement(By.cssSelector("a.navigation-link:nth-child(6)"));
        linkLogIn.click();
        pause(2000);

        WebElement linkSearch1 =
                driver.findElement(By.cssSelector("a[href*='results']:first-child"));
        System.out.println(linkSearch1.getText());

        WebElement linkSearch2 =
                driver.findElement(By.cssSelector("a[href*='results']:last-child"));
        System.out.println(linkSearch2.getText());

        driver.quit();
    }

    public void pause(int time)
    {
        try
        {
            Thread.sleep(time);
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }
}
