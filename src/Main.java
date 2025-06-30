
import java.util.Scanner;

class Main{



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

            Electricity.addCustomers(customer);


            System.out.println("Calculate for another customer? (Y/N)");
            char userChoice=input.nextLine().charAt(0);
            if (userChoice!='Y') {
                choice=false;
            }



        }
        Electricity.calculateHighest();


    }
}