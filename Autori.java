

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Autori {
    public static void main (String[] args) throws Exception {
        BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
        String[] shorten = num.readLine().split("-");
        String s = shorten[0].charAt(0) + "";
        for (int i = 1; i < shorten.length; i++) {
            s += shorten[i].charAt(0) + "";
        }
        System.out.println(s);
    }
}