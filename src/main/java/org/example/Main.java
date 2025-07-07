package org.example;
import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        Healthplan hp1 = new Healthplan(1, "Çalışan Planı", Plan.BASIC);

        System.out.println("Plan adı: " + hp1.getName());
        System.out.println("Plan türü: " + hp1.getPlan().getName());
        System.out.println("Plan ücreti: $" + hp1.getPlan().getPrice());

        System.out.println(hp1);

        String[] plans = new String[2];
        Employee emp1 = new Employee(1001,"Ali Veli","aliveli@example.com","12345",plans);
        emp1.addHealthPlan(0, "Basic Plan");
        emp1.addHealthPlan(0, "Premium Plan");
        emp1.addHealthPlan(3, "Out of bounds");

        System.out.println(emp1);


        Company company = new Company(10, "TechStars", -15000, new String[3]);
        company.addEmployee(0, "Ali Veli");
        company.addEmployee(0, "Mehmet");
        company.addEmployee(5, "Fatma");

        System.out.println(company);
    }
}