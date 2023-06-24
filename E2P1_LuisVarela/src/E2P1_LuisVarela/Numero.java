/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E2P1_LuisVarela;

/**
 *
 * @author Luis Andres Varela
 */
public class Numero {

    private int base;
    private int numero;
    private String resultado;
    private String[] abecedario = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    private String[] numero1 = {"10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35"};

    public Numero() {

    }

    public Numero(int base, int numero,String decimal) {
        this.base=base;
        this.numero=numero;
        this.resultado=decimal;
    }

    public int getbase() {
        return base;
    }

    public int getnumero() {
        return numero;
    }

    public String getresultado() {
        return resultado;
    }

    public String baseToDec(int base, int numero) {
        String resultado = "";
        int numero1 = numero;
        if (base < numero) {
            while (base <= numero1) {
                int num1 = numero1 / base;
                int num2 = num1 * base;
                int num3 = numero1 - num2;
                numero1 = num1;
                System.out.println(num3);
                if (num3 >= 10) {
                    System.out.println(num3 + "num3");
                    resultado += numToChar(num3);
                    if (numero1 < base) {
                        System.out.println(num1 + "num1");
                        resultado += Integer.toString(num1);
                    }
                } else if (num3 >= 0 && num3 <= 9) {
                    System.out.println(num3 + "num3");
                    resultado += Integer.toString(num3);
                    if (numero1 < base) {
                        System.out.println(num1 + "num1");
                        resultado += Integer.toString(num1);
                    }
                }
            }
        } else if (base == numero || base > numero) {
            System.out.println("hello");
            if (numero >= 10) {
                resultado += numToChar(numero);
            } else if (numero >= 0 && numero <= 9) {
                resultado += Integer.toString(numero);
            }
        }
        String vuelta=vuelta(resultado);
        resultado=vuelta;
        return resultado;
    }
    
    public String vuelta(String resultado){
        String vuelta="";
        for(int i=resultado.length()-1;i>-1;i--){
            vuelta+=resultado.charAt(i);
        }
        return vuelta;
    }
    public String numToChar(int numero) {
        String num = Integer.toString(numero);
        int guardar = 0;
        System.out.println(num);
        for (int i = 0; 0 < numero1.length; i++) {
            if (num.equalsIgnoreCase(numero1[i])) {
                guardar = i;
            }
        }
        String resultado1 = abecedario[guardar];
        return resultado1;
    }

    public String charToNum(char numero) {
        String num = "";
        num += numero;
        int guardar = 0;
        for (int i = 0; 0 < numero1.length; i++) {
            if (num.equalsIgnoreCase(numero1[i])) {
                guardar = i;
            }
        }
        String resultado1 = numero1[guardar];
        return resultado1;
    }

}
