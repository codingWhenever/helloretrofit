package dbh.leo.com.helloretrofit.presenter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.List;

import dbh.leo.com.helloretrofit.DetailInfoActivity;
import dbh.leo.com.helloretrofit.R;
import dbh.leo.com.helloretrofit.adapter.BaseAdapter;
import dbh.leo.com.helloretrofit.adapter.ViewHolder;
import dbh.leo.com.helloretrofit.entity.Team;
import dbh.leo.com.helloretrofit.model.TeamModel;
import dbh.leo.com.helloretrofit.view.DividerGridItemDecoration;
import dbh.leo.com.helloretrofit.view.TeamView;

/**
 * Created by leo on 2016/5/25.
 */
public class TeamPresenter implements ITeamsPresenter<List<Team>> {
    TeamModel mTeamModel;
    TeamView mTeamView;
    Context mContext;
    BaseAdapter<Team> mBaseAdapter;
    List<Team> mList;

    public TeamPresenter(Context context, TeamView teamView) {
        mTeamView = teamView;
        mTeamModel = new TeamModel(context, this);
        this.mContext = context;
    }

    /**
     * @param recyclerView
     * @param list
     */
    public void fillData(RecyclerView recyclerView, final List<Team> list) {
        recyclerView.setLayoutManager(new GridLayoutManager(mContext, 3));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerGridItemDecoration(mContext));
        this.mList = list;
        mBaseAdapter = new BaseAdapter<Team>(mContext, R.layout.item_team, mList) {
            @Override
            public void convert(ViewHolder viewholder, Team team) {
                if (team == null)
                    return;
                viewholder.setText(R.id.tv_name, team.getName());
                ImageView ivLogo = viewholder.getView(R.id.iv_logo);
                Picasso.with(mContext).load(team.getLogoLink()).into(ivLogo);

            }
        };
        mBaseAdapter.setOnItemClickListener(new BaseAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Team team = list.get(position);
                if (team != null) {
                    mContext.startActivity(new Intent(mContext, DetailInfoActivity.class).putExtra("team", team));
                }
            }
        });
        recyclerView.setAdapter(mBaseAdapter);
    }

    public void refreshData(List<Team> list) {
        if (mBaseAdapter != null) {
            if (mList != null) {
                mList.clear();
                mList.addAll(list);
            }
            mBaseAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public void loadDataSuccess(List<Team> teamList) {
        mTeamView.showData(teamList);
        mTeamView.hideProgress();
    }

    @Override
    public void loadDataFailure() {
        mTeamView.hideProgress();
    }

    @Override
    public void attachView(TeamView view) {
        this.mTeamView = view;
        mTeamView.showProgress();
    }

    @Override
    public void detachView() {
        this.mTeamView = null;
    }

    public void getDataFromNet() {
        mTeamView.showProgress();
        mTeamModel.loadData();
    }


}
