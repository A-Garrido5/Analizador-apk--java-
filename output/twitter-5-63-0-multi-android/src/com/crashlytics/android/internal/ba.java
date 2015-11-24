// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import org.json.JSONObject;

public class ba
{
    public az a(final bi bi, final JSONObject jsonObject) {
        final int optInt = jsonObject.optInt("settings_version", 0);
        final int optInt2 = jsonObject.optInt("cache_duration", 3600);
        final JSONObject jsonObject2 = jsonObject.getJSONObject("app");
        final String string = jsonObject2.getString("identifier");
        final String string2 = jsonObject2.getString("status");
        final String string3 = jsonObject2.getString("url");
        final String string4 = jsonObject2.getString("reports_url");
        final boolean optBoolean = jsonObject2.optBoolean("update_required", false);
        final boolean has = jsonObject2.has("icon");
        al al = null;
        if (has) {
            final boolean has2 = jsonObject2.getJSONObject("icon").has("hash");
            al = null;
            if (has2) {
                final JSONObject jsonObject3 = jsonObject2.getJSONObject("icon");
                al = new al(jsonObject3.getString("hash"), jsonObject3.getInt("width"), jsonObject3.getInt("height"));
            }
        }
        final am am = new am(string, string2, string3, string4, optBoolean, al);
        final JSONObject jsonObject4 = jsonObject.getJSONObject("session");
        final as as = new as(jsonObject4.optInt("log_buffer_size", 64000), jsonObject4.optInt("max_chained_exception_depth", 8), jsonObject4.optInt("max_custom_exception_events", 64), jsonObject4.optInt("max_custom_key_value_pairs", 64), jsonObject4.optInt("identifier_mask", 255), jsonObject4.optBoolean("send_session_without_crash", false));
        final JSONObject jsonObject5 = jsonObject.getJSONObject("prompt");
        final ar ar = new ar(jsonObject5.optString("title", "Send Crash Report?"), jsonObject5.optString("message", "Looks like we crashed! Please help us fix the problem by sending a crash report."), jsonObject5.optString("send_button_title", "Send"), jsonObject5.optBoolean("show_cancel_button", true), jsonObject5.optString("cancel_button_title", "Don't Send"), jsonObject5.optBoolean("show_always_send_button", true), jsonObject5.optString("always_send_button_title", "Always Send"));
        final JSONObject jsonObject6 = jsonObject.getJSONObject("features");
        final aq aq = new aq(jsonObject6.optBoolean("prompt_enabled", false), jsonObject6.optBoolean("collect_logged_exceptions", true), jsonObject6.optBoolean("collect_reports", true), jsonObject6.optBoolean("collect_analytics", false));
        final JSONObject jsonObject7 = jsonObject.getJSONObject("analytics");
        final ak ak = new ak(jsonObject7.optString("url", "https://e.crashlytics.com/spi/v2/events"), jsonObject7.optInt("flush_interval_secs", 600), jsonObject7.optInt("max_byte_size_per_file", 8000), jsonObject7.optInt("max_file_count_per_send", 1), jsonObject7.optInt("max_pending_send_file_count", 100));
        final long n = optInt2;
        long long1;
        if (jsonObject.has("expires_at")) {
            long1 = jsonObject.getLong("expires_at");
        }
        else {
            long1 = bi.a() + n * 1000L;
        }
        return new az(long1, am, as, ar, aq, ak, optInt, optInt2);
    }
    
    public JSONObject a(final JSONObject jsonObject) {
        final JSONObject jsonObject2 = new JSONObject(jsonObject.toString());
        jsonObject2.getJSONObject("features").remove("collect_analytics");
        jsonObject2.remove("analytics");
        return jsonObject2;
    }
}
