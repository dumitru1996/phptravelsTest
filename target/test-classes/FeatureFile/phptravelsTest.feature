Feature: PHP Travel

  Scenario: Test PHP Travel Pages
    Given Navigate to phptravels.com/demo
    When Hover mouse over "FEATURES" drop-down from top-menu
    Then Choose option "Flights Module"
    When IClick on the "CHECKOUT PRICING" on the bottom of the page
    Then I Click the ORDER NOW button from the "Standalone Web Application"
    When On the configure page click Continue
    When Click the Checkout button
    When Complete all the fields
#    When I try to click captcha
#    When I complete order
    Then Check if the details on invoice are the right one
