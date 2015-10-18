// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.manager;

import com.twitter.internal.android.util.Size;
import com.twitter.util.e;

public class UserImageRequest
{
    public static final yv a;
    private static int b;
    private static int c;
    private static int d;
    private static final n e;
    
    static {
        a = new yv("TestUserImageRequest");
        e = new an();
    }
    
    public static int a(final int n) {
        UserImageRequest.a.a();
        switch (n) {
            default: {
                return n;
            }
            case -1: {
                if (com.twitter.util.e.e() && UserImageRequest.b == 0) {
                    throw new IllegalStateException("MINI size has not been configured");
                }
                return UserImageRequest.b;
            }
            case -2: {
                if (com.twitter.util.e.e() && UserImageRequest.c == 0) {
                    throw new IllegalStateException("SMALL size has not been configured");
                }
                return UserImageRequest.c;
            }
            case -3: {
                if (com.twitter.util.e.e() && UserImageRequest.d == 0) {
                    throw new IllegalStateException("NORMAL size has not been configured");
                }
                return UserImageRequest.d;
            }
        }
    }
    
    public static k a(final String s) {
        return a(s, Size.a);
    }
    
    public static k a(final String s, final int n) {
        return a(s, Size.a(a(n)));
    }
    
    private static k a(final String s, final Size size) {
        return j.a(s, size).a(UserImageRequest.e).a("user");
    }
    
    public static void a(final int b, final int c, final int d) {
        UserImageRequest.a.a();
        UserImageRequest.b = b;
        UserImageRequest.c = c;
        UserImageRequest.d = d;
    }
}
