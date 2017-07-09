package ru.alexbykov.mvvmexample.live_data;

import android.arch.lifecycle.LiveData;

import ru.alexbykov.mvvmexample.view_model.LoadingViewModel;


/**
 * Date: 09.07.2017
 * Time: 19:09
 * Project: MVVMexample
 *
 * @author Alex Bykov
 *         You can contact me at me@alexbykov.ru
 */
public class LoadingLiveData extends LiveData<LoadingViewModel> {


    private LoadingViewModel progressBar;

    public LoadingLiveData() {
        progressBar = new LoadingViewModel();
    }


    public void showLoading(boolean isLoading) {
        progressBar.setProgress(isLoading);
        setValue(progressBar);
    }
}
