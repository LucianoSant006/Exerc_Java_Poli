package model.entities;

public class Individual extends TaxPayer {


    private Double heathExpenditures;


    public Individual(String name, Double currentincome,Double heathExpenditures) {
        super(name, currentincome);
        this.heathExpenditures = heathExpenditures;
    }

    public Double getHeathExpenditures() {
        return heathExpenditures;
    }

    public void setHeathExpenditures(Double heathExpenditures) {
        this.heathExpenditures = heathExpenditures;
    }

    @Override
    public Double Tax() {
        if(super.getCurrentincome() < 20.000){
            return getCurrentincome() * 0.15;
        } else{

            return getCurrentincome()* 0.25  - heathExpenditures * 0.5;
        }

    }
}
