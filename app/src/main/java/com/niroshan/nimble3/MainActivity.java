package com.niroshan.nimble3;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.niroshan.nimble3.adapter.PageAdapter;
import com.niroshan.nimble3.dto.BeanDataList;
import com.niroshan.nimble3.dto.BeanDataListItem;
import com.niroshan.nimble3.fragment.CardPagerFragment;
import com.niroshan.nimble3.fragment.dialog.ProgressDialogFragment;
import com.niroshan.nimble3.listener.RxResponseListener;
import com.niroshan.nimble3.retrofit.GetDataList;
import com.niroshan.nimble3.utils.AppUtils;
import com.viewpagerindicator.CirclePageIndicator;

import java.util.ArrayList;
import java.util.Iterator;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, ViewPager.OnPageChangeListener {

    private ViewPager viewPager;
    private CirclePageIndicator indicator;
    private ArrayList<Fragment> fragmentArray;
    private Fragment singleFragment;
    private PageAdapter dataPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        init();
        callDataListApi();

    }

    private void init() {

        viewPager = (ViewPager) findViewById(R.id.view_pager);
        viewPager.addOnPageChangeListener(this);
        indicator = (CirclePageIndicator) findViewById(R.id.indicatorActive);
    }

    private void callDataListApi() {
        final ProgressDialogFragment dialogFragment = AppUtils.showProgressDialog(this);
        new GetDataList(this, new RxResponseListener<BeanDataList>() {

            @Override
            public void serviceResponse(ArrayList<BeanDataList> serviceResponseResponse) {

                setListDataRX(serviceResponseResponse);

            }

            @Override
            public void serviceThrowable(Throwable throwable) {
                AppUtils.closeProgressDialog(dialogFragment);

            }

            @Override
            public void serviceComplete() {
                AppUtils.closeProgressDialog(dialogFragment);

            }
        }).callDataListServiceRXWay();

    }

    private void setListDataRX(ArrayList<BeanDataList> serviceResponseResponse) {

        ArrayList<BeanDataList> list = serviceResponseResponse;

        BeanDataListItem temp = null;

        if (list != null && !list.isEmpty()) {

            dataPagerAdapter = new PageAdapter(getSupportFragmentManager());

            for (Iterator<BeanDataList> iterator = list.iterator(); iterator.hasNext(); ) {
                BeanDataList beanData = (BeanDataList) iterator.next();

                temp = new BeanDataListItem(beanData.getId(), beanData.getTitle());
                temp.setDescription(beanData.getDescription());
                temp.setShort_url(beanData.getShort_url());

                Log.d("List", "" + beanData.getTitle());

                dataPagerAdapter.addFragment(CardPagerFragment.newInstance(temp), beanData.getTitle());

                try {
                    temp.setCover_image_url((AppUtils.isEmpty(beanData.getCover_image_url()) ? null : beanData.getCover_image_url().concat("l")));
                } catch (Exception e) {
                    Log.e("MainActivity", e.toString());
                }
            }

            viewPager.destroyDrawingCache();

            viewPager.setAdapter(dataPagerAdapter);
            viewPager.getAdapter().notifyDataSetChanged();

            indicator.setViewPager(viewPager);

        } else {

            Toast.makeText(getApplicationContext(), "Loading Error", Toast.LENGTH_LONG).show();
        }
    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.button:
                //callDataListApi();
                break;

            default:
                break;


        }

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
