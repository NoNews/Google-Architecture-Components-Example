package ru.alexbykov.mvvmexample.live_data;

import android.arch.lifecycle.LiveData;

import ru.alexbykov.mvvmexample.repository.models.Loading;


/**
 * Date: 09.07.2017
 * Time: 19:09
 * Project: MVVMexample
 *
 * @author Alex Bykov
 *         You can contact me at me@alexbykov.ru
 */
public class LoadingLiveData extends LiveData<Loading> {


    private Loading loading;

    public LoadingLiveData() {
        loading = new Loading();
    }


    public void showLoading(boolean isLoading) {
        loading.setProgress(isLoading);
        setValue(loading);
    }
}
