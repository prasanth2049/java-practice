import java.util.Scanner;
class ForLoop
{
        public static void main(String...arg) {
        //System.out.println("Enter tent number");
        Scanner sc = new Scanner(System.in);
        int tent = sc.nextInt(); {
        int[] arr = new int[tent];
        int total = 0;

        for(int i=0; i<arr.length; i++){
        arr[i] = sc.nextInt();
        total = total + arr[i];
                                                
        }
        System.out.println(total);          
                                }
                                }
								}
