package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }


    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement clickinSetup;

    @FindBy(xpath = "//span[text()='School Setup']")
    private WebElement clickinSchoolsetup;


    @FindBy(xpath = "//span[text()='Departments']")
    private WebElement clickindepartments;

    @FindBy(xpath = "//*[@class='mat-select-arrow-wrapper ng-tns-c93-59']")
    private WebElement selectschoolandclick;

    @FindBy(xpath = "//*[@id='mat-option-24']")
  private WebElement clickschool1;

  @FindBy(xpath = "//*[@class='control-full']")
    private WebElement searchclick;

   @FindBy(xpath = "//*[@class='svg-inline--fa fa-plus']")
    private WebElement add1;

    //*********************************************************************************//

    @FindBy(xpath = "//span[text()='Education']")
    private WebElement clickeducation;
    @FindBy(xpath = "(//span[text()='Setup'])[4]")
    private WebElement clicksetup;

    @FindBy(xpath = "(//span[text()='Subject Categories'])")
    private WebElement clicksubjectcategories;

    ///****************************************************//
    //3.th story

    @FindBy(xpath = "//span[text()='Human Resources']")
            private WebElement clickhumanresource;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
            private WebElement clickinsetupinhuman;

    @FindBy(xpath = "//span[text()='Position Categories']")
            private WebElement clickinpossitioncatagory;




    @FindBy(xpath = "//div[@class='control-full']")
    private WebElement searchclick;

    @FindBy(css = "div>ms-add-button")
            private WebElement add1;



    @FindBy(xpath="(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement countries;

    @FindBy(xpath = "//span[text()='Citizenships']")
    private WebElement citizenShip;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationalities;

    @FindBy(xpath = "//span[text()='Fees']")
    private WebElement fees;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
    private WebElement entranceExamsOne;

    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    private WebElement setupTwo;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    private WebElement entranceExamsTwo;

    WebElement myElement;

    public void findAndClick(String strElement) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {
            case "clickinSetup":
                myElement = clickinSetup;
                break;
            case "clickinSchoolsetup":
                myElement = clickinSchoolsetup;
                break;
            case "clickindepartments":
                myElement = clickindepartments;
                break;

           case "selectschoolandclick":
               myElement = selectschoolandclick;
               break;

           case "clickschool1":
               myElement = clickschool1;
               break;

           case "searchclick":
               myElement = searchclick;
               break;

           case "add1":
               myElement = add1;
               break;

            //************************************************************//

            case "clickeducation":
                myElement = clickeducation;
                break;
            case "clicksetup":
                myElement = clicksetup;
                break;
            case "clicksubjectcategories":
                myElement = clicksubjectcategories;
                break;

                //*******************************************************//

            case "clickhumanresource":myElement=clickhumanresource;break;
            case "clickinsetupinhuman":myElement=clickinsetupinhuman;break;
            case "clickinpossitioncatagory":myElement=clickinpossitioncatagory;break;


          case "searchclick":myElement=searchclick;break;
          case "add1":
              myElement = add1;
              break;


          case "setupOne" : myElement =setupOne; break;
          case "parameters" : myElement =parameters; break;
          case "countries" : myElement =countries; break;
          case "citizenShip" : myElement =citizenShip; break;
          case "nationalities" : myElement =nationalities; break;
          case "fees" : myElement =fees; break;
          case "entranceExamsOne" : myElement =entranceExamsOne; break;
          case "setupTwo" : myElement =setupTwo; break;
          case "entranceExamsTwo" : myElement =entranceExamsTwo; break;
        }

        clickFunction(myElement);

    }

}
