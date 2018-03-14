package id.idn.dataintegrasisiswa.ResponseServer;

//import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

//@Generated("com.robohorse.robopojogenerator")
public class DataItem{

	@SerializedName("booking_from_lat")
	private String bookingFromLat;

	@SerializedName("booking_jarak")
	private String bookingJarak;

	@SerializedName("booking_tanggal")
	private String bookingTanggal;

	@SerializedName("booking_from")
	private String bookingFrom;

	@SerializedName("booking_from_lng")
	private String bookingFromLng;

	@SerializedName("booking_tujuan")
	private String bookingTujuan;

	@SerializedName("booking_from_alamat")
	private String bookingFromAlamat;

	@SerializedName("booking_tujuan_lat")
	private String bookingTujuanLat;

	@SerializedName("booking_status")
	private String bookingStatus;

	@SerializedName("booking_user")
	private String bookingUser;

	@SerializedName("booking_biaya_driver")
	private String bookingBiayaDriver;

	@SerializedName("booking_driver")
	private Object bookingDriver;

	@SerializedName("id_booking")
	private String idBooking;

	@SerializedName("booking_tujuan_lng")
	private String bookingTujuanLng;

	@SerializedName("booking_complete_tanggal")
	private String bookingCompleteTanggal;

	@SerializedName("booking_biaya_user")
	private String bookingBiayaUser;

	@SerializedName("booking_take_tanggal")
	private String bookingTakeTanggal;

	public void setBookingFromLat(String bookingFromLat){
		this.bookingFromLat = bookingFromLat;
	}

	public String getBookingFromLat(){
		return bookingFromLat;
	}

	public void setBookingJarak(String bookingJarak){
		this.bookingJarak = bookingJarak;
	}

	public String getBookingJarak(){
		return bookingJarak;
	}

	public void setBookingTanggal(String bookingTanggal){
		this.bookingTanggal = bookingTanggal;
	}

	public String getBookingTanggal(){
		return bookingTanggal;
	}

	public void setBookingFrom(String bookingFrom){
		this.bookingFrom = bookingFrom;
	}

	public String getBookingFrom(){
		return bookingFrom;
	}

	public void setBookingFromLng(String bookingFromLng){
		this.bookingFromLng = bookingFromLng;
	}

	public String getBookingFromLng(){
		return bookingFromLng;
	}

	public void setBookingTujuan(String bookingTujuan){
		this.bookingTujuan = bookingTujuan;
	}

	public String getBookingTujuan(){
		return bookingTujuan;
	}

	public void setBookingFromAlamat(String bookingFromAlamat){
		this.bookingFromAlamat = bookingFromAlamat;
	}

	public String getBookingFromAlamat(){
		return bookingFromAlamat;
	}

	public void setBookingTujuanLat(String bookingTujuanLat){
		this.bookingTujuanLat = bookingTujuanLat;
	}

	public String getBookingTujuanLat(){
		return bookingTujuanLat;
	}

	public void setBookingStatus(String bookingStatus){
		this.bookingStatus = bookingStatus;
	}

	public String getBookingStatus(){
		return bookingStatus;
	}

	public void setBookingUser(String bookingUser){
		this.bookingUser = bookingUser;
	}

	public String getBookingUser(){
		return bookingUser;
	}

	public void setBookingBiayaDriver(String bookingBiayaDriver){
		this.bookingBiayaDriver = bookingBiayaDriver;
	}

	public String getBookingBiayaDriver(){
		return bookingBiayaDriver;
	}

	public void setBookingDriver(Object bookingDriver){
		this.bookingDriver = bookingDriver;
	}

	public Object getBookingDriver(){
		return bookingDriver;
	}

	public void setIdBooking(String idBooking){
		this.idBooking = idBooking;
	}

	public String getIdBooking(){
		return idBooking;
	}

	public void setBookingTujuanLng(String bookingTujuanLng){
		this.bookingTujuanLng = bookingTujuanLng;
	}

	public String getBookingTujuanLng(){
		return bookingTujuanLng;
	}

	public void setBookingCompleteTanggal(String bookingCompleteTanggal){
		this.bookingCompleteTanggal = bookingCompleteTanggal;
	}

	public String getBookingCompleteTanggal(){
		return bookingCompleteTanggal;
	}

	public void setBookingBiayaUser(String bookingBiayaUser){
		this.bookingBiayaUser = bookingBiayaUser;
	}

	public String getBookingBiayaUser(){
		return bookingBiayaUser;
	}

	public void setBookingTakeTanggal(String bookingTakeTanggal){
		this.bookingTakeTanggal = bookingTakeTanggal;
	}

	public String getBookingTakeTanggal(){
		return bookingTakeTanggal;
	}

	@Override
 	public String toString(){
		return 
			"DataItem{" + 
			"booking_from_lat = '" + bookingFromLat + '\'' + 
			",booking_jarak = '" + bookingJarak + '\'' + 
			",booking_tanggal = '" + bookingTanggal + '\'' + 
			",booking_from = '" + bookingFrom + '\'' + 
			",booking_from_lng = '" + bookingFromLng + '\'' + 
			",booking_tujuan = '" + bookingTujuan + '\'' + 
			",booking_from_alamat = '" + bookingFromAlamat + '\'' + 
			",booking_tujuan_lat = '" + bookingTujuanLat + '\'' + 
			",booking_status = '" + bookingStatus + '\'' + 
			",booking_user = '" + bookingUser + '\'' + 
			",booking_biaya_driver = '" + bookingBiayaDriver + '\'' + 
			",booking_driver = '" + bookingDriver + '\'' + 
			",id_booking = '" + idBooking + '\'' + 
			",booking_tujuan_lng = '" + bookingTujuanLng + '\'' + 
			",booking_complete_tanggal = '" + bookingCompleteTanggal + '\'' + 
			",booking_biaya_user = '" + bookingBiayaUser + '\'' + 
			",booking_take_tanggal = '" + bookingTakeTanggal + '\'' + 
			"}";
		}
}