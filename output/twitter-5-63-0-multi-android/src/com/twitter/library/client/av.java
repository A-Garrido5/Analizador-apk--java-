// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

import com.twitter.internal.android.service.a;
import com.twitter.library.service.y;
import android.os.Bundle;
import com.twitter.library.service.z;

public class av extends z
{
    private au a;
    private int b;
    
    public av(final int b, final au a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void a(final Bundle bundle, final y y) {
        this.a.a(this.b, bundle, y);
    }
    
    @Override
    public void a(final y y) {
        this.a.a(this.b, y);
    }
    
    @Override
    public void b(final y y) {
        this.a.b(this.b, y);
    }
}
