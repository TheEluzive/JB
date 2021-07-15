package Clothes;

public class Pant extends ClothesBase{
    public Pant(int size, int temperature, String name) throws Exception {
        super(size, temperature, name);
        setType("Штаны");
    }
}
