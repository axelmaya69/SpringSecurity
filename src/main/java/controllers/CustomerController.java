/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

/**
 *
 * @author axelmaya
 */

@RestController
public class CustomerController {
    
    
    @GetMapping("/index"){
    String saludo(){
        return "Hola Mundo";
    }
}
}
