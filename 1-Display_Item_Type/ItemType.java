import java.util.Scanner;
public class ItemType {
    private String name;
    private Double costPerDay;
    private Double deposit;
    public String getName() {
        return name;
    }

    public Double getCostPerDay() {
        return costPerDay;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setCostPerDay(Double costPerDay) {
        this.costPerDay = costPerDay;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void display(){
        System.out.println("Item type details");
        System.out.println("Name : "+getName());
        System.out.println("CostPerDay : "+getCostPerDay());
        System.out.println("Deposit : "+getDeposit());

    }


}