// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.model;

import android.net.Uri;
import android.content.Context;
import java.util.concurrent.Callable;

final class j implements Callable
{
    final /* synthetic */ Context a;
    final /* synthetic */ Uri b;
    final /* synthetic */ MediaType c;
    
    j(final Context a, final Uri b, final MediaType c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public MediaFile a() {
        return MediaFile.a(this.a, this.b, this.c);
    }
}
