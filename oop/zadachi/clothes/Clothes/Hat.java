package Clothes;

public class Hat extends ClothesBase{
    public Hat(int size, int temperature, String name) throws Exception {
        super(size, temperature, name);
        setType("Шапка");
    }
}
