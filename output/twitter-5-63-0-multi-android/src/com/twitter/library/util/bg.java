// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import android.text.TextUtils;
import android.content.Intent;

class bg
{
    protected final String a;
    protected final String b;
    
    public bg(final String a) {
        this.a = a;
        this.b = "";
    }
    
    public bg(final String b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    public void a(final Intent intent) {
        intent.putExtra("android.intent.extra.TEXT", this.a);
        if (!TextUtils.isEmpty((CharSequence)this.b)) {
            intent.putExtra("android.intent.extra.SUBJECT", this.b);
        }
    }
}
