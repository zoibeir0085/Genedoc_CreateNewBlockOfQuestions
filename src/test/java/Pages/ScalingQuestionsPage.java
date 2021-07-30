package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ScalingQuestionsPage {
    @FindBy(how = How.XPATH, using = "//*[@id=\"55\"]/div/div/div/img[2]")
    public WebElement btnAddBlockQuestion;

    @FindBy(how = How.XPATH, using = "//*[@id=\"N1\"]/div/div/input")
    public WebElement blocName;

    @FindBy(how = How.XPATH, using = "//*[@id=\"N1\"]/td[1]/textarea")
    public WebElement ques1Name;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[12]/div/table/tbody/tr[3]/td[1]/textarea")
    public WebElement ques2Name;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[12]/div/table/tbody/tr[1]/td[2]/img")
    public WebElement ques1Type;

    @FindBy(how = How.XPATH, using = "/html/body/div[4]/li[6]/img")
    public WebElement ques1SelectText;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[12]/div/table/tbody/tr[3]/td[2]/img")
    public WebElement ques2Type;

    @FindBy(how = How.XPATH, using = "/html/body/div[4]/li[6]/img")
    public WebElement ques2SelectText;


    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[12]/div/table/tbody/tr[1]/td[6]/div")
    public WebElement btnAddQues2;



    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[12]/div/table/tbody/tr[3]/th/div[1]/div/button")
    public WebElement btnListDependencies;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[12]/div/table/tbody/tr[3]/th/div[1]/div/div/div/ul/li[172]/a")
    public WebElement btnChoseDependencies;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[12]/div/table/tbody/tr[3]/th/div[2]/div/div/div/div")
    public WebElement btnActivateQuest1Dep;

    @FindBy(how = How.LINK_TEXT, using="Nouveau dossier")
    public WebElement btnNewFolder;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[12]/div/table/tbody/tr[3]/td[6]/div/img")
    public WebElement btnAddQues3;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[12]/div/table/tbody/tr[5]/td[1]/textarea")
    public WebElement ques3Name;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[12]/div/table/tbody/tr[5]/th/div[1]/div/button")
    public WebElement btnListDependencies3;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[12]/div/table/tbody/tr[5]/th/div[1]/div/div/div/ul/li[173]/a")
    public WebElement btnChoseDependencies3;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[12]/div/table/tbody/tr[5]/th/div[2]/div/div/div/div")
    public WebElement btnActivateQues2Dep;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[12]/div/table/tbody/tr[5]/td[2]/img")
    public WebElement ques3Type;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[12]/div/table/tbody/tr[5]/td[6]/div/img")
    public WebElement btnAddQues4;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[12]/div/table/tbody/tr[7]/td[1]/textarea")
    public WebElement ques4Name;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[12]/div/table/tbody/tr[7]/th/div[1]/div/button")
    public WebElement btnListDependencies4;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[12]/div/table/tbody/tr[7]/th/div[1]/div/div/div/ul/li[171]/a")
    public WebElement btnChoseDependencies4;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[12]/div/table/tbody/tr[7]/th/div[2]/div/div/div/div")
    public WebElement btnActivateQues4Dep;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[12]/div/table/tbody/tr[7]/td[2]/img")
    public WebElement ques4Type;

    @FindBy(how = How.XPATH, using = "/html/body/div[4]/li[1]/img")
    public WebElement ques4SelectDate;


    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[12]/div/table/tbody/tr[7]/td[6]/div/img")
    public WebElement btnAddQues5;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[12]/div/table/tbody/tr[9]/td[1]/textarea")
    public WebElement ques5Name;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[12]/div/table/tbody/tr[9]/th/div[1]/div/button")
    public WebElement btnListDependencies5;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[12]/div/table/tbody/tr[9]/th/div[1]/div/div/div/ul/li[171]/a")
    public WebElement btnChoseDependencies5;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[12]/div/table/tbody/tr[9]/th/div[2]/div/div/div/div")
    public WebElement btnActivateQues5Dep;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[12]/div/table/tbody/tr[9]/td[2]/img")
    public WebElement ques5Type;

    @FindBy(how = How.XPATH, using = "/html/body/div[4]/li[2]/img")
    public WebElement ques5SelectList;


    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[12]/div/table/tbody/tr[9]/td[6]/div/img")
    public WebElement btnAddQues6;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[12]/div/table/tbody/tr[11]/td[1]/textarea")
    public WebElement ques6Name;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[12]/div/table/tbody/tr[11]/th/div[1]/div/button")
    public WebElement btnListDependencies6;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[12]/div/table/tbody/tr[11]/th/div[1]/div/div/div/ul/li[171]/a")
    public WebElement btnChoseDependencies6;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[12]/div/table/tbody/tr[11]/th/div[2]/div/div/div/div")
    public WebElement btnActivateQues6Dep;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[12]/div/table/tbody/tr[11]/td[2]/img")
    public WebElement ques6Type;

    @FindBy(how = How.XPATH, using = "/html/body/div[4]/li[3]/img")
    public WebElement ques6SelectNumber;


    //@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[5]/div/div/div/img[3]")
    public WebElement btnDeleteBloc;

    @FindBy(how = How.NAME, using = "btn_SearchFirstEmptyDate")
    public WebElement btnSaveBloc;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div[12]/div/table/tbody/tr[7]/td[7]/div/img")
    public WebElement btnDeleteAddedQuestion;




    public ScalingQuestionsPage(WebDriver driver) {
        PageFactory.initElements(driver,this);

    }

    public void addBlocQuestion(){

        btnAddBlockQuestion.click();
    }

    public void RenameBlock(String blocname){

        blocName.clear();
        blocName.sendKeys(blocname);
    }

    public void addQuestion1(String name){
        ques1Name.sendKeys(name);
        //ques1Type.click();
        //ques1SelectText.click();
        //ques1SelectText.click();

    }

    public void addQuestion2(String name){

        btnAddQues2.click();
        btnAddQues2.click();

        btnListDependencies.click();
        btnChoseDependencies.click();
        btnActivateQuest1Dep.click();
        ques2Name.sendKeys(name);
        //ques2Type.click();
        //ques2SelectText.click();
        //ques2SelectText.click();

    }


    public void addQuestion3(String name) throws InterruptedException {
        btnAddQues3.click();
        btnListDependencies3.click();
        btnChoseDependencies3.click();
        btnActivateQues2Dep.click();
        ques3Name.sendKeys(name);
        ques3Type.click();
        //Thread.sleep(1000);
        ques2SelectText.click();
        ques2SelectText.click();



    }

    public void deleteAddedQuestion() throws InterruptedException{
        try {
            btnDeleteAddedQuestion.click();
            Thread.sleep(5000);

        } catch (Exception e) {
            System.out.println("aucune question à supprimer");
        } ;

    }
    public void selectQuestion3Type(){

    }

    public void addQuestion4(String name ) throws InterruptedException {
        //btnAddQues4.click();
        //btnListDependencies4.click();
        //btnChoseDependencies4.click();
        //btnActivateQues4Dep.click();
        ques1Name.sendKeys(name);
        ques1Type.click();
        //Thread.sleep(1000);
        ques4SelectDate.click();
        ques4SelectDate.click();


    }
    public void selectQuestion4Type() {
        ques4SelectDate.click();
        ques4SelectDate.click();

    }

    public void addQuestion5(WebDriver driver , String name ) throws InterruptedException {
        //btnAddQues5.click();
        btnAddQues2.click();
        //btnListDependencies5.click();
        //btnChoseDependencies5.click();
        //btnActivateQues5Dep.click();
        //ques5Name.sendKeys(name);
        ques2Name.sendKeys(name);
        ques2Type.click();
        //Thread.sleep(1000);
        ques5SelectList.click();
        ques5SelectList.click();

        Select SelectedDoc=new Select(driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[12]/div/table/tbody/tr[3]/td[2]/select"))) ;
        SelectedDoc.selectByVisibleText("FormesJuridique");
        Thread.sleep(4000);



    }
    public void selectQuestion5Type(WebDriver driver) {


    }


    public void addQuestion6(String name ) throws InterruptedException {
        btnAddQues3.click();
        //btnListDependencies6.click();
        //btnChoseDependencies6.click();
        //btnActivateQues6Dep.click();
        ques3Name.sendKeys(name);
        ques3Type.click();
        //Thread.sleep(1000);
        ques6SelectNumber.click();
        ques6SelectNumber.click();

    }

    public void selectQuestion6Type() {

    }




    public void saveChanges() throws InterruptedException {
        //Thread.sleep(1000);

        btnSaveBloc.click();
        
        Thread.sleep(6000);
    }

    public void deleteBlockQuestions(WebDriver driver){
    	
    	List<WebElement> btnremove=driver.findElements(By.className("remove-section"));
    	
    	btnDeleteBloc = btnremove.get(btnremove.size()-1);
        btnDeleteBloc.click();
    }
    public void createNewFolder(WebDriver driver){
    	driver.navigate().to("https://aezan.genedoc.fr/NewDoc/NewDocument");
        //btnNewFolder.click();


    }

}
