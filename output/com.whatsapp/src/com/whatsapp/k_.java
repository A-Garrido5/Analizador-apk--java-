// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import org.json.JSONArray;
import org.json.JSONException;
import com.whatsapp.util.Log;
import org.json.JSONObject;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.Iterator;
import android.location.Location;
import java.util.ArrayList;
import java.io.Serializable;

public class k_ implements Serializable
{
    private static final String b;
    private static ArrayList c;
    private static final String g;
    private static final String i;
    private static final String m;
    private static final String n;
    private static final long serialVersionUID = 1L;
    private static final String[] z;
    private final int a;
    private final double d;
    private final double e;
    private String f;
    private final String h;
    private transient Location j;
    private final int k;
    private final ArrayList l;
    private final String o;
    private boolean p;
    
    static {
        final String[] z2 = new String[39];
        String s = "{?\u001f*5s?\u001e0&u)";
        int n2 = 38;
        String[] array = z2;
        int n3 = 0;
        String intern = null;
    Label_1096:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int j = charArray.length, n4 = 0; j > n4; ++n4) {
                final char c = charArray[n4];
                char c2 = '\0';
                switch (n4 % 5) {
                    default: {
                        c2 = 'j';
                        break;
                    }
                    case 0: {
                        c2 = '!';
                        break;
                    }
                    case 1: {
                        c2 = 'z';
                        break;
                    }
                    case 2: {
                        c2 = 'M';
                        break;
                    }
                    case 3: {
                        c2 = 'e';
                        break;
                    }
                }
                charArray[n4] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n2) {
                default: {
                    array[n3] = intern;
                    s = "O\u0015m\u0017\u000fR\n\"\u000b\u0019D";
                    n3 = 1;
                    array = z2;
                    n2 = 0;
                    continue;
                }
                case 38: {
                    n = intern;
                    s = "n1";
                    n2 = 39;
                    continue;
                }
                case 39: {
                    b = intern;
                    s = "h4\u001b$&h>\u00127/p/\b6>";
                    n2 = 40;
                    continue;
                }
                case 40: {
                    i = intern;
                    s = "s?\u001c0/r.\u0012!/o3\b!";
                    n2 = 41;
                    continue;
                }
                case 41: {
                    m = intern;
                    s = "n,\b75p/\b73~6\u0004(#u";
                    n2 = 42;
                    continue;
                }
                case 42: {
                    g = intern;
                    s = "\u0013O";
                    n2 = -1;
                    continue;
                }
                case 0: {
                    array[n3] = intern;
                    s = "D\b?\n\u0018\u0001\t9\u0004\u001eT\tm";
                    n3 = 2;
                    array = z2;
                    n2 = 1;
                    continue;
                }
                case 1: {
                    array[n3] = intern;
                    s = "M\u0015.\u0004\u0006D";
                    n3 = 3;
                    array = z2;
                    n2 = 2;
                    continue;
                }
                case 2: {
                    array[n3] = intern;
                    n3 = 4;
                    array = z2;
                    s = "t.\u000bHR";
                    n2 = 3;
                    continue;
                }
                case 3: {
                    array[n3] = intern;
                    n3 = 5;
                    s = "O\u001b \u0000FM\u0015.\u0004\u001eH\u0015#I\u001aM\u001b.\u00005U\u0015=\f\tRT!\f\u0007H\u000eeTCZ\u0013.\n\u0004~\u000f?\t\u0017";
                    n2 = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n3] = intern;
                    n3 = 6;
                    s = "B\u001f#\u0011\u000fS";
                    n2 = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n3] = intern;
                    n3 = 7;
                    s = "M\u0013 \f\u001e";
                    n2 = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n3] = intern;
                    n3 = 8;
                    s = "G\u0013(\t\u000eR";
                    n2 = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n3] = intern;
                    n3 = 9;
                    s = "Q\u0016,\u0006\u000f";
                    n2 = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n3] = intern;
                    n3 = 10;
                    s = "E\u0013>\u0011\u000bO\u0019(";
                    n2 = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n3] = intern;
                    n3 = 11;
                    s = "U\u0003=\u0000";
                    n2 = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n3] = intern;
                    n3 = 12;
                    s = "R\u001f,\u0017\tIE";
                    n2 = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n3] = intern;
                    n3 = 13;
                    s = "O\u0015m\u0017\u000fR\n\"\u000b\u0019D";
                    n2 = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n3] = intern;
                    n3 = 14;
                    s = "J\u001f4\u0012\u0005S\u001e";
                    n2 = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n3] = intern;
                    n3 = 15;
                    s = "n1";
                    n2 = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n3] = intern;
                    n3 = 16;
                    s = "M\u0015.\u0004\u001eH\u0015#";
                    n2 = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n3] = intern;
                    n3 = 17;
                    s = "M\u001b#\u0002\u001f@\u001d(";
                    n2 = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n3] = intern;
                    n3 = 18;
                    s = "U\u0003=\u0000\u0019";
                    n2 = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n3] = intern;
                    n3 = 19;
                    s = "t.\u000bHR";
                    n2 = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n3] = intern;
                    n3 = 20;
                    s = "R\u000e,\u0011\u001fR";
                    n2 = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n3] = intern;
                    n3 = 21;
                    s = "n,\b75p/\b73~6\u0004(#u";
                    n2 = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n3] = intern;
                    n3 = 22;
                    s = "S\u001b)\f\u001fR";
                    n2 = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n3] = intern;
                    n3 = 23;
                    s = "M\u0016";
                    n2 = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n3] = intern;
                    n3 = 24;
                    s = "O\u0015m\u0017\u000fR\n\"\u000b\u0019D";
                    n2 = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n3] = intern;
                    n3 = 25;
                    s = "yW\u001f\u0004\u001eD6$\b\u0003UW\u0001\f\u0007H\u000e";
                    n2 = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n3] = intern;
                    n3 = 26;
                    s = "yW\u001f\u0004\u001eD6$\b\u0003UW\u001f\u0000\u0007@\u0013#\f\u0004F@m";
                    n2 = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n3] = intern;
                    n3 = 27;
                    s = "yW\u001f\u0004\u001eD6$\b\u0003UW\u0001\f\u0007H\u000ewE";
                    n2 = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n3] = intern;
                    n3 = 28;
                    s = "t.\u000bHR";
                    n2 = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n3] = intern;
                    n3 = 29;
                    s = "S\u001b)\f\u001fR";
                    n2 = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n3] = intern;
                    n3 = 30;
                    s = "P\u000f(\u0017\u0013";
                    n2 = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n3] = intern;
                    n3 = 31;
                    s = "yW\u001f\u0004\u001eD6$\b\u0003UW\u001f\u0000\u0007@\u0013#\f\u0004F";
                    n2 = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n3] = intern;
                    n3 = 32;
                    s = "S\u001f>\u0015\u0005O\t(";
                    n2 = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n3] = intern;
                    s = "W\u001f#\u0010\u000fR";
                    n2 = 32;
                    n3 = 33;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n3] = intern;
                    n3 = 34;
                    array = z2;
                    s = "E\u001b9\u0004";
                    n2 = 33;
                    continue;
                }
                case 33: {
                    array[n3] = intern;
                    n3 = 35;
                    s = "S\u001f>\u0010\u0006U\t";
                    n2 = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n3] = intern;
                    n3 = 36;
                    s = "\u001d\u0018?EE\u001f";
                    n2 = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n3] = intern;
                    n3 = 37;
                    s = "F\u001f\"\u0006\u0005E\u001f`R[\u000f\n#\u0002";
                    n2 = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n3] = intern;
                    n3 = 38;
                    s = "I\u000e \t5@\u000e9\u0017\u0003C\u000f9\f\u0005O\t";
                    n2 = 37;
                    array = z2;
                    continue;
                }
                case 37: {
                    break Label_1096;
                }
            }
        }
        array[n3] = intern;
        z = z2;
        k_.c = new ArrayList();
    }
    
    public k_() {
        this.l = new ArrayList();
        this.a = 0;
        this.d = Double.MAX_VALUE;
        this.e = Double.MAX_VALUE;
        this.k = 0;
        this.o = "";
        this.h = "";
    }
    
    public k_(final int a, final Location location, final int k, String o, String h) {
        this.l = new ArrayList();
        this.a = a;
        this.d = location.getLatitude();
        this.e = location.getLongitude();
        this.k = k;
        if (o == null) {
            o = "";
        }
        try {
            this.o = o;
            if (h == null) {
                h = "";
            }
            this.h = h;
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
    }
    
    private static k_ a(final int n, final Location location, final int n2, final String s, final String s2) {
        final boolean i = App.I;
        for (final k_ k_ : k_.c) {
            Label_0134: {
                double n4;
                try {
                    if (!k_.o.equalsIgnoreCase(s) || !k_.h.equalsIgnoreCase(s2)) {
                        break Label_0134;
                    }
                    final double n3 = k_.h().distanceTo(location);
                    n4 = 0.2 * ((n2 + k_.k) / 2);
                    if (n3 >= n4) {
                        break Label_0134;
                    }
                    final k_ k_2 = k_;
                    final int n5 = k_2.k;
                    final int n6 = n2;
                    final int n7 = n5 - n6;
                    final int abs = Math.abs(n7);
                    final int abs2 = abs;
                    final double n8 = abs2;
                    final double n9 = n4;
                    final double n10 = dcmpg(n8, n9);
                    if (n10 < 0) {
                        return k_;
                    }
                    break Label_0134;
                }
                catch (NumberFormatException ex) {
                    throw ex;
                }
                try {
                    final k_ k_2 = k_;
                    final int n5 = k_2.k;
                    final int n6 = n2;
                    final int n7 = n5 - n6;
                    final int abs2;
                    final int abs = abs2 = Math.abs(n7);
                    final double n8 = abs2;
                    final double n9 = n4;
                    final double n10 = dcmpg(n8, n9);
                    if (n10 < 0) {
                        return k_;
                    }
                }
                catch (NumberFormatException ex2) {
                    throw ex2;
                }
            }
            if (i) {
                break;
            }
        }
        return null;
    }
    
    public static k_ a(final Location p0, final int p1, final String p2, final String p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_2        
        //     1: ifnonnull       543
        //     4: ldc             ""
        //     6: astore          4
        //     8: aload_3        
        //     9: ifnonnull       537
        //    12: ldc             ""
        //    14: astore          5
        //    16: iload_1        
        //    17: i2d            
        //    18: invokestatic    java/lang/Math.log:(D)D
        //    21: ldc2_w          2.0
        //    24: invokestatic    java/lang/Math.log:(D)D
        //    27: ddiv           
        //    28: d2i            
        //    29: pop            
        //    30: iconst_1       
        //    31: aload_0        
        //    32: iload_1        
        //    33: aload           4
        //    35: aload           5
        //    37: invokestatic    com/whatsapp/k_.a:(ILandroid/location/Location;ILjava/lang/String;Ljava/lang/String;)Lcom/whatsapp/k_;
        //    40: astore          7
        //    42: aload           7
        //    44: ifnonnull       514
        //    47: new             Lcom/whatsapp/k_;
        //    50: dup            
        //    51: iconst_1       
        //    52: aload_0        
        //    53: iload_1        
        //    54: aload           4
        //    56: aload           5
        //    58: invokespecial   com/whatsapp/k_.<init>:(ILandroid/location/Location;ILjava/lang/String;Ljava/lang/String;)V
        //    61: astore          7
        //    63: new             Ljava/util/ArrayList;
        //    66: dup            
        //    67: invokespecial   java/util/ArrayList.<init>:()V
        //    70: astore          8
        //    72: aload           8
        //    74: new             Lorg/apache/http/message/BasicNameValuePair;
        //    77: dup            
        //    78: getstatic       com/whatsapp/k_.z:[Ljava/lang/String;
        //    81: bipush          16
        //    83: aaload         
        //    84: new             Ljava/lang/StringBuilder;
        //    87: dup            
        //    88: invokespecial   java/lang/StringBuilder.<init>:()V
        //    91: aload_0        
        //    92: invokevirtual   android/location/Location.getLatitude:()D
        //    95: invokevirtual   java/lang/StringBuilder.append:(D)Ljava/lang/StringBuilder;
        //    98: ldc             ","
        //   100: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   103: aload_0        
        //   104: invokevirtual   android/location/Location.getLongitude:()D
        //   107: invokevirtual   java/lang/StringBuilder.append:(D)Ljava/lang/StringBuilder;
        //   110: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   113: invokespecial   org/apache/http/message/BasicNameValuePair.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   116: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   121: pop            
        //   122: aload           8
        //   124: new             Lorg/apache/http/message/BasicNameValuePair;
        //   127: dup            
        //   128: getstatic       com/whatsapp/k_.z:[Ljava/lang/String;
        //   131: bipush          22
        //   133: aaload         
        //   134: iload_1        
        //   135: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //   138: invokespecial   org/apache/http/message/BasicNameValuePair.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   141: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   146: pop            
        //   147: aload           5
        //   149: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   152: ifne            178
        //   155: aload           8
        //   157: new             Lorg/apache/http/message/BasicNameValuePair;
        //   160: dup            
        //   161: getstatic       com/whatsapp/k_.z:[Ljava/lang/String;
        //   164: bipush          14
        //   166: aaload         
        //   167: aload           5
        //   169: invokespecial   org/apache/http/message/BasicNameValuePair.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   172: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   177: pop            
        //   178: aload           4
        //   180: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   183: ifne            209
        //   186: aload           8
        //   188: new             Lorg/apache/http/message/BasicNameValuePair;
        //   191: dup            
        //   192: getstatic       com/whatsapp/k_.z:[Ljava/lang/String;
        //   195: bipush          18
        //   197: aaload         
        //   198: aload           4
        //   200: invokespecial   org/apache/http/message/BasicNameValuePair.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   203: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   208: pop            
        //   209: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   212: invokevirtual   com/whatsapp/App.getResources:()Landroid/content/res/Resources;
        //   215: invokevirtual   android/content/res/Resources.getConfiguration:()Landroid/content/res/Configuration;
        //   218: getfield        android/content/res/Configuration.locale:Ljava/util/Locale;
        //   221: astore          13
        //   223: aload           13
        //   225: ifnull          254
        //   228: aload           8
        //   230: new             Lorg/apache/http/message/BasicNameValuePair;
        //   233: dup            
        //   234: getstatic       com/whatsapp/k_.z:[Ljava/lang/String;
        //   237: bipush          17
        //   239: aaload         
        //   240: aload           13
        //   242: invokevirtual   java/util/Locale.getLanguage:()Ljava/lang/String;
        //   245: invokespecial   org/apache/http/message/BasicNameValuePair.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   248: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   253: pop            
        //   254: new             Lorg/apache/http/params/BasicHttpParams;
        //   257: dup            
        //   258: invokespecial   org/apache/http/params/BasicHttpParams.<init>:()V
        //   261: astore          14
        //   263: aload           14
        //   265: sipush          15000
        //   268: invokestatic    org/apache/http/params/HttpConnectionParams.setConnectionTimeout:(Lorg/apache/http/params/HttpParams;I)V
        //   271: aload           14
        //   273: sipush          30000
        //   276: invokestatic    org/apache/http/params/HttpConnectionParams.setSoTimeout:(Lorg/apache/http/params/HttpParams;I)V
        //   279: aload           14
        //   281: invokestatic    com/whatsapp/m3.a:()Ljava/lang/String;
        //   284: invokestatic    org/apache/http/params/HttpProtocolParams.setUserAgent:(Lorg/apache/http/params/HttpParams;Ljava/lang/String;)V
        //   287: new             Lorg/apache/http/impl/client/DefaultHttpClient;
        //   290: dup            
        //   291: aload           14
        //   293: invokespecial   org/apache/http/impl/client/DefaultHttpClient.<init>:(Lorg/apache/http/params/HttpParams;)V
        //   296: new             Lorg/apache/http/client/methods/HttpGet;
        //   299: dup            
        //   300: new             Ljava/lang/StringBuilder;
        //   303: dup            
        //   304: invokespecial   java/lang/StringBuilder.<init>:()V
        //   307: getstatic       com/whatsapp/a6c.b:Ljava/lang/String;
        //   310: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   313: aload           8
        //   315: getstatic       com/whatsapp/k_.z:[Ljava/lang/String;
        //   318: bipush          19
        //   320: aaload         
        //   321: invokestatic    org/apache/http/client/utils/URLEncodedUtils.format:(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;
        //   324: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   327: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   330: invokespecial   org/apache/http/client/methods/HttpGet.<init>:(Ljava/lang/String;)V
        //   333: invokevirtual   org/apache/http/impl/client/DefaultHttpClient.execute:(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
        //   336: astore          15
        //   338: aload           15
        //   340: ifnonnull       377
        //   343: new             Ljava/io/IOException;
        //   346: dup            
        //   347: getstatic       com/whatsapp/k_.z:[Ljava/lang/String;
        //   350: bipush          13
        //   352: aaload         
        //   353: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   356: athrow         
        //   357: astore          27
        //   359: aload           27
        //   361: athrow         
        //   362: astore          9
        //   364: aload           9
        //   366: athrow         
        //   367: astore          12
        //   369: aload           12
        //   371: athrow         
        //   372: astore          28
        //   374: aload           28
        //   376: athrow         
        //   377: aload           15
        //   379: invokeinterface org/apache/http/HttpResponse.getStatusLine:()Lorg/apache/http/StatusLine;
        //   384: invokeinterface org/apache/http/StatusLine.getStatusCode:()I
        //   389: sipush          200
        //   392: if_icmpne       514
        //   395: new             Lorg/json/JSONObject;
        //   398: dup            
        //   399: aload           15
        //   401: invokeinterface org/apache/http/HttpResponse.getEntity:()Lorg/apache/http/HttpEntity;
        //   406: invokestatic    org/apache/http/util/EntityUtils.toString:(Lorg/apache/http/HttpEntity;)Ljava/lang/String;
        //   409: invokespecial   org/json/JSONObject.<init>:(Ljava/lang/String;)V
        //   412: astore          16
        //   414: aload           16
        //   416: getstatic       com/whatsapp/k_.z:[Ljava/lang/String;
        //   419: bipush          20
        //   421: aaload         
        //   422: invokevirtual   org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   425: astore          17
        //   427: getstatic       com/whatsapp/k_.z:[Ljava/lang/String;
        //   430: bipush          21
        //   432: aaload         
        //   433: aload           17
        //   435: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   438: istore          22
        //   440: iload           22
        //   442: ifeq            461
        //   445: aload           7
        //   447: iconst_1       
        //   448: putfield        com/whatsapp/k_.p:Z
        //   451: getstatic       com/whatsapp/App.I:Z
        //   454: istore          26
        //   456: iload           26
        //   458: ifeq            514
        //   461: getstatic       com/whatsapp/k_.z:[Ljava/lang/String;
        //   464: bipush          15
        //   466: aaload         
        //   467: aload           17
        //   469: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   472: istore          23
        //   474: iload           23
        //   476: ifeq            514
        //   479: aload           7
        //   481: aload           16
        //   483: invokevirtual   com/whatsapp/k_.c:(Lorg/json/JSONObject;)V
        //   486: getstatic       com/whatsapp/k_.c:Ljava/util/ArrayList;
        //   489: aload           7
        //   491: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   494: pop            
        //   495: getstatic       com/whatsapp/k_.c:Ljava/util/ArrayList;
        //   498: invokevirtual   java/util/ArrayList.size:()I
        //   501: bipush          12
        //   503: if_icmple       514
        //   506: getstatic       com/whatsapp/k_.c:Ljava/util/ArrayList;
        //   509: iconst_0       
        //   510: invokevirtual   java/util/ArrayList.remove:(I)Ljava/lang/Object;
        //   513: pop            
        //   514: aload           7
        //   516: areturn        
        //   517: astore          18
        //   519: aload           18
        //   521: athrow         
        //   522: astore          19
        //   524: aload           19
        //   526: athrow         
        //   527: astore          20
        //   529: aload           20
        //   531: athrow         
        //   532: astore          21
        //   534: aload           21
        //   536: athrow         
        //   537: aload_3        
        //   538: astore          5
        //   540: goto            16
        //   543: aload_2        
        //   544: astore          4
        //   546: goto            8
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  72     178    362    367    Ljava/lang/NumberFormatException;
        //  178    209    367    372    Ljava/lang/NumberFormatException;
        //  228    254    372    377    Ljava/lang/NumberFormatException;
        //  343    357    357    362    Ljava/lang/NumberFormatException;
        //  427    440    517    522    Ljava/lang/NumberFormatException;
        //  445    456    522    527    Ljava/lang/NumberFormatException;
        //  461    474    527    532    Ljava/lang/NumberFormatException;
        //  479    514    532    537    Ljava/lang/NumberFormatException;
        //  519    522    522    527    Ljava/lang/NumberFormatException;
        //  524    527    527    532    Ljava/lang/NumberFormatException;
        //  529    532    532    537    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 245, Size: 245
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static k_ b(final Location p0, final int p1, final String p2, final String p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_2        
        //     1: ifnonnull       574
        //     4: ldc             ""
        //     6: astore          4
        //     8: aload_3        
        //     9: ifnonnull       568
        //    12: ldc             ""
        //    14: astore          5
        //    16: iload_1        
        //    17: i2d            
        //    18: invokestatic    java/lang/Math.log:(D)D
        //    21: ldc2_w          2.0
        //    24: invokestatic    java/lang/Math.log:(D)D
        //    27: ddiv           
        //    28: d2i            
        //    29: pop            
        //    30: iconst_3       
        //    31: aload_0        
        //    32: iload_1        
        //    33: aload           4
        //    35: aload           5
        //    37: invokestatic    com/whatsapp/k_.a:(ILandroid/location/Location;ILjava/lang/String;Ljava/lang/String;)Lcom/whatsapp/k_;
        //    40: astore          7
        //    42: aload           7
        //    44: ifnonnull       555
        //    47: new             Lcom/whatsapp/k_;
        //    50: dup            
        //    51: iconst_3       
        //    52: aload_0        
        //    53: iload_1        
        //    54: aload           4
        //    56: aload           5
        //    58: invokespecial   com/whatsapp/k_.<init>:(ILandroid/location/Location;ILjava/lang/String;Ljava/lang/String;)V
        //    61: astore          7
        //    63: new             Ljava/util/ArrayList;
        //    66: dup            
        //    67: invokespecial   java/util/ArrayList.<init>:()V
        //    70: astore          8
        //    72: aload           8
        //    74: new             Lorg/apache/http/message/BasicNameValuePair;
        //    77: dup            
        //    78: getstatic       com/whatsapp/k_.z:[Ljava/lang/String;
        //    81: bipush          6
        //    83: aaload         
        //    84: new             Ljava/lang/StringBuilder;
        //    87: dup            
        //    88: invokespecial   java/lang/StringBuilder.<init>:()V
        //    91: aload_0        
        //    92: invokevirtual   android/location/Location.getLatitude:()D
        //    95: invokevirtual   java/lang/StringBuilder.append:(D)Ljava/lang/StringBuilder;
        //    98: ldc             ","
        //   100: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   103: aload_0        
        //   104: invokevirtual   android/location/Location.getLongitude:()D
        //   107: invokevirtual   java/lang/StringBuilder.append:(D)Ljava/lang/StringBuilder;
        //   110: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   113: invokespecial   org/apache/http/message/BasicNameValuePair.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   116: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   121: pop            
        //   122: aload           8
        //   124: new             Lorg/apache/http/message/BasicNameValuePair;
        //   127: dup            
        //   128: getstatic       com/whatsapp/k_.z:[Ljava/lang/String;
        //   131: bipush          10
        //   133: aaload         
        //   134: iload_1        
        //   135: sipush          4999
        //   138: invokestatic    java/lang/Math.min:(II)I
        //   141: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //   144: invokespecial   org/apache/http/message/BasicNameValuePair.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   147: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   152: pop            
        //   153: aload           5
        //   155: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   158: ifne            181
        //   161: aload           8
        //   163: new             Lorg/apache/http/message/BasicNameValuePair;
        //   166: dup            
        //   167: ldc_w           "q"
        //   170: aload           5
        //   172: invokespecial   org/apache/http/message/BasicNameValuePair.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   175: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   180: pop            
        //   181: aload           8
        //   183: new             Lorg/apache/http/message/BasicNameValuePair;
        //   186: dup            
        //   187: getstatic       com/whatsapp/k_.z:[Ljava/lang/String;
        //   190: bipush          11
        //   192: aaload         
        //   193: getstatic       com/whatsapp/k_.z:[Ljava/lang/String;
        //   196: bipush          9
        //   198: aaload         
        //   199: invokespecial   org/apache/http/message/BasicNameValuePair.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   202: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   207: pop            
        //   208: aload           8
        //   210: new             Lorg/apache/http/message/BasicNameValuePair;
        //   213: dup            
        //   214: getstatic       com/whatsapp/k_.z:[Ljava/lang/String;
        //   217: bipush          7
        //   219: aaload         
        //   220: getstatic       com/whatsapp/k_.z:[Ljava/lang/String;
        //   223: iconst_0       
        //   224: aaload         
        //   225: invokespecial   org/apache/http/message/BasicNameValuePair.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   228: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   233: pop            
        //   234: aload           8
        //   236: new             Lorg/apache/http/message/BasicNameValuePair;
        //   239: dup            
        //   240: getstatic       com/whatsapp/k_.z:[Ljava/lang/String;
        //   243: bipush          8
        //   245: aaload         
        //   246: getstatic       com/whatsapp/k_.z:[Ljava/lang/String;
        //   249: iconst_5       
        //   250: aaload         
        //   251: invokespecial   org/apache/http/message/BasicNameValuePair.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   254: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   259: pop            
        //   260: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   263: invokevirtual   com/whatsapp/App.getResources:()Landroid/content/res/Resources;
        //   266: invokevirtual   android/content/res/Resources.getConfiguration:()Landroid/content/res/Configuration;
        //   269: getfield        android/content/res/Configuration.locale:Ljava/util/Locale;
        //   272: astore          15
        //   274: aload           15
        //   276: ifnull          304
        //   279: aload           8
        //   281: new             Lorg/apache/http/message/BasicNameValuePair;
        //   284: dup            
        //   285: getstatic       com/whatsapp/k_.z:[Ljava/lang/String;
        //   288: iconst_3       
        //   289: aaload         
        //   290: aload           15
        //   292: invokevirtual   java/util/Locale.getLanguage:()Ljava/lang/String;
        //   295: invokespecial   org/apache/http/message/BasicNameValuePair.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   298: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   303: pop            
        //   304: new             Lorg/apache/http/params/BasicHttpParams;
        //   307: dup            
        //   308: invokespecial   org/apache/http/params/BasicHttpParams.<init>:()V
        //   311: astore          16
        //   313: aload           16
        //   315: sipush          15000
        //   318: invokestatic    org/apache/http/params/HttpConnectionParams.setConnectionTimeout:(Lorg/apache/http/params/HttpParams;I)V
        //   321: aload           16
        //   323: sipush          30000
        //   326: invokestatic    org/apache/http/params/HttpConnectionParams.setSoTimeout:(Lorg/apache/http/params/HttpParams;I)V
        //   329: aload           16
        //   331: invokestatic    com/whatsapp/m3.a:()Ljava/lang/String;
        //   334: invokestatic    org/apache/http/params/HttpProtocolParams.setUserAgent:(Lorg/apache/http/params/HttpParams;Ljava/lang/String;)V
        //   337: new             Lorg/apache/http/impl/client/DefaultHttpClient;
        //   340: dup            
        //   341: aload           16
        //   343: invokespecial   org/apache/http/impl/client/DefaultHttpClient.<init>:(Lorg/apache/http/params/HttpParams;)V
        //   346: new             Lorg/apache/http/client/methods/HttpGet;
        //   349: dup            
        //   350: new             Ljava/lang/StringBuilder;
        //   353: dup            
        //   354: invokespecial   java/lang/StringBuilder.<init>:()V
        //   357: getstatic       com/whatsapp/a6c.c:Ljava/lang/String;
        //   360: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   363: getstatic       com/whatsapp/k_.z:[Ljava/lang/String;
        //   366: bipush          12
        //   368: aaload         
        //   369: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   372: getstatic       com/whatsapp/a6c.j:Ljava/lang/String;
        //   375: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   378: ldc_w           "&"
        //   381: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   384: aload           8
        //   386: getstatic       com/whatsapp/k_.z:[Ljava/lang/String;
        //   389: iconst_4       
        //   390: aaload         
        //   391: invokestatic    org/apache/http/client/utils/URLEncodedUtils.format:(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;
        //   394: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   397: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   400: invokespecial   org/apache/http/client/methods/HttpGet.<init>:(Ljava/lang/String;)V
        //   403: invokevirtual   org/apache/http/impl/client/DefaultHttpClient.execute:(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
        //   406: astore          17
        //   408: aload           17
        //   410: ifnonnull       441
        //   413: new             Ljava/io/IOException;
        //   416: dup            
        //   417: getstatic       com/whatsapp/k_.z:[Ljava/lang/String;
        //   420: iconst_1       
        //   421: aaload         
        //   422: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   425: athrow         
        //   426: astore          23
        //   428: aload           23
        //   430: athrow         
        //   431: astore          9
        //   433: aload           9
        //   435: athrow         
        //   436: astore          24
        //   438: aload           24
        //   440: athrow         
        //   441: aload           17
        //   443: invokeinterface org/apache/http/HttpResponse.getStatusLine:()Lorg/apache/http/StatusLine;
        //   448: invokeinterface org/apache/http/StatusLine.getStatusCode:()I
        //   453: sipush          200
        //   456: if_icmpne       519
        //   459: new             Lorg/json/JSONObject;
        //   462: dup            
        //   463: aload           17
        //   465: invokeinterface org/apache/http/HttpResponse.getEntity:()Lorg/apache/http/HttpEntity;
        //   470: invokestatic    org/apache/http/util/EntityUtils.toString:(Lorg/apache/http/HttpEntity;)Ljava/lang/String;
        //   473: invokespecial   org/json/JSONObject.<init>:(Ljava/lang/String;)V
        //   476: astore          18
        //   478: aload           7
        //   480: aload           18
        //   482: invokevirtual   com/whatsapp/k_.b:(Lorg/json/JSONObject;)V
        //   485: getstatic       com/whatsapp/k_.c:Ljava/util/ArrayList;
        //   488: aload           7
        //   490: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   493: pop            
        //   494: getstatic       com/whatsapp/k_.c:Ljava/util/ArrayList;
        //   497: invokevirtual   java/util/ArrayList.size:()I
        //   500: bipush          12
        //   502: if_icmple       513
        //   505: getstatic       com/whatsapp/k_.c:Ljava/util/ArrayList;
        //   508: iconst_0       
        //   509: invokevirtual   java/util/ArrayList.remove:(I)Ljava/lang/Object;
        //   512: pop            
        //   513: getstatic       com/whatsapp/App.I:Z
        //   516: ifeq            555
        //   519: new             Ljava/lang/StringBuilder;
        //   522: dup            
        //   523: invokespecial   java/lang/StringBuilder.<init>:()V
        //   526: getstatic       com/whatsapp/k_.z:[Ljava/lang/String;
        //   529: iconst_2       
        //   530: aaload         
        //   531: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   534: aload           17
        //   536: invokeinterface org/apache/http/HttpResponse.getStatusLine:()Lorg/apache/http/StatusLine;
        //   541: invokeinterface org/apache/http/StatusLine.getStatusCode:()I
        //   546: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   549: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   552: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   555: aload           7
        //   557: areturn        
        //   558: astore          19
        //   560: aload           19
        //   562: athrow         
        //   563: astore          21
        //   565: aload           21
        //   567: athrow         
        //   568: aload_3        
        //   569: astore          5
        //   571: goto            16
        //   574: aload_2        
        //   575: astore          4
        //   577: goto            8
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  72     181    431    436    Ljava/lang/NumberFormatException;
        //  279    304    436    441    Ljava/lang/NumberFormatException;
        //  413    426    426    431    Ljava/lang/NumberFormatException;
        //  478    513    558    563    Ljava/lang/NumberFormatException;
        //  513    519    563    568    Ljava/lang/NumberFormatException;
        //  519    555    563    568    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0304:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static void b(final int n) {
        final boolean i = App.I;
        final ArrayList<k_> list = new ArrayList<k_>();
        final Iterator<k_> iterator = (Iterator<k_>)k_.c.iterator();
        while (true) {
            Label_0059: {
                if (!iterator.hasNext()) {
                    break Label_0059;
                }
                final k_ k_ = iterator.next();
                try {
                    if (k_.a == n) {
                        list.add(k_);
                    }
                    if (i) {
                        com.whatsapp.k_.c.removeAll(list);
                        return;
                    }
                    continue;
                }
                catch (NumberFormatException ex) {
                    throw ex;
                }
            }
        }
    }
    
    public static k_ c(final Location p0, final int p1, final String p2, final String p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_2        
        //     1: ifnonnull       518
        //     4: ldc             ""
        //     6: astore          4
        //     8: aload_3        
        //     9: ifnonnull       512
        //    12: ldc             ""
        //    14: astore          5
        //    16: iconst_2       
        //    17: aload_0        
        //    18: iload_1        
        //    19: aload           4
        //    21: aload           5
        //    23: invokestatic    com/whatsapp/k_.a:(ILandroid/location/Location;ILjava/lang/String;Ljava/lang/String;)Lcom/whatsapp/k_;
        //    26: astore          6
        //    28: aload           6
        //    30: ifnonnull       489
        //    33: new             Lcom/whatsapp/k_;
        //    36: dup            
        //    37: iconst_2       
        //    38: aload_0        
        //    39: iload_1        
        //    40: aload           4
        //    42: aload           5
        //    44: invokespecial   com/whatsapp/k_.<init>:(ILandroid/location/Location;ILjava/lang/String;Ljava/lang/String;)V
        //    47: astore          6
        //    49: new             Ljava/util/ArrayList;
        //    52: dup            
        //    53: invokespecial   java/util/ArrayList.<init>:()V
        //    56: astore          7
        //    58: aload           7
        //    60: new             Lorg/apache/http/message/BasicNameValuePair;
        //    63: dup            
        //    64: getstatic       com/whatsapp/k_.z:[Ljava/lang/String;
        //    67: bipush          23
        //    69: aaload         
        //    70: new             Ljava/lang/StringBuilder;
        //    73: dup            
        //    74: invokespecial   java/lang/StringBuilder.<init>:()V
        //    77: aload_0        
        //    78: invokevirtual   android/location/Location.getLatitude:()D
        //    81: invokevirtual   java/lang/StringBuilder.append:(D)Ljava/lang/StringBuilder;
        //    84: ldc             ","
        //    86: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    89: aload_0        
        //    90: invokevirtual   android/location/Location.getLongitude:()D
        //    93: invokevirtual   java/lang/StringBuilder.append:(D)Ljava/lang/StringBuilder;
        //    96: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    99: invokespecial   org/apache/http/message/BasicNameValuePair.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   102: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   107: pop            
        //   108: aload           7
        //   110: new             Lorg/apache/http/message/BasicNameValuePair;
        //   113: dup            
        //   114: getstatic       com/whatsapp/k_.z:[Ljava/lang/String;
        //   117: bipush          29
        //   119: aaload         
        //   120: iload_1        
        //   121: ldc_w           99999
        //   124: invokestatic    java/lang/Math.min:(II)I
        //   127: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //   130: invokespecial   org/apache/http/message/BasicNameValuePair.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   133: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   138: pop            
        //   139: aload           5
        //   141: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   144: ifne            170
        //   147: aload           7
        //   149: new             Lorg/apache/http/message/BasicNameValuePair;
        //   152: dup            
        //   153: getstatic       com/whatsapp/k_.z:[Ljava/lang/String;
        //   156: bipush          30
        //   158: aaload         
        //   159: aload           5
        //   161: invokespecial   org/apache/http/message/BasicNameValuePair.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   164: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   169: pop            
        //   170: new             Lorg/apache/http/params/BasicHttpParams;
        //   173: dup            
        //   174: invokespecial   org/apache/http/params/BasicHttpParams.<init>:()V
        //   177: astore          11
        //   179: aload           11
        //   181: sipush          15000
        //   184: invokestatic    org/apache/http/params/HttpConnectionParams.setConnectionTimeout:(Lorg/apache/http/params/HttpParams;I)V
        //   187: aload           11
        //   189: sipush          30000
        //   192: invokestatic    org/apache/http/params/HttpConnectionParams.setSoTimeout:(Lorg/apache/http/params/HttpParams;I)V
        //   195: aload           11
        //   197: invokestatic    com/whatsapp/m3.a:()Ljava/lang/String;
        //   200: invokestatic    org/apache/http/params/HttpProtocolParams.setUserAgent:(Lorg/apache/http/params/HttpParams;Ljava/lang/String;)V
        //   203: new             Lorg/apache/http/impl/client/DefaultHttpClient;
        //   206: dup            
        //   207: aload           11
        //   209: invokespecial   org/apache/http/impl/client/DefaultHttpClient.<init>:(Lorg/apache/http/params/HttpParams;)V
        //   212: new             Lorg/apache/http/client/methods/HttpGet;
        //   215: dup            
        //   216: new             Ljava/lang/StringBuilder;
        //   219: dup            
        //   220: invokespecial   java/lang/StringBuilder.<init>:()V
        //   223: getstatic       com/whatsapp/a6c.d:Ljava/lang/String;
        //   226: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   229: aload           7
        //   231: getstatic       com/whatsapp/k_.z:[Ljava/lang/String;
        //   234: bipush          28
        //   236: aaload         
        //   237: invokestatic    org/apache/http/client/utils/URLEncodedUtils.format:(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;
        //   240: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   243: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   246: invokespecial   org/apache/http/client/methods/HttpGet.<init>:(Ljava/lang/String;)V
        //   249: invokevirtual   org/apache/http/impl/client/DefaultHttpClient.execute:(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
        //   252: astore          12
        //   254: aload           12
        //   256: ifnonnull       283
        //   259: new             Ljava/io/IOException;
        //   262: dup            
        //   263: getstatic       com/whatsapp/k_.z:[Ljava/lang/String;
        //   266: bipush          24
        //   268: aaload         
        //   269: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   272: athrow         
        //   273: astore          24
        //   275: aload           24
        //   277: athrow         
        //   278: astore          8
        //   280: aload           8
        //   282: athrow         
        //   283: aload           12
        //   285: getstatic       com/whatsapp/k_.z:[Ljava/lang/String;
        //   288: bipush          25
        //   290: aaload         
        //   291: invokeinterface org/apache/http/HttpResponse.getFirstHeader:(Ljava/lang/String;)Lorg/apache/http/Header;
        //   296: astore          13
        //   298: aload           13
        //   300: ifnull          335
        //   303: new             Ljava/lang/StringBuilder;
        //   306: dup            
        //   307: invokespecial   java/lang/StringBuilder.<init>:()V
        //   310: getstatic       com/whatsapp/k_.z:[Ljava/lang/String;
        //   313: bipush          27
        //   315: aaload         
        //   316: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   319: aload           13
        //   321: invokeinterface org/apache/http/Header.getValue:()Ljava/lang/String;
        //   326: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   329: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   332: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   335: aload           12
        //   337: getstatic       com/whatsapp/k_.z:[Ljava/lang/String;
        //   340: bipush          31
        //   342: aaload         
        //   343: invokeinterface org/apache/http/HttpResponse.getFirstHeader:(Ljava/lang/String;)Lorg/apache/http/Header;
        //   348: astore          14
        //   350: aload           14
        //   352: ifnull          417
        //   355: aload           14
        //   357: invokeinterface org/apache/http/Header.getValue:()Ljava/lang/String;
        //   362: astore          19
        //   364: new             Ljava/lang/StringBuilder;
        //   367: dup            
        //   368: invokespecial   java/lang/StringBuilder.<init>:()V
        //   371: getstatic       com/whatsapp/k_.z:[Ljava/lang/String;
        //   374: bipush          26
        //   376: aaload         
        //   377: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   380: aload           19
        //   382: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   385: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   388: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   391: aload           19
        //   393: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   396: ifne            417
        //   399: aload           19
        //   401: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   404: istore          21
        //   406: iload           21
        //   408: ifne            417
        //   411: aload           6
        //   413: iconst_1       
        //   414: putfield        com/whatsapp/k_.p:Z
        //   417: aload           12
        //   419: invokeinterface org/apache/http/HttpResponse.getStatusLine:()Lorg/apache/http/StatusLine;
        //   424: invokeinterface org/apache/http/StatusLine.getStatusCode:()I
        //   429: sipush          200
        //   432: if_icmpne       489
        //   435: new             Lorg/json/JSONObject;
        //   438: dup            
        //   439: aload           12
        //   441: invokeinterface org/apache/http/HttpResponse.getEntity:()Lorg/apache/http/HttpEntity;
        //   446: invokestatic    org/apache/http/util/EntityUtils.toString:(Lorg/apache/http/HttpEntity;)Ljava/lang/String;
        //   449: invokespecial   org/json/JSONObject.<init>:(Ljava/lang/String;)V
        //   452: astore          15
        //   454: aload           6
        //   456: aload           15
        //   458: invokevirtual   com/whatsapp/k_.a:(Lorg/json/JSONObject;)V
        //   461: getstatic       com/whatsapp/k_.c:Ljava/util/ArrayList;
        //   464: aload           6
        //   466: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   469: pop            
        //   470: getstatic       com/whatsapp/k_.c:Ljava/util/ArrayList;
        //   473: invokevirtual   java/util/ArrayList.size:()I
        //   476: bipush          12
        //   478: if_icmple       489
        //   481: getstatic       com/whatsapp/k_.c:Ljava/util/ArrayList;
        //   484: iconst_0       
        //   485: invokevirtual   java/util/ArrayList.remove:(I)Ljava/lang/Object;
        //   488: pop            
        //   489: aload           6
        //   491: areturn        
        //   492: astore          23
        //   494: aload           23
        //   496: athrow         
        //   497: astore          22
        //   499: aload           22
        //   501: athrow         
        //   502: astore          20
        //   504: goto            417
        //   507: astore          16
        //   509: aload           16
        //   511: athrow         
        //   512: aload_3        
        //   513: astore          5
        //   515: goto            16
        //   518: aload_2        
        //   519: astore          4
        //   521: goto            8
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  58     170    278    283    Ljava/lang/NumberFormatException;
        //  259    273    273    278    Ljava/lang/NumberFormatException;
        //  303    335    492    497    Ljava/lang/NumberFormatException;
        //  399    406    502    507    Ljava/lang/NumberFormatException;
        //  411    417    497    502    Ljava/lang/NumberFormatException;
        //  454    489    507    512    Ljava/lang/NumberFormatException;
        //  499    502    502    507    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 225, Size: 225
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:210)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public int a(final PlaceInfo placeInfo) {
        return this.l.indexOf(placeInfo);
    }
    
    public PlaceInfo a(final int n) {
        return this.l.get(n);
    }
    
    public PlaceInfo a(final String s) {
        final boolean i = App.I;
        for (final PlaceInfo placeInfo : this.l) {
            try {
                if (s.equalsIgnoreCase(placeInfo.name)) {
                    return placeInfo;
                }
            }
            catch (NumberFormatException ex) {
                throw ex;
            }
            if (i) {
                break;
            }
        }
        return null;
    }
    
    public void a(final Location location) {
        final boolean i = App.I;
        for (final PlaceInfo placeInfo : this.l) {
            placeInfo.dist = placeInfo.getLocation().distanceTo(location);
            if (i) {
                break;
            }
        }
        Collections.sort((List<Object>)this.l, new j6(this));
    }
    
    public void a(final JSONObject jsonObject) {
        int n = 0;
        final boolean i = App.I;
        final JSONArray jsonArray = jsonObject.getJSONObject(k_.z[32]).getJSONArray(k_.z[33]);
    Label_0071_Outer:
        while (true) {
            if (n >= jsonArray.length()) {
                return;
            }
            while (true) {
                try {
                    final JSONObject jsonObject2 = jsonArray.getJSONObject(n);
                    final PlaceInfo placeInfo = new PlaceInfo();
                    placeInfo.fromJsonFoursquare(jsonObject2, false);
                    this.l.add(placeInfo);
                    ++n;
                    if (i) {
                        return;
                    }
                    continue Label_0071_Outer;
                }
                catch (JSONException ex) {
                    Log.b((Throwable)ex);
                    continue;
                }
                break;
            }
        }
    }
    
    public boolean a() {
        return this.l.isEmpty();
    }
    
    public PlaceInfo b(final String s) {
        final boolean i = App.I;
        for (final PlaceInfo placeInfo : this.l) {
            try {
                if (s.equalsIgnoreCase(placeInfo.placeId)) {
                    return placeInfo;
                }
            }
            catch (NumberFormatException ex) {
                throw ex;
            }
            if (i) {
                break;
            }
        }
        return null;
    }
    
    public void b(final JSONObject jsonObject) {
        int n = 0;
        final boolean i = App.I;
        final JSONArray jsonArray = jsonObject.getJSONArray(k_.z[34]);
    Label_0062_Outer:
        while (true) {
            if (n >= jsonArray.length()) {
                return;
            }
            while (true) {
                try {
                    final JSONObject jsonObject2 = jsonArray.getJSONObject(n);
                    final PlaceInfo placeInfo = new PlaceInfo();
                    placeInfo.fromJsonFacebook(jsonObject2, false);
                    this.l.add(placeInfo);
                    ++n;
                    if (i) {
                        return;
                    }
                    continue Label_0062_Outer;
                }
                catch (JSONException ex) {
                    Log.b((Throwable)ex);
                    continue;
                }
                break;
            }
        }
    }
    
    public boolean b() {
        return this.p;
    }
    
    public String c() {
        return this.h;
    }
    
    public void c(final JSONObject p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_0       
        //     1: istore_2       
        //     2: getstatic       com/whatsapp/App.I:Z
        //     5: istore_3       
        //     6: aload_1        
        //     7: getstatic       com/whatsapp/k_.z:[Ljava/lang/String;
        //    10: bipush          35
        //    12: aaload         
        //    13: invokevirtual   org/json/JSONObject.getJSONArray:(Ljava/lang/String;)Lorg/json/JSONArray;
        //    16: astore          4
        //    18: iconst_0       
        //    19: istore          5
        //    21: iload           5
        //    23: aload           4
        //    25: invokevirtual   org/json/JSONArray.length:()I
        //    28: if_icmpge       103
        //    31: aload           4
        //    33: iload           5
        //    35: invokevirtual   org/json/JSONArray.getJSONObject:(I)Lorg/json/JSONObject;
        //    38: astore          11
        //    40: new             Lcom/whatsapp/PlaceInfo;
        //    43: dup            
        //    44: invokespecial   com/whatsapp/PlaceInfo.<init>:()V
        //    47: astore          12
        //    49: aload           12
        //    51: aload           11
        //    53: iconst_0       
        //    54: invokevirtual   com/whatsapp/PlaceInfo.fromJsonGoogle:(Lorg/json/JSONObject;Z)V
        //    57: aload           12
        //    59: getfield        com/whatsapp/PlaceInfo.icon:Ljava/lang/String;
        //    62: ifnull          86
        //    65: aload           12
        //    67: getfield        com/whatsapp/PlaceInfo.icon:Ljava/lang/String;
        //    70: getstatic       com/whatsapp/k_.z:[Ljava/lang/String;
        //    73: bipush          37
        //    75: aaload         
        //    76: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //    79: istore          16
        //    81: iload           16
        //    83: ifne            96
        //    86: aload_0        
        //    87: getfield        com/whatsapp/k_.l:Ljava/util/ArrayList;
        //    90: aload           12
        //    92: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //    95: pop            
        //    96: iinc            5, 1
        //    99: iload_3        
        //   100: ifeq            21
        //   103: aload_1        
        //   104: getstatic       com/whatsapp/k_.z:[Ljava/lang/String;
        //   107: bipush          38
        //   109: aaload         
        //   110: invokevirtual   org/json/JSONObject.getJSONArray:(Ljava/lang/String;)Lorg/json/JSONArray;
        //   113: astore          7
        //   115: aload           7
        //   117: invokevirtual   org/json/JSONArray.length:()I
        //   120: ifle            213
        //   123: aload_0        
        //   124: ldc             ""
        //   126: putfield        com/whatsapp/k_.f:Ljava/lang/String;
        //   129: aload           7
        //   131: invokevirtual   org/json/JSONArray.length:()I
        //   134: istore          8
        //   136: iload_2        
        //   137: iload           8
        //   139: if_icmpge       213
        //   142: iload_2        
        //   143: ifle            176
        //   146: aload_0        
        //   147: new             Ljava/lang/StringBuilder;
        //   150: dup            
        //   151: invokespecial   java/lang/StringBuilder.<init>:()V
        //   154: aload_0        
        //   155: getfield        com/whatsapp/k_.f:Ljava/lang/String;
        //   158: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   161: getstatic       com/whatsapp/k_.z:[Ljava/lang/String;
        //   164: bipush          36
        //   166: aaload         
        //   167: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   170: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   173: putfield        com/whatsapp/k_.f:Ljava/lang/String;
        //   176: aload_0        
        //   177: new             Ljava/lang/StringBuilder;
        //   180: dup            
        //   181: invokespecial   java/lang/StringBuilder.<init>:()V
        //   184: aload_0        
        //   185: getfield        com/whatsapp/k_.f:Ljava/lang/String;
        //   188: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   191: aload           7
        //   193: iload_2        
        //   194: invokevirtual   org/json/JSONArray.getString:(I)Ljava/lang/String;
        //   197: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   200: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   203: putfield        com/whatsapp/k_.f:Ljava/lang/String;
        //   206: iinc            2, 1
        //   209: iload_3        
        //   210: ifeq            129
        //   213: return         
        //   214: astore          13
        //   216: aload           13
        //   218: athrow         
        //   219: astore          14
        //   221: aload           14
        //   223: athrow         
        //   224: astore          10
        //   226: aload           10
        //   228: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   231: goto            96
        //   234: astore          9
        //   236: aload           9
        //   238: athrow         
        //   239: astore          6
        //   241: aload           6
        //   243: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   246: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                    
        //  -----  -----  -----  -----  ------------------------
        //  31     49     224    234    Lorg/json/JSONException;
        //  49     81     214    219    Lorg/json/JSONException;
        //  86     96     219    224    Lorg/json/JSONException;
        //  103    129    239    247    Lorg/json/JSONException;
        //  129    136    239    247    Lorg/json/JSONException;
        //  146    176    234    239    Lorg/json/JSONException;
        //  176    206    239    247    Lorg/json/JSONException;
        //  216    219    219    224    Lorg/json/JSONException;
        //  221    224    224    234    Lorg/json/JSONException;
        //  236    239    239    247    Lorg/json/JSONException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0086:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2592)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:317)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:238)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:123)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public List d() {
        return this.l;
    }
    
    public int e() {
        return this.l.size();
    }
    
    public String f() {
        return this.f;
    }
    
    public int g() {
        return this.a;
    }
    
    public Location h() {
        Label_0033: {
            try {
                if (this.d == Double.MAX_VALUE) {
                    return null;
                }
                final k_ k_ = this;
                final double n = k_.e;
                final double n2 = Double.MAX_VALUE;
                final double n3 = dcmpl(n, n2);
                if (n3 == 0) {
                    return null;
                }
                break Label_0033;
            }
            catch (NumberFormatException ex) {
                throw ex;
            }
            try {
                final k_ k_ = this;
                final double n = k_.e;
                final double n2 = Double.MAX_VALUE;
                final double n3 = dcmpl(n, n2);
                if (n3 == 0) {
                    return null;
                }
            }
            catch (NumberFormatException ex2) {
                throw ex2;
            }
            try {
                if (this.j == null) {
                    (this.j = new Location("")).setLatitude(this.d);
                    this.j.setLongitude(this.e);
                }
                return this.j;
            }
            catch (NumberFormatException ex3) {
                throw ex3;
            }
        }
        return null;
    }
}
