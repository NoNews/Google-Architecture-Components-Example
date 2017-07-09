package ru.alexbykov.mvvmexample.business.view_model.user;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import ru.alexbykov.mvvmexample.business.live_data.LoadingLiveData;
import ru.alexbykov.mvvmexample.business.live_data.UserLiveData;
import ru.alexbykov.mvvmexample.models.Loading;
import ru.alexbykov.mvvmexample.repository.models.UserDTO;

/**
 * Date: 09.07.2017
 * Time: 18:17
 * Project: MVVMexample
 *
 * @author Alex Bykov
 *         You can contact me at me@alexbykov.ru
 */
public class UserViewModel extends ViewModel implements UserViewModelState {

    private UserLiveData userLiveData;
    private LoadingLiveData loadingLiveData;


    public UserViewModel() {
        loadingLiveData = new LoadingLiveData();
        userLiveData = new UserLiveData();
    }

    public LiveData<UserDTO> waitUserData() {
        return userLiveData.getUserData(this);
    }


    public LiveData<Loading> waitLoading() {
        return loadingLiveData;
    }

    @Override
    public void showLoading(boolean show) {
        loadingLiveData.showLoading(show);
    }

    @Override
    public void showError(boolean show) {

    }

}
