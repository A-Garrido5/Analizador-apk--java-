// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import android.os.Bundle;
import android.widget.TextView;
import android.os.Handler;
import java.lang.ref.WeakReference;
import android.os.ResultReceiver;

class SearchSuggestionController$QueryTextUpdateReceiver extends ResultReceiver
{
    private WeakReference a;
    private String b;
    
    SearchSuggestionController$QueryTextUpdateReceiver(final Handler handler) {
        super(handler);
    }
    
    public SearchSuggestionController$QueryTextUpdateReceiver a(final TextView textView) {
        this.a = new WeakReference((T)textView);
        return this;
    }
    
    public SearchSuggestionController$QueryTextUpdateReceiver a(final String b) {
        this.b = b;
        return this;
    }
    
    public void onReceiveResult(final int n, final Bundle bundle) {
        if (n == 3 && this.a != null) {
            final TextView textView = (TextView)this.a.get();
            if (textView != null && this.b != null) {
                textView.setText((CharSequence)this.b);
            }
        }
    }
}
