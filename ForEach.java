import java.util.Scanner;
class ForEach
{
        public static void main(String...arg) {
        Scanner sc = new Scanner(System.in);
        int tent = sc.nextInt(); {
        int[] arr = new int[tent];
        int total = 0;

        for( int i:arr){
        i = sc.nextInt();
        total = total + i;
                                                
        }
        System.out.println(total);          
                                }
                                }
}
