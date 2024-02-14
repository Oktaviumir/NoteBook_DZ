package util;

import model.User;

public class UserValidation {
    public User validate(User user) {
        //A N n a
        String name = user
                .getFirstName()
                .replaceAll(" ", "")
                .trim();
        String lName = user
                .getLastName()
                .replaceAll(" ", "")
                .trim();
        user.setFirstName(name);
        user.setLastName(lName);
        return user;
    }

    public boolean valid(User user) {
        if (!user.getFirstName().isEmpty())
            if (!user.getLastName().isEmpty())
                return true;
        return false;
    }
}