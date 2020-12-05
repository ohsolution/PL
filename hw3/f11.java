import java.util.*;
import java.lang.*;

class Main{


public static Integer getStringLength(Object obj){
if(obj instanceof String){
return ((String)obj).length();
}return null;
}
public static void main(String[] args) {
class Inner{
void printLength(Object obj){
System.out.println ( obj + "string length is " + getStringLength ( obj ) );
}

}
new Inner().printLength ( "Incomprehensibilities" );
new Inner().printLength ( 1000 );
new Inner().printLength ( List.of ());

}
}
