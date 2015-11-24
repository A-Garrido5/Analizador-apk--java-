// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.samsung.single;

import android.content.DialogInterface$OnKeyListener;
import com.twitter.library.provider.Tweet;
import com.twitter.library.client.az;
import android.widget.Toast;
import android.content.Intent;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import android.os.Bundle;
import android.content.Context;
import android.app.AlertDialog$Builder;
import android.app.AlertDialog;
import android.content.DialogInterface$OnClickListener;
import android.app.Dialog;
import com.twitter.library.client.au;
import com.twitter.android.BaseActivity;

@Deprecated
public class RetweetOptionsActivity extends BaseActivity implements au
{
    private Dialog a;
    private int b;
    
    public AlertDialog a(final boolean b, final DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)this);
        if (b) {
            alertDialog$Builder.setMessage(2131298025).setPositiveButton(2131298016, dialogInterface$OnClickListener);
        }
        else {
            alertDialog$Builder.setMessage(2131297565).setPositiveButton(2131298004, dialogInterface$OnClickListener);
        }
        return alertDialog$Builder.setTitle(2131298004).setNeutralButton(2131297505, dialogInterface$OnClickListener).setNegativeButton(2131296445, dialogInterface$OnClickListener).create();
    }
    
    @Override
    public void a(final int n, final Bundle bundle, final y y) {
    }
    
    @Override
    public void a(final int n, final y y) {
        final aa aa = (aa)y.l().b();
        switch (n) {
            case 1: {
                if (aa.a()) {
                    final Intent intent = new Intent((Context)this, (Class)TwitterWidgetProvider.class);
                    intent.setAction(TwitterWidgetProvider.b);
                    intent.putExtra("appWidgetId", this.b);
                    this.sendBroadcast(intent);
                    break;
                }
                if (!y.isCancelled()) {
                    Toast.makeText((Context)this, 2131298005, 1).show();
                    break;
                }
                break;
            }
            case 2: {
                final Intent intent2 = new Intent((Context)this, (Class)TwitterWidgetProvider.class);
                intent2.setAction(TwitterWidgetProvider.b);
                intent2.putExtra("appWidgetId", this.b);
                this.sendBroadcast(intent2);
                break;
            }
        }
        this.finish();
    }
    
    @Override
    public void b(final int n, final y y) {
    }
    
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
        this.finish();
    }
    
    public void onBackPressed() {
        this.finish();
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final az a = az.a((Context)this);
        if (!a.b().d()) {
            this.finish();
        }
        final Tweet tweet = (Tweet)this.getIntent().getParcelableExtra("tweet");
        this.b = this.getIntent().getIntExtra("appWidgetId", -1);
        final boolean h = tweet.h;
        (this.a = (Dialog)this.a(h, (DialogInterface$OnClickListener)new g(this, a, i.a((Context)this, this.b), h, tweet))).setOnKeyListener((DialogInterface$OnKeyListener)new h(this));
        this.a.show();
    }
    
    @Override
    protected void onDestroy() {
        this.a.dismiss();
        super.onDestroy();
    }
    
    protected void onUserLeaveHint() {
        this.finish();
    }
}
