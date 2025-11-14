# Surpris-Cheesy-Pizza-

![img.png](img.png)

PTable of ContentsProject Overview (#project-overview)  
Features (#features)  
Application Flow (#application-flow)  
Screenshots (#screenshots)  
Class Diagram (#class-diagram)  
Project Structure (#project-structure)  
How to Run (#how-to-run)  
Interesting Code Snippet (#interesting-code-snippet)  
GitHub Project Board (#github-project-board)  
Technologies Used (#technologies-used)  
Future Enhancements (#future-enhancements)  
Contributing (#contributing)  
License (#license)  
Author (#author)

Project OverviewPIZZA-licious is a console-based point-of-sale (POS) system designed for a growing custom pizza shop. It automates the ordering process, allowing customers to create personalized pizzas while ensuring a seamless experience from order placement to receipt generation.  Why it's useful: Eliminates manual paper orders, handles complex customizations, and scales for future online integration.
What you can do: Build, validate, and save orders with detailed pricing.
Audience: Java developers, students learning OOP, or anyone building POS systems.  Built as part of the Pluralsight Advanced Java OOP Capstone, emphasizing Object-Oriented Principles like inheritance, polymorphism, and encapsulation.  FeaturesFeature
Description
Custom Pizzas
Choose from 3 sizes, 4 crust types, stuffed crust, and unlimited toppings with extras.
Topping Categories
Premium (Meat, Cheese) with costs; Regular, Sauce, Side included (extras free for non-premium).
Pricing Engine
Dynamic calculations based on size—no enums, using string constants and switch expressions.
Order Validation
Ensures orders have at least one pizza OR drinks/garlic knots.
Receipt System
Automatically generates and saves timestamped .txt files in receipts/.
Signature Pizzas
Pre-configured options like Margherita and Veggie, customizable as subclasses.
User-Friendly Console
Interactive menus for easy navigation.

Application Flow

Home Screen
└──> New Order
└──> Order Screen
├── Add Pizza (customize size, crust, toppings, extras)
├── Add Drink (size & flavor)
├── Add Garlic Knots (quantity)
├── Checkout → View details & total → Confirm → Save receipt
└── Cancel Order

ScreenshotsHome Screen text

Home Screen
1) New Order
0) Exit

Adding a Pizza text

Add Pizza
Select size: 1) Personal 8", 2) Medium 12", 3) Large 16"
Select crust: 1) Thin, 2) Regular, 3) Thick, 4) Cauliflower
Would you like stuffed crust? (y/n)
Add meats? (pepperoni, sausage...) Enter names separated by comma, or none
... (similar for cheeses, regulars, sauces, sides)

Sample Receipt (receipts/20250405-143022.txt)text

Order Receipt
Date: 20250405-143022
MEDIUM_12_INCH REGULAR crust pizza with stuffed crust with toppings: Pepperoni (extra x1), Mozzarella - $17.00
Large Coke drink - $3.00
6 Garlic Knots - $9.00
Total: $29.00

How to RunPrerequisitesJava: 14+ (for switch expressions)  
Git: For cloning

InstallationClone the repository:  bash

git clone https://github.com/MarcSurpris/Surpris-Cheesy-Pizza-shop.git
cd Surpris-Cheesy-Pizza-shop

Create the receipts/ folder (if not present):  bash

mkdir receipts

Compile the code:  bash

javac -d bin $(find src/main/java -name "*.java")

Run the application:  bash

java -cp bin com.pizzalicious.app.PizzaShopApp

Note: If using an IDE (e.g., IntelliJ), import as a Java project and run PizzaShopApp.main().  
Interesting Code Snippetjava

// From PizzaSize.java: Dynamic meat pricing based on size (no enums!)
public static double getMeatPrice(String size) {
return switch (size) {
case PERSONAL_8_INCH -> 1.00;
case MEDIUM_12_INCH  -> 2.00;
case LARGE_16_INCH   -> 3.00;
default -> 0.0;
};
}

Demonstrates clean, readable pricing logic using Java 14+ switch expressions. Scalable for more sizes without refactoring.
GitHub Project BoardView Project Board →  Columns: To Do, In Progress, Review, Done  
Commits: 20+ meaningful messages (e.g., "feat: add Pizza class with toppings")  
Branches: Used for features (e.g., feature/order-validation)

Technologies Used
Java 17  
OOP Principles: Inheritance (Topping subclasses), Polymorphism (Item implementations), Encapsulation (private fields), Abstraction (abstract methods)  
Git & GitHub for version control  
PlantUML for diagrams  
Console I/O with Scanner and FileWriter

Future EnhancementsIntegrate a GUI (Swing/JavaFX)  
Add database persistence (SQLite/JDBC)  
Support online ordering via web API  
Implement user accounts and loyalty rewards

Contributing 
Contributions are welcome! Please see CONTRIBUTING.md for guidelines:  Fork the repo  
Create a feature branch  
Submit a pull request with clear descriptions

License 
This project is licensed under the MIT License. See LICENSE for details.  AuthorMarc Surpris
Pluralsight Java Capstone Student
GitHub Profile
Email: your-email@example.com (mailto:your-email@example.com)  "Code like a chef. Deliver like a pro."
Thank you for checking out PIZZA-licious! If you like it, give it a  on GitHub.  

