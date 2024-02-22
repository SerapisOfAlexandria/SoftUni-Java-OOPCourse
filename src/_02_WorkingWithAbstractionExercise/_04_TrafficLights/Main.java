package _02_WorkingWithAbstractionExercise._04_TrafficLights;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] trafficLightSequence = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());
        TrafficSignal[] trafficSignals = new TrafficSignal[trafficLightSequence.length];

        for (int i = 0; i < trafficLightSequence.length; i++) {
                trafficSignals[i] = TrafficSignal.valueOf(trafficLightSequence[i]);
        }

        for (int i = 0; i < n; i++) {
            for (int a = 0; a < trafficSignals.length; a++) {
                trafficSignals[a] = TrafficSignal.returnNextLight(trafficSignals[a]);
            }
            System.out.println(Arrays.stream(trafficSignals).map(String::valueOf).collect(Collectors.joining(" ")));
        }


    }
}
