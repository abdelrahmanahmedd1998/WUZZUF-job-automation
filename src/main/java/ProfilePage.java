import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
    public ProfilePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@class=\"css-13cd7sa\"]")
    public WebElement profileIcon;

    @FindBy(xpath = "(//*[@class=\"css-s5xdrg\"])[4]/span")
    public WebElement accountSetting;

    @FindBy(xpath = "(//*[@type=\"button\"])[2]")
    public WebElement deleteAccount;

    @FindBy(xpath = "(//*[@class=\"css-hx5gx4\"])[4]")
    public WebElement checkBoxDelete;

    @FindBy(xpath = "(//*[@type=\"submit\"])[5]")
    public WebElement submitDelete;
    //*[@class="css-18nekxb"]
    @FindBy(xpath = " //*[@class=\"css-18nekxb\"]")
    public WebElement assertDeletedAccount;
    //[//*class="css-1htfnu4"]
}
