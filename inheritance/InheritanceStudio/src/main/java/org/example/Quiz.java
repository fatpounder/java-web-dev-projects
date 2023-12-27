package org.example;
//import question.Question;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Quiz {

    private final ArrayList<Question> questions = new ArrayList<>();

    private int numCorrect = 0;

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public int getNumCorrect() {
        return numCorrect;
    }

    public void addQuestions(Question[] questionArray) {
        Collections.addAll(questions, questionArray);
    }

    public void run() {

        Scanner input = new Scanner(System.in);
        Collections.shuffle(questions);

        for (Question question : questions) {
            System.out.println(question);
            ArrayList<Integer> userResponses = new ArrayList<>();
            int i = 0;
            while (i < question.getMaxResponse()) {
                String userResponse;

                do {
                    System.out.println("Enter a number: ");
                    userResponse = input.nextLine();
                } while (question.isNotValid(userResponse));

                int numUserResponse = Integer.parseInt(userResponse);
                if (userResponses.contains(numUserResponse)) {
                    System.out.println("You already tried this, guess again!");
                } else if (!question.getChoiceMap().get(numUserResponse).isCorrect()) {
                    System.out.println("The correct answer was: ");
                    for (Choice choice : question.getChoiceMap().values()) {
                         if (choice.isCorrect()) {
                             System.out.println(choice.getContent());
                         }
                    }
                    break;
                } else {
                    System.out.println("That's correct! Yay!");
                    userResponses.add(numUserResponse);
                    if (i == question.getMaxResponse() -1) {
                        numCorrect++;
                    }
                    i++;
                }
            }
        }

        input.close();
    }
}
