/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

/**
 *
 * @author oleksandrlinenko
 */
public class MinusAction {

    public static MinusAction create() {
        return new MinusAction();
    }

    public float getDif(Component first, Component second) {
        return first.getValue() - second.getValue();
    }
}
