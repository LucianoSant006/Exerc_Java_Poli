package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Application {

	public static void main(String[] args) throws ParseException {
	  Locale.setDefault(Locale.US);
	  Scanner sc = new Scanner(System.in);
	  
	  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	  List<Product> prod= new ArrayList<>();
	   
	   System.out.print("Enter the number of products: ");
	   int n = sc.nextInt();
	   for(int i =1; i <= n;i++) {
		   
		   System.out.println("Prouct #"+i+" data:");
		   sc.nextLine();
		   System.out.print("Commom, used or imported (c/u/i)? ");
		   char choose = sc.next().charAt(0);
		   sc.nextLine();
		   System.out.print("Name: ");
		   String name = sc.next();
		   sc.nextLine();
		   System.out.print("Price: ");
		   double price =sc.nextDouble();
		   
		   
		   if(choose == 'i') {
			   
			System.out.print("Customs free: ");
			double customsFree = sc.nextDouble();
			prod.add(new ImportedProduct(name, price, customsFree));
		   }
		   else if(choose =='u') {
			 System.out.print("Manufacture date (DD/MM/YYYY): ");
			 Date dt = sdf.parse(sc.next());
			 prod.add(new UsedProduct(name, price, dt));
			   
		   }else if( choose == 'c'){
				   
			   prod.add(new Product(name, price));
		   }
		  
	   }
	   System.out.println();
	   System.out.println("PRICE TAGS:");
	   for(Product x : prod){
		   
			  System.out.println(x.priceTag());
			  
		   }
	   sc.close();

	}

}
