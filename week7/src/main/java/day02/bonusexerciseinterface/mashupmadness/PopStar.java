package day02.bonusexerciseinterface.mashupmadness;

public class PopStar implements Singer, Dancer{
    @Override
    public String perform() {
        return "Popstar is singing " + Singer.super.perform() + " and dancing " + Dancer.super.perform() ;
    }
}
