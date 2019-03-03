//Author: Jayendra Matarage
//Date: 2019 March 3

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int max_number;
        System.out.println("Maximum number finder");
        for (int x = 1; x < 6; x++) {
            System.out.print("Enter number " + x +" : ");
            int number = scanner.nextInt();
            numberList.add(number);
        }

        if(numberList.get(0) > numberList.get(1)){
            max_number = numberList.get(0);
        }else{
            max_number = numberList.get(1);
        }

        if (numberList.get(2)>max_number){
            max_number = numberList.get(2);
        }

        if (numberList.get(3)>max_number){
            max_number = numberList.get(3);
        }

        if (numberList.get(4)>max_number){
            max_number = numberList.get(4);
        }

        System.out.println("Maximum number: " +max_number);
    }
}
