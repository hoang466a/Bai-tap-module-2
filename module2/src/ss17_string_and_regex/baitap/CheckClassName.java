package ss17_string_and_regex.baitap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckClassName {

    private static Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_REGEX =   "^[C|A|P]+[0-9]{4}+[G|H|I|K|L|M]$";
            //    ^[C|A|P]- Khớp ban đầu là C, A , P
            //    [^C|A|P]- Không khớp ban đầu là C, A , P

    public CheckClassName() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean checkclassname(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }


}
