package _02_WorkingWithAbstractionExercise._04_TrafficLights;

public enum TrafficSignal {
    GREEN(0),
    YELLOW(1),
    RED(2);

    private int lightIndex;

    private TrafficSignal(int lightIndex) {
        this.lightIndex = lightIndex;
    }

    public static TrafficSignal returnNextLight(TrafficSignal light) {
        if (light.lightIndex == 0) {
            return YELLOW;
        } else if (light.lightIndex == 1) {
            return RED;
        } else if (light.lightIndex == 2) {
            return GREEN;
        }
        return null;
    }

    public int getLightIndex() {
        return lightIndex;
    }
}
