package Week5;

import java.util.Scanner;
import java.util.logging.Logger;

public class Cons {
static Logger l = Logger.getLogger(Cons.class.getName());
public static void costPrediction() {
Scanner sc = new Scanner(System.in);
l.info("Select reqd material: ");
l.info("1.Standard materials");
l.info("2.High standard materials");
l.info("3.Very High standard materials");
try {
int ch = sc.nextInt();
l.info("Area of house?");
switch(ch)
{
case 1:
l.info("price = "+sc.nextDouble() * 1200 +" INR");
break;
case 2:
l.info("price = "+sc.nextDouble() * 1500 +" INR");
break;
case 3:
l.info("price = "+sc.nextDouble() * 1800 +" INR");
break;
default:
l.info("Invalid Choice");
}
} catch (Exception e) {
l.info("Invalid Choice");
}
}
}