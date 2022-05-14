package lab10.Exercise3;

//Create 2 counters implemented using threads. First counter is incremented from 0 to 100. 
//Second counter is incremented from 100 to 200 and start only after the first counter finish it's job.

public class Exercise3 extends Thread {
    Thread t;
    static int initialValue = 0;

    Exercise3(String name, Thread t){
        super(name);
        this.t = t;
    }

    public void run(){

        if(t != null) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for(int i = 0; i < 100; i++){
            System.out.println(getName() + " i = " + i);
            initialValue++;
        }
        System.out.println(getName() + " finished the job and reached " + initialValue);
    }

    public static void main(String[] args) {
        Exercise3 c1 = new Exercise3("Counter 1", null);
        Exercise3 c2 = new Exercise3("Counter 2", c1);

        c1.start();
        c2.start();
    }
}