import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cvPage {
    public cvPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id=\"cvFile\"]")
    public WebElement cvUpload;

    @FindBy(css = "[class=\"css-5pi1vp\"]")
    public WebElement uploadedFileName;

    @FindBy(css = "[class=\"css-12lx810 ezfki8j0\"]")
    public WebElement continueButton;

}
