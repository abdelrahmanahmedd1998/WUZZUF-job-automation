import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.time.Duration;
import java.util.ArrayList;

public class wuzzufTests extends testBase {
    Faker fake =new Faker();
    public void start(){
        startingPage start=new startingPage(driver);
        reportTest =reports.createTest("Starting test");
        start.getStartedButton.click();
        reportTest.info("Moving To Register Page");
    }
    public void Registration(String fn , String ln ) throws InterruptedException {
        //variables
        String em =fake.internet().emailAddress();
        //actions
        reportTest =reports.createTest("Registration process");
        regesterPage reg=new regesterPage(driver);
        reg.firstName.sendKeys(fn);
        reportTest.info("Enter first name");
        reg.lastname.sendKeys(ln);
        reportTest.info("Enter last name");
        reg.email.sendKeys(em);
        reportTest.info("faker email is created");
        reg.password.sendKeys("abdoabdo1998");
        reportTest.info("enter password");
        reg.jobTitle.sendKeys("tester,QA,QC");
        reportTest.info("job Titles");
        Thread.sleep(2000);
        reg.createAccountButton.click();
        Thread.sleep(3000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://wuzzuf.net/create-profile?ref=signup-successful&sut=reg&login=1","Wrong page");
        reportTest.pass("Opened Profile correctly");

    }
    public void CvPage() {
        reportTest =reports.createTest("Cv Uploading");
        cvPage cv=new cvPage(driver);
        cv.cvUpload.sendKeys("C:\\Users\\CC\\IdeaProjects\\Wuzzuf\\src\\main\\resources\\MY CV.pdf");
        reportTest.info("Cv uploaded succesfuly");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBePresentInElement(cv.uploadedFileName, "MY CV.pdf"));
        cv.continueButton.click();
        reportTest.pass("Moved to career page");

    }

    public void careerInterests() throws InterruptedException {
        jobInterests job=new jobInterests(driver);
        reportTest=reports.createTest("jobInterestPage");
        Assert.assertEquals(job.titleCareer.getText().toUpperCase(),"Career Interests".toUpperCase(),"failed");
        reportTest.info("correct title career");
        job.experienceSelect.click();
        job.selectYear.sendKeys("2 year");
        reportTest.info("experience year selected");
        job.selectYear.sendKeys(Keys.ENTER);
        job.currentCarrierLevel.click();
        //System.out.println(job.yearNum.getText());
        //job.jobType.click();
        for (int i = 0; i < job.jobTypes.size() ; i++) {
            job.jobTypes.get(i).click();
        }
        reportTest.info("selected job types");

        for (int i = 0; i < job.workPlaces.size(); i++) {
            job.workPlaces.get(i).click();

        }
        job.minSalary.sendKeys("14000");
        job.jobCategory.sendKeys("IT/Software Development ");
        job.jobCategory.sendKeys(Keys.ENTER);
        job.doneJob.click();
        reportTest.pass("done with profileQualifications");
    }
    public void explore() throws InterruptedException {
    explorePage explo=new explorePage(driver);
    reportTest=reports.createTest("exploringJobs");
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(explo.congratsAssert.getText().toUpperCase().contains("Congr".toUpperCase()));
        reportTest.pass("congratulation message");
        System.out.println(explo.congratsAssert.getText());
        explo.xSignButton.click();
        explo.searchField.sendKeys("Software Engineer");
        reportTest.info("searched for a job");
        explo.searchButtonConfirm.click();
        Thread.sleep(3000);
        soft.assertTrue(explo.assertSoftwareEngineer.getText().toUpperCase().contains("software engineer".toUpperCase()));
        reportTest.pass("made sure the correct job is searched");
        soft.assertTrue(explo.assertNum.isDisplayed());
        reportTest.info("num of job is displayed");
        explo.dataPostedFilter.click();
        explo.pastWeek.click();
        Thread.sleep(3000);
        System.out.println(explo.jobsNum.getText());
        explo.firstJob.click();
        soft.assertAll();
    }
    public void jobApply() throws InterruptedException {
        JobApplicantPage job=new JobApplicantPage(driver);
        ArrayList <String> tabs= new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabs.size()-1));
        reportTest=reports.createTest("jobApplicant Page");
        //Thread.sleep(3000);
        //job.pressOtherButton.click();

       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.elementToBeClickable(job.gotItButton)).click();
        //job.gotItButton.click();
        job.applyJobButton.click();
        reportTest.info("clicked on the job");
        Thread.sleep(3000);
        job.saveLaterButton.click();
        reportTest.info("saved the job");
        Assert.assertTrue(job.saveActiveLink.isDisplayed(), "Job is not saved/active!");
        reportTest.pass("job is saved");
    }

    public void profileDelete(){
        ProfilePage pro=new ProfilePage(driver);
        reportTest =reports.createTest("deleting account");
        SoftAssert soft=new SoftAssert();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(pro.profileIcon)).click();
        pro.accountSetting.click();
        reportTest.info("opened profile setting");
        pro.deleteAccount.click();
        pro.checkBoxDelete.click();
        pro.submitDelete.click();
        soft.assertTrue(pro.assertDeletedAccount.isDisplayed());
        reportTest.pass("account has been deleted successfully message");
        soft.assertAll();
    }

    @Test
    public void star() throws InterruptedException {
       // Helperclass helper = new Helperclass(driver);
        start();
        Registration("abdelrahman","ahmed" );
        CvPage();
        careerInterests();
        explore();
        jobApply();
        profileDelete();
//        String path = helper.takeScreenShots("Test_Passed");
//        reportTest.pass("Test completed successfully")
//                .addScreenCaptureFromPath(path);
    }
}
