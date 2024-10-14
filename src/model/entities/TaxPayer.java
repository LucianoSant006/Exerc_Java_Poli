package model.entities;

public abstract class  TaxPayer{
    private String name;
    private Double currentincome;

    public TaxPayer(String name, Double currentincome){
        this.name = name;
        this.currentincome = currentincome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCurrentincome() {
        return currentincome;
    }

    public void setCurrentincome(Double currentincome) {
        this.currentincome = currentincome;
    }

    public abstract Double Tax();
}