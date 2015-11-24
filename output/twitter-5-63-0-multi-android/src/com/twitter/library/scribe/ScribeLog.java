// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.ByteArrayOutputStream;
import android.telephony.TelephonyManager;
import java.io.OutputStream;
import java.util.Collection;
import android.util.Log;
import com.twitter.internal.network.l;
import com.twitter.library.network.ae;
import android.content.Context;
import java.util.Iterator;
import java.util.Map;
import java.net.URLEncoder;
import com.fasterxml.jackson.core.JsonGenerator;
import java.util.List;
import android.os.Parcel;
import com.twitter.library.scribe.networkoperation.ClientNetworkOperation;
import java.util.HashMap;
import java.util.ArrayList;
import com.fasterxml.jackson.core.JsonFactory;
import com.twitter.eventreporter.b;
import android.os.Parcelable;

public abstract class ScribeLog implements Parcelable, b
{
    private static final JsonFactory e;
    private String A;
    private int B;
    private byte[] C;
    private String D;
    private String E;
    private String F;
    private String G;
    private String H;
    private String I;
    private String J;
    private String K;
    private String L;
    private String M;
    private int N;
    private int O;
    private ArrayList P;
    private ArrayList Q;
    private HashMap R;
    private int S;
    private String T;
    private String U;
    private String V;
    private String W;
    private String X;
    private String Y;
    private ClientNetworkOperation Z;
    protected String a;
    private String aa;
    protected int b;
    protected String c;
    protected int d;
    private final ArrayList f;
    private final ArrayList g;
    private final long h;
    private long i;
    private int j;
    private int k;
    private String l;
    private int m;
    private int n;
    private String o;
    private final long p;
    private int q;
    private String r;
    private String s;
    private String t;
    private String u;
    private ScribeLog$SearchDetails v;
    private int w;
    private String x;
    private String y;
    private String z;
    
    static {
        e = new JsonFactory();
    }
    
    public ScribeLog(final long p) {
        this.b = -1;
        this.d = Integer.MAX_VALUE;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.i = -1L;
        this.j = -1;
        this.k = -1;
        this.w = -1;
        this.N = -1;
        this.O = -1;
        this.S = -1;
        this.p = p;
        this.h = System.currentTimeMillis();
        this.q = -1;
        this.x = "client_event";
    }
    
    public ScribeLog(final Parcel parcel) {
        this.b = -1;
        this.d = Integer.MAX_VALUE;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.i = -1L;
        this.j = -1;
        this.k = -1;
        this.w = -1;
        this.N = -1;
        this.O = -1;
        this.S = -1;
        this.p = parcel.readLong();
        this.x = parcel.readString();
        this.K = parcel.readString();
        this.L = parcel.readString();
        this.h = parcel.readLong();
        this.o = parcel.readString();
        this.c = parcel.readString();
        this.M = parcel.readString();
        this.l = parcel.readString();
        this.m = parcel.readInt();
        this.n = parcel.readInt();
        this.i = parcel.readLong();
        this.j = parcel.readInt();
        this.k = parcel.readInt();
        this.q = parcel.readInt();
        this.r = parcel.readString();
        this.s = parcel.readString();
        this.a = parcel.readString();
        this.u = parcel.readString();
        this.w = parcel.readInt();
        this.y = parcel.readString();
        this.z = parcel.readString();
        this.A = parcel.readString();
        this.B = parcel.readInt();
        final int int1 = parcel.readInt();
        if (int1 != -1) {
            parcel.readByteArray(this.C = new byte[int1]);
        }
        this.D = parcel.readString();
        this.b = parcel.readInt();
        this.d = parcel.readInt();
        this.E = parcel.readString();
        this.F = parcel.readString();
        this.G = parcel.readString();
        this.H = parcel.readString();
        this.I = parcel.readString();
        this.J = parcel.readString();
        this.t = parcel.readString();
        parcel.readList((List)this.f, ScribeSection.class.getClassLoader());
        parcel.readList((List)this.g, ScribeItem.class.getClassLoader());
        parcel.readList((List)(this.Q = new ArrayList()), ScribeAssociation.class.getClassLoader());
        final int int2 = parcel.readInt();
        if (int2 > 0) {
            for (int i = 0; i < int2; ++i) {
                this.a(parcel.readString(), parcel.readString());
            }
        }
        this.S = parcel.readInt();
        this.Y = parcel.readString();
        this.T = parcel.readString();
        this.U = parcel.readString();
        this.V = parcel.readString();
        this.W = parcel.readString();
        this.X = parcel.readString();
        this.N = parcel.readInt();
        this.v = (ScribeLog$SearchDetails)parcel.readParcelable(ScribeLog$SearchDetails.class.getClassLoader());
        this.O = parcel.readInt();
        parcel.readList((List)(this.P = new ArrayList()), ScribeItem.class.getClassLoader());
        if (parcel.readByte() != 0) {
            this.Z = (ClientNetworkOperation)parcel.readParcelable(ClientNetworkOperation.class.getClassLoader());
        }
        this.aa = parcel.readString();
    }
    
