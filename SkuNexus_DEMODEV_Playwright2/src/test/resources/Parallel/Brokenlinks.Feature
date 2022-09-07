Feature: Check broken links 
//Check borken links on the home,customer,cyclecount,orders,purchaseorders,products,RMA,Receiveinventory

@Beforetest
Scenario: Verify the Login Scenario
Given User on the Login page
And User Enters Emailaddress
And User Enters Password
And User Clicks on the Login button
Then User Login Successfully

@Home
Scenario Outline: Veri	fy the home page links
When Check the links on the home <Home>

Examples:
| Home |
| https://demo-dev.skunexus.com/dashboard |

@Customer
Scenario Outline: Verify the customer page links
When Check the links on the customer <Customer>

Examples:
| Customer |
| https://demo-dev.skunexus.com/customers |
| https://demo-dev.skunexus.com/customer/0072452f-d19e-3a5f-811e-863b47994ec9 |
| https://demo-dev.skunexus.com/customer-form/000bc593-f392-35f6-b1cc-3e29db0a1ec5 |


@Cyclecount
Scenario Outline: Verify the cyclecount page links
When Check the links on the cyclecount <Cyclecount>

Examples:
| Cyclecount |
| https://demo-dev.skunexus.com/cycles |
| https://demo-dev.skunexus.com/historical-cycles |
| https://demo-dev.skunexus.com/cycle-count/manager-review |
| https://demo-dev.skunexus.com/cycle-count/group-missing-assignments |
| https://demo-dev.skunexus.com/cycle-count/group-assignments |
|https://demo-dev.skunexus.com/cycles/9ee97378-fdce-490b-bacb-e112308eacc8|
|https://demo-dev.skunexus.com/cycles/wave-details/754191eb-489c-4023-83f6-203069e5fa58 |
|https://demo-dev.skunexus.com/cycles/wave-details/4347e22b-e9fc-4cb7-a5bb-c908a2a8879b |
|https://demo-dev.skunexus.com/cycles/6dedbf4d-4254-4b2a-96f1-d5e00d3df064 |

@Orders
Scenario Outline: Verify the orders  page links
When Check the links on the orders <Orders>

Examples:
| Orders |
| https://demo-dev.skunexus.com/orders |
| https://demo-dev.skunexus.com/orders/30dfb157-c47f-4f6b-abef-6c4bf1ef94df |


@Purchaseorders
Scenario Outline: Verify the purchase orders page links
When Check the links on the purchase orders <Purchaseorders>

Examples:

| Purchaseorders |
|https://demo-dev.skunexus.com/purchase-orders |
|https://demo-dev.skunexus.com/purchase-orders/edit/69f24480-a810-4183-982f-8fc8e29d0776|

@Products
Scenario Outline: Verify the products page links
When Check the links on the products  <products>

Examples:

| products |
|https://demo-dev.skunexus.com/products |
|https://demo-dev.skunexus.com/products/form/0072fdc7-3e72-4294-a71c-0599e443c59c|
|https://demo-dev.skunexus.com/products/overview/0072fdc7-3e72-4294-a71c-0599e443c59c|
|https://demo-dev.skunexus.com/products/stock/0072fdc7-3e72-4294-a71c-0599e443c59c|
|https://demo-dev.skunexus.com/products/allocations/fb4f22cc-c78c-4050-ae40-f4de0462dfcb |
|https://demo-dev.skunexus.com/products/adjustments/0072fdc7-3e72-4294-a71c-0599e443c59c|
|https://demo-dev.skunexus.com/products/barcodes/0072fdc7-3e72-4294-a71c-0599e443c59c |
|https://demo-dev.skunexus.com/products/reservations/0072fdc7-3e72-4294-a71c-0599e443c59c |
|https://demo-dev.skunexus.com/products/kitting/0072fdc7-3e72-4294-a71c-0599e443c59c |
|https://demo-dev.skunexus.com/products/media/0072fdc7-3e72-4294-a71c-0599e443c59c|
|https://demo-dev.skunexus.com/products/cycle-count/0072fdc7-3e72-4294-a71c-0599e443c59c|



@RMA
Scenario Outline: Verify the RMA page links
When Check the links on the RMA <RMA>

Examples:

| RMA |
| https://demo-dev.skunexus.com/rma |
|https://demo-dev.skunexus.com/rma/details/015176b0-9d9d-45ce-994b-0039792490f1|


@Receiveinventory
Scenario Outline: Verify the Receiveinventory page links
When Check the links on the Receiveinventory <Receiveinventory>

Examples:

| Receiveinventory |
| https://demo-dev.skunexus.com/receive-inventory/main |
|https://demo-dev.skunexus.com/receive-inventory/items |
|https://demo-dev.skunexus.com/receive-inventory/put-away |
|https://demo-dev.skunexus.com/receive-inventory/put-away-final |

