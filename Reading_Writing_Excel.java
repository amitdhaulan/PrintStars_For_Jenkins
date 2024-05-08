package org.example;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

public class Reading_Writing_Excel {

    @Test
    public static void function() {
//        readExcel();
//        writeExcel();
        printStars();
    }

    public static void readExcel() {
        try {
            FileInputStream file = new FileInputStream("E:\\F Drive\\amit\\Projects\\Playwright\\Tutorial\\FirstProgram\\src\\excelFIle\\Book1.xlsx");

            //Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook wb = new XSSFWorkbook(file);

            //Get first/desired sheet from the workbook
            XSSFSheet ws = wb.getSheetAt(0);

            //Iterate through each rows one by one
            Iterator<Row> rowIterator = ws.iterator();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                //For each row, iterate through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();

                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    //Check the cell type and format accordingly
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_NUMERIC:
                            System.out.print("\t" + cell.getColumnIndex());
                            break;
                        case Cell.CELL_TYPE_STRING:
                            if (cell.getStringCellValue().equalsIgnoreCase("Ved"))
                                System.out.print("\t" + cell.getStringCellValue());
                            else
                                System.out.print("\t" + cell.getStringCellValue());
                            break;
                    }
                }
                System.out.println("");
            }
            file.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void writeExcel() {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Java Books");

        Object[][] bookData = {
                {"Head First Java", "Kathy Serria", 79},
                {"Effective Java", "Joshua Bloch", 36},
                {"Clean Code", "Robert martin", 42},
                {"Thinking in Java", "Bruce Eckel", 35},
        };

        int rowCount = 0;

        for (Object[] aBook : bookData) {
            Row row = sheet.createRow(++rowCount);

            int columnCount = 0;

            for (Object field : aBook) {
                Cell cell = row.createCell(++columnCount);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }

        }


        try (FileOutputStream outputStream = new FileOutputStream("E:\\F Drive\\amit\\Projects\\Playwright\\Tutorial\\FirstProgram\\src\\excelFIle\\JavaBooks.xlsx")) {
            workbook.write(outputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void printStars() {
        //        * * * * *
        //        * * * *
        //        * * *
        //        * *
        //        *
        /*int row;
        int column;
        for (row = 5; row > 0; row--) {
            for (column = 0; column < row; column++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }*/

//        ______________________________________________

        //        *
        //        * *
        //        * * *
        //        * * * *
        //        * * * * *

        /*int row1;
        int column1;
        for (row1 = 0; row1 < 5; row1++) {
            for (column1 = 0; column1 <= row1; column1++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }*/


        // *  *  *  *  *
        // *  *  *  *
        // *  *  *
        // *  *
        // *
        // *
        // *  *
        // *  *  *
        // *  *  *  *
        // *  *  *  *  *

        int row;
        int column;
        for (row = 5; row > 0; row--) {
            for (column = 0; column < row; column++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }

        int row1;
        int column1;
        for (row1 = 0; row1 < 5; row1++) {
            for (column1 = 0; column1 <= row1; column1++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }


        //  *  *  *  *  *  *  *  *  *  *
        //  *  *  *  *        *  *  *  *
        //  *  *  *              *  *  *
        //  *  *                    *  *
        //  *                          *
        //  *                          *
        //  *  *                    *  *
        //  *  *  *              *  *  *
        //  *  *  *  *        *  *  *  *
        //  *  *  *  *  *  *  *  *  *  *



        /*int column1;
        for (int row1 = 0; row1 < 5; row1++) {
            for (column1 = 0; column1 <= row1; column1++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
        int i, j, row = 5;
        for (i = 0; i < row; i++) {
            for (j = 2 * (row - i); j >= 0; j--)
                System.out.print(" ");
            for (j = 0; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }*/
    }
}
