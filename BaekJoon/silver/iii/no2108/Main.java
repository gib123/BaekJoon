package silver.iii.no2108;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int N = nextInt();
        int[] num = new int[8001];
        for (int i = 0; i < N; i++) {
            num[nextInt() + 4000]++;
        }

        int count = 0;
        int sum = 0;
        int med = 0;
        int mode = 0;
        int modeCount = 0;
        boolean isSameMode = false;
        int range = 0;
        for (int i = 0; i < 8001; i++) {
            if (num[i] > 0) {
                int value = i - 4000;
                if (num[i] == modeCount && isSameMode) {
                    mode = value;
                    isSameMode = false;
                }
                if (num[i] > modeCount) {
                    mode = value;
                    modeCount = num[i];
                    isSameMode = true;
                }
                for (int j = 0; j < num[i]; j++) {
                    count++;
                    sum += value;
                    if (count == (N / 2 + 1)) med = value;
                    if (count == N) range += value;
                    if (count == 1) range -= value;
                }
            }
            if (count == N) break;
        }

        int avg = (int)Math.round((double)sum / N);
        System.out.println(avg + "\n" + med + "\n" + mode + "\n" + range);
    }

    public static int nextInt() throws IOException {
        int n = 0;
        boolean isNeg = false;
        while (true) {
            int input = System.in.read();
            if (input == '-') isNeg = true;
            else if (input >= '0' && input <= '9') {
                n = (n << 3) + (n << 1) + (input & 15);
            } else return (isNeg) ? n * (-1) : n;
        }
    }
}