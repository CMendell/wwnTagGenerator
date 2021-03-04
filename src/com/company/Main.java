package com.company;

public class Main {

    public static void main(String[] args) {
        Boolean exit = false;
        Menu menu = new Menu();
	    while (!exit){
            exit = menu.mainMenu();
        }
    }
}
