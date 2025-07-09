/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;


import calculator.SumCommand;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author oleksandrlinenko
 */
public class UI {

    private static Scanner sc = new Scanner(System.in);

    public static UI create() {
        return new UI();
    }

    public void show() throws IOException {
        boolean endProgram = false;
        do {
            menu();
            int option = readOption();
            endProgram = doOption(option);
        } while (!endProgram);
    }

    private void menu() {
        System.out.println("1. Get sum of two elements");
        System.out.println("0. End program");
    }

    private int readOption() {
        System.out.print("Set the option: ");
        int option;
        try {
            option = sc.nextInt();
        } catch (InputMismatchException ex) {
            return -1;
        }

        return option;
    }

    private boolean doOption(int option) throws IOException {
        switch (option) {
            case 0:
                return true;
            case 1:
                getSum();
                break;

            default:
                System.out.println("Undefined option");
        }

        return false;
    }
    
    private void getSum() {
        SumCommand.create().handle();
    }
}
