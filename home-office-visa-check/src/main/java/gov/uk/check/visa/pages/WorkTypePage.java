package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class WorkTypePage extends Utility {
    public WorkTypePage() {
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//input[@id='response-0']")
    WebElement healthAndCare;

    @FindBy(xpath = "//input[@id='response-1']")
    WebElement digitalTechnology;

    @FindBy(xpath = "//input[@id='response-2']")
    WebElement academicOrResearcher;

    @FindBy(xpath = "//input[@id='response-3']")
    WebElement workInArts;

    @FindBy(xpath = "//input[@id='response-4']")
    WebElement professionalSportsPerson;

    @FindBy(xpath = "//input[@id='response-5']")
    WebElement religiousWorker;

    @FindBy(xpath = "//input[@id='response-6']")
    WebElement iWantToStartABusiness;

    @FindBy(xpath = "//input[@id='response-7']")
    WebElement iWantToDoAnotherTypeOfJob;

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    public void clickNextStepButton() {
        Reporter.log("Clicking on nextStepButton "+ nextStepButton.toString()+ "<br>");
        clickOnElement(nextStepButton);
    }


    public void selectJobType(String job) {
        switch (job) {
            case "Health and care professional":
                Reporter.log("Selecting job "+job+" from dropdown "+healthAndCare.toString() + "<br>");
                clickOnElement(healthAndCare);
                break;
            case "Digital technology professional":
                Reporter.log("Selecting job "+job+" from dropdown "+digitalTechnology.toString() + "<br>");
                clickOnElement(digitalTechnology);
                break;
            case "Academic or researcher":
                Reporter.log("Selecting job "+job+" from dropdown "+academicOrResearcher.toString() + "<br>");
                clickOnElement(academicOrResearcher);
                break;
            case "Work in arts or culture":
                Reporter.log("Selecting job "+job+" from dropdown "+workInArts.toString() + "<br>");
                clickOnElement(workInArts);
                break;
            case "Professional sportsperson":
                Reporter.log("Selecting job "+job+" from dropdown "+professionalSportsPerson.toString() + "<br>");
                clickOnElement(professionalSportsPerson);
                break;
            case "Religious worker":
                Reporter.log("Selecting job "+job+" from dropdown "+religiousWorker.toString() + "<br>");
                clickOnElement(religiousWorker);
                break;
            case "I want to start a business":
                Reporter.log("Selecting job "+job+" from dropdown "+iWantToStartABusiness.toString() + "<br>");
                clickOnElement(iWantToStartABusiness);
                break;
            case "I want to do another type of job - show me other work visas":
                Reporter.log("Selecting job "+job+" from dropdown "+iWantToDoAnotherTypeOfJob.toString() + "<br>");
                clickOnElement(iWantToDoAnotherTypeOfJob);
                break;
        }
    }
}
