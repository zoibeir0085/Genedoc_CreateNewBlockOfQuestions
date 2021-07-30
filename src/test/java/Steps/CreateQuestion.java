package Steps;


import Pages.* ;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.print.attribute.standard.DateTimeAtCompleted;


public class CreateQuestion {
    WebDriver driver;

    /*@Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() {

        System.out.println("Navigate login page");
        try {
            //for linux
            System.setProperty("webdriver.chrome.driver", "chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.navigate().to("https://aezan.genedoc.fr/Login");
        } catch (Exception e) {
            System.out.println("ChromeDriver for Windows");
        }

        try {
            //for windows
            System.setProperty("webdriver.chrome.driver","chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.navigate().to("https://aezan.genedoc.fr/Login");
        } catch (Exception e) {
            System.out.println("ChromeDriver for Linux");
        }
    }*/
    
    public WebDriver getDriver() {
        return driver;
    }


    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() {
        System.out.println("Navigate login page");
        //for windows
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        //for linux
        //System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();

        driver.navigate().to("https://aezan.genedoc.fr/Login");

    }


    @And("I click login button")
    public void iClickLoginButton() {
        // System.out.println("Click login button");

        LoginPage page = new LoginPage(driver);

        page.ClickLogin();
    }

    @Then("I should see the welcome page")
    public void iShouldSeeTheUserformPage() {
        System.out.println("I should see userform");
        //Assert.assertEquals("its not displayed",driver.findElement(By.className("container body-content")).isDisplayed(),true );


        //driver.findElement(By.name("generate")).click() ;


    }

    @And("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEnterUsernameAndPassword(String username, String password) throws InterruptedException {
        LoginPage page = new LoginPage(driver);
        page.Login(username, password);
        Thread.sleep(2000);
    }

