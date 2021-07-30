package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RapportPage {
    @FindBy(how = How.XPATH, using = "//*[@id=\"progressbar\"]/img[2]")
    public WebElement btnValidation;


    @FindBy(how = How.ID, using = "previewValidate")
    public WebElement btnPreview;

    @FindBy(how = How.LINK_TEXT, using="Se déconnecter")
    public WebElement btnLogout;

    public RapportPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void Validate() {
        btnValidation.click();
    }

    public void Preview(){
        btnPreview.click();
    }

    public void Logout(){
        btnLogout.click();
    }

}
