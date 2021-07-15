import java.util.ArrayList;

public class House implements IHouse{
    private String address;
    private ArrayList<Flat> flatList;

    @Override
    public void addFlat(Flat flat) {
        if (flatList == null) flatList = new ArrayList<Flat>();
        flatList.add(flat);

    }

    public String getAddress() {
        return address;
    }

    public ArrayList<Flat> getFlatList() {
        return flatList;
    }

    public House(String address) {
        this.address = address;
    }
}
