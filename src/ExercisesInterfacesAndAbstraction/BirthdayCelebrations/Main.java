package ExercisesInterfacesAndAbstraction.BirthdayCelebrations;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> years = new ArrayList<>();

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] tokens = command.split("\\s+");

            switch (tokens[0]) {
                case "Citizen":
                    years.add(tokens[4]);
                    break;
                case "Pet":
                    years.add(tokens[2]);
                    break;
                case "Robot":
                    break;
            }
            command = scanner.nextLine();
        }
        String specificYear = scanner.nextLine();

        for (String year : years) {
            if ((year.substring(year.length() - 4).equals(specificYear))){
                System.out.println(year);
            }
        }

    }
}
