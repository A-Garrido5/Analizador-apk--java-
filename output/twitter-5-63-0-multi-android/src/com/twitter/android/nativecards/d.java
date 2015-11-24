// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.nativecards;

import android.app.Activity;

public class d
{
    static d a;
    
    public static d a() {
        if (d.a == null) {
            d.a = new d();
        }
        return d.a;
    }
    
    public c a(final Activity activity, final CardPreviewView cardPreviewView) {
        return new e(activity, cardPreviewView);
    }
}
