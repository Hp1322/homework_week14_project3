package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SelectNationalityPage extends Utility {
    public SelectNationalityPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalityDropDownList;

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    public void selectNationality(String nationality){
        Reporter.log("Selecting nationality "+nationality+" from dropdown "+nationalityDropDownList.toString() + "<br>");
        selectByVisibleTextFromDropDown(nationalityDropDownList,nationality);
    }
    public void clickNextStepButton(){
        Reporter.log("Clicking on nextStepButton "+ nextStepButton.toString()+ "<br>");
        clickOnElement(nextStepButton);
    }
}
