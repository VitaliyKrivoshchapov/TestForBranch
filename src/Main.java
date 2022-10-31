import java.util.HashMap;
import java.util.Map;

public class Main {
    static public String rsi= "ac=223-419895 softplay=true";


    public static void main(String[] args) {
        setStatProfileByLimitToSession();
        System.out.println("hi git");
// from git
        System.out.println( "hi git");
// change all
    // new  change
        // do somthing in new Branch

        System.out.println("hi git");
        //slkdfngtwoigsmnrtlwoijfgh[;
        //adfasdf
        //asdfasdf

// кто-то работает в main
    }

    private static Map<String, String> parsAri(String rsi) {
        if (rsi != null) {
            System.out.println("sdfg");
        }

        return null;
    }

    private  static Map<Integer, String> setStatProfileByLimitToSession() {
        Map<Integer, String> statProfileByLimit = new HashMap<>();
        //statProfileByLimit.put(0, "default");
        String profile = null;
        if (rsi != null) {
            String stat = "stats=";
            for (String s : rsi.split(" ")) {
                if (s.contains(stat)) {
                    profile = s.substring(s.indexOf("=") + 1);
                }
            }
            if (profile != null) {
                String[] split = profile.split("&");
                for (String s : split) {
                    if (s.contains(":")) {
                        String[] splited = s.split(":");
                        statProfileByLimit.put(Integer.parseInt(splited[0]), splited[1]);
                    } else {
                        statProfileByLimit.put(0, s);
                    }
                }
            }
        }
        return statProfileByLimit;
    }


}
