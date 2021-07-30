package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.PageFactory;

public class FolderCreationPage {
    @FindBy(how = How.ID_OR_NAME, using = "btn_UpdateVariables")
    public WebElement btnValidation2;

    @FindBy(how = How.ID, using = "validbutton")
    public WebElement btnValidation;

    @FindBy(how = How.XPATH, using = "/html/body/div[4]/form/div/table/tbody/tr[36]/td[2]/div/div/div")
    public WebElement btnAddQuestion2;

    @FindBy(how = How.XPATH, using = "/html/body/div[4]/form/div/table/tbody/tr[38]/td[2]/div/div/div")
    public WebElement btnAddQuestion3;

    @FindBy(how = How.XPATH, using = "/html/body/div[4]/form/div/table/tbody/tr[40]/td[2]/div/input")
    public WebElement fieldQuestion3;

    @FindBy(how = How.XPATH, using = "/html/body/div[4]/form/div/table/tbody/tr[42]/td[2]/div/input")
    public WebElement fieldQuestion4;

    @FindBy(how = How.XPATH, using = "/html/body/div[4]/form/div/table/tbody/tr[44]/td[2]/div/input")
    public WebElement fieldQuestion6;

    @FindBy(how = How.XPATH, using = "/html/body/div[5]/div[3]/ul[3]/li[12]")
    public WebElement selectedDate;




    public FolderCreationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void SelectDocument(WebDriver driver,String document){
        Select SelectedDoc=new Select(driver.findElement(By.id("SelectDocument"))) ;
        SelectedDoc.selectByVisibleText(document);
    }

    public void SelectChart(WebDriver driver,String chart){
        Select SelectedChart=new Select(driver.findElement(By.id("SelectChart"))) ;
        SelectedChart.selectByVisibleText(chart);
    }

    public void SelectRedactors(WebDriver driver,String redactor){
        Select SelectedRedactors=new Select(driver.findElement(By.id("SelectRedactors"))) ;
        SelectedRedactors.selectByVisibleText(redactor);
        SelectedRedactors.selectByVisibleText("Corbet Sophie");

    }

    public void SelectApprobator(WebDriver driver,String approbator){
        Select SelectedApprobator=new Select(driver.findElement(By.id("SelectApprobator"))) ;
        SelectedApprobator.selectByVisibleText(approbator);
    }


    public void Validate() throws InterruptedException {
        btnValidation.click();
        Thread.sleep(5000);
    }
    public void addQuestion() throws InterruptedException 
    {
        //btnAddQuestion2.click();
        //Thread.sleep(8000);
        //btnAddQuestion3.click();
        //Thread.sleep(8000);
        //fieldQuestion3.sendKeys("TEXT !");
        Thread.sleep(2000);
        //fieldQuestion4.sendKeys("07/05/2020");
        //Thread.sleep(2000);
        //fieldQuestion6.sendKeys("8888888");


    }

    public void addQuestions2() throws InterruptedException{
        /*fieldQuestion4.sendKeys("07/05/2020");
        Thread.sleep(2000);
        selectedDate.click();
        Thread.sleep(2000);
        fieldQuestion6.sendKeys("8888888");
        Thread.sleep(6000);*/


    }

    public void Validate2() throws InterruptedException {
        btnValidation2.click();
        Thread.sleep(10000);
        
    }

}