/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

/**
 *
 * @author oleksandrlinenko
 */
public class MultAction {

    public static MultAction create() {
        return new MultAction();
    }

    public float getMult(Component first, Component second) {
        return first.getValue() * second.getValue();
    }
}
