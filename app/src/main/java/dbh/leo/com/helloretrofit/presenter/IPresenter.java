package dbh.leo.com.helloretrofit.presenter;

import dbh.leo.com.helloretrofit.entity.Result;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by leo on 2016/5/25.
 */
public interface IPresenter {
    /**
     * @param key
     * @return
     */
    @GET("/nba/all_team_info.php?")
    Call<Result> getResult(@Query("key") String key);
}
