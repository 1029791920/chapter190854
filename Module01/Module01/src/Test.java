import java.util.Scanner;
import java.util.Spliterator;

/**
 * @Author Tan
 * @date 2022年09月15日 15:11
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] strs = str.split(",");
        String str1 = strs[0];
        String str2 = strs[1];
        System.out.println(maxLong(str1, str2)==""?-1:maxLong(str1, str2));

    }

    public static String maxLong(String str1, String str2) {
        String result = "";
        for(int i = 0;i<str1.length();i++){
            for(int j= 0;j<str2.length();j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    String temp = "";
                    for(int k = i,m = j;k<str1.length() && m<str2.length();k++,m++){
                        if(str1.charAt(k)==str2.charAt(m)){
                            temp += str1.charAt(k);
                        }else{
                            break;
                        }
                    }
                    if(temp.length()>result.length()) result = temp;

                }
            }
        }
        return result;

    }
}
