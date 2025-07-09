/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

import UI.Ask;
import UI.Message;

/**
 *
 * @author oleksandrlinenko
 */
public class GetComponentCommand {
     
    public static GetComponentCommand create() {
        return new GetComponentCommand();
    }
    
    public Component handle() {
        return new Component(Ask.create().getValue("Set value: "));
    }
}
