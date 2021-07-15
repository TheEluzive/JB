import java.util.ArrayList;

public class mainCity {
    public static void main(String[] args) {
        City moscow = new City("Москва");
        House house1 = new House("Иванова, д.5");
        House house2 = new House("Петрова, д.99");
        House house3 = new House("Павлова, д.14");
        House house4 = new House("Лапочкина, д.7");
        House house5 = new House("Королева, д.12");

        ArrayList<Settler> settlers = new ArrayList<>();
        for (int i =0; i < 15; i++){
            settlers.add(new Settler("name" + i));
        }

        ArrayList<Flat> flats = new ArrayList<>();
        for (int i=0; i < 10; i++){
            flats.add(new Flat(i));
        }

        flats.get(0).addSettler(settlers.get(0));
        flats.get(0).addSettler(settlers.get(1));
        flats.get(0).addSettler(settlers.get(2));
        flats.get(2).addSettler(settlers.get(3));
        flats.get(3).addSettler(settlers.get(4));
        flats.get(4).addSettler(settlers.get(5));
        flats.get(5).addSettler(settlers.get(6));
        flats.get(5).addSettler(settlers.get(7));
        flats.get(6).addSettler(settlers.get(8));
        flats.get(7).addSettler(settlers.get(9));
        flats.get(7).addSettler(settlers.get(10));
        flats.get(2).addSettler(settlers.get(11));
        flats.get(3).addSettler(settlers.get(12));
        flats.get(8).addSettler(settlers.get(13));
        flats.get(8).addSettler(settlers.get(14));


        house1.addFlat(flats.get(0));
        house1.addFlat(flats.get(1));
        house2.addFlat(flats.get(2));
        house2.addFlat(flats.get(3));
        house3.addFlat(flats.get(4));
        house3.addFlat(flats.get(5));
        house4.addFlat(flats.get(6));
        house4.addFlat(flats.get(7));
        house5.addFlat(flats.get(8));
        house5.addFlat(flats.get(9));

        moscow.addHouse(house1);
        moscow.addHouse(house2);
        moscow.addHouse(house3);
        moscow.addHouse(house4);
        moscow.addHouse(house5);

        moscow.showSettledList();

    }
}
