// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.content.DialogInterface;
import android.app.Activity;
import android.content.DialogInterface$OnClickListener;

final class ml implements DialogInterface$OnClickListener
{
    private static final String z;
    final Activity a;
    
    static {
        final char[] charArray = "C<x".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = ':';
                    break;
                }
                case 0: {
                    c2 = '!';
                    break;
                }
                case 1: {
                    c2 = 'I';
                    break;
                }
                case 2: {
                    c2 = '\u0001';
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
    
    ml(final Activity a) {
        this.a = a;
    }
    
    public void onClick(final DialogInterface dialogInterface, final int n) {
        final boolean i = App.I;
        Label_0087: {
            switch (n) {
                case 0: {
                    final Intent intent = new Intent((Context)this.a, (Class)AccountInfoActivity.class);
                    intent.putExtra(ml.z, true);
                    this.a.startActivity(intent);
                    if (i) {
                        break Label_0087;
                    }
                    break;
                }
                case 1: {
                    App.ag();
                    if (i) {
                        break Label_0087;
                    }
                    break;
                }
                case 2: {
                    this.a.startActivity(new Intent((Context)this.a, (Class)AccountInfoActivity.class));
                    break;
                }
            }
        }
        this.a.removeDialog(116);
    }
}
