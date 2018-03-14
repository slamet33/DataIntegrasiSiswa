package id.idn.dataintegrasisiswa.ResponseServer;

//import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

//@Generated("com.robohorse.robopojogenerator")
public class ResponseDaftar {

	@SerializedName("msg")
	private String msg;

	@SerializedName("result")
	private String result;

	public void setResult(String result){
		this.result = result;
	}

	public String getResult(){
		return result;
	}

	public void setMsg(String msg){
		this.msg = msg;
	}

	public String getMsg(){
		return msg;
	}

//	@Override
// 	public String toString(){
//		return
//			"ResponseDaftar{" +
//			"result = '" + result + '\'' +
//			",msg = '" + msg + '\'' +
//			"}";
//		}
}