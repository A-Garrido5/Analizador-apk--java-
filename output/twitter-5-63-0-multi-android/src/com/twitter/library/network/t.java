// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.network;

import com.twitter.internal.network.HttpOperation;
import java.util.ArrayList;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.InvalidKeyException;
import java.security.Key;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import com.twitter.library.util.bn;
import java.util.Iterator;
import org.apache.http.Header;
import java.io.IOException;
import java.util.List;
import java.util.Collections;
import android.util.Pair;
import android.text.TextUtils;
import org.apache.http.util.EntityUtils;
import org.apache.http.HttpEntity;
import java.net.URI;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import java.util.Comparator;
import java.security.SecureRandom;

public class t extends a
{
    public static final byte[] a;
    public static final byte[] b;
    public static final String c;
    public static final String d;
    public static final byte[] e;
    public static final String f;
    public static final byte[] g;
    public static final byte[] h;
    public static final String i;
    public static final String j;
    private static final SecureRandom k;
    private static final Comparator l;
    private static final Comparator m;
    private final OAuthToken n;
    private final int o;
    private final String p;
    private final String q;
    private final String r;
    
    static {
        a = new byte[] { -29, -88, -64, -95, -61, -89, -44, -68, -88, -98, -32, -63, -30, -96, -100, -63, -98, -80, -31, -97 };
        b = new byte[] { -44, -77, -93, -31, -35, -47, -48, -76, -76, -93, -78, -48, -32, -61, -86, -35, -56, -81, -33, -27, -93, -87, -81, -61, -94, -65, -47, -49, -97, -66, -66, -53, -61, -84, -67, -96, -58, -64, -94, -33, -91, -99, -93 };
        c = com.twitter.library.network.a.a((byte)22, t.a);
        d = com.twitter.library.network.a.a((byte)22, t.b);
        e = new byte[] { -43, -43, -43, -43, -43, -43, -43, -43, -43, -43, -43, -43, -43, -43, -43, -43, -43, -43, -43, -43, -43, -48, -66, -100, -43, -97, -43, -43, -43, -43, -43, -43, -93, -78, -33, -59, -47, -86, -83, -43, -15, -28, -48, -87, -100, -78, -64, -91, -97, -51, -93, -44, -65, -43, -32, -85, -87, -87, -98, -63, -89, -15, -29, -46, -60, -100, -97, -66, -32, -64, -64, -31, -93, -29, -44, -77, -66, -97, -87, -90, -48, -56, -92, -86, -66, -51, -99, -92, -79, -54, -32, -44, -77, -84, -62, -51, -49, -67, -61, -92, -29, -43, -65, -86, -45, -63, -77 };
        f = com.twitter.library.network.a.a((byte)22, t.e);
        g = new byte[] { -110, -93, -103, -108, -92, -42, -66, -58, -114, -77, -74, -103, -100, -99, -41, -68, -73, -95, -83, -95, -95, -91, -50, -110, -108, -83, -47, -83, -106, -79, -104, -81, -92, -93, -61, -44, -104, -113, -66, -79, -104 };
        h = new byte[] { -102, -50, -74, -108, -107, -107, -102, -67, -104, -58, -71, -64, -75, -72, -58, -98, -71, -68, -90, -60, -49, -96 };
        i = com.twitter.library.network.a.a((byte)7, t.h);
        j = com.twitter.library.network.a.a((byte)7, t.g);
        k = new SecureRandom();
        l = new u();
        m = new v();
    }
    
    public t(final int n) {
        this(null, n, null, t.c, t.d);
    }
    
    public t(final OAuthToken oAuthToken) {
        this(oAuthToken, 1, null, t.c, t.d);
    }
    
    private t(final OAuthToken n, final int o, final String p5, final String q, final String r) {
        this.n = n;
        this.o = o;
        this.p = p5;
        this.q = q;
        this.r = r;
    }
    
    public t(final OAuthToken oAuthToken, final String s, final String s2) {
        this(oAuthToken, 1, null, s, s2);
    }
    
    public static String a(final HttpOperation$RequestMethod httpOperation$RequestMethod, final URI uri, final HttpEntity httpEntity, final String s, final String s2, final String s3, final String s4) {
        final String rawQuery = uri.getRawQuery();
        final StringBuilder sb = new StringBuilder();
        if (rawQuery != null) {
            sb.append(rawQuery);
        }
        while (true) {
            if (httpEntity == null) {
                break Label_0090;
            }
            final Header contentType = httpEntity.getContentType();
            if (contentType == null || !"application/x-www-form-urlencoded".equals(contentType.getValue())) {
                break Label_0090;
            }
            try {
                final String string = EntityUtils.toString(httpEntity);
                if (!TextUtils.isEmpty((CharSequence)sb)) {
                    sb.append("&");
                }
                sb.append(string);
                final List b = b(sb.toString(), true);
                b.add(new Pair((Object)"oauth_consumer_key", (Object)s));
                b.add(new Pair((Object)"oauth_nonce", (Object)s3));
                b.add(new Pair((Object)"oauth_signature_method", (Object)"HMAC-SHA1"));
                b.add(new Pair((Object)"oauth_timestamp", (Object)s4));
                b.add(new Pair((Object)"oauth_version", (Object)"1.0"));
                if (s2 != null) {
                    b.add(new Pair((Object)"oauth_token", (Object)s2));
                }
                Collections.sort((List<Object>)b, t.l);
                final StringBuilder sb2 = new StringBuilder(httpOperation$RequestMethod.toString());
                sb2.append("&").append(com.twitter.library.network.a.a(a(uri))).append("&");
                final int size = b.size();
                final Iterator<Pair> iterator = b.iterator();
                int n = 0;
                while (iterator.hasNext()) {
                    final Pair pair = iterator.next();
                    sb2.append(com.twitter.library.network.a.a(com.twitter.library.network.a.a((String)pair.first))).append("%3D").append(com.twitter.library.network.a.a(com.twitter.library.network.a.a((String)pair.second)));
                    final int n2 = n + 1;
                    if (n2 < size) {
                        sb2.append("%26");
                    }
                    n = n2;
                }
                return sb2.toString();
            }
            catch (IOException ex) {
                continue;
            }
            break;
        }
    }
    
