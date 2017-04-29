package com.google.firebase.quickstart.database;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.support.v4.content.ContextCompat;
import android.widget.FrameLayout;

/**
 * Created by Anky An on 29/04/2017.
 * anky25@gmail.com
 */

public class Utilities {

    public static void profileBackgroundColor(Context context, FrameLayout frameLayout){
        // Decide background color for user name initial background
        Drawable background = frameLayout.getBackground();
        int backgroundColor = android.R.color.holo_red_light;

        if (background instanceof ShapeDrawable) {
            // cast to 'ShapeDrawable'
            ShapeDrawable shapeDrawable = (ShapeDrawable) background;
            shapeDrawable.getPaint().setColor(ContextCompat.getColor(context, backgroundColor));
        } else if (background instanceof GradientDrawable) {
            // cast to 'GradientDrawable'
            GradientDrawable gradientDrawable = (GradientDrawable) background;
            gradientDrawable.setColor(ContextCompat.getColor(context, backgroundColor));
        }
    }
}
