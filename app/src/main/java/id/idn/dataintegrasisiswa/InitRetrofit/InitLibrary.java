package id.idn.dataintegrasisiswa.InitRetrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by hp on 1/4/2018.
 */

public class InitLibrary {
    public static String WEB_URL = "http://192.168.10.48/ojeg_server1/api/";

    public static Retrofit retrofit =
            new Retrofit.Builder()
                    .baseUrl(WEB_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

    public static APIService api = retrofit.create(APIService.class);

    public static Retrofit setInit2() {

        return new Retrofit.Builder().baseUrl("http://maps.googleapis.com/maps/api/directions/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

    }
    public static APIService getInstance2() {

        return setInit2().create(APIService.class);


    }
}
