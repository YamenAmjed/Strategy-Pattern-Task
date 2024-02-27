import java.util.ArrayList;

public class ArrayProcessor {
    //Sort
    SortAlgo sor ;
    public ArrayProcessor(SortAlgo sor)
    {
        this.sor =  sor ;

    }
    public  void sort(ArrayList<Integer> x )
    {
        sor.Sort();
    }
    //Search
    SearchAlgo sea ;
    public ArrayProcessor(SearchAlgo sea)
    {
        this.sea = sea ;
    }
    public void search(ArrayList<Integer> x )
    {
        sea.Search() ;
    }
}
