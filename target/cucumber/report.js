$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("phptravelsTest.feature");
formatter.feature({
  "line": 1,
  "name": "PHP Travel",
  "description": "",
  "id": "php-travel",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4237687800,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Test PHP Travel Pages",
  "description": "",
  "id": "php-travel;test-php-travel-pages",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Navigate to phptravels.com/demo",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Hover mouse over \"FEATURES\" drop-down from top-menu",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Choose option \"Flights Module\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "IClick on the \"CHECKOUT PRICING\" on the bottom of the page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I Click the ORDER NOW button from the \"Standalone Web Application\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "On the configure page click Continue",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Click the Checkout button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Complete all the fields",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 12,
      "value": "#    When I try to click captcha"
    },
    {
      "line": 13,
      "value": "#    When I complete order"
    }
  ],
  "line": 14,
  "name": "Check if the details on invoice are the right one",
  "keyword": "Then "
});
formatter.match({
  "location": "GivenSteps.givenNavigatePHPTravelPage()"
});
formatter.result({
  "duration": 2972021100,
  "status": "passed"
});
formatter.match({
  "location": "WhenSteps.hoverFeatures()"
});
formatter.result({
  "duration": 75030900,
  "status": "passed"
});
formatter.match({
  "location": "ThensSteps.clickFlightsModule()"
});
formatter.result({
  "duration": 900914200,
  "status": "passed"
});
formatter.match({
  "location": "WhenSteps.checkoutPrice()"
});
formatter.result({
  "duration": 40068425700,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//b[contains(text(),\u0027Pricing\u0027)]\"}\n  (Session info: chrome\u003d74.0.3729.169)\n  (Driver info: chromedriver\u003d2.46.628402 (536cd7adbad73a3783fdc2cab92ab2ba7ec361e1),platform\u003dWindows NT 10.0.17763 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 40.06 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.0\u0027, revision: \u002735ae25b1534ae328c771e0856c93e187490ca824\u0027, time: \u00272016-03-15 10:43:46\u0027\nSystem info: host: \u0027EN410757\u0027, ip: \u0027172.17.107.69\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002712.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:57315}, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003dignore, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.46.628402 (536cd7adbad73a3783fdc2cab92ab2ba7ec361e1), userDataDir\u003dC:\\Users\\dbodac\\AppData\\Local\\Temp\\scoped_dir14072_17334}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, strictFileInteractability\u003dfalse, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d74.0.3729.169, browserConnectionEnabled\u003dfalse, proxy\u003d{}, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 693b7594e1cb81c2084386e54b82c8fd\n*** Element info: {Using\u003dxpath, value\u003d//b[contains(text(),\u0027Pricing\u0027)]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:500)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.click(Unknown Source)\r\n\tat Pages.PHPTrevelersPages.clickCheckoutPricing(PHPTrevelersPages.java:101)\r\n\tat Steps.WhenSteps.checkoutPrice(WhenSteps.java:17)\r\n\tat ✽.When IClick on the \"CHECKOUT PRICING\" on the bottom of the page(phptravelsTest.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "WhenSteps.clickOrderNow()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WhenSteps.continueButtonClick()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WhenSteps.clickCheckoutButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WhenSteps.completeAllFields()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ThensSteps.checInvoice()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 930467800,
  "status": "passed"
});
});