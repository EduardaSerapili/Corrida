/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import corrida.model.*;
/**
 *
 * @author Admin
 */
public class App {
    public static void main(String [] args){
        
        
       
        Automovel moto1 = new Moto ();
        Automovel moto2 = new Moto ();
        Automovel carro1 = new Carro ();
        Automovel carro2 = new Carro ();
        
        Corrida corrida = new Corrida();
        
        corrida.adicionarAutomoveis(moto1);
        corrida.adicionarAutomoveis(moto2);
        corrida.adicionarAutomoveis(carro1);
        corrida.adicionarAutomoveis(carro2);
        
        
        corrida.iniciarCorrida();
        
    }
}
