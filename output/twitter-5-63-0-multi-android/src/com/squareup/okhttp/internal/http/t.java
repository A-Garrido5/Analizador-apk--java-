// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.http;

import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.text.DateFormat;

final class t extends ThreadLocal
{
    protected DateFormat a() {
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
