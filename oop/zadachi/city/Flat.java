import java.util.ArrayList;

public class Flat implements IFlat {
    private int number;
    private ArrayList<Settler> settlerList;

    @Override
    public void addSettler(Settler settler) {
        if (settlerList == null) settlerList = new ArrayList<Settler>();

        if (settlerList.size() >=2) System.out.println("В квартирах не может быть больше 2 жильцов!");
            else settlerList.add(settler);
    }

    public int getNumber() {
        return number;
    }

    public ArrayList<Settler> getSettlerList() {
        return settlerList;
    }

    public Flat(int number) {
        this.number = number;
    }
}
