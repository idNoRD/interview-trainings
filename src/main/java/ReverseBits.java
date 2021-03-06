/**
 * Reverse bits of a given 32 bits unsigned integer.
 *
 * Example 1:
 *
 * Input: 00000010100101000001111010011100
 * Output: 00111001011110000010100101000000
 * Explanation: The input binary string 00000010100101000001111010011100 represents the unsigned integer 43261596, so return 964176192 which its binary representation is 00111001011110000010100101000000.
 *
 * Example 2:
 *
 * Input: 11111111111111111111111111111101
 * Output: 10111111111111111111111111111111
 * Explanation: The input binary string 11111111111111111111111111111101 represents the unsigned integer 4294967293, so return 3221225471 which its binary representation is 10111111111111111111111111111111.
 *
 *
 * Note:
 *
 * Note that in some languages such as Java, there is no unsigned integer type. In this case, both input and output will be given as signed integer type and should not affect your implementation, as the internal binary representation of the integer is the same whether it is signed or unsigned.
 * In Java, the compiler represents the signed integers using 2's complement notation. Therefore, in Example 2 above the input represents the signed integer -3 and the output represents the signed integer -1073741825.
 */
public class ReverseBits {

    public int reverseBits(int n) {
        int param = n;
        int reversed = 0;
        for (int j = 1; j<32; j++) {
            reversed >>= 1;
            if ((param & Integer.MIN_VALUE) != 0) { // 1000 0000 0000 0000 0000 0000 0000 0000
                reversed |= 1073741824; // 0100 0000 0000 0000 0000 0000 0000 0000
            }
            param<<=1;
        }
        if ((n & 1) == 1) {
            reversed |= Integer.MIN_VALUE;
        }
        return reversed;
    }

    public String showBits(int param) {
        int mask = 1 << 31;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 32; i++, param <<= 1) {
            sb.append((param & mask) ==
                    0 ? "0" : "1");
            if (i % 8 == 0)
                sb.append(" ");
        }
        return sb.toString();
    }
}
