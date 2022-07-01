import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something: ");
        String response = sc.nextLine();
        if(StringUtils.isNumeric(response)){
            System.out.println("Input is numeric.");
        }else{
            response = StringUtils.swapCase(StringUtils.reverse(response));
            System.out.println(response);
        }
    }
}
