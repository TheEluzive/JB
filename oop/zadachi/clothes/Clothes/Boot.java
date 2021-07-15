package Clothes;

public class Boot extends ClothesBase {
    public Boot(int size, int temperature, String name) throws Exception {
        super(size, temperature, name);
        setType("Ботинки");
    }
}
