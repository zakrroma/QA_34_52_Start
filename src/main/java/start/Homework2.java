package start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Homework2
{
    WebDriver driver = new ChromeDriver();

    @Test
    public void ilCarroTest()
    {
        driver.manage().window().maximize();

        driver.get("https://ilcarro.web.app/search");
        pause(2000);


        WebElement linkLetTheCarWork =
                driver.findElement(By
                        .xpath("//*[@href='/let-car-work']"));
        linkLetTheCarWork.click();
        pause(2000);

        WebElement linkSearch =
                driver.findElement(By
                        .xpath("//a[@href='/search']"));
        linkSearch.click();
        pause(2000);

        WebElement linkTermsOfUse =
                driver.findElement(By
                        .xpath("//a[text()=' Terms of use ']"));
        linkTermsOfUse.click();
        pause(2000);

        WebElement linkSignUp =
                driver.findElement(By
                        .xpath("//div[@class='header']/a[5]"));
        linkSignUp.click();
        pause(2000);

        WebElement linkLogIn =
                driver.findElement(By
                        .xpath("//div[@class='header']/a[last()]"));
        linkLogIn.click();
        pause(2000);

        WebElement logo =
                driver.findElement(By
                        .xpath("//div//img/.."));
        logo.click();
        pause(2000);

        WebElement linkFacebook =
                driver.findElement(By
                        .xpath("//a[contains(@href, 'facebook')]"));
        System.out.println(linkFacebook.getAttribute("href"));

        WebElement linkTelegram =
                driver.findElement(By
                        .xpath("//a[contains(@href, 'facebook')]/../a[2]"));
        System.out.println(linkTelegram.getAttribute("href"));

        WebElement linkVK =
                driver.findElement(By
                        .xpath("//div[starts-with(@class, 'footer')]/div[1]/a[3]"));
        System.out.println(linkVK.getAttribute("href"));

        WebElement linkInstagram =
                driver.findElement(By
                        .xpath("//div[starts-with(@class, 'social')]/a[4]"));
        System.out.println(linkInstagram.getAttribute("href"));

        WebElement tel =
                driver.findElement(By
                        .xpath("//*[@class='telephone']"));
        System.out.println(tel.getText());

        WebElement address =
                driver.findElement(By.xpath("//*[@class='telephone']/../a[2]"));
        System.out.println(address.getText());

        WebElement fieldCity =
                driver.findElement(By
                        .xpath("//form//input[@id='city']"));
        fieldCity.sendKeys("Ashkelon");

        WebElement fieldDates =
                driver.findElement(By.xpath("//form//input[@id='dates']"));
        fieldDates.sendKeys("1.09.2026-3.09.2026");
        pause(3000);

        WebElement buttonYalla =
                driver.findElement(By.xpath("//button[@type='submit']"));
        buttonYalla.click();
        pause(2000);

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
