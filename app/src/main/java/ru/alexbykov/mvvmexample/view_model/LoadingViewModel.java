package ru.alexbykov.mvvmexample.view_model;

/**
 * Date: 09.07.2017
 * Time: 20:14
 * Project: MVVMexample
 *
 * @author Alex Bykov
 *         You can contact me at me@alexbykov.ru
 */
public class LoadingViewModel {

    private boolean isLoading;

    public void setProgress(boolean isLoading) {
        this.isLoading = isLoading;
    }

    public boolean isLoading(){
        return isLoading;
    }

}
