// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.iid;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.security.KeyFactory;
import android.util.Base64;
import java.security.KeyPair;
import java.util.Iterator;
import android.content.SharedPreferences$Editor;
import android.util.Log;
import java.io.IOException;
import java.io.File;
import android.support.v4.content.ContextCompat;
import android.content.Context;
import android.content.SharedPreferences;

public class zzd
{
    SharedPreferences zzaxq;
    Context zzpH;
    
    public zzd(final Context context) {
        this(context, "com.google.android.gms.appid");
    }
    
    public zzd(final Context zzpH, final String s) {
        this.zzpH = zzpH;
        this.zzaxq = zzpH.getSharedPreferences(s, 4);
        this.zzde(s + "-no-backup");
    }
    
    private void zzde(final String s) {
        while (true) {
            final File file = new File(new ContextCompat().getNoBackupFilesDir(this.zzpH), s);
            try {
                if (file.exists()) {
                    return;
                }
            }
            catch (IOException ex) {
                throw ex;
            }
            try {
                if (!file.createNewFile() || this.isEmpty()) {
                    return;
                }
                try {
                    Log.i("InstanceID/Store", "App restored, clearing state");
                    InstanceIDListenerService.zza(this.zzpH, this);
                }
                catch (IOException ex2) {
                    try {
                        throw ex2;
                    }
                    catch (IOException ex3) {
                        try {
                            if (Log.isLoggable("InstanceID/Store", 3)) {
                                Log.d("InstanceID/Store", "Error creating file in no backup dir: " + ex3.getMessage());
                            }
                        }
                        catch (IOException ex4) {
                            throw ex4;
                        }
                    }
                }
            }
            catch (IOException ex5) {
                throw ex5;
            }
        }
    }
    
    String get(final String s, final String s2) {
        synchronized (this) {
            return this.zzaxq.getString(s + "|S|" + s2, (String)null);
        }
    }
    
    boolean isEmpty() {
        return this.zzaxq.getAll().isEmpty();
    }
    
    public void zzdf(final String s) {
        while (true) {
        Label_0082_Outer:
            while (true) {
                while (true) {
                    final int a;
                    synchronized (this) {
                        a = MessengerCompat.a;
                        final SharedPreferences$Editor edit = this.zzaxq.edit();
                        final Iterator<String> iterator = this.zzaxq.getAll().keySet().iterator();
                        if (!iterator.hasNext()) {
                            edit.commit();
                            return;
                        }
                        final String s2 = iterator.next();
                        if (s2.startsWith(s)) {
                            edit.remove(s2);
                        }
                    }
                    if (a != 0) {
                        continue;
                    }
                    break;
                }
                continue Label_0082_Outer;
            }
        }
    }
    
    public KeyPair zzdg(final String s) {
        return this.zzdj(s);
    }
    
    void zzdh(final String s) {
        this.zzdf(s + "|");
    }
    
    public void zzdi(final String s) {
        this.zzdf(s + "|T|");
    }
    
    KeyPair zzdj(final String s) {
        final String value = this.get(s, "|P|");
        final String value2 = this.get(s, "|K|");
        if (value2 == null) {
            return null;
        }
        try {
            final byte[] decode = Base64.decode(value, 8);
            final byte[] decode2 = Base64.decode(value2, 8);
            final KeyFactory instance = KeyFactory.getInstance("RSA");
            return new KeyPair(instance.generatePublic(new X509EncodedKeySpec(decode)), instance.generatePrivate(new PKCS8EncodedKeySpec(decode2)));
        }
        catch (InvalidKeySpecException ex) {}
        catch (NoSuchAlgorithmException ex2) {
            goto Label_0087;
        }
    }
    
    KeyPair zze(final String s, final long n) {
        synchronized (this) {
            final int a = MessengerCompat.a;
            final KeyPair zzud = zza.zzud();
            this.zzaxq.edit().putString(s + "|P|", InstanceID.zzm(zzud.getPublic().getEncoded())).putString(s + "|K|", InstanceID.zzm(zzud.getPrivate().getEncoded())).putString(s + "|S|" + "cre", Long.toString(n)).commit();
            if (zzb$zza.a) {
                MessengerCompat.a = a + 1;
            }
            return zzud;
        }
    }
    
    public void zzul() {
        synchronized (this) {
            this.zzaxq.edit().clear().commit();
        }
    }
}
