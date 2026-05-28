package com.indivaragroup.challenge.scanner;

import com.indivaragroup.challenge.scanner.exception.InvalidShoppingException;

import java.util.Objects;

public class ShoppingValidator {

    public static void validateItemName(Object item) throws InvalidShoppingException {
        if (Objects.isNull(item)) {
            throw new InvalidShoppingException("Error: Nama Item tidak boleh null!");
        }

        String itemName = item .toString().trim();
        if (itemName.isEmpty()) {
            throw new InvalidShoppingException("Error: Nama Item tidak boleh kosong!");
        }
    }

    public static void  validateQuantityRegex(String quantity) throws InvalidShoppingException {
        if (!quantity.matches("^[1-9][0-9]*$")) {
            throw new InvalidShoppingException("Error: Quantity harus berupa angka bulat lebih dari 0!");
        }
    }

    public static void validatePriceRegex(String price) throws InvalidShoppingException {
        if (!price.matches("^[0-9]+(\\.[0-9]+)?$") || Double.parseDouble(price) <= 0) {
            throw new InvalidShoppingException("Error: Harga harus berupa angka valid dan lebih dari 0!");
        }
    }
}
