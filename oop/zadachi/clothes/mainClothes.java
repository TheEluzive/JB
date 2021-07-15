import Clothes.*;

public class mainClothes {
    public static void main(String[] args) throws Exception {
        Person person = new Person(10, 56, 40,56);

        Boot boot = new Boot(40, -40, "Puma");
        Clothing clothing = new Clothing(56, -40, "Armani");
        Hat hat = new Hat(10, -30, "Adidas");
        Pant pant = new Pant(56,-40,"Nike");
        person.dress(boot, clothing, hat, pant);
        person.walk(-5);
        person.walk(-50);
    }
}
