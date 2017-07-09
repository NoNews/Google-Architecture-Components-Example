package ru.alexbykov.mvvmexample;

import ru.alexbykov.mvvmexample.repository.models.UserDTO;

/**
 * Date: 09.07.2017
 * Time: 19:38
 * Project: MVVMexample
 *
 * @author Alex Bykov
 *         You can contact me at me@alexbykov.ru
 */
public interface GetUserCallback {

    void onSuccessGetUser(UserDTO user);
    void handleError(String reason);
}
