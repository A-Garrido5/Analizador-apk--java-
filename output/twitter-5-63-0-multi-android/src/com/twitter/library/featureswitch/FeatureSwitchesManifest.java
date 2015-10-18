// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.featureswitch;

import java.util.Iterator;
import com.twitter.library.api.bh;
import java.util.Date;
import com.fasterxml.jackson.core.JsonParser;
import java.io.Closeable;
import android.content.Context;
import android.util.Log;
import com.twitter.library.client.App;
import java.util.HashMap;
import java.util.HashSet;

public class FeatureSwitchesManifest extends FeatureSwitchesConfig
{
    public static final FeatureSwitchesManifest b;
    private static final boolean c = false;
    private static final long serialVersionUID = -995419561036999409L;
    public final HashSet availableExperiments;
    public final e debug;
    public final HashMap embeddedExperiments;
    public final String featureSetToken;
    public final HashSet requiresRestart;
    
    static {
        b = new FeatureSwitchesManifest();
    }
    
    private FeatureSwitchesManifest() {
        this.debug = new e(new HashMap());
        this.requiresRestart = new HashSet();
        this.availableExperiments = new HashSet();
        this.embeddedExperiments = new HashMap();
        this.featureSetToken = "";
    }
    
    public FeatureSwitchesManifest(final HashMap hashMap, final HashSet set, final e debug, final HashSet requiresRestart, final HashSet availableExperiments, final HashMap embeddedExperiments, final SettingVersionDetails settingVersionDetails, final String featureSetToken) {
        super(hashMap, set, null, settingVersionDetails);
        this.debug = debug;
        this.requiresRestart = requiresRestart;
        this.availableExperiments = availableExperiments;
        this.embeddedExperiments = embeddedExperiments;
        this.featureSetToken = featureSetToken;
    }
    
    public static FeatureSwitchesManifest a(final Context context, final int n, final boolean b) {
        JsonParser b2 = null;
        try {
            b2 = FeatureSwitchesManifest.a.b(context.getResources().openRawResource(n));
            b2.a();
            return a(context, b2, b);
        }
        finally {
            yh.a(b2);
        }
    }
    
    public static FeatureSwitchesManifest a(final Context context, final JsonParser jsonParser, final boolean b) {
        final Date date = new Date();
        final FeatureSwitchesManifest r = bh.R(jsonParser);
        if (!b) {
            r.a(context, date);
        }
        return r;
    }
    
    public static FeatureSwitchesManifest a(final Context context, final String s, final boolean b) {
        return a(context, context.getResources().getIdentifier(s, "raw", context.getPackageName()), b);
    }
    
    public void a(final Context context, final Date date) {
        if (FeatureSwitchesManifest.c) {
            Log.d("FS", "Adding to experiment buckets");
        }
        for (final f f : this.embeddedExperiments.values()) {
            int n;
            if (date.after(f.d) && date.before(f.e)) {
                n = 1;
            }
            else {
                n = 0;
            }
            String a;
            if (n != 0) {
                a = f.a(context);
            }
            else {
                a = "unassigned";
            }
            final FeatureSwitchesValue featureSwitchesValue = new FeatureSwitchesValue(f.a, a);
            if (!a.equals("unassigned")) {
                featureSwitchesValue.a(new FeatureSwitchesValue$FeatureSwitchesImpression(f.a, f.b, a));
            }
            this.config.put(f.a, featureSwitchesValue);
        }
    }
}
