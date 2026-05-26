package com.indivaragroup.challenge.scanner;

import com.indivaragroup.challenge.scanner.exception.InvalidShoppingException;

public class ShoppingValidator {

    public static void validateQuantity(int quantity) throws InvalidShoppingException {
        if (quantity <= 0) {
            throw new InvalidShoppingException("Error: Quantity tidak boleh 0 atau kurang dari 0!");
        }
    }

    public static void validatePrice(double price) throws InvalidShoppingException {
        if (price < 0) {
            throw new InvalidShoppingException("Error: Harga tidak boleh minus!");
        }
    }
}
