public class Bottle {

    private int volume;

    public Bottle(int volume){
        this.volume = volume;
    }

    public int checkVolume() {
        return this.volume;
    }

    public int drinkWater() {
        return this.volume - 10;
    }

    public int emptyBottle() {
        return volume = 0;
    }

    public int fillBottle() {
        return volume = 100;
    }
}
