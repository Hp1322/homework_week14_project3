package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class VisaConfirmationTest extends TestBase {
    StartPage startPage;
    SelectNationalityPage selectNationalityPage;
    ReasonForTravelPage reasonForTravelPage;
    ResultPage resultPage;
    WorkTypePage workTypePage;
    DurationOfStayPage durationOfStayPage;
    FamilyImmigrationStatusPage familyImmigrationStatusPage;


    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        startPage = new StartPage();
        selectNationalityPage = new SelectNationalityPage();
        reasonForTravelPage = new ReasonForTravelPage();
        resultPage = new ResultPage();
        workTypePage = new WorkTypePage();
        durationOfStayPage = new DurationOfStayPage();
        familyImmigrationStatusPage = new FamilyImmigrationStatusPage();

    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void anAustralianCominToUKForTourism() {
        startPage.clickStartNow();
        selectNationalityPage.selectNationality("Australia");
        selectNationalityPage.clickNextStepButton();
        reasonForTravelPage.selectReasonForVisit("Tourism");
        reasonForTravelPage.clickNextStepButton();
        resultPage.confirmResultMessage("You will not need a visa to come to the UK");

    }

    @Test(groups = {"smoke", "regression"})
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths() {
        startPage.clickStartNow();
        selectNationalityPage.selectNationality("Chile");
        selectNationalityPage.clickNextStepButton();
        reasonForTravelPage.selectReasonForVisit("Work, academic visit or business");
        reasonForTravelPage.clickNextStepButton();
        durationOfStayPage.selectLengthOfStay("longer than 6 months");
        durationOfStayPage.clickNextStepButton();
        workTypePage.selectJobType("Health and care professional");
        workTypePage.clickNextStepButton();
        resultPage.confirmResultMessage("You need a visa to work in health and care");

    }

    @Test(groups = {"regression"})
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card() {
        startPage.clickStartNow();
        selectNationalityPage.selectNationality("Colombia");
        selectNationalityPage.clickNextStepButton();
        reasonForTravelPage.selectReasonForVisit("Join partner or family for a long stay");
        reasonForTravelPage.clickNextStepButton();
        familyImmigrationStatusPage.selectImmigrationStatus("Yes");
        familyImmigrationStatusPage.clickNextStepButton();
        resultPage.confirmResultMessage("You’ll need a visa to join your family or partner in the UK");


    }
}
