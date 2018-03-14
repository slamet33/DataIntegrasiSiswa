package id.idn.dataintegrasisiswa.InitRetrofit;

import id.idn.dataintegrasisiswa.ResponseServer.ResponseBooking;
import id.idn.dataintegrasisiswa.ResponseServer.ResponseDaftar;
import id.idn.dataintegrasisiswa.ResponseServer.ResponseHistory;
import id.idn.dataintegrasisiswa.ResponseServer.ResponseInsertBooking;
import id.idn.dataintegrasisiswa.ResponseServer.ResponseLogin;
import id.idn.dataintegrasisiswa.ResponseServer.ResponseTracking;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by hp on 1/4/2018.
 */

public interface APIService {
    // Request untuk daftar
//    Daftar dan Login Manual memiliki Response yang berbeda
    @FormUrlEncoded
    @POST("daftar")
    Call<ResponseDaftar> request_daftar_manual(
            @Field("nama") String nama,
            @Field("email") String email,
            @Field("phone") String no_hp,
            @Field("password") String password
    );

    // Request untuk Login
    @FormUrlEncoded
    @POST("login")
    Call<ResponseLogin> request_login(
            @Field("device") String device_id,
            @Field("f_email") String email,
            @Field("f_password") String password
    );

    // Menghandle request booking
    @FormUrlEncoded
    @POST("insert_booking")
    Call<ResponseBooking> request_booking(
            @Field("f_token") String token,
            @Field("f_device") String device,
            @Field("f_idUser") String idUser,
            @Field("f_latAwal") String latAwal,
            @Field("f_lngAwal") String lngAwal,
            @Field("f_awal") String awal,
            @Field("f_latAkhir") String latAkhir,
            @Field("f_lngAkhir") String lngAkhir,
            @Field("f_akhir") String akhir,
            @Field("f_jarak") String jarak,
            @Field("f_tarif") String tarif
    );

//    @GET("json")
//    Call<ResponseGoogle> request_route(
//            @Query("origin") String origin,
//            @Query("destination") String destination
//    );

    @FormUrlEncoded
    @POST("cancel_booking")
    Call<ResponseDaftar> request_cancel(
            @Field("id_booking") String idbooking,
            @Field("f_token") String token,
            @Field("f_device") String device
    );

    @FormUrlEncoded
    @POST("insert_booking")
    Call<ResponseInsertBooking> request_insertbooking(
            @Field("f_token") String token,
            @Field("f_device") String device,
            @Field("f_idUser") String iduser,
            @Field("f_latAwal") String latwal,
            @Field("f_lngAwal") String lattujuan,
            @Field("f_awal") String awal,
            @Field("f_latAkhir") String latakhir,
            @Field("f_lngAkhir") String lonakhir,
            @Field("f_akhir") String akhir,
            @Field("f_jarak") String jarak,
            @Field("f_tarif") String tarif


    );

    @FormUrlEncoded
    @POST("check_booking")
    Call<ResponseHistory> request_check(
            @Field("id_booking") String idbooking,
            @Field("f_token") String token,
            @Field("f_device") String device
    );
            //tambhan request get posisi driver
    @FormUrlEncoded
    @POST("get_driver")
     Call<ResponseTracking>request_tracking(
            @Field("id") String iduser

    );
    @FormUrlEncoded
    @POST("get_booking")
    Call<ResponseHistory>request_history(
            @Field("f_idUser") String idUser,
            @Field("status") String status
    );
//    Request Google juga digunakan untuk request login
//    @FormUrlEncoded //digunakan untuk Function
//    @POST("daftar")
//    Call<ResponseDaftarGoogle> request_daftar_Google(
//            @Field("nama") String nama,
//            @Field("email") String email,
//            @Field("phone") String phone
//    );
//    // Request Email Untuk Google Auth Login
//    @FormUrlEncoded //digunakan untuk Function
////    @POST("cekEmail")
//    @POST("cekEmail")
//    Call<ResponseDaftarGoogle> request_email(
//            @Field("email") String email
//    );

}
