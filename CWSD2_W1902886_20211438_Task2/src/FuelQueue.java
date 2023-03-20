import java.util.Scanner;

public class FuelQueue {
    String [] First_name = {"No Customers","No Customers","No Customers","No Customers","No Customers","No Customers"};
    String [] Second_name = {"No Customers","No Customers","No Customers","No Customers","No Customers","No Customers"};
    int [] vehicle_no = new int[6];
    int [] No_of_Liters = new int[6];

    public int setname (String empty) {
        Scanner input = new Scanner(System.in);
        for (int n=0; n< First_name.length; n++){
            if (First_name[n]=="No Customers"){
                //Entering the name
                System.out.println("Enter the first name of the passenger : ");
                String name = input.next();
                First_name[n] = name;
                return 0;
            }
        }
        System.out.println("This pump is full....Please enter a new pump!!!!!");
        return 1;
    }

    public void setSecond_name (String empty){
        Scanner input = new Scanner(System.in);
        for (int n=0; n< Second_name.length; n++){
            if (Second_name[n]=="No Customers"){
                System.out.println("Enter the second name of the passenger : ");
                String name = input.next();
                Second_name[n] = name;
                return;
            }
        }
    }

    public void setvehicle_no (){
        Scanner input = new Scanner(System.in);
        for (int n=0; n< vehicle_no.length; n++){
            //Entering the vehicle number
            if (vehicle_no[n]==0){
                System.out.println("Enter the vehicle number : ");
                int no = input.nextInt();
                vehicle_no[n] = no;
                return;
            }
        }
    }

    public void setNoliter () {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < No_of_Liters.length; i++) {
            //Entering the required number of liters
            if (No_of_Liters[i] == 0) {
                System.out.println("Enter the required no of liters : ");
                int no = input.nextInt();
                No_of_Liters[i] = no;
                return;
            }
        }
    }
}
