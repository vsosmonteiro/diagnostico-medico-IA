import data.GoalsRepository;
import data.RulesRepository;
import domain.Rule;
import domain.Variable;
import inference.ExecutionParams;
import inference.ExecutionResult;
import inference.InferenceEngine;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import static util.OutputUtils.*;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final RulesRepository rulesRepository = new RulesRepository();
    private static final GoalsRepository goalsRepository = new GoalsRepository();

    public static void main(String[] args) {
        System.out.println("Knowledge-Based System: Diagnóstico Médico");
        hold(scanner);
        start();
    }

    public static void hold(Scanner scanner) {
        print("\nPress enter to continue...");
        scanner.nextLine();
        print("\n");
    }

    private static void start() {
        // Rule 1
        List<Variable> conditions1 = new ArrayList<>();
        conditions1.add(new Variable("Fadiga", "sim"));
        conditions1.add(new Variable("Dor_de_cabeça", "sim"));
        conditions1.add(new Variable("Dores_no_corpo", "sim"));
        conditions1.add(new Variable("Ocasionais_dores_garganta", "sim"));
        conditions1.add(new Variable("Ocasionais_tosse", "sim"));

        List<Variable> implications1 = new ArrayList<>();
        implications1.add(new Variable("Covid19", "sim"));

        Rule rule1 = new Rule(conditions1, implications1);

        // Rule 2
        List<Variable> conditions2 = new ArrayList<>();
        conditions2.add(new Variable("Dor_de_cabeça", "sim"));
        conditions2.add(new Variable("Garganta_inflamada", "sim"));
        conditions2.add(new Variable("Tosse", "sim"));

        List<Variable> implications2 = new ArrayList<>();
        implications2.add(new Variable("Diagnóstico", "Gripe"));

        Rule rule2 = new Rule(conditions2, implications2);

        // Rule 3
        List<Variable> conditions3 = new ArrayList<>();
        conditions3.add(new Variable("Cansaço", "sim"));
        conditions3.add(new Variable("Dor_de_cabeça", "sim"));

        List<Variable> implications3 = new ArrayList<>();
        implications3.add(new Variable("Diagnóstico", "Mononucleose infecciosa"));

        Rule rule3 = new Rule(conditions3, implications3);

        // Rule 4
        List<Variable> conditions4 = new ArrayList<>();
        conditions4.add(new Variable("Cansaço", "sim"));
        conditions4.add(new Variable("Garganta_inflamada", "sim"));

        List<Variable> implications4 = new ArrayList<>();
        implications4.add(new Variable("Diagnóstico", "Amigdalite"));

        Rule rule4 = new Rule(conditions4, implications4);

        // Rule 5
        List<Variable> conditions5 = new ArrayList<>();
        conditions5.add(new Variable("Cansaço", "sim"));

        List<Variable> implications5 = new ArrayList<>();
        implications5.add(new Variable("Diagnóstico", "Estresse"));

        Rule rule5 = new Rule(conditions5, implications5);

        // Rule 6
        List<Variable> conditions6 = new ArrayList<>();
        conditions6.add(new Variable("Fadiga", "sim"));
        conditions6.add(new Variable("Dor_de_cabeça", "sim"));
        conditions6.add(new Variable("Pulsação_elevada", "sim"));
        conditions6.add(new Variable("Baixo_nível_de_oxigênio", "sim"));
        conditions6.add(new Variable("Perda_de_olfato", "sim"));
        conditions6.add(new Variable("Perda_de_paladar", "sim"));

        List<Variable> implications6 = new ArrayList<>();
        implications6.add(new Variable("Covid19", "sim"));

        Rule rule6 = new Rule(conditions6, implications6);

        // Add rules
        rulesRepository.add(rule1);
        rulesRepository.add(rule2);
        rulesRepository.add(rule3);
        rulesRepository.add(rule4);
        rulesRepository.add(rule5);
        rulesRepository.add(rule6);

        // Add goals
        goalsRepository.add("Covid19");
        goalsRepository.add("Diagnóstico");

        runInferenceEngine();
    }

    private static void runInferenceEngine() {
        List<Rule> rules = rulesRepository.all();
        List<String> goals = goalsRepository.all();

        ExecutionParams params = new ExecutionParams(rules, new HashSet<>(goals), key -> {
            printf("What the value of variable \"%s\"?\n", key);
            print("Response: ");
            return scanner.nextLine().trim();
        });

        InferenceEngine engine = new InferenceEngine();
        ExecutionResult result = engine.run(params);

        println("\n" + result.goalMatches);
        hold(scanner);
    }

}
