package com.epam.lab23.homework.third;

import java.io.*;

public class StreamInOut {

    String fileName = "students.txt";

    public byte[] readFile(){

        byte[] bytes = new byte[0];

        try (FileInputStream fileInputStream1 = new FileInputStream(fileName)) {

            bytes = new byte[fileInputStream1.available()];

            fileInputStream1.read(bytes, 0, fileInputStream1.available());

        } catch (FileNotFoundException e){
            System.out.println(e.getMessage() + " oops");
        } catch (IOException e){
            System.out.println(e.getMessage()+ " oops[1]");
        }

        return bytes;
    }

    public void writeFile(byte[] bytes){

        try (FileOutputStream fileOutputStream = new FileOutputStream("newStudentsOrder.txt")){

            fileOutputStream.write(bytes, 0, bytes.length);

        } catch (FileNotFoundException e){
            System.out.println(e.getMessage() + " yo!");
        } catch (IOException e) {
            System.out.println(e.getMessage() + " hey!");
        }

    }

    public String getFilename() {
        return fileName;
    }

    public void setFilename(String filename) {
        this.fileName = filename;
    }
}
