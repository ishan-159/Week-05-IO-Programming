package com.csvdatahandling.intermediateproblems.searchforarecord;

import com.opencsv.CSVReader;

import java.io.FileReader;

public class SearchRecord {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\91887\\OneDrive\\Desktop\\Week-05-IO-Programming\\Day1\\src\\main\\java\\com\\csvdatahandling\\intermediateproblems\\searchforarecord\\employees.csv";
        String target = "Ishan";

        try(CSVReader cv = new CSVReader(new FileReader(fileName))){
            String[] column;
            while((column = cv.readNext()) != null) {
                if(column[1].equals(target)) {
                    System.out.println(" ID : " + column[0] + ", Name : " + column[1] + ", Department : " + column[2] + ", Salary : " + column[3]);
                }
            }
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
