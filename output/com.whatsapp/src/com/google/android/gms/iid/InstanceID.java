// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.iid;

import android.content.pm.PackageManager$NameNotFoundException;
import java.security.NoSuchAlgorithmException;
import android.util.Log;
import android.util.Base64;
import java.security.MessageDigest;
import android.os.Bundle;
import java.util.HashMap;
import java.security.KeyPair;
import android.content.Context;
import java.util.Map;

public class InstanceID
{
    static Map zzawN;
    private static zzd zzawO;
    private static zzc zzawP;
    static String zzawT;
    Context mContext;
    KeyPair zzawQ;
    String zzawR;
    long zzawS;
    
    static {
        InstanceID.zzawN = new HashMap();
    }
    
    protected InstanceID(final Context context, final String zzawR, final Bundle bundle) {
        this.zzawR = "";
        this.mContext = context.getApplicationContext();
        this.zzawR = zzawR;
    }
    
    public static InstanceID getInstance(final Context context) {
        return zza(context, null);
    }
    
    public static InstanceID zza(final Context context, final Bundle bundle) {
        // monitorenter(InstanceID.class)
        while (true) {
            while (true) {
                String string = null;
                Label_0140: {
                    if (bundle == null) {
                        string = "";
                        break Label_0140;
                    }
                    Label_0114: {
                        break Label_0114;
                        try {
                            final Context applicationContext = context.getApplicationContext();
                            if (InstanceID.zzawO == null) {
                                InstanceID.zzawO = new zzd(applicationContext);
                                InstanceID.zzawP = new zzc(applicationContext);
                            }
                            InstanceID.zzawT = Integer.toString(zzau(applicationContext));
                            final String s;
                            InstanceID instanceID = InstanceID.zzawN.get(s);
                            if (instanceID == null) {
                                instanceID = new InstanceID(applicationContext, s, bundle);
                                InstanceID.zzawN.put(s, instanceID);
                            }
                            return instanceID;
                            string = bundle.getString("subtype");
                            break Label_0140;
                        }
                        finally {
                        }
                        // monitorexit(InstanceID.class)
                    }
                    final String s = string;
                    continue;
                }
                if (string == null) {
                    final String s = "";
                    continue;
                }
                break;
            }
            continue;
        }
    }
    
    static String zza(final KeyPair keyPair) {
        final byte[] encoded = keyPair.getPublic().getEncoded();
        try {
            final byte[] digest = MessageDigest.getInstance("SHA1").digest(encoded);
            digest[0] = (byte)(0xFF & 112 + (0xF & digest[0]));
            return Base64.encodeToString(digest, 0, 8, 11);
        }
        catch (NoSuchAlgorithmException ex) {
            Log.w("InstanceID", "Unexpected error, device missing required alghorithms");
            return null;
        }
    }
    
    static int zzau(final Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        catch (PackageManager$NameNotFoundException ex) {
            Log.w("InstanceID", "Never happens: can't find own package " + ex);
            return 0;
        }
    }
    
    static String zzm(final byte[] array) {
        return Base64.encodeToString(array, 11);
    }
    
    public String zzc(final String s, final String s2, final Bundle bundle) {
        if (s2 != null) {
            bundle.putString("scope", s2);
        }
        bundle.putString("sender", s);
        String zzawR;
        if ("".equals(this.zzawR)) {
            zzawR = s;
        }
        else {
            zzawR = this.zzawR;
        }
        if (!bundle.containsKey("legacy.register")) {
            bundle.putString("subscription", s);
            bundle.putString("subtype", zzawR);
            bundle.putString("X-subscription", s);
            bundle.putString("X-subtype", zzawR);
        }
        return InstanceID.zzawP.zzp(InstanceID.zzawP.zza(bundle, this.zzue()));
    }
    
    KeyPair zzue() {
        if (this.zzawQ == null) {
            this.zzawQ = InstanceID.zzawO.zzdg(this.zzawR);
        }
        if (this.zzawQ == null) {
            this.zzawS = System.currentTimeMillis();
            this.zzawQ = InstanceID.zzawO.zze(this.zzawR, this.zzawS);
        }
        return this.zzawQ;
    }
    
    void zzuf() {
        this.zzawS = 0L;
        InstanceID.zzawO.zzdh(this.zzawR);
        this.zzawQ = null;
    }
    
    zzd zzug() {
        return InstanceID.zzawO;
    }
    
    zzc zzuh() {
        return InstanceID.zzawP;
    }
}
