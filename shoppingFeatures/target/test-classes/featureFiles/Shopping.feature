
@Shopping
Feature: Shopping Functionality
  As a user, I should be able to view the products, add them to my cart, compare their prices, and proceed to checkout
  

  @TestCase8
  Scenario: User should be able to switch the products view from grid to list
    Given User is on login page
    And User logs in correctly "projecttesting2803@gmail.com", "12345"
    And User is logged in and on their account page
    When User clicks on the Women button
    And User clicks on the list icon above the products
    Then User should see the products arranged in the form of a list
    
    
    @TestCase9
  Scenario: User should be able to compare two items
  	Given User is on login page
    And User logs in correctly "projecttesting2803@gmail.com", "12345"
    And User is logged in and on their account page
    When User clicks on the Women button
    And User clicks on the list icon above the products
    And User clicks Add to Compare button of the Faded Shirt product
    And User clicks Add to Compare button of the Blouse product
    And User clicks Compare button
    Then User should see the information of both products in the Product Comparison page
    
    @TestCase10
  Scenario: User should be able to add two items to their cart
  	Given User is on login page
    And User logs in correctly "projecttesting2803@gmail.com", "12345"
    And User is logged in and on their account page
    When User clicks on the Women button
    And User clicks on the list icon above the products
    And User clicks on Add to cart button of the Faded Shirt product
    And User clicks Continue Shopping button
    And User clicks on Add to cart button of the Blouse product
    And User clicks Continue Shopping button again
    And User clicks on the Cart tab
    Then User should see the items in their cart
    
    @TestCase11
  Scenario: User should be able to continue shopping after adding a product to their cart
  	Given User is on login page
    And User logs in correctly "projecttesting2803@gmail.com", "12345"
    And User is logged in and on their account page
    When User clicks on the Women button
    And User clicks on the list icon above the products
    And User clicks on Add to cart button of the Faded Shirt product
    And User clicks Continue Shopping button
    Then User should see the Women products page to keep shopping and one item in their cart
    
    @TestCase12
  Scenario: User should be able to proceed to checkout after adding products to their cart
  	Given User is on login page
    And User logs in correctly "projecttesting2803@gmail.com", "12345"
    And User is logged in and on their account page
    When User clicks on the Women button
    And User clicks on the list icon above the products
    And User clicks on Add to cart button of the Faded Shirt product
    And User clicks Continue Shopping button
    And User clicks on Add to cart button of the Blouse product
    And User clicks Proceed to checkout button
    Then User should see the items from their cart and continue to the payment process


  
