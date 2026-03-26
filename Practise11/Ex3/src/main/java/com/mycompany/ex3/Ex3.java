/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex3;

/**
 *
 * @author Admin
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() { return name; }
    public double getSalary() { return salary; }
}

public class Ex3 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Anh", 1200),
            new Employee(2, "Binh", 800),
            new Employee(3, "Dung", 1500),
            new Employee(4, "Cuong", 900)
        );

        List<String> highSalaryNames = employees.stream()
            .filter(e -> e.getSalary() > 1000)      
            .map(Employee::getName)                
            .sorted()                             
            .collect(Collectors.toList());         

        System.out.println("Danh sach nhan vien luong > 1000 (da sap xep):");
        highSalaryNames.forEach(System.out::println);
    }
}