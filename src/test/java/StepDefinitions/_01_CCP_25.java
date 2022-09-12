package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class _01_CCP_25 {

    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();
    FormContent fc = new FormContent();


    @And("Click on the element in the left Nav")
    public void clickOnTheElementInTheLeftNav(DataTable elements) {
        List<String> listelement = elements.asList(String.class);
        for (int i = 0; i < listelement.size(); i++) {
            ln.findAndClick(listelement.get(i));

        }
    }

    @And("And Click on the element in the Dialog")
    public void andClickOnTheElementInTheDialog(DataTable elements) {
        List<String> listelement = elements.asList(String.class);
        for (int i = 0; i < listelement.size(); i++) {
            GWD.Bekle(4);
            dc.findAndClick(listelement.get(i));
        }
    }

    @And("User sending the keys in Dialog content")
    public void userSendingTheKeysInDialogContent(DataTable elements) {
        List<List<String>> listelement = elements.asLists(String.class);
        for (int i = 0; i < listelement.size(); i++) {
            GWD.Bekle(4);
            dc.findAndSend(listelement.get(i).get(0), listelement.get(i).get(1));
        }

    }


    @And("User delete item from Dialog")
    public void userDeleteItemFromDialog(DataTable elements) {
        List<String> element = elements.asList(String.class);
        for (int i = 0; i < element.size(); i++) {
            GWD.Bekle(2);
            dc.SearchAndDelete(element.get(i));
        }
    }

    @And("Click on the element in the Form Content")
    public void clickOnTheElementInTheFormContent(DataTable elements) {
        List<String> listelement = elements.asList(String.class);
        for (int i = 0; i < listelement.size(); i++) {
            fc.findAndClick(listelement.get(i));
        }

    }

    @And("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.findAndContainsText("successMessage", "successfully");

    }


}

