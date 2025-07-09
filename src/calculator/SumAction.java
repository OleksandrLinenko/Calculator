/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

/**
 *
 * @author oleksandrlinenko
 */
public class SumAction {

    public static SumAction create() {
        return new SumAction();
    }

    public int getSum(Component first, Component second) {
        return first.getValue() + second.getValue();
    }
}
