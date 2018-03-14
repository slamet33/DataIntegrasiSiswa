package id.idn.dataintegrasisiswa.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import id.idn.dataintegrasisiswa.R;
import id.idn.dataintegrasisiswa.activity.DaftarActivity;
import id.idn.dataintegrasisiswa.activity.LoginActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class FourthPage extends Fragment {


    public FourthPage() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fourth_page, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button btnSignUp, btnLogin;
        btnLogin = view.findViewById(R.id.btnLogIn);
        btnSignUp = view.findViewById(R.id.btnSignUp);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), LoginActivity.class));
            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), DaftarActivity.class));
            }
        });
    }
}

