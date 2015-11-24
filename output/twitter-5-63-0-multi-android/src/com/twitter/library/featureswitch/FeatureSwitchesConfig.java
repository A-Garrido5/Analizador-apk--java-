// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.featureswitch;

import java.util.Set;
import java.util.ArrayList;
import java.io.File;
import com.fasterxml.jackson.core.JsonParser;
import java.io.Closeable;
import com.twitter.library.api.bh;
import android.content.Context;
import java.util.Iterator;
import java.util.Map;
import java.util.HashSet;
import java.util.HashMap;
import com.fasterxml.jackson.core.JsonFactory;
import java.io.Serializable;

public class FeatureSwitchesConfig implements Serializable
{
    protected static final JsonFactory a;
    private static final long serialVersionUID = 2959003665305236478L;
    public HashMap config;
    public HashSet embeddedDarkmoded;
    public long updatedAt;
    public SettingVersionDetails versions;
    
    static {
        a = new JsonFactory();
    }
    
    public FeatureSwitchesConfig() {
        this.config = new HashMap();
        this.embeddedDarkmoded = new HashSet();
    }
    
    public FeatureSwitchesConfig(final HashMap hashMap) {
        this(hashMap, null, null, null);
    }
    
    public FeatureSwitchesConfig(final HashMap hashMap, final HashSet set, final HashSet embeddedDarkmoded, final SettingVersionDetails versions) {
        this.updatedAt = System.currentTimeMillis();
        if (hashMap == null) {
            this.config = new HashMap();
        }
        else {
            this.config = new HashMap(hashMap);
        }
        if (embeddedDarkmoded == null) {
            this.embeddedDarkmoded = new HashSet();
        }
        else {
            this.embeddedDarkmoded = embeddedDarkmoded;
        }
        this.versions = versions;
        if (set != null) {
            for (final FeatureSwitchesValue$FeatureSwitchesImpression featureSwitchesValue$FeatureSwitchesImpression : set) {
                final FeatureSwitchesValue featureSwitchesValue = this.config.get(featureSwitchesValue$FeatureSwitchesImpression.a());
                if (featureSwitchesValue != null) {
                    featureSwitchesValue.a(featureSwitchesValue$FeatureSwitchesImpression);
                }
            }
        }
    }
    
    public static FeatureSwitchesConfig a(final Context context, final int n) {
        JsonParser b = null;
        try {
            b = FeatureSwitchesConfig.a.b(context.getResources().openRawResource(n));
            b.a();
            final FeatureSwitchesConfig featureSwitchesConfig = new FeatureSwitchesConfig(bh.W(b));
            yh.a(b);
            featureSwitchesConfig.updatedAt = System.currentTimeMillis();
            return featureSwitchesConfig;
        }
        finally {
            yh.a(b);
        }
    }
    
