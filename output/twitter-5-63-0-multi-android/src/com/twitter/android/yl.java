// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.KeyEvent;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import com.twitter.library.service.aa;
import android.text.TextUtils;
import android.graphics.drawable.Drawable;
import com.twitter.ui.widget.TwitterButton;
import com.twitter.internal.android.widget.TypefacesTextView;
import com.twitter.internal.android.widget.ad;
import android.widget.TextView$OnEditorActionListener;
import android.view.View$OnClickListener;
import android.text.TextWatcher;
import com.twitter.library.client.AbsFragment;
import android.text.Editable;
import com.twitter.internal.android.widget.PopupEditText;
import com.twitter.library.service.y;
import android.content.Context;
import com.twitter.library.client.az;
import com.twitter.library.util.text.d;
import android.os.Message;
import java.lang.ref.WeakReference;
import android.os.Handler;

public class yl extends Handler
{
    private final WeakReference a;
    
    public yl(final UsernameEntryFragment usernameEntryFragment) {
        this.a = new WeakReference((T)usernameEntryFragment);
    }
    
    public void a(final int n) {
        this.removeMessages(n);
        this.sendEmptyMessageDelayed(n, 1000L);
    }
    
    public void handleMessage(final Message message) {
        final UsernameEntryFragment usernameEntryFragment = (UsernameEntryFragment)this.a.get();
        if (usernameEntryFragment == null || !usernameEntryFragment.aD()) {
            return;
        }
        final PopupEditText a = usernameEntryFragment.a;
        switch (message.what) {
            default: {}
            case 3: {
                final Editable text = a.getText();
                final boolean matches = d.d.matcher((CharSequence)text).matches();
                if (text.length() < 6) {
                    usernameEntryFragment.b(2131297614);
                    return;
                }
                if (d.a.matcher((CharSequence)text).matches() && !matches) {
                    final ox ox = (ox)new ox((Context)usernameEntryFragment.getActivity(), az.a(usernameEntryFragment.an).b()).g(2);
                    ox.e = text.toString();
                    usernameEntryFragment.a(ox, 1, 0);
                    return;
                }
                usernameEntryFragment.b(b(text));
            }
        }
    }
}
