package com.goit.module9;

import com.goit.module3.files.*;
import com.goit.module8.FileNameComparator;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CaesarCipher {

    public StringBuilder CaesarCipherEncrypt(String toBeEncoded, int shuffle) {

        StringBuilder encoded = new StringBuilder();

        for (int i = 0; i < toBeEncoded.length(); i++) {
            if (       toBeEncoded.codePointAt(i) == 93   // "]"
                    || toBeEncoded.codePointAt(i) == 91   // "["
                    || toBeEncoded.codePointAt(i) == 44   // ","
                    || toBeEncoded.codePointAt(i) == 46   // "."
                    || toBeEncoded.codePointAt(i) == 32   // " "
                    ) {
                encoded.appendCodePoint(toBeEncoded.codePointAt(i));
                }
                    else {
                        encoded.appendCodePoint((toBeEncoded.codePointAt(i) + shuffle));
                   }

        }

        System.out.println("Original string is : " + toBeEncoded);
        System.out.println("Encoded string is : " + encoded);
        return encoded;
            }

    public StringBuilder CaesarCipherDecrypt(String toBeDecoded, int shuffle) {
        StringBuilder encoded = new StringBuilder();
          for (int i = 0; i < toBeDecoded.length(); i++) {
            if (       toBeDecoded.codePointAt(i) == 93   // "]"
                    || toBeDecoded.codePointAt(i) == 91   // "["
                    || toBeDecoded.codePointAt(i) == 44   // ","
                    || toBeDecoded.codePointAt(i) == 46   // "."
                    || toBeDecoded.codePointAt(i) == 32   // " "
                    ) {
                encoded.appendCodePoint(toBeDecoded.codePointAt(i));
            }
            else {
                encoded.appendCodePoint((toBeDecoded.codePointAt(i) - shuffle));

            }

        }
        System.out.println("Original string is : " + toBeDecoded);
        System.out.println("Encoded string is : " + encoded);
        return encoded;
    }

}