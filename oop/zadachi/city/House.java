import java.util.ArrayList;

public class House implements IHouse{
    private String address;
    private ArrayList<Flat> flatList;

    @Override
    public void addFlat(Flat flat) {
        if (flatList == null) flatList = new ArrayList<Flat>();
        flatList.add(flat);

    }
}
