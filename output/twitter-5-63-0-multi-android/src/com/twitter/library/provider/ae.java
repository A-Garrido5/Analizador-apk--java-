// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import android.net.Uri$Builder;
import com.twitter.library.client.App;
import android.net.Uri;

public class ae
{
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final Uri e;
    
    static {
        a = App.a(".permission.RESTRICTED");
        b = App.a("AVATARS_CHANGED");
        c = App.a(".provider.TwitterProvider");
        d = "content://" + ae.c + '/';
        e = Uri.parse(ae.d);
    }
    
    public static Uri$Builder a(final Uri$Builder uri$Builder, final long n) {
        return uri$Builder.appendQueryParameter("ownerId", String.valueOf(n));
    }
    
    public static Uri a(final int n) {
        switch (n) {
            default: {
                return null;
            }
            case 0: {
                return bc.b;
            }
            case 1: {
                return bc.c;
            }
            case 2: {
                return bc.d;
            }
            case 6: {
                return bc.e;
            }
            case 5: {
                return bc.f;
            }
            case 3: {
                return bc.g;
            }
        }
    }
    
    public static Uri a(final long n, final long n2) {
        return ay.f.buildUpon().appendEncodedPath(String.valueOf(n)).appendQueryParameter("ownerId", String.valueOf(n2)).build();
    }
    
    public static Uri a(final Uri uri, final long n) {
        return a(uri.buildUpon(), n).build();
    }
    
    public static int b(final int n) {
        switch (n) {
            default: {
                throw new IllegalArgumentException("Unsupported type");
            }
            case 0: {
                return 0;
            }
            case 1: {
                return 1;
            }
            case 2: {
                return 16;
            }
            case 6: {
                return 28;
            }
            case 5: {
                return 27;
            }
            case 3: {
                return 30;
            }
        }
    }
    
    public static Uri b(final long n, final long n2) {
        return ay.a.buildUpon().appendEncodedPath(String.valueOf(n)).appendQueryParameter("ownerId", String.valueOf(n2)).build();
    }
    
    public static int c(final int n) {
        switch (n) {
            default: {
                return -1;
            }
            case 0: {
                return 4;
            }
            case 1: {
                return 15;
            }
        }
    }
}
