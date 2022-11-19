package Exceptions;

public class AlimentosFaltantes extends Exception {

     public AlimentosFaltantes(){
         super("Hay un Alimento que no se encuentra");
     }
     
     public AlimentosFaltantes(String Mg){
         super(Mg);
     }
}
