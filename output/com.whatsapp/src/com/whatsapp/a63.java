// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.content.Context;
import android.os.AsyncTask;

class a63 extends AsyncTask
{
    private static final String z;
    final ListChatInfo a;
    
    static {
        final char[] charArray = "\u0006\u001e:|O\t\u001f(|O\u0003\u0019/g?\u001f\u0007-id\u000f\u0013".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0010';
                    break;
                }
                case 0: {
                    c2 = 'j';
                    break;
                }
                case 1: {
                    c2 = 'w';
                    break;
                }
                case 2: {
                    c2 = 'I';
                    break;
                }
                case 3: {
                    c2 = '\b';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    private a63(final ListChatInfo a) {
        this.a = a;
    }
    
    a63(final ListChatInfo listChatInfo, final yz yz) {
        this(listChatInfo);
    }
    
    private void a() {
        final int a = ChatInfoActivity.a((Context)this.a, ListChatInfo.e(this.a).u, new ar6(this));
        if (a != 0 && !this.isCancelled()) {
            this.a.runOnUiThread((Runnable)new a0w(this, a));
        }
    }
    
    public Void a(final Void[] array) {
        if (!this.isCancelled()) {
            this.a();
        }
        return null;
    }
    
    public void a(final Void void1) {
        this.a.setSupportProgressBarIndeterminateVisibility(false);
        Log.i(a63.z);
    }
    
    public Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
    
    public void onPostExecute(final Object o) {
        this.a((Void)o);
    }
}
