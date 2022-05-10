package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class StartPage extends Utility {
    public StartPage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@class='gem-c-button govuk-button govuk-button--start']")
    WebElement startNowButton;

    public void clickStartNow(){
        Reporter.log("Clicking on startNowButton "+ startNowButton.toString()+ "<br>");
        clickOnElement(startNowButton);
    }

}
