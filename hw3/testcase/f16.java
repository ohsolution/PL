import java.util.*;


class Main{


public static void main(String[] args) {
final List<String> list = List.of ( "a" , "b" , "c" );
if(!( 0 <= -1 && -1 <= (list.size()-1) )){
System.out.println ( "-1 is out of range" );
}if(!( 0 <= list.size() && list.size() <= (list.size()-1) )){
System.out.println ( "list size is out of valid list indices range, too" );
}
}
}