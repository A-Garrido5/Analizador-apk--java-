// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.client.as;
import com.twitter.library.service.y;
import android.os.Bundle;
import android.content.Context;
import com.twitter.library.client.au;

public class qb implements au
{
    private final Context a;
    private qc b;
    
    public qb(final Context a) {
        this.a = a;
    }
    
    @Override
    public void a(final int n, final Bundle bundle, final y y) {
    }
    
    @Override
    public void a(final int n, final y y) {
        this.b.a(n, y);
    }
    
    public boolean a(final y y, final int n, final qc b) {
        this.b = b;
        return as.a(this.a).a(y, n, 0, this);
    }
    
    @Override
    public void b(final int n, final y y) {
    }
}
