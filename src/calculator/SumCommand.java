/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author oleksandrlinenko
 */
public class SumCommand {

    private static Scanner sc = new Scanner(System.in);

    public static SumCommand create() {
        return new SumCommand();
    }

    public void handle() {
        Component first = GetComponentCommand.create().handle();
        Component second = GetComponentCommand.create().handle();
        System.out.format("Sum of those components is %d\n", SumAction.create().getSum(first, second));
    }
}
