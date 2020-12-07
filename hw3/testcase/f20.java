import java.util.*;


class Main{


public static void main(String[] args) {
final List<String> fruits = List.of ( "banana" , "avocado" , "apple" , "kiwifruit" );
fruits.stream(). filter ( it -> it.startsWith ( "a" ) ).sorted ( ).map ( it -> it.toUpperCase ( ) ).forEach ( it -> System.out.println ( it ) );

}
}