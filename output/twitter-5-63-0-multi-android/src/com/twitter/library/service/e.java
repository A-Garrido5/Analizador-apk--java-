// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.service;

import com.twitter.library.network.a;
import java.util.List;
import org.apache.http.HttpEntity;
import com.twitter.internal.network.HttpOperation$RequestMethod;

public class e
{
    public final CharSequence a;
    final HttpOperation$RequestMethod b;
    final HttpEntity c;
    final List d;
    final a e;
    
    e(final CharSequence a, final HttpOperation$RequestMethod b, final HttpEntity c, final List d, final a e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
}
