import java.util.ArrayList;

public class Electricity {

    int houseNo;
    String customerName;
    double unit;
    double totalPrice;

    private static ArrayList<Electricity> customers = new ArrayList<>();


    static void addCustomers(Electricity customer){
        customers.add(customer);
    }

    static Electricity calculateHighest(){
        double highest= 0;
        Electricity billRecord=null;


        for (Electricity customer: customers){
            if(customer.totalPrice>highest){
                highest = customer.totalPrice;
                billRecord=customer;

            }
        }

        return billRecord;
    }

    public Electricity(int houseNo, String customerName, double unit){
        this.houseNo=houseNo;
        this.customerName=customerName;
        this.unit=unit;
        this.totalPrice =calculatePrice();
    }

     double calculatePrice(){
        double unitOfCustiomer=this.unit;
        double totalPrice=0;
        if (unitOfCustiomer>=10){
            totalPrice=100;
            unitOfCustiomer-=10;
        }
        else{
            totalPrice=unitOfCustiomer*10;
            unitOfCustiomer=0;
        }
        if(unitOfCustiomer>=20){
            totalPrice+=250;
            unitOfCustiomer-=20;
        }
        else {
            totalPrice+=unitOfCustiomer*12.5;
            unitOfCustiomer=0;
        }
        if(unitOfCustiomer>0){
            totalPrice+=unitOfCustiomer*2;
        }
        return totalPrice;

    }
    void displayDetails() {
        System.out.println("\n----- Customer Details -----");
        System.out.println("House Number: " + houseNo);
        System.out.println("Name : " + customerName);
        System.out.println("Units Used : " + unit);
        System.out.println("Total Price : Rs. " + totalPrice);
    }

}
