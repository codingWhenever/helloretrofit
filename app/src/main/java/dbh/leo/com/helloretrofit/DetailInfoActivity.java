package dbh.leo.com.helloretrofit;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import dbh.leo.com.helloretrofit.entity.Team;

/**
 * Created by leo on 2016/5/25.
 */
public class DetailInfoActivity extends AppCompatActivity {

    private Team mTeam;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_detail_info);

        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("team")) {
            mTeam = (Team) intent.getSerializableExtra("team");
        }

        initControls();
    }

    private void initControls() {
        ImageView iv_logo = (ImageView) findViewById(R.id.iv_logo);
        TextView tv_name = (TextView) findViewById(R.id.tv_name);
        TextView tv_coach = (TextView) findViewById(R.id.tv_coach);
        TextView tv_conference = (TextView) findViewById(R.id.tv_conference);
        TextView tv_home = (TextView) findViewById(R.id.tv_home);
        TextView tv_intro = (TextView) findViewById(R.id.tv_intro);

        if (mTeam != null) {
            Picasso.with(this).load(mTeam.getLogoLink()).into(iv_logo);

            tv_name.setText(mTeam.getName());
            tv_conference.setText("NBA" + (mTeam.getConference().equals("W") ? "西" : "东") + "部联盟");
            tv_coach.setText("主教练：" + mTeam.getChiefCoach());
            tv_home.setText("主场馆：" + mTeam.getHome());
            tv_intro.setText(mTeam.getIntro());

        }

    }


}
