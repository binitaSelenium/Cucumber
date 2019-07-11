$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Sprint_01.feature");
formatter.feature({
  "line": 1,
  "name": "This feature file contains the following modules like",
  "description": "Registering as job seeker\r\nRegistering as employer",
  "id": "this-feature-file-contains-the-following-modules-like",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11954237255,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "As an job seeker i must be able to register myself in the system",
  "description": "",
  "id": "this-feature-file-contains-the-following-modules-like;as-an-job-seeker-i-must-be-able-to-register-myself-in-the-system",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@test"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 9,
      "value": "# Given Launch the application"
    }
  ],
  "line": 10,
  "name": "application is launched hover on the resgister link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "verify jobseeker hyperlink is displayed,click on it",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "verify the user is navigated to jobseeker page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "enter all the fields data",
  "rows": [
    {
      "cells": [
        "Prathap",
        "Malepati",
        "abc.xyz@tcs.com",
        "9626272284",
        "Pass1234",
        "Pass1234",
        "09/08/1990",
        "male",
        "3 Months",
        "Telugu"
      ],
      "line": 14
    },
    {
      "cells": [
        "PraSAD",
        "Mahesh",
        "abc.xyz@tcs.com",
        "9626272284",
        "Pass1234",
        "Pass1234",
        "09/08/1990",
        "male",
        "3 Months",
        "Telugu"
      ],
      "line": 15
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "CommonAnnotation.hoveronRegisterLink()"
});
formatter.result({
  "duration": 3821449060,
  "status": "passed"
});
formatter.match({
  "location": "Tc_01_JobSeeker_Registration.clickonJobseeker()"
});
formatter.result({
  "duration": 9532313003,
  "status": "passed"
});
formatter.match({
  "location": "Tc_01_JobSeeker_Registration.verifyJobHeader()"
});
formatter.result({
  "duration": 36568866,
  "status": "passed"
});
formatter.match({
  "location": "Tc_01_JobSeeker_Registration.fillDetails(DataTable)"
});
formatter.result({
  "duration": 1369443,
  "status": "passed"
});
formatter.after({
  "duration": 15936,
  "status": "passed"
});
});