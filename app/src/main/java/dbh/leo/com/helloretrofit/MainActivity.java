package dbh.leo.com.helloretrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.List;

import dbh.leo.com.helloretrofit.entity.Team;
import dbh.leo.com.helloretrofit.presenter.TeamPresenter;
import dbh.leo.com.helloretrofit.view.TeamView;

public class MainActivity extends AppCompatActivity implements TeamView<List<Team>> {


    private RecyclerView mRecyclerView;
    private List<Team> mData = new ArrayList<Team>();
    private ProgressBar mProgressBar;
    private TeamPresenter mTeamPresenter;
    private android.os.Handler mHandler = new android.os.Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        mProgressBar = (ProgressBar) findViewById(R.id.progress);
        mTeamPresenter = new TeamPresenter(this, this);
        mTeamPresenter.attachView(this);
        mTeamPresenter.fillData(mRecyclerView, mData);
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                mTeamPresenter.getDataFromNet();
            }
        }, 2000);
    }


    @Override
    public void showData(List<Team> teamList) {
        mTeamPresenter.refreshData(teamList);
    }

    @Override
    public void showProgress() {
        if (mProgressBar != null) {
            mProgressBar.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void hideProgress() {
        if (mProgressBar != null) {
            mProgressBar.setVisibility(View.GONE);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mTeamPresenter.detachView();
        mHandler.removeCallbacksAndMessages(null);
    }
}
