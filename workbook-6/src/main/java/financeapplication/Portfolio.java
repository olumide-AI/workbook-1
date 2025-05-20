package financeapplication;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private String name;
    private String owner;
    private List<Valuable> valuables;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.valuables = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<Valuable> getValuables() {
        return valuables;
    }

    public void setValuables(List<Valuable> valuables) {
        this.valuables = valuables;
    }

    public void addValuable(Valuable valuable){
        valuables.add(valuable);
    }

    public double getValue(){
        double totalValue = 0;
        for (Valuable valuable: valuables){
             totalValue += valuable.getValue();

        }
        return totalValue;
    }

    public Valuable getMostValuable() {
        if (valuables.isEmpty()) return null;
        Valuable max = valuables.get(0);
        for (Valuable item : valuables) {
            if (item.getValue() > max.getValue()) {
                max = item;
            }
        }
        return max;
    }

    public Valuable getLeastValuable() {
        if (valuables.isEmpty()) return null;
        Valuable min = valuables.get(0);
        for (Valuable item : valuables) {
            if (item.getValue() < min.getValue()) {
                min = item;
            }
        }
        return min;
    }
}