    public static FeatureSwitchesConfig a(final Context p0, final File p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: monitorenter   
        //     2: new             Lih;
        //     5: dup            
        //     6: ldc             "fs:load:manifest"
        //     8: getstatic       ih.m:Lim;
        //    11: invokespecial   ih.<init>:(Ljava/lang/String;Lim;)V
        //    14: astore_2       
        //    15: aload_2        
        //    16: ldc             "FS"
        //    18: invokevirtual   ih.b:(Ljava/lang/String;)V
        //    21: aload_2        
        //    22: invokevirtual   ih.i:()V
        //    25: new             Ljava/io/FileInputStream;
        //    28: dup            
        //    29: aload_1        
        //    30: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    33: astore          4
        //    35: new             Ljava/io/ObjectInputStream;
        //    38: dup            
        //    39: new             Ljava/io/BufferedInputStream;
        //    42: dup            
        //    43: aload           4
        //    45: invokespecial   java/io/BufferedInputStream.<init>:(Ljava/io/InputStream;)V
        //    48: invokespecial   java/io/ObjectInputStream.<init>:(Ljava/io/InputStream;)V
        //    51: astore          5
        //    53: aload           5
        //    55: invokevirtual   java/io/ObjectInputStream.readObject:()Ljava/lang/Object;
        //    58: checkcast       Lcom/twitter/library/featureswitch/FeatureSwitchesConfig;
        //    61: astore          15
        //    63: aload           4
        //    65: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    68: aload           5
        //    70: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    73: aload           15
        //    75: astore          9
        //    77: aload_2        
        //    78: invokevirtual   ih.j:()V
        //    81: invokestatic    ir.b:()Lir;
        //    84: aload_2        
        //    85: invokevirtual   ir.a:(Lih;)V
        //    88: aload_1        
        //    89: monitorexit    
        //    90: aload           9
        //    92: areturn        
        //    93: aload           8
        //    95: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    98: aload           7
        //   100: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   103: aconst_null    
        //   104: astore          9
        //   106: goto            77
        //   109: astore_3       
        //   110: aload_1        
        //   111: monitorexit    
        //   112: aload_3        
        //   113: athrow         
        //   114: astore          18
        //   116: aconst_null    
        //   117: astore          5
        //   119: aconst_null    
        //   120: astore          4
        //   122: aload_1        
        //   123: invokevirtual   java/io/File.delete:()Z
        //   126: pop            
        //   127: aload           4
        //   129: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   132: aload           5
        //   134: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   137: aconst_null    
        //   138: astore          9
        //   140: goto            77
        //   143: aload           4
        //   145: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   148: aload           12
        //   150: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //   153: aload           11
        //   155: athrow         
        //   156: astore          13
        //   158: goto            127
        //   161: astore          11
        //   163: aconst_null    
        //   164: astore          12
        //   166: goto            143
        //   169: astore          11
        //   171: aload           5
        //   173: astore          12
        //   175: goto            143
        //   178: astore          17
        //   180: aconst_null    
        //   181: astore          5
        //   183: goto            122
        //   186: astore          10
        //   188: goto            122
        //   191: astore          16
        //   193: aload           4
        //   195: astore          8
        //   197: aconst_null    
        //   198: astore          7
        //   200: goto            93
        //   203: astore          6
        //   205: aload           5
        //   207: astore          7
        //   209: aload           4
        //   211: astore          8
        //   213: goto            93
        //   216: astore          19
        //   218: aconst_null    
        //   219: astore          7
        //   221: aconst_null    
        //   222: astore          8
        //   224: goto            93
        //   227: astore          11
        //   229: aconst_null    
        //   230: astore          12
        //   232: aconst_null    
        //   233: astore          4
        //   235: goto            143
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  2      25     109    114    Any
        //  25     35     216    227    Ljava/io/FileNotFoundException;
        //  25     35     114    122    Ljava/lang/Exception;
        //  25     35     227    238    Any
        //  35     53     191    203    Ljava/io/FileNotFoundException;
        //  35     53     178    186    Ljava/lang/Exception;
        //  35     53     161    169    Any
        //  53     63     203    216    Ljava/io/FileNotFoundException;
        //  53     63     186    191    Ljava/lang/Exception;
        //  53     63     169    178    Any
        //  63     73     109    114    Any
        //  77     90     109    114    Any
        //  93     103    109    114    Any
        //  110    112    109    114    Any
        //  122    127    156    161    Ljava/lang/Exception;
        //  122    127    169    178    Any
        //  127    137    109    114    Any
        //  143    156    109    114    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 118, Size: 118
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
    
    public ArrayList a(final FeatureSwitchesConfig featureSwitchesConfig) {
        final ArrayList<String> list = new ArrayList<String>();
        for (final String s : this.config.keySet()) {
            final Object b = this.b(s);
            final Object b2 = featureSwitchesConfig.b(s);
            if ((b == null && b2 != null) || (b != null && !b.equals(b2))) {
                list.add(s);
            }
        }
        return list;
    }
    
    public Set a() {
        return this.config.keySet();
    }
    
    public void a(final File p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore_2       
        //     2: aload_1        
        //     3: monitorenter   
        //     4: new             Ljava/io/FileOutputStream;
        //     7: dup            
        //     8: aload_1        
        //     9: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //    12: astore_3       
        //    13: new             Ljava/io/ObjectOutputStream;
        //    16: dup            
        //    17: new             Ljava/io/BufferedOutputStream;
        //    20: dup            
        //    21: aload_3        
        //    22: invokespecial   java/io/BufferedOutputStream.<init>:(Ljava/io/OutputStream;)V
        //    25: invokespecial   java/io/ObjectOutputStream.<init>:(Ljava/io/OutputStream;)V
        //    28: astore          4
        //    30: aload           4
        //    32: aload_0        
        //    33: invokevirtual   java/io/ObjectOutputStream.writeObject:(Ljava/lang/Object;)V
        //    36: aload           4
        //    38: invokevirtual   java/io/ObjectOutputStream.flush:()V
        //    41: aload_3        
        //    42: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    45: aload           4
        //    47: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    50: aload_1        
        //    51: monitorexit    
        //    52: return         
        //    53: aload           6
        //    55: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    58: aload           4
        //    60: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    63: goto            50
        //    66: astore          7
        //    68: aload_1        
        //    69: monitorexit    
        //    70: aload           7
        //    72: athrow         
        //    73: astore          9
        //    75: aconst_null    
        //    76: astore_3       
        //    77: aload_3        
        //    78: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    81: aload_2        
        //    82: invokestatic    yp.a:(Ljava/io/Closeable;)V
        //    85: aload           9
        //    87: athrow         
        //    88: astore          9
        //    90: aconst_null    
        //    91: astore_2       
        //    92: goto            77
        //    95: astore          8
        //    97: aload           4
        //    99: astore_2       
        //   100: aload           8
        //   102: astore          9
        //   104: goto            77
        //   107: astore          10
        //   109: aload_3        
        //   110: astore          6
        //   112: aconst_null    
        //   113: astore          4
        //   115: goto            53
        //   118: astore          5
        //   120: aload_3        
        //   121: astore          6
        //   123: goto            53
        //   126: astore          11
        //   128: aconst_null    
        //   129: astore          4
        //   131: aconst_null    
        //   132: astore          6
        //   134: goto            53
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  4      13     126    137    Ljava/io/IOException;
        //  4      13     73     77     Any
        //  13     30     107    118    Ljava/io/IOException;
        //  13     30     88     95     Any
        //  30     41     118    126    Ljava/io/IOException;
        //  30     41     95     107    Any
        //  41     50     66     73     Any
        //  50     52     66     73     Any
        //  53     63     66     73     Any
        //  68     70     66     73     Any
        //  77     88     66     73     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 74, Size: 74
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
    
    public void a(final String s, final FeatureSwitchesValue featureSwitchesValue) {
        this.config.put(s, featureSwitchesValue);
    }
    
    public boolean a(final String s) {
        return this.config.containsKey(s);
    }
    
    public Object b(final String s) {
        if (this.config.get(s) != null) {
            return this.config.get(s).c();
        }
        return null;
    }
    
    public FeatureSwitchesValue c(final String s) {
        return this.config.get(s);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final FeatureSwitchesConfig featureSwitchesConfig = (FeatureSwitchesConfig)o;
            Label_0059: {
                if (this.config != null) {
                    if (this.config.equals(featureSwitchesConfig.config)) {
                        break Label_0059;
                    }
                }
                else if (featureSwitchesConfig.config == null) {
                    break Label_0059;
                }
                return false;
            }
            Label_0089: {
                if (this.embeddedDarkmoded != null) {
                    if (this.embeddedDarkmoded.equals(featureSwitchesConfig.embeddedDarkmoded)) {
                        break Label_0089;
                    }
                }
                else if (featureSwitchesConfig.embeddedDarkmoded == null) {
                    break Label_0089;
                }
                return false;
            }
            if (this.versions != null) {
                if (this.versions.equals(featureSwitchesConfig.versions)) {
                    return true;
                }
            }
            else if (featureSwitchesConfig.versions == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hashCode;
        if (this.config != null) {
            hashCode = this.config.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n = hashCode * 31;
        int hashCode2;
        if (this.embeddedDarkmoded != null) {
            hashCode2 = this.embeddedDarkmoded.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final int n2 = 31 * (hashCode2 + n);
        final SettingVersionDetails versions = this.versions;
        int hashCode3 = 0;
        if (versions != null) {
            hashCode3 = this.versions.hashCode();
        }
        return n2 + hashCode3;
    }
}
