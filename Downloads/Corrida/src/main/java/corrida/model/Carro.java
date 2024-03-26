/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corrida.model;

/**
 *
 * @author Admin
 */
public class Carro implements Automovel{
    
    public String modelo;
    
    public String acelerar() {
        return "Acelerar";
    }

    public String freiar() {
        return "Freiar";
    }

    public String ligar() {
        return "Ligar";
    }

    public String desligar() {
        return "Desligar";
    }
   
}

