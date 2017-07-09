package ru.alexbykov.mvvmexample.ui.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import ru.alexbykov.mvvmexample.R;
import ru.alexbykov.mvvmexample.repository.models.UserDTO;
import ru.alexbykov.mvvmexample.view_model.ProfileViewModel;

public class UserActivity extends BaseActivity {


    private static final int LAYOUT = R.layout.activity_user;


    private TextView tvName;
    private TextView tvSecondName;
    private TextView tvLastName;
    private TextView tvAge;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(LAYOUT);
        setupUI();
        setupUX();
        setupViewModel();
    }

    private void setupViewModel() {
        ProfileViewModel viewModel = new ProfileViewModel();
        viewModel.waitLoading().observe(this, this::showLoading);
        viewModel.waitUserData().observe(this, this::setupUser);
    }

    private void setupUser(@Nullable UserDTO user) {
        tvName.setText(user.getName());
        tvSecondName.setText(user.getSecondName());
        tvLastName.setText(user.getLastName());
        tvAge.setText(user.getAge() + "");
    }


    private void setupUX() {

    }


    private void setupUI() {
        tvName = bindView(R.id.tvName);
        tvSecondName = bindView(R.id.tvSecondName);
        tvLastName = bindView(R.id.tvLastName);
        tvAge = bindView(R.id.tvAge);
        progressBar = bindView(R.id.progressBar);
        ltData = bindView(R.id.ltData);
    }
}
