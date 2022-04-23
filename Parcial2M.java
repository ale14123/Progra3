import java.util.Scanner;
public class Parcial2M {
    Scanner in = new Scanner(System.in);
    Parcial2F ej = new Parcial2F();

    public static void main(String[] args) {
        Parcial2M mai = new Parcial2M();
        mai.menu();
    }

    public void menu(){
        boolean exit = false;
        int option;
       
        while(!exit){
            System.out.println("Escoja una opción:");
            System.out.println("1. Primera serie");
            System.out.println("2. Segunda serie");
            System.out.println("3. Tercera serie");
            System.out.println("4. Salir");
            option = in.nextInt();
            switch(option){
                case 1:
                    Primero();
                    break;
                case 2:
                    Segundo();
                    break;
                case 3:
                    Tercero();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("No existe esa opción");
            }
        }
    }

    public void Primero(){
        String elemento;
        String c;
        System.out.println("Ingresar la cadena de parentesis y llaves");
        elemento = System.console().readLine();
        for (int i = 0; i < elemento.length(); i++) {
            char elemento1 = elemento.charAt(i);
            c = "";
            c = c + elemento1;
            ej.push1(c);                              
        }
        System.out.println("Entrada:");
        System.out.println(elemento);
        System.out.println("Salida:");
        ej.game();
    }

    public void Segundo(){
        String elemento;
        String c;
        System.out.println("Ingrese el palindromo a evaluar");
        elemento = System.console().readLine();
        elemento = elemento.replace(" ", "");
        for (int i = 0; i < elemento.length(); i++) {
            char elemento1 = elemento.charAt(i);
            c = "";
            c = c + elemento1;
            ej.push21(c);           
        }        
        ej.push22(elemento);    
    }

    public void Tercero(){
        String elemento;
        String c;
        System.out.println("Ingrese la cadena de parentesis");
        elemento = System.console().readLine();
        for (int i = 0; i < elemento.length(); i++) {
            char elemento1 = elemento.charAt(i);
            c = "";
            c = c + elemento1;
            ej.push4(c);                              
        }
        System.out.println("Entrada:");
        System.out.println(elemento);
        System.out.println("Salida:");
        ej.dupli();
    }    
}
