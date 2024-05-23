
import java.util.Hashtable;
import java.util.Map;

public class Day1 {

    public int part1(String[] str_arr) {
        int sum = 0;
        for (String line : str_arr) {

            int firstdigit = -1;
            int lastdigit = 0;

            for (int i = 0; i < line.length(); i++) {

                char c = line.charAt(i);

                if (c >= '0' && c <= '9') {
                    lastdigit = Character.getNumericValue(c);
                    if (firstdigit == -1) {
                        firstdigit = Character.getNumericValue(c);
                    }
                }

            }
            sum += firstdigit * 10 + lastdigit;
        }
        return sum;
    }

    public int part2(String[] str_arr) {
        Map<String, Integer> dict = new Hashtable<>() {
            {
                put("one", 1);
                put("two", 2);
                put("three", 3);
                put("four", 4);
                put("five", 5);
                put("six", 6);
                put("seven", 7);
                put("eight", 8);
                put("nine", 9);
            }
        };

        int sum = 0;
        for (String line : str_arr) {

            int firstdigit = -1;
            int lastdigit = 0;

            for (int i = 0; i < line.length(); i++) {

                char c = line.charAt(i);

                if (c >= '0' && c <= '9') {
                    lastdigit = Character.getNumericValue(c);
                    if (firstdigit == -1) {
                        firstdigit = Character.getNumericValue(c);
                    }
                } if (i + 2 < line.length()) {
                    String str = line.substring(i, i + 3);
                    if (dict.containsKey(str)) {
                        lastdigit = dict.get(str);
                        if (firstdigit == -1) {
                            firstdigit = dict.get(str);
                        }
                        continue;
                    }
                } if (i + 3 < line.length()) {
                    String str = line.substring(i  , i + 4);
                    if (dict.containsKey(str)) {
                        lastdigit = dict.get(str);
                        if (firstdigit == -1) {
                            firstdigit = dict.get(str);
                        }
                        continue;
                    }

                } if (i + 4 < line.length()) {
                    String str = line.substring(i , i + 5);
                    if (dict.containsKey(str)) {
                        lastdigit = dict.get(str);
                        if (firstdigit == -1) {
                            firstdigit = dict.get(str);
                        }
                    continue;
                    }
                }
                System.out.println(i + 3 < line.length());
            }
            sum += firstdigit * 10 + lastdigit;
            System.out.println(firstdigit*10 + lastdigit);
        }
        return sum;

    }
}
