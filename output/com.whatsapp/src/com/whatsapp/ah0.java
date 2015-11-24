// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.widget.Adapter;
import android.view.View;
import android.content.Context;
import java.util.ArrayList;
import android.os.AsyncTask;

class ah0 extends AsyncTask
{
    private static final String z;
    final GroupChatInfo a;
    
    static {
        final char[] charArray = "}\u007f8\u007f^Ed9lA5x'nOnh3".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '.';
                    break;
                }
                case 0: {
                    c2 = '\u001a';
                    break;
                }
                case 1: {
                    c2 = '\r';
                    break;
                }
                case 2: {
                    c2 = 'W';
                    break;
                }
                case 3: {
                    c2 = '\n';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    ah0(final GroupChatInfo a) {
        this.a = a;
    }
    
    private void a() {
        final ArrayList y = App.ak.y(GroupChatInfo.l(this.a));
        if (!this.isCancelled()) {
            this.a.runOnUiThread((Runnable)new az(this, y));
        }
    }
    
    static void a(final ah0 ah0, final ArrayList list) {
        ah0.a(list);
    }
    
    private void a(final ArrayList list) {
        if (!this.isCancelled()) {
            this.a.runOnUiThread((Runnable)new bg(this, list));
        }
    }
    
    private void b() {
        final int a = ChatInfoActivity.a((Context)this.a, GroupChatInfo.l(this.a), new aoj(this));
        if (a != 0 && !this.isCancelled()) {
            this.a.runOnUiThread((Runnable)new fd(this, a));
        }
    }
    
    public Void a(final Void[] array) {
        if (!this.isCancelled()) {
            this.b();
        }
        if (!this.isCancelled() && !App.ah()) {
            this.a();
        }
        return null;
    }
    
    public void a(final Void void1) {
        GroupChatInfo.u(this.a).a(GroupChatInfo.e(this.a), GroupChatInfo.g(this.a), (View)GroupChatInfo.d(this.a), (Adapter)GroupChatInfo.k(this.a));
        this.a.setSupportProgressBarIndeterminateVisibility(false);
        Log.i(ah0.z);
    }
    
    public Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
    
    public void onPostExecute(final Object o) {
        this.a((Void)o);
    }
}
