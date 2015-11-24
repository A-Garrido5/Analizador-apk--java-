// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import java.util.Iterator;
import com.whatsapp.a_9;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import com.whatsapp.l7;
import com.whatsapp.protocol.bi;
import com.whatsapp.App;
import com.whatsapp.qc;
import android.content.SharedPreferences;
import android.os.HandlerThread;
import android.os.Handler;
import java.util.concurrent.ConcurrentHashMap;

public final class a2
{
    private static a2 b;
    private static final String[] z;
    private final ConcurrentHashMap a;
    private Handler c;
    long d;
    private q e;
    
    static {
        final String[] z2 = new String[11];
        String s = "#\u00026&\u0006\u001b\u001e6'\u001f\"\t\u0006#\u00194\u0005)\f\u001b+\u0014<";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0307:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'v';
                        break;
                    }
                    case 0: {
                        c2 = 'D';
                        break;
                    }
                    case 1: {
                        c2 = 'p';
                        break;
                    }
                    case 2: {
                        c2 = 'Y';
                        break;
                    }
                    case 3: {
                        c2 = 'S';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "iA";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "#\u00026&\u0006\u001b\u001e6'\u001f\"\t\u0006#\u00194\u0005)";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "#\u00026&\u0006\u001b\u001e6'\u001f\"\t\u0006#\u00194\u0005)\f\u001b+\u0014<";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "*\u001f-:\u0010=/)<\u00061\u0000";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "iA";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "*\u001f-:\u0010=/)<\u00061\u0000\u0006>\u0019 \u0015";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "*\u001f-:\u0010=/)<\u00061\u0000\u0006>\u0019 \u0015";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\n\u001f-:\u0010-\u00138'\u001f+\u001e*";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "'\u001f4}\u0001,\u0011- \u00174\u0000\u0006#\u0004!\u0016<!\u0013*\u0013< ";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = ")\u0015* \u0017#\u0015\u0017<\u0002-\u001600\u00170\u00196=Y6\u0015*6\u0002\t\u0015* \u0017#\u0015*\u0015\u00196>6'\u001f\"\u0019:2\u0002-\u001f7|\u00076P5:\u00050P7&\u001a(P?<\u0004dU*";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    break Label_0307;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        a2.b = new a2();
    }
    
    public a2() {
        this.d = System.currentTimeMillis() - 200L;
        this.a = new ConcurrentHashMap();
    }
    
    private Handler a() {
        if (this.c == null) {
            final HandlerThread handlerThread = new HandlerThread(a2.z[8], 10);
            handlerThread.start();
            this.c = new Handler(handlerThread.getLooper());
        }
        return this.c;
    }
    
    public static a2 b() {
        return a2.b;
    }
    
    public int a(final SharedPreferences p0, final qc p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_3       
        //     2: aload_2        
        //     3: getstatic       com/whatsapp/qc.GROUP:Lcom/whatsapp/qc;
        //     6: if_acmpne       106
        //     9: aload_1        
        //    10: getstatic       com/whatsapp/notification/a2.z:[Ljava/lang/String;
        //    13: iconst_0       
        //    14: aaload         
        //    15: getstatic       com/whatsapp/notification/a2.z:[Ljava/lang/String;
        //    18: iconst_5       
        //    19: aaload         
        //    20: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    25: astore          13
        //    27: aload           13
        //    29: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //    32: istore          21
        //    34: iload           21
        //    36: istore          6
        //    38: iload           6
        //    40: iconst_m1      
        //    41: if_icmpne       100
        //    44: aload_1        
        //    45: getstatic       com/whatsapp/notification/a2.z:[Ljava/lang/String;
        //    48: iconst_2       
        //    49: aaload         
        //    50: iconst_0       
        //    51: invokeinterface android/content/SharedPreferences.getBoolean:(Ljava/lang/String;Z)Z
        //    56: istore          17
        //    58: iload           17
        //    60: ifeq            219
        //    63: iload_3        
        //    64: istore          6
        //    66: aload_1        
        //    67: invokeinterface android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
        //    72: astore          18
        //    74: aload           18
        //    76: getstatic       com/whatsapp/notification/a2.z:[Ljava/lang/String;
        //    79: iconst_3       
        //    80: aaload         
        //    81: iload           6
        //    83: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //    86: invokeinterface android/content/SharedPreferences$Editor.putString:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
        //    91: pop            
        //    92: aload           18
        //    94: invokeinterface android/content/SharedPreferences$Editor.commit:()Z
        //    99: pop            
        //   100: getstatic       com/whatsapp/notification/PopupNotification.A:Z
        //   103: ifeq            198
        //   106: aload_1        
        //   107: getstatic       com/whatsapp/notification/a2.z:[Ljava/lang/String;
        //   110: bipush          6
        //   112: aaload         
        //   113: getstatic       com/whatsapp/notification/a2.z:[Ljava/lang/String;
        //   116: iload_3        
        //   117: aaload         
        //   118: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   123: astore          4
        //   125: aload           4
        //   127: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   130: istore          12
        //   132: iload           12
        //   134: istore          6
        //   136: iload           6
        //   138: iconst_m1      
        //   139: if_icmpne       198
        //   142: aload_1        
        //   143: getstatic       com/whatsapp/notification/a2.z:[Ljava/lang/String;
        //   146: iconst_4       
        //   147: aaload         
        //   148: iconst_0       
        //   149: invokeinterface android/content/SharedPreferences.getBoolean:(Ljava/lang/String;Z)Z
        //   154: istore          8
        //   156: iload           8
        //   158: ifeq            238
        //   161: aload_1        
        //   162: invokeinterface android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
        //   167: astore          9
        //   169: aload           9
        //   171: getstatic       com/whatsapp/notification/a2.z:[Ljava/lang/String;
        //   174: bipush          7
        //   176: aaload         
        //   177: iload_3        
        //   178: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //   181: invokeinterface android/content/SharedPreferences$Editor.putString:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
        //   186: pop            
        //   187: aload           9
        //   189: invokeinterface android/content/SharedPreferences$Editor.commit:()Z
        //   194: pop            
        //   195: iload_3        
        //   196: istore          6
        //   198: iload           6
        //   200: ireturn        
        //   201: astore          14
        //   203: iconst_0       
        //   204: istore          6
        //   206: goto            38
        //   209: astore          15
        //   211: aload           15
        //   213: athrow         
        //   214: astore          16
        //   216: aload           16
        //   218: athrow         
        //   219: iconst_0       
        //   220: istore          6
        //   222: goto            66
        //   225: astore          5
        //   227: iconst_0       
        //   228: istore          6
        //   230: goto            136
        //   233: astore          7
        //   235: aload           7
        //   237: athrow         
        //   238: iconst_0       
        //   239: istore_3       
        //   240: goto            161
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  27     34     201    209    Ljava/lang/NumberFormatException;
        //  44     58     209    219    Ljava/lang/NumberFormatException;
        //  125    132    225    233    Ljava/lang/NumberFormatException;
        //  142    156    233    238    Ljava/lang/NumberFormatException;
        //  211    214    214    219    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 116, Size: 116
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
    
    public int a(final qc qc) {
        return this.a(App.aq.getSharedPreferences(a2.z[9], 0), qc);
    }
    
    public void a(final String s) {
        this.a(s, null);
    }
    
    public void a(final String p0, final bi p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/notification/PopupNotification.A:Z
        //     3: istore_3       
        //     4: aload_2        
        //     5: ifnonnull       31
        //     8: aload_0        
        //     9: getfield        com/whatsapp/notification/a2.a:Ljava/util/concurrent/ConcurrentHashMap;
        //    12: aload_1        
        //    13: new             Ljava/util/ArrayList;
        //    16: dup            
        //    17: invokespecial   java/util/ArrayList.<init>:()V
        //    20: invokestatic    java/util/Collections.synchronizedList:(Ljava/util/List;)Ljava/util/List;
        //    23: invokevirtual   java/util/concurrent/ConcurrentHashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    26: pop            
        //    27: iload_3        
        //    28: ifeq            108
        //    31: aload_0        
        //    32: getfield        com/whatsapp/notification/a2.a:Ljava/util/concurrent/ConcurrentHashMap;
        //    35: aload_1        
        //    36: invokevirtual   java/util/concurrent/ConcurrentHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    39: checkcast       Ljava/util/List;
        //    42: astore          4
        //    44: aload           4
        //    46: ifnull          90
        //    49: aload           4
        //    51: aload_2        
        //    52: invokeinterface java/util/List.indexOf:(Ljava/lang/Object;)I
        //    57: istore          6
        //    59: iload           6
        //    61: iconst_m1      
        //    62: if_icmple       86
        //    65: aload           4
        //    67: iload           6
        //    69: aload           4
        //    71: invokeinterface java/util/List.size:()I
        //    76: invokeinterface java/util/List.subList:(II)Ljava/util/List;
        //    81: invokeinterface java/util/List.clear:()V
        //    86: iload_3        
        //    87: ifeq            108
        //    90: getstatic       com/whatsapp/notification/a2.z:[Ljava/lang/String;
        //    93: bipush          10
        //    95: aaload         
        //    96: aconst_null    
        //    97: iconst_1       
        //    98: anewarray       Ljava/lang/Object;
        //   101: dup            
        //   102: iconst_0       
        //   103: aload_1        
        //   104: aastore        
        //   105: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V
        //   108: return         
        //   109: astore          8
        //   111: aload           8
        //   113: athrow         
        //   114: astore          7
        //   116: aload           7
        //   118: athrow         
        //   119: astore          5
        //   121: aload           5
        //   123: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  8      27     109    114    Ljava/lang/NumberFormatException;
        //  65     86     114    119    Ljava/lang/NumberFormatException;
        //  90     108    119    124    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 59, Size: 59
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
    
    public void a(final boolean p0, final boolean p1, final boolean p2, final boolean p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Lcom/whatsapp/notification/q;
        //     3: dup            
        //     4: aload_0        
        //     5: iload_1        
        //     6: iload_2        
        //     7: iload_3        
        //     8: iload           4
        //    10: invokespecial   com/whatsapp/notification/q.<init>:(Lcom/whatsapp/notification/a2;ZZZZ)V
        //    13: astore          5
        //    15: aload_0        
        //    16: getfield        com/whatsapp/notification/a2.e:Lcom/whatsapp/notification/q;
        //    19: astore          8
        //    21: aload           8
        //    23: ifnull          49
        //    26: aload_0        
        //    27: getfield        com/whatsapp/notification/a2.e:Lcom/whatsapp/notification/q;
        //    30: aload           5
        //    32: invokevirtual   com/whatsapp/notification/q.equals:(Ljava/lang/Object;)Z
        //    35: ifeq            49
        //    38: aload_0        
        //    39: invokespecial   com/whatsapp/notification/a2.a:()Landroid/os/Handler;
        //    42: aload_0        
        //    43: getfield        com/whatsapp/notification/a2.e:Lcom/whatsapp/notification/q;
        //    46: invokevirtual   android/os/Handler.removeCallbacks:(Ljava/lang/Runnable;)V
        //    49: aload_0        
        //    50: aload           5
        //    52: putfield        com/whatsapp/notification/a2.e:Lcom/whatsapp/notification/q;
        //    55: aload_0        
        //    56: invokespecial   com/whatsapp/notification/a2.a:()Landroid/os/Handler;
        //    59: aload_0        
        //    60: getfield        com/whatsapp/notification/a2.e:Lcom/whatsapp/notification/q;
        //    63: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //    66: pop            
        //    67: return         
        //    68: astore          6
        //    70: aload           6
        //    72: athrow         
        //    73: astore          7
        //    75: aload           7
        //    77: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  15     21     68     73     Ljava/lang/NumberFormatException;
        //  26     49     73     78     Ljava/lang/NumberFormatException;
        //  70     73     73     78     Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0049:
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
    
    public void b(final String s) {
        this.a().post((Runnable)new j(this, s));
        l7.v();
    }
    
    public void b(final String s, final bi bi) {
        int n = 0;
        final boolean a = PopupNotification.A;
        List<bi> list2 = null;
        Label_0104: {
            if (!this.a.containsKey(s)) {
                final a_9 e = App.S.e(s);
                List<bi> list = null;
                Label_0075: {
                    if (e.l > 1) {
                        list = Collections.synchronizedList((List<bi>)App.ak.c(s, Math.min(e.l, 7)));
                        if (!a) {
                            break Label_0075;
                        }
                    }
                    list = Collections.synchronizedList(new ArrayList<bi>());
                }
                this.a.put(s, list);
                if (!a) {
                    list2 = list;
                    break Label_0104;
                }
            }
            list2 = this.a.get(s);
        }
        final Iterator<bi> iterator = list2.iterator();
        while (true) {
            int n2 = 0;
            Label_0213: {
                Label_0159: {
                    if (iterator.hasNext()) {
                        if (iterator.next().a.equals(bi.a)) {
                            if (!a) {
                                n2 = 1;
                                break Label_0159;
                            }
                            n2 = 1;
                        }
                        else {
                            n2 = n;
                        }
                        if (!a) {
                            break Label_0213;
                        }
                    }
                    else {
                        n2 = n;
                    }
                }
                if (n2 != 0) {
                    return;
                }
                try {
                    list2.add(0, bi);
                    while (list2.size() > 7) {
                        list2.remove(-1 + list2.size());
                        if (a) {
                            break;
                        }
                    }
                    return;
                }
                catch (NumberFormatException ex) {
                    throw ex;
                }
            }
            n = n2;
        }
    }
    
    List c(final String s) {
        if (!this.a.containsKey(s)) {
            final a_9 e = App.S.e(s);
            List<Object> list = null;
            Label_0063: {
                if (e.l > 0) {
                    list = Collections.synchronizedList((List<Object>)App.ak.c(s, Math.min(e.l, 7)));
                    if (!PopupNotification.A) {
                        break Label_0063;
                    }
                }
                list = Collections.synchronizedList(new ArrayList<Object>());
            }
            this.a.put(s, list);
            return list;
        }
        return this.a.get(s);
    }
    
    public void c() {
        this.a().post((Runnable)new a_(this));
        l7.v();
    }
}
