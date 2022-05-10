package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class FamilyImmigrationStatusPage extends Utility {
    public FamilyImmigrationStatusPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='response-0']")
    WebElement yesButton;

    @FindBy(xpath = "//input[@id='response-0']")
    WebElement noButton;

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    public void clickNextStepButton() {
        Reporter.log("Clicking on nextStepButton "+ nextStepButton.toString()+ "<br>");
        clickOnElement(nextStepButton);
    }

    public void selectImmigrationStatus(String status) {
        switch (status) {
            case "Yes":
                Reporter.log("Selecting option "+status+" from dropdown "+yesButton.toString() + "<br>");
                clickOnElement(yesButton);
                break;
            case "No":
                Reporter.log("Selecting option "+status+" from dropdown "+noButton.toString() + "<br>");
                clickOnElement(noButton);
                break;
        }
    }
}
