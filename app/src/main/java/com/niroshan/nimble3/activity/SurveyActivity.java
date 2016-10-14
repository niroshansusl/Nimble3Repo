package com.niroshan.nimble3.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.niroshan.nimble3.R;
import com.niroshan.nimble3.config.AppConst;
import com.niroshan.nimble3.dto.BeanDataList;
import com.niroshan.nimble3.utils.AppUtils;

/**
 * Created by Niroshan on 10/14/2016.
 */

public class SurveyActivity extends AppCompatActivity {

    private static final String ARG_PARAM = "param";
    private Toolbar mToolbar;
    private BeanDataList data = null;
    private Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.survey_layout);

        bundle = this.getIntent().getExtras().getBundle(AppConst.PARAM_BUNDLE);

        if (bundle != null) {
            data = (BeanDataList) bundle.getSerializable(ARG_PARAM);
        }
        setToolbar();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.pull_in_right, R.anim.push_out_left);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            onBackPressed();
        }

        return super.onOptionsItemSelected(item);
    }

    private void setToolbar() {
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle("");

        TextView title = (TextView) mToolbar.findViewById(R.id.tv_toolbar_title);
        AppUtils.setTextViewFontSizeBasedOnScreenDensity(this, title, 18.0f);
        title.setText(data.getTitle());

        ImageView refreshIcon = (ImageView) findViewById(R.id.refresh);
        refreshIcon.setVisibility(View.GONE);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
