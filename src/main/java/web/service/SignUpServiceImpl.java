package web.service;

import web.blacklist.PasswordsBlackList;
import web.validators.EmailValidator;
import web.validators.PasswordValidator;

public class SignUpServiceImpl implements SignUpService {

    private  final PasswordsBlackList passwordsBlackList;
    private final EmailValidator emailValidator;
    private final PasswordValidator passwordValidator;

    public SignUpServiceImpl(PasswordsBlackList passwordsBlackList, EmailValidator emailValidator, PasswordValidator passwordValidator) {
        this.passwordsBlackList = passwordsBlackList;
        this.emailValidator = emailValidator;
        this.passwordValidator = passwordValidator;
    }


    @Override
    public void signUp(String email, String password) {

    }
}
