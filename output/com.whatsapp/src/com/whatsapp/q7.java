// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.List;
import org.json.JSONObject;
import java.util.Comparator;
import java.util.Arrays;
import java.util.ArrayList;
import java.io.File;

public class q7
{
    private static final File e;
    private static final String[] z;
    private int a;
    public int b;
    private String c;
    public ArrayList d;
    public int f;
    
    static {
        final String[] z2 = new String[19];
        String s = "/b\u0011;0";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0507:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\b';
                        break;
                    }
                    case 0: {
                        c2 = 'z';
                        break;
                    }
                    case 1: {
                        c2 = '6';
                        break;
                    }
                    case 2: {
                        c2 = 'W';
                        break;
                    }
                    case 3: {
                        c2 = '\u0016';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "9Y:{}\u0014_4w|\u0013Y96n\u001b_;slV\u0016$bi\u000eC$+";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "+C2dq";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "3[6qmTy1p{\u001fB";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "3[6qmTu8cf\u000e";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = ".^\"{j\u0014W>z";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "<_;s[\u0013L2";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "V\u0016#y|\u001bZm";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    s = "-_3b`";
                    n = 7;
                    n2 = 8;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    array = z2;
                    s = "3[6qm";
                    n = 8;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\bS$cd\u000eEyzm\u0014Q#~ S\u0016j6";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "(S$cd\u000eE";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "/D;";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = ".Y#wd";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "2S>q`\u000e";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "7S3\u007fi/D;";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "Z_:wo\u001fE";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = ")S6dk\u0012d2ex\u0015X$s";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "8_9q";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    break Label_0507;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        e = new File(App.aq.getCacheDir(), q7.z[18]);
    }
    
    public q7(final int f, final String c) {
        this.f = f;
        this.c = c;
        q7.e.mkdirs();
    }
    
    public q7(final String s) {
        this(50, s);
    }
    
    public static void a() {
        final boolean i = App.I;
        final File[] listFiles = q7.e.listFiles();
        if (listFiles != null) {
            Arrays.sort(listFiles, new q1());
            int j = 0;
            while (j < listFiles.length) {
                final File file = listFiles[j];
                if (j <= -16 + listFiles.length || 86400000L + file.lastModified() <= System.currentTimeMillis()) {
                    file.delete();
                }
                ++j;
                if (i) {
                    break;
                }
            }
        }
    }
    
