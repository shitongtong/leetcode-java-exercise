package cn.stt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author shitongtong
 * <p>
 * Created by shitongtong on 2018/3/22.
 */
public class PowerOfTwoTest {
    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);

            boolean ret = new PowerOfTwo().isPowerOfTwo(n);

            String out = booleanToString(ret);

            System.out.print(out);
        }
    }
}
