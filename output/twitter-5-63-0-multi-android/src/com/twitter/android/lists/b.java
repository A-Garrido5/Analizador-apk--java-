// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.lists;

import android.content.Context;
import android.content.Intent;

public class b
{
    public final long a;
    public final boolean b;
    public final boolean c;
    public final long d;
    public final String e;
    
    public b(final long n) {
        this(n, -1L);
    }
    
    public b(final long n, final long n2) {
        this(n, n2, null, false);
    }
    
    private b(final long d, final long a, final String e, final boolean b) {
        this.d = d;
        this.a = a;
        this.e = e;
        this.b = b;
        this.c = (a != -1L);
    }
    
    public b(final String s, final boolean b) {
        this(0L, -1L, s, b);
    }
    
    public static b a(final Intent intent) {
        return new b(intent.getLongExtra("owner_id", -1L), intent.getLongExtra("inquire_user_id", -1L), intent.getStringExtra("screen_name"), intent.getBooleanExtra("force_restart", false));
    }
    
    public Intent a(final Context context) {
        final Intent intent = new Intent(context, (Class)ListsActivity.class);
        if (this.c) {
            intent.setAction("android.intent.action.PICK");
        }
        intent.putExtra("owner_id", this.d);
        intent.putExtra("inquire_user_id", this.a);
        intent.putExtra("screen_name", this.e);
        intent.putExtra("force_restart", this.b);
        return intent;
    }
}
