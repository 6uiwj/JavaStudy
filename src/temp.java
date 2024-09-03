
public class temp {

   public static int swap(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
        return a;

    }

    public static void main(String[] args) {
        int j;
        int k;
        k=3;
        j=2;
        int t = swap(k,j);

        System.out.println(t);
    }
}
