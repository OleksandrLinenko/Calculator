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
public class MultCommand {
    public static MultCommand create() {
        return new MultCommand();
    }

    public void handle() {
        Component first = GetComponentCommand.create().handle();
        Component second = GetComponentCommand.create().handle();
        Message.create().show(String.format("Multiple of those components is %.2f\n", MultAction.create().getMult(first, second)));
        Message.create().show("\n");
    }
}
