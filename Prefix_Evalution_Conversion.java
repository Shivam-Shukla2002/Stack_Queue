import java.io.*;
import java.util.*;

public class Prefix_Evalution_Conversion {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        // code
        Stack<Integer> vs = new Stack<>();
        Stack<String> is = new Stack<>();
        Stack<String> ps = new Stack<>();

        for (int i = exp.length() - 1; i >= 0; i--) {
            char ch = exp.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                int v1 = vs.pop();
                int v2 = vs.pop();
                int val = operation(v1, v2, ch);
                vs.push(val);

                String is1 = is.pop();
                String is2 = is.pop();
                String isval = "(" + is1 + ch + is2 + ")";
                is.push(isval);

                String ps1 = ps.pop();
                String ps2 = ps.pop();
                String psval = "(" + ps1 + is2 + ch + ")";
                ps.push(psval);

            } else {
                vs.push(ch - '0');
                is.push(ch + "");
                ps.push(ch + "");
            }
        }
        System.out.println(vs.pop());
        System.out.println(is.pop());
        System.out.println(ps.pop());
    }

    public static int operation(int v1, int v2, char ch) {
        if (ch == '+') {
            return v1 + v2;
        } else if (ch == '-') {
            return v1 - v2;
        } else if (ch == '*') {
            return v1 * v2;
        } else {
            return v1 / v2;
        }

    }
}
