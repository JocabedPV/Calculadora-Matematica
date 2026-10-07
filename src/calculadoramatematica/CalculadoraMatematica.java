/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoramatematica;
import java.util.Scanner;
      
/**
 *
 * @author jocab
 */

/**
 *
 * implementa las operaciones matematicas basicas sobre dos numeros de tipo double.
 */
public class CalculadoraMatematica {

    //atributos privados
    private double numero1;
    private double numero2;
    
    //Constructures
    
    public CalculadoraMatematica() {
        this.numero1 = 0; //por defecto 0
        this.numero2 = 0;
        
    
}
    
    //Los dos numeros que realizaran las operaciones
    public void ingresarNumero(double numero1, double numero2) {
        this.numero1 = numero1; //primer numero
        this.numero2 = numero2; //segundo numero
        
        
    }
    
    //calcula la suma de los dos numeros, utilizando return para dar el resultado de esta
    public double sumar() {
        return numero1 + numero2;
    }
    
    //calcula la resta de los dos numeros, utilizando return para dar el resultado de esta
    public double restar() {
        return numero1 - numero2;
    }
    
    //calcula la multiplicacion de los dos numeros, utilizando return para dar el resultado de esta
    public double multiplicar() {
        return numero1 * numero2;
    }
    
    //calcula la division de los dos numeros, utilizando return para dar el resultado de esta
    public double dividir() {
        
        if (numero2 == 0) {
            System.out.println("No se puede dividir entre 0");
            return 0;
        }
        return numero1 / numero2;
    }
    
    
    
    /*Metodo principal donde se muestra el menu de opciones y la ejecucion 
    * de la operacion que seleccione hasta que se elija la opcion salir
    */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculadoraMatematica calc = new CalculadoraMatematica();
        int opc;
        
        //El menu principal (0 para salir)
        
         do {
            System.out.println("==== CALCULADORA MATEMATICA ====");
            System.out.println("1. Ingresar numeros");
            System.out.println("2. Sumar");
            System.out.println("3. Restar");
            System.out.println("4. Multiplicar");
            System.out.println("5. Dividir");
            System.out.println("0. Salir");
            System.out.println("==================================");
            System.out.print("Seleccione una opcion: ");
            opc = sc.nextInt();

            // Se ejecuta segun la opcion ingresada por el usuario
            switch (opc) {
                case 1:
                    System.out.print("Ingrese el primer numero: ");
                    double primerNumero = sc.nextDouble();
                    System.out.print("Ingrese el segundo numero: ");
                    double segundoNumero = sc.nextDouble();
                    calc.ingresarNumero(primerNumero, segundoNumero);
                    System.out.println("Numeros ingresados correctamente");
                    break;
                case 2:
                    System.out.println("Resultado de la suma: " + calc.sumar());
                    break;
                case 3:
                    System.out.println("Resultado de la resta: " + calc.restar());
                    break;
                case 4:
                    System.out.println("Resultado de la multiplicacion: " + calc.multiplicar());
                    break;
                case 5:
                    //Antes que nada valida si se ingreso un 0 como segundo numero
                    if (calc.numero2 != 0) {
                        System.out.println("Resultado de la division: " + calc.dividir());
                    } else {
                        calc.dividir(); // en caso de que se ingrese el cero se mostrara el mensaje
                    }
                    break;
                case 0:
                    System.out.println("¡Gracias por usar la calculadora!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opc != 0);

        sc.close();
    }
}