package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsouceEmployee;

public class Program {

    public static void main(String[] args) {
    	Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

      
        List<Employee> list = new ArrayList<>();

        
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter #" + i + " data:");
            sc.nextLine(); 
            System.out.print("Outsourced (y/n): ");
            char choose = sc.next().charAt(0);

         
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Hours: ");
            int hours = sc.nextInt();

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

         
            if (choose == 'y' || choose == 'Y') {
                System.out.print("Additional charge: ");
                double addCharge = sc.nextDouble();
                list.add(new OutsouceEmployee(name, hours, valuePerHour, addCharge));
            } else {
                list.add(new Employee(name, hours, valuePerHour));
            }
        }

        
        System.out.println();
        System.out.println("PAYMENTS:");
        for (Employee emp : list) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }

        sc.close(); 
    }
}
