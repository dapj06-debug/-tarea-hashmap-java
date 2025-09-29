/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semana15;

import java.util.HashMap;

/**
 *
 * @author World
 */
public class Semana15 {
    
    

    public static void main(String[] args) {
          HashMap<String, Object> informacionPersonal = new HashMap<>();
        informacionPersonal.put("nombre", "Diego");
        informacionPersonal.put("edad", "30");
        informacionPersonal.put("ciudad", "Quito");

        informacionPersonal.put("ciudad", "Riobamba");
        informacionPersonal.put("profesion", "Instructor");

        if (!informacionPersonal.containsKey("telefono")) {
            informacionPersonal.putIfAbsent("telefono", "0999054315");
        }

        informacionPersonal.remove("edad");

        System.out.println(informacionPersonal);
    }
}

