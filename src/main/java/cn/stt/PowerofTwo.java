package cn.stt;

/**
 * Given an integer, write a function to determine if it is a power of two.
 * 判断一个数是否是2的幂
 *
 * @Author shitongtong
 * <p>
 * Created by shitongtong on 2018/3/22.
 */
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        while (n != 1) {
            if (n % 2 != 0 || n / 2 == 0) {
                return false;
            }
            n/=2;
        }
        return true;
    }
}