    public static String a(final String s, final String s2, String s3) {
        if (s3 == null) {
            s3 = "";
        }
        try {
            final SecretKeySpec secretKeySpec = new SecretKeySpec((bn.a(s2, "UTF8") + '&' + bn.a(s3, "UTF8")).getBytes("UTF8"), "HmacSHA1");
            final Mac instance = Mac.getInstance("HmacSHA1");
            instance.init(secretKeySpec);
            return bn.a(new String(zc.a(instance.doFinal(s.getBytes("UTF8"))), "UTF8"), "UTF8");
        }
        catch (InvalidKeyException ex) {
            return "";
        }
        catch (NoSuchAlgorithmException ex2) {
            return "";
        }
        catch (UnsupportedEncodingException ex3) {
            return "";
        }
    }
    
    public static String a(final String s, final String s2, final String s3, final String s4, final String s5) {
        if (s5 == null) {
            return String.format("OAuth realm=\"%s\", oauth_version=\"%s\", oauth_nonce=\"%s\", oauth_timestamp=\"%s\", oauth_signature=\"%s\", oauth_consumer_key=\"%s\", oauth_signature_method=\"%s\"", "http://api.twitter.com/", "1.0", s3, s4, s, s2, "HMAC-SHA1");
        }
        return String.format("OAuth realm=\"%s\", oauth_version=\"%s\", oauth_token=\"%s\", oauth_nonce=\"%s\", oauth_timestamp=\"%s\", oauth_signature=\"%s\", oauth_consumer_key=\"%s\", oauth_signature_method=\"%s\"", "http://api.twitter.com/", "1.0", s5, s3, s4, s, s2, "HMAC-SHA1");
    }
    
    public static String a(final URI uri) {
        return uri.getScheme() + "://" + uri.getHost() + uri.getRawPath();
    }
    
    public static String a(final List list, final String s) {
        final int binarySearch = Collections.binarySearch(list, new Pair((Object)s, (Object)null), t.m);
        if (binarySearch < 0 || binarySearch >= list.size() || !((String)((Pair)list.get(binarySearch)).first).equals(s)) {
            return null;
        }
        return (String)((Pair)list.get(binarySearch)).second;
    }
    
    public static List a(final String s, final boolean b) {
        final List b2 = b(s, b);
        Collections.sort((List<Object>)b2, t.l);
        return b2;
    }
    
    private static List b(final String s, final boolean b) {
        final ArrayList<Pair> list = new ArrayList<Pair>();
        if (s != null) {
            final String[] split = s.split("&");
            for (int length = split.length, i = 0; i < length; ++i) {
                final String[] split2 = split[i].split("=");
                String s2;
                String b2;
                if (split2.length == 2) {
                    if (b) {
                        s2 = bn.b(split2[0], "UTF8");
                        b2 = bn.b(split2[1], "UTF8");
                    }
                    else {
                        s2 = split2[0];
                        b2 = split2[1];
                    }
                }
                else if (!TextUtils.isEmpty((CharSequence)split2[0])) {
                    if (b) {
                        s2 = bn.b(split2[0], "UTF8");
                        b2 = "";
                    }
                    else {
                        s2 = split2[0];
                        b2 = "";
                    }
                }
                else {
                    b2 = null;
                    s2 = null;
                }
                if (s2 != null && b2 != null) {
                    list.add(new Pair((Object)s2, (Object)b2));
                }
            }
        }
        return list;
    }
    
    public String a(final HttpOperation$RequestMethod httpOperation$RequestMethod, final URI uri, final HttpEntity httpEntity, final long n) {
        String b;
        String a;
        if (this.n != null) {
            b = this.n.b;
            a = this.n.a;
        }
        else {
            b = null;
            a = null;
        }
        final String string = String.valueOf(System.nanoTime()) + String.valueOf(Math.abs(t.k.nextLong()));
        final String string2 = Long.toString((n + System.currentTimeMillis()) / 1000L);
        return a(a(a(httpOperation$RequestMethod, uri, httpEntity, this.q, b, string, string2), this.r, a), this.q, string, string2, b);
    }
    
    @Override
    public void a(final HttpOperation httpOperation, final long n) {
        switch (this.o) {
            default: {}
            case 1: {
                httpOperation.a("Authorization", this.a(httpOperation.h(), httpOperation.i(), httpOperation.e(), n));
            }
            case 2: {
                final String p2 = this.p;
                final String a = this.a(httpOperation.h(), httpOperation.i(), httpOperation.e(), n);
                httpOperation.a("X-Auth-Service-Provider", p2);
                httpOperation.a("X-Verify-Credentials-Authorization", a);
            }
        }
    }
    
    public OAuthToken b() {
        return this.n;
    }
}
