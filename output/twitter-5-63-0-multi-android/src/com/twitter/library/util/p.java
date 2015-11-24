// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import com.twitter.util.concurrent.d;
import java.util.concurrent.Callable;
import android.os.AsyncTask;
import com.twitter.util.concurrent.b;
import com.twitter.util.concurrent.i;
import android.net.Uri;
import android.content.Context;

public class p
{
    public static i a(final Context context, final Uri uri, final String[] array) {
        return a(context, uri, array, null, null);
    }
    
    public static i a(final Context context, final Uri uri, final String[] array, final String s, final String[] array2) {
        return a(context, uri, array, s, array2, null);
    }
    
    public static i a(final Context context, final Uri uri, final String[] array, final String s, final String[] array2, final String s2) {
        return new b().a(AsyncTask.THREAD_POOL_EXECUTOR).a(new r(context, uri, array, s, array2, s2)).a(new q()).a();
    }
}
