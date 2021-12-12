package Exercise01WorkingWithAbstraction.trafficLights;

public class TrafficLights {
    private Colours colours;

    public TrafficLights(Colours colours){
        this.colours = colours;
    }

    public void changeColours(){
        switch (this.colours){
            case RED:
                this.colours = Colours.GREEN;
                break;
            case GREEN:
                this.colours = Colours.YELLOW;
                break;
            case YELLOW:
                this.colours = Colours.RED;
                break;
        }
    }

    @Override
    public String toString() {
        return this.colours.toString();
    }
}
