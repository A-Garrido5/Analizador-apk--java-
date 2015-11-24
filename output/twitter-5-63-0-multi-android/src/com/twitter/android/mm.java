// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.android.util.w;
import android.content.res.Resources;
import android.view.View;
import android.app.Activity;
import android.text.Editable;
import android.database.Cursor;
import android.support.v4.content.Loader;
import android.text.TextUtils;
import android.os.Bundle;
import android.widget.EditText;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import android.widget.TextView$OnEditorActionListener;
import android.view.View$OnClickListener;
import android.text.TextWatcher;
import android.support.v4.app.LoaderManager$LoaderCallbacks;
import com.twitter.library.client.AbsFragment;
import com.twitter.library.util.bq;
import android.os.Message;
import java.lang.ref.WeakReference;
import android.os.Handler;

public class mm extends Handler
{
    private final WeakReference a;
    
    public mm(final NameEntryFragment nameEntryFragment) {
        this.a = new WeakReference((T)nameEntryFragment);
    }
    
    public void a(final int n) {
        this.removeMessages(n);
        this.sendEmptyMessageDelayed(n, 1000L);
    }
    
    public void handleMessage(final Message message) {
        final NameEntryFragment nameEntryFragment = (NameEntryFragment)this.a.get();
        if (nameEntryFragment == null || !nameEntryFragment.aD()) {
            return;
        }
        switch (message.what) {
            case 1: {
                final String trim = nameEntryFragment.g.getText().toString().trim();
                final String e = bq.e(trim);
                final boolean b = trim.length() > 0 && trim.equals(e);
                nameEntryFragment.a(nameEntryFragment.g, b);
                if (b) {
                    nameEntryFragment.b = 1;
                    break;
                }
                if (!trim.equals(e)) {
                    nameEntryFragment.a(nameEntryFragment.g, nameEntryFragment.a, nameEntryFragment.getString(2131297812));
                }
                else {
                    nameEntryFragment.a(nameEntryFragment.g, nameEntryFragment.a, nameEntryFragment.getString(2131297813));
                }
                nameEntryFragment.b = 0;
                break;
            }
        }
        nameEntryFragment.h.a(nameEntryFragment.c());
    }
}
