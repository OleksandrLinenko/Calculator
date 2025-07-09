/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

import java.util.Scanner;
import UI.Message;

/**
 *
 * @author oleksandrlinenko
 */
public class GetComponentCommand {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static GetComponentCommand create() {
        return new GetComponentCommand();
    }
    
    public Component handle() {
        Message.create().show("Set component value: ");
        return new Component(sc.nextInt());
    }
}
