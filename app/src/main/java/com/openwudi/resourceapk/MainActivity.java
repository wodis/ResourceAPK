package com.openwudi.resourceapk;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by wudi on 15/9/23.
 */
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = new View(this);
        setContentView(view);
    }
}
