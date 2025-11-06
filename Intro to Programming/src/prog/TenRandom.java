package prog;
public class TenRandom {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.round(Math.random() * 100));
        }
    }
}
