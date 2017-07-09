package ru.alexbykov.mvvmexample.ui.activities;

import android.arch.lifecycle.LifecycleActivity;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import ru.alexbykov.mvvmexample.models.Loading;

/**
 * Date: 09.07.2017
 * Time: 18:08
 * Project: MVVMexample
 *
 * @author Alex Bykov
 *         You can contact me at me@alexbykov.ru
 */


public abstract class BaseActivity extends LifecycleActivity {


    protected ProgressBar progressBar;
    protected ViewGroup ltData;

    public void showLoading(@NonNull Loading loading) {
        if (loading.isLoading()) showAndHide(progressBar, ltData);
        else showAndHide(ltData, progressBar);
    }

    private void showAndHide(View view1, View view2) {
        showView(view1);
        hideView(view2);
    }


    protected final void hideView(@NonNull View view) {
        if (view.getVisibility() == View.VISIBLE) {
            view.setVisibility(View.GONE);
        }
    }

    protected final void showView(@NonNull View view) {
        if (view.getVisibility() == View.GONE) {
            view.setVisibility(View.VISIBLE);
        }
    }


    @SuppressWarnings("unchecked")
    protected final <V extends View> V bindView(@IdRes int res) {
        return (V) findViewById(res);
    }

}
