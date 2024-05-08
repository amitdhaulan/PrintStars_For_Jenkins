/*
package org.example;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TestClass {

    public static void main(String... args) {
//        increment_decrementOperator();
//        readingInput();
//        comparison_operator();
//        logical_operator();
//        switch_statement();
//        assignment();
//        for_loops();
//        while_loops();
//        collection();
//        class_example();
//        abs_exam();
//        loop();
        readExcel();
        */
/*RuntimePoly compileTimePoly = new RuntimePoly();
        compileTimePoly.divide();*//*



    }

    //    Operators
    public static void increment_decrementOperator() {
        int x = 1;
        //  postfix
        x++;
        System.out.println(x);

        int y = 1;
        //  prefix
        ++y;
        System.out.println(y);

        int a = 1;
        int b = a++;
        System.out.println(b);

        int c = 1;
        int d = ++c;
        System.out.println(d);

        int f = 1;
        f = f + 2;
        System.out.println(f);

        //  Augmented/Compound assignment operator
        int g = 1;
        g += 2;
        System.out.println(g);

        */
/*//*
/  Implicit casting
        //  byte > short > int > long > float > double
        //  Rule of thumb: implicit casting happens when we are not going to loss any data
        //  casting can only be done between compatible types.
        double e = 1.1;
        double r = e + 2;
        System.out.println(r);*//*

    }

    //_________________________________________________
    //    Taking inputs from user
    public static void readingInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hi " + name);
    }
//    _____________________________________________

    //    Comparison operators
    public static void comparison_operator() {
        String str1 = "Test";
        String str2 = "Testsds";
        System.out.println(str1.equals(str2));
    }
//    ______________________________________________

    //    Logical operators
    public static void logical_operator() {

        int x = 10;
        int y = 10 % 5;


        int temp = 12;
        boolean isWarm = temp > 20 && temp < 30;
        System.out.println(isWarm);
    }

    //    ______________________________________________
    //    switch statements
    public static void switch_statement() {
        String role = "moderfdfator";
      */
/*  if (role.equalsIgnoreCase("moderator")) {
            System.out.println("You are a moderator");
        } else if (role.equalsIgnoreCase("admin")) {
            System.out.println("You are a admin");
        }else{
            System.out.println("guest");
        }*//*



        switch (role) {
            case "admin":
                System.out.println("You are an admin");
                break;
            case "moderator":
                System.out.println("You are a moderator");
                break;
            default:
                System.out.println("You are a guest");
        }
    }

    //    ______________________________________________
    //    assignment
    public static void assignment() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = scanner.nextInt();

        if (x % 5 == 0 && x % 3 == 0)
            System.out.println("Amit Kashyap");
        else if (x % 5 == 0)
            System.out.println("Amit");
        else if (x % 3 == 0)
            System.out.println("Kashyap");

        else System.out.println(x);
    }

    //    ______________________________________________
    //    for loops
    public static void for_loops() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        strings.add("e");
        strings.add("f");
        strings.add("g");
        strings.add("h");


        System.out.println(strings.get(5));






       */
/* for (int i = 5; i >0; i--) {
            System.out.println("Hello World");
        }*//*

    }

    //    ______________________________________________
    //    while loop
    public static void while_loops() {
        String input = "";
        Scanner scanner = new Scanner(System.in);
        ;
        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = scanner.nextLine();
            System.out.println(input);

        }
    }

    //    ______________________________________________
    //    adding object, deleting object , iterating object etc
    public static void collection() {
        ArrayList<String> strings1 = new ArrayList<>();

        strings1.add("a");
        strings1.add("Amit");
        strings1.add("c");


        System.out.println(strings1);
        ArrayList<String> strings2 = new ArrayList<>();
        strings2.addAll(strings1);
        System.out.println("Size " + strings1.size());
        System.out.println("Element at index 2: " + strings1.get(2));
        System.out.println("Does array contains Amit: " + strings1.contains("Amit"));
        System.out.println("Is array empty: " + strings1.isEmpty());
        System.out.println(strings1.remove("Amit"));
        System.out.println("Size " + strings1.size());


        System.out.println("data " + strings2);
        System.out.println("Size " + strings2.size());

    }
//    ______________________________________________

    //    inheritance, polymorphism
    static class Pen*/
