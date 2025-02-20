package com.csvdatahandling.intermediateproblems.filterrecords;
import java.io.*;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class FilterRecords {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\91887\\OneDrive\\Desktop\\Week-05-IO-Programming\\Day1\\src\\main\\java\\com\\csvdatahandling\\intermediateproblems\\filterrecords\\marks.csv";

        try(CSVReader cv = new CSVReader(new FileReader(fileName))) {
           String[] marks;
           while((marks = cv.readNext()) != null){
              if((Integer.parseInt(marks[1]) > 80)){
                  System.out.println(" Name : " + marks[0] + " Marks : " + marks[1]);
              }
           }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException | CsvValidationException e) {
            throw new RuntimeException(e);
        }
    }
}
