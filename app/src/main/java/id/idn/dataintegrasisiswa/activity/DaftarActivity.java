package id.idn.dataintegrasisiswa.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;


import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import id.idn.dataintegrasisiswa.InitRetrofit.APIService;
import id.idn.dataintegrasisiswa.InitRetrofit.InitLibrary;
import id.idn.dataintegrasisiswa.R;
import id.idn.dataintegrasisiswa.ResponseServer.ResponseDaftar;
import id.idn.dataintegrasisiswa.helper.HeroHelper;
import retrofit2.Callback;
import retrofit2.Response;

public class DaftarActivity extends AppCompatActivity {

    @BindView(R.id.daftarusername)
    EditText daftarusername;
    @BindView(R.id.daftaremail)
    EditText daftaremail;
    @BindView(R.id.daftarhp)
    EditText daftarhp;
    @BindView(R.id.daftarpassword)
    EditText daftarpassword;
    @BindView(R.id.daftarconfirmasipass)
    EditText daftarconfirmasipass;
    @BindView(R.id.btnSignUp)
    Button btnSignUp;
    String namaT, emailT, no_hpT, passwordT, passwordConfrmT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnSignUp)
    public void onViewClicked() {
        namaT = daftarusername.getText().toString();
        emailT = daftaremail.getText().toString();
        no_hpT = daftarhp.getText().toString();
        passwordT = daftarpassword.getText().toString();
        passwordConfrmT = daftarconfirmasipass.getText().toString();

        if (!passwordT.equals(passwordConfrmT)) {
            HeroHelper.pesan(DaftarActivity.this, "Password Tidak Cocok");
        } else if (!namaT.isEmpty()
                && !emailT.isEmpty()
                && !no_hpT.isEmpty()
                && !passwordT.isEmpty()
                && !passwordConfrmT.isEmpty()) {
            APIService api = InitLibrary.api;
            retrofit2.Call<ResponseDaftar> call = api.request_daftar_manual(namaT, emailT, no_hpT, passwordT);
            call.enqueue(new Callback<ResponseDaftar>() {
                @Override
                public void onResponse(retrofit2.Call<ResponseDaftar> call, Response<ResponseDaftar> response) {
                    if (response.isSuccessful()) {
                        String result = response.body().getResult();
                        String msg = response.body().getMsg();

                        if (result.equals("1")) {
                            startActivity(new Intent(DaftarActivity.this, LoginActivity.class));
                        } else {
                            HeroHelper.pesan(DaftarActivity.this, msg);
                        }

                    }
                }

                @Override
                public void onFailure(retrofit2.Call<ResponseDaftar> call, Throwable t) {
                    t.printStackTrace();
                }
            });
        }

    }
}
