import java.util.ArrayList;

public class City implements ICity {
    private String name;
    private ArrayList<House> houseList;

    @Override
    public void showSettledList() {
        System.out.println("Город: " +name);
        if (houseList!=null){
            for (House house: houseList
                 ) {
                System.out.println("Адрес: "+house.getAddress());
                for (Flat flat:house.getFlatList()
                     ) {
                    System.out.println("Квартира: " +flat.getNumber());
                    if (flat.getSettlerList() != null)
                    for (Settler settler:flat.getSettlerList()
                         ) {
                        System.out.println(settler.getName());

                    }
                    else System.out.println("Тут никто не живет");

                }

            }
        }
        else System.out.println("Заселите жильцов");

    }

    @Override
    public void addHouse(House house) {
        if (houseList == null) houseList = new ArrayList<House>();
        houseList.add(house);
    }

    public City(String name) {
        this.name = name;
    }
}
