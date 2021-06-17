
/**
 * Write a description of class Cuadrado here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cuadrado
{
    public static int cuadrado(int x){
        if(x==1){return x;}
        else{return cuadrado(x-1)+x+x-1;}
    }
    public static void main(String a[]){
        System.out.println(cuadrado(3));
        System.out.println(cuadrado(10));
    }
}
