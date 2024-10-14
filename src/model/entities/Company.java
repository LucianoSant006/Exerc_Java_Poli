package model.entities;

public class Company extends TaxPayer {

    private Integer numberOfEmployee;

    public Company(String name, Double currentincome, Integer numberOfEmployee) {
        super(name, currentincome);
        this.numberOfEmployee = numberOfEmployee;
    }

    public Integer getNumberOfEmployee() {
        return numberOfEmployee;
    }

    public void setNumberOfEmployee(Integer numberOfEmployee) {
        this.numberOfEmployee = numberOfEmployee;
    }

    @Override
    public Double Tax() {
        if(numberOfEmployee > 10){
            return getCurrentincome() * 0.14;
        }
        return getCurrentincome() * 0.16;

    }
}