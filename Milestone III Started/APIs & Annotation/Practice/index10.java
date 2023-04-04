import java.util.*;
import java.lang.*;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 *  Custom Annotation & Retrieving value using Reflection API
 */





//creation of annotation class defining it
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer
{
    String country () default "India";
    int age () default 34;

}

@CricketPlayer
class Virat 
{
    int innings;
    int runs;
    public Virat(int innings, int runs) {
        this.innings = innings;
        this.runs = runs;
    }
    
    public Virat() {
    }

    public int getInnings() {
        return innings;
    }
    public void setInnings(int innings) {
        this.innings = innings;
    }
    public int getRuns() {
        return runs;
    }
    public void setRuns(int runs) {
        this.runs = runs;
    }
    
    
}

class index10
{
    public static void main(String[] args) 
    {
        
        Virat v = new Virat();
        v.setInnings(300);
        v.setRuns(3000);
        System.out.println(v.getInnings());
        System.out.println(v.getRuns());

        Class c = v.getClass();
        Annotation a = c.getAnnotation(CricketPlayer.class);
        CricketPlayer cp = (CricketPlayer) a;
        String country = cp.country();
        System.out.println(country);

        int age = cp.age();
        System.out.println(age);
        
    }
}