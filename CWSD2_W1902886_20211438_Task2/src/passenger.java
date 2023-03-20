import java.io.*;
import java.util.Scanner;

public class passenger {
    public static void initialise(FuelQueue pump[]) { //Initializing array
        for (int a = 0; a < 6; a++ ){
            pump[a] = new FuelQueue();
        }
    }
    public static FuelQueue [] vfq(FuelQueue pump[]){
        for(int b = 0; b < 6; b++){
            System.out.println(pump[b].First_name[b]);
        }
        return pump;
    }
    public static FuelQueue [] add(FuelQueue pump[] ,int x) {
                int y = pump[x].setname("No customer");
                if (y == 0){
                    pump[x].setSecond_name("No customer");
                    pump[x].setvehicle_no();
                    pump[x].setNoliter();
                    System.out.println("Customer added successfully ");
                }
        return pump;
    }
    public static void empty(int n){
        for (int c = 0; c<6; c++){
            if (c>=n){
                System.out.println("Queues"+ c++);
            }
        }
    }
    public static FuelQueue [] delete(FuelQueue delete[] , String name){
        for(int c = 0; c<6; c++){
            if(delete[c].First_name[c].equals(name)){
                delete[c].First_name[c]="No customer";
            }
        }
        return delete;
    }
    public static FuelQueue [] delete2(FuelQueue delete[] ){
        delete[0].First_name[0]="No customer";
        return delete;
    }
    public static FuelQueue [] craetefile(FuelQueue Pump_a[],FuelQueue Pump_b[],FuelQueue Pump_c[],FuelQueue Pump_d[],FuelQueue Pump_e[]){
        try {
            BufferedWriter writer= new BufferedWriter(new FileWriter("Queues_Details.txt")); //Create a file
            writer.write("---Customers Details---\n");
            writer.write("---First_pump---");//Input data into the file
            for (int c = 0; c<6; c++){
                int x=0;
                x = c+1;
                writer.write("\ncustomer no."+ x + Pump_a[c].First_name[c] );
            }
            writer.write("\n---Second_pump---");//Input data into the file
            for (int c = 0; c<6; c++){
                int x=0;
                x = c+1;
                writer.write("\ncustomer no."+ x + Pump_b[c].First_name[c] );
            }
            writer.write("\n---Third_pump---");//Input data into the file
            for (int c = 0; c<6; c++){
                int x=0;
                x = c+1;
                writer.write("\ncustomer no."+ x + Pump_c[c].First_name[c] );
            }
            writer.write("\n---Fourth_pump---");//Input data into the file
            for (int c = 0; c<6; c++){
                int x=0;
                x = c+1;
                writer.write("\ncustomer no."+ x + Pump_d[c].First_name[c] );
            }
            writer.write("\n---Fifth_pump---");//Input data into the file
            for (int c = 0; c<6; c++){
                int x=0;
                x = c+1;
                writer.write("\ncustomer no."+ x + Pump_e[c].First_name[c] );
            }
            writer.close();
        }catch (IOException e){  //handling errors
            e.printStackTrace();
        }
        return Pump_a;
    }
    public static void read(){
        try {
            BufferedReader reader= new BufferedReader(new FileReader("Queues_Details.txt"));
            String line;
            while ((line=reader.readLine()) != null){  //Reading the file line by line
                System.out.println(line);
            }
            reader.close();
        }catch (IOException e){       //handling errors
            e.printStackTrace();
        }
    }
    public static FuelQueue[] sort(FuelQueue[] pump_1,FuelQueue[] pump_2,FuelQueue[] pump_3,FuelQueue[] pump_4 ,FuelQueue[] pump_5){   //https://www.javatpoint.com/how-to-sort-an-array-in-java
        Scanner sc= new Scanner(System.in);//sorting customers name in alphabetical order
        try{
            System.out.print("Enter Queue number to sort :");
            int queue_no=sc.nextInt();
            if (queue_no==1){
                int n=6;
                String temp;
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (pump_1[i].First_name[i].compareTo(pump_1[j].First_name[j]) > 0){
                            temp = pump_1[i].First_name[i];
                            pump_1[i] = pump_1[j];
                            pump_1[j].First_name[j] = temp;
                        }
                    }
                }
                for (int i = 0; i < n; i++) {
                    System.out.println(pump_1[i]);
                }
                System.out.println(" ");
            } else if (queue_no==2) {
                int n=6;
                String temp;
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (pump_2[i].First_name[i].compareTo(pump_2[j].First_name[j]) > 0) {
                            temp = pump_2[i].First_name[i];
                            pump_2[i] = pump_2[j];
                            pump_2[j].First_name[j] = temp;
                        }
                    }
                }
                for (int i = 0; i < n; i++) {
                    System.out.println(pump_2[i]);
                }
                System.out.println(" ");

            } else if (queue_no==3) {
                int n=6;
                String temp;
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (pump_3[i].First_name[i].compareTo(pump_3[j].First_name[j]) > 0) {
                            temp = pump_3[i].First_name[i];
                            pump_3[i] = pump_3[j];
                            pump_3[j].First_name[j] = temp;
                        }
                    }
                }
                for (int i = 0; i < n; i++) {
                    System.out.println(pump_3[i]);
                }
                System.out.println(" ");

            } else if (queue_no==4) {
                int n=6;
                String temp;
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (pump_4[i].First_name[i].compareTo(pump_4[j].First_name[j]) > 0) {
                            temp = pump_3[i].First_name[i];
                            pump_3[i] = pump_3[j];
                            pump_3[j].First_name[j] = temp;
                        }
                    }
                }
                for (int i = 0; i < n; i++) {
                    System.out.println(pump_3[i]);
                }
                System.out.println(" ");

            } else if (queue_no==5) {
                int n=6;
                String temp;
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (pump_5[i].First_name[i].compareTo(pump_5[j].First_name[j]) > 0) {
                            temp = pump_3[i].First_name[i];
                            pump_3[i] = pump_3[j];
                            pump_3[j].First_name[j] = temp;
                        }
                    }
                }
                for (int i = 0; i < n; i++) {
                    System.out.println(pump_3[i]);
                }
                System.out.println(" ");

            }
            else {
                System.out.println("Invalid queue number!!!");
            }
        }catch (Exception e){
            System.out.println("Enter a Integer!");
        }

        return new FuelQueue[0];
    }
    public static void main(String[] args) {
        String choice;
        int x =0,d = 0,f = 0,y=0,z = 0;
        int custnub = 0;
        int fuel = 6000;
        Scanner inputs = new Scanner(System.in);
        FuelQueue [] Pump_a = new FuelQueue [6];   //Creating a array
        FuelQueue [] Pump_b = new FuelQueue [6];   //Creating a array
        FuelQueue [] Pump_c = new FuelQueue [6];   //Creating a array
        FuelQueue [] Pump_d = new FuelQueue [6];   //Creating a array
        FuelQueue [] Pump_e = new FuelQueue [6];   //Creating a array
        initialise(Pump_a);
        initialise(Pump_b);
        initialise(Pump_c);
        initialise(Pump_d);
        initialise(Pump_e);
        do{
            System.out.println("      Hello! Welcome to the Fuel Management system");
            System.out.println("-----------------------------------");
            if (fuel <= 500){
                System.out.println("\nWarning!Fuel limit is reached to 500 liters.");
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
            System.out.println("110 or IFQ: Income of each Fuel queue ");
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
                    System.out.println("---Fourth_pump---");
                    vfq(Pump_d);
                    System.out.println("---Fifth_pump---");
                    vfq(Pump_e);
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
                    System.out.println("---Fourth_pump---");
                    empty(f);
                    System.out.println("---Fifth_pump---");
                    empty(d);
                    break;
                //Adding customer to a Queue.
                case "102":
                case "ACQ":
                    while (true){
                        System.out.println("Select your pump number! ");
                        try{
                            int number = inputs.nextInt();
                            if (number == 1) {
                                add(Pump_a, x);
                                x += 1;
                                custnub += 1;
                            } else if (number == 2) {
                                add(Pump_b, y);
                                y += 1;
                                custnub += 1;
                            } else if (number == 3) {
                                add(Pump_c, z);
                                z += 1;
                                custnub += 1;
                            } else if (number == 4) {
                                add(Pump_d,f);
                                f += 1;
                                custnub += 1;
                            } else if (number == 5) {
                                add(Pump_e, d);
                                d += 1;
                                custnub += 1;
                            } else {
                                System.out.println("please enter the correct number");
                                continue;
                            }break;
                        }catch (Exception e){
                            System.out.println("Invalid Input ");
                        }
                    }
                    break;
                //Removing a customer from a Queue.
                case "103":
                case "RCQ":
                    while (true){
                        System.out.println("Enter customer name:");
                        String cusname = inputs.nextLine();
                        System.out.println("Enter pump no(1 to 5):");
                        int pnom = inputs.nextInt();
                        if (pnom == 1){
                            delete(Pump_a,cusname);
                        } else if (pnom == 2) {
                            delete(Pump_b,cusname);
                        } else if (pnom == 3) {
                            delete(Pump_c, cusname);
                        } else if (pnom == 4) {
                            delete(Pump_d,cusname);
                        } else if (pnom == 5) {
                            delete(Pump_e, cusname);
                        }
                        else{
                            System.out.println("please enter the correct number");
                            continue;
                        }break;
                    }System.out.println("Removing successfull.\n");
                    break;
                //Removing a served customer.
                case "104":
                case "PCQ":
                    System.out.println("Enter pump no:");
                    int pnum = inputs.nextInt();
                    if (pnum == 1){
                        delete2(Pump_a);
                    } else if (pnum == 2) {
                        delete2(Pump_b);
                    } else if (pnum == 3) {
                        delete2(Pump_c);
                    } else{
                        System.out.println("please enter the correct number");
                    }
                    System.out.println("Removing successfull.\n");
                    System.out.println("Removed a served customer");
                    break;
                //Viewing Customers Sorted in alphabetical order.
                case "105":
                case "VCS":
                    System.out.println("Customers in alphabetical order");
                    sort(Pump_a,Pump_b,Pump_c,Pump_d,Pump_e);
                    break;
                //Storing Program Data into file.
                case "106":
                case "SPD":
                    craetefile(Pump_a,Pump_b,Pump_c,Pump_d,Pump_e);
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
                    System.out.println("Input the new fuel Stock");
                    int nstock = inputs.nextInt();
                    fuel = fuel+nstock;
                    System.out.println("All fuel stock is :" + fuel + "liters");
                    break;
                    // printing the income of each Fuel queue
                case "110":
                case "IFQ":
                    System.out.println("Income of First_pump is- Rs:" + x*430.00);
                    System.out.println("Income of Second_pump is- Rs:" + y*430.00);
                    System.out.println("Income of Third_pump is- Rs:" + z*430.00);
                    System.out.println("Income of Fourth_pump is- Rs:" + f*430.00);
                    System.out.println("Income of Fifth_pump is- Rs:" + d*430.00);
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