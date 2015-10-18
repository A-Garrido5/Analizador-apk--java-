// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av.audio;

import com.twitter.util.collection.CollectionUtils;
import java.io.Serializable;
import android.content.Intent;
import android.content.Context;
import java.util.Collections;
import java.util.Map;
import com.twitter.library.av.model.Partner;
import com.twitter.android.av.i;

public class h extends i
{
    private Partner b;
    private Map c;
    
    public h() {
        this.b = Partner.a;
        this.c = Collections.emptyMap();
    }
    
    @Override
    public Intent a(final Context context) {
        final Intent a = super.a(context);
        a.putExtra("extra_partner", (Serializable)this.b);
        a.putExtra("extra_metadata", CollectionUtils.b(this.c));
        return a;
    }
    
    public h a(final Partner b) {
        this.b = b;
        return this;
    }
    
    public h a(final Map c) {
        this.c = c;
        return this;
    }
    
    @Override
    protected Class a() {
        return AudioCardViewerActivity.class;
    }
}
