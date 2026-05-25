package com.indivaragroup.inheritance.exam.company.organization;

import com.indivaragroup.inheritance.exam.company.organization.dto.ApplicantDTO;
import com.indivaragroup.inheritance.exam.company.organization.employee.Employee;
import com.indivaragroup.inheritance.exam.company.organization.exception.InvalidRegistrationException;
import com.indivaragroup.inheritance.exam.company.organization.management.EmployeeManagement;
import com.indivaragroup.inheritance.exam.company.organization.management.RegistrationValidator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CompanyRegistration {
    public void runRegistration() {
        Scanner scanner = new Scanner(System.in);
        EmployeeManagement management = new EmployeeManagement();

        System.out.println("=================================================");
        System.out.println("      FORM PENDAFTARAN KARYAWAN PT JDT 17        ");
        System.out.println("=================================================");

        try {
            System.out.print("Masukkan Nama Lengkap  : ");
            String name = scanner.nextLine();

            System.out.print("Masukkan Umur          : ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Masukkan Role Dilamar  : ");
            String role = scanner.nextLine();

            ApplicantDTO newApplicant = new ApplicantDTO(name, age, role);

            System.out.println("\n[SISTEM] Memproses validasi data menggunakan Reflection...");

            RegistrationValidator.validate(newApplicant);

            Employee acceptedEmployee = management.createEmployeeFromDto(newApplicant);

            System.out.println("\n PENDAFTARAN BERHASIL!");
            System.out.println("Berikut adalah detail karyawan baru:");
            System.out.println("-------------------------------------------------");
            System.out.println(acceptedEmployee.toString());
            System.out.println("-------------------------------------------------");

        } catch (InputMismatchException e) {
            System.out.println("\n ERROR: Input umur harus berupa angka!");
        } catch (InvalidRegistrationException e) {
            System.out.println("\n VALIDASI GAGAL: " + e.getMessage());
        } finally {
            System.out.println("=================================================");
            System.out.println("             TASK 1 SELESAI                      ");
            System.out.println("=================================================\n");
        }
    }
}
