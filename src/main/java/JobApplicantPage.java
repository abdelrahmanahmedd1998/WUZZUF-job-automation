import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobApplicantPage {
    public JobApplicantPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    //@FindBy(xpath = "//*[@class=\"css-w6lahm\"]")
    @FindBy(xpath = "//*[@class=\"css-1cmu9ds\"]/button")
    public WebElement gotItButton;

    @FindBy(xpath = "(//*[@class=\"css-158icaa\"])[1]")
    public WebElement pressOtherButton;

    @FindBy(xpath = "//*[@class=\"css-dq4cbr\"]/button")
    public WebElement applyJobButton;

    @FindBy(xpath = "//*[@class=\"css-3c7xez\"]/button[1]")
    public WebElement saveLaterButton;

    @FindBy(xpath = "//*[@href=\"/saved\"]")
    public WebElement saveActiveLink;
 
}
