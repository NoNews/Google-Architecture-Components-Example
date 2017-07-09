package ru.alexbykov.mvvmexample.live_data;

import android.arch.lifecycle.LiveData;

import ru.alexbykov.mvvmexample.GetUserCallback;
import ru.alexbykov.mvvmexample.UserViewModelState;
import ru.alexbykov.mvvmexample.repository.models.UserDTO;
import ru.alexbykov.mvvmexample.repository.UserRepository;

/**
 * Date: 09.07.2017
 * Time: 18:33
 * Project: MVVMexample
 *
 * @author Alex Bykov
 *         You can contact me at me@alexbykov.ru
 */
public class UserLiveData extends LiveData<UserDTO> implements GetUserCallback {

    private UserRepository userRepository;

    private UserViewModelState userViewModelState;


    public UserLiveData() {
        userRepository = new UserRepository();
    }


    public LiveData<UserDTO> getUserData(UserViewModelState userViewModelState) {
        this.userViewModelState = userViewModelState;
        return this;
    }


    //Вызывается, когда подписываются на обновления
    @Override
    protected void onActive() {
        super.onActive();
        userViewModelState.showLoading(true);
        userRepository.getCacheUser(this);
        userRepository.getUserFromBackend(this);
    }


    @Override
    public void onSuccessGetUser(UserDTO user) {
        setValue(user); //метод setValue посылает сообщение подписчикам о том, что нужно обновить данные
        userViewModelState.showLoading(false);
    }

    @Override
    public void handleError(String reason) {
        userViewModelState.showLoading(false);
        userViewModelState.showError(true);
    }
}
