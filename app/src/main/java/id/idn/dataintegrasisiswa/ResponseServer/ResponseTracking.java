
package id.idn.dataintegrasisiswa.ResponseServer;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class ResponseTracking {

    @SerializedName("data")
    private List<DataTracking> mData;
    @SerializedName("msg")
    private String mMsg;
    @SerializedName("result")
    private String mResult;

    public List<DataTracking> getData() {
        return mData;
    }

    public void setData(List<DataTracking> data) {
        mData = data;
    }

    public String getMsg() {
        return mMsg;
    }

    public void setMsg(String msg) {
        mMsg = msg;
    }

    public String getResult() {
        return mResult;
    }

    public void setResult(String result) {
        mResult = result;
    }

}
