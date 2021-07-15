import Clothes.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person implements IPerson{

    private int headSize;
    private int bodySize;
    private int bootSize;
    private int pantSize;
    private Boot boot;
    private Clothing clothing;
    private Hat hat;
    private Pant pant;

    public Person(int headSize, int bodySize, int bootSize, int pantSize) {
        this.headSize = headSize;
        this.bodySize = bodySize;
        this.bootSize = bootSize;
        this.pantSize = pantSize;
    }

    @Override
    public void dress(Boot boot, Clothing clothing, Hat hat, Pant pant) {
        this.boot = boot;
        this.clothing = clothing;
        this.hat = hat;
        this.pant = pant;
    }


    @Override
    public void walk(int temperature) {

        /*if (boot.getTemperature()>temperature) {
            System.out.println("Ботинки не подходят под погоду");
            return;
        }
        if (boot.getSize()!=bootSize) {
            System.out.println("Ботинки не подходят по размеру");
            return;
        }

        if (boot == null) {
            System.out.println("Наденьте ботинки!");
            return;
        }

        if (clothing.getTemperature()>temperature) {
            System.out.println("Пальто не подходит под погоду");
        }
        if (clothing.getSize()!=bodySize) {
            System.out.println("Пальто не подходит по размеру");
        }

        if (clothing == null) {
            System.out.println("Наденьте пальто!");
            return;
        }

        if (hat.getTemperature()>temperature) {
            System.out.println("Шапка не подходит под погоду");
            return;
        }
        if (hat.getSize()!=headSize) {
            System.out.println("Шапка не подходит по размеру");
            return;
        }

        if (hat == null) {
            System.out.println("Наденьте шапку!");
            return;
        }

        if (pant.getTemperature()>temperature) {
            System.out.println("Штаны не подходят под погоду");
            return;
        }
        if (pant.getSize()!=pantSize) {
            System.out.println("Штаны не подходят по размеру");
            return;
        }

        if (pant == null) {
            System.out.println("Наденьте штаны!");
            return;
        }*/

        if (ClothesBase.isAppropriate(boot, temperature,bootSize)&&
        ClothesBase.isAppropriate(clothing, temperature,bodySize)&&
        ClothesBase.isAppropriate(hat,temperature,headSize)&&
        ClothesBase.isAppropriate(pant, temperature, pantSize)) {
            System.out.println("Попытка пойти гулять в температуру -10\n" +
                    "Температура воздуха: " + temperature + ", одежда выдерживает температуру: " + maxClothTemperature() +
                    "\nЧеловек успешно вышел гулять в одежде:");
            System.out.println("Шапка: " + hat.getName() + ",размер " + hat.getSize());
            System.out.println("Штаны: " + pant.getName() + ",размер " + pant.getSize());
            System.out.println("Ботинки: " + boot.getName() + ",размер " + boot.getSize());
            System.out.println("Пальто: " + clothing.getName() + ",размер " + clothing.getSize());
        }

    }

    public int maxClothTemperature(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(boot.getTemperature());
        list.add(hat.getTemperature());
        list.add(clothing.getTemperature());
        list.add(pant.getTemperature());
        return Collections.max(list);
    }
}

