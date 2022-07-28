import domain.Rule;
import domain.Variable;

import java.util.ArrayList;
import java.util.List;

public class Questao5 {

    public static List<Rule> createRules() {
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

        List<Rule> rules = new ArrayList<>();
        rules.add(rule1);
        rules.add(rule2);
        rules.add(rule3);
        rules.add(rule4);
        rules.add(rule5);
        rules.add(rule6);
        return rules;
    }

    public static List<String> createGoals() {
        List<String> goals = new ArrayList<>();

        goals.add("Covid19");
        goals.add("Diagnóstico");

        return goals;
    }

}
