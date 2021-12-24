package ss17_string_and_regex.baitap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckClassName {

    private static Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_REGEX =   "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public CheckClassName() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean checkclassname(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }


}
