import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayProcessor array1 = new ArrayProcessor(new BinarySearch()) ;
        ArrayList<Integer> ls = new ArrayList() ;
        array1.search(ls);
        ArrayProcessor array2 = new ArrayProcessor(new BubbleSort()) ;
        array2.sort(ls); 

    }
}