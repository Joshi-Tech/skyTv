Feature: This is a feature to complete journey

  Scenario: Make a purchase by card
    Given user launches Chrome Browser
    When launching "https://www.nowtv.com/membership"
    Then accept cookies
    Then get title of the page
    Then click button join now
    Then opens get title of new page
    Then click Entertainment Membership
    Then get title of Choose your membership
    Then click Entertainment voucher only
#    Then get title of Add Boost page
#    Then click continue without boost
#    Then click continue CTA for NOW only membership
    Then ensure title of the new page is NOW-Basket summary
    Then click to CTA Continue to checkout
    Then ensure title of the new page is NOW-Checkout
    Then enter title
    And First name
    And Last name
    And Email
    Then confirmEmail
    And password
    Then confirmPassword
    Then click CTA Next
    Then Enter postcode
    And click Find address
    Then click Address dropdown
    Then click address
    Then click Next in Address Form
    Then click on payment by card tab
    Then Enter card number
    Then Expiry date
    Then cvv
    Then click Terms of use
#    Then click checkout





