package com.adhass.creators.squadgames.controllers;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.adhass.creators.squadgames.R;

/**
 * Created by adityanadkarni on 8/21/17.
 */

public class MainScreenFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_sign_in_main_screen, container, false);
        (v.findViewById(R.id.first_register_button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = SignInActivity.fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.sign_in_container, new RegisterFragment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
                fragmentTransaction.commit();
            }
        });
        (v.findViewById(R.id.first_login_button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = SignInActivity.fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.sign_in_container, new LoginFragment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
                fragmentTransaction.commit();
            }
        });
        return v;
    }
}
