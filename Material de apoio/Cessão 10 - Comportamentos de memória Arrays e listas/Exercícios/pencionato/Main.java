package pencionato;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Room[] rooms = new Room[10];

        for(int i =0; i<10; i++){
            rooms[i] = new Room(i);
        };

        System.out.print("How many rooms will be rented? ");
        int qtdeQuartos = sc.nextInt(); sc.nextLine();

        for(int i=0; i < qtdeQuartos; i++){
            System.out.printf("Rent #%d\n", i+1);
            System.out.print("Mame: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            rooms[room].registerRent(name, email);
            sc.nextLine();
            System.out.println();
        }

        System.out.println("Busy rooms:");
        for(int i=0; i < 10;i++){
            if(rooms[i].getStatus() == true){
                System.out.println(rooms[i]);
            }
        }


        sc.close();
    }
}
