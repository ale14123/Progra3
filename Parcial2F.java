public class Parcial2F {
    private Parcial2N fuente1, fin1, inicio1, inicio2, inicio3, inicio4, fuente2, fin2;
    int tam;
    String invert, da;
    boolean prueba1 = true;
    boolean prueba2 = true;
    boolean prueba3 = true;

    public Parcial2F(){
        inicio1 = null;
        inicio2 = null;
        fuente1 = null;
        fin1 = null;


        inicio3 = null;
        invert = "";
        da = "";


        fuente2 = null;
        fin2 = null;
        inicio4 = null;
        tam = 0;
    }
    
    public void push1(String valor){
        Parcial2N nuevo = new Parcial2N(valor);
        if(fuente1 == null){
            fuente1 = nuevo;
        }else{
            fin1.siguiente = nuevo;            
        }        
        fin1 = nuevo;       
    }

    public String pop1(){
        String aux = fuente1.dato;
        fuente1 = fuente1.siguiente;        
        return aux;
    }

    public void push2(String valor){
        Parcial2N nuevo = new Parcial2N(valor);
        nuevo.siguiente = inicio1;
        inicio1 = nuevo;       
    }

    public String pop2(){
        String aux = inicio1.dato;
        inicio1 = inicio1.siguiente;
        return aux;
    }

    public void push3(String valor){
        Parcial2N nuevo = new Parcial2N(valor);
        nuevo.siguiente = inicio2;
        inicio2 = nuevo;       
    }

    public String pop3(){
        String aux = inicio2.dato;
        inicio2 = inicio2.siguiente;
        return aux;
    }

    public void pop4(){
        while (fuente1 != null) {
            pop1();  
        }
        while (inicio1 != null) {
            pop2();
        }
        while (inicio2 != null) {
            pop3();
        }
    }

    public void game(){
        Parcial2N aux = fuente1;
        while(aux != null){                                          
            switch (aux.dato) {
                case "(":
                    push2(aux.dato); 
                    break;
                case ")":
                    if (inicio1 == null) {
                        prueba1 = false;
                    }else{
                        pop2();
                    }
                    break;
                case "{":
                    push3(aux.dato); 
                    break;
                case "}":
                    if (inicio2 == null) {
                        prueba1 = false;
                    }else{
                        pop3();
                    }
                    break;    
                default:
                    prueba2 = false;
                    break;
                }
            if (prueba1 == false || prueba2 == false) {
               break; 
            } 
            aux=aux.siguiente;    
        }
        if (prueba1 == true && inicio1 == null && prueba2 == true && inicio2 == null) {
            System.out.println(true);
            System.console().readLine("Presione enter para continuar...");
        }else{
            System.out.println(false);
            System.console().readLine("Presione enter para continuar...");
        }
        pop4();
    }



    public String quit(){
        String aux = inicio3.dato;
        inicio3 = inicio3.siguiente;
        return aux;
    }

    public void pop5(){
        while (inicio3 != null) {
            quit();
        }
    }    

    public void push21(String dato){
        Parcial2N nuevo = new Parcial2N(dato);
        nuevo.siguiente = inicio3;
        inicio3 = nuevo;
    }

    public void push22(String DatoNormal){
        Parcial2N aux = inicio3;   
        String n;
        while(aux != null){                                
            n = aux.dato;                
            invert = invert + n;
            aux=aux.siguiente;    
        }

        System.out.println("Dato invertido:");
        System.out.println(invert);
        System.out.println(invert.length());
        if(DatoNormal == invert){
            System.out.println("Es un palíndromo");
        }else{
            System.out.println("No es un palíndromo");
        }
        pop5();
    }


    public void push4(String valor){
        Parcial2N nuevo = new Parcial2N(valor);
        if(fuente2 == null){
            fuente2 = nuevo;
        }else{
            fin2.siguiente = nuevo;            
        }        
        fin2 = nuevo;       
    }

    public String pop6(){
        String aux = fuente2.dato;
        fuente2 = fuente2.siguiente;        
        return aux;
    }

    public void push5(String valor){
        Parcial2N nuevo = new Parcial2N(valor);
        nuevo.siguiente = inicio4;
        inicio4 = nuevo;       
    }

    public String pop7(){
        String aux = inicio4.dato;
        inicio4 = inicio4.siguiente;
        return aux;
    }

    public void pop8(){
        while (fuente2 != null) {
            pop6();  
        }
        while (inicio4 != null) {
            pop7();
        }
    }

    public void dupli(){
        Parcial2N aux = fuente2;
        while(aux != null){                                          
            switch (aux.dato) {
                case "(":
                    if (tam == 1) {
                        push5(aux.dato); 
                        tam = 0;
                    }else{
                        if (tam == 0) {                        
                            push5(aux.dato); 
                           tam = tam + 1;                        
                       } 
                    }                                       
                    break;
                case ")":
                if (tam == 1) {
                    prueba3 = false;
                }else{
                    if (inicio4 == null) {
                        prueba3 = false;
                    }else{
                        pop7();
                    }
                }
                    break;                 
                default:
                    
                    break;
                }
            if (prueba3 == false){
               break; 
            } 
            aux=aux.siguiente;    
        }
        if (prueba3 == true && inicio4 == null) {
            System.out.println(true);
            System.console().readLine("Presione enter para continuar...");
        }else{
            System.out.println(false);
            System.console().readLine("Presione enter para continuar...");
        }
        pop8();
    }
}
