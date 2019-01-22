import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeChef {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char num = s.charAt(0);
        char move = s.charAt(1);
        int numInt = Character.getNumericValue(num);
        int moveInt = Character.getNumericValue(move);

        Integer[] arr = new Integer[numInt];
        int i,j,k;
        for(i=0;i<arr.length;i++){
            arr[i] = 0;
        }

        for(j=0;j<moveInt;j++) {
            int ct=0;
            String que = br.readLine();
            if(que.equals("closeall")){
                for(i=0;i<arr.length;i++){
                    arr[i] = 0;
                }
            }
            else {
                char tweet = que.charAt(5);
                int tweetNum = Character.getNumericValue(tweet);
                if (arr[(tweetNum-1)] == 0)
                    arr[(tweetNum-1)] = 1;
                else
                    arr[(tweetNum-1)] = 0;
            }


            for (k = 0; k < arr.length; k++) {
                if (arr[k] == 1)
                    ct++;
            }

            System.out.println(ct);
        }

    }
}
