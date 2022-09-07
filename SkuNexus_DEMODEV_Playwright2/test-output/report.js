$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/Features/Brokenlinks.Feature");
formatter.feature({
  "line": 1,
  "name": "Check broken links",
  "description": "",
  "id": "check-broken-links",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verification of Login Scenario",
  "description": "",
  "id": "check-broken-links;verification-of-login-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User on the Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Enters Emailaddress",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User Enters Password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Clicks on the Login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User Login Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.User_on_the_Login_page()"
});
formatter.result({
  "duration": 6767494200,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: cannot determine loading status\nfrom disconnected: received Inspector.detached event\n  (Session info: chrome\u003d100.0.4896.88)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027ZSLAP119\u0027, ip: \u0027192.168.1.5\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 100.0.4896.88, chrome: {chromedriverVersion: 100.0.4896.60 (6a5d10861ce8..., userDataDir: C:\\Users\\Z0309\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:51849}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 4c11051b5723383aa37b67db52ae7526\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:277)\r\n\tat Utilities.Testbase.initialization(Testbase.java:49)\r\n\tat StepDefinitions.LoginStepDefinition.User_on_the_Login_page(LoginStepDefinition.java:20)\r\n\tat ✽.Given User on the Login page(src/main/java/Features/Brokenlinks.Feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStepDefinition.User_Enters_Emailaddress()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.User_Enters_Password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.User_Clicks_on_the_Login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.User_Login_Successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 11,
  "name": "Verification of broken links on home page",
  "description": "",
  "id": "check-broken-links;verification-of-broken-links-on-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User clicks on links",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User should not see broken links",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});