package com.patikastore;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Brand b1 = new Brand("Samsung");
        Brand b2 = new Brand("Lenovo");
        Brand b3 = new Brand("Apple");
        Brand b4 = new Brand("Huawei");
        Brand b5 = new Brand("Casper");
        Brand b6 = new Brand("Asus");
        Brand b7 = new Brand("Xiaomi");
        Brand b8 = new Brand("HP");
        Brand b9 = new Brand("Oneplus");


        Notebook n1 = new Notebook(7499, 35, 10, "Asus Tuf", b6, 16, 15, 500, 0);
        Notebook n2 = new Notebook(8499, 35, 10, "Lenovo v14", b2, 32, 16, 1000, 0);
        Notebook n3 = new Notebook(12799, 35, 10, "MacBook Pro", b3, 16, 14, 512, 0);

        Phone p1 = new Phone(10799, 25, 10, "iPhone Max", b3, 16, 6, 4000, "black", 64);
        Phone p2 = new Phone(9799, 25, 10, "OnePlus 5", b9, 8, 5, 4500, "gray", 128);
        Phone p3 = new Phone(7799, 25, 10, "Samsung Note 15", b1, 32, 7, 4000, "black", 256);


//        Phone.listPhones();
//        Notebook.listNotebooks();
//
//        Brand.listBrands();
        CommandLine.commandLine();


    }
}
