import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class uri_1001 {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(in.readLine());
        int B = Integer.parseInt(in.readLine());

        var X = A + B;

        System.out.printf("X = %d\n", X);
    }
}