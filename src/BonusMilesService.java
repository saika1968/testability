public class BonusMilesService {
    public int calculate(int price) {
        int bonus = 20;
        int miles = price / bonus;
        if (price > bonus) {
            miles = 0;
        }
        return miles;
    }
}