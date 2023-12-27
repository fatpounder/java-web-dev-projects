package org.example;

public class QuizRunner {

    private static final Quiz quiz = new Quiz();

    public static void main(String[] args) {

    String q1 = "Which of these books are by Michael Crichton?";
    Choice[] q1choices = new Choice[] {
            new Choice("Congo", true),
            new Choice("Jane Eyre"),
            new Choice("Jurassic Park", true),
            new Choice("Sphere", true)
    };
    CheckBox question1 = new CheckBox(q1, q1choices);

    String q2 = "Link's maximum number of hearts is 40.";
    Choice[] q2choices = new Choice[] {
            new Choice("True", true),
            new Choice("False"),
    };
    TrueFalse question2 = new TrueFalse(q2, q2choices);

    String q3 = "Which of these waterfowl likes to sit in a tree?";
    Choice[] q3choices = new Choice[] {
            new Choice("Mallard"),
            new Choice("Northern Pintail"),
            new Choice("Fulvous Whistling-Duck", true),
            new Choice("Common Eider")
    };
    MultipleChoice question3 = new MultipleChoice(q3, q3choices);

    quiz.addQuestions(new Question[] {question1, question2, question3});

    quiz.run();

    String newline = System.lineSeparator();
    System.out.println(newline + "You answered " + quiz.getNumCorrect() + " of " + quiz.getQuestions().size() + " questions correctly." + newline);

    }
}
