package fb;

/**
 * Given a file and assume that you can only read the file using a given method read4,
 * implement a method to read n characters.
 * <p>
 * By using the read4 method, implement the method read that reads n characters from the file
 * and store it in the buffer array buf. Consider that you cannot manipulate the file directly.
 * <p>
 * The return value is the number of actual characters read.
 */
public class ReadNCharactersGivenRead4 {

    /**
     * File file("abcde"); // File is "abcde", initially file pointer (fp) points to 'a'
     * char[] buf4 = new char[4]; // Create buffer with enough space to store characters
     * read4(buf4); // read4 returns 4. Now buf = "abcd", fp points to 'e'
     * read4(buf4); // read4 returns 1. Now buf = "e", fp points to end of file
     * read4(buf4); // read4 returns 0. Now buf = "", fp points to end of file
     */
    private int read4(char[] buf) {
        // @TODO
        return buf.length;
    }

    /**
     * @param buf Destination buffer
     * @param n   Number of characters to read
     * @return The number of actual characters read
     */
    public int read(char[] buf, int n) {
        int c = 0;
        int i = 0;
        do {
            char[] r = new char[4];
            c = read4(r);
            if (c > 0) {
                for (int j = 0; j < c; j++) {
                    if (i < n) {
                        buf[i] = r[j];
                    } else {
                        return i;
                    }
                    i++;
                }
            } else {
                break;
            }

        } while (c != 0);
        return i;
    }

}
