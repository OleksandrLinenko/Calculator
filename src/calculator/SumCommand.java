/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

import UI.Message;

/**
 *
 * @author oleksandrlinenko
 */
public class SumCommand {

    public static SumCommand create() {
        return new SumCommand();
    }

    public void handle() {
        Component first = GetComponentCommand.create().handle();
        Component second = GetComponentCommand.create().handle();
        Message.create().show(String.format("Sum of those components is %.2f\n", SumAction.create().getSum(first, second)));
        Message.create().show("\n");
    }
}
