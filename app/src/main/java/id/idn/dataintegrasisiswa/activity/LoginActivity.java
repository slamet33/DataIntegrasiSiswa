package id.idn.dataintegrasisiswa.activity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import id.idn.dataintegrasisiswa.InitRetrofit.APIService;
import id.idn.dataintegrasisiswa.InitRetrofit.InitLibrary;
import id.idn.dataintegrasisiswa.R;
import id.idn.dataintegrasisiswa.ResponseServer.Data;
import id.idn.dataintegrasisiswa.ResponseServer.ResponseLogin;
import id.idn.dataintegrasisiswa.helper.HeroHelper;
import id.idn.dataintegrasisiswa.helper.SessionManager;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by hp on 1/6/2018.
 */

public class LoginActivity extends AppCompatActivity {
    @BindView(R.id.loginemail)
    EditText loginemail;
    @BindView(R.id.loginpassword)
    EditText loginpassword;
    @BindView(R.id.signInManu)
    Button signInManu;

    SessionManager sesi;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        sesi = new SessionManager(this);
        int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE);

        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_PHONE_STATE},1);
        } else {
            //TODO
        }
    }

    @OnClick({R.id.signInManu})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.signInManu:
                signInButton();
                break;
        }
    }

    private void signInButton() {
        String devT = HeroHelper.getDeviceId(LoginActivity.this);
        String emailT = loginemail.getText().toString();
        String passT = loginpassword.getText().toString();

        if (emailT.isEmpty()){
            HeroHelper.pesan(this,"Email Harus Diisi");
        }else if (passT.isEmpty()){
            HeroHelper.pesan(this,"Password harus diisi");
        }else{
            APIService api = InitLibrary.api;

            retrofit2.Call<ResponseLogin> call = api.request_login(devT,emailT,passT);

            call.enqueue(new Callback<ResponseLogin>() {
                @Override
                public void onResponse(retrofit2.Call<ResponseLogin> call, Response<ResponseLogin> response) {
                    if(response.isSuccessful()){
                        String result = response.body().getResult();
                        String message = response.body().getMsg();

                        if (result.equals("true")){
                            String token = response.body().getToken();
                            Data data = response.body().getData();
                            String idUserT = data.getIdUser();
                            String namaI = data.getUserNama();
                            String emailTa = data.getUserEmail();
                            String noHpT = data.getUserHp();

                            sesi.cerateLoginSession(token);
                            sesi.setIduser(idUserT);
                            sesi.setEmail(emailTa);
                            sesi.setNama(namaI);
                            sesi.setPhone(noHpT);

                            startActivity(new Intent(LoginActivity.this, MainActivity.class));
                            finish();
                        }else{
                            HeroHelper.pesan(LoginActivity.this,message);
                        }
                    }else{
                        HeroHelper.pesan(LoginActivity.this,"Response Unsuccesfull");
                    }
                }

                @Override
                public void onFailure(retrofit2.Call<ResponseLogin> call, Throwable t) {
                    Log.d("error login", t.getMessage());
                }
            });

        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case 1:
                if ((grantResults.length > 0) && (grantResults[0] == PackageManager.PERMISSION_GRANTED)) {
                    //TODO
                }
                break;

            default:
                break;
        }
    }
}
