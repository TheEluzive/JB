import java.util.ArrayList;

public class City implements ICity {
    private String name;
    private ArrayList<House> houseList;

    @Override
    public void showSettledList() {

    }

    @Override
    public void addHouse(House house) {
    if (houseList == null) houseList = new ArrayList<House>();
    houseList.add(house);
    }
}
