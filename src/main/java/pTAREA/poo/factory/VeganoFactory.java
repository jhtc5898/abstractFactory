/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pTAREA.poo.factory;

import pTAREA.poo.vegana.ItalianaVegana;
import pTAREA.poo.vegana.JaponesaVegana;
import pTAREA.poo.vegana.MexicanaVegana;

/**
 *
 * @author ASUS_R7
 */
public class VeganoFactory {
    
    public JaponesaVegana crearJaponesa(){
        return new JaponesaVegana();
    }
    
    public ItalianaVegana crearItaliana(){
        return new ItalianaVegana();
    }
    
    public MexicanaVegana crearMexicana(){
        return new MexicanaVegana();
    }
}
