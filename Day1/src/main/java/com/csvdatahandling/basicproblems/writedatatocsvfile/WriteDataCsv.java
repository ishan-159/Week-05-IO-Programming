package com.csvdatahandling.basicproblems.writedatatocsvfile;

import com.opencsv.CSVWriter;

import java.io.*;
import java.io.FileWriter;


public class WriteDataCsv {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\91887\\OneDrive\\Desktop\\Week-05-IO-Programming\\Day1\\src\\main\\java\\com\\csvdatahandling\\basicproblems\\writedatatocsvfile\\employee.csv";

        try(CSVWriter cv = new CSVWriter(new FileWriter(fileName))){
            String[] str1 = {"101", "Ishan", "Software Developer", "28000"};
            String[] str2 = {"102", "Naman", "Software Developer", "28000"};
            String[] str3 = {"103", "Om", "Software Tester", "28000"};
            String[] str4 = {"104", "Aman", "Software Developer", "28000"};
            String[] str5 = {"105", "Harsh", "Software Tester", "28000"};

            cv.writeNext(str1);
            cv.writeNext(str2);
            cv.writeNext(str3);
            cv.writeNext(str4);
            cv.writeNext(str5);

            System.out.println("Write the data in csv file");

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
