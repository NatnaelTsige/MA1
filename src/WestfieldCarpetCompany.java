import java.util.*;
/*
Name: Natnael Tsige
CPT-S 223: Micro Assignment #1
Date: 9/3/2020
url: https://github.com/NatnaelTsige/MA1.git
 */
public class WestfieldCarpetCompany {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length of room: ");
        double length = scan.nextDouble();
        System.out.print("Enter width of room: ");
        double width = scan.nextDouble();
        RoomDimension rd = new RoomDimension(length, width);
        System.out.print("Enter Carpet cost per feet: ");
        double carpetPrice = scan.nextDouble();
        RoomCarpet price =new RoomCarpet(rd, carpetPrice);
        System.out.println("Total cost of Carpet: "+price.getTotalCost()+"$");
    }
}


// Test run sample
/*
Enter length of room: 12
Enter width of room: 10
Enter Carpet cost per feet: 8
Total cost of Carpet: 960.0$
*/