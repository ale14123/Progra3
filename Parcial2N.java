public class Parcial2N {
    public String dato;
    public Parcial2N siguiente;
   
    public Parcial2N(String dato){
        this.dato = dato;
    }
   
    public Parcial2N(String dato, Parcial2N siguiente){
        this.dato = dato;
        this.siguiente = siguiente;
    }


    
    public int dato1;
    public Parcial2N siguiente1;
   
    public Parcial2N(int dato1){
        this.dato1 = dato1;
    }
   
    public Parcial2N(int dato1, Parcial2N siguiente1){
        this.dato1 = dato1;
        this.siguiente1 = siguiente1;
    }
}
