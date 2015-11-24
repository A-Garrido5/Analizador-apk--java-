// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av;

import com.twitter.library.av.model.b;
import java.net.URLEncoder;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import com.twitter.util.f;
import java.security.MessageDigest;
import com.twitter.library.av.model.Partner;
import com.twitter.library.client.Session;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class d
{
    static d a;
    final Map b;
    
    static {
        d.a = new d();
    }
    
    d() {
        this.b = new ConcurrentHashMap();
    }
    
    public static d a() {
        return d.a;
    }
    
    static String a(final Session session, final String s, final z z) {
        int i = 0;
        String b = null;
        if (session == null) {
            return b;
        }
        final String g = com.twitter.library.featureswitch.d.g(String.format("audio_configurations_client_user_id_hashing_salt_%s", new Partner(s).a()));
        final boolean a = a(g);
        b = null;
        if (!a) {
            return b;
        }
        Label_0146: {
            if (session.d() || z == null) {
                break Label_0146;
            }
            String s2 = String.format("%d%s", z.a(), g);
            try {
                // iftrue(Label_0206:, !d)
                while (true) {
                    while (true) {
                        final MessageDigest instance = MessageDigest.getInstance("SHA-1");
                        byte[] array = s2.getBytes("UTF-8");
                        while (i < 10000) {
                            array = instance.digest(array);
                            ++i;
                        }
                        b = f.b(array);
                        Label_0206: {
                            return b;
                        }
                        s2 = String.format("%d%s", session.g(), g);
                        continue;
                    }
                    final boolean d = session.d();
                    b = null;
                    continue;
                }
            }
            catch (NoSuchAlgorithmException ex) {
                return null;
            }
            catch (UnsupportedEncodingException ex2) {
                return null;
            }
        }
    }
    
    static String a(String replace, final String s, final String s2) {
        final String g = com.twitter.library.featureswitch.d.g(s);
        if (!TextUtils.isEmpty((CharSequence)g) && !TextUtils.isEmpty((CharSequence)s2)) {
            if (replace.contains(g)) {
                replace = replace.replace(g, s2);
            }
            else {
                try {
                    return replace.replace(URLEncoder.encode(g, "UTF-8"), s2);
                }
                catch (UnsupportedEncodingException ex) {
                    return replace;
                }
            }
        }
        return replace;
    }
    
    static boolean a(final String s) {
        return !TextUtils.isEmpty((CharSequence)s) && s.length() >= 32;
    }
    
    static boolean b() {
        return com.twitter.library.featureswitch.d.f("audio_configurations_client_page_referrer_enabled");
    }
    
    static boolean c() {
        return com.twitter.library.featureswitch.d.f("audio_configurations_client_user_id_hashing_enabled");
    }
    
    String a(final Session session, final b b, final z z) {
        return this.a(session, z, b.h());
    }
    
    String a(final Session session, final z z, final String s) {
        if (s != null) {
            synchronized (this) {
                if (!this.b.containsKey(s)) {
                    this.b.put(s, a(session, s, z));
                }
                return this.b.get(s);
            }
        }
        return null;
    }
    
    public String a(final Session session, String s, final String s2, final b b, final z z) {
        if (c()) {
            s = a(s, "audio_configurations_client_user_id_hashing_template", this.a(session, b, z));
        }
        if (b()) {
            s = a(s, "audio_configurations_client_page_referrer_template", s2);
        }
        return s;
    }
    
    public String a(final Session session, String s, final String s2, final String s3, final z z) {
        if (c()) {
            s = a(s, "audio_configurations_client_user_id_hashing_template", this.a(session, z, s3));
        }
        if (b()) {
            s = a(s, "audio_configurations_client_page_referrer_template", s2);
        }
        return s;
    }
    
    public void d() {
        this.b.clear();
    }
}
