🍽️ Multi Cuisine Restaurant Menu – Java Console Application

This is a menu-driven Java console application that simulates a restaurant ordering and billing system.
The program allows users to order food from different categories, validates inputs strictly, calculates category-wise totals, applies GST, and finally generates a detailed bill.

📌 Features

✅ Three main categories

Starters

Main Course

Desserts

✅ Veg & Non-Veg options in each category

✅ Multiple dishes (8 items each) with fixed prices

✅ Quantity-based billing

✅ Strict input validation

Invalid menu choices are rejected

Only y/n accepted for continuation prompts

✅ User-controlled flow

Continue within the same category

Return to main menu

Decide whether to order more

✅ Bill generation only if at least one item is ordered

✅ Category-wise total display

✅ GST calculation

✅ Final bill summary

❌ No switch-case used (only if-else)

❌ No exit option in main menu (as per requirement)

🧾 Billing Details

Displays:

Starters total

Main course total

Desserts total

Calculates:

Subtotal

GST

Grand Total

🛠️ Technologies Used

Language: Java

IDE: Visual Studio Code

Input Handling: java.util.Scanner

Application Type: Console-based

▶️ How to Run

Make sure Java (JDK) is installed.

Open Visual Studio Code.

Create a file named:

RestaurantMenu.java


Paste the complete source code into the file.

Compile and run:

javac RestaurantMenu.java
java RestaurantMenu

🧪 Sample Flow
MAIN MENU
1. Starters
2. Main Course
3. Desserts

Choose Veg / Non-Veg
Select Dish
Enter Quantity
Continue in same category? (y/n)
Order more? (y/n)

Final Bill Generated with GST

🚫 Input Rules

Menu choices must be within the given range

For continuation prompts:

Only y or n are accepted

Any other input will ask again

Bill will not be generated if no items are ordered

📂 Project Structure
📁 MultiCuisineRestaurant
 ├── RestaurantMenu.java
 └── README.md

🙌 Acknowledgement

This project is created for learning and practicing Java fundamentals, including:

Conditional statements

Loops

Input validation

Real-world console application logic

📜 License

This project is open for educational use and can be modified freely.
