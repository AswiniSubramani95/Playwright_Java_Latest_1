Feature: Create Product Functionality


@LoginDemodev
Scenario: Login to the demo dev site
Given Go to the Login page
When  Enter the valid emailaddress
And   Enter the valid password
And   Click on the Login button

@AddProducts
Scenario Outline: Create Product Functionality
Given Launch the product grid url
When  Click on the add product button
And   Enter the product name <ProductName> 
And   Enter the product sku <ProductSKU>
And   Enter the product Weight <ProductWeight>
And   Enter the product description <ProductDescription>
And   Select the ParentMaster value <ParentMaster>
And   Click on the save button
Then  It displays the success message for adding the product

Examples:
|ProductName      | ProductSKU        | ProductWeight    | ProductDescription | ParentMaster |
|PlayAutoTest1    |PlayAutoTest1      | 300              | PlayAutoTest1      |     Yes     |
|PlayAutoTest2    |PlayAutoTest2      | 300              | PlayAutoTest2      |     Yes     |
|PlayAutoTest3    |PlayAutoTest3      | 300              | PlayAutoTest3      |     Yes     |
|PlayAutoTest4    |PlayAutoTest4      | 300              | PlayAutoTest4      |     Yes     |
|PlayAutoTest5    |PlayAutoTest5      | 300              | PlayAutoTest5      |     Yes     |
|PlayAutoTest6    |PlayAutoTest6      | 300              | PlayAutoTest6      |     Yes     |
|PlayAutoTest7    |PlayAutoTest7      | 300              | PlayAutoTest7      |     Yes     |
|PlayAutoTest8    |PlayAutoTest8      | 300              | PlayAutoTest8      |     Yes     |



