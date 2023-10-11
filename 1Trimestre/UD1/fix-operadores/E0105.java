package operadores;


public class E0105 {
    public static void main(String[] args) throws InterruptedException {
    
        short max = 32767;
        System.out.println("El valor short maximo es " + max );
        max++;

        Thread.sleep(1500);
        System.out.println("Si sumamos uno, da " + max );
        max--;

        Thread.sleep(1500);
        System.out.println("Y si volvemos a restar uno, da " + max );
 
    }    
}
