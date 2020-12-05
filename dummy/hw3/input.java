import java.util.*;


class Main{

public static final int a = 1;
public static int b = 2;
public static double c = 3.14;
public static boolean d = true;

public static int minus(int a,int b){
return a - b;
}
public static Integer sum(int a,int b){
double p = 4.3;
double q = 2.3;
return a + b;
}
public static Integer StringLength(Object obj){
if(obj instanceof String){
return ((String)obj).length();
}return null;
}
public static void main(String[] args) {
System.out.println ( StringLength ( "String" ) );
System.out.println ( StringLength ( 123 ) ) ;;

}
}