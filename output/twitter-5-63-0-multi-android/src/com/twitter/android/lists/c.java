// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.lists;

import android.content.Intent;

public class c
{
    public final long a;
    public final long b;
    
    public c(final long a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    public static c a(final Intent intent) {
        return new c(intent.getLongExtra("list_id", -1L), intent.getLongExtra("user_id", -1L));
    }
    
    public Intent a() {
        final Intent intent = new Intent();
        intent.putExtra("list_id", this.a);
        intent.putExtra("user_id", this.b);
        return intent;
    }
}
