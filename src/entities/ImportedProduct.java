package entities;

import java.util.ArrayList;
import java.util.List;

public class ImportedProduct extends Product {

	private Double customsFree;
	
	List<ImportedProduct> impProduct = new ArrayList<>(); 
  
	public  ImportedProduct() {
		super();
	}
	
	public ImportedProduct(String name,Double price,Double customsFree) {
		super(name,price);
		
		this.customsFree=customsFree;	
	}

	public Double getCustomsFree() {
		return customsFree;
	}

	public void setCustomsFree(Double customsFree) {
		this.customsFree = customsFree;
	}
	
	public Double Totalprice() {
		
		return super.getPrice() + customsFree;
		
	}
	
	@Override
	public String priceTag() {
		
		return "Name: "+ super.getName() +" $"+String.format(" %.2f ",Totalprice())+"(Customs free: $ "+ String.format("%.2f",getCustomsFree())+")";
	}
	
}
