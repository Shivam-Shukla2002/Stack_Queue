import java.io.*;
import java.util.*;

public class dummy {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // code
        for (int j = 0; j < n; j++) {

            String exp = br.readLine();
            Stack<Character> st1 = new Stack<>();
            Stack<Character> st2 = new Stack<>();

            for (int i = 0; i < exp.length(); i++) {
                char ch = exp.charAt(i);

                if (ch == 'A') {
                    st1.push(ch);
                } else if (ch == 'B') {
                    st2.push(ch);
                }
            }
            if (st1.size() > st2.size()) {
                System.out.println("Anirban");
            } else if (st1.size() < st2.size()) {
                System.out.println("Biswa");
            } else {
                System.out.println("Samay");
            }
            st1.clear();
            st2.clear();
        }
    }
}
