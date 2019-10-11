  public class Box {
	 public static Integer value = 0;
    public static void main(String[] args) {
        //Incrementer Obj1=new Incrementer();
        Decrementer Obj2=new Decrementer();
        Printer Obj3=new Printer();
         // Obj1.start();
	    Thread t = new Thread(Incrementer)
          Obj2.start();
          Obj3.start();
    }


}

 
class Incrementer implements Runnable {

    public void increment() {
        if (Box.value<=3) {
            Box.value++;}

    }

    public void run() {
        while (true) {
        increment();
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }


        }
    }
}


class Decrementer extends Thread {
    public void decrement() {
        if (Box.value>=-3) {
            Box.value--;
           
        }
    }

    public void run() {
        while (true) {
        decrement();
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        }
    }
}

class Printer extends Thread {
    public void print() {
        if (Box.value>=0) {System.out.println(Box.value);
                    }else  System.err.print(Box.value);
    }

    public void run() {
        while (true) {
            print();
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

///"{ \"name\": \"Ion\",\"age\":25 }"
