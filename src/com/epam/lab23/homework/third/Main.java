package com.epam.lab23.homework.third;

public class Main {

    public static void main(String[] args) {

        StreamInOut streamInOut = new StreamInOut();
        byte[] bytes = streamInOut.readFile();

        Handler handler = new Handler();
        bytes = handler.handleFile(bytes);

        streamInOut.writeFile(bytes);

    }

}
