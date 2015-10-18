// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.protocol.bi;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;

class x9 implements AdapterView$OnItemClickListener
{
    private static final String z;
    final Broadcasts a;
    
    static {
        final char[] charArray = "v&".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'Z';
                    break;
                }
                case 0: {
                    c2 = '\u001f';
                    break;
                }
                case 1: {
                    c2 = 'B';
                    break;
                }
                case 2: {
                    c2 = '\u001d';
                    break;
                }
                case 3: {
                    c2 = 'J';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    x9(final Broadcasts a) {
        this.a = a;
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        final bi bi = (bi)view.getTag();
        final Intent intent = new Intent((Context)this.a, (Class)BroadcastDetails.class);
        intent.putExtra(x9.z, bi.a.c);
        this.a.startActivity(intent);
    }
}
