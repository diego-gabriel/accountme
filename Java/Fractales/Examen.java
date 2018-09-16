
public class Examen
{
    public boolean poemaMat(int n,String p){
        return poemaMat(n,p,p.length()-1);
    }
    private boolean poemaMat(int n,String p,int i){
        if(n/10==0) 
            return n%10==cantidadCaracteres(p,i);
        else{
            if(n%10==cantidadCaracteres(p,i))
                return poemaMat(n/10,p,i-cantidadCaracteres(p,i)-1);
            else
                return false;
            }
    }   
    private int cantidadCaracteres(String p,int i ){
        if(i==0)
            return 1;
        if(p.charAt(i)==' ')
            return 0;
        else
            return 1+cantidadCaracteres(p,i-1);
    }
     public int kotch(int nivel){
        if(nivel==1)
            return 1;
        else
            return kotch(nivel-1)+pow(2,nivel*2-2);
    }
    private int pow(int a,int b){
        if(b==0)
        return 1;
        if(b==1)
        return a;
        else
        return a*pow(a,b-1);
    }
   
    
   
}
