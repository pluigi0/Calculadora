package Calculadora;

import java.util.Scanner;
import javax.swing.JOptionPane;

/*
Programa que simule el funcionamiento de una calculadora que puede realizar las 
cuatro  operaciones aritmeticas basica (suma, resta, producto y division ) con 
valores numericos enteros. El usuario debe especificar la operacion con el primer caracter 
del primer parametro de la  linea de comandos: S o s para la suma, R o r para 
la resta, P  p M o m para el producto y D o d para la division
*/

public class Calculadora {
    public static void main(String[] args) {
        int num, num2, suma, resta, division, producto;
        String operacion;
        Scanner entrada = new Scanner (System.in);
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un primer numero: "));          
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un segundo numero: "));

        operacion = JOptionPane.showInputDialog("Indica que operacion deseas realizar: ");
        
        switch (operacion){
            case "suma":
            case "Suma": suma = num + num2;
                      JOptionPane.showMessageDialog(null, " La suma es: "+suma);
                      break;
            case "resta":
            case "Resta": resta = num-num2;
                      JOptionPane.showMessageDialog(null, " La resta de" +num+ " y "+num2+ " es: "+resta);
                      break;
            case "producto":
            case "Producto": producto = num * num2;
                      JOptionPane.showMessageDialog(null, " La multiplicacion es: "+producto);
                      break;
            case "division":
            case "Division": division = num / num2;
                      JOptionPane.showMessageDialog(null, num+" / "+num2+" es: "+division);
                      break;
            default: JOptionPane.showMessageDialog(null, " Se equivoco de operacion");
        }
    }
}