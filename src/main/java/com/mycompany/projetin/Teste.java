/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetin;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
/**
 *
 * @author iftm
 */@Named 
 @SessionScoped

public class Teste implements Serializable{
     private String oraora = "123";

    public String getOraora() {
        return oraora;
    }
     
     
    
}
