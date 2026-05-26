package com.indivaragroup.challenge.scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.indivaragroup.challenge.scanner.dto.ShoppingDTO;
import com.indivaragroup.challenge.scanner.exception.InvalidShoppingException;
import java.util.InputMismatchException;

public class ScannerApplication {
    public static void ShoppingService() {

        Scanner scanner = new Scanner(System.in);

        List<ShoppingDTO> shoppingList = new ArrayList<>();

        try {
            boolean running = true;

            while (running) {
                System.out.print("Enter Item Name: ");
                String item = scanner.nextLine();

                System.out.print("Enter Qty: ");
                int quantity = scanner.nextInt();
                ShoppingValidator.validateQuantity(quantity); // Validasi Qty

                System.out.print("Enter Price: ");
                double price = scanner.nextDouble();
                ShoppingValidator.validatePrice(price);       // Validasi Price

                scanner.nextLine();

                double subTotal = quantity * price;

                ShoppingDTO shoppingData = new ShoppingDTO();
                shoppingData.setItem(item);
                shoppingData.setQuantity(quantity);
                shoppingData.setPrice(price);
                shoppingData.setSubTotal(subTotal);

                shoppingList.add(shoppingData);

                System.out.print("Tambahkan Item? (y/n): ");
                String choice = scanner.nextLine().trim().toLowerCase();

                if (choice.equals("n")) {
                    running = false;
                }
                System.out.println("-------------------------------------------------");
            }

            printReceipt(shoppingList);

        } catch (InvalidShoppingException e) {
            System.out.println("\n" + e.getMessage());

        } catch (InputMismatchException e) {
            System.out.println("\nError: Inputan salah, harap masukkan angka untuk Qty dan Price!");

        } finally {
            scanner.close();
        }
    }

    public static void printReceipt(List<ShoppingDTO> list) {
        StringBuilder receipt = new StringBuilder();

        receipt.append("\n=================================================\n");
        receipt.append("--------------------RECEIPT----------------------\n");
        receipt.append("=================================================\n");

        receipt.append(String.format("%-15s | %-5s | %-10s | %-10s\n", "Item", "Qty", "Price", "Subtotal"));
        receipt.append("-------------------------------------------------\n");

        int totalItem = 0;
        double totalSubTotal = 0;

        for (ShoppingDTO data : list) {
            receipt.append(String.format("%-15s | %-5d | %-10.2f | %-10.2f\n",
                    data.getItem(),
                    data.getQuantity(),
                    data.getPrice(),
                    data.getSubTotal()));

            totalItem += data.getQuantity();
            totalSubTotal += data.getSubTotal();
        }

        double tax = totalSubTotal * 0.10;
        double grandTotal = totalSubTotal + tax;

        receipt.append("-------------------------------------------------\n");
        receipt.append(String.format("%37s: %-10d\n", "Total Item", totalItem));
        receipt.append(String.format("%37s: %-10.2f\n", "Tax (10%)", tax));
        receipt.append(String.format("%37s: %-10.2f\n", "Total", grandTotal));
        receipt.append("=================================================\n");

        System.out.println(receipt);
    }



    public static void main(String[] args) {
        ShoppingService();
    }
}
