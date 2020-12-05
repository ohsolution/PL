import java.util.*;


class Main{


public static void main(String[] args) {
class Inner{
Integer StringLength(Object obj){
if(obj instanceof String){
return ((String)obj).length();
}return null;
}

}
System.out.println ( new Inner().StringLength ( "String" ) );
System.out.println ( new Inner().StringLength ( 123 ) );

}
}