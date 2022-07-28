import data.GoalsRepository;
import data.RulesRepository;
import domain.Rule;
import domain.Variable;
import inference.ExecutionParams;
import inference.ExecutionResult;
import inference.InferenceEngine;

import java.util.*;

import static util.OutputUtils.*;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        startMainMenu();
    }

    private static void startMainMenu() {
        int option;
        do {
            clear();
            println("===== Knowledge-Based System =====\n");
            println("1 - Animais");
            println("2 - Diagnóstico Médico");
            println("0 - Exit");
            print("\nOption: ");

            option = Integer.parseInt(scanner.nextLine());
            print("\n");

            switch (option) {
                case 1:
                    startAnimals();
                    break;
                case 2:
                    startMedicalDiagnostic();
                    break;
                case 0:
                    println("Exiting...");
                    hold(scanner);
                    break;
                default:
                    println("Invalid option!");
                    hold(scanner);
                    break;
            }
        } while (option != 0);
    }

    public static void hold(Scanner scanner) {
        print("\nPress enter to continue...");
        scanner.nextLine();
        print("\n");
    }

    private static void startAnimals() {
        final RulesRepository rulesRepository = new RulesRepository();
        final GoalsRepository goalsRepository = new GoalsRepository();

        for (Rule r : Questao4.createRules()) rulesRepository.add(r);

        goalsRepository.add("animal");

        List<Rule> rules = rulesRepository.all();
        List<String> goals = goalsRepository.all();

        Set<Variable> qualities = new HashSet<>();

        println("Type the qualities of the animal separated by comma:");
        printf("Response: ");

        String qualitiesResponse = scanner.nextLine().trim();

        for (String quality : qualitiesResponse.split(",")) {
            qualities.add(new Variable("animal", quality));
        }

        ExecutionParams params = new ExecutionParams(rules, new HashSet<>(goals), key -> "");

        InferenceEngine engine = new InferenceEngine(qualities);
        ExecutionResult result = engine.run(params);

        print("Advinhe qual é o animal: ");
        String animalResponse = scanner.nextLine().trim();

        for (Variable match : result.goalMatches) {
            if (match.value.contains(animalResponse)) {
                println("Você acertou!");
                hold(scanner);
                return;
            }
        }
        println("Você errou!");
        hold(scanner);
    }

    private static void startMedicalDiagnostic() {
        final RulesRepository rulesRepository = new RulesRepository();
        final GoalsRepository goalsRepository = new GoalsRepository();

        for (Rule r : Questao5.createRules()) rulesRepository.add(r);
        for (String g : Questao5.createGoals()) goalsRepository.add(g);

        List<Rule> rules = rulesRepository.all();
        List<String> goals = goalsRepository.all();

        ExecutionParams params = new ExecutionParams(rules, new HashSet<>(goals), key -> {
            printf("What the value of variable \"%s\"?\n", key);
            print("Response: ");
            return scanner.nextLine().trim();
        });

        InferenceEngine engine = new InferenceEngine(Collections.emptySet());
        ExecutionResult result = engine.run(params);

        println("\n" + result.goalMatches);
        hold(scanner);
    }

}
