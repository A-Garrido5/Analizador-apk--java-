// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.library.network.b;
import android.content.res.Resources;
import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import com.twitter.library.service.ab;
import com.twitter.library.telephony.TelephonyUtil;
import com.twitter.library.service.aa;
import android.widget.ListAdapter;
import android.widget.AutoCompleteTextView;
import android.text.TextUtils;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.android.client.c;
import android.widget.ArrayAdapter;
import java.util.List;
import android.widget.EditText;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import android.widget.TextView$OnEditorActionListener;
import android.text.TextWatcher;
import com.twitter.library.client.AbsFragment;
import com.twitter.library.service.y;
import com.twitter.library.util.bq;
import com.twitter.library.client.App;
import com.twitter.library.util.text.a;
import android.os.Message;
import java.lang.ref.WeakReference;
import android.os.Handler;

public class hf extends Handler
{
    private final WeakReference a;
    
    public hf(final EmailEntryFragment emailEntryFragment) {
        this.a = new WeakReference((T)emailEntryFragment);
    }
    
    public void a(final int n) {
        this.removeMessages(n);
        this.sendEmptyMessageDelayed(n, 1000L);
    }
    
    public void handleMessage(final Message message) {
        final EmailEntryFragment emailEntryFragment = (EmailEntryFragment)this.a.get();
        if (emailEntryFragment == null) {
            return;
        }
        switch (message.what) {
            case 1: {
                final String string = emailEntryFragment.g.getText().toString();
                if (com.twitter.library.util.text.a.c.matcher(string).matches() && bq.a(emailEntryFragment.an, App.n(), string)) {
                    final ox ox = (ox)new ox(emailEntryFragment.an, emailEntryFragment.aF()).g(1);
                    ox.a = string;
                    emailEntryFragment.a(ox, 1, 0);
                    break;
                }
                emailEntryFragment.a(emailEntryFragment.g, emailEntryFragment.a, emailEntryFragment.getString(2131297811));
                emailEntryFragment.b = 0;
                break;
            }
        }
        emailEntryFragment.j.a(emailEntryFragment.b());
    }
}
