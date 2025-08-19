import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class regesterPage {
    public regesterPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@name=\"firstname\"]")
    public WebElement firstName;

    @FindBy(xpath = "//*[@name=\"lastname\"]")
    public WebElement lastname;

    @FindBy(xpath = "//*[@name=\"email\"]")
    public WebElement email;

    @FindBy(xpath = "//*[@name=\"password\"]")
    public WebElement password;

    @FindBy(xpath = "//*[@class=\"css-1itq9hi ek82ord0\"]")
    public WebElement jobTitle;

    @FindBy(xpath = "//*[@class=\"css-5p8x8f ezfki8j0\"]")
    public WebElement createAccountButton;


}
