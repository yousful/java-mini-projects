import java.util.Scanner;

public class Quiz {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String[] answers = {"a", "b", "c", "d"};
        String[] responses = {" ", " ", " ", " "};

        System.out.println("Who is the best player in the world?");
        System.out.println("(a) Cristiana Ronaldo");
        System.out.println("(b) Lionel Messi?");
        System.out.println("(c) Eden Hazard");
        System.out.println("(d) Ellen Halland");

        System.out.println("Which country won the 2022 world cup?");
        System.out.println("(a) Agentina");
        System.out.println("(b) France");
        System.out.println("(c) Agentina");
        System.out.println("(d) Nigeria");

        System.out.println("Who club won the 2023 UEFA Champions League?");
        System.out.println("(a) Baecelona");
        System.out.println("(b) Real Madrid");
        System.out.println("(c) Manchester United");
        System.out.println("(d) Manchester City");

        System.out.println("Who Europian club won treble in the 2022/2023 footbal season?");
        System.out.println("(a) Chelsea");
        System.out.println("(b) Real Madrid");
        System.out.println("(c) Manhester City");
        System.out.println("(d) Liverpool");

        responses[0] = scan.next();
        responses[1] = scan.next();
        responses[2] = scan.next();
        responses[3] = scan.next();

        int score = 0;

        for(int i = 0; i < 4; i++){
            if(responses[i].equalsIgnoreCase(answers[i])) {
                score++;
            }
            System.out.println("Score: " + score + " /4");
        }
       scan.close();
    }
}
