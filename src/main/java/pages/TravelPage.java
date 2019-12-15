package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

import java.util.Set;

public class TravelPage extends BasePage {

    @FindBy(xpath = "//img[contains(@src, 'banner-zashita-traveler')]")//parent::a")
    WebElement sendButton;

    public TravelPage()
    {
        PageFactory.initElements(BaseSteps.getDriver(), this);

    }

    public void goToBlanc(){
        //driver.get(sendButton.getAttribute("href"));
        Set<String> oldWindowsSet = BaseSteps.getDriver().getWindowHandles();
        sendButton.click();
        Set<String> newWindowsSet = BaseSteps.getDriver().getWindowHandles();
        newWindowsSet.removeAll(oldWindowsSet);
        String newWindowHandle = newWindowsSet.iterator().next();
        BaseSteps.getDriver().switchTo().window(newWindowHandle);
    }

}
