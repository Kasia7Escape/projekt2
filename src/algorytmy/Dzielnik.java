package algorytmy;

public class Dzielnik {
    public static int dzielnik (int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return dzielnik(b, a % b);
        }

//iteracja:
  /*
    }
public static int dzielnik(int a, int b){
        while (b != 0) {
            int temp = a;
            a = b;b = temp % b;
        }
        return a; */
}
}