    public static String a(final StringBuilder sb, final String... array) {
        int i = 0;
        if (array == null || array.length == 0) {
            return "";
        }
        if (array.length == 1) {
            return array[0];
        }
        sb.setLength(0);
        for (int length = array.length; i < length; ++i) {
            if (array[i] == null) {
                sb.append("");
            }
            else {
                sb.append(array[i]);
            }
            if (i < length - 1) {
                sb.append(':');
            }
        }
        return sb.toString();
    }
    
    public static String a(final String... array) {
        if (array == null || array.length == 0) {
            return "";
        }
        if (array.length == 1) {
            return array[0];
        }
        return a(new StringBuilder(), array);
    }
    
    private void b(final JsonGenerator jsonGenerator) {
        jsonGenerator.c();
        jsonGenerator.a("_category_", this.x);
        jsonGenerator.a("format_version", 2);
        if (this.r != null) {
            jsonGenerator.a("client_version", this.r);
        }
        if ("client_event".equals(this.x) || "app_download_client_event".equals(this.x) || "asset_prefetching_event".equals(this.x)) {
            if (this.L != null) {
                jsonGenerator.a("referring_event", "android:" + this.L);
            }
            if (this.K != null) {
                jsonGenerator.a("event_name", "android:" + this.K);
            }
            if (this.M != null) {
                jsonGenerator.a("limit_ad_tracking", Integer.parseInt(this.M));
            }
            jsonGenerator.a("ts", this.h);
            if (this.c != null) {
                jsonGenerator.a("server", this.c);
            }
            if (this.l != null) {
                jsonGenerator.a("protocol", this.l);
            }
            if (this.m >= 0) {
                jsonGenerator.a("stream_id", this.m);
            }
            if (this.n >= 0) {
                jsonGenerator.a("content_length", this.n);
            }
            if (this.i != -1L) {
                jsonGenerator.a("duration_ms", this.i);
            }
            if (this.j != -1) {
                jsonGenerator.a("status_code", this.j);
            }
            if (this.k != -1) {
                jsonGenerator.a("failure_type", this.k);
            }
            if (this.s != null) {
                jsonGenerator.a("message", this.s);
            }
            if (this.a != null) {
                jsonGenerator.a("event_info", this.a);
            }
            if (this.t != null) {
                jsonGenerator.a("event_value", this.t);
            }
            if (this.o != null) {
                jsonGenerator.a("url", this.o);
            }
            if (this.q != -1) {
                jsonGenerator.a("event_initiator", this.q);
            }
            if (this.u != null) {
                jsonGenerator.a("query", URLEncoder.encode(this.u, "UTF-8"));
            }
            if (this.w != -1) {
                jsonGenerator.a("position", this.w);
            }
            if (this.y != null) {
                jsonGenerator.a("context", this.y);
            }
            if (this.z != null) {
                jsonGenerator.a("profile_id", this.z);
            }
            if (this.D != null) {
                jsonGenerator.a("orientation", this.D);
            }
            if (this.b != -1) {
                jsonGenerator.a("network_status", this.b);
            }
            if (this.d != Integer.MAX_VALUE) {
                jsonGenerator.a("signal_strength", this.d);
            }
            if (this.E != null) {
                jsonGenerator.a("mobile_network_operator_iso_country_code", this.E);
            }
            if (this.F != null) {
                jsonGenerator.a("mobile_network_operator_code", this.F);
            }
            if (this.G != null) {
                jsonGenerator.a("mobile_network_operator_name", this.G);
            }
            if (this.H != null) {
                jsonGenerator.a("mobile_sim_provider_iso_country_code", this.H);
            }
            if (this.I != null) {
                jsonGenerator.a("mobile_sim_provider_code", this.I);
            }
            if (this.J != null) {
                jsonGenerator.a("mobile_sim_provider_name", this.J);
            }
            if (this.v != null) {
                this.v.a(jsonGenerator);
            }
            if (!this.g.isEmpty()) {
                jsonGenerator.d("items");
                final Iterator<ScribeItem> iterator = this.g.iterator();
                while (iterator.hasNext()) {
                    iterator.next().b(jsonGenerator);
                }
                jsonGenerator.b();
            }
            if (this.Q != null && !this.Q.isEmpty()) {
                jsonGenerator.e("associations");
                final Iterator<ScribeAssociation> iterator2 = this.Q.iterator();
                while (iterator2.hasNext()) {
                    iterator2.next().a(jsonGenerator);
                }
                jsonGenerator.d();
            }
            if (this.R != null) {
                jsonGenerator.e("external_ids");
                for (final Map.Entry<String, V> entry : this.R.entrySet()) {
                    jsonGenerator.a(entry.getKey(), (String)entry.getValue());
                }
                jsonGenerator.d();
            }
            if (this.S != -1) {
                jsonGenerator.a("referral_type", this.S);
            }
            if (this.T != null) {
                jsonGenerator.a("medium", this.T);
            }
            if (this.U != null) {
                jsonGenerator.a("campaign", this.U);
            }
            if (this.V != null) {
                jsonGenerator.a("query_term", this.V);
            }
            if (this.W != null) {
                jsonGenerator.a("campaign_content", this.W);
            }
            if (this.X != null) {
                jsonGenerator.a("gclid", this.X);
            }
            if (this.Y != null) {
                jsonGenerator.a("source", this.Y);
                jsonGenerator.a("external_referer", this.Y);
            }
            if (this.N != -1) {
                jsonGenerator.a("cursor_or_page", this.N);
            }
            if (this.O != -1) {
                jsonGenerator.a("item_count", this.O);
            }
            if (this.P != null && !this.P.isEmpty()) {
                jsonGenerator.d("targets");
                final Iterator<ScribeItem> iterator4 = this.P.iterator();
                while (iterator4.hasNext()) {
                    iterator4.next().b(jsonGenerator);
                }
                jsonGenerator.b();
            }
            if (this.aa != null) {
                jsonGenerator.a("website_dest_url", this.aa);
            }
        }
        else if ("client_watch_error".equals(this.x) && this.B > 0) {
            jsonGenerator.a("product_name", "android");
            switch (this.B) {
                case 1: {
                    jsonGenerator.a("type", "crash");
                    break;
                }
                case 2: {
                    jsonGenerator.a("type", "error");
                    break;
                }
            }
            jsonGenerator.a("error", this.A);
            if (this.C != null) {
                jsonGenerator.a("error_details", new String(this.C));
            }
        }
        else if ("client_network_operation_event".equals(this.x)) {
            this.Z.a(jsonGenerator);
        }
        final Iterator<ScribeSection> iterator5 = this.f.iterator();
        while (iterator5.hasNext()) {
            iterator5.next().a(jsonGenerator);
        }
        this.a(jsonGenerator);
        jsonGenerator.d();
    }
    
