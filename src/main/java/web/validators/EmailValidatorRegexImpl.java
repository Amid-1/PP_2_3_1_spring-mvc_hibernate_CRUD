package web.validators;

import java.util.regex.Pattern;

public class EmailValidatorRegexImpl implements EmailValidator {

    private Pattern pattern;

    public void setPattern(String regex) {
        this.pattern = Pattern.compile(regex);
    }

    @Override
    public void validate(String email) {
        if (!pattern.matcher(email).find()) {
            throw new IllegalArgumentException("Email не соответствует формату");
        }
    }
}
