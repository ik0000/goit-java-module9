package com.goit.module9;


import com.goit.module6.CarException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args)
    {
        int i;
        String str;
        System.out.println("\t \t Hello %Username%");
        System.out.println("This 'software' provides you with the possibility to encrypt or decrypt messages");
        System.out.println("to Encrypt message press '1', to Decrypt message press '2' ");
        Scanner input = new Scanner(System.in);
        Scanner inputString  = new Scanner(System.in);
        CaesarCipher caesarCipher = new CaesarCipher();
        i = input.nextInt();
          switch (i)
          {
              case 1:
                    System.out.print("Please enter message to be encrypted: ");
                    str = inputString.nextLine();
                    System.out.print("Please enter number you wish to shuffle alphabet: ");
                    try    {    i = input.nextInt();}
                    catch (InputMismatchException e ) { System.out.println("Wrong Input: Value should be integer"); break;}
                    caesarCipher.CaesarCipherEncrypt(str, i);

                    break;
              case 2:

                    System.out.print("Please enter message to be decrypted :");
                    str = inputString.nextLine();
                    System.out.print("Please enter number you wish to shuffle alphabet: ");
                    try    {    i = input.nextInt();}
                         catch (InputMismatchException e ) { System.out.println("Wrong Input: Value should be integer"); break;}
                    caesarCipher.CaesarCipherDecrypt(str, i);
                    break;
              case 3:
                    break;
          }
        //System.out.println("If you received decrypted message you can encrypt it if you know the 'key' ");
        /*System.out.println("Please enter number you wish to shuffle alphabet");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        System.out.print("Enter Message:");
        Scanner inputString  = new Scanner(System.in);
        String str = inputString.nextLine();
        CaesarCipher caesarCipher = new CaesarCipher();
        caesarCipher.CaesarCipherEncrypt(str, i);*/

    }
}