    public static String d() {
        return "android";
    }
    
    public ScribeLog a(final int j) {
        this.j = j;
        return this;
    }
    
    public ScribeLog a(final long n) {
        this.t = String.valueOf(n);
        return this;
    }
    
    public ScribeLog a(final Context context) {
        this.r = ae.a(context).h.toString();
        return this;
    }
    
    public ScribeLog a(final l l) {
        this.l = l.o + "-" + l.p;
        return this;
    }
    
    public ScribeLog a(final ScribeAssociation scribeAssociation) {
        if (scribeAssociation != null) {
            if (this.Q == null) {
                this.Q = new ArrayList();
            }
            this.Q.add(scribeAssociation);
        }
        return this;
    }
    
    public ScribeLog a(final ScribeItem scribeItem) {
        if (scribeItem != null) {
            this.g.add(scribeItem);
        }
        return this;
    }
    
    public ScribeLog a(final ScribeLog$SearchDetails v) {
        this.v = v;
        return this;
    }
    
    public ScribeLog a(final ScribeSection scribeSection) {
        this.x = "extended_media_details";
        this.f.add(scribeSection);
        return this;
    }
    
    public ScribeLog a(final String o) {
        this.o = o;
        return this;
    }
    
    public ScribeLog a(final String o, final l l) {
        this.o = o;
        this.c = l.q;
        this.j = l.a;
        this.i = l.e;
        this.q = 2;
        this.a(l);
        this.m = l.n;
        this.n = l.k;
        if (this.L == null && l.j != 0) {
            this.L = Integer.toString(l.j);
        }
        if (this.s == null || this.s.length() == 0) {
            final int n = l.t[1] + l.t[2] + l.t[3] + l.t[4];
            this.c(String.format("old_duration:%d,new_duration:%d,new_execute:%d", this.i, n, n + l.t[5] + l.t[6]));
        }
        return this;
    }
    
