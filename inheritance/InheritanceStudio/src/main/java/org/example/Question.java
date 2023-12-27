package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public abstract class Question {

    private final String question;
    private final HashMap<Integer, Choice> choiceMap = new HashMap<>();
    private int maxResponse = 1;

    public Question(String question, Choice[] choiceArray) {
        this.question = question;
        createChoiceMap(choiceArray);
    }

    public String getQuestion() {
        return question;
    }

    public HashMap<Integer, Choice> getChoiceMap() {
        return choiceMap;
    }

    public int getMaxResponse() {
        return maxResponse;
    }

    public void setMaxResponse(int maxResponse) {
        this.maxResponse = maxResponse;
    }

    @Override
    public abstract String toString();

    void createChoiceMap(Choice[] choiceArray) {
        ArrayList<Choice> choiceList = new ArrayList<>();
        Collections.addAll(choiceList, choiceArray);
        Collections.shuffle(choiceList);
        for (int i = 0; i < choiceList.size(); i++) {
            choiceMap.put(i + 1, choiceList.get(i));
        }
    }

    String getChoices() {
        StringBuilder choices = new StringBuilder();
        String newline = System.lineSeparator();
        for (int choiceNum : choiceMap.keySet()) {
            String choice = "\t" + choiceNum + " - " + choiceMap.get(choiceNum).getContent() + newline;
            choices.append(choice);
        }
        return choices.toString();
    }

    public boolean isNotValid(String response) {
        try {
            int respInt = Integer.parseInt(response);
            return respInt <= 0 || respInt >  choiceMap.size();
        } catch (NumberFormatException e) {
            return true;
        }
    }
}
