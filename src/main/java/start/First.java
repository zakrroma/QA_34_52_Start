package start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class First
{
    WebDriver driver = new ChromeDriver();

    @Test
    public void firstTest()
    {
        driver.manage().window().maximize();
        driver.manage().timeouts().
                pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().
                implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://telranedu.web.app/home");
        pause(2000);

        //driver.navigate().to("https://telranedu.web.app/home");
        //driver.get("https://telranedu.web.app/about");
        WebElement buttonAbout =
                driver.findElement(By.cssSelector("a[href='/about']"));
        buttonAbout.click();
        pause(2000);

        driver.navigate().back();
        pause(2000);

        //driver.navigate().forward();
        WebElement buttonLogin =
                driver.findElement(By.cssSelector("a[href='/login']"));
        buttonLogin.click();
        pause(2000);

        WebElement buttonHome =
                driver.findElement(By.cssSelector("*[href='/home']"));
        buttonHome.click();
        pause(2000);
        
        driver.navigate().refresh();
        WebElement divRoot =
                driver.findElement(By.cssSelector("div[id='root']"));
        // #root
        // [id='root']
        // *[id='root']
        System.out.println(divRoot.getTagName());
        System.out.println(divRoot.getAttribute("class"));

        WebElement divRoot1 =
                driver.findElement(By.id("root"));
        System.out.println(divRoot1.getTagName());

        WebElement divRoot2 =
                driver.findElement(By.className("container"));
        System.out.println(divRoot2.getAttribute("id"));

        pause(2000);
        //driver.close();
        //pause(2000);
        driver.quit();
    }

    @Test
    public void ilCarroTest()
    {
        driver.manage().window().maximize();

        driver.get("https://ilcarro.web.app/search");
        pause(2000);

        WebElement linkSearch =
                driver.findElement(By.cssSelector(".navigation-link"));
        // a[class='navigation-link']
        // a.navigation-link
        // *[class='navigation-link']
        // [class='navigation-link']
        // a[id='0']
        // #0
        // a#0.navigation-link[href='/search']
        linkSearch.click();
        pause(2000);

        WebElement linkTerms =
                driver.findElement(By.cssSelector("a.navigation-link[href='/terms-of-use']"));
        // [href='/terms-of-use']
        // a[href*='terms'] включает в себя
        // a[href^='/terms'] начинается с ...
        // a[href$='-use'] заканчивается ...
        linkTerms.click();
        pause(2000);

        WebElement linkSign =
                driver.findElement(By.cssSelector("div.header a.navigation-link:nth-child(5)"));
        linkSign.click();
        pause(2000);

        WebElement linkLogin =
                driver.findElement(By.cssSelector("div.header a.navigation-link:last-child"));
        linkLogin.click();
        pause(2000);

        WebElement linkLogo =
                driver.findElement(By.cssSelector("div.header a:first-child"));
        linkLogo.click();
        pause(2000);

        WebElement linkLet =
                driver.findElement(By.linkText("Let the car work"));
        linkLet.click();
        pause(2000);

        driver.navigate().back();
        pause(2000);

        WebElement linkLet1 =
                driver.findElement(By.partialLinkText("work"));
        linkLet1.click();
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