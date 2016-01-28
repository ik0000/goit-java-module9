package com.goit.module9;


import com.goit.module6.CarException;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args)
    {
        System.out.println("\t \t Let's encrypt our secret!");
        System.out.println("Please enter number you wish to shuffle alphabet");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        new CaesarCipher(i);
    }
}
