package Clothes;

public class Clothing extends ClothesBase{
    public Clothing(int size, int temperature, String name) throws Exception {
        super(size, temperature, name);
        setType("Пальто");
    }
}