    public ScribeLog a(final String s, final String s2) {
        if (this.R == null) {
            this.R = new HashMap();
        }
        this.R.put(s, s2);
        return this;
    }
    
    public ScribeLog a(final String y, final String t, final String u, final String v, final String w, final String x, final String s) {
        this.S = 3;
        this.Y = y;
        this.T = t;
        this.U = u;
        this.V = v;
        this.W = w;
        this.X = x;
        this.s = s;
        return this;
    }
    
    public ScribeLog a(final String s, final String s2, final boolean b, final boolean b2) {
        this.v = new ScribeLog$SearchDetails(s, s2, null, b, b2);
        return this;
    }
    
    public ScribeLog a(final Throwable t, final int b, final String a, final String r) {
        this.x = "client_watch_error";
        this.B = b;
        this.A = t.getClass().getSimpleName();
        this.C = Log.getStackTraceString(t).getBytes();
        this.a = a;
        this.r = r;
        return this;
    }
    
    public ScribeLog a(final ArrayList list) {
        if (list != null) {
            this.g.addAll(list);
        }
        return this;
    }
    
    public ScribeLog a(final boolean b) {
        String m;
        if (b) {
            m = "1";
        }
        else {
            m = "0";
        }
        this.M = m;
        return this;
    }
    
    public String a() {
        return this.K;
    }
    
    protected abstract void a(final JsonGenerator p0);
    
