package com.openwudi.resourceapk;

import android.content.Context;
import android.graphics.drawable.Drawable;

/**
 * Created by wudi on 15/9/24.
 */
public class UIUtils {
    public Drawable getPoke(Context ctx){
        return ctx.getResources().getDrawable(R.drawable.poke);
    }

    public String getText(Context ctx){
        return ctx.getResources().getString(R.string.text);
    }
}
