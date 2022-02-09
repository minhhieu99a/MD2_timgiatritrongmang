package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] studens = {"Hiếu","Huy","Tiến","Cường"};
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a name's student: ");
        String input_name=scanner.nextLine();
        for (int i = 0; i < studens.length; i++) {
            if (studens[i].equals(input_name)){
                System.out.println("Position of the students in the list " + input_name + " is: " + i);
                break;
            }else {
                System.out.println("Not found " + input_name + " in the list.");
                break;
            }
        }
    }
}
