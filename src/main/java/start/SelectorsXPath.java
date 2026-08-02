package start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class SelectorsXPath
{
    WebDriver driver = new ChromeDriver();

    @Test
    public void phoneBookTests()
    {
        driver.manage().window().maximize();

        driver.get("https://telranedu.web.app/home");
        pause(2000);

        WebElement linkAbout =
                driver.findElement(By.xpath("//a[@href='/about']"));
        linkAbout.click();
        pause(2000);
        System.out.println(linkAbout.isEnabled());
        System.out.println(linkAbout.isDisplayed());

        WebElement linkLogin =
                driver.findElement(By.xpath("//*[text()='LOGIN']"));
        linkLogin.click();
        pause(2000);

        WebElement fieldEmail = driver.findElement(By
                .xpath("//div/form/input[contains(@name, 'em')]"));
        fieldEmail.sendKeys("qwert@qwe.rty");

        WebElement fieldPassword = driver.findElement(By
                .xpath("//div/form/input[last()]"));
        fieldPassword.sendKeys("Qwerty123!");
        pause(3000);

        List<WebElement> buttons =
                driver.findElements(By
                        .xpath("//button"));
        System.out.println(buttons);
        System.out.println(buttons.getFirst().getText());
        buttons.get(1).click();
        pause(3000);

        driver.quit();
    }

    @Test
    public void ilCarroTest()
    {
        driver.manage().window().maximize();

        driver.get("https://ilcarro.web.app/registration?url=%2Fterms-of-use");
        pause(2000);
/*
        WebElement inputFirstName =
                driver.findElement(By.className("ng-touched"));
        //inputFirstName.sendKeys("qwerty");
        //pause(2000);

        WebElement element1_1 =
                driver.findElement(By
                        .cssSelector("[formcontrolname='firstName']"));
        WebElement element1_2 =
                driver.findElement(By
                        .xpath("//*[@formcontrolname='firstName']"));
        WebElement element1_3 =
                driver.findElement(By
                        .cssSelector("[formcontrolname^='first']"));
        WebElement element1_4 =
                driver.findElement(By
                        .xpath("//*[starts-with(@formcontrolname,'first')]"));
        WebElement element1_5 =
                driver.findElement(By
                        .cssSelector("//input[@formcontrolname='firstName']"));
*/
        WebElement element2 =
                driver.findElement(By.xpath("//input[@id='name']/../../../..//h2"));
        System.out.println(element2.getText());

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
