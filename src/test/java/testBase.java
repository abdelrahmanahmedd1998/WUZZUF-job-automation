import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;


public class testBase {
    ExtentTest reportTest;
    public ExtentReports reports;
    WebDriver driver;


    @BeforeSuite
    public void preSuite() {
        reports = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter(new File("Reports/report.html"));
        spark.config().setTheme(Theme.DARK);
        reports.attachReporter(spark);

    }

    @Parameters("browser")
    @BeforeMethod
    public void beforeTest(String browser) {
        if (Objects.equals(browser, "chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (Objects.equals(browser, "fireFox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(" https://wuzzuf.net/jobs/egypt");
    }

    @AfterMethod
    public void afterTest() throws InterruptedException {
        Thread.sleep(4000);
      //  driver.quit();
    }

    @AfterSuite
    public void afterSuite() throws IOException {
        reports.flush();
        Desktop.getDesktop().open(new File("Reports/report.html"));
    }

    //public static void reporter(String status, String stepDetail) throws InterruptedException {
    //   Thread.sleep(1000);
    //    String base64Screenshot;
    //    try {
//            base64Screenshot = HelperClass.capture(driver);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        if (status.equalsIgnoreCase("pass")) {
//            reportTest.pass(stepDetail, MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
//        } else if (status.equalsIgnoreCase("fail")) {
//            reportTest.fail(stepDetail, MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
//        } else if (status.equalsIgnoreCase("info")) {
//            reportTest.info(stepDetail);
//        } else if (status.equalsIgnoreCase("Warning")) {
//            reportTest.warning(stepDetail);
//
//        }
//    }
}
