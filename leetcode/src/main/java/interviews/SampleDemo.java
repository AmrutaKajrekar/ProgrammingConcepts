package interviews;

/**
 * @author amruta.kajrekar on 7/25/18.
 */
public class SampleDemo implements Runnable {

  public Thread t;
  public String threadName;
  public SampleDemo(String threadName){
    this.threadName = threadName;
  }
  @Override
  public void run() {
    while(true){
      System.out.print(threadName);
    }
  }

  public void start(){
    if(t==null){
      t= new Thread(this, threadName);
      t.start();
    }
  }
}


class TestThread {

  public static void main(String[] args) {
//    SampleDemo A = new SampleDemo("A");
//    SampleDemo B = new SampleDemo("B");
//
//    B.start();
//    A.start();

//    try {
//      Float f1 = new Float("3.0");
//      int i = f1.intValue();
//      byte b = f1.byteValue();
//      double d = f1.doubleValue();
//      System.out.print(i+b+d);
//
//    } catch (NumberFormatException e) {
//      System.out.print("exception");
//    }
    String[] a = new String[] {"x"};

    try{

      System.out.print(doStuff(a));
    }catch(Exception e){
      System.out.print("Exe");
    }
    doStuff(a);
  }

   static int doStuff(String[] args) {
    return Integer.parseInt(args[0]);
  }
}
