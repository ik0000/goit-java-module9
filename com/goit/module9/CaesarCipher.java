package com.goit.module9;

import com.goit.module3.files.*;
import com.goit.module8.FileNameComparator;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CaesarCipher {
    private int shuffle;

    public CaesarCipher(int shuffle) {

        Set<String> str = new HashSet<String>();
        str.add("Audio file");
        str.add("Text file");
        str.add("Image file");
        String toBeEncoded = str.toString();
        StringBuilder encoded = new StringBuilder();
        String[] array = str.toArray(new String[0]);
        System.out.println(toBeEncoded);

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
                            System.out.println((toBeEncoded.codePointAt(i) + shuffle) % 26);
                            System.out.println(toBeEncoded.codePointAt(i));
            }

        }
        System.out.println("Original string " + toBeEncoded);
        System.out.println("Encoded string " + encoded);
            }


}