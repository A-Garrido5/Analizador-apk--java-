// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.tagmanager;

import android.net.Uri;
import java.util.Map;
import android.content.Context;

class be implements h
{
    private final Context a;
    
    public be(final Context a) {
        this.a = a;
    }
    
    @Override
    public void a(final Map map) {
        final Map<K, Object> value = map.get("gtm.url");
        while (true) {
            Label_0090: {
                if (value != null) {
                    break Label_0090;
                }
                final Map<K, Object> value2 = map.get("gtm");
                if (value2 == null || !(value2 instanceof Map)) {
                    break Label_0090;
                }
                final Object value3 = value2.get("url");
                if (value3 != null && value3 instanceof String) {
                    final String queryParameter = Uri.parse((String)value3).getQueryParameter("referrer");
                    if (queryParameter != null) {
                        y.b(this.a, queryParameter);
                        return;
                    }
                }
                return;
            }
            final Object value3 = value;
            continue;
        }
    }
}
