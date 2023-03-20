
import java.io.*;
import java.util.Scanner;

public class Task_1 {
    public static void initialise(String pump[]) { //Initializing array
        for (int a = 0; a < 6; a++ ){
            pump[a] = "No Customers";
        }
    }
    public static void vfq(String[] pump){
        for(int b = 0; b < 6; b++){
            System.out.println(pump[b]);
        }
    }
    public static int add(String pump[] ,int x) {
        Scanner meth = new Scanner(System.in);
        if (x>=6){
            System.out.println("The Queue is full/nPlease select another pump: ");
        }
        else{
            System.out.println("Enter the customer name:");
            String name = meth.nextLine();
            pump[x] = name;
        }
        return x;
    }
    public static void empty(int n){
        for (int c = 0; c<7; c++){
            if (c>n){
                System.out.println("Queues"+ c);
            }
        }
    }
    public static void delete(String delete[] , String name){
        for(int c = 0; c<6; c++){
            if(delete[c].equals(name)){
                delete[c]="No Customer";
            }
        }
    }
    public static void delete2(String delete[] ){
        delete[0]="No Customer";
    }
    public static void craetefile(String Pump_a[],String Pump_b[],String Pump_c[]){
        try {
            BufferedWriter writer= new BufferedWriter(new FileWriter("Fuel_Queues_Details.txt")); //Creating a file
            writer.write("---Customers Details---\n");
            writer.write("---First_pump---");//Input data into  the file
            for (int c = 0; c<6; c++){
                int x=0;
                x = c+1;
                writer.write("\ncustomer nub."+ x + Pump_a[c] );
            }
            writer.write("\n---Second_pump---");
            for (int c = 0; c<6; c++){
                int x=0;
                x = c+1;
                writer.write("\ncustomer nub."+ x + Pump_b[c] );
            }
            writer.write("\n---Third_pump---");
            for (int c = 0; c<6; c++){
                int x=0;
                x = c+1;
                writer.write("\ncustomer nub."+ x + Pump_c[c] );
            }
            writer.close();
        }catch (IOException e){  //handling errors
            e.printStackTrace();
        }
    }

