Feature: Verify Cyclos Login

  Scenario Outline: Verify Login with Valid Credentials
    Given User is on the Cyclos LoginPage
    When User should login "<userName>" and "<password>"
    Then User should verify after Login success message "  Demo user "
    Examples:
      | userName | password |
      | demo     | 1234     |

  Scenario Outline: Verify Login with Valid credentials using Enter key
    Given User is on the Cyclos LoginPage
    When User should login "<userName>" and "<password>" with Enter key
    Then User should verify after Login success message "  Demo user "
    Examples:
      | userName | password |
      | demo     | 1234     |

  Scenario Outline: Verify Login with inValid credentials
    Given User is on the Cyclos LoginPage
    When User should login "<userName>" and "<password>"
    Then User should verify after Login Error message "The given name / password are incorrect. Please, try again."
    Examples:
      | userName | password |
      | admin    | 1234     |