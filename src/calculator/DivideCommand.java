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
public class DivideCommand {

    public static DivideCommand create() {
        return new DivideCommand();
    }

    public void handle() {
        try {
            Component first = GetComponentCommand.create().handle();
            Component second = GetComponentCommand.create().handle();
            Message.create().show(String.format("Fraction of those components is %.2f\n", DivideAction.create().getDiv(first, second)));
            Message.create().show("\n");
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            Message.create().show("\n");
        }
    }
}
