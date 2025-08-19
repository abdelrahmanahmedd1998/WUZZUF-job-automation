import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class explorePage {
    public explorePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[@class=\"css-1m5agua\"]/p[1]")
    public WebElement congratsAssert;

    @FindBy(xpath = "//*[@class=\"css-c4iikd\"]")
    public WebElement xSignButton;

    @FindBy(xpath = "//*[@placeholder=\"Search jobs, companies..\"]")
    public WebElement searchField;

    @FindBy(xpath = "//*[@class=\"css-ooh0h7\"]/h1")
    public WebElement assertSoftwareEngineer;

    @FindBy(xpath = "//*[@class=\"css-54c0be\"]/span[2]")
    public WebElement assertNum;

    @FindBy(xpath = "//*[@type=\"submit\"]")
    public WebElement searchButtonConfirm;

    @FindBy(xpath = "(//*[@class=\"css-1oy4qip efou2fk0\"])[8]")
    public WebElement dataPostedFilter;

    @FindBy(xpath = "(//*[@class=\"css-bhwo3q e1kea1u61\"])[3]")
    public WebElement pastWeek;

    @FindBy(xpath = "//*[@class=\"css-54c0be\"]/span[2]")
    public WebElement jobsNum;

    @FindBy(xpath = "(//*[@class=\"css-o171kl\"])[1]")
    public WebElement firstJob;
}
