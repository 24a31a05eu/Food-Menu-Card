import java.util.Scanner;

public class RestaurantMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int startersTotal = 0, mainTotal = 0, dessertTotal = 0;
        boolean orderedAnything = false;

        while (true) {
            int mainChoice;

            // MAIN MENU
            while (true) {
                System.out.println("!!!Welcome to the Multi Cuisine Restaurant!!!");
                System.out.println("********MAIN MENU********");
                System.out.println("1. Starters");
                System.out.println("2. Main Course");
                System.out.println("3. Desserts");
                System.out.print("Enter your required choice: ");
                mainChoice = sc.nextInt();

                if (mainChoice >= 1 && mainChoice <= 3)
                    break;
                System.out.println("Please enter from the given menu.");
            }

            int typeChoice;
            // VEG / NON-VEG
            while (true) {
                System.out.println("\n1. Veg\n2. Non-Veg");
                System.out.print("Enter the required choice: ");
                typeChoice = sc.nextInt();

                if (typeChoice == 1 || typeChoice == 2)
                    break;
                System.out.println("Please enter from the given options.");
            }

            boolean continueSame = true;

            while (continueSame) {
                int dishChoice = 0, price = 0;

                if (mainChoice == 1) { // STARTERS
                    if (typeChoice == 1) {
                        System.out.println("\nVeg Starters");
                        System.out.println("1. Paneer Tikka - 180");
                        System.out.println("2. Veg Manchurian - 150");
                        System.out.println("3. Spring Rolls - 120");
                        System.out.println("4. Crispy Mushroom - 140");
                        System.out.println("5. Crispy Chilly Potato - 110");
                        System.out.println("6. Veg Seekh Kabab - 130");
                        System.out.println("7. Crispy Chilly Chana - 150");
                        System.out.println("8. American Corn Ball - 150");

                    } else {
                        System.out.println("\nNon-Veg Starters");
                        System.out.println("1. Chicken Tikka - 220");
                        System.out.println("2. Chicken 65 - 200");
                        System.out.println("3. Fish Fry - 250");
                        System.out.println("4. Fish Tikka - 460");
                        System.out.println("5. Zinga Tikka - 510");
                        System.out.println("6. Mutton Sheek Kebab - 540");
                        System.out.println("7. Tangdi Kabab - 180");
                        System.out.println("8. Murg Chilli Kabab - 160");
                    }
                }

                else if (mainChoice == 2) { // MAIN COURSE
                    if (typeChoice == 1) {
                        System.out.println("\nVeg Main Course");
                        System.out.println("1. Paneer Butter Masala - 250");
                        System.out.println("2. Veg Biryani - 200");
                        System.out.println("3. Dal Fry - 180");
                        System.out.println("4. Malai Kofta - 140");
                        System.out.println("5. Kadahi Vegetable - 140");
                        System.out.println("6. Vegetable Pakeeza - 140");
                        System.out.println("7. Shabnam Curry - 150");
                        System.out.println("8. Veg Pulao - 110");

                    } else {
                        System.out.println("\nNon-Veg Main Course");
                        System.out.println("1. Chicken Biryani - 280");
                        System.out.println("2. Butter Chicken - 300");
                        System.out.println("3. Mutton Curry - 350");
                        System.out.println("4. Murg Masallam - 170");
                        System.out.println("5. Mutton Rogan Josh - 190");
                        System.out.println("6. Prawn Malai Curry - 190");
                        System.out.println("7. Fish Sarsowala - 140");
                        System.out.println("8. Mughlai Chicken - 160");
                    }
                }

                else { // DESSERTS
                    if (typeChoice == 1) {
                        System.out.println("\nVeg Desserts");
                        System.out.println("1. Gulab Jamun - 80");
                        System.out.println("2. Ice Cream - 100");
                        System.out.println("3. Rasmalai - 120");
                        System.out.println("4. Chocolate Doughnut - 90");
                        System.out.println("5. Marble Cake - 170");
                        System.out.println("6. Mocha Magic - 90");
                        System.out.println("7. Black Forest - 110");
                        System.out.println("8. Pineapple Shake -80");
                    } else {
                        System.out.println("\nNon-Veg Desserts");
                        System.out.println("1. Egg Pudding - 110");
                        System.out.println("2. Caramel Custard - 130");
                        System.out.println("3. Chocolate Mousse - 150");
                        System.out.println("4. Baked Cherry cheese cake - 180");
                        System.out.println("5. Chocolate Muffin- 250");
                        System.out.println("6. Japanese Tiramisu - 310");
                        System.out.println("7. Asian Crème Caramel - 210");
                        System.out.println("8. Parsi Mawa Cake - 160");
                        
                    }
                }

                // DISH CHOICE VALIDATION
                while (true) {
                    System.out.print("Enter the dish from given choice: ");
                    dishChoice = sc.nextInt();
                    if (dishChoice >= 1 && dishChoice <= 8)
                        break;
                    System.out.println("Please enter from given menu.");
                }

                System.out.print("Enter required quantity: ");
                int qty = sc.nextInt();

                // PRICE ASSIGNMENT
                if (mainChoice == 1) {
                    if (typeChoice == 1) {
                        price =
                            dishChoice == 1 ? 180 :
                            dishChoice == 2 ? 150 :
                            dishChoice == 3 ? 120 :
                            dishChoice == 4 ? 140 :
                            dishChoice == 5 ? 110 :
                            dishChoice == 6 ? 130 :
                            dishChoice == 7 ? 150 :
                            dishChoice == 8 ? 150 : 0;

                     } 
                    else { 
                        price =
                           dishChoice == 1 ? 220 :
                           dishChoice == 2 ? 200 :
                           dishChoice == 3 ? 250 :
                           dishChoice == 4 ? 460 :
                           dishChoice == 5 ? 510 :
                           dishChoice == 6 ? 540 :
                           dishChoice == 7 ? 180 :
                           dishChoice == 8 ? 160 : 0;
                   }
                   startersTotal += price * qty;
                }
                else if (mainChoice == 2) {
                   if (typeChoice == 1) {
                        price =
                            dishChoice == 1 ? 250 :
                            dishChoice == 2 ? 200 :
                            dishChoice == 3 ? 180 :
                            dishChoice == 4 ? 140 :
                            dishChoice == 5 ? 140 :
                            dishChoice == 6 ? 140 :
                            dishChoice == 7 ? 150 :
                            dishChoice == 8 ? 110 : 0;

                     } 
                    else { 
                        price =
                           dishChoice == 1 ? 280 :
                           dishChoice == 2 ? 300 :
                           dishChoice == 3 ? 350 :
                           dishChoice == 4 ? 170 :
                           dishChoice == 5 ? 190 :
                           dishChoice == 6 ? 190 :
                           dishChoice == 7 ? 140 :
                           dishChoice == 8 ? 160 : 0;
                   }                           
                   mainTotal += price * qty;
                }
                else {
                    if (typeChoice == 1) {
                        price =
                            dishChoice == 1 ? 80 :
                            dishChoice == 2 ? 100 :
                            dishChoice == 3 ? 120 :
                            dishChoice == 4 ? 90 :
                            dishChoice == 5 ? 170 :
                            dishChoice == 6 ? 90 :
                            dishChoice == 7 ? 110 :
                            dishChoice == 8 ? 80 : 0;

                     } 
                    else { 
                        price =
                           dishChoice == 1 ? 110 :
                           dishChoice == 2 ? 130 :
                           dishChoice == 3 ? 150 :
                           dishChoice == 4 ? 180 :
                           dishChoice == 5 ? 250 :
                           dishChoice == 6 ? 310 :
                           dishChoice == 7 ? 210 :
                           dishChoice == 8 ? 160 : 0;
                   }                         
                    dessertTotal += price * qty;
                }

                orderedAnything = true;

                // CONTINUE SAME CATEGORY?
                while (true) {
                    System.out.print("Do you want to continue in this choice? (y/n): ");
                    char ch = sc.next().toLowerCase().charAt(0);

                    if (ch == 'y') {
                        break;
                    } else if (ch == 'n') {
                        continueSame = false;
                        break;
                    } else {
                        System.out.println("Enter from the given options (y/n).");
                    }
                }
            }

            // ORDER MORE?
            while (true) {
                System.out.print("Do you want to order more? (y/n): ");
                char more = sc.next().toLowerCase().charAt(0);

                if (more == 'y') {
                    break;
                } else if (more == 'n') {
                    if (!orderedAnything) {
                        System.out.println("No items ordered. Bill cannot be generated.");
                        System.exit(0);
                    }

                    int subtotal = startersTotal + mainTotal + dessertTotal;
                    double gst = subtotal * 0.10;
                    double total = subtotal + gst;

                    System.out.println("\n********* Multi Cuisine Restaurant *********");    
                    System.out.println("**************** Starters ****************");
                    System.out.println("Total cost of Starters   : " + startersTotal);
                    System.out.println("*************** Main Course **************");
                    System.out.println("Total cost of Main Menu  : " + mainTotal);
                    System.out.println("**************** Desserts ****************");
                    System.out.println("Total cost of deserts    : " + dessertTotal);
                    System.out.println("\nSubtotal    : " + subtotal);
                    System.out.println("GST (10%)   : " + gst);
                    System.out.println("Grand Total : " + total);
                    System.out.println("\n***Thanks for visiting Multi Cuisine Restaurant***");
                    System.out.println("\t \t\t\t***Visit Again***");

                    System.exit(0);
                } else {
                    System.out.println("Enter from given options (y/n).");
                }
            }
        }
    }
}
