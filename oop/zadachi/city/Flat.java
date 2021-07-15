import java.util.ArrayList;

public class Flat implements IFlat {
    private int number;
    private ArrayList<Settler> settlerList;

    @Override
    public void addSettler(Settler settler) {
        if (settlerList == null) settlerList = new ArrayList<Settler>();
        settlerList.add(settler);
    }


}
