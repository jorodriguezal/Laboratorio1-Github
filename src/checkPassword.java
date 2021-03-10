import java.util.regex.Pattern;

public class checkPassword {
  // checks if a pass is valid
  // valid pass have at least 1 number, 1 lowercase char, 1 uppercase char
  // a special symbol and a length of {8,20}
  boolean checkPassword(String pass) {
    Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$");
    return pattern.matcher(pass).find();
  }
}