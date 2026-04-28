import models.Results;
import java.util.concurrent.Callable;
public class BenchMarking {
    public static Results medirTiempo(Callable<Void> funcion){
        try{
            long inicio = System.nanoTime();
            funcion.call();
            long fin = System.nanoTime();
            long duracion= (fin - inicio)/1_000_000_000;
            Results results= new Results(duracion);
            return results;

        }catch(Exception e){
            throw new RuntimeException("Error en la funcion");//imprimime erro en rojo pero continua
           // System.out.println("error en la funcion");
           // return null;
        }
    }
    
}
