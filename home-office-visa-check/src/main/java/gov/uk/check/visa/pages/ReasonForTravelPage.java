package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ReasonForTravelPage extends Utility {
    public ReasonForTravelPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='response-0']")
    WebElement tourism;

    @FindBy(xpath = "//input[@id='response-1']")
    WebElement workAcademic;

    @FindBy(xpath = "//input[@id='response-4']")
    WebElement joinPartner;

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    public void clickNextStepButton() {
        Reporter.log("Clicking on nextStepButton "+ nextStepButton.toString()+ "<br>");
        clickOnElement(nextStepButton);
    }

    public void selectReasonForVisit(String reason) {
        if (reason == "Tourism") {
            Reporter.log("Selecting option "+reason+" from dropdown "+tourism.toString() + "<br>");
            clickOnElement(tourism);
        } else if (reason == "Work, academic visit or business") {
            Reporter.log("Selecting option "+reason+" from dropdown "+workAcademic.toString() + "<br>");
            clickOnElement(workAcademic);
        } else if (reason == "Join partner or family for a long stay") {
            Reporter.log("Selecting option "+reason+" from dropdown "+joinPartner.toString() + "<br>");
            clickOnElement(joinPartner);
        }
    }


}

