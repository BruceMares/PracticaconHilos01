
public class Hilos {
    private int numeros;

    public Hilos(int n) {
        this.numeros = n;}

    public void run () {
        int prod = 1;
        for(int i=numeros; i > 0; i--){
            prod = prod * i;
        }
        System.out.println(Thread.currentThread().getName() + ":" + prod);
    }
}

