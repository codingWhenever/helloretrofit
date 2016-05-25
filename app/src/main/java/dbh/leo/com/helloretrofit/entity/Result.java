package dbh.leo.com.helloretrofit.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Created by leo on 2016/5/23.
 */
public class Result implements Serializable {
    @SerializedName("reason")
    @Expose
    private String reason;
    @SerializedName("result")
    @Expose
    private HashMap<String, Team> result;
    @SerializedName("error_code")
    @Expose
    private Integer errorCode;

    /**
     * @return The reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * @param reason The reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * @return The result
     */
    public HashMap<String, Team> getResult() {
        return result;
    }

    /**
     * @param result The result
     */
    public void setResult(HashMap<String, Team> result) {
        this.result = result;
    }

    /**
     * @return The errorCode
     */
    public Integer getErrorCode() {
        return errorCode;
    }

    /**
     * @param errorCode The error_code
     */
    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

}
