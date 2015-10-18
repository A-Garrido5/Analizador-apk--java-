// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload;

import com.twitter.internal.network.l;
import com.twitter.internal.network.HttpOperation;
import java.util.Collection;
import java.util.Collections;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.q;

public class f extends q
{
    private boolean a;
    
    public f() {
        super(Collections.singleton(HttpOperation$RequestMethod.b), Collections.singleton(400));
        this.a = false;
    }
    
    @Override
    protected boolean a(final HttpOperation httpOperation, final l l) {
        return !this.a && (this.a = true);
    }
}