/* extends shape*//*
 {

        //        Non parameterized constructor
        Pen() {
            System.out.println("I am a Non parameterized constructor, called first");
        }

        //        Parameterized constructor
        Pen(String color, String type) {
            System.out.println("I am a parameterized constructor, called first");
            this.color = color;
            this.type = type;
        }

        //        Copy constructor
        Pen(Pen pen) {
            System.out.println("I am a copy constructor, called first");
            this.color = pen.color;
            this.type = pen.type;
        }

        String color;
        String type;

        public void write() {
            System.out.println("Writing function without parameter");
        }

        public void write(String pen) {
            System.out.println("Writing function with string parameter");
        }

        public void write(int type) {
            System.out.println("Writing function with int parameter");
        }

        public void print_color() {
            System.out.println(this.color);
        }

        public void print_type() {
            System.out.println(this.type);
        }

    }

    //    class example
    public static void class_example() {
//        Pen pen2 = new Pen("red", "gel pen");
        Pen pen1 = new Pen();

        pen1.color = "red";
        pen1.type = "ball pen";

        Pen pen2 = new Pen(pen1);

       */
/* pen1.write();
        pen1.print_color();
        pen1.print_type();*//*


        pen2.write();
        pen2.print_color();
        pen2.print_type();


      */
/*  pen2.rectangle();
        pen2.square();*//*

    }

    static class shape {
        public void rectangle() {
            System.out.println("I am a rectangle");
        }

        public void square() {
            System.out.println("I am a square");
        }
    }

    //   ___________________________________________________
//   abstraction
    static abstract class abstraction {
        public abstract void play();

        public void play2() {
            System.out.println("Test play2");
        }

    }

    static class abstract_example extends abstraction {

        @Override
        public void play() {
            System.out.println("Playing sound");
        }
    }

    public static void abs_exam() {
        abstract_example abstract_example = new abstract_example();
        abstract_example.play();
        abstract_example.play2();

    }
//    ___________________________________________________

//    what is a class, object, attribute, interfaces,

    static class RuntimePoly {
        public void divide() {
            try {
                int i = 0;
                int y = 0;
                int result = y / i;
                System.out.println(result);
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
            System.out.println("Test exception");
        }
    }

    public static void loop() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a"); // 0
        strings.add("b"); // 1
        strings.add("c"); // 2

        */
/* for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }*//*


        int i = 0;
        for (String str : strings) {
            if(i == 2 || i == 1){
                System.out.println(str);
            }

            i = i+1;
        }
    }

    public static void readExcel(){
        try
        {
            FileInputStream file = new FileInputStream("E:\\F Drive\\amit\\Projects\\Playwright\\Tutorial\\FirstProgram\\src\\excelFIle\\Book1.xlsx");

            //Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook wb = new XSSFWorkbook(file);

            //Get first/desired sheet from the workbook
            XSSFSheet ws = wb.getSheetAt(0);

            //Iterate through each rows one by one
            Iterator<Row> rowIterator = ws.iterator();
            while (rowIterator.hasNext())
            {
                Row row = rowIterator.next();
                //For each row, iterate through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();

                while (cellIterator.hasNext())
                {
                    Cell cell = cellIterator.next();
                    //Check the cell type and format accordingly
                    switch (cell.getCellType())
                    {
                        case Cell.CELL_TYPE_NUMERIC:
                            System.out.print(" " +cell.getNumericCellValue());
                            break;
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(" " +cell.getStringCellValue());
                            break;
                    }
                }
                System.out.println("tESTING");
            }
            file.close();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}*/
