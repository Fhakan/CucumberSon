Feature: Login Functionality

Background:
Given Navigate to basqar
When Enter username and password and click login button
Then User should login successfuly

  Scenario:Create an account
    And Click on the element in the left Nav
      | clickinSetup         |
      | clickinSchoolsetup   |
      | clickindepartments   |
#      | selectschoolandclick |
#      | clickschool1         |
#      | searchclick          |
#      | add1                 |



    And And Click on the element in the Dialog
    |selectschooldept|
    |newauch         |
    |addbutton       |



    And User sending the keys in Dialog content
      | fillupname | aaaaaa      |
      | entercode  | 22222222222 |
    And And Click on the element in the Dialog
      | sectionclick |
      | clicksave    |

    And And Click on the element in the Dialog
      | edit1 |
    And User sending the keys in Dialog content
      | rename1 | aaaaaaaaaaaaa  |
      | recode1 | 00000001111111 |


    And And Click on the element in the Dialog
      | reclicktosection |
      | resave1          |
      | deletebutton     |
      | deleteclick      |