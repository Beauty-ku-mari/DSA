import java.util.*;
public class p4 {
    public static void main(String args[]){
// print  the sum of First n natural number//
Scanner sc = new Scanner(System.in);
int n= sc.nextInt();

int sum =0;
for(int i=1; i<=n; i++){
sum=sum+i;
}
System.out.println(sum);
}
}
