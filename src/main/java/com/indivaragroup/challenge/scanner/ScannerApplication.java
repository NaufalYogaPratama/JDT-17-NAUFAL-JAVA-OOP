package com.indivaragroup.challenge.scanner;

import java.util.*;

import com.indivaragroup.challenge.scanner.dto.ShoppingDTO;
import com.indivaragroup.challenge.scanner.exception.InvalidShoppingException;


public class ScannerApplication {
    public static void shoppingService() {

        Scanner scanner = new Scanner(System.in);

        ShoppingDTO[] shoppingArray = new ShoppingDTO[3];

        try {
            boolean running = true;

            int itemCount = 0;

            while (running) {
                System.out.print("Enter Item Name: ");
                String item = scanner.nextLine();
                ShoppingValidator.validateItemName((Object) item);

                System.out.print("Enter Qty: ");
                String qtyInput = scanner.nextLine();
                ShoppingValidator.validateQuantityRegex(qtyInput);
                int quantity = Integer.parseInt(qtyInput);

                System.out.print("Enter Price: ");
                String priceInput = scanner.nextLine();
                ShoppingValidator.validatePriceRegex(priceInput);
                double price = Double.parseDouble(priceInput);

                double subTotal = quantity * price;

                ShoppingDTO shoppingData = new ShoppingDTO();
                shoppingData.setItem(item);
                shoppingData.setQuantity(quantity);
                shoppingData.setPrice(price);
                shoppingData.setSubTotal(subTotal);

                shoppingArray[itemCount] = shoppingData;

                itemCount++;

                if (itemCount == 3) {
                    System.out.println("=================================================");
                    System.out.println("             Maksimal Order 3 Kali!              ");
                    System.out.println("=================================================");
                    running = false;
                } else {
                    System.out.print("Tambahkan Item? (y/n): ");
                    String choice = scanner.nextLine().trim().toLowerCase();

                    if (choice.equals("n") || choice.equals("no")) {
                        running = false;
                    }
                    System.out.println("-------------------------------------------------");
                }
            }

            ShoppingDTO[] filledArray = Arrays.copyOf(shoppingArray, itemCount);
            printReceipt(filledArray);

        } catch (InvalidShoppingException e) {
            System.out.println("\n" + e.getMessage());

        } catch (InputMismatchException e) {
            System.out.println("\nError: Inputan salah, harap masukkan angka untuk Qty dan Price!");

        } finally {
            scanner.close();
        }
    }

    public static void printReceipt(ShoppingDTO[] array) {
        StringBuilder receipt = new StringBuilder();

        Properties properties = new Properties();
        properties.setProperty("store.name", "Seven Eleven");
        properties.setProperty("cashier.name", "Naufal");

        String receiptId = UUID.randomUUID().toString();

        receipt.append("\n=================================================\n");
        receipt.append(String.format("Store   : %s\n", properties.getProperty("store.name")));
        receipt.append(String.format("Cashier : %s\n", properties.getProperty("cashier.name")));
        receipt.append(String.format("Receipt : %s\n", receiptId));
        receipt.append("=================================================\n");

        Arrays.sort(array, Comparator.comparing(ShoppingDTO::getItem));

        double totalSubTotal = 0;

        for (ShoppingDTO data : array) {
            receipt.append(String.format("%s x %d = %.0f\n",
                    data.getItem(),
                    data.getQuantity(),
                    data.getSubTotal()));

            totalSubTotal += data.getSubTotal();
        }

        Random random = new Random();
        int taxPercentage = random.nextInt(21);
        double taxAmount = totalSubTotal * taxPercentage / 100;
        double grandTotal = taxAmount + totalSubTotal;

        receipt.append("-------------------------------------------------\n");
        receipt.append(String.format("%-12s : %d%% = %.2f\n", "Tax", taxPercentage, taxAmount));
        receipt.append(String.format("%-10s : %.2f\n", "Grand Total", grandTotal));
        receipt.append("=================================================\n");

        String finalReceipt = receipt.toString();

        String encode = Base64.getEncoder().encodeToString(finalReceipt.getBytes());

        System.out.println(finalReceipt);

        System.out.println("ENCODED RECEIPT = " + encode);
    }



    public static void main(String[] args) {
        shoppingService();
    }
}
