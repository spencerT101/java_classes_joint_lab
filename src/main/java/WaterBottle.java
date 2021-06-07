public class WaterBottle {
    private int volume;

    public WaterBottle(int volume){
        this.volume = 100;
    }

    public int removeWaterBy10(int num10) {
        return this.volume - num10;
    }
}

