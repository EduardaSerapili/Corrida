/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corrida.model;
import java.util.*;
/**
 *
 * @author Admin
 */
public class Corrida {
    
    public Date inicio;
    private ArrayList<Automovel> automoveis  = new ArrayList<Automovel>();
    
    public void adicionarAutomoveis (Automovel a){
        this.automoveis.add(a);
    }
    
    
    private void liguemSeusMotores(){
        for (Automovel c : this.automoveis){
            System.out.println (c.ligar());
            System.out.println (c.acelerar());
            System.out.println (c.freiar());
            System.out.println (c.desligar());
        }
    }
    
    public void iniciarCorrida(){
        this.liguemSeusMotores();
    }
}
