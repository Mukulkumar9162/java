import java.util.Scanner;

public class forloop2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       
       for( int c=97,i=26;c<=122 &&i>0;c++,c--){
        System.out.println((char)c+" "+i);
     }
    }
}
