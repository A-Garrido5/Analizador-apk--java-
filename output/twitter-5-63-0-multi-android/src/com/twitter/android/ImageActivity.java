// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.app.ProgressDialog;
import android.app.Dialog;
import com.twitter.android.client.c;
import com.twitter.library.media.manager.j;
import com.twitter.library.media.widget.e;
import android.view.View$OnClickListener;
import com.twitter.ui.widget.TwitterButton;
import android.content.Context;
import com.twitter.android.client.bn;
import android.os.Bundle;
import java.util.List;
import android.content.Intent;
import com.twitter.internal.android.widget.ToolBar;
import android.net.Uri;
import java.io.File;
import android.graphics.Bitmap;
import android.widget.ProgressBar;
import com.twitter.library.media.widget.MediaImageView;
import com.twitter.android.client.TwitterFragmentActivity;

public class ImageActivity extends TwitterFragmentActivity
{
    MediaImageView a;
    ProgressBar b;
    Bitmap c;
    File d;
    Uri e;
    Uri f;
    String g;
    int h;
    String i;
    
    @Override
    protected int a(final ToolBar toolBar) {
        super.a(toolBar);
        final Intent putExtra = new Intent("android.intent.action.SEND").setFlags(268435456).setType("text/plain").putExtra("android.intent.extra.TEXT", this.i);
        final List queryIntentActivities = this.getPackageManager().queryIntentActivities(putExtra, 65536);
        boolean b;
        if (this.c != null) {
            b = true;
        }
        else {
            b = false;
        }
        toolBar.a(2131886231).a(putExtra).c(b && queryIntentActivities.size() > 0);
        final jx a = toolBar.a(2131887428);
        boolean b2 = false;
        if (b) {
            final File d = this.d;
            b2 = false;
            if (d == null) {
                b2 = true;
            }
        }
        a.c(b2);
        return 1;
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        bn.c(2130968840);
        bn.d(false);
        bn.a(false);
        bn.b(6);
        return bn;
    }
    
    @Override
    protected boolean a(final jv jv, final ToolBar toolBar) {
        super.a(jv, toolBar);
        jv.a(2131951636, toolBar);
        return true;
    }
    
    @Override
    public boolean a(final jx jx) {
        final int a = jx.a();
        if (a == 2131887428) {
            if (this.c != null) {
                new jk(this).execute((Object[])new String[0]);
            }
        }
        else {
            if (a != 2131887441) {
                return super.a(jx);
            }
            com.twitter.library.util.bn.a((Context)this, this.f);
        }
        return true;
    }
    
    @Override
    public void b(final Bundle bundle, final bn bn) {
        final c g = this.G();
        final Intent intent = this.getIntent();
        final Uri data = intent.getData();
        if (data == null) {
            throw new IllegalArgumentException("Must be started with a valid Uri");
        }
        this.e = data;
        if (intent.hasExtra("android.intent.extra.STREAM")) {
            this.f = (Uri)intent.getParcelableExtra("android.intent.extra.STREAM");
        }
        else {
            this.f = this.e;
        }
        final long longExtra = intent.getLongExtra("owner_user_id", 0L);
        if (longExtra != 0L) {
            this.findViewById(2131886879).setVisibility(0);
            final TwitterButton twitterButton = (TwitterButton)this.findViewById(2131886880);
            twitterButton.setVisibility(0);
            twitterButton.setOnClickListener((View$OnClickListener)new ji(this, longExtra));
        }
        this.g = intent.getStringExtra("android.intent.extra.TEXT");
        this.i = intent.getStringExtra("image_url");
        this.h = intent.getIntExtra("click_place", 0);
        this.b = (ProgressBar)this.findViewById(2131886400);
        (this.a = (MediaImageView)this.findViewById(2131886878)).setOnImageLoadedListener(new jj(this));
        this.a.a(com.twitter.library.media.manager.j.a(data.toString()));
        g.a(this.U().g(), "tweet::photo::impression");
    }
    
    protected Dialog onCreateDialog(final int n) {
        switch (n) {
            default: {
                return super.onCreateDialog(n);
            }
            case 1: {
                final ProgressDialog progressDialog = new ProgressDialog((Context)this);
                progressDialog.setMessage((CharSequence)this.getString(2131297602));
                progressDialog.setCancelable(false);
                return (Dialog)progressDialog;
            }
        }
    }
    
    @Override
    public boolean onSearchRequested() {
        return false;
    }
}