    public void a(final OutputStream p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore_2       
        //     2: new             Ljava/io/OutputStreamWriter;
        //     5: dup            
        //     6: aload_1        
        //     7: invokespecial   java/io/OutputStreamWriter.<init>:(Ljava/io/OutputStream;)V
        //    10: astore_3       
        //    11: getstatic       com/twitter/library/scribe/ScribeLog.e:Lcom/fasterxml/jackson/core/JsonFactory;
        //    14: aload_1        
        //    15: invokevirtual   com/fasterxml/jackson/core/JsonFactory.a:(Ljava/io/OutputStream;)Lcom/fasterxml/jackson/core/JsonGenerator;
        //    18: astore          8
        //    20: aload           8
        //    22: astore_2       
        //    23: aload_0        
        //    24: aload_2        
        //    25: invokespecial   com/twitter/library/scribe/ScribeLog.b:(Lcom/fasterxml/jackson/core/JsonGenerator;)V
        //    28: aload_2        
        //    29: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.flush:()V
        //    32: aload_2        
        //    33: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    36: aload_3        
        //    37: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    40: return         
        //    41: astore          10
        //    43: aconst_null    
        //    44: astore_3       
        //    45: aload_2        
        //    46: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    49: aload_3        
        //    50: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    53: return         
        //    54: astore          6
        //    56: aconst_null    
        //    57: astore          7
        //    59: aload           7
        //    61: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    64: aload_2        
        //    65: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    68: aload           6
        //    70: athrow         
        //    71: astore          5
        //    73: aload_3        
        //    74: astore_2       
        //    75: aload           5
        //    77: astore          6
        //    79: aconst_null    
        //    80: astore          7
        //    82: goto            59
        //    85: astore          9
        //    87: aload_2        
        //    88: astore          7
        //    90: aload_3        
        //    91: astore_2       
        //    92: aload           9
        //    94: astore          6
        //    96: goto            59
        //    99: astore          4
        //   101: goto            45
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  2      11     41     45     Ljava/io/IOException;
        //  2      11     54     59     Any
        //  11     20     99     104    Ljava/io/IOException;
        //  11     20     71     85     Any
        //  23     32     99     104    Ljava/io/IOException;
        //  23     32     85     99     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0045:
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
    
    public long b() {
        return this.p;
    }
    
    public ScribeLog b(final int k) {
        this.k = k;
        return this;
    }
    
    public ScribeLog b(final long i) {
        this.i = i;
        return this;
    }
    
    public ScribeLog b(final Context context) {
        final TelephonyManager telephonyManager = (TelephonyManager)context.getSystemService("phone");
        this.E = telephonyManager.getNetworkCountryIso();
        this.F = telephonyManager.getNetworkOperator();
        this.G = telephonyManager.getNetworkOperatorName();
        this.H = telephonyManager.getSimCountryIso();
        this.I = telephonyManager.getSimOperator();
        this.J = telephonyManager.getSimOperatorName();
        return this;
    }
    
    public ScribeLog b(final ScribeItem scribeItem) {
        if (scribeItem != null) {
            if (this.P == null) {
                this.P = new ArrayList();
            }
            this.P.add(scribeItem);
        }
        return this;
    }
    
    public ScribeLog b(final String r) {
        this.r = r;
        return this;
    }
    
    public ScribeLog b(final String o, final String s) {
        this.o = o;
        this.s = s;
        return this;
    }
    
    public ScribeLog b(final ArrayList list) {
        this.q = 2;
        if (list != null) {
            final Iterator<ScribeItem> iterator = list.iterator();
            while (iterator.hasNext()) {
                this.a(iterator.next());
            }
        }
        return this;
    }
    
    public ScribeLog b(final String... array) {
        this.K = a(array);
        return this;
    }
    
    public ScribeItem c() {
        if (this.g.size() > 0) {
            return this.g.get(0);
        }
        return null;
    }
    
    public ScribeLog c(final int q) {
        this.q = q;
        return this;
    }
    
    public ScribeLog c(final String s) {
        this.s = s;
        return this;
    }
    
    public ScribeLog c(final String... array) {
        this.L = a(array);
        return this;
    }
    
    public ScribeLog d(final int w) {
        this.w = w;
        return this;
    }
    
    public ScribeLog d(final String a) {
        this.a = a;
        return this;
    }
    
    public ScribeLog e(final int n) {
        this.N = n;
        return this;
    }
    
    public ScribeLog e(final String u) {
        this.u = u;
        return this;
    }
    
    public ScribeLog f(final int o) {
        this.O = o;
        return this;
    }
    
    public ScribeLog f(final String x) {
        this.x = x;
        return this;
    }
    
    public ScribeLog g(final String y) {
        this.y = y;
        return this;
    }
    
    public ScribeLog h(final String z) {
        this.z = z;
        return this;
    }
    
    public ScribeLog i(final String d) {
        this.D = d;
        return this;
    }
    
    public ScribeLog j(final String aa) {
        this.aa = aa;
        return this;
    }
    
    @Override
    public String toString() {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.a(byteArrayOutputStream);
        return byteArrayOutputStream.toString();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeLong(this.p);
        parcel.writeString(this.x);
        parcel.writeString(this.K);
        parcel.writeString(this.L);
        parcel.writeLong(this.h);
        parcel.writeString(this.o);
        parcel.writeString(this.c);
        parcel.writeString(this.M);
        parcel.writeString(this.l);
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
        parcel.writeLong(this.i);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.q);
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.a);
        parcel.writeString(this.u);
        parcel.writeInt(this.w);
        parcel.writeString(this.y);
        parcel.writeString(this.z);
        parcel.writeString(this.A);
        parcel.writeInt(this.B);
        if (this.C != null) {
            parcel.writeInt(this.C.length);
            parcel.writeByteArray(this.C);
        }
        else {
            parcel.writeInt(-1);
        }
        parcel.writeString(this.D);
        parcel.writeInt(this.b);
        parcel.writeInt(this.d);
        parcel.writeString(this.E);
        parcel.writeString(this.F);
        parcel.writeString(this.G);
        parcel.writeString(this.H);
        parcel.writeString(this.I);
        parcel.writeString(this.J);
        parcel.writeString(this.t);
        parcel.writeList((List)this.f);
        parcel.writeList((List)this.g);
        parcel.writeList((List)this.Q);
        if (this.R != null) {
            parcel.writeInt(this.R.size());
            for (final Map.Entry<String, V> entry : this.R.entrySet()) {
                parcel.writeString((String)entry.getKey());
                parcel.writeString((String)entry.getValue());
            }
        }
        else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.S);
        parcel.writeString(this.Y);
        parcel.writeString(this.T);
        parcel.writeString(this.U);
        parcel.writeString(this.V);
        parcel.writeString(this.W);
        parcel.writeString(this.X);
        parcel.writeInt(this.N);
        parcel.writeParcelable((Parcelable)this.v, n);
        parcel.writeInt(this.O);
        parcel.writeList((List)this.P);
        wv.a(parcel, this.Z);
        if (this.Z != null) {
            parcel.writeParcelable((Parcelable)this.Z, n);
        }
        parcel.writeString(this.aa);
    }
}
