public class Hilos implements Runnable{
    private int Num;

    public Hilos(int n) {
        this.Num = n;}

    public void run () {
        int prod = 1;
        for(int i=Num; i > 0; i--){
            prod = prod * i;
        }
        System.out.println(Thread.currentThread().getName() + ":" + prod);
    }
}


