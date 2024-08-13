package PrepareTest;

public class PrintOdd {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 2;j++){
                System.out.print(num + " ");
                num += 2;
            }
            System.out.println();
        }
    }
}
