package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }


    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath = "(//*[@id='mat-select-value-7'])[1]")
    private WebElement selectschooldept;

    @FindBy(xpath = "(//span[text()=' New Auckland School '])[1]")
    private WebElement newauch;
//    //span[text()=' New Auckland School ']
//    //(//div[@role='listbox']//span)[3]

    @FindBy(xpath = "(//*[@class='mat-button-wrapper'])[10]")
    private WebElement addbutton;

    @FindBy(xpath = "(//*[@id=\"ms-text-field-0\"])[2]")
    private WebElement fillupname;

    @FindBy(xpath = "(//*[@id=\"ms-text-field-1\"])[2]")
    private WebElement entercode;

    //////////////////

    @FindBy(xpath = "//span[text()='Section']")
    private WebElement sectionclick;
    @FindBy(xpath = "//span[text()='Save']")
    private WebElement clicksave;



    @FindBy(xpath = "(//*[@class='ng-fa-icon'])[9]")
    private WebElement edit1;


    @FindBy(xpath = "(//input[starts-with(@id,'ms-text-field')])[1]")
    private WebElement rename1;
    @FindBy(xpath = "(//input[starts-with(@id,'ms-text-field')])[2]")
    private WebElement recode1;

    @FindBy(xpath = "//span[text()='Section']")
    private WebElement reclicktosection;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement resave1;

    @FindBy(xpath = "(//*[@class='ng-fa-icon'])[10]")
    private WebElement deletebutton;
//    (//ms-delete-button)[1]
//            (//ms-delete-button//button)[1]

    @FindBy(xpath = "//span[text()=' Delete ']")
    private WebElement deleteclick;


    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    //**********************************************//

    @FindBy(xpath = "(//*[@class='ng-fa-icon'])[4]")
    private WebElement addsubject;

    @FindBy(xpath = "(//*[@id='ms-text-field-2'])[2]")
    private WebElement typeonnameintab;

    @FindBy(xpath = "(//*[@id='ms-text-field-3'])[2]")
    private WebElement typeoncodeintab;


    @FindBy(xpath = "//span[text()='Save']")
    private WebElement clicksave1;

    @FindBy(xpath = "(//*[@class='ng-fa-icon'])[6]")
    private WebElement editsub1;

    @FindBy(xpath = "(//*[@id='ms-text-field-4'])[2]")
    private WebElement renameinsub;

    @FindBy(xpath = "(//*[@id='ms-text-field-5'])[2]")
    private WebElement recodeinsub;

    @FindBy(xpath = "//span[text()='Save']")
            private WebElement resaveinsub;

    @FindBy(xpath = "(//*[@class='ng-fa-icon'])[7]")
            private WebElement deleteinsub;

    @FindBy(xpath = "//span[text()=' Delete ']")
            private WebElement deleteclickinsub;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessagestory2;

    //**************************************//

    @FindBy(xpath = "(//*[@class='ng-fa-icon'])[4]")
            private WebElement addinposition;
    @FindBy(xpath = "(//*[@id='ms-text-field-1'])[2]")
            private WebElement fillupnameinnewpoition;

    @FindBy(xpath = "//span[text()='Save']")
            private WebElement clickinstosaveinnewposition;

    @FindBy(xpath = "(//*[@class='ng-fa-icon'])[6]")
            private WebElement clickeditinposition;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement renameinpossitioncata;

    @FindBy(xpath = "//span[text()='Save']")
            private WebElement clickinsaveinposition;


//    @FindBy(xpath="(//span[contains(text(),'Dashboard')])[2]")
//    private WebElement dashboard;
//
//    @FindBy(xpath="//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
//    private WebElement addButton;
//
//    @FindBy(xpath="//ms-text-field[@formcontrolname='name']//input")
//    private WebElement nameInput;
//
//    @FindBy(xpath="//ms-text-field[@formcontrolname='code']//input")
//    private WebElement codeInput;
//
//    @FindBy(xpath="//ms-save-button//button")
//    private WebElement saveButton;
//

