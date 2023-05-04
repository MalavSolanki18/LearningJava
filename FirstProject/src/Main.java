public class Main 
{
    public static void main(String[] args) {
    
            int a=5;
            int b=1;
            int c=3;
            int re = (a>b)? (b>c? c:b):(a>c? c:a);
            System.out.println(re);

            if(a>c){
                System.out.println("a is big");
            }
            else{
                System.out.println("a is small");
            }
}  
}
