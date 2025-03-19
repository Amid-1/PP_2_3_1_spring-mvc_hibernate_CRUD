package web.validators;

public class EmailValidatorByLengthImpl implements EmailValidator {

    private int minEmailLength;

    public EmailValidatorByLengthImpl(int minEmailLength) {
        this.minEmailLength = minEmailLength;
    }

    @Override
    public void validate(String email) {
        if (email.length() < minEmailLength) {
            throw new IllegalArgumentException("Длина Email не соответствует требованию");
        }
    }
}
