package my.demo;
import java.util.*;


class Main{


public static Integer parseInt(String str){
return str.toIntOrNull ( );
}
public static void printProduct(String arg1,String arg2){
final Integer x = parseInt ( arg1 );
final Integer y = parseInt ( arg2 );
if(x != null && y != null){
System.out.println ( x * y );
}else System.out.println ( arg1 + " or " + arg2 + " is not a number" );
}
public static void main(String[] args) {
printProduct ( "6" , "7" );
printProduct ( "a" , "7" );
printProduct ( "a" , "b" );

}
}