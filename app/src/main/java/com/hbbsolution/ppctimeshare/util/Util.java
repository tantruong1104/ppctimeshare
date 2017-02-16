package com.hbbsolution.ppctimeshare.util;

import android.app.ProgressDialog;
import android.content.Context;

/**
 * Created by tantr on 2/16/2017.
 */

public class Util {

   public static void showProgessDialog(ProgressDialog mProgressDialog, Context context) {
        if (mProgressDialog == null) {
            mProgressDialog = new ProgressDialog(context);
            mProgressDialog.setMessage("Loading...");
            mProgressDialog.setCancelable(false);
        }
        try {
            mProgressDialog.show();
        } catch (Exception e) {
        }

    }

}
