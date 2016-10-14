package com.niroshan.nimble3.fragment;

import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.niroshan.nimble3.R;
import com.niroshan.nimble3.dto.BeanDataListItem;
import com.niroshan.nimble3.utils.AppUtils;

/**
 * Created by Niroshan on 10/13/2016.
 */

public class CardPagerFragment extends Fragment implements View.OnClickListener {

    private static final String ARG_PARAM1 = "param1";
    private String TAG = CardPagerFragment.class.getSimpleName();
    private Button ButtonSurvey;
    private BeanDataListItem mBeanDataListItem;

    private ImageView cardImage;
    private TextView title, description;

    public static CardPagerFragment newInstance(BeanDataListItem item) {
        CardPagerFragment fragment = new CardPagerFragment();
        Bundle args = new Bundle();
        args.putParcelable(ARG_PARAM1, item);
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mBeanDataListItem = getArguments().getParcelable(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.custom_pager_layout, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        init(view);
    }

    private void init(View view) {

        ButtonSurvey = (Button) view.findViewById(R.id.button);

        cardImage = (ImageView) view.findViewById(R.id.image_background);
        title = (TextView) view.findViewById(R.id.textView);
        AppUtils.setTextViewFontSizeBasedOnScreenDensity(getActivity(), title, 14.0f, Typeface.BOLD);

        description = (TextView) view.findViewById(R.id.textView2);
        AppUtils.setTextViewFontSizeBasedOnScreenDensity(getActivity(), description, 18.0f);
        description.setMovementMethod(new ScrollingMovementMethod());

    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public void onResume() {
        super.onResume();
        AppUtils.loadImageWithPlaceholder(getActivity(), mBeanDataListItem.getCover_image_url(), cardImage, R.drawable.placeholder);
        title.setText(mBeanDataListItem.getTitle());
        description.setText(mBeanDataListItem.getDescription());
    }

}
