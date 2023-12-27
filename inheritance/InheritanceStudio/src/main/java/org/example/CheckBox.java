package org.example;

public class CheckBox extends Question {

    public CheckBox(String question, Choice[] choiceArray) {
        super(question, choiceArray);
        setMaxResponse(getNumCorrect());
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return newline + "Choose One or More: " + newline + getQuestion() + newline + getChoices();
    }

    public int getNumCorrect() {
        int numCorrect = 0;
        for (Choice choice : getChoiceMap().values()) {
            if (choice.isCorrect()) {
                numCorrect++;
            }
        }
        return numCorrect;
    }
}
