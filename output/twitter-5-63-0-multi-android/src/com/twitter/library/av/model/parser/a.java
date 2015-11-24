// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.model.parser;

import com.twitter.internal.network.l;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import android.util.Pair;
import com.twitter.library.av.model.Audio;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonParser;
import android.content.Context;
import com.twitter.library.av.model.AudioPlaylist;
import com.twitter.internal.network.j;

public class a implements j
{
    public AudioPlaylist a;
    private final Context b;
    
    public a(final Context context) {
        this.b = context.getApplicationContext();
    }
    
    private AudioPlaylist a(final JsonParser jsonParser) {
        String g = null;
        JsonToken jsonToken = jsonParser.a();
        Audio[] b = null;
        String g2 = null;
        String g3 = null;
        Pair i = null;
        while (jsonToken != null) {
            switch (com.twitter.library.av.model.parser.b.a[jsonToken.ordinal()]) {
                case 1: {
                    if ("error".equalsIgnoreCase(g)) {
                        i = i(jsonParser);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 2: {
                    if ("tracks".equalsIgnoreCase(g)) {
                        b = b(jsonParser);
                        break;
                    }
                    jsonParser.c();
                    break;
                }
                case 3: {
                    if ("uuid".equalsIgnoreCase(g)) {
                        g3 = jsonParser.g();
                        break;
                    }
                    if ("title".equalsIgnoreCase(g)) {
                        g2 = jsonParser.g();
                        break;
                    }
                    break;
                }
                case 4: {
                    g = jsonParser.g();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        if (i != null) {
            final int identifier = this.b.getResources().getIdentifier("av_partner_error_" + (String)i.first, "string", this.b.getPackageName());
            int av_playlist_download_failed;
            if (identifier == 0) {
                av_playlist_download_failed = lg.av_playlist_download_failed;
            }
            else {
                av_playlist_download_failed = identifier;
            }
            return new AudioPlaylist(av_playlist_download_failed, (String)i.second);
        }
        if (b != null) {
            for (int length = b.length, j = 0; j < length; ++j) {
                if (b[j].a() == null) {
                    return new AudioPlaylist(lg.av_playlist_download_failed, "Missing progressive bitrate source.");
                }
            }
            return new AudioPlaylist(g3, g2, b);
        }
        return new AudioPlaylist(lg.av_playlist_download_failed, "No tracks.");
    }
    
    private static Audio[] b(final JsonParser jsonParser) {
        JsonToken jsonToken = jsonParser.a();
        final ArrayList<Audio> list = new ArrayList<Audio>();
        while (jsonToken != null && jsonToken != JsonToken.e) {
            switch (b.a[jsonToken.ordinal()]) {
                case 1: {
                    list.add(c(jsonParser));
                    break;
                }
                case 2: {
                    jsonParser.c();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return list.toArray(new Audio[list.size()]);
    }
    
    private static Audio c(final JsonParser jsonParser) {
        String g = null;
        Map e = new HashMap();
        HashMap<Object, String> hashMap = new HashMap<Object, String>();
        HashMap<Object, Object> hashMap2 = new HashMap<Object, Object>();
        JsonToken a = jsonParser.a();
        String s = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        String s6 = null;
        while (a != null && a != JsonToken.c) {
            Map<Object, String> d = null;
            String s7 = null;
            String s8 = null;
            HashMap<Object, Object> hashMap3 = null;
            String s9 = null;
            Label_0123: {
                switch (b.a[a.ordinal()]) {
                    case 1: {
                        if ("artist".equalsIgnoreCase(g)) {
                            d = (Map<Object, String>)d(jsonParser);
                            s7 = s5;
                            s8 = s6;
                            hashMap3 = hashMap2;
                            s9 = s4;
                            break Label_0123;
                        }
                        jsonParser.c();
                        d = hashMap;
                        s8 = s6;
                        s7 = s5;
                        hashMap3 = hashMap2;
                        s9 = s4;
                        break Label_0123;
                    }
                    case 2: {
                        if ("beacons".equalsIgnoreCase(g)) {
                            e = e(jsonParser);
                            d = hashMap;
                            s8 = s6;
                            s7 = s5;
                            hashMap3 = hashMap2;
                            s9 = s4;
                            break Label_0123;
                        }
                        if ("sources".equalsIgnoreCase(g)) {
                            final Map g2 = g(jsonParser);
                            s9 = s4;
                            s8 = s6;
                            hashMap3 = (HashMap<Object, Object>)g2;
                            d = hashMap;
                            s7 = s5;
                            break Label_0123;
                        }
                        jsonParser.c();
                        d = hashMap;
                        s8 = s6;
                        s7 = s5;
                        hashMap3 = hashMap2;
                        s9 = s4;
                        break Label_0123;
                    }
                    case 3: {
                        final String g3 = jsonParser.g();
                        if ("title".equalsIgnoreCase(g)) {
                            hashMap3 = hashMap2;
                            s8 = g3;
                            s9 = s4;
                            d = hashMap;
                            s7 = s5;
                            break Label_0123;
                        }
                        if ("cta_value".equalsIgnoreCase(g)) {
                            s8 = s6;
                            hashMap3 = hashMap2;
                            s9 = g3;
                            d = hashMap;
                            s7 = s5;
                            break Label_0123;
                        }
                        if ("cta_type".equalsIgnoreCase(g)) {
                            s3 = g3;
                            s8 = s6;
                            hashMap3 = hashMap2;
                            d = hashMap;
                            s7 = s5;
                            s9 = s4;
                            break Label_0123;
                        }
                        if ("app_link".equalsIgnoreCase(g)) {
                            s8 = s6;
                            hashMap3 = hashMap2;
                            s9 = s4;
                            d = hashMap;
                            s7 = g3;
                            break Label_0123;
                        }
                        if ("uuid".equalsIgnoreCase(g)) {
                            s2 = g3;
                            s8 = s6;
                            d = hashMap;
                            hashMap3 = hashMap2;
                            s7 = s5;
                            s9 = s4;
                            break Label_0123;
                        }
                        if ("artwork".equalsIgnoreCase(g)) {
                            s = g3;
                            s8 = s6;
                            d = hashMap;
                            hashMap3 = hashMap2;
                            s7 = s5;
                            s9 = s4;
                            break Label_0123;
                        }
                        break;
                    }
                    case 4: {
                        g = jsonParser.g();
                        d = hashMap;
                        s8 = s6;
                        s7 = s5;
                        hashMap3 = hashMap2;
                        s9 = s4;
                        break Label_0123;
                    }
                }
                d = hashMap;
                s8 = s6;
                s7 = s5;
                hashMap3 = hashMap2;
                s9 = s4;
            }
            final JsonToken a2 = jsonParser.a();
            s5 = s7;
            hashMap = (HashMap<Object, String>)d;
            a = a2;
            s4 = s9;
            hashMap2 = hashMap3;
            s6 = s8;
        }
        final String s10 = hashMap2.get("progressive");
        final String s11 = hashMap.get("handle");
        final String s12 = hashMap.get("name");
        String s13;
        if (s4 == null) {
            s13 = s5;
        }
        else {
            s13 = s4;
        }
        return new Audio(s6, s13, s3, e, s11, s12, s2, s10, s);
    }
    
    private static Map d(final JsonParser jsonParser) {
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        JsonToken jsonToken = jsonParser.a();
        String g = null;
        while (jsonToken != null && jsonToken != JsonToken.c) {
            switch (b.a[jsonToken.ordinal()]) {
                case 1:
                case 2: {
                    jsonParser.c();
                    break;
                }
                case 3: {
                    final String g2 = jsonParser.g();
                    if ("name".equalsIgnoreCase(g)) {
                        hashMap.put("name", g2);
                        break;
                    }
                    if ("handle".equalsIgnoreCase(g)) {
                        hashMap.put("handle", g2);
                        break;
                    }
                    break;
                }
                case 4: {
                    g = jsonParser.g();
                    break;
                }
            }
            jsonToken = jsonParser.a();
        }
        return hashMap;
    }
    
    private static Map e(final JsonParser jsonParser) {
        final ArrayList<Pair> list = new ArrayList<Pair>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
            switch (b.a[jsonToken.ordinal()]) {
                case 1: {
                    list.add(f(jsonParser));
                    break;
                }
                case 2: {
                    jsonParser.c();
                    break;
                }
            }
        }
        final HashMap<Object, List<?>> hashMap = (HashMap<Object, List<?>>)new HashMap<Object, Object>();
        for (final Pair pair : list) {
            List<?> list2 = hashMap.get(pair.first);
            if (list2 == null) {
                list2 = new ArrayList<Object>();
            }
            list2.add(pair.second);
            hashMap.put(pair.first, list2);
        }
        return hashMap;
    }
    
    private static Pair f(final JsonParser jsonParser) {
        String g = null;
        JsonToken a = jsonParser.a();
        String s = null;
        Object o = null;
        while (a != null && a != JsonToken.c) {
            String g2 = null;
            Label_0063: {
                switch (b.a[a.ordinal()]) {
                    case 1:
                    case 2: {
                        jsonParser.c();
                        g2 = s;
                        break Label_0063;
                    }
                    case 3: {
                        g2 = jsonParser.g();
                        if ("url".equalsIgnoreCase(g)) {
                            break Label_0063;
                        }
                        if ("key".equalsIgnoreCase(g)) {
                            o = g2;
                            g2 = s;
                            break Label_0063;
                        }
                        break;
                    }
                    case 4: {
                        g = jsonParser.g();
                        g2 = s;
                        break Label_0063;
                    }
                }
                g2 = s;
            }
            final JsonToken a2 = jsonParser.a();
            s = g2;
            a = a2;
        }
        return new Pair(o, (Object)s);
    }
    
    private static Map g(final JsonParser jsonParser) {
        final HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        for (JsonToken jsonToken = jsonParser.a(); jsonToken != null && jsonToken != JsonToken.e; jsonToken = jsonParser.a()) {
            switch (b.a[jsonToken.ordinal()]) {
                case 1: {
                    final Pair h = h(jsonParser);
                    hashMap.put(h.first, h.second);
                    break;
                }
                case 2: {
                    jsonParser.c();
                    break;
                }
            }
        }
        return hashMap;
    }
    
    private static Pair h(final JsonParser jsonParser) {
        String g = null;
        JsonToken a = jsonParser.a();
        String s = null;
        Object o = null;
        while (a != null && a != JsonToken.c) {
            String g2 = null;
            Label_0063: {
                switch (b.a[a.ordinal()]) {
                    case 1:
                    case 2: {
                        jsonParser.c();
                        g2 = s;
                        break Label_0063;
                    }
                    case 3: {
                        g2 = jsonParser.g();
                        if ("bitrate".equalsIgnoreCase(g)) {
                            break Label_0063;
                        }
                        if ("url".equalsIgnoreCase(g)) {
                            o = g2;
                            g2 = s;
                            break Label_0063;
                        }
                        break;
                    }
                    case 4: {
                        g = jsonParser.g();
                        g2 = s;
                        break Label_0063;
                    }
                }
                g2 = s;
            }
            final JsonToken a2 = jsonParser.a();
            s = g2;
            a = a2;
        }
        return new Pair((Object)s, o);
    }
    
    private static Pair i(final JsonParser jsonParser) {
        String g = null;
        JsonToken a = jsonParser.a();
        String s = null;
        Object o = null;
        while (a != null && a != JsonToken.c) {
            String g2 = null;
            Label_0063: {
                switch (b.a[a.ordinal()]) {
                    case 1:
                    case 2: {
                        jsonParser.c();
                        g2 = s;
                        break Label_0063;
                    }
                    case 3: {
                        g2 = jsonParser.g();
                        if ("error_code".equalsIgnoreCase(g)) {
                            break Label_0063;
                        }
                        if ("reason".equalsIgnoreCase(g)) {
                            o = g2;
                            g2 = s;
                            break Label_0063;
                        }
                        break;
                    }
                    case 4: {
                        g = jsonParser.g();
                        g2 = s;
                        break Label_0063;
                    }
                }
                g2 = s;
            }
            final JsonToken a2 = jsonParser.a();
            s = g2;
            a = a2;
        }
        return new Pair((Object)s, o);
    }
    
    @Override
    public void a(final int p0, final InputStream p1, final int p2, final String p3, final String p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore          6
        //     3: iload_1        
        //     4: sipush          200
        //     7: if_icmpne       66
        //    10: aload_2        
        //    11: invokestatic    com/twitter/library/api/bh.a:(Ljava/io/InputStream;)Lcom/fasterxml/jackson/core/JsonParser;
        //    14: astore          12
        //    16: aload           12
        //    18: astore          6
        //    20: aload_0        
        //    21: aload_0        
        //    22: aload           6
        //    24: invokespecial   com/twitter/library/av/model/parser/a.a:(Lcom/fasterxml/jackson/core/JsonParser;)Lcom/twitter/library/av/model/AudioPlaylist;
        //    27: putfield        com/twitter/library/av/model/parser/a.a:Lcom/twitter/library/av/model/AudioPlaylist;
        //    30: aload           6
        //    32: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    35: return         
        //    36: astore          10
        //    38: aload_0        
        //    39: aconst_null    
        //    40: putfield        com/twitter/library/av/model/parser/a.a:Lcom/twitter/library/av/model/AudioPlaylist;
        //    43: aload           6
        //    45: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    48: return         
        //    49: astore          7
        //    51: aconst_null    
        //    52: astore          8
        //    54: aload           7
        //    56: astore          9
        //    58: aload           8
        //    60: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    63: aload           9
        //    65: athrow         
        //    66: iload_1        
        //    67: sipush          403
        //    70: if_icmpne       35
        //    73: aload_0        
        //    74: new             Lcom/twitter/library/av/model/AudioPlaylist;
        //    77: dup            
        //    78: getstatic       lg.av_playback_forbidden:I
        //    81: aconst_null    
        //    82: invokespecial   com/twitter/library/av/model/AudioPlaylist.<init>:(ILjava/lang/String;)V
        //    85: putfield        com/twitter/library/av/model/parser/a.a:Lcom/twitter/library/av/model/AudioPlaylist;
        //    88: return         
        //    89: astore          11
        //    91: aload           6
        //    93: astore          8
        //    95: aload           11
        //    97: astore          9
        //    99: goto            58
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  10     16     36     49     Ljava/lang/Exception;
        //  10     16     49     58     Any
        //  20     30     36     49     Ljava/lang/Exception;
        //  20     30     89     102    Any
        //  38     43     89     102    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0035:
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
    
    @Override
    public void a(final l l) {
        this.a = null;
    }
}
