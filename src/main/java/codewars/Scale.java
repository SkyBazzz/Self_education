package codewars;


import java.util.Arrays;
import java.util.List;

public class Scale {

    public static String scale(String strng, int k, int n) {

        if ("".equals(strng))
            return "";
        List<String> stringList = Arrays.asList(strng.split("\\n"));
        StringBuilder solution = new StringBuilder();
        for (String aStringList : stringList) {
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < aStringList.length(); l++) {
                    for (int m = 0; m < k; m++) {
                        solution.append(aStringList.charAt(l));
                    }
                }

                solution.append("\n");
            }
        }
        return solution.toString().trim();
    }
}