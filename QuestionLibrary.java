package greendevelopers.aprenderlite;

/**
 * Created by s528182 on 4/17/2017.
 */

public class QuestionLibrary {

    private String mQuestions [] = {
            "What is the default value of float variable?",
            "Method Overriding is an example of",
            "Which of the following that a method does not return a value",
            "The _______ holds the plant upright."

    };

    private String mChoices [][] = {
            {"0.0d", "0.0f", "0"},
            {"Static Binding", "Dynamic Binding", "Both of the above"},
            {"Static", "Private", "Void"},
            {"Flower", "Leaves", "Stem"}
    };

    private String mCorrectAnswers[] = {"0.0f", "Dynamic Binding", "Void", "Stem"};

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
