import java.util.ArrayList;
import java.util.Scanner;

class Main{
    static ArrayList<Electricity> customers=new ArrayList<>();
    static void calculateHighest(){
        double highest= 0;
        int houseNo=0;

        for (Electricity customer: customers){
            if(customer.totalPrice>highest){
                highest = customer.totalPrice;
                houseNo=customer.houseNo;
            }
        }
        System.out.println("The highest payable amt is :"+highest +"\nand should be paid by houseNo: "+houseNo);
    }

    public static void main(String[] args) {
        boolean choice  =true;

        Scanner input = new Scanner(System.in);


        while(choice){
            System.out.print("Enter House Number: ");
            int houseNo = Integer.parseInt(input.nextLine());

            System.out.print("Enter Customer Name: ");
            String name = input.nextLine();

            System.out.print("Enter Units Used: ");
            double unit = Double.parseDouble(input.nextLine());

            Electricity customer = new Electricity(houseNo, name, unit);
            customer.displayDetails();

            customers.add(customer);


            System.out.println("Calculate for another customer? (Y/N)");
            char userChoice=input.nextLine().charAt(0);
            if (userChoice!='Y') {
                choice=false;
            }



        }
        calculateHighest();


    }
}