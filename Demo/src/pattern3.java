import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

            if(n%2==0){
                int m=(n/2);
                for(int j=0;j<n;j++){
                    if(j==m){
                        for(int k=0;k<n+1;k++){
                        System.out.print("*");
                        }
                    }
                    else{
                        for(int k=0;k<n+1;k++){
                            if(k==0 || k==n){
                                System.out.print("*");
                            }
                            else{
                                System.out.print(" ");
                            }
                        }
                    }
                 
                    System.out.println();
                }
                
            }
            else{
                int m=(n-1)/2;
                for(int j=0;j<n;j++){
                    if(j==m){
                        for(int k=0;k<n+1;k++){
                        System.out.print("*");
                        }
                    }
                    else{
                        for(int k=0;k<n+1;k++){
                            if(k==0 || k==n){
                                System.out.print("*");
                            }
                            else{
                                System.out.print(" ");
                            }
                        }
                    }
                 
                    System.out.println();
                }    
            }
        }
}
