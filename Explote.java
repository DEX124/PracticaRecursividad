/**
 * @author (Diego Hernández, Daniel Mora Mora)
 * @version (17-06-21)
 */
public class Explote
{
    String result;
    public Explote(){result="";}
    public String explote(int n, int b){
        if(b>=n){
            result+=" "+n/b;
            return result;}
        else{
            int n1=n/b;
            int n2=n-n1;
            result+=" "+n1;
            return explote(n2,b);
        }
    }
    public static void main(String a[]){
        Explote p=new Explote();
        p.explote(100,4);
        System.out.println(p.result);
    }
}
