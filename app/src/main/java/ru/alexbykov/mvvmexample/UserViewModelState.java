package ru.alexbykov.mvvmexample;

/**
 * Date: 09.07.2017
 * Time: 20:31
 * Project: MVVMexample
 *
 * @author Alex Bykov
 *         You can contact me at me@alexbykov.ru
 */
public interface UserViewModelState {

    void showLoading(boolean show);

    void showError(boolean show);

}
