package ru.alexbykov.mvvmexample.view_model;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import ru.alexbykov.mvvmexample.UserViewModelState;
import ru.alexbykov.mvvmexample.live_data.LoadingLiveData;
import ru.alexbykov.mvvmexample.live_data.UserLiveData;
import ru.alexbykov.mvvmexample.repository.models.UserDTO;

/**
 * Date: 09.07.2017
 * Time: 18:17
 * Project: MVVMexample
 *
 * @author Alex Bykov
 *         You can contact me at me@alexbykov.ru
 */
public class ProfileViewModel extends ViewModel implements UserViewModelState {

    private UserLiveData userLiveData;
    private LoadingLiveData loadingLiveData;


    public ProfileViewModel() {
        loadingLiveData = new LoadingLiveData();
        userLiveData = new UserLiveData();
    }

    public LiveData<UserDTO> waitUserData() {
        return userLiveData.getUserData(this);
    }


    public LiveData<LoadingViewModel> waitLoading() {
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
