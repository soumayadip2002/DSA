import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

  public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        int numRank = 0;
                //Mark each score with its rank
        for (Integer num : ranked) {
            if (!hm.containsKey(num)) {
                hm.put(num, ++numRank);
            }
        }
                //I just prefer doing ascending but either way works
        Collections.reverse(ranked);
                //"count" is used to keep track
        int count = 0;
        for (Integer play : player) {
                        //Assume the player is ranked 1st
            list.add(1);
            for (int i = count; i < ranked.size(); i++) {
                if (play < ranked.get(i)) {
                                        //Remove assumption
                    list.remove(list.size()-1);
                                        //Look for rank in HashMap and add 1
                    list.add(hm.get(ranked.get(i))+1);
                    break;
                }
                count++;
            }
        }
        return list;
    }

}

public class LeaderBoard {
    public static void main(String[] args) throws IOException {
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter sc = new BufferedWriter(new FileWriter(System.getenv("Array")));
       List<Integer>ranked = Stream.of(in.readLine().replace("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList());
       List<Integer>player = Stream.of(in.readLine().replace("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList());
       
       List<Integer>result = Result.climbingLeaderboard(ranked, player);

       sc.write(
        result.stream()
            .map(Object::toString)
            .collect(joining("\n"))
        + "\n"
    );
    in.close();
    sc.close();
    }
}
