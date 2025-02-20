package com.csvdatahandling.basicproblems.readandcountrows;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.IOException;

public class ReadAndCountRows {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\91887\\OneDrive\\Desktop\\Week-05-IO-Programming\\Day1\\src\\main\\java\\com\\csvdatahandling\\basicproblems\\readandcountrows\\headerrow.csv";

        try(CSVReader cv = new CSVReader(new FileReader(fileName))){
            String[] column;
            int row = 0;
            while((column = cv.readNext()) != null) {
                row++;
            }
            System.out.println("Number of rows : " + row);
        }catch (IOException e){
            System.out.println(e);
        }catch(CsvValidationException e){
            throw new RuntimeException(e);
        }
    }
}
