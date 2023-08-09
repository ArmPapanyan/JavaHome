import java.util.ArrayList;
import java.util.List;

public class Nootebook {
    private String name;
    private int amountRAM;
    private String operatingSystem;
    private int price;
    private String model;
    private String color;

    public Nootebook(String name, int amountRAM, String operatingSystem, int price, String model, String color) {

        this.name = name;
        this.amountRAM = amountRAM;
        this.operatingSystem = operatingSystem;
        this.price = price;
        this.model = model;
        this.color = color;

    }

    public boolean validateObject() {
        return true;
    }

    public static List<String> propertiesFilter() {
        List<String> list = new ArrayList<>();
        list.add("amountRAM");
        list.add("operatingSystem");
        list.add("price");
        list.add("model");
        list.add("color");

        return list;
    }

    @Override
    public String toString() {
        return "Name : " + name + "AmountRAM : " + amountRAM + "OperatingSystem : " + operatingSystem + "Price : " + price + " Model : " + " Color : ";

    }
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Nootebook)){
            return false;
    }

        Nootebook nootebook = (Nootebook) obj;
        return amountRAM == nootebook.amountRAM && name.equals(nootebook.name) && operatingSystem.equals(nootebook.operatingSystem)  && model.equals(nootebook.model) && color.equals(nootebook.color);

    }
    @Override
    public int hashCode(){
        return  15 * name.hashCode() + 11 * model.hashCode() +  3 * operatingSystem.hashCode() + 6 * color.hashCode() +  23 * amountRAM + 24 * price ;
    }
}