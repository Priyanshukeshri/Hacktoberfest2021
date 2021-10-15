/*
 *  2) Define a class Battery having data field: level which indicate its energy level. When an 
       object is instantiated it has 100 units battery level. The class must implement the following methods: 
        •  A default constructor 
        •  showLevel() method to show the current battery level. 
        •  sendMsg() method is used to consume 2 units of battery on each call 
        •  recvMsg() method is used to consume 1 unit of battery on each call 
        •  compute() method consumes 1.5 unit of battery on each call 
        •  recharge(minutes) method update the battery level , 1 unit per  2 minutes. 
        Implement all the above question using an appropriate menu-driven program.  
 */




import java.util.*;
public class Main {
    public static class Battery {
        double energy;

        Battery() {
            energy = 100;
        }

        void showLevel() {
            System.out.println("Your Current  battery level is " + energy);
        }

        void sendMsg() {
            System.out.println("Message sent: 2 unit consumed");
            energy -= 2.0;
        }

        void recvMsg() {
            System.out.println("Message received: 1 unit consumed");
            energy -= 1.0;
        }

        void compute() {
            System.out.println("Computed: 1.5 unit consumed");
            energy -= 1.5;
        }

        void recharge(int minutes) {
            energy += minutes / 2.0;
            if (energy >= 100)
                energy = 100;
            System.out.println("Battery recharged");
        }
    }

    public static void main(String[] args) {
        int minutes, choice;
        Battery b = new Battery();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to show battery level");
        System.out.println("Enter 2 to send message");
        System.out.println("Enter 3 to receive message");
        System.out.println("Enter 4 to compute");
        System.out.println("Enter 5 to recharge");
        System.out.println("Enter 0 to exit");
        choice = sc.nextInt();
        while (choice != 0) {
            switch (choice) {
                case 1:
                    b.showLevel();
                    break;
                case 2:
                    b.sendMsg();
                    break;
                case 3:
                    b.recvMsg();
                    break;
                case 4:
                    b.compute();
                    break;
                case 5:
                    
                    System.out.println("How many minutes do you want to charge?");
                    minutes = sc.nextInt();
                    b.recharge(minutes);
                    break;
            }
            choice = sc.nextInt();
        }
    }
}
