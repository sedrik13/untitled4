public class BonusMilesService {

    public int calculate(int price) {
        int sale = 10000;
        int miles = 20;
        int bonus = sale / miles;
        return bonus;
    }
}