/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;


import calculator.DivideCommand;
import calculator.MinusCommand;
import calculator.MultCommand;
import calculator.SumCommand;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author oleksandrlinenko
 */
public class MainMenu {

    private static Scanner sc = new Scanner(System.in);

    public static MainMenu create() {
        return new MainMenu();
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
        System.out.println("Calculator");
        System.out.println("1. Get sum of two elements");
        System.out.println("2. Get difference of two elements");
        System.out.println("3. Get multiple of two elements");
        System.out.println("4. Get divide of two elements");
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
            case 2:
                getDif();
                break;
            case 3:
                getMult();
                break;
            case 4:
                getDivide();
                break;
            default:
                System.out.println("Undefined option");
        }

        return false;
    }
    
    private void getSum() {
        SumCommand.create().handle();
    }
    
    private void getDif() {
        MinusCommand.create().handle();
    }
    
    private void getMult() {
        MultCommand.create().handle();
    }
    
    private void getDivide() {
        DivideCommand.create().handle();
    }
}
