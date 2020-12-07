import java.util.*;


class Main{


public static void main(String[] args) {
final List<String> items = List.of ( "apple" , "banana" , "kiwifruit" );
int index = 0;
while(index < items.size()){
System.out.println ( "item at " + index + " is " + items.get( index ) );
index ++;

}

}
}