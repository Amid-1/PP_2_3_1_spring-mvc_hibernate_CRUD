package web.validators;

public class PasswordValidatorByCharactersxImpl implements PasswordValidator{

    @Override
    public void validate(String password) {
        if (password.indexOf('&') == -1 ||
                password.indexOf('!') == -1 ||
                password.indexOf('#') == -1 ||
                password.indexOf('$') == -1) {
            throw new IllegalArgumentException("Пароль не содержит спец. символов");
        }
    }
}
