import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
/**
 * Write a description of class EntradaUnionAgrupo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaUnionAGrupo extends Entrada
{
    private String grupo;
    
    /**
     * Constructor for objects of class EntradaUnionAgrupo
     */
    public EntradaUnionAGrupo(String usuario, String grupo)
    {
        super(usuario);
        this.grupo = grupo;
    }


    public String toString()
    {
        String cadenaADevolver = "";
        
        cadenaADevolver += super.toString();
        
        cadenaADevolver += "Se ha unido al grupo " + grupo + "\n";   
        
        return cadenaADevolver;        
    }
    
    
    public void mostrar()
    {
        System.out.println(this);
    }
        
}
