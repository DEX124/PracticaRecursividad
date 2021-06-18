
import java.util.Scanner;
public class Pregunta3_2version
{
    String result="";
    public InversoSimple(){
        result="";
    }
    public String elimineRepeticiones(String n){
        char[] val=n.toCharArray();
        char[] res=new char[val.length];
        res[0]=val[0];
        for(int i=1;i<val.length;i++){
            if(val[i-1]!=val[i]){res[i]=val[i];}
        }
        String str=String.valueOf(res);
        return str;
    }
    public String deInverso(String p){
        char[] arr=p.toCharArray();
        char[] array=new char[arr.length-1];
        if(p.length()==1){
            result+=p;
            return result;
        }
        else{
            for(int i=0;i<p.length()-1;i++){array[i]=arr[i];}
            result+=String.valueOf(arr[arr.length-1]);
            String str=String.valueOf(array);
            return deInverso(str);
        }
    }
    public static void main(String a[]){
        Pregunta3_2version p=new Pregunta3_2version();
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese una hilera de caracteres: ");
        String entrada=sc.nextLine();
        System.out.println("El inverso sin repeticiones de la hilera es: ");
        System.out.println(p.deInverso(p.elimineRepeticiones(entrada)));
    }
}
