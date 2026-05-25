package com.indivaragroup.inheritance.exam.company.organization.management;

import com.indivaragroup.inheritance.exam.company.organization.dto.ApplicantDTO;
import com.indivaragroup.inheritance.exam.company.organization.exception.InvalidRegistrationException;
import java.lang.reflect.Field;

public class RegistrationValidator {

    public static void validate(ApplicantDTO applicant) throws InvalidRegistrationException {
        try {
            Class<?> clazz = applicant.getClass();

            Field nameField = clazz.getDeclaredField("name");
            Field ageField = clazz.getDeclaredField("age");
            Field roleField = clazz.getDeclaredField("role");

            nameField.setAccessible(true);
            ageField.setAccessible(true);
            roleField.setAccessible(true);

            String name = (String) nameField.get(applicant);
            int age = (int) ageField.get(applicant);
            String role = (String) roleField.get(applicant);

            if (name == null || name.trim().isEmpty() || name.length() < 5) {
                throw new InvalidRegistrationException("Nama kosong atau kurang dari 5 karakter!");
            }

            if (role == null || role.trim().isEmpty()) {
                throw new InvalidRegistrationException("Role yang dilamar tidak boleh kosong!");
            }

            if (age < 20) {
                throw new InvalidRegistrationException("Umur tidak boleh di bawah 20 tahun!");
            }

            if (age > 35) {
                throw new InvalidRegistrationException("Umur tidak boleh melebihi 35 tahun!");
            }

            if (role.equalsIgnoreCase("JAVA DEVELOPER") && age < 20) {
                throw new InvalidRegistrationException("Khusus role JAVA DEVELOPER, umur minimal wajib 20 tahun!");
            }

        } catch (NoSuchFieldException | IllegalAccessException e) {
            System.out.println("Sistem Error (Reflection): " + e.getMessage());
        }
    }
}