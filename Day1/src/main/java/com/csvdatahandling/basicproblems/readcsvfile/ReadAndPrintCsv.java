package com.csvdatahandling.basicproblems.readcsvfile;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.*;
public class ReadAndPrintCsv {
    public static void main(String[] args) throws CsvValidationException, IOException {
        String fileName = "C:\\Users\\91887\\OneDrive\\Desktop\\Week-05-IO-Programming\\Day1\\src\\main\\java\\com\\csvdatahandling\\basicproblems\\readcsvfile\\students.csv";

        try (CSVReader cv = new CSVReader(new FileReader(fileName))) {
            String[] columns;
            while ((columns = cv.readNext()) != null) {
                System.out.println(" ID : " + columns[0] + " Name : " + columns[1] + " Age : " + columns[2] + " Marks : " + columns[3] );
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
    }
}

