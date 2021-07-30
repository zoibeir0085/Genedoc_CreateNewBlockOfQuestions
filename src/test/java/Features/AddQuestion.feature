Feature: AddQuestionFeature
  This feature deals with the login functionality of the application


  Scenario Outline: Adding QuestionGenedoc with Dependency
    Given I navigate to the login page
    And I enter "<username>" and "<password>"
    And I click login button
    Then I navigate to the model page
    Then I click to scaling question
    Then I add a new bloc of questions and rename it to "<BlocQuestionName>"
    Then I add first question :"<Question1>"
    Then I add second question :"<Question2>" with "<Question1>" dependency
    Then I add third question: "<Question3>" with "<Question2>" dependency
    Then I add fourth question:"<Question4>" with date type
    Then I add fifth question:"<Question5>" with list type
    Then I add sixth question:"<Question6>" with number type
    Then I save changes
    Then I click New Folder Button
    Then I enter "<Document>"  , "<CharteGraphique>", "<Rédacteurs>" and "<Approbateur>"
    #Then I validate
    Then I navigate to the model page
    Then I click to scaling question
    Then I delete block of questions created
    Then I save changes
    #Then I logout
    Then I close the browser
    Examples:
      | username        | password | Document                    | CharteGraphique       | Rédacteurs     | Approbateur    | BlocQuestionName     | Question1    | Question2    | Question3    | Question4    | Question5    | Question6    |
      #| rgauvin@kpmg.fr | aezan75  | COVID19\JUSTIFICATIF (TEST) | Rapport_CAC_seul.docx | BELKACEM Amine | BELKACEM Amine | My bloc of questions | My Question1 | My Question2 | My Question3 | My Question4 | My Question5 | My Question6 |
      | rgauvin@kpmg.fr | aezan75  | CAC\TEST model base -- test | Modele test           | BELKACEM Amine | BELKACEM Amine |  My bloc of questions | My Question1 | My Question2 | My Question3 | My Question4 | My Question5 | My Question6 |
     

