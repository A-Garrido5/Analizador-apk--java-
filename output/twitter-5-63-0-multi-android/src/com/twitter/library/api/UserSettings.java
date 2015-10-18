// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import android.util.Pair;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class UserSettings implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public long a;
    public String b;
    public boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final String h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public String m;
    public String n;
    public boolean o;
    public String p;
    public boolean q;
    public String r;
    public boolean s;
    
    static {
        CREATOR = (Parcelable$Creator)new cc();
    }
    
    public UserSettings(final Parcel parcel) {
        boolean q = true;
        this.c = (parcel.readInt() == (q ? 1 : 0) && q);
        this.d = (parcel.readInt() == (q ? 1 : 0) && q);
        this.a = parcel.readLong();
        this.b = parcel.readString();
        this.e = (parcel.readInt() == (q ? 1 : 0) && q);
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readString();
        this.j = (parcel.readInt() == (q ? 1 : 0) && q);
        this.i = (parcel.readInt() == (q ? 1 : 0) && q);
        this.k = (parcel.readInt() == (q ? 1 : 0) && q);
        this.l = (parcel.readInt() == (q ? 1 : 0) && q);
        this.m = parcel.readString();
        this.n = parcel.readString();
        this.o = (parcel.readInt() == (q ? 1 : 0) && q);
        this.p = parcel.readString();
        this.s = (parcel.readInt() == (q ? 1 : 0) && q);
        if (parcel.readInt() != (q ? 1 : 0)) {
            q = false;
        }
        this.q = q;
        this.r = parcel.readString();
    }
    
    private UserSettings(final boolean c, final long a, final String b, final boolean e, final int f, final int g, final String h, final boolean d, final boolean j, final boolean i, final boolean k, final boolean l, final String m, final String n, final boolean o, final String p19, final boolean s, final boolean q, final String r) {
        this.c = c;
        this.d = d;
        this.a = a;
        this.b = b;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.j = j;
        this.i = i;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p19;
        this.s = s;
        this.q = q;
        this.r = r;
    }
    
    public static UserSettings a(final JsonParser jsonParser) {
        if (jsonParser == null) {
            return null;
        }
        while (true) {
            boolean b = false;
            boolean b2 = true;
            long longValue = 1L;
            String s = null;
            boolean b3 = false;
            boolean b4 = false;
            int n = 0;
            int n2 = 0;
            String g = null;
            boolean b5 = false;
            boolean b6 = false;
            boolean b7 = false;
            boolean b8 = false;
            String g2 = null;
            String g3 = null;
            boolean b9 = false;
            boolean b10 = true;
            String g4 = null;
        Label_0834:
            while (true) {
            Label_0124:
                while (true) {
                    boolean b20 = false;
                Label_0821:
                    while (true) {
                        Label_0828: {
                            boolean b19 = false;
                        Label_0808:
                            while (true) {
                                Label_0815: {
                                    boolean b18 = false;
                                Label_0795:
                                    while (true) {
                                        Label_0802: {
                                            boolean b17 = false;
                                        Label_0782:
                                            while (true) {
                                                Label_0789: {
                                                    boolean b16 = false;
                                                Label_0769:
                                                    while (true) {
                                                        Label_0776: {
                                                            boolean b15 = false;
                                                        Label_0756:
                                                            while (true) {
                                                                Label_0763: {
                                                                    boolean b14 = false;
                                                                Label_0744:
                                                                    while (true) {
                                                                        Label_0750: {
                                                                            boolean b13 = false;
                                                                        Label_0732:
                                                                            while (true) {
                                                                                Label_0738: {
                                                                                    boolean b12;
                                                                                    try {
                                                                                        for (JsonToken jsonToken = jsonParser.a(); jsonToken != JsonToken.c; jsonToken = jsonParser.a()) {
                                                                                            final String e = jsonParser.e();
                                                                                            switch (cd.a[jsonToken.ordinal()]) {
                                                                                                case 4: {
                                                                                                    if ("sleep_time".equals(e)) {
                                                                                                        final JsonToken a = jsonParser.a();
                                                                                                        int h = n2;
                                                                                                        JsonToken a2 = a;
                                                                                                        final int n3 = n;
                                                                                                        boolean l = b3;
                                                                                                        int h2 = n3;
                                                                                                        while (a2 != null && a2 != JsonToken.c) {
                                                                                                            switch (cd.a[a2.ordinal()]) {
                                                                                                                case 1:
                                                                                                                case 2: {
                                                                                                                    if ("enabled".equals(jsonParser.e())) {
                                                                                                                        l = jsonParser.l();
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                }
                                                                                                                case 3: {
                                                                                                                    final String e2 = jsonParser.e();
                                                                                                                    if ("start_time".equals(e2)) {
                                                                                                                        h2 = jsonParser.h();
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    if ("end_time".equals(e2)) {
                                                                                                                        h = jsonParser.h();
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                }
                                                                                                                case 4:
                                                                                                                case 5: {
                                                                                                                    jsonParser.c();
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
                                                                                                            a2 = jsonParser.a();
                                                                                                        }
                                                                                                        n2 = h;
                                                                                                        final int n4 = h2;
                                                                                                        b3 = l;
                                                                                                        n = n4;
                                                                                                        break;
                                                                                                    }
                                                                                                    jsonParser.c();
                                                                                                    break;
                                                                                                }
                                                                                                case 5: {
                                                                                                    if ("trend_location".equals(e)) {
                                                                                                        final Pair b11 = b(jsonParser);
                                                                                                        longValue = (long)b11.first;
                                                                                                        s = (String)b11.second;
                                                                                                        break;
                                                                                                    }
                                                                                                    jsonParser.c();
                                                                                                    break;
                                                                                                }
                                                                                                case 1:
                                                                                                case 2: {
                                                                                                    if ("geo_enabled".equals(e)) {
                                                                                                        if (jsonToken == JsonToken.k) {
                                                                                                            b12 = true;
                                                                                                            break Label_0732;
                                                                                                        }
                                                                                                        break Label_0738;
                                                                                                    }
                                                                                                    else if ("use_cookie_personalization".equals(e)) {
                                                                                                        if (jsonToken == JsonToken.k) {
                                                                                                            b13 = true;
                                                                                                            break Label_0744;
                                                                                                        }
                                                                                                        break Label_0750;
                                                                                                    }
                                                                                                    else if ("discoverable_by_email".equals(e)) {
                                                                                                        if (jsonToken == JsonToken.k) {
                                                                                                            b14 = true;
                                                                                                            break Label_0756;
                                                                                                        }
                                                                                                        break Label_0763;
                                                                                                    }
                                                                                                    else if ("protected".equals(e)) {
                                                                                                        if (jsonToken == JsonToken.k) {
                                                                                                            b15 = true;
                                                                                                            break Label_0769;
                                                                                                        }
                                                                                                        break Label_0776;
                                                                                                    }
                                                                                                    else if ("display_sensitive_media".equals(e)) {
                                                                                                        if (jsonToken == JsonToken.k) {
                                                                                                            b16 = true;
                                                                                                            break Label_0782;
                                                                                                        }
                                                                                                        break Label_0789;
                                                                                                    }
                                                                                                    else if ("personalized_trends".equals(e)) {
                                                                                                        if (jsonToken == JsonToken.k) {
                                                                                                            b17 = true;
                                                                                                            break Label_0795;
                                                                                                        }
                                                                                                        break Label_0802;
                                                                                                    }
                                                                                                    else if ("discoverable_by_mobile_phone".equals(e)) {
                                                                                                        if (jsonToken == JsonToken.k) {
                                                                                                            b18 = true;
                                                                                                            break Label_0808;
                                                                                                        }
                                                                                                        break Label_0815;
                                                                                                    }
                                                                                                    else if ("email_follow_enabled".equals(e)) {
                                                                                                        if (jsonToken == JsonToken.k) {
                                                                                                            b19 = true;
                                                                                                            break Label_0821;
                                                                                                        }
                                                                                                        break Label_0828;
                                                                                                    }
                                                                                                    else {
                                                                                                        if (!"allow_ads_personalization".equals(e)) {
                                                                                                            break;
                                                                                                        }
                                                                                                        if (jsonToken == JsonToken.k) {
                                                                                                            b20 = true;
                                                                                                            break Label_0834;
                                                                                                        }
                                                                                                        break Label_0124;
                                                                                                    }
                                                                                                    break;
                                                                                                }
                                                                                                case 6: {
                                                                                                    if ("language".equals(jsonParser.e())) {
                                                                                                        g = jsonParser.g();
                                                                                                        break;
                                                                                                    }
                                                                                                    if ("screen_name".equals(jsonParser.e())) {
                                                                                                        g2 = jsonParser.g();
                                                                                                        break;
                                                                                                    }
                                                                                                    if ("allow_media_tagging".equals(jsonParser.e())) {
                                                                                                        g3 = jsonParser.g();
                                                                                                        break;
                                                                                                    }
                                                                                                    if ("allow_dms_from".equals(jsonParser.e())) {
                                                                                                        g4 = jsonParser.g();
                                                                                                        break;
                                                                                                    }
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        return new UserSettings(b, longValue, s, b3, n, n2, g, b2, b5, b6, b7, b8, g2, g3, b9, null, b4, b10, g4);
                                                                                    }
                                                                                    catch (IOException ex) {
                                                                                        return null;
                                                                                    }
                                                                                    b = b12;
                                                                                    continue Label_0124;
                                                                                }
                                                                                boolean b12 = false;
                                                                                continue Label_0732;
                                                                            }
                                                                            b2 = b13;
                                                                            continue Label_0124;
                                                                        }
                                                                        boolean b13 = false;
                                                                        continue Label_0744;
                                                                    }
                                                                    b6 = b14;
                                                                    continue Label_0124;
                                                                }
                                                                boolean b14 = false;
                                                                continue Label_0756;
                                                            }
                                                            b5 = b15;
                                                            continue Label_0124;
                                                        }
                                                        boolean b15 = false;
                                                        continue Label_0769;
                                                    }
                                                    b7 = b16;
                                                    continue Label_0124;
                                                }
                                                boolean b16 = false;
                                                continue Label_0782;
                                            }
                                            b4 = b17;
                                            continue Label_0124;
                                        }
                                        boolean b17 = false;
                                        continue Label_0795;
                                    }
                                    b8 = b18;
                                    continue Label_0124;
                                }
                                boolean b18 = false;
                                continue Label_0808;
                            }
                            b9 = b19;
                            continue Label_0124;
                        }
                        boolean b19 = false;
                        continue Label_0821;
                    }
                    b10 = b20;
                    continue Label_0124;
                }
                boolean b20 = false;
                continue Label_0834;
            }
        }
    }
    
    public static UserSettings a(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: ifnonnull       6
        //     4: aconst_null    
        //     5: areturn        
        //     6: getstatic       com/twitter/library/api/bh.a:Lcom/fasterxml/jackson/core/JsonFactory;
        //     9: aload_0        
        //    10: invokevirtual   com/fasterxml/jackson/core/JsonFactory.b:(Ljava/lang/String;)Lcom/fasterxml/jackson/core/JsonParser;
        //    13: astore          5
        //    15: aload           5
        //    17: astore_2       
        //    18: aload_2        
        //    19: invokevirtual   com/fasterxml/jackson/core/JsonParser.a:()Lcom/fasterxml/jackson/core/JsonToken;
        //    22: pop            
        //    23: aload_2        
        //    24: invokestatic    com/twitter/library/api/UserSettings.a:(Lcom/fasterxml/jackson/core/JsonParser;)Lcom/twitter/library/api/UserSettings;
        //    27: astore          8
        //    29: aload_2        
        //    30: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    33: aload           8
        //    35: areturn        
        //    36: astore          4
        //    38: aconst_null    
        //    39: astore_2       
        //    40: aload_2        
        //    41: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    44: aconst_null    
        //    45: areturn        
        //    46: astore_1       
        //    47: aconst_null    
        //    48: astore_2       
        //    49: aload_1        
        //    50: astore_3       
        //    51: aload_2        
        //    52: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    55: aload_3        
        //    56: athrow         
        //    57: astore_3       
        //    58: goto            51
        //    61: astore          6
        //    63: goto            40
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  6      15     36     40     Ljava/io/IOException;
        //  6      15     46     51     Any
        //  18     29     61     66     Ljava/io/IOException;
        //  18     29     57     61     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0040:
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
    
    private static String a(final int n) {
        if (n >= 10) {
            return String.valueOf(n);
        }
        return String.format("0%d", n);
    }
    
    private static Pair b(final JsonParser jsonParser) {
        JsonToken jsonToken = jsonParser.d();
        long i = 1L;
        Object g = null;
        while (jsonToken != JsonToken.e) {
            if (jsonToken == JsonToken.b) {
                for (JsonToken jsonToken2 = jsonParser.a(); jsonToken2 != JsonToken.c; jsonToken2 = jsonParser.a()) {
                    switch (cd.a[jsonToken2.ordinal()]) {
                        case 3: {
                            if ("woeid".equals(jsonParser.e())) {
                                i = jsonParser.i();
                                break;
                            }
                            break;
                        }
                        case 6: {
                            if ("name".equals(jsonParser.e())) {
                                g = jsonParser.g();
                                break;
                            }
                            break;
                        }
                        case 4:
                        case 5: {
                            jsonParser.c();
                            break;
                        }
                    }
                }
            }
            jsonToken = jsonParser.a();
        }
        return new Pair((Object)i, g);
    }
    
    public String a() {
        return a(this.f);
    }
    
    public String b() {
        return a(this.g);
    }
    
    public boolean c() {
        return this.c;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public String toString() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Ljava/io/StringWriter;
        //     3: dup            
        //     4: sipush          512
        //     7: invokespecial   java/io/StringWriter.<init>:(I)V
        //    10: astore_1       
        //    11: getstatic       com/twitter/library/api/bh.a:Lcom/fasterxml/jackson/core/JsonFactory;
        //    14: aload_1        
        //    15: invokevirtual   com/fasterxml/jackson/core/JsonFactory.b:(Ljava/io/Writer;)Lcom/fasterxml/jackson/core/JsonGenerator;
        //    18: astore          6
        //    20: aload           6
        //    22: astore_3       
        //    23: aload_3        
        //    24: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.c:()V
        //    27: aload_3        
        //    28: ldc             "sleep_time"
        //    30: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.e:(Ljava/lang/String;)V
        //    33: aload_3        
        //    34: ldc             "start_time"
        //    36: aload_0        
        //    37: getfield        com/twitter/library/api/UserSettings.f:I
        //    40: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.a:(Ljava/lang/String;I)V
        //    43: aload_3        
        //    44: ldc             "enabled"
        //    46: aload_0        
        //    47: getfield        com/twitter/library/api/UserSettings.e:Z
        //    50: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.a:(Ljava/lang/String;Z)V
        //    53: aload_3        
        //    54: ldc             "end_time"
        //    56: aload_0        
        //    57: getfield        com/twitter/library/api/UserSettings.g:I
        //    60: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.a:(Ljava/lang/String;I)V
        //    63: aload_3        
        //    64: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.d:()V
        //    67: aload_3        
        //    68: ldc             "geo_enabled"
        //    70: aload_0        
        //    71: getfield        com/twitter/library/api/UserSettings.c:Z
        //    74: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.a:(Ljava/lang/String;Z)V
        //    77: aload_3        
        //    78: ldc             "use_cookie_personalization"
        //    80: aload_0        
        //    81: getfield        com/twitter/library/api/UserSettings.d:Z
        //    84: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.a:(Ljava/lang/String;Z)V
        //    87: aload_3        
        //    88: ldc             "protected"
        //    90: aload_0        
        //    91: getfield        com/twitter/library/api/UserSettings.j:Z
        //    94: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.a:(Ljava/lang/String;Z)V
        //    97: aload_3        
        //    98: ldc             "discoverable_by_email"
        //   100: aload_0        
        //   101: getfield        com/twitter/library/api/UserSettings.i:Z
        //   104: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.a:(Ljava/lang/String;Z)V
        //   107: aload_3        
        //   108: ldc             "display_sensitive_media"
        //   110: aload_0        
        //   111: getfield        com/twitter/library/api/UserSettings.k:Z
        //   114: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.a:(Ljava/lang/String;Z)V
        //   117: aload_3        
        //   118: ldc             "discoverable_by_mobile_phone"
        //   120: aload_0        
        //   121: getfield        com/twitter/library/api/UserSettings.l:Z
        //   124: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.a:(Ljava/lang/String;Z)V
        //   127: aload_3        
        //   128: ldc             "personalized_trends"
        //   130: aload_0        
        //   131: getfield        com/twitter/library/api/UserSettings.s:Z
        //   134: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.a:(Ljava/lang/String;Z)V
        //   137: aload_3        
        //   138: ldc             "trend_location"
        //   140: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.d:(Ljava/lang/String;)V
        //   143: aload_3        
        //   144: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.c:()V
        //   147: aload_3        
        //   148: ldc             "woeid"
        //   150: aload_0        
        //   151: getfield        com/twitter/library/api/UserSettings.a:J
        //   154: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.a:(Ljava/lang/String;J)V
        //   157: aload_3        
        //   158: ldc             "name"
        //   160: aload_0        
        //   161: getfield        com/twitter/library/api/UserSettings.b:Ljava/lang/String;
        //   164: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   167: aload_3        
        //   168: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.d:()V
        //   171: aload_3        
        //   172: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.b:()V
        //   175: aload_3        
        //   176: ldc             "language"
        //   178: aload_0        
        //   179: getfield        com/twitter/library/api/UserSettings.h:Ljava/lang/String;
        //   182: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   185: aload_3        
        //   186: ldc             "screen_name"
        //   188: aload_0        
        //   189: getfield        com/twitter/library/api/UserSettings.m:Ljava/lang/String;
        //   192: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   195: aload_3        
        //   196: ldc             "allow_media_tagging"
        //   198: aload_0        
        //   199: getfield        com/twitter/library/api/UserSettings.n:Ljava/lang/String;
        //   202: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   205: aload_3        
        //   206: ldc             "email_follow_enabled"
        //   208: aload_0        
        //   209: getfield        com/twitter/library/api/UserSettings.o:Z
        //   212: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.a:(Ljava/lang/String;Z)V
        //   215: aload_3        
        //   216: ldc             "allow_ads_personalization"
        //   218: aload_0        
        //   219: getfield        com/twitter/library/api/UserSettings.q:Z
        //   222: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.a:(Ljava/lang/String;Z)V
        //   225: aload_3        
        //   226: ldc             "allow_dms_from"
        //   228: aload_0        
        //   229: getfield        com/twitter/library/api/UserSettings.r:Ljava/lang/String;
        //   232: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   235: aload_3        
        //   236: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.d:()V
        //   239: aload_3        
        //   240: invokevirtual   com/fasterxml/jackson/core/JsonGenerator.flush:()V
        //   243: aload_1        
        //   244: invokevirtual   java/io/StringWriter.toString:()Ljava/lang/String;
        //   247: astore          8
        //   249: aload_3        
        //   250: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   253: aload           8
        //   255: areturn        
        //   256: astore          5
        //   258: aconst_null    
        //   259: astore_3       
        //   260: aload_3        
        //   261: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   264: ldc_w           ""
        //   267: areturn        
        //   268: astore_2       
        //   269: aconst_null    
        //   270: astore_3       
        //   271: aload_2        
        //   272: astore          4
        //   274: aload_3        
        //   275: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   278: aload           4
        //   280: athrow         
        //   281: astore          4
        //   283: goto            274
        //   286: astore          7
        //   288: goto            260
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      20     256    260    Ljava/io/IOException;
        //  0      20     268    274    Any
        //  23     249    286    291    Ljava/io/IOException;
        //  23     249    281    286    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0260:
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
    
    public void writeToParcel(final Parcel parcel, final int n) {
        int n2 = 1;
        int n3;
        if (this.c) {
            n3 = n2;
        }
        else {
            n3 = 0;
        }
        parcel.writeInt(n3);
        int n4;
        if (this.d) {
            n4 = n2;
        }
        else {
            n4 = 0;
        }
        parcel.writeInt(n4);
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        int n5;
        if (this.e) {
            n5 = n2;
        }
        else {
            n5 = 0;
        }
        parcel.writeInt(n5);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeString(this.h);
        int n6;
        if (this.j) {
            n6 = n2;
        }
        else {
            n6 = 0;
        }
        parcel.writeInt(n6);
        int n7;
        if (this.i) {
            n7 = n2;
        }
        else {
            n7 = 0;
        }
        parcel.writeInt(n7);
        int n8;
        if (this.k) {
            n8 = n2;
        }
        else {
            n8 = 0;
        }
        parcel.writeInt(n8);
        int n9;
        if (this.l) {
            n9 = n2;
        }
        else {
            n9 = 0;
        }
        parcel.writeInt(n9);
        parcel.writeString(this.m);
        parcel.writeString(this.n);
        int n10;
        if (this.o) {
            n10 = n2;
        }
        else {
            n10 = 0;
        }
        parcel.writeInt(n10);
        parcel.writeString(this.p);
        int n11;
        if (this.s) {
            n11 = n2;
        }
        else {
            n11 = 0;
        }
        parcel.writeInt(n11);
        if (!this.q) {
            n2 = 0;
        }
        parcel.writeInt(n2);
        parcel.writeString(this.r);
    }
}
