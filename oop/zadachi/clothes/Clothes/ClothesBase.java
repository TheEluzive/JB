package Clothes;

public abstract class ClothesBase {
    private int size;
    private int temperature;
    private String name;
    private String type;

    public ClothesBase(int size, int temperature, String name) throws Exception {
        if (temperature < 0) {
        this.size = size;
        this.temperature = temperature;
        this.name = name;
        }
        else
            throw new Exception("Температура должна быть ниже нуля!!!");
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getName() {
        return name;
    }

    public static boolean isAppropriate(ClothesBase clothesBase, int temperature, int size){
        if (clothesBase.temperature > temperature) {
            System.out.println(clothesBase.type + " не подходят/ит под погоду");
            return false;
        }

        if (clothesBase.size!=size) {
            System.out.println(clothesBase.type + " не подходят по размеру");
            return false;
        }

        if (clothesBase == null) {
            System.out.println(clothesBase.type + " наденьте!");
            return false;
        }

        return true;
    }
}
