package _01_WorkingWithAbstraction._04_HotelReservation;

import java.util.Scanner;

public class PricesCalculator {
    public void calculate() {

        Scanner scanner = new Scanner(System.in);

        String[] inputInformation = scanner.nextLine().split(" ");
        double pricePerDay = Double.parseDouble(inputInformation[0]);
        int lengthOfReservation = Integer.parseInt(inputInformation[1]); // in days
        String season = inputInformation[2];
        String typeOfClient = inputInformation[3];

        int priceMultiplier = 0;
        double discount = 0;

        switch (season) {
            case "Autumn":
                priceMultiplier = Seasons.AUTUMN.getMultiplier();
                break;
            case "Summer":
                priceMultiplier = Seasons.SUMMER.getMultiplier();
                break;
            case "Spring":
                priceMultiplier = Seasons.SPRING.getMultiplier();
                break;
            case "Winter":
                priceMultiplier = Seasons.WINTER.getMultiplier();
                break;
        }

        switch (typeOfClient) {
            case "VIP":
                discount = 0.2;
                break;
            case "SecondVisit":
                discount = 0.1;
                break;
        }

        double total = (lengthOfReservation * (pricePerDay * priceMultiplier)) - ((lengthOfReservation * (pricePerDay * priceMultiplier)) * discount);
        System.out.printf("%.2f", total);
    }
}
