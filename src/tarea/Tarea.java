/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;
import java.lang.Integer;

/**
 *
 * @author ZARAT
 */
public class Tarea {
    public String inToHex(int n)
    {
        return Integer.toHexString(n).toUpperCase();
    }
    public String intOct(int n){
        return Integer.toOctalString(n);
    }
    
    public String intoBin(int n){
        
        return Integer.toBinaryString(n);
    }

    }
    

