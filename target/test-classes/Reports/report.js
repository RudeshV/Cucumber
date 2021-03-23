$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFile/Testing.feature");
formatter.feature({
  "name": "Validating the Addactin hotel App",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@EndtoendTesting"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Validating the login screen",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is in the login page",
  "keyword": "Given "
});
formatter.step({
  "name": "user passing the valid \"\u003cusername\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "click on Login button",
  "keyword": "And "
});
formatter.step({
  "name": "user should enter in to the Search hotel screen",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "Password"
      ]
    },
    {
      "cells": [
        "RudeshVA1",
        "Newday@01"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validating the login screen",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@EndtoendTesting"
    }
  ]
});
formatter.step({
  "name": "user is in the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefenitionClass.user_is_in_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user passing the valid \"RudeshVA1\" and \"Newday@01\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefenitionClass.user_passing_the_valid_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefenitionClass.click_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter in to the Search hotel screen",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefenitionClass.user_should_enter_in_to_the_Search_hotel_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Validating the Search Hotel Page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is in the Login screen and after passing the valid credentials user will enter to the search hotel screen",
  "keyword": "Given "
});
formatter.step({
  "name": "user passsing valid \"\u003cUserName\u003e\" and \"\u003cPassWord\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Click on Login button in login screen",
  "keyword": "And "
});
formatter.step({
  "name": "After entering into the search hotel screen user is selecting all the mandatory fields",
  "keyword": "And "
});
formatter.step({
  "name": "Click on Search button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "UserName",
        "PassWord"
      ]
    },
    {
      "cells": [
        "RudeshVA1",
        "Newday@01"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validating the Search Hotel Page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@EndtoendTesting"
    }
  ]
});
formatter.step({
  "name": "user is in the Login screen and after passing the valid credentials user will enter to the search hotel screen",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchHotelStepDefinition.user_is_in_the_Login_screen_and_after_passing_the_valid_credentials_user_will_enter_to_the_search_hotel_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user passsing valid \"RudeshVA1\" and \"Newday@01\"",
  "keyword": "When "
});
formatter.match({
  "location": "SearchHotelStepDefinition.user_passsing_valid_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login button in login screen",
  "keyword": "And "
});
formatter.match({
  "location": "SearchHotelStepDefinition.click_on_Login_button_in_login_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "After entering into the search hotel screen user is selecting all the mandatory fields",
  "keyword": "And "
});
formatter.match({
  "location": "SearchHotelStepDefinition.after_entering_into_the_search_hotel_screen_user_is_selecting_all_the_mandatory_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Search button",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchHotelStepDefinition.click_on_Search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validating the Select Hotel page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@EndtoendTesting"
    }
  ]
});
formatter.step({
  "name": "User is in the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "SelectHotelStepDefenition.user_is_in_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Passing valid details in the login and search hotel screen",
  "keyword": "When "
});
formatter.match({
  "location": "SelectHotelStepDefenition.passing_valid_details_in_the_login_and_search_hotel_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selecting the hotel in the screen",
  "keyword": "And "
});
formatter.match({
  "location": "SelectHotelStepDefenition.selecting_the_hotel_in_the_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on continue",
  "keyword": "Then "
});
formatter.match({
  "location": "SelectHotelStepDefenition.click_on_continue()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validating the personal details screen",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@EndtoendTesting"
    }
  ]
});
formatter.step({
  "name": "user is in the login screen",
  "keyword": "Given "
});
formatter.match({
  "location": "BookHotelStepDefenition.user_is_in_the_login_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user passing valid details",
  "keyword": "When "
});
formatter.match({
  "location": "BookHotelStepDefenition.user_passing_valid_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicking on Book now",
  "keyword": "Then "
});
formatter.match({
  "location": "BookHotelStepDefenition.user_clicking_on_Book_now()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see",
  "keyword": "And "
});
formatter.match({
  "location": "BookHotelStepDefenition.user_should_see()"
});
formatter.result({
  "status": "passed"
});
});