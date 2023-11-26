public class BonusMilesService {
    public int calculate(int ticketPrice){
        int bonusMiles;
        bonusMiles = ticketPrice / 20;
        return bonusMiles;
    }
}
