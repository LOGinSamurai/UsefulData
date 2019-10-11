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
/// {
"coord": {
"lon": -0.13,
"lat": 51.51
},
"weather": [
{
"id": 310,
"main": "Drizzle",
"description": "light intensity drizzle rain",
"icon": "09n"
},
{
"id": 500,
"main": "Rain",
"description": "light rain",
"icon": "10n"
}
],
"base": "stations",
"main": {
"temp": 288.47,
"pressure": 1005,
"humidity": 100,
"temp_min": 287.04,
"temp_max": 290.37
},
"visibility": 9000,
"wind": {
"speed": 8.7,
"deg": 220,
"gust": 13.9
},
"clouds": {
"all": 75
},
"dt": 1570815988,
"sys": {
"type": 1,
"id": 1412,
"message": 0.0138,
"country": "GB",
"sunrise": 1570774610,
"sunset": 1570814253
},
"timezone": 3600,
"id": 2643743,
"name": "London",
"cod": 200
}
