// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.Hashtable;
import de.greenrobot.event.m;
import java.util.Iterator;
import java.security.NoSuchAlgorithmException;
import android.backport.util.Base64;
import java.security.MessageDigest;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class atf
{
    private static final String[] z;
    private final String a;
    private String b;
    private Map c;
    
    static {
        final String[] z2 = new String[6];
        String s = "]JR*";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0183:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u000e';
                        break;
                    }
                    case 0: {
                        c2 = '\u000e';
                        break;
                    }
                    case 1: {
                        c2 = '\u0002';
                        break;
                    }
                    case 2: {
                        c2 = '\u0013';
                        break;
                    }
                    case 3: {
                        c2 = '\u001b';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "?8";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "of~r`";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "ip|n~cea4}wlp6ojf>ko|vzxg~c}o4";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "ip|n~cea4}wlp6|ko|mk#rrizgazko`v)";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = ".r{z}f8";
                    n = 4;
                    continue;
                }
                case 4: {
                    break Label_0183;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public atf(final String a) {
        this.c = new ConcurrentHashMap();
        this.a = a;
    }
    
    static String a(final atf atf) {
        return atf.a;
    }
    
    public static String a(final Collection collection) {
        final boolean i = App.I;
        final ArrayList<String> list = new ArrayList<String>(collection);
        Collections.sort((List<Comparable>)list);
        try {
            final MessageDigest instance = MessageDigest.getInstance(atf.z[0]);
            final Iterator<Object> iterator = list.iterator();
            while (iterator.hasNext()) {
                instance.update(iterator.next().getBytes());
                if (i) {
                    break;
                }
            }
            final byte[] digest = instance.digest();
            final byte[] array = new byte[6];
            System.arraycopy(digest, 0, array, 0, array.length);
            return atf.z[1] + Base64.encodeToString(array, 2);
        }
        catch (NoSuchAlgorithmException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    private void a() {
        this.b = a(this.l());
    }
    
    private void a(final boolean a) {
        final boolean i = App.I;
        final Iterator<Map.Entry<K, wh>> iterator = this.c.entrySet().iterator();
        while (iterator.hasNext()) {
            iterator.next().getValue().a = a;
            if (i) {
                break;
            }
        }
        App.ak.b(Collections.singletonList(this));
        m.b().b(new a6k(this.d()));
    }
    
    public wh a(final String s) {
        return this.c.get(s);
    }
    
    public wh a(final String s, final boolean b, final boolean e) {
        wh wh = this.c.get(s);
        Label_0042: {
            if (wh == null) {
                break Label_0042;
            }
            try {
                wh.b = b;
                wh.e = e;
                if (App.I) {
                    wh = new wh(s, b, e, false);
                    wh.d = adc.d()[this.c.size() % adc.d().length];
                    this.c.put(s, wh);
                    this.a();
                }
                return wh;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
        }
    }
    
    public boolean a(final Hashtable p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_3       
        //     4: new             Ljava/util/Vector;
        //     7: dup            
        //     8: invokespecial   java/util/Vector.<init>:()V
        //    11: astore          4
        //    13: aload_1        
        //    14: invokevirtual   java/util/Hashtable.keySet:()Ljava/util/Set;
        //    17: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    22: astore          5
        //    24: aload           5
        //    26: invokeinterface java/util/Iterator.hasNext:()Z
        //    31: ifeq            120
        //    34: aload           5
        //    36: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    41: checkcast       Ljava/lang/String;
        //    44: astore          26
        //    46: aload_0        
        //    47: getfield        com/whatsapp/atf.c:Ljava/util/Map;
        //    50: aload           26
        //    52: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //    57: ifne            94
        //    60: new             Ljava/lang/StringBuilder;
        //    63: dup            
        //    64: invokespecial   java/lang/StringBuilder.<init>:()V
        //    67: getstatic       com/whatsapp/atf.z:[Ljava/lang/String;
        //    70: iconst_3       
        //    71: aaload         
        //    72: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    75: aload           26
        //    77: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    80: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    83: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    86: aload           4
        //    88: aload           26
        //    90: invokevirtual   java/util/Vector.add:(Ljava/lang/Object;)Z
        //    93: pop            
        //    94: aload_0        
        //    95: aload           26
        //    97: getstatic       com/whatsapp/atf.z:[Ljava/lang/String;
        //   100: iconst_2       
        //   101: aaload         
        //   102: aload_1        
        //   103: aload           26
        //   105: invokevirtual   java/util/Hashtable.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   108: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   111: iconst_0       
        //   112: invokevirtual   com/whatsapp/atf.a:(Ljava/lang/String;ZZ)Lcom/whatsapp/wh;
        //   115: pop            
        //   116: iload_3        
        //   117: ifeq            24
        //   120: new             Ljava/util/Vector;
        //   123: dup            
        //   124: invokespecial   java/util/Vector.<init>:()V
        //   127: astore          6
        //   129: aload_0        
        //   130: getfield        com/whatsapp/atf.c:Ljava/util/Map;
        //   133: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //   138: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   143: astore          7
        //   145: aload           7
        //   147: invokeinterface java/util/Iterator.hasNext:()Z
        //   152: ifeq            214
        //   155: aload           7
        //   157: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   162: checkcast       Ljava/lang/String;
        //   165: astore          23
        //   167: aload_1        
        //   168: aload           23
        //   170: invokevirtual   java/util/Hashtable.containsKey:(Ljava/lang/Object;)Z
        //   173: ifne            210
        //   176: new             Ljava/lang/StringBuilder;
        //   179: dup            
        //   180: invokespecial   java/lang/StringBuilder.<init>:()V
        //   183: getstatic       com/whatsapp/atf.z:[Ljava/lang/String;
        //   186: iconst_4       
        //   187: aaload         
        //   188: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   191: aload           23
        //   193: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   196: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   199: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   202: aload           6
        //   204: aload           23
        //   206: invokevirtual   java/util/Vector.add:(Ljava/lang/Object;)Z
        //   209: pop            
        //   210: iload_3        
        //   211: ifeq            145
        //   214: aload           6
        //   216: invokevirtual   java/util/Vector.iterator:()Ljava/util/Iterator;
        //   219: astore          8
        //   221: aload           8
        //   223: invokeinterface java/util/Iterator.hasNext:()Z
        //   228: ifeq            250
        //   231: aload_0        
        //   232: aload           8
        //   234: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   239: checkcast       Ljava/lang/String;
        //   242: invokevirtual   com/whatsapp/atf.b:(Ljava/lang/String;)Lcom/whatsapp/wh;
        //   245: pop            
        //   246: iload_3        
        //   247: ifeq            221
        //   250: iload_2        
        //   251: ifeq            413
        //   254: aload_0        
        //   255: invokevirtual   com/whatsapp/atf.i:()Ljava/util/ArrayList;
        //   258: astore          15
        //   260: aload           4
        //   262: invokevirtual   java/util/Vector.isEmpty:()Z
        //   265: istore          18
        //   267: iload           18
        //   269: ifne            318
        //   272: aload_0        
        //   273: getfield        com/whatsapp/atf.a:Ljava/lang/String;
        //   276: astore          20
        //   278: aload           15
        //   280: invokevirtual   java/util/ArrayList.size:()I
        //   283: iconst_1       
        //   284: if_icmpne       402
        //   287: aload           15
        //   289: iconst_0       
        //   290: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   293: checkcast       Lcom/whatsapp/wh;
        //   296: getfield        com/whatsapp/wh.c:Ljava/lang/String;
        //   299: astore          21
        //   301: iconst_1       
        //   302: bipush          12
        //   304: aconst_null    
        //   305: aload           20
        //   307: aload           21
        //   309: aload           4
        //   311: aload_0        
        //   312: invokestatic    com/whatsapp/adc.b:(ILcom/whatsapp/protocol/cr;Ljava/lang/String;Ljava/lang/String;Ljava/util/Vector;Lcom/whatsapp/atf;)Lcom/whatsapp/protocol/bi;
        //   315: invokestatic    com/whatsapp/adc.a:(ILjava/lang/Object;)V
        //   318: aload           6
        //   320: invokevirtual   java/util/Vector.isEmpty:()Z
        //   323: ifne            343
        //   326: iconst_1       
        //   327: bipush          13
        //   329: aconst_null    
        //   330: aload_0        
        //   331: getfield        com/whatsapp/atf.a:Ljava/lang/String;
        //   334: aconst_null    
        //   335: aload           6
        //   337: invokestatic    com/whatsapp/adc.b:(ILcom/whatsapp/protocol/cr;Ljava/lang/String;Ljava/lang/String;Ljava/util/Vector;)Lcom/whatsapp/protocol/bi;
        //   340: invokestatic    com/whatsapp/adc.a:(ILjava/lang/Object;)V
        //   343: aload           4
        //   345: invokevirtual   java/util/Vector.isEmpty:()Z
        //   348: istore          11
        //   350: iload           11
        //   352: ifeq            367
        //   355: aload           6
        //   357: invokevirtual   java/util/Vector.isEmpty:()Z
        //   360: istore          14
        //   362: iload           14
        //   364: ifne            436
        //   367: iconst_1       
        //   368: istore          12
        //   370: iload           12
        //   372: ifeq            379
        //   375: aload_0        
        //   376: invokespecial   com/whatsapp/atf.a:()V
        //   379: iload           12
        //   381: ireturn        
        //   382: astore          27
        //   384: aload           27
        //   386: athrow         
        //   387: astore          24
        //   389: aload           24
        //   391: athrow         
        //   392: astore          16
        //   394: aload           16
        //   396: athrow         
        //   397: astore          17
        //   399: aload           17
        //   401: athrow         
        //   402: aconst_null    
        //   403: astore          21
        //   405: goto            301
        //   408: astore          19
        //   410: aload           19
        //   412: athrow         
        //   413: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   416: aload_0        
        //   417: invokestatic    java/util/Collections.singletonList:(Ljava/lang/Object;)Ljava/util/List;
        //   420: invokevirtual   com/whatsapp/vy.b:(Ljava/util/Collection;)V
        //   423: goto            343
        //   426: astore          9
        //   428: aload           9
        //   430: athrow         
        //   431: astore          10
        //   433: aload           10
        //   435: athrow         
        //   436: iconst_0       
        //   437: istore          12
        //   439: goto            370
        //   442: astore          13
        //   444: aload           13
        //   446: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  46     94     382    387    Ljava/lang/RuntimeException;
        //  167    210    387    392    Ljava/lang/RuntimeException;
        //  260    267    392    397    Ljava/lang/RuntimeException;
        //  272    301    397    402    Ljava/lang/RuntimeException;
        //  318    343    408    413    Ljava/lang/RuntimeException;
        //  343    350    426    431    Ljava/lang/RuntimeException;
        //  355    362    431    436    Ljava/lang/RuntimeException;
        //  375    379    442    447    Ljava/lang/RuntimeException;
        //  394    397    397    402    Ljava/lang/RuntimeException;
        //  428    431    431    436    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 199, Size: 199
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
    
    public wh b(final String s) {
        final wh wh = this.c.remove(s);
        if (wh == null) {
            return wh;
        }
        try {
            this.a();
            return wh;
        }
        catch (RuntimeException ex) {
            throw ex;
        }
    }
    
    public void b() {
        final boolean i = App.I;
        this.c = App.ak.o(this.a);
        this.a();
        final Iterator<wh> iterator = this.c.values().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            iterator.next().d = adc.d()[n % adc.d().length];
            final int n2 = n + 1;
            if (i) {
                break;
            }
            n = n2;
        }
    }
    
    public Set c() {
        final boolean i = App.I;
        final HashSet<Object> set = new HashSet<Object>();
        for (final Map.Entry<K, wh> entry : this.c.entrySet()) {
            Label_0110: {
                try {
                    if (entry.getValue().a) {
                        break Label_0110;
                    }
                    final Object o = entry;
                    final wh wh = ((Map.Entry<K, wh>)o).getValue();
                    final wh wh2 = wh;
                    final boolean b = wh2.a();
                    if (!b) {
                        final HashSet<Object> set2 = set;
                        final Object o2 = entry;
                        final Object o3 = ((Map.Entry<Object, wh>)o2).getKey();
                        set2.add(o3);
                    }
                    break Label_0110;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    final Object o = entry;
                    final wh wh = ((Map.Entry<K, wh>)o).getValue();
                    final wh wh2 = wh;
                    final boolean b = wh2.a();
                    if (!b) {
                        final HashSet<Object> set2 = set;
                        final Object o2 = entry;
                        final Object o3 = ((Map.Entry<Object, wh>)o2).getKey();
                        set2.add(o3);
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            if (i) {
                break;
            }
        }
        return set;
    }
    
    public boolean c(final String s) {
        final wh a = this.a(s);
        if (a != null) {
            try {
                if (a.b) {
                    return true;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
        }
        return false;
    }
    
    public String d() {
        return this.a;
    }
    
    public void e() {
        this.a(false);
    }
    
    public boolean f() {
        final boolean i = App.I;
        for (final wh wh : this.c.values()) {
            try {
                if (wh.a()) {
                    return wh.b;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            if (i) {
                break;
            }
        }
        return false;
    }
    
    public void g() {
        this.a(true);
    }
    
    public boolean h() {
        final boolean i = App.I;
        for (final wh wh : this.c.values()) {
            try {
                if (wh.a()) {
                    return true;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            if (i) {
                break;
            }
        }
        return false;
    }
    
    public ArrayList i() {
        final boolean i = App.I;
        final ArrayList<wh> list = new ArrayList<wh>();
        final Iterator<wh> iterator = this.c.values().iterator();
        while (true) {
            if (!iterator.hasNext()) {
                return list;
            }
            final wh wh = iterator.next();
            try {
                if (wh.b) {
                    list.add(wh);
                }
                if (i) {
                    return list;
                }
                continue;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
        }
    }
    
    public int j() {
        return this.c.size();
    }
    
    public Collection k() {
        return this.c.values();
    }
    
    public Set l() {
        return this.c.keySet();
    }
    
    public String m() {
        return this.b;
    }
    
    @Override
    public String toString() {
        return this.a + " " + Arrays.deepToString(Collections.list((Enumeration<Object>)Collections.enumeration(this.c.values())).toArray()) + atf.z[5] + this.b;
    }
}
