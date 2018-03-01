package interview;

/**
 * @author amruta.kajrekar
 */
public class sample2 {

    public static void main(String[] args){
     sample2 s = new sample2();
        s.divide(4,0);
    }


    public int divide(int a, int b){

        int c=-1;
        try{
            c=a/b;
        }catch(Exception e){
            System.err.print("Exception ");
        }finally{
            System.err.println("Finally ");
        }
        return c;
    }

}
