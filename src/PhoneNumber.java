import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static final String PHONENUMBER_REXGER = "^[(]+\\d{2}+[)]+[-]+[(]+[0]+\\d{9}+[)]$";
    public PhoneNumber(){}
    public boolean validate(String phone){
        Pattern pattern = Pattern.compile(PHONENUMBER_REXGER);
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }
}
