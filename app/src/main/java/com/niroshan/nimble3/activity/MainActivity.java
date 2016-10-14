package com.niroshan.nimble3.activity;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.niroshan.nimble3.R;
import com.niroshan.nimble3.adapter.PageAdapter;
import com.niroshan.nimble3.dto.BeanDataList;
import com.niroshan.nimble3.fragment.CardPagerFragment;
import com.niroshan.nimble3.listener.RxResponseListener;
import com.niroshan.nimble3.retrofit.GetDataList;
import com.niroshan.nimble3.utils.AppUtils;

import java.util.ArrayList;

import me.relex.circleindicator.CircleIndicator;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, ViewPager.OnPageChangeListener {

    private ViewPager viewPager;
    private CircleIndicator indicator;
    private PageAdapter dataPagerAdapter;
    private int pageNumber = 1;
    private Boolean isLoading = false;
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        setToolbar();
        init();
        callDataListApi();
    }

    private void init() {
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        viewPager.addOnPageChangeListener(this);
        indicator = (CircleIndicator) findViewById(R.id.indicatorActive);
        dataPagerAdapter = new PageAdapter(getSupportFragmentManager());
    }

    private void callDataListApi() {

        if (AppUtils.checkNetworkConnection(getApplicationContext())) {

            final Dialog dialog = AppUtils.showProgress(this);
            new GetDataList(this, new RxResponseListener<BeanDataList>() {

                @Override
                public void serviceResponse(ArrayList<BeanDataList> serviceResponseResponse) {
                    setListDataRX(serviceResponseResponse);
                }

                @Override
                public void serviceThrowable(Throwable throwable) {
                    dialog.dismiss();
                }

                @Override
                public void serviceComplete() {
                    dialog.dismiss();
                }
            }, String.valueOf(pageNumber)).callDataListServiceRXWay();

        } else{
            AppUtils.showAlert(this, getString(R.string.app_name), this.getString(R.string.msg_turn_on_network), null);
        }

    }

    private void setToolbar() {
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle("");
        TextView title = (TextView) mToolbar.findViewById(R.id.tv_toolbar_title);
        AppUtils.setTextViewFontSizeBasedOnScreenDensity(this, title, 18.0f);
        title.setText("SURVEYS");
        ImageView refreshIcon = (ImageView) findViewById(R.id.refresh);
        refreshIcon.setOnClickListener(this);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    private void setListDataRX(ArrayList<BeanDataList> serviceResponseResponse) {

        if (serviceResponseResponse != null && !serviceResponseResponse.isEmpty()) {

            for (BeanDataList data : serviceResponseResponse) {
                dataPagerAdapter.addFragment(CardPagerFragment.newInstance(data), data.getTitle());
            }

            if (pageNumber > 1) {

                viewPager.getAdapter().notifyDataSetChanged();
                indicator.setViewPager(viewPager);
                isLoading = false;

            } else {

                viewPager.setAdapter(dataPagerAdapter);
                indicator.setViewPager(viewPager);
            }

        } else {
            AppUtils.showAlert(this, getString(R.string.app_name), this.getString(R.string.msg_operation_fail), null);
        }
    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.refresh:
                pageNumber = 1;
                dataPagerAdapter = new PageAdapter(getSupportFragmentManager());
                callDataListApi();
                break;

            default:
                break;

        }

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        if (position == dataPagerAdapter.getCount() - 1 && !isLoading) {
            pageNumber++;
            callDataListApi();
            isLoading = true;
        }

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
