$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/pokemonName.feature");
formatter.feature({
  "name": "Verify that all Pokémon starting their name with “Y” are present in the “List of names”",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify that all Pokémon names start with “Y”",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@try"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user is on the Main Page",
  "keyword": "Given "
});
formatter.match({
  "location": "searchFunction_StepDef.the_user_is_on_the_Main_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to Bulbapedia tab and click By Name",
  "keyword": "And "
});
formatter.match({
  "location": "searchFunction_StepDef.navigate_to_Bulbapedia_tab_and_click_By_Name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click to Y letter in the content List",
  "keyword": "When "
});
formatter.match({
  "location": "searchFunction_StepDef.user_click_to_Y_letter_in_the_content_List()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify all the names start with Y Letter",
  "keyword": "Then "
});
formatter.match({
  "location": "searchFunction_StepDef.verify_all_the_names_start_with_Y_Letter()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});