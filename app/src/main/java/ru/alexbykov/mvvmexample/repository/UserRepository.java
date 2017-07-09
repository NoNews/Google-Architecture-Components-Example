package ru.alexbykov.mvvmexample.repository;

import ru.alexbykov.mvvmexample.GetUserCallback;
import ru.alexbykov.mvvmexample.repository.models.UserDTO;

/**
 * Date: 09.07.2017
 * Time: 19:35
 * Project: MVVMexample
 *
 * @author Alex Bykov
 *         You can contact me at me@alexbykov.ru
 */
public class UserRepository {

    private UserDTO user;


    public UserRepository() {

    }

    public void getUserFromBackend(GetUserCallback repositoryCallback) {

        // TODO: 09.07.2017 rest here
        if (user == null) {
            user = new UserDTO();
            user.setName("Bojack");
            user.setSecondName("HourceMan");
            user.setLastName("Secretariat");
            user.setAge(50);
            repositoryCallback.onSuccessGetUser(user);
        }
    }


    public void getCacheUser(GetUserCallback repositoryCallback) {
        // TODO: 09.07.2017 db here
        if (user == null) {
            user = new UserDTO();
            user.setName("Bojack");
            user.setSecondName("HourceMan");
            user.setLastName("Secretariat");
            user.setAge(50);
            repositoryCallback.onSuccessGetUser(user);
        }
    }
}