    private void a(final JSONObject p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aconst_null    
        //     5: astore_3       
        //     6: aload_1        
        //     7: getstatic       com/whatsapp/q7.z:[Ljava/lang/String;
        //    10: bipush          17
        //    12: aaload         
        //    13: invokevirtual   org/json/JSONObject.getJSONObject:(Ljava/lang/String;)Lorg/json/JSONObject;
        //    16: astore          18
        //    18: aconst_null    
        //    19: astore_3       
        //    20: aload           18
        //    22: ifnull          72
        //    25: aload           18
        //    27: getstatic       com/whatsapp/q7.z:[Ljava/lang/String;
        //    30: bipush          9
        //    32: aaload         
        //    33: invokevirtual   org/json/JSONObject.getJSONObject:(Ljava/lang/String;)Lorg/json/JSONObject;
        //    36: astore          19
        //    38: aconst_null    
        //    39: astore_3       
        //    40: aload           19
        //    42: ifnull          72
        //    45: aload           19
        //    47: getstatic       com/whatsapp/q7.z:[Ljava/lang/String;
        //    50: bipush          11
        //    52: aaload         
        //    53: invokevirtual   org/json/JSONObject.getJSONArray:(Ljava/lang/String;)Lorg/json/JSONArray;
        //    56: astore_3       
        //    57: aload_0        
        //    58: aload           19
        //    60: getstatic       com/whatsapp/q7.z:[Ljava/lang/String;
        //    63: bipush          13
        //    65: aaload         
        //    66: invokevirtual   org/json/JSONObject.getInt:(Ljava/lang/String;)I
        //    69: putfield        com/whatsapp/q7.b:I
        //    72: aload_3        
        //    73: astore          5
        //    75: aload           5
        //    77: ifnonnull       94
        //    80: return         
        //    81: astore          4
        //    83: aload_0        
        //    84: iconst_0       
        //    85: putfield        com/whatsapp/q7.b:I
        //    88: aload_3        
        //    89: astore          5
        //    91: goto            75
        //    94: new             Ljava/lang/StringBuilder;
        //    97: dup            
        //    98: invokespecial   java/lang/StringBuilder.<init>:()V
        //   101: getstatic       com/whatsapp/q7.z:[Ljava/lang/String;
        //   104: bipush          10
        //   106: aaload         
        //   107: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   110: aload           5
        //   112: invokevirtual   org/json/JSONArray.length:()I
        //   115: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   118: getstatic       com/whatsapp/q7.z:[Ljava/lang/String;
        //   121: bipush          7
        //   123: aaload         
        //   124: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   127: aload_0        
        //   128: getfield        com/whatsapp/q7.b:I
        //   131: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   134: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   137: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   140: iconst_0       
        //   141: istore          6
        //   143: iload           6
        //   145: aload           5
        //   147: invokevirtual   org/json/JSONArray.length:()I
        //   150: if_icmpge       325
        //   153: new             Lcom/whatsapp/u0;
        //   156: dup            
        //   157: invokespecial   com/whatsapp/u0.<init>:()V
        //   160: astore          7
        //   162: aload           5
        //   164: iload           6
        //   166: invokevirtual   org/json/JSONArray.getJSONObject:(I)Lorg/json/JSONObject;
        //   169: astore          9
        //   171: aload           7
        //   173: aload           9
        //   175: getstatic       com/whatsapp/q7.z:[Ljava/lang/String;
        //   178: bipush          15
        //   180: aaload         
        //   181: invokevirtual   org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   184: putfield        com/whatsapp/u0.b:Ljava/lang/String;
        //   187: aload           7
        //   189: aload           9
        //   191: getstatic       com/whatsapp/q7.z:[Ljava/lang/String;
        //   194: bipush          6
        //   196: aaload         
        //   197: invokevirtual   org/json/JSONObject.getInt:(Ljava/lang/String;)I
        //   200: putfield        com/whatsapp/u0.d:I
        //   203: aload           7
        //   205: aload           9
        //   207: getstatic       com/whatsapp/q7.z:[Ljava/lang/String;
        //   210: bipush          8
        //   212: aaload         
        //   213: invokevirtual   org/json/JSONObject.getInt:(Ljava/lang/String;)I
        //   216: putfield        com/whatsapp/u0.a:I
        //   219: aload           7
        //   221: aload           9
        //   223: getstatic       com/whatsapp/q7.z:[Ljava/lang/String;
        //   226: bipush          14
        //   228: aaload         
        //   229: invokevirtual   org/json/JSONObject.getInt:(Ljava/lang/String;)I
        //   232: putfield        com/whatsapp/u0.e:I
        //   235: aload           9
        //   237: getstatic       com/whatsapp/q7.z:[Ljava/lang/String;
        //   240: iconst_5       
        //   241: aaload         
        //   242: invokevirtual   org/json/JSONObject.getJSONObject:(Ljava/lang/String;)Lorg/json/JSONObject;
        //   245: astore          10
        //   247: aload           10
        //   249: ifnull          268
        //   252: aload           7
        //   254: aload           10
        //   256: getstatic       com/whatsapp/q7.z:[Ljava/lang/String;
        //   259: bipush          12
        //   261: aaload         
        //   262: invokevirtual   org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   265: putfield        com/whatsapp/u0.c:Ljava/lang/String;
        //   268: aload           7
        //   270: getfield        com/whatsapp/u0.a:I
        //   273: sipush          300
        //   276: if_icmplt       318
        //   279: aload           7
        //   281: getfield        com/whatsapp/u0.e:I
        //   284: istore          14
        //   286: iload           14
        //   288: sipush          300
        //   291: if_icmplt       318
        //   294: aload           7
        //   296: getfield        com/whatsapp/u0.d:I
        //   299: istore          15
        //   301: iload           15
        //   303: ldc             512000
        //   305: if_icmpgt       318
        //   308: aload_0        
        //   309: getfield        com/whatsapp/q7.d:Ljava/util/ArrayList;
        //   312: aload           7
        //   314: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   317: pop            
        //   318: iinc            6, 1
        //   321: iload_2        
        //   322: ifeq            143
        //   325: aload_0        
        //   326: aload_0        
        //   327: getfield        com/whatsapp/q7.a:I
        //   330: aload           5
        //   332: invokevirtual   org/json/JSONArray.length:()I
        //   335: iadd           
        //   336: putfield        com/whatsapp/q7.a:I
        //   339: new             Ljava/lang/StringBuilder;
        //   342: dup            
        //   343: invokespecial   java/lang/StringBuilder.<init>:()V
        //   346: aload_0        
        //   347: getfield        com/whatsapp/q7.d:Ljava/util/ArrayList;
        //   350: invokevirtual   java/util/ArrayList.size:()I
        //   353: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   356: getstatic       com/whatsapp/q7.z:[Ljava/lang/String;
        //   359: bipush          16
        //   361: aaload         
        //   362: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   365: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   368: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   371: return         
        //   372: astore          17
        //   374: aload           17
        //   376: athrow         
        //   377: astore          8
        //   379: goto            318
        //   382: astore          11
        //   384: aload           11
        //   386: athrow         
        //   387: astore          12
        //   389: aload           12
        //   391: athrow         
        //   392: astore          13
        //   394: aload           13
        //   396: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                    
        //  -----  -----  -----  -----  ------------------------
        //  6      18     81     94     Lorg/json/JSONException;
        //  25     38     81     94     Lorg/json/JSONException;
        //  45     72     81     94     Lorg/json/JSONException;
        //  153    247    377    382    Lorg/json/JSONException;
        //  252    268    372    377    Lorg/json/JSONException;
        //  268    286    382    387    Lorg/json/JSONException;
        //  294    301    387    392    Lorg/json/JSONException;
        //  308    318    392    397    Lorg/json/JSONException;
        //  374    377    377    382    Lorg/json/JSONException;
        //  384    387    387    392    Lorg/json/JSONException;
        //  389    392    392    397    Lorg/json/JSONException;
        //  394    397    377    382    Lorg/json/JSONException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 184, Size: 184
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
    
    public String b() {
        return this.c;
    }
    
    public List c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aconst_null    
        //     1: astore_1       
        //     2: aload_0        
        //     3: new             Ljava/util/ArrayList;
        //     6: dup            
        //     7: invokespecial   java/util/ArrayList.<init>:()V
        //    10: putfield        com/whatsapp/q7.d:Ljava/util/ArrayList;
        //    13: new             Ljava/util/ArrayList;
        //    16: dup            
        //    17: invokespecial   java/util/ArrayList.<init>:()V
        //    20: astore_2       
        //    21: aload_2        
        //    22: new             Lorg/apache/http/message/BasicNameValuePair;
        //    25: dup            
        //    26: getstatic       com/whatsapp/q7.z:[Ljava/lang/String;
        //    29: iconst_2       
        //    30: aaload         
        //    31: aload_0        
        //    32: getfield        com/whatsapp/q7.c:Ljava/lang/String;
        //    35: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //    38: invokespecial   org/apache/http/message/BasicNameValuePair.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //    41: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //    46: pop            
        //    47: aload_2        
        //    48: new             Lorg/apache/http/message/BasicNameValuePair;
        //    51: dup            
        //    52: getstatic       com/whatsapp/q7.z:[Ljava/lang/String;
        //    55: iconst_3       
        //    56: aaload         
        //    57: aload_0        
        //    58: getfield        com/whatsapp/q7.a:I
        //    61: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //    64: invokespecial   org/apache/http/message/BasicNameValuePair.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //    67: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //    72: pop            
        //    73: aload_2        
        //    74: new             Lorg/apache/http/message/BasicNameValuePair;
        //    77: dup            
        //    78: getstatic       com/whatsapp/q7.z:[Ljava/lang/String;
        //    81: iconst_4       
        //    82: aaload         
        //    83: aload_0        
        //    84: getfield        com/whatsapp/q7.f:I
        //    87: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //    90: invokespecial   org/apache/http/message/BasicNameValuePair.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //    93: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //    98: pop            
        //    99: new             Ljava/lang/StringBuilder;
        //   102: dup            
        //   103: invokespecial   java/lang/StringBuilder.<init>:()V
        //   106: getstatic       com/whatsapp/a6c.n:Ljava/lang/String;
        //   109: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   112: aload_2        
        //   113: getstatic       com/whatsapp/q7.z:[Ljava/lang/String;
        //   116: iconst_0       
        //   117: aaload         
        //   118: invokestatic    org/apache/http/client/utils/URLEncodedUtils.format:(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;
        //   121: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   124: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   127: astore          6
        //   129: aload           6
        //   131: invokestatic    com/whatsapp/al5.d:(Ljava/lang/String;)Ljava/lang/String;
        //   134: astore          7
        //   136: new             Ljava/io/File;
        //   139: dup            
        //   140: getstatic       com/whatsapp/q7.e:Ljava/io/File;
        //   143: aload           7
        //   145: invokevirtual   java/lang/String.toString:()Ljava/lang/String;
        //   148: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   151: astore          8
        //   153: aload           8
        //   155: invokevirtual   java/io/File.exists:()Z
        //   158: ifeq            347
        //   161: ldc2_w          86400000
        //   164: aload           8
        //   166: invokevirtual   java/io/File.lastModified:()J
        //   169: ladd           
        //   170: lstore          26
        //   172: invokestatic    java/lang/System.currentTimeMillis:()J
        //   175: lstore          28
        //   177: lload           26
        //   179: lload           28
        //   181: lcmp           
        //   182: ifle            347
        //   185: new             Ljava/io/ObjectInputStream;
        //   188: dup            
        //   189: new             Ljava/io/FileInputStream;
        //   192: dup            
        //   193: aload           8
        //   195: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   198: invokespecial   java/io/ObjectInputStream.<init>:(Ljava/io/InputStream;)V
        //   201: astore          30
        //   203: aload           30
        //   205: invokevirtual   java/io/ObjectInputStream.readObject:()Ljava/lang/Object;
        //   208: checkcast       Ljava/lang/String;
        //   211: astore          22
        //   213: aload           30
        //   215: ifnull          223
        //   218: aload           30
        //   220: invokevirtual   java/io/ObjectInputStream.close:()V
        //   223: aload           22
        //   225: ifnull          241
        //   228: aload_0        
        //   229: new             Lorg/json/JSONObject;
        //   232: dup            
        //   233: aload           22
        //   235: invokespecial   org/json/JSONObject.<init>:(Ljava/lang/String;)V
        //   238: invokespecial   com/whatsapp/q7.a:(Lorg/json/JSONObject;)V
        //   241: aload_0        
        //   242: getfield        com/whatsapp/q7.d:Ljava/util/ArrayList;
        //   245: areturn        
        //   246: astore          9
        //   248: aload           9
        //   250: athrow         
        //   251: astore          39
        //   253: aload           39
        //   255: athrow         
        //   256: astore          31
        //   258: aconst_null    
        //   259: astore          30
        //   261: aload           31
        //   263: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   266: aload           30
        //   268: ifnull          643
        //   271: aload           30
        //   273: invokevirtual   java/io/ObjectInputStream.close:()V
        //   276: aconst_null    
        //   277: astore          22
        //   279: goto            223
        //   282: astore          35
        //   284: aconst_null    
        //   285: astore          22
        //   287: goto            223
        //   290: astore          36
        //   292: aconst_null    
        //   293: astore          30
        //   295: aload           36
        //   297: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   300: aload           30
        //   302: ifnull          643
        //   305: aload           30
        //   307: invokevirtual   java/io/ObjectInputStream.close:()V
        //   310: aconst_null    
        //   311: astore          22
        //   313: goto            223
        //   316: astore          37
        //   318: aconst_null    
        //   319: astore          22
        //   321: goto            223
        //   324: astore          32
        //   326: aconst_null    
        //   327: astore          30
        //   329: aload           30
        //   331: ifnull          339
        //   334: aload           30
        //   336: invokevirtual   java/io/ObjectInputStream.close:()V
        //   339: aload           32
        //   341: athrow         
        //   342: astore          34
        //   344: aload           34
        //   346: athrow         
        //   347: aload           8
        //   349: invokevirtual   java/io/File.delete:()Z
        //   352: pop            
        //   353: new             Lorg/apache/http/client/methods/HttpGet;
        //   356: dup            
        //   357: aload           6
        //   359: invokespecial   org/apache/http/client/methods/HttpGet.<init>:(Ljava/lang/String;)V
        //   362: astore          11
        //   364: new             Lorg/apache/http/params/BasicHttpParams;
        //   367: dup            
        //   368: invokespecial   org/apache/http/params/BasicHttpParams.<init>:()V
        //   371: astore          12
        //   373: aload           12
        //   375: sipush          15000
        //   378: invokestatic    org/apache/http/params/HttpConnectionParams.setConnectionTimeout:(Lorg/apache/http/params/HttpParams;I)V
        //   381: aload           12
        //   383: sipush          30000
        //   386: invokestatic    org/apache/http/params/HttpConnectionParams.setSoTimeout:(Lorg/apache/http/params/HttpParams;I)V
        //   389: aload           12
        //   391: invokestatic    com/whatsapp/m3.a:()Ljava/lang/String;
        //   394: invokestatic    org/apache/http/params/HttpProtocolParams.setUserAgent:(Lorg/apache/http/params/HttpParams;Ljava/lang/String;)V
        //   397: new             Lorg/apache/http/impl/client/DefaultHttpClient;
        //   400: dup            
        //   401: aload           12
        //   403: invokespecial   org/apache/http/impl/client/DefaultHttpClient.<init>:(Lorg/apache/http/params/HttpParams;)V
        //   406: aload           11
        //   408: invokevirtual   org/apache/http/impl/client/DefaultHttpClient.execute:(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
        //   411: astore          13
        //   413: aload           13
        //   415: invokeinterface org/apache/http/HttpResponse.getStatusLine:()Lorg/apache/http/StatusLine;
        //   420: invokeinterface org/apache/http/StatusLine.getStatusCode:()I
        //   425: istore          14
        //   427: iload           14
        //   429: sipush          200
        //   432: if_icmpne       553
        //   435: aload           13
        //   437: invokeinterface org/apache/http/HttpResponse.getEntity:()Lorg/apache/http/HttpEntity;
        //   442: invokestatic    org/apache/http/util/EntityUtils.toString:(Lorg/apache/http/HttpEntity;)Ljava/lang/String;
        //   445: astore          15
        //   447: new             Ljava/io/ObjectOutputStream;
        //   450: dup            
        //   451: new             Ljava/io/FileOutputStream;
        //   454: dup            
        //   455: aload           8
        //   457: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //   460: invokespecial   java/io/ObjectOutputStream.<init>:(Ljava/io/OutputStream;)V
        //   463: astore          16
        //   465: aload           16
        //   467: aload           15
        //   469: invokevirtual   java/io/ObjectOutputStream.writeObject:(Ljava/lang/Object;)V
        //   472: aload           16
        //   474: ifnull          482
        //   477: aload           16
        //   479: invokevirtual   java/io/ObjectOutputStream.close:()V
        //   482: aload           15
        //   484: astore          22
        //   486: goto            223
        //   489: astore          17
        //   491: aload           17
        //   493: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   496: aload_1        
        //   497: ifnull          482
        //   500: aload_1        
        //   501: invokevirtual   java/io/ObjectOutputStream.close:()V
        //   504: goto            482
        //   507: astore          21
        //   509: goto            482
        //   512: astore          23
        //   514: aload           23
        //   516: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   519: aload_1        
        //   520: ifnull          482
        //   523: aload_1        
        //   524: invokevirtual   java/io/ObjectOutputStream.close:()V
        //   527: goto            482
        //   530: astore          24
        //   532: goto            482
        //   535: astore          18
        //   537: aload_1        
        //   538: ifnull          545
        //   541: aload_1        
        //   542: invokevirtual   java/io/ObjectOutputStream.close:()V
        //   545: aload           18
        //   547: athrow         
        //   548: astore          20
        //   550: aload           20
        //   552: athrow         
        //   553: new             Ljava/io/IOException;
        //   556: dup            
        //   557: new             Ljava/lang/StringBuilder;
        //   560: dup            
        //   561: invokespecial   java/lang/StringBuilder.<init>:()V
        //   564: getstatic       com/whatsapp/q7.z:[Ljava/lang/String;
        //   567: iconst_1       
        //   568: aaload         
        //   569: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   572: iload           14
        //   574: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   577: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   580: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   583: athrow         
        //   584: astore          38
        //   586: goto            223
        //   589: astore          33
        //   591: goto            339
        //   594: astore          25
        //   596: goto            482
        //   599: astore          19
        //   601: goto            545
        //   604: astore          18
        //   606: aload           16
        //   608: astore_1       
        //   609: goto            537
        //   612: astore          23
        //   614: aload           16
        //   616: astore_1       
        //   617: goto            514
        //   620: astore          17
        //   622: aload           16
        //   624: astore_1       
        //   625: goto            491
        //   628: astore          32
        //   630: goto            329
        //   633: astore          36
        //   635: goto            295
        //   638: astore          31
        //   640: goto            261
        //   643: aconst_null    
        //   644: astore          22
        //   646: goto            223
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  153    177    246    251    Ljava/io/IOException;
        //  185    203    256    261    Ljava/io/IOException;
        //  185    203    290    295    Ljava/lang/ClassNotFoundException;
        //  185    203    324    329    Any
        //  203    213    638    643    Ljava/io/IOException;
        //  203    213    633    638    Ljava/lang/ClassNotFoundException;
        //  203    213    628    633    Any
        //  218    223    584    589    Ljava/io/IOException;
        //  218    223    251    256    Ljava/lang/ClassNotFoundException;
        //  261    266    628    633    Any
        //  271    276    282    290    Ljava/io/IOException;
        //  295    300    628    633    Any
        //  305    310    316    324    Ljava/io/IOException;
        //  334    339    589    594    Ljava/io/IOException;
        //  334    339    342    347    Ljava/lang/ClassNotFoundException;
        //  447    465    489    491    Ljava/io/FileNotFoundException;
        //  447    465    512    514    Ljava/io/IOException;
        //  447    465    535    537    Any
        //  465    472    620    628    Ljava/io/FileNotFoundException;
        //  465    472    612    620    Ljava/io/IOException;
        //  465    472    604    612    Any
        //  477    482    594    599    Ljava/io/IOException;
        //  491    496    535    537    Any
        //  500    504    507    512    Ljava/io/IOException;
        //  514    519    535    537    Any
        //  523    527    530    535    Ljava/io/IOException;
        //  541    545    599    604    Ljava/io/IOException;
        //  541    545    548    553    Ljava/lang/ClassNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 291, Size: 291
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3551)
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
    
    public boolean d() {
        return this.b > this.a;
    }
}
