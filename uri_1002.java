import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

public class uri_1002 {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        Double R = Double.parseDouble(in.readLine());

        Double pi = 3.14159;

        R = Math.pow(R, 2);

        var a = pi * R;

        System.out.printf("A=%.4f", a);
    }
}
