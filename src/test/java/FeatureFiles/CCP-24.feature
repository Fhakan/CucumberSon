Feature: Fields

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  @CCP-24
  Scenario: Create Field edit and delete
    And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | fields     |

    And Click on the element in the Dialog
      | fieldsAddButton |

    And User sending the keys in Dialog content
      | nameInput  | Ertccp2 |
      | codeInput  | Ertcc  |

    And Click on the element in the Dialog
      | saveButton2 |

    And Success message should be displayed

    And Click on the element in the Dialog
      | editButton2 |

    And User sending the keys in Dialog content
      | nameInput | Ertccp24 |
      | codeInput | Ertccp  |

    And Click on the element in the Dialog
      | saveButton2 |

    And Success message should be displayed

    And Click on the element in the Dialog
      | deleteButton2 |
      | deleteDialogBtn |

    And Success message should be displayed