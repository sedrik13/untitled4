public class BonusMilesService {
    public int calculate(int cost) {
        int bonusForOneMile = 20; // количество рублей за 1 милю
        int bonus = cost / bonusForOneMile; // количество наичисленных мили за билет

        return bonus;
    }
}