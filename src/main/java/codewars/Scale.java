package codewars;


import java.util.Arrays;
import java.util.List;

public class Scale {

    public static String scale(String strng, int k, int n) {

        if ("".equals(strng))
            return "";
        List<String> stringList = Arrays.asList(strng.split("\\n"));
        StringBuilder solution = new StringBuilder();
        for (int i = 0; i < stringList.size(); i++) {
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < stringList.get(i).length(); l++) {
                    for (int m = 0; m < k; m++) {
                        solution.append(stringList.get(i).charAt(l));
                    }
                }

                solution.append("\n");
            }
        }
        return solution.toString().trim();
    }
}