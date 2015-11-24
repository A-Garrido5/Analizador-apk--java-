// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.client;

import java.io.Serializable;
import android.net.Uri;
import com.twitter.library.featureswitch.d;
import android.content.Intent;
import com.twitter.android.WebViewActivity;
import com.twitter.library.util.bn;
import java.util.HashMap;
import android.content.Context;

class ap implements n
{
    private final Context a;
    private final String b;
    
    ap(final Context a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void a() {
        final HashMap<String, String> hashMap = new HashMap<String, String>(3);
        hashMap.put("url", bn.b(this.b));
        hashMap.put("onerr", "1");
        hashMap.put("format", "html");
        this.a.startActivity(new Intent(this.a, (Class)WebViewActivity.class).setData(Uri.parse(d.g("readability_v2_proxy_uri"))).putExtra("com.twitter.android.EXTRA_POST_PARAMS", (Serializable)hashMap));
    }
    
    @Override
    public int b() {
        return 1;
    }
}