    public static void read(){
        try {
            BufferedReader reader= new BufferedReader(new FileReader("Fuel_Queues_Details.txt"));
            String line;
            while ((line=reader.readLine()) != null){  //Reading the file line by line
                System.out.println(line);
            }
            reader.close();
        }catch (IOException e){       //handling the errors
            e.printStackTrace();
        }
    }
    public static void sort(String[] pump_1,String[] pump_2 ,String[] pump_3){  //https://www.javatpoint.com/how-to-sort-an-array-in-java
        Scanner sc= new Scanner(System.in);//sorting customers name in alphabetical order
        try{
            System.out.print("Input the Queue number to sort :");
            int queue_no=sc.nextInt();
            if (queue_no==1){
                int n=6;
                String sorted;
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (pump_1[i].compareTo(pump_1[j]) > 0) {
                            sorted = pump_1[i];
                            pump_1[i] = pump_1[j];
                            pump_1[j] = sorted;
                        }
                    }
                }
                for (int i = 0; i < n; i++) {
                    System.out.println(pump_1[i]);
                }
                System.out.println(" ");
            } else if (queue_no==2) {
                int n=6;
                String sorted;
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (pump_2[i].compareTo(pump_2[j]) > 0) {
                            sorted = pump_2[i];
                            pump_2[i] = pump_2[j];
                            pump_2[j] = sorted;
                        }
                    }
                }
                for (int i = 0; i < n; i++) {
                    System.out.println(pump_2[i]);
                }
                System.out.println(" ");

            } else if (queue_no==3) {
                int n=6;
                String sorted;
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (pump_3[i].compareTo(pump_3[j]) > 0) {
                            sorted = pump_3[i];
                            pump_3[i] = pump_3[j];
                            pump_3[j] = sorted;
                        }
                    }
                }
                for (int i = 0; i < n; i++) {
                    System.out.println(pump_3[i]);
                    
                }
                System.out.println(" ");

            }else {
                System.out.println("Invalid queue number!!!");
            }
        }catch (Exception e){
            System.out.println("Enter a Integer!");
        }

    }
    public static void main(String[] args) {
        String choice;
        int x = 0;
        int y = 0;
        int z = 0;
        int custnub = 0;
        int fuel = 6600;
        Scanner inputs = new Scanner(System.in);
        String [] Pump_a = new String [6];   //Creating a array
        String [] Pump_b = new String [6];   //Creating a array
        String [] Pump_c = new String [6];   //Creating a array
        initialise(Pump_a);
        initialise(Pump_b);
        initialise(Pump_c);
        do{
            System.out.println("      Hello! Welcome to the Fuel Management system");
            System.out.println("-----------------------------------");
            if (fuel<=500){
                System.out.println("\nWarning ! Fuel limit is reached to 500 liters. ");
            }
            System.out.println("----------------------MAIN OPTIONS----------------------");
            System.out.println("100 or VFQ: View all Fuel Queues ");
            System.out.println("101 or VEQ: View all Empty Queues ");
            System.out.println("102 or ACQ: Add customer to a Queue ");
            System.out.println("103 or RCQ: Remove a customer from a Queue ");
            System.out.println("104 or PCQ: Remove a served customer ");
            System.out.println("105 or VCS: View Customers Sorted in alphabetical order ");
            System.out.println("106 or SPD: Store Program Data into file ");
            System.out.println("107 or LPD: Load Program Data from file ");
            System.out.println("108 or STK: View Remaining Fuel Stock ");
            System.out.println("109 or AFS: Add Fuel Stock ");
            System.out.println("999 or EXT: Exit the Program ");
            System.out.println("\nEnter your option to continue : ");
            choice = inputs.nextLine();
            switch (choice) {
                //Viewing all Fuel Queues.
                case "100":
                case "VFQ":
                    System.out.println("All Fuel Queues");
                    System.out.println("---First_pump---");
                    vfq(Pump_a);
                    System.out.println("---Second_pump---");
                    vfq(Pump_b);
                    System.out.println("---Third_pump---");
                    vfq(Pump_c);
                    break;
                //Viewing all Empty Queues.
                case "101":
                case "VEQ":
                    System.out.println("All Empty Queues");
                    System.out.println("---First_pump---");
                    empty(x);
                    System.out.println("---Second_pump---");
                    empty(y);
                    System.out.println("---Third_pump---");
                    empty(z);
                    break;
                //Adding customer to a Queue.
                case "102":
                case "ACQ":
                    while (true){
                        System.out.println("Select your pump number! ");
                        int pnumber = inputs.nextInt();
                        if (pnumber == 1) {
                            add(Pump_a, x);
                            x += 1;
                            custnub += 1;
                        } else if (pnumber == 2) {
                            add(Pump_b, y);
                            y += 1;
                            custnub += 1;
                        } else if (pnumber == 3) {
                            add(Pump_c, z);
                            z += 1;
                            custnub += 1;
                        } else {
                            System.out.println("please enter the correct number");
                            continue;
                        }break;
                    }
                    break;
                //Removing a customer from a Queue.
                case "103":
                case "RCQ":
                    while (true){
                        System.out.println("Enter customer name:");
                        String cusname = inputs.nextLine();
                        System.out.println("Enter pump no:");
                        int pnom = inputs.nextInt();
                        if (pnom == 1){
                            delete(Pump_a,cusname);
                        } else if (pnom == 2) {
                            delete(Pump_b,cusname);
                        } else if (pnom == 3) {
                            delete(Pump_c,cusname);
                        } else{
                            System.out.println("please enter the correct number");
                            continue;
                        }break;
                    }System.out.println("Deletion successful.\n");
                    break;
                //Removing a served customer.
                case "104":
                case "PCQ":
                    System.out.println("Enter pump no:");
                    int pumpno = inputs.nextInt();
                    if (pumpno == 1){
                        delete2(Pump_a);
                    } else if (pumpno == 2) {
                        delete2(Pump_b);
                    } else if (pumpno == 3) {
                        delete2(Pump_c);
                    } else{
                        System.out.println("please enter the correct number");
                    }
                    System.out.println("Deletion successfull.\n");
                    System.out.println("Removed a served customer");
                    break;
                //Viewing Customers Sorted in alphabetical order.
                case "105":
                case "VCS":
                    System.out.println("Customers in alphabetical order");

                    sort(Pump_a,Pump_b,Pump_c);
                    break;
                //Storing Program Data into file.
                case "106":
                case "SPD":
                    craetefile(Pump_a,Pump_b,Pump_c);
                    System.out.println("Successfully stored Data into the file");
                    break;
                //Loading Program Data from file.
                case "107":
                case "LPD":
                    System.out.println("Load Program Data from the file");
                    read();
                    break;
                //Viewing Remaining Fuel Stock.
                case "108":
                case "STK":
                    fuel = fuel-(custnub*10);
                    System.out.println("Available Fuel Stock is:"+fuel +"liters");
                    break;
                //Adding Fuel Stock.
                case "109":
                case "AFS":
                    System.out.println("Input the new fuel Stock:");
                    int nstock = inputs.nextInt();
                    fuel = fuel+nstock;
                    System.out.println("All fuel stock is :" + fuel + "liters");
                    break;
                // Exiting the program.
                case "999":
                case "EXIT":
                    choice="999";
                    break;
                default:
                    break;
            }
        }while(!choice.equals("999"));

    }
}
