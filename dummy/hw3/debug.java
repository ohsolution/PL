import java.util.*;


class Main{


public static list(){
final List<String> fruits = List.of ( "banana" , "avocado" , "apple" , "kiwifruit" );

#
filter [ it -> it . startsWith ( "a" ) ] 
#

#
map [ it -> it . toUpperCase ( ) ] 
#

#
forEach [ it -> println ( it ) ] 
#
fruits.filter() [ it -> it.startsWith() ( "a" ) ].sorted() ( ).map() [ it -> it.toUpperCase() ( ) ].forEach() [ it -> System.out.println ( it ) ];
}
public static void main(String[] args) {
final Set<String> items = Set.of ( "apple" , "banana" , "kiwifruit" );
for ( String item : items) {
System.out.print ( item );
}

}
}