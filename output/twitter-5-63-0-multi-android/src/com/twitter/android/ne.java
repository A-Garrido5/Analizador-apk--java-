// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.MotionEvent;
import android.view.KeyEvent;
import android.graphics.Typeface;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import com.twitter.library.service.ab;
import android.text.Editable;
import com.twitter.library.api.account.x;
import com.twitter.library.network.ae;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import com.twitter.library.client.Session;
import android.content.Context;
import android.text.TextUtils;
import com.twitter.android.widget.ProgressDialogFragment;
import android.graphics.drawable.Drawable;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView$OnEditorActionListener;
import android.view.View$OnTouchListener;
import android.view.View$OnClickListener;
import android.text.TextWatcher;
import com.twitter.library.client.AbsFragment;
import android.os.Message;
import java.lang.ref.WeakReference;
import android.os.Handler;

public class ne extends Handler
{
    private final WeakReference a;
    
    public ne(final PasswordEntryFragment passwordEntryFragment) {
        this.a = new WeakReference((T)passwordEntryFragment);
    }
    
    public void a(final int n) {
        this.removeMessages(n);
        this.sendEmptyMessageDelayed(n, 1000L);
    }
    
    public void handleMessage(final Message message) {
        final PasswordEntryFragment passwordEntryFragment = (PasswordEntryFragment)this.a.get();
        if (passwordEntryFragment == null || !passwordEntryFragment.aD()) {
            return;
        }
        switch (message.what) {
            default: {}
            case 1: {
                if (passwordEntryFragment.f.length() < 6) {
                    passwordEntryFragment.a(passwordEntryFragment.f, passwordEntryFragment.e, passwordEntryFragment.getString(2131297815));
                    passwordEntryFragment.a = 0;
                    return;
                }
                passwordEntryFragment.a(new pt(passwordEntryFragment.an, passwordEntryFragment.aF(), passwordEntryFragment.f.getText().toString(), null, null));
            }
        }
    }
}
