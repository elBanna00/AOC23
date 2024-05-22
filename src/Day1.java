
public class Day1 {
    public int part1(String[] str_arr) {
        int sum = 0;
        for(String line : str_arr){

            int firstdigit = -1;
            int lastdigit = 0;

            for(int i =0 ;i < line.length();i++){

                char c = line.charAt(i);

                if( c >= '0' && c <= '9') {
                    lastdigit = Character.getNumericValue(c);
                    if (firstdigit == -1) {
                        firstdigit = Character.getNumericValue(c);
                    }
                }

            }
            sum += firstdigit*10 + lastdigit;
        }
    return sum;
    }
}
