import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner s = null;
        try {
            s = new Scanner(System.in);
            Double oper1 = null;
            Double oper2 = null;
            while (s.hasNext()) {
                String input = s.next();
                System.out.println(input);
                //turn the string they give you into and integer so we can save em to vars.
                if (oper1 == null) {
                    try{
                        oper1 = Double.parseDouble(input);
                    } catch (NumberFormatException e){
                        System.out.println("invalid input '" + input + "' try a number");
                    }
                } else if (oper2 == null) {

                    try{
                        oper2 = Double.parseDouble(input);
                        System.out.println(oper1 + " " + input);
                    } catch (NumberFormatException e){
                        System.out.println("invalid input '" + input + "' try a number");
                    }
                } else {
                    if (input.equals("+")){
                        oper1 = oper1 + oper2;
                        oper2 = null;

                    }else if (input.equals("-")){
                        oper1 = oper1 - oper2;
                        oper2 = null;

                    } else if (input.equals("*")){
                        oper1 = oper1 * oper2;
                        oper2 = null;
                    } else if (input.equals("/")){
                        oper1 = oper1 / oper2;
                        oper2 = null;
                    }
                    else {
                        System.out.println("Your input was " + input + " requires an operator");
                    }
                }

                if (oper1 != null){
                    System.out.print(oper1);
                }
                if (oper2 != null){
                    System.out.print(", " + oper2);
                }
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
}

