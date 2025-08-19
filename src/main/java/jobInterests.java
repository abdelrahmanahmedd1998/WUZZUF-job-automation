import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class jobInterests {
    public jobInterests(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@class=\"css-vlxyh0\"]")
    public WebElement titleCareer;

    @FindBy(xpath = "(//*[@class=\" css-1hwfws3\"])[1]")
    public WebElement experienceSelect;

     @FindBy(xpath = "(//*[@class=\" css-1nxrfj4-singleValue\"])[1]")
     public WebElement yearNum;

    @FindBy(xpath = "(//*[@tabindex=\"0\"])[3]")
    public WebElement currentCarrierLevel;

    @FindBy(xpath = "//*[@id=\"react-select-2-input\"]")
    public WebElement selectYear;

    //@FindBy(xpath = "(//*[@name=\"workTypes\"])[1]")
    //public WebElement jobType;

    @FindBy(xpath = "//*[@name=\"workTypes\"]")
    public List<WebElement> jobTypes;

    @FindBy(xpath = "//*[@name=\"workplaces\"]")
    public List<WebElement> workPlaces;

    @FindBy(xpath = "//*[@name=\"minimumSalary\"]")
    public WebElement minSalary;

    @FindBy(xpath = "(//*[@autocapitalize=\"none\"])[2]")
    public WebElement jobCategory;

    @FindBy(xpath = "(//*[@type=\"button\"])[12]")
    public WebElement doneJob;
}
