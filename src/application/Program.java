package application;
import model.entities.Company;
import model.entities.Individual;
import model.entities.TaxPayer;


import java.util.*;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<TaxPayer> tp = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of tax players: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            {
                System.out.println("Tax payer #" + i + " data:");
                System.out.print("Invidual or company (i/c)?");
                char choose = sc.next().charAt(0);
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.next();
                sc.nextLine();
                System.out.print("Anual income: ");
                double anualincome = sc.nextDouble();
                if (choose == 'i') {
                    System.out.print("Health expenditures: ");
                    double healthex = sc.nextDouble();
                    tp.add(new Individual(name, anualincome, healthex));
                }
                if (choose == 'c') {
                    System.out.print("Number of employees: ");
                    int number = sc.nextInt();
                    tp.add(new Company(name, anualincome, number));
                }
            }
        }
        System.out.println();
        System.out.println("TAXES PAID");
        Double x =0.0;
            for (TaxPayer list : tp) {

                System.out.print(list.getName()+ " $ "+ String.format("%.2f ", list.Tax()));
                x += list.Tax();

            }
        System.out.println();
        System.out.printf("TOTAL TAXAS %.2f",x);



    }
}




