import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	long beforeTime = System.currentTimeMillis();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = reader.readLine().split(" ");
        float x = Float.parseFloat(input[0]);
        String operator = input[1];
        float x1 = Float.parseFloat(input[2]);

        switch (operator) {
            case "+":
                writer.write(x + " + " + x1 + " = " + (x + x1));
                break;
            case "-":
                writer.write(x + " - " + x1 + " = " + (x - x1));
                break;
            case "*":
                writer.write(x + " * " + x1 + " = " + (x * x1));
                break;
            case "/":
                if (x == 0 || x1 == 0) {
                    writer.write("False");
                } else
                    writer.write(x + " / " + x1 + " = " + (x / x1));
                break;
           default:
        	   writer.write("");
        }
        long afterTime = System.currentTimeMillis();
        long diffTimeSec = (afterTime - beforeTime);
        //System.out.println("실행 시간(ms): " + diffTimeSec);
        
        reader.close();
        writer.flush();
        writer.close();
        
    }
}
