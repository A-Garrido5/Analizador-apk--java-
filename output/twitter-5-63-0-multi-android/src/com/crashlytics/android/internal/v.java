// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import org.json.JSONException;
import java.io.IOException;
import java.util.Iterator;
import org.json.JSONObject;
import java.util.Map;

final class v
{
    private static JSONObject a(final Map map) {
        final JSONObject jsonObject = new JSONObject();
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            jsonObject.put((String)entry.getKey(), (Object)entry.getValue());
        }
        return jsonObject;
    }
    
    public final byte[] a(final u u) {
        try {
            final JSONObject jsonObject = new JSONObject();
            jsonObject.put("appBundleId", (Object)u.a);
            jsonObject.put("executionId", (Object)u.b);
            jsonObject.put("installationId", (Object)u.c);
            jsonObject.put("androidId", (Object)u.d);
            jsonObject.put("osVersion", (Object)u.e);
            jsonObject.put("deviceModel", (Object)u.f);
            jsonObject.put("appVersionCode", (Object)u.g);
            jsonObject.put("appVersionName", (Object)u.h);
            jsonObject.put("timestamp", u.i);
            jsonObject.put("type", (Object)u.j.toString());
            jsonObject.put("details", (Object)a(u.k));
            return jsonObject.toString().getBytes("UTF-8");
        }
        catch (JSONException ex) {
            throw new IOException(ex.getMessage());
        }
    }
}
