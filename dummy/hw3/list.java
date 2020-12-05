import java.util.*;


class Main{


public static void main(String[] args) {
final List<String> items = List.of ( "apple" , "banana" , "kiwifruit" );
final Set<String> sting = Set.of ( "ap" , "ba" , "ki" );
for ( String item : items) {
System.out.println ( item );
}
System.out.println ( );
for ( String stin : sting) {
System.out.println ( stin );
}

}
}