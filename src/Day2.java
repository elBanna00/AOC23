import java.util.Hashtable;
import java.util.Map;

public class Day2 {
   private  Map<String, Integer> config = new Hashtable<>() {
        {
            put("red", 12);
            put("green", 13);
            put("blue", 14);
        }
    };
    private boolean isValidGame(String gameScores) {
        boolean isValid = true;

        String[] scoreArr = gameScores.split(" ");

        for(int i = 1; i < scoreArr.length; i+=2){
            String color = scoreArr[i].substring(0,scoreArr[i].length()-1);


            if(!config.containsKey(color)) color = scoreArr[i];

            int score = Integer.parseInt(scoreArr[i-1]);

            if(score > config.get(color)) {

                isValid= false;
                return isValid;
            }

        }

        return isValid;
    }

    private int getPowerSet(String game)
    {   
        Map<String, Integer> powerSet = new Hashtable<>() {
            {
                put("red", 1);
                put("green", 1);
                put("blue", 1);
            }
        };
        String[] scoreArr = game.split(" ");

        for(int i = 1; i < scoreArr.length; i+=2){
            String color = scoreArr[i].substring(0,scoreArr[i].length()-1);

            if(!powerSet.containsKey(color)) color = scoreArr[i];

            int score = Integer.parseInt(scoreArr[i-1]);

            if(score > powerSet.get(color))
                powerSet.put(color, score);           
        }
        int result = powerSet.get("red") * powerSet.get("green") * powerSet.get("blue");
        return result;
    }

    public int part1(String[] str_arr) {

        int sum = 0;
        for (String line : str_arr){
            int gameId = Integer.parseInt(line.substring(5,line.indexOf(':')));
            String gameScores = line.substring(line.indexOf(':')+2);
            if(isValidGame(gameScores)) sum+= gameId;
        }
        return  sum;
    }

    public int part2(String[] str_arr){
        int sum = 0;
        for (String line : str_arr)
        {
            //System.out.println("[Debugging] Process  ")
            sum += getPowerSet(line.substring(line.indexOf(':')+2));
        }
        return sum;
    }

}
