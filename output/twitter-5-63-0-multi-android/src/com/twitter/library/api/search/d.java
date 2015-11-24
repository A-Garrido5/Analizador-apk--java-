// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.search;

import com.twitter.internal.network.l;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

class d extends com.twitter.library.service.d
{
    private String a;
    
    public String a() {
        return this.a;
    }
    
    @Override
    public void a(final int n, final InputStream inputStream, final int n2, final String s, final String s2) {
        this.a = new BufferedReader(new InputStreamReader(inputStream)).readLine();
    }
    
    @Override
    public void a(final l l) {
    }
}
