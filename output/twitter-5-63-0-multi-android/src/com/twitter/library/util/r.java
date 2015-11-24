// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import android.database.Cursor;
import android.net.Uri;
import android.content.Context;
import java.util.concurrent.Callable;

final class r implements Callable
{
    final /* synthetic */ Context a;
    final /* synthetic */ Uri b;
    final /* synthetic */ String[] c;
    final /* synthetic */ String d;
    final /* synthetic */ String[] e;
    final /* synthetic */ String f;
    
    r(final Context a, final Uri b, final String[] c, final String d, final String[] e, final String f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public Cursor a() {
        return this.a.getContentResolver().query(this.b, this.c, this.d, this.e, this.f);
    }
}
