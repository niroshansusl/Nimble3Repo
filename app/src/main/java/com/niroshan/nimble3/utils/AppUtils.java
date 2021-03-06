package com.niroshan.nimble3.utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.util.DisplayMetrics;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.niroshan.nimble3.R;
import com.niroshan.nimble3.config.AppConst;

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

    //show ProgressDialog
    public static Dialog showProgress(Activity activity) {
        Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setBackgroundDrawable(
                new ColorDrawable(0));
        dialog.setContentView(R.layout.fragment_dialog_progress);
        dialog.setCancelable(false);
        dialog.show();
        return dialog;
    }

    //start an activity
    public static void startActivity(Activity activity, Class<?> aClass, Bundle bundle) {

        Intent intent = new Intent(activity, aClass);
        intent.putExtra(AppConst.PARAM_BUNDLE, bundle);
        activity.startActivity(intent);
        activity.overridePendingTransition(R.anim.pull_in_left, R.anim.push_out_right);
    }

    // check network connection availability
    public static boolean checkNetworkConnection(Context context) {

        ConnectivityManager connectivityManager = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager == null) {
            return false;
        }

        NetworkInfo activeNetworks = connectivityManager.getActiveNetworkInfo();
        if (activeNetworks != null && activeNetworks.isConnected()) {
            return activeNetworks.isConnectedOrConnecting();
        }
        return false;
    }
}
