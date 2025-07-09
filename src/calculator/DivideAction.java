/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

/**
 *
 * @author oleksandrlinenko
 */
public class DivideAction {

    public static DivideAction create() {
        return new DivideAction();
    }

    public float getDiv(Component first, Component second) {
        if(second.getValue() == 0) {
            throw new IllegalArgumentException("You can't divide by 0");
        }
        return first.getValue() / second.getValue();
    }
}
