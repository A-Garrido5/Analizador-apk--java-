// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.tagmanager;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import android.net.Uri;

class ce
{
    private static ce a;
    private volatile ce$a b;
    private volatile String c;
    private volatile String d;
    private volatile String e;
    
    ce() {
        this.e();
    }
    
    static ce a() {
        synchronized (ce.class) {
            if (ce.a == null) {
                ce.a = new ce();
            }
            return ce.a;
        }
    }
    
    private String a(final String s) {
        return s.split("&")[0].split("=")[1];
    }
    
    private String b(final Uri uri) {
        return uri.getQuery().replace("&gtm_debug=x", "");
    }
    
    boolean a(final Uri uri) {
        while (true) {
            boolean b = true;
            String decode;
            synchronized (this) {
                while (true) {
                    while (true) {
                        try {
                            decode = URLDecoder.decode(uri.toString(), "UTF-8");
                            if (!decode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$")) {
                                break;
                            }
                            z.d("Container preview url: " + decode);
                            if (decode.matches(".*?&gtm_debug=x$")) {
                                this.b = ce$a.c;
                                this.e = this.b(uri);
                                if (this.b == ce$a.b || this.b == ce$a.c) {
                                    this.d = "/r?" + this.e;
                                }
                                this.c = this.a(this.e);
                                return b;
                            }
                        }
                        catch (UnsupportedEncodingException ex) {
                            b = false;
                            return b;
                        }
                        this.b = ce$a.b;
                        continue;
                    }
                }
            }
            if (!decode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_preview=$")) {
                z.b("Invalid preview uri: " + decode);
                b = false;
                return b;
            }
            if (this.a(uri.getQuery()).equals(this.c)) {
                z.d("Exit preview mode for container: " + this.c);
                this.b = ce$a.a;
                this.d = null;
                return b;
            }
            b = false;
            return b;
        }
    }
    
    ce$a b() {
        return this.b;
    }
    
    String c() {
        return this.d;
    }
    
    String d() {
        return this.c;
    }
    
    void e() {
        this.b = ce$a.a;
        this.d = null;
        this.c = null;
        this.e = null;
    }
}
