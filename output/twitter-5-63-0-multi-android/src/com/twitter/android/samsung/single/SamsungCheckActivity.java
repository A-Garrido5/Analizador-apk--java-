// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.samsung.single;

import android.content.Intent;
import android.appwidget.AppWidgetManager;
import com.twitter.android.widget.PromptDialogFragment;
import com.twitter.library.util.an;
import android.os.Bundle;
import android.content.Context;
import android.content.ComponentName;
import android.content.DialogInterface;
import com.twitter.ui.dialog.e;
import android.support.v4.app.FragmentActivity;

public class SamsungCheckActivity extends FragmentActivity implements e
{
    @Override
    public void a(final DialogInterface dialogInterface, final int n, final int n2) {
        this.getPackageManager().setComponentEnabledSetting(new ComponentName((Context)this, (Class)TwitterWidgetProvider.class), 2, 0);
        this.finish();
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Intent intent = this.getIntent();
        this.setResult(0, intent);
        if (!an.a()) {
            PromptDialogFragment.b(1).d(2131298193).i(17039370).a(this.getSupportFragmentManager());
            return;
        }
        this.setResult(-1, intent);
        AppWidgetManager.getInstance((Context)this).getAppWidgetInfo(intent.getIntExtra("appWidgetId", 0));
        this.finish();
    }
}
