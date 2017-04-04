import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner s = null;
        try {
            s = new Scanner(System.in);
            Integer int1 = null;
            Integer int2 = null;
            while (s.hasNext()) {
                String input = s.next();
                System.out.println(input);
                //turn the string they give you into and integer so we can save em to vars.
                if (int1 == null) {
                    try{
                        int1 = Integer.parseInt(input);
                    } catch (NumberFormatException e){
                        System.out.println("invalid input '" + input + "' try a number");
                    }
                } else if (int2 == null) {

                    try{
                        int2 = Integer.parseInt(input);
                        System.out.println(int1 + " " + input);
                    } catch (NumberFormatException e){
                        System.out.println("invalid input '" + input + "' try a number");
                    }
                } else {
                    if (input.equals("+")){
                        int1 = int1 + int2;
                        System.out.println(int1);
                        int2 = null;

                    }else if (input.equals("-")){
                        int1 = int1 - int2;
                        System.out.println(int1);
                        int2 = null;

                    } else if (input.equals("*")){
                        int1 = int1 * int2;
                        System.out.println(int1);
                        int2 = null;
//                    } else if (input.equals("/")){
//                        int1 = (int1 / int2);
//                        int2 = null;
                    }
                    else {
                        System.out.println("Your input was " + input + " requires an operator");
                    }
                }
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
}

