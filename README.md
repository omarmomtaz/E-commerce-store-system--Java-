# E-Commerce Store System (Java)

A simple console-based e-commerce prototype written in Java. It demonstrates basic product and shopping cart management, including adding items to a cart and calculating the total price.

## Features

- **Product Definition** – Create products with an ID, name, and price.
- **Shopping Cart** – Add and remove products from a virtual cart.
- **Price Calculation** – Compute the total cost of all items in the cart.
- **Sample Usage** – Pre-written `main` method that showcases the core functionality.

## Code Structure

| Class            | Description |
|------------------|-------------|
| `Product`        | Holds product details: ID, name, and price. |
| `ShoppingCart`   | Maintains a list of `Product` items; supports `addItem` and `removeItem`. |
| `ECommerceStore` | Main class that creates sample products, populates the cart, and displays contents + total. |

## How to Run

1. **Compile** the Java file:
   ```bash
   javac ECommerceStore.java
