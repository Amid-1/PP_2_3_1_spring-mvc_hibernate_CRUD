package web.blacklist;

import java.util.Arrays;
import java.util.List;

public class PasswordsBlackListInMemoryImpl implements PasswordsBlackList{

    private static final List<String> BAD_PASSWORDS = Arrays.asList("qwerty007", "qwerty008", "123");

    @Override
    public boolean contains(String password) {
        return BAD_PASSWORDS.contains(password);
    }
}
