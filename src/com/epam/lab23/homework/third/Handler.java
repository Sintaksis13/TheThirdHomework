package com.epam.lab23.homework.third;

import java.util.Arrays;

public class Handler {

    public byte[] handleFile(byte[] bytes){

        char[] chars = new char[bytes.length];
        for(int i = 0; i < bytes.length; i++){

            chars[i] = (char) bytes[i];

        }

        String string = new String(chars);
        String[] stringArray = string.split(" ");

        stringArray = changeString(stringArray);

        StringBuilder builder = new StringBuilder();
        for(String s: stringArray){

            builder.append(s + " ");
        }

        string = builder.toString();

        bytes = string.getBytes();

        return bytes;

    }

    private String[] changeString(String[] stringArray){

        int indexOfName = 0;
        double srBal = 0;
        int count = 1;

        for(int i = 0; i < stringArray.length; i++){

            switch (count){
                case 1: {
                    indexOfName = i;
                    count++;
                    break;
                }
                default: {
                    srBal += Integer.parseInt(stringArray[i]);
                    count++;
                }
            }

            if (count == 7){

                srBal = srBal/5;
                if(srBal > 7){

                    stringArray[indexOfName] = stringArray[indexOfName].toUpperCase();
                }

                srBal = 0;
                count = 1;
            }

        }

        return stringArray;

    }

}
