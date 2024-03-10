package _08_InterfacesAndAbstractionExercise._05_Telephony;

import java.util.List;
import java.util.stream.Collectors;

public class Smartphone implements Callable, Browsable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String call() {
        return this.numbers.stream()
                .map(number -> {
                    if (number.matches(".*\\D.*")) {
                        return "Invalid number!";
                    }
                    return String.format("Calling... %s", number);
                })
                .collect(Collectors.joining("\n"));
    }

    @Override
    public String browse() {
        return this.urls.stream()
                .map(url -> {
                    if (url.matches(".*\\d.*")) {
                        return "Invalid URL!";
                    }
                    return String.format("Browsing: %s!", url);
                })
                .collect(Collectors.joining("\n"));
    }

}
