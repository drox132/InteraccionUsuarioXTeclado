import javax.swing.*;
import javax.xml.namespace.QName;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        String name;
        int age;
        int dni;
        String iniciarElPrograma;


        //ingreso de datos con cuadros de dialogos

        //esto se puede mejorar muchisimo con condiciones y generacion de excepciones pero se haran
        // en los futuros ejercicios para no sobrecargar de codigo las practicas




        for (int i=1; i >=1; i++){
       name=JOptionPane.showInputDialog("Por favor introduzca su nombre");
       age=Integer.parseInt(JOptionPane.showInputDialog("Por favor introduzca su edad"));
       dni=Integer.parseInt(JOptionPane.showInputDialog("Por favor introduzca su DNI"));

       JOptionPane.showMessageDialog(null, "Su nombre es: ".concat(name)
               .concat("\n Su edad es: ".concat(String.valueOf(age)))
                       .concat("\n Su Dni es: ".concat(String.valueOf(dni))));

        }


        //ingreso de datos por consola
/*
        for (int i = 1; i>=1; i+=2) {

            //esto se puede mejorar muchisimo con condiciones y generacion de excepciones pero se haran
            // en los futuros ejercicios para no sobrecargar de codigo las practicas

            System.out.println("Por favor Intruduzca su nombre");
            name = scanner.nextLine();

            System.out.println("Por favor Ingrese su edad");
            age = scanner.nextInt();

            System.out.println("Por favor Ingreso su DNI");
            dni = scanner.nextInt();

            System.out.println("");

            System.out.println("Su nombre es: ".concat(name));
            System.out.println("Su edad es: " .concat(String.valueOf(age)));
            System.out.println("Su DNI es: ".concat(String.valueOf(dni)));
            System.out.println("");

            System.out.println("Pulse enter para repetir el proceso");
            iniciarElPrograma=scanner.nextLine();
            iniciarElPrograma=scanner.nextLine();
        }
*/
    }
}
