package dbh.leo.com.helloretrofit.model;

import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dbh.leo.com.helloretrofit.entity.Result;
import dbh.leo.com.helloretrofit.entity.Team;
import dbh.leo.com.helloretrofit.presenter.IPresenter;
import dbh.leo.com.helloretrofit.presenter.ITeamsPresenter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by leo on 2016/5/25.
 */
public class TeamModel {
    private static final String TAG = "TeamModel";
    private static final String BASE_URL = "http://v.juhe.cn";
    //juhe数据api key
    private static final String KEY = "fdbb1f2d01e0e1f3b05a52a9adfea847";
    private Context mContext;
    private ITeamsPresenter mITeamsPresenter;

    public TeamModel(Context context, ITeamsPresenter ITeamsPresenter) {
        mContext = context;
        mITeamsPresenter = ITeamsPresenter;
    }

    public void loadData() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        IPresenter presenter = retrofit.create(IPresenter.class);
        Call<Result> call = presenter.getResult(KEY);
        call.enqueue(new Callback<Result>() {
            @Override
            public void onResponse(Call<Result> call, Response<Result> response) {
//                if (mData != null) {
//                    mData.clear();
                HashMap<String, Team> map = response.body().getResult();
                List<Team> temp = new ArrayList<Team>();
                for (Map.Entry<String, Team> me : map.entrySet()) {
                    temp.add(me.getValue());
                }
                if (temp.size() > 0) {
                    mITeamsPresenter.loadDataSuccess(temp);
//                        mData.addAll(temp);
//                        mBaseAdapter.notifyDataSetChanged();
                }

//                }
                Log.i(TAG, response.body().getResult().size() + "");


            }

            @Override
            public void onFailure(Call<Result> call, Throwable t) {
                mITeamsPresenter.loadDataFailure();
                Log.e(TAG, t.getMessage());
            }
        });
    }
}