//
//    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
//    private WebElement shortName;
//
//    @FindBy(xpath = "//div[contains(text(),'already exists')]")
//    private WebElement alreadyExist;
//
//    @FindBy(xpath = "//button[@aria-label='Close dialog']")
//    private WebElement closeDialog;
//
//    @FindBy(xpath = "(//div[contains(@class,'mat-form-field-infix ng-tns-c74')]//input)[1]")
//    private WebElement searchInput;
//
//    @FindBy(xpath = "//ms-search-button//button")
//    private WebElement searchButton;
//
//    @FindBy(xpath = "//ms-delete-button//button")
//    private WebElement deleteButton;
//
//    @FindBy(xpath = "//span[contains(text(),'Delete')]")
//    private WebElement deleteDialogBtn;
//
//    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']//input")
//    private WebElement integrationCode;
//
//    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")
//    private WebElement priorityCode;
//
//    @FindBy(xpath = "(//button[@class='consent-give'])[1]")
//    private WebElement acceptCookies;

    WebElement myElement;

    public void findAndSend(String strElement, String value) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {
            case "username":
                myElement = username;
                break;
            case "password":
                myElement = password;
                break;
            case "fillupname":
                myElement = fillupname;
                break;

            case "entercode":
                myElement = entercode;
                break;
            case "rename1":
                myElement = rename1;
                break;
            case "recode1":
                myElement = recode1;
                break;

            //*******************************************//
            case "typeoncodeintab":
                myElement = typeoncodeintab;
                break;
            case "typeonnameintab":
                myElement = typeonnameintab;
                break;
            case "renameinsub":
                myElement = renameinsub;
                break;
            case "recodeinsub":
                myElement = recodeinsub;
                break;

                //****************************************//
            case "fillupnameinnewpoition":myElement=fillupnameinnewpoition;break;
            case "renameinpossitioncata":myElement=renameinpossitioncata;break;



//            case "nameInput" : myElement =nameInput; break;
//            case "codeInput" : myElement =codeInput; break;
//            case "shortName" : myElement =shortName; b(//*[@id='ms-text-field-1'])[2]reak;
//            case "searchInput" : myElement =searchInput; break;
//            case "integrationCode" : myElement =integrationCode; break;
//            case "priorityCode" : myElement =priorityCode; break;
        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {
            case "loginButton":
                myElement = loginButton;
                break;

            case "selectschooldept":myElement=selectschooldept;break;

            case "newauch":myElement=newauch;break;

            case "addbutton":myElement=addbutton;break;

            case "sectionclick":
                myElement = sectionclick;
                break;

            case "clicksave":
                myElement = clicksave;
                break;

            case "edit1":
                myElement = edit1;
                break;
            case "reclicktosection":
                myElement = reclicktosection;
                break;

            case "resave1":
                myElement = resave1;
                break;
            case "deletebutton":
                myElement = deletebutton;
                break;
            case "deleteclick":
                myElement = deleteclick;
                break;

            //*********************************//


            case "addsubject":
                myElement = addsubject;
                break;
            case "clicksave1":
                myElement = clicksave1;
                break;

            case "editsub1":
                myElement = editsub1;
                break;
            case "resaveinsub":myElement=resaveinsub;break;
            case "deleteinsub":myElement=deleteinsub;break;
            case "deleteclickinsub":myElement=deleteclickinsub;break;


            ///***************************************************//

            case "addinposition":myElement=addinposition;break;
            case "clickinstosaveinnewposition":myElement=clickinstosaveinnewposition;break;
            case "clickeditinposition":myElement=clickeditinposition;break;



//            case "addButton" : myElement =addButton; break;
//            case "saveButton" : myElement =saveButton; break;
//            case "closeDialog" : myElement =closeDialog; break;
//            case "searchButton" : myElement =searchButton; break;
//            case "deleteButton" : myElement =deleteButton; break;
//            case "deleteDialogBtn" : myElement =deleteDialogBtn; break;
//            case "acceptCookies" : myElement =acceptCookies; break;

        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {
//            case "dashboard" : myElement =dashboard; break;
//            case "schooldepartmant":myElement=schooldepartmant;break;
            case "successMessage":
                myElement = successMessage;
                break;
            case "successMessagestory2":myElement=successMessagestory2;break;
//            case "alreadyExist" : myElement =alreadyExist; break;
        }

        verifyContainsText(myElement, text);
    }


    public void SearchAndDelete(String searchText) {


        findAndSend("searchInput", searchText); // aranacak kelimeyi kutucuğa gönder
        findAndClick("searchButton"); // arama butonuna bas


        waitUntilLoading();

        findAndClick("deleteButton");// silme butonua bas
        findAndClick("deleteDialogBtn");// dilogdaki silme butonuna bas

    }


}
