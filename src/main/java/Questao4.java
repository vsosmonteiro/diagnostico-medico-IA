import domain.Rule;
import domain.Variable;

import java.util.ArrayList;
import java.util.List;

public class Questao4 {

    public static List<Rule> createRules() {
        // Rule 1
        List<Variable> conditions1 = new ArrayList<>();
        conditions1.add(new Variable("animal", "pelo"));

        List<Variable> implications1 = new ArrayList<>();
        implications1.add(new Variable("animal", "mamifero"));

        Rule rule1 = new Rule(conditions1, implications1);

        // Rule 2
        List<Variable> conditions2 = new ArrayList<>();
        conditions2.add(new Variable("animal", "leite"));

        List<Variable> implications2 = new ArrayList<>();
        implications2.add(new Variable("animal", "mamifero"));

        Rule rule2 = new Rule(conditions2, implications2);

        // Rule 3
        List<Variable> conditions3 = new ArrayList<>();
        conditions3.add(new Variable("animal", "penas"));

        List<Variable> implications3 = new ArrayList<>();
        implications3.add(new Variable("animal", "ave"));

        Rule rule3 = new Rule(conditions3, implications3);

        // Rule 4
        List<Variable> conditions4 = new ArrayList<>();
        conditions4.add(new Variable("animal", "voa"));
        conditions4.add(new Variable("animal", "ovos"));

        List<Variable> implications4 = new ArrayList<>();
        implications4.add(new Variable("animal", "ave"));

        Rule rule4 = new Rule(conditions4, implications4);

        // Rule 5
        List<Variable> conditions5 = new ArrayList<>();
        conditions5.add(new Variable("animal", "mamifero"));
        conditions5.add(new Variable("animal", "come carne"));

        List<Variable> implications5 = new ArrayList<>();
        implications5.add(new Variable("animal", "carnivoro"));

        Rule rule5 = new Rule(conditions5, implications5);

        // Rule 6
        List<Variable> conditions6 = new ArrayList<>();
        conditions6.add(new Variable("animal", "mamífero"));
        conditions6.add(new Variable("animal", "dentes pontudos"));
        conditions6.add(new Variable("animal", "garras"));
        conditions6.add(new Variable("animal", "olhos frontais"));

        List<Variable> implications6 = new ArrayList<>();
        implications6.add(new Variable("animal", "carnívoro"));

        Rule rule6 = new Rule(conditions6, implications6);

        // Rule 7
        List<Variable> conditions7 = new ArrayList<>();
        conditions7.add(new Variable("animal", "mamifero"));
        conditions7.add(new Variable("animal", "tem casco"));

        List<Variable> implications7 = new ArrayList<>();
        implications7.add(new Variable("animal", "ungulado"));

        Rule rule7 = new Rule(conditions7, implications7);

        // Rule 8
        List<Variable> conditions8 = new ArrayList<>();
        conditions8.add(new Variable("animal", "mamifero"));
        conditions8.add(new Variable("animal", "rumina"));
        conditions8.add(new Variable("animal", "dedos pares"));

        List<Variable> implications8 = new ArrayList<>();
        implications8.add(new Variable("animal", "ungulado"));

        Rule rule8 = new Rule(conditions8, implications8);

        // Rule 9
        List<Variable> conditions9 = new ArrayList<>();
        conditions9.add(new Variable("animal", "carnivoro"));
        conditions9.add(new Variable("animal", "cor amarelo-tostado"));
        conditions9.add(new Variable("animal", "manchas escuras"));

        List<Variable> implications9 = new ArrayList<>();
        implications9.add(new Variable("animal", "leopardo"));

        Rule rule9 = new Rule(conditions9, implications9);

        // Rule 10
        List<Variable> conditions10 = new ArrayList<>();
        conditions10.add(new Variable("animal", "carnivoro"));
        conditions10.add(new Variable("animal", "cor amarelo-tostado"));
        conditions10.add(new Variable("animal", "listas pretas"));

        List<Variable> implications10 = new ArrayList<>();
        implications10.add(new Variable("animal", "tigre"));

        Rule rule10 = new Rule(conditions10, implications10);

        // Rule 11
        List<Variable> conditions11 = new ArrayList<>();
        conditions11.add(new Variable("animal", "ungulado"));
        conditions11.add(new Variable("animal", "pernas longas"));
        conditions11.add(new Variable("animal", "pescoço comprido"));
        conditions11.add(new Variable("animal", "cor amarelo-tostado"));
        conditions11.add(new Variable("animal", "manchas escuras"));

        List<Variable> implications11 = new ArrayList<>();
        implications11.add(new Variable("animal", "girafa"));

        Rule rule11 = new Rule(conditions11, implications11);

        // Rule 12
        List<Variable> conditions12 = new ArrayList<>();
        conditions12.add(new Variable("animal", "ungulado"));
        conditions12.add(new Variable("animal", "cor branca"));
        conditions12.add(new Variable("animal", "listras pretas"));

        List<Variable> implications12 = new ArrayList<>();
        implications12.add(new Variable("animal", "zebra"));

        Rule rule12 = new Rule(conditions12, implications12);

        // Rule 13
        List<Variable> conditions13 = new ArrayList<>();
        conditions13.add(new Variable("animal", "ave"));
        conditions13.add(new Variable("animal", "pernas longas"));
        conditions13.add(new Variable("animal", "pescoço comprido"));
        conditions13.add(new Variable("animal", "cor preto e branco"));

        List<Variable> implications13 = new ArrayList<>();
        implications13.add(new Variable("animal", "avestruz"));

        Rule rule13 = new Rule(conditions13, implications13);

        // Rule 14
        List<Variable> conditions14 = new ArrayList<>();
        conditions14.add(new Variable("animal", "ungulado"));
        conditions14.add(new Variable("animal", "nao voa"));
        conditions14.add(new Variable("animal", "nada"));
        conditions14.add(new Variable("animal", "cor preto e branco"));
        conditions14.add(new Variable("animal", "manchas escuras"));

        List<Variable> implications14 = new ArrayList<>();
        implications14.add(new Variable("animal", "pinguim"));

        Rule rule14 = new Rule(conditions14, implications14);

        // Rule 15
        List<Variable> conditions15 = new ArrayList<>();
        conditions15.add(new Variable("animal", "ave"));
        conditions15.add(new Variable("animal", "bom voador"));

        List<Variable> implications15 = new ArrayList<>();
        implications15.add(new Variable("animal", "albatroz"));

        Rule rule15 = new Rule(conditions15, implications15);

        // Rule 16
        List<Variable> conditions16 = new ArrayList<>();
        conditions16.add(new Variable("animal", "mamifero"));
        conditions16.add(new Variable("animal", "ovos"));

        List<Variable> implications16 = new ArrayList<>();
        implications16.add(new Variable("animal", "ornitorrinco"));

        Rule rule16 = new Rule(conditions16, implications16);

        // Rule 17
        List<Variable> conditions17 = new ArrayList<>();
        conditions17.add(new Variable("animal", "mamifero"));
        conditions17.add(new Variable("animal", "late"));

        List<Variable> implications17 = new ArrayList<>();
        implications17.add(new Variable("animal", "cachorro"));

        Rule rule17 = new Rule(conditions17, implications17);

        // Rule 18
        List<Variable> conditions18 = new ArrayList<>();
        conditions18.add(new Variable("animal", "mamifero"));
        conditions18.add(new Variable("animal", "mia"));

        List<Variable> implications18 = new ArrayList<>();
        implications18.add(new Variable("animal", "gato"));

        Rule rule18 = new Rule(conditions18, implications18);

        List<Rule> rules = new ArrayList<>();

        rules.add(rule1);
        rules.add(rule2);
        rules.add(rule3);
        rules.add(rule4);
        rules.add(rule5);
        rules.add(rule6);
        rules.add(rule7);
        rules.add(rule8);
        rules.add(rule8);
        rules.add(rule9);
        rules.add(rule10);
        rules.add(rule11);
        rules.add(rule12);
        rules.add(rule13);
        rules.add(rule14);
        rules.add(rule15);
        rules.add(rule16);
        rules.add(rule17);
        rules.add(rule18);

        return rules;
    }

}
