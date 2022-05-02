package PackageJava;

import java.util.Scanner;

public class Exercicio {
public static void main(String[] args) {
int a=1,b=1,c,n,i;
Scanner scan = new Scanner(System.in);
System.out.println("informe o valor de n:");
n = scan.nextInt();
scan.close();

c=a+b;
for(i=1; i<=n; i++) {
System.out.println(a);
a=b;
b=c;
c=a+b;
}
}
}
