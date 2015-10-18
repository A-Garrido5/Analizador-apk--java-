// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.res.Resources;
import com.twitter.library.service.z;
import com.twitter.library.client.as;
import com.twitter.library.client.az;
import android.net.Uri;
import android.app.Activity;
import com.twitter.library.service.aa;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.widget.Toast;
import com.twitter.library.api.account.ab;
import android.view.View;
import com.twitter.util.t;
import com.twitter.library.client.Session;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.view.View$OnClickListener;
import android.text.TextWatcher;
import com.twitter.android.client.TwitterFragmentActivity;
import android.text.Editable;
import com.twitter.library.service.y;
import android.content.Context;
import com.twitter.library.util.text.d;
import android.os.Message;
import java.lang.ref.WeakReference;
import android.os.Handler;

class cf extends Handler
{
    private final WeakReference a;
    
    public cf(final ChangeScreenNameActivity changeScreenNameActivity) {
        this.a = new WeakReference((T)changeScreenNameActivity);
    }
    
    public void a(final int n) {
        this.removeMessages(n);
        this.sendEmptyMessageDelayed(n, 500L);
    }
    
    public void handleMessage(final Message message) {
        final ChangeScreenNameActivity changeScreenNameActivity = (ChangeScreenNameActivity)this.a.get();
        if (changeScreenNameActivity == null) {
            return;
        }
        switch (message.what) {
            case 3: {
                final Editable text = changeScreenNameActivity.c.getText();
                final boolean matches = d.d.matcher((CharSequence)text).matches();
                if (d.a.matcher((CharSequence)text).matches() && !matches) {
                    final ox ox = (ox)new ox((Context)changeScreenNameActivity, changeScreenNameActivity.U()).g(2);
                    ox.e = text.toString();
                    changeScreenNameActivity.a(ox, 1);
                    break;
                }
                int n;
                if (matches) {
                    n = 2131297823;
                }
                else {
                    n = 2131297822;
                }
                changeScreenNameActivity.a(changeScreenNameActivity.c, changeScreenNameActivity.e, changeScreenNameActivity.getString(n));
                changeScreenNameActivity.a = 0;
                break;
            }
        }
        changeScreenNameActivity.b();
    }
}
