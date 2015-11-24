// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util.platform;

import com.twitter.util.SynchronizedDateFormat;
import java.util.Locale;
import java.text.SimpleDateFormat;
import com.twitter.util.s;

class e implements s
{
    public static final SimpleDateFormat a;
    public static final SimpleDateFormat b;
    
    static {
        a = new SynchronizedDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.ENGLISH);
        b = new SynchronizedDateFormat("EEE MMM dd HH:mm:ss Z yyyy", Locale.ENGLISH);
    }
    
    @Override
    public SimpleDateFormat a() {
        return e.a;
    }
    
    @Override
    public SimpleDateFormat b() {
        return e.b;
    }
}
