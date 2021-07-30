package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ModelsPage {
    
	//@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/div/div[1]/table/tbody/tr[6]/td[5]/table/tbody/tr/td[3]/input")
    public WebElement btnScalingQuestion;

    
    @FindBy(how = How.ID, using ="TEST model base")
    public static WebElement Tab_Test;
    
    public ModelsPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    public void goToScalingQuestion(WebDriver driver) throws InterruptedException{
    	
    	if(Tab_Test != null)
    	{
    		System.out.println("--------------Modele----------------");
    		
    		btnScalingQuestion=Tab_Test.findElement(By.xpath("td[8]/table/tbody/tr/td[3]/input"));
    		
    		//btnScalingQuestion.getCssValue("class");
    		System.out.println(btnScalingQuestion.getAttribute("class"));
    		
    		System.out.println("--------------Modele1----------------");
    		
    		if(!btnScalingQuestion.getAttribute("class").contains("btn-secondary"))
    		{
    			btnScalingQuestion.click();
    		}
    		else
    		{
    			WebElement btn_NouvelleVersion=Tab_Test.findElement(By.xpath("td[8]/table/tbody/tr/td[6]/input"));
    			btn_NouvelleVersion.click();
    			
    			WebElement confirmbutton=driver.findElements(By.className("jconfirm-buttons")).get(0);
    			confirmbutton.click();
    			
    			Thread.sleep(4000);
    			
    			
    			btnScalingQuestion=Tab_Test.findElement(By.xpath("td[8]/table/tbody/tr/td[3]/input"));
    			btnScalingQuestion.click();
    			
    		}
    		
        }
       // btnScalingQuestion.click();
    }


}
