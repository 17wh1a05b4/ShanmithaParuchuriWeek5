package Week5;

import java.util.Scanner;
import java.util.logging.Logger;
public class codeInterest {
//static variable
static Logger l = Logger.getLogger(codeInterest.class.getName());
public static void Int() {
@SuppressWarnings("abc")
Scanner sc = new Scanner(System.in);
l.info("Principal Amount?");
try {
double pa=sc.nextDouble();
l.info("Time Period?");
double tp = sc.nextDouble();
l.info("Rate of Interest?:");
double r=sc.nextDouble();

l.info("SI :"+(pa*tp*r)/100);
l.info("CI :"+((pa*Math.pow(+(r/100),tp))-pa));

}
catch (Exception e) {
l.info("Invalid Choice!");
}


}

}
