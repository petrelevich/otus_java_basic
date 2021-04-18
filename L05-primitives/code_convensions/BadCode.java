package convensions;

public class BadCode {

    public static void main(String[] args) {
        int answer = 0;

        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {

                int r = i * j;
                String revers = reverse(r);
                int newb = Integer.parseInt(revers);
                if (newb == r) {
                    int answer1 = r;
                    if (answer1 > answer) answer = answer1;
                }
            }
        }
        System.out.println(answer);
    }

    private static String reverse(int result) {
        String str = String.valueOf(result);
        String revers = new StringBuffer(str).reverse().toString();
        return revers;
    }
}