    @Then("I close the browser")
    public void iCloseTheBrowser() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
        driver = null;
    }

    @Then("I navigate to the model page")
    public void iNavigateToTheModelPage() throws InterruptedException {
        driver.navigate().to("https://aezan.genedoc.fr/AdminDoc/Models");
       //page.goToAdministration();
        //page.goToModel();
        Thread.sleep(2000);


    }

    @Then("I enter \"([^\"]*)\"  , \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"")
    public void iEnterAnd(String Document, String CharteGraphique, String Redacteurs, String Approbateur) throws InterruptedException {
        FolderCreationPage page = new FolderCreationPage(driver);

        //select DocumentType
        page.SelectDocument(driver, Document);

        //select CharteGraphique
        page.SelectChart(driver, CharteGraphique);

        //select Redactors
        page.SelectRedactors(driver, Redacteurs);

        //select Approbator
        page.SelectApprobator(driver, Approbateur);

        //Validation
        page.Validate();
        Thread.sleep(3000);
        page.addQuestion();
        page.Validate2();

        Thread.sleep(3000);

    }

    @Then("I validate")
    public void iValidate() throws InterruptedException {
        RapportPage page = new RapportPage(driver);
        page.Validate();
        Thread.sleep(3000);

    }


    @Then("I logout")
    public void iLogout() throws InterruptedException {
        RapportPage page = new RapportPage(driver);
        page.Logout();
        Thread.sleep(2000);

    }

    @Then("I click to scaling question")
    public void iClickToScalingQuestion() throws InterruptedException {
        ModelsPage page = new ModelsPage(driver);
        page.goToScalingQuestion(driver);
        Thread.sleep(2000);

    }

    @Then("I add a new bloc of questions and rename it to {string}")
    public void iAddANewBlocOfQuestionsAndRenameIt(String blocname) throws InterruptedException {
        Thread.sleep(3000);
        //driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[4]/div/div/div/img[2]")).click();
        
        List<WebElement> LstBlock=driver.findElements(By.className("blockTitle"));
         for (WebElement bl : LstBlock) 
         {
			if(bl.findElement(By.className("LabelBlock")).getText().equals(blocname))
			{
				bl.findElement(By.className("remove-section")).click();
			}
		}
        
        List<WebElement> btnadd=driver.findElements(By.className("add-section"));
    	btnadd.get(btnadd.size()-1).click();
        
        Thread.sleep(3000);
        
        //{"method":"css selector","selector":"#N1 > div.col-md-12 > div.blockTitle > input.LabelBlock"}
        List<WebElement> LstLabelBlock=driver.findElements(By.className("LabelBlock"));
        
        LstLabelBlock.get(LstLabelBlock.size()-1).click();
        LstLabelBlock.get(LstLabelBlock.size()-1).clear();
        Thread.sleep(1000);
        LstLabelBlock.get(LstLabelBlock.size()-1).sendKeys(blocname);



    }

    @Then("I add first question :{string}")
    public void iAddFirstQuestion(String firstQuestion) throws InterruptedException 
    {
        ScalingQuestionsPage page = new ScalingQuestionsPage(driver);
        
        WebElement _firstQuestion= driver.findElement(By.cssSelector("#N1 > td.addborder > textarea.LabelQuestion"));
        
        _firstQuestion.clear();
        Thread.sleep(1000);
        
        _firstQuestion.sendKeys(firstQuestion);
        Thread.sleep(1000);

       
    }

    @Then("I add second question :{string} with {string} dependency")
    public void iAddSecondQuestionWithFirstQuestionDependency(String secondQuestion, String firstQuestion) throws InterruptedException 
    {
        ScalingQuestionsPage page = new ScalingQuestionsPage(driver);
        Thread.sleep(1000);
        
        WebElement addQuestion=driver.findElement(By.cssSelector("#N1 > td.addborder > div > img.icon.add"));
        
        addQuestion.click();
        
        WebElement dependance=driver.findElement(By.cssSelector("#N2 > th.depend.addborder.toreload > div > div.dropdown.bootstrap-select.CondiDepSel.dependances"));
        
        WebElement dropdowndependances=dependance.findElement(By.cssSelector("button.btn.dropdown-toggle.btn-default"));
        dropdowndependances.click();
        
        Thread.sleep(1000);
        
        List<WebElement> Listdependances=dependance.findElements(By.className("optgroup-1"));
        
       // driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[5]/div/table/tbody/tr[3]/th/div[1]/div/div/div/ul/li[25]/a")).click();
        Listdependances.get(Listdependances.size() -1 ).click();
        
        driver.findElement(By.xpath("//tr[@id='N2']/th/div[2]/div/div/div/div/div")).click();
        
        WebElement LabelQuestion2=driver.findElement(By.cssSelector("#N2 > td.addborder > textarea.LabelQuestion"));
        LabelQuestion2.click();
        LabelQuestion2.clear();
        LabelQuestion2.sendKeys("My Question2");
        
        Thread.sleep(2000);




    }

    @Then("I save changes")
    public void iSaveChanges() throws InterruptedException {


        ScalingQuestionsPage page = new ScalingQuestionsPage(driver);
        page.deleteAddedQuestion();
        Thread.sleep(3000);
        page.saveChanges();
        Thread.sleep(3000);

    }

    @Then("I delete block of questions created")
    public void iDeleteBlockOfQuestionsCreated() throws InterruptedException {
        ScalingQuestionsPage page = new ScalingQuestionsPage(driver);
        page.deleteBlockQuestions(driver);
        Thread.sleep(3000);

    }


    @Then("I click New Folder Button")
    public void iClickNewFolderButton() throws InterruptedException {
        ScalingQuestionsPage page = new ScalingQuestionsPage(driver);
        page.createNewFolder(driver);
        Thread.sleep(3000);
    }

    @Then("I add third question: {string} with {string} dependency")
    public void iAddThirdQuestionWithDependency(String ques3, String ques2) throws InterruptedException {
        ScalingQuestionsPage page = new ScalingQuestionsPage(driver);
        Thread.sleep(3000);

        WebElement addQuestion=driver.findElement(By.cssSelector("#N2 > td.addborder > div > img.icon.add"));
        
        addQuestion.click();
        
        WebElement dependance=driver.findElement(By.cssSelector("#N3 > th.depend.addborder.toreload > div > div.dropdown.bootstrap-select.CondiDepSel.dependances"));
        
        WebElement dropdowndependances=dependance.findElement(By.cssSelector("button.btn.dropdown-toggle.btn-default"));
        dropdowndependances.click();
        
        Thread.sleep(1000);
        
        List<WebElement> Listdependances=dependance.findElements(By.className("optgroup-1"));
        
        Listdependances.get(Listdependances.size() -1 ).click();
        
        /*
        driver.findElement(By.cssSelector("#N2 > td.addborder > div > img.icon.add")).click();
        driver.findElement(By.cssSelector("#N3 > th.depend.addborder.toreload > div > div[name=\"dependances_3_2\"] > button.btn.dropdown-toggle.btn-default > div.filter-option > div.filter-option-inner > div.filter-option-inner-inner")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[5]/div/table/tbody/tr[5]/th/div[1]/div/div/div/ul/li[26]/a")).click();
        */
        driver.findElement(By.xpath("//tr[@id='N3']/th/div[2]/div/div/div/div/div")).click();
        
        WebElement LabelQuestion3=driver.findElement(By.cssSelector("#N3 > td.addborder > textarea.LabelQuestion"));
        LabelQuestion3.click();
        LabelQuestion3.clear();
        LabelQuestion3.sendKeys("My Question3");
        
        driver.findElement(By.cssSelector("#N3 > td.TypeQuestion.addborder > img.type-tooltip")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='powerTip']/li[6]/img")).click();

        Thread.sleep(3000);





    }

    @Then("I add fourth question:{string} with date type")
    public void iAddFourthQuestionWithDateType(String ques4) throws InterruptedException {
        ScalingQuestionsPage page = new ScalingQuestionsPage(driver);
        Thread.sleep(3000);
        
        WebElement addQuestion=driver.findElement(By.cssSelector("#N3 > td.addborder > div > img.icon.add"));
        
        addQuestion.click();
        
        WebElement dependance=driver.findElement(By.cssSelector("#N4 > th.depend.addborder.toreload > div > div.dropdown.bootstrap-select.CondiDepSel.dependances"));
        
        WebElement dropdowndependances=dependance.findElement(By.cssSelector("button.btn.dropdown-toggle.btn-default"));
        dropdowndependances.click();
        
        Thread.sleep(1000);
        
        List<WebElement> Listdependances=dependance.findElements(By.className("optgroup-1"));
        
        Listdependances.get(Listdependances.size() -1 ).click();

        /*driver.findElement(By.cssSelector("#N3 > td.addborder > div > img.icon.add")).click();
        driver.findElement(By.cssSelector("#N4 > th.depend.addborder.toreload > div > div[name=\"dependances_3_3\"] > button.btn.dropdown-toggle.btn-default > div.filter-option > div.filter-option-inner > div.filter-option-inner-inner")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[5]/div/table/tbody/tr[7]/th/div[1]/div/div/div/ul/li[26]/a")).click();
        */

        driver.findElement(By.xpath("//tr[@id='N4']")).findElements(By.className("operand")).get(0).sendKeys("test");
        driver.findElement(By.cssSelector("#N4 > td.addborder")).click();
        
        WebElement LabelQuestion4=driver.findElement(By.cssSelector("#N4 > td.addborder > textarea.LabelQuestion"));
        LabelQuestion4.click();
        LabelQuestion4.clear();
        LabelQuestion4.sendKeys("My Question4");
        
        /*driver.findElement(By.cssSelector("#N4 > td.addborder > textarea.LabelQuestion")).click();
        driver.findElement(By.cssSelector("#N4 > td.addborder > textarea.LabelQuestion")).clear();
        driver.findElement(By.cssSelector("#N4 > td.addborder > textarea.LabelQuestion")).sendKeys("My Question4");*/
        
        driver.findElement(By.cssSelector("#N4 > td.TypeQuestion.addborder > img.type-tooltip")).click();
        driver.findElement(By.cssSelector("#N4 > td.TypeQuestion.addborder > img.type-tooltip")).click();
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("img.icontip")).click();
       // driver.findElement(By.cssSelector("img.icontip")).click();

        Thread.sleep(3000);




    }

    @Then("I add fifth question:{string} with list type")
    public void iAddFifthQuestionWithListType(String ques5) throws InterruptedException {
        Thread.sleep(3000);
        
        WebElement addQuestion=driver.findElement(By.cssSelector("#N4 > td.addborder > div > img.icon.add"));
        
        addQuestion.click();
        
        WebElement dependance=driver.findElement(By.cssSelector("#N5 > th.depend.addborder.toreload > div > div.dropdown.bootstrap-select.CondiDepSel.dependances"));
        
        WebElement dropdowndependances=dependance.findElement(By.cssSelector("button.btn.dropdown-toggle.btn-default"));
        dropdowndependances.click();
        
        Thread.sleep(1000);
        
        List<WebElement> Listdependances=dependance.findElements(By.className("optgroup-1"));
        
        Listdependances.get(Listdependances.size() -1 ).click();

        /*driver.findElement(By.cssSelector("#N4 > td.addborder > div > img.icon.add")).click();
        driver.findElement(By.cssSelector("#N5 > th.depend.addborder.toreload > div > div[name=\"dependances_3_4\"] > button.btn.dropdown-toggle.btn-default")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[5]/div/table/tbody/tr[9]/th/div[1]/div/div/div/ul/li[26]/a")).click();
        */
        driver.findElement(By.xpath("//tr[@id='N5']")).findElements(By.className("operand")).get(0).sendKeys("01/01/2021");
        
        WebElement LabelQuestion5=driver.findElement(By.cssSelector("#N5 > td.addborder > textarea.LabelQuestion"));
        LabelQuestion5.click();
        LabelQuestion5.clear();
        LabelQuestion5.sendKeys("My Question5");
        
        driver.findElement(By.cssSelector("#N5 > td.TypeQuestion.addborder > img.type-tooltip")).click();
        driver.findElement(By.cssSelector("#N5 > td.TypeQuestion.addborder > img.type-tooltip")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//div[@id='powerTip']/li[2]/img")).click();
        
        new Select(driver.findElement(By.cssSelector("#N5 > td.TypeQuestion.addborder > select.DefaultValue"))).selectByVisibleText("TEST");
        driver.findElement(By.cssSelector("#N5 > td.TypeQuestion.addborder > select.DefaultValue")).click();
        Thread.sleep(3000);





    }

    @Then("I add sixth question:{string} with number type")
    public void iAddSixthQuestionWithNumberType(String ques6) throws InterruptedException {


        Thread.sleep(3000);
        WebElement addQuestion=driver.findElement(By.cssSelector("#N5 > td.addborder > div > img.icon.add"));
        
        addQuestion.click();
        
        WebElement dependance=driver.findElement(By.cssSelector("#N6 > th.depend.addborder.toreload > div > div.dropdown.bootstrap-select.CondiDepSel.dependances"));
        
        WebElement dropdowndependances=dependance.findElement(By.cssSelector("button.btn.dropdown-toggle.btn-default"));
        dropdowndependances.click();
        
        Thread.sleep(1000);
        
        List<WebElement> Listdependances=dependance.findElements(By.className("optgroup-1"));
        
        Listdependances.get(Listdependances.size() -1 ).click();
        
        /*driver.findElement(By.cssSelector("#N5 > td.addborder > div > img.icon.add")).click();
        driver.findElement(By.cssSelector("#N6 > th.depend.addborder.toreload > div > div[name=\"dependances_3_5\"] > button.btn.dropdown-toggle.btn-default > div.filter-option > div.filter-option-inner > div.filter-option-inner-inner")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[5]/div/table/tbody/tr[11]/th/div[1]/div/div/div/ul/li[26]/a")).click();
        */
        
        //driver.findElement(By.xpath("//tr[@id='N6']/th/div[2]/div/div/div/div")).click();
        
        WebElement LabelQuestion6=driver.findElement(By.cssSelector("#N6 > td.addborder > textarea.LabelQuestion"));
        LabelQuestion6.click();
        LabelQuestion6.clear();
        LabelQuestion6.sendKeys("My Question6");
        
        driver.findElement(By.cssSelector("#N6 > td.TypeQuestion.addborder > img.type-tooltip")).click();
        driver.findElement(By.cssSelector("#N6 > td.TypeQuestion.addborder > img.type-tooltip")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//div[@id='powerTip']/li[3]/img")).click();


        Thread.sleep(3000);

    }

    @Then("I enter {string}  ,  {string}, {string} and {string} and add questions four, five and six")
    public void iEnterAndAndAddQuestionsAnd(String Document, String CharteGraphique, String Redacteurs, String Approbateur) throws InterruptedException {
        FolderCreationPage page = new FolderCreationPage(driver);

        //select DocumentType
        page.SelectDocument(driver, Document);

        //select CharteGraphique
        page.SelectChart(driver, CharteGraphique);

        //select Redactors
        page.SelectRedactors(driver, Redacteurs);

        //select Approbator
        page.SelectApprobator(driver, Approbateur);

        //Validation
        page.Validate();
        Thread.sleep(3000);
        page.addQuestions2();
        page.Validate2();

        Thread.sleep(3000);

    }

}
