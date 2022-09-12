Feature: Datatable Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

#  Admin User should be able to Add Subject Categories
#  Edit Subject Categories
#  Delete Subject Categories
#  for setting different education details for schools.
#  Education > Setup tab. We should have an option to activate and deactivate Subject Categories

  Scenario:Create an Category
    And Click on the element in the left Nav
      | clickeducation         |
      | clicksetup             |
      | clicksubjectcategories |


    And And Click on the element in the Dialog
      | addsubject |

    And User sending the keys in Dialog content
      | typeonnameintab | aaaaaa0aa  |
      | typeoncodeintab | 0001111111 |

    And And Click on the element in the Dialog
      | clicksave1 |


    And And Click on the element in the Dialog
      | editsub1 |
    And User sending the keys in Dialog content
      | renameinsub | aaaaaaaaaaaaaaaaaaaaaaaaaaaaa |
    |recodeinsub  |111111111111111111111111111111111111|



    And And Click on the element in the Dialog
      | resaveinsub |

    And And Click on the element in the Dialog
    |deleteinsub|
    |deleteclickinsub|

