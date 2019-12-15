package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

public class TravelIsurancePage extends BasePage {

    @FindBy(xpath = "//*[contains(text(), 'Выбор полиса')]")
    public WebElement titlePolice;

    @FindBy(xpath = "//div[contains(text(), 'Минимальная')]//parent::div[contains(@ng-class, '1')]")
    public WebElement insuranceType;

    @FindBy(xpath = "//span[contains(text(), 'Оформить')]")
    public WebElement issueButton;

    public TravelIsurancePage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
        Wait<WebDriver> wait = new WebDriverWait(BaseSteps.getDriver(), 5, 1000);
        wait.until(ExpectedConditions.visibilityOf(titlePolice));

    }


}
