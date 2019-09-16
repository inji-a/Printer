package com.company;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50, true);

        System.out.println("Initial page count is = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(5);

        System.out.println("Printed pages count is " + pagesPrinted +
                " \nand total number of printed pages is = " + printer.getPagesPrinted());

        pagesPrinted = printer.printPages(2);
        System.out.println("Printed pages count is " + pagesPrinted +
                " \nand total number of printed pages is = " + printer.getPagesPrinted());
    }
}
