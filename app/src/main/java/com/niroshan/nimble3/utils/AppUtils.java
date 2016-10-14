package com.niroshan.nimble3.utils;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.niroshan.nimble3.MainActivity;
import com.niroshan.nimble3.fragment.dialog.ProgressDialogFragment;

/**
 * Created by Niroshan on 10/13/2016.
 */

public class AppUtils {

    public static AlertDialog showAlert(Context context, String title,
                                        String message, DialogInterface.OnClickListener listener) {
        AlertDialog d;
        try {
            if (listener == null) {
                listener = new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                };
            }

            d = new AlertDialog.Builder(context).setMessage(message)
                    .setTitle(title).setCancelable(true)
                    .setNeutralButton(android.R.string.ok, listener).show();
            return d;

        } catch (Exception e) {
        }
        return null;
    }

    public static void loadImageWithPlaceholder(Context context, String url, ImageView img, int placeholder) {
        Glide.with(context).load(url).placeholder(placeholder).into(img);
    }

    public static boolean isEmpty(String string) {
        if (string == null || string.trim().length() == 0) {
            return true;
        }
        return false;
    }

    public static void setTextViewFontSizeBasedOnScreenDensity(
            Activity activity, TextView tv, double size) {

        DisplayMetrics dMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(dMetrics);
        final float WIDE = activity.getResources().getDisplayMetrics().widthPixels;
        int valueWide = (int) (WIDE / size / (dMetrics.scaledDensity));
        tv.setTextSize(valueWide);
    }

    public static void setTextViewFontSizeBasedOnScreenDensity(
            Activity activity, TextView tv, double size, int style) {

        DisplayMetrics dMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(dMetrics);
        final float WIDE = activity.getResources().getDisplayMetrics().widthPixels;
        int valueWide = (int) (WIDE / size / (dMetrics.scaledDensity));
        tv.setTextSize(valueWide);
        tv.setTypeface(tv.getTypeface(), style);
    }

    //close ProgressDialogFragment
    public static void closeProgressDialog(ProgressDialogFragment dialogFragment) {
        try {
            dialogFragment.dismiss();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //show ProgressDialogFragmenta
    public static ProgressDialogFragment showProgressDialog(Activity activity) {
        ProgressDialogFragment dialogFragment = new ProgressDialogFragment();
        try {
            dialogFragment.setCancelable(true);
            dialogFragment.show(((MainActivity) activity).getSupportFragmentManager(), "tag");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dialogFragment;
    }
}
