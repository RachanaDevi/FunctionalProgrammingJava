# Problem Statement: Sales Data Processing

You are given a list of sales transactions for a company. Each transaction is represented by a class Sale with the following attributes:

```java
Copy code
class Sale {
String productName;
int quantity;
double unitPrice;
String category;
}
```
Your task is to perform various operations on this data using functional programming concepts. Specifically, you need to:

- [X] Calculate Total Revenue Sale object into its total revenue (quantity * unitPrice).
- [X] Find Most Sold Product
- [X] Get Average Unit Price per Category where quantity is greater than 100.
- [X] Filter products: Use filter and Predicate to find all sales where the quantity sold is greater than 100.
- [X] Use sorted to sort the sales by total revenue in descending order.
- [X] Get Unique Categories
- [X] Join Product Names
- [X] Create a Report:
  - For each category, generate a report containing:
  - Total quantity sold.
  - Total revenue.
  - Average unit price.
- [X] Find Expensive Products: Use filter and a custom Predicate to find products where the unit price is greater than $100.
- [X] Get the Cheapest Product: Use min and a custom Comparator to find the product with the lowest unit price.
