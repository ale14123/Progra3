public class Parcial_Progra1{
    private static int[] Numeros_Arreglo;
    public static void main(String[] args) {
        Numeros_Arreglo = new int[10];
        menu_Inicial();
    }

    public static void menu_Inicial(){
        String ingreso;
        System.out.println("Puede escoger una de las opciones del menú: ");
        System.out.println("1. Ingresar 10 números");
        System.out.println("2. Mostrar valores");
        System.out.println("3. Mostrar ordendado ascendente");
        System.out.println("4. Mostrar ordenado descendente");
        System.out.println("5. Salir");
        ingreso = System.console().readLine();

        
        switch (ingreso) {
            case "1":
                getNums();
                break;
            case "2":
                System.out.println("Todavía no se han ingresado datos, debe de ingresarlos primero");
                System.console().readLine("Presione enter para continuar...");
                menu_Inicial();      
                break;
            case "3":
                System.out.println("Todavía no se han ingresado datos, debe de ingresarlos primero");
                System.console().readLine("Presione enter para continuar...");
                menu_Inicial();           
                break;
            case "4":
                System.out.println("Todavía no se han ingresado datos, debe de ingresarlos primero");
                System.console().readLine("Presione enter para continuar...");
                menu_Inicial();
                break;
            case "5":
                
                break;
        
            default:
                System.out.println("Error al escoger");
                System.console().readLine("Intentelo de nuevo...");
                menu_Inicial();                          
                break;
        } 
    }

    public static void menu_Final(){
        String ingreso;
        System.out.println("Puede escoger una de las opciones del menú: ");
        System.out.println("1. Ingresar 10 números");
        System.out.println("2. Mostrar valores");
        System.out.println("3. Mostrar ordendado ascendente");
        System.out.println("4. Mostrar ordenado descendente");
        System.out.println("5. Salir");
        ingreso = System.console().readLine();

        switch (ingreso) {
            case "1":
                getNums();
                break;
            case "2":
                Mostrar();
                break;
            case "3":
                Ascendente();   
                break;
            case "4":
                Descendente();
                break;
            case "5":
                
                break;
        
            default:
                System.out.println("Error al escoger");
                System.console().readLine("Intentelo de nuevo...");
                menu_Final();                          
                break;
        }
    }

    public static void getNums(){
        String Dato;
        for (int i = 0; i < Numeros_Arreglo.length; i++) {
            try {
                Dato = System.console().readLine("Número: ");
                Numeros_Arreglo[i] = Integer.parseInt(Dato);
                
                } catch (Exception e) {
                    System.console().readLine("ERROR al ingresar los datos, pruebe de nuevo...");
                    getNums();
                }       
        }
        System.out.println("Se han ingresado todos los datos correctamente.");
        menu_Final();
    }

    public static void Descendente(){
        int Dato;
        for(int i = 1; i < Numeros_Arreglo.length; i++){
            for(int j = Numeros_Arreglo.length-1; j >= i; j--){
                if(Numeros_Arreglo[j] > Numeros_Arreglo[j-1]){
                    Dato = Numeros_Arreglo[j];
                    Numeros_Arreglo[j] = Numeros_Arreglo[j-1];
                    Numeros_Arreglo[j-1] = Dato;
                }
            }
        }
        for(int i = 0; i < Numeros_Arreglo.length;i++)
        System.out.println(Numeros_Arreglo[i]);
        System.console().readLine("Presione enter para continuar...");
        menu_Final();
    }

    public static void Ascendente(){
        int Dato;
        for(int i = 1; i < Numeros_Arreglo.length; i++){
            for(int j = Numeros_Arreglo.length-1; j >= i; j--){
                if(Numeros_Arreglo[j] < Numeros_Arreglo[j-1]){
                    Dato = Numeros_Arreglo[j];
                    Numeros_Arreglo[j] = Numeros_Arreglo[j-1];
                    Numeros_Arreglo[j-1] = Dato;
                }
            }
        }
        for(int i = 0; i < Numeros_Arreglo.length;i++)
        System.out.println(Numeros_Arreglo[i]);
        System.console().readLine("Presione enter para continuar...");
        menu_Final();
    }


    public static void Mostrar(){
        for(int i = 0; i < Numeros_Arreglo.length;i++)
        System.out.println(Numeros_Arreglo[i]);
        System.console().readLine("Presione enter para continuar...");
        menu_Final();
    }

}