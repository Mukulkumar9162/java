import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        for(char c=sc.next().charAt(0); c<='z';){
            System.out.println(c++);
        }
        // for(char c='A';c<='Z';c++);
        // System.out.println(c);
    }
}
