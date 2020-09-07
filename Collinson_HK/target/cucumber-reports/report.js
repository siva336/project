$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/sivanarayana.g/IdeaProjects/untitled1/Collinson_HK/src/main/java/features/Okura.feature");
formatter.feature({
  "line": 3,
  "name": "Navigate to particular Url",
  "description": "",
  "id": "navigate-to-particular-url",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Collinson_sample"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "To validate the founder and chairman in the web page",
  "description": "",
  "id": "navigate-to-particular-url;to-validate-the-founder-and-chairman-in-the-web-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Go to the required option",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Validate the page",
  "keyword": "And "
});
formatter.match({
  "location": "Loginpagesteps.enter_the_url()"
});
formatter.result({
  "duration": 22574611470,
  "status": "passed"
});
formatter.match({
  "location": "Loginpagesteps.go_to_the_required_option()"
});
formatter.result({
  "duration": 6460698373,
  "status": "passed"
});
formatter.match({
  "location": "Loginpagesteps.validate_the_page()"
});
formatter.result({
  "duration": 574355848,
  "status": "passed"
});
});