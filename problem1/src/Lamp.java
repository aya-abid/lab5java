public class Lamp {
    private String style;
    private boolean battery;
    private int globalRating;

    public Lamp(String style, boolean battery, int globalRating){
        this.style = style;
        this.battery = battery;
        this.globalRating = globalRating;
    }

    public void turnOn(){
        System.out.println("the lamp is turned on");
    }

    public String getStyle(){
        return this.style;
    }

    public boolean isBattery(){
        return this.battery;
    }

    public int getGlobalRating(){
        return this.globalRating;
    }

}
