
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author (Diego Hernández, Daniel Mora Mora)
 * @version (v.1 17/06/2021)
 */
public class Pregunta3
{
    public Pregunta3()
    {
    }
    
    public void inviertaAlSimple (String palabra,ArrayList inverso,int i)
    {   
        if(i == 0)
        {
            inverso.add(palabra.charAt(i));
            System.out.print(inverso);
        }
        else
        {
            if(palabra.charAt(i) != palabra.charAt(i-1))
            {
                inverso.add(palabra.charAt(i));
            }
            inviertaAlSimple(palabra,inverso,(i-1));
        }
    }
    
    public static void main (String args[])
    {
        System.out.println("Dé una hilera:");
        Scanner sc=new Scanner(System.in);
        String pal = sc.nextLine();
        int i = pal.length();
        ArrayList inversoSimple = new ArrayList();
        
        Pregunta3 prueba = new Pregunta3();
        
        System.out.println("La palabra inicial es: "+pal+"\n"+"Y su inverso simple es: ");
        prueba.inviertaAlSimple(pal,inversoSimple,i-1);
    }
}
