// 
// Decompiled by Procyon v0.5.30
// 

package de.greenrobot.event;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

class g
{
    private static final Map a;
    private static final String[] z;
    private final Map b;
    
    static {
        final String[] z2 = new String[13];
        String s = "\u0013\u007f\n_b";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0357:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'L';
                        break;
                    }
                    case 0: {
                        c2 = 'y';
                        break;
                    }
                    case 1: {
                        c2 = '\u001e';
                        break;
                    }
                    case 2: {
                        c2 = '|';
                        break;
                    }
                    case 3: {
                        c2 = '>';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "*k\u001eM/\u000bw\u001e[>Y";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0013\u007f\n_4W";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0016p9H)\u0017j";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "0r\u0010[+\u0018r\\Q\"<h\u0019P8Ys\u0019J$\u0016zP\u001e/\u0011{\u001fUl\u001fq\u000e\u001e8\u0000n\u0013MvY";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u0018p\u0018L#\u0010zR";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "4\u007f\u0015P\u0018\u0011l\u0019_(";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "8m\u0005P/";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = ";\u007f\u001fU+\u000bq\tP(-v\u000e[-\u001d";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u0016p9H)\u0017j";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "*u\u0015N<\u0010p\u001b\u001e!\u001cj\u0014Q(Y6\u0012Q8Yn\t\\ \u0010}P\u001e?\r\u007f\bW/Yq\u000e\u001e-\u001bm\bL-\u001ajU\u0004l";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\u0016p9H)\u0017j";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "Yv\u001dMl\u0017q\\N9\u001br\u0015]l\u0014{\bV#\u001dm\\]-\u0015r\u0019Zl";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    break Label_0357;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        a = new HashMap();
    }
    
    g(final List list) {
        this.b = new ConcurrentHashMap();
        if (list != null) {
            for (final Class clazz : list) {
                this.b.put(clazz, clazz);
            }
        }
    }
    
    List a(final Class p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //     4: astore_2       
        //     5: getstatic       de/greenrobot/event/g.a:Ljava/util/Map;
        //     8: astore_3       
        //     9: aload_3        
        //    10: monitorenter   
        //    11: getstatic       de/greenrobot/event/g.a:Ljava/util/Map;
        //    14: aload_2        
        //    15: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    20: checkcast       Ljava/util/List;
        //    23: astore          5
        //    25: aload_3        
        //    26: monitorexit    
        //    27: aload           5
        //    29: ifnull          42
        //    32: aload           5
        //    34: areturn        
        //    35: astore          4
        //    37: aload_3        
        //    38: monitorexit    
        //    39: aload           4
        //    41: athrow         
        //    42: new             Ljava/util/ArrayList;
        //    45: dup            
        //    46: invokespecial   java/util/ArrayList.<init>:()V
        //    49: astore          6
        //    51: new             Ljava/util/HashSet;
        //    54: dup            
        //    55: invokespecial   java/util/HashSet.<init>:()V
        //    58: astore          7
        //    60: new             Ljava/lang/StringBuilder;
        //    63: dup            
        //    64: invokespecial   java/lang/StringBuilder.<init>:()V
        //    67: astore          8
        //    69: aload_1        
        //    70: astore          9
        //    72: aload           9
        //    74: ifnull          131
        //    77: aload           9
        //    79: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //    82: astore          14
        //    84: aload           14
        //    86: getstatic       de/greenrobot/event/g.z:[Ljava/lang/String;
        //    89: iconst_0       
        //    90: aaload         
        //    91: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //    94: ifne            131
        //    97: aload           14
        //    99: getstatic       de/greenrobot/event/g.z:[Ljava/lang/String;
        //   102: iconst_2       
        //   103: aaload         
        //   104: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   107: istore          18
        //   109: iload           18
        //   111: ifne            131
        //   114: aload           14
        //   116: getstatic       de/greenrobot/event/g.z:[Ljava/lang/String;
        //   119: iconst_5       
        //   120: aaload         
        //   121: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   124: istore          19
        //   126: iload           19
        //   128: ifeq            209
        //   131: aload           6
        //   133: invokeinterface java/util/List.isEmpty:()Z
        //   138: ifeq            602
        //   141: new             Lde/greenrobot/event/j;
        //   144: dup            
        //   145: new             Ljava/lang/StringBuilder;
        //   148: dup            
        //   149: invokespecial   java/lang/StringBuilder.<init>:()V
        //   152: getstatic       de/greenrobot/event/g.z:[Ljava/lang/String;
        //   155: iconst_1       
        //   156: aaload         
        //   157: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   160: aload_1        
        //   161: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   164: getstatic       de/greenrobot/event/g.z:[Ljava/lang/String;
        //   167: bipush          12
        //   169: aaload         
        //   170: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   173: getstatic       de/greenrobot/event/g.z:[Ljava/lang/String;
        //   176: bipush          9
        //   178: aaload         
        //   179: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   182: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   185: invokespecial   de/greenrobot/event/j.<init>:(Ljava/lang/String;)V
        //   188: athrow         
        //   189: astore          10
        //   191: aload           10
        //   193: athrow         
        //   194: astore          15
        //   196: aload           15
        //   198: athrow         
        //   199: astore          16
        //   201: aload           16
        //   203: athrow         
        //   204: astore          17
        //   206: aload           17
        //   208: athrow         
        //   209: aload           9
        //   211: invokevirtual   java/lang/Class.getDeclaredMethods:()[Ljava/lang/reflect/Method;
        //   214: astore          20
        //   216: aload           20
        //   218: arraylength    
        //   219: istore          21
        //   221: iconst_0       
        //   222: istore          22
        //   224: iload           22
        //   226: iload           21
        //   228: if_icmpge       592
        //   231: aload           20
        //   233: iload           22
        //   235: aaload         
        //   236: astore          23
        //   238: aload           23
        //   240: invokevirtual   java/lang/reflect/Method.getName:()Ljava/lang/String;
        //   243: astore          24
        //   245: aload           24
        //   247: getstatic       de/greenrobot/event/g.z:[Ljava/lang/String;
        //   250: iconst_3       
        //   251: aaload         
        //   252: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   255: ifeq            398
        //   258: aload           23
        //   260: invokevirtual   java/lang/reflect/Method.getModifiers:()I
        //   263: istore          25
        //   265: iload           25
        //   267: iconst_1       
        //   268: iand           
        //   269: ifeq            529
        //   272: iload           25
        //   274: sipush          5192
        //   277: iand           
        //   278: ifne            529
        //   281: aload           23
        //   283: invokevirtual   java/lang/reflect/Method.getParameterTypes:()[Ljava/lang/Class;
        //   286: astore          28
        //   288: aload           28
        //   290: arraylength    
        //   291: iconst_1       
        //   292: if_icmpne       398
        //   295: aload           24
        //   297: getstatic       de/greenrobot/event/g.z:[Ljava/lang/String;
        //   300: bipush          11
        //   302: aaload         
        //   303: invokevirtual   java/lang/String.length:()I
        //   306: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   309: astore          29
        //   311: aload           29
        //   313: invokevirtual   java/lang/String.length:()I
        //   316: ifne            404
        //   319: getstatic       de/greenrobot/event/a.PostThread:Lde/greenrobot/event/a;
        //   322: astore          32
        //   324: aload           28
        //   326: iconst_0       
        //   327: aaload         
        //   328: astore          33
        //   330: aload           8
        //   332: iconst_0       
        //   333: invokevirtual   java/lang/StringBuilder.setLength:(I)V
        //   336: aload           8
        //   338: aload           24
        //   340: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   343: pop            
        //   344: aload           8
        //   346: bipush          62
        //   348: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   351: aload           33
        //   353: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //   356: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   359: pop            
        //   360: aload           8
        //   362: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   365: astore          36
        //   367: aload           7
        //   369: aload           36
        //   371: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //   374: ifeq            398
        //   377: aload           6
        //   379: new             Lde/greenrobot/event/p;
        //   382: dup            
        //   383: aload           23
        //   385: aload           32
        //   387: aload           33
        //   389: invokespecial   de/greenrobot/event/p.<init>:(Ljava/lang/reflect/Method;Lde/greenrobot/event/a;Ljava/lang/Class;)V
        //   392: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   397: pop            
        //   398: iinc            22, 1
        //   401: goto            224
        //   404: aload           29
        //   406: getstatic       de/greenrobot/event/g.z:[Ljava/lang/String;
        //   409: bipush          6
        //   411: aaload         
        //   412: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   415: ifeq            426
        //   418: getstatic       de/greenrobot/event/a.MainThread:Lde/greenrobot/event/a;
        //   421: astore          32
        //   423: goto            324
        //   426: aload           29
        //   428: getstatic       de/greenrobot/event/g.z:[Ljava/lang/String;
        //   431: bipush          8
        //   433: aaload         
        //   434: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   437: ifeq            448
        //   440: getstatic       de/greenrobot/event/a.BackgroundThread:Lde/greenrobot/event/a;
        //   443: astore          32
        //   445: goto            324
        //   448: aload           29
        //   450: getstatic       de/greenrobot/event/g.z:[Ljava/lang/String;
        //   453: bipush          7
        //   455: aaload         
        //   456: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   459: ifeq            470
        //   462: getstatic       de/greenrobot/event/a.Async:Lde/greenrobot/event/a;
        //   465: astore          32
        //   467: goto            324
        //   470: aload_0        
        //   471: getfield        de/greenrobot/event/g.b:Ljava/util/Map;
        //   474: aload           9
        //   476: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   481: istore          31
        //   483: iload           31
        //   485: ifne            398
        //   488: new             Lde/greenrobot/event/j;
        //   491: dup            
        //   492: new             Ljava/lang/StringBuilder;
        //   495: dup            
        //   496: invokespecial   java/lang/StringBuilder.<init>:()V
        //   499: getstatic       de/greenrobot/event/g.z:[Ljava/lang/String;
        //   502: iconst_4       
        //   503: aaload         
        //   504: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   507: aload           23
        //   509: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   512: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   515: invokespecial   de/greenrobot/event/j.<init>:(Ljava/lang/String;)V
        //   518: athrow         
        //   519: astore          30
        //   521: aload           30
        //   523: athrow         
        //   524: astore          37
        //   526: aload           37
        //   528: athrow         
        //   529: aload_0        
        //   530: getfield        de/greenrobot/event/g.b:Ljava/util/Map;
        //   533: aload           9
        //   535: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   540: ifne            398
        //   543: getstatic       de/greenrobot/event/m.s:Ljava/lang/String;
        //   546: new             Ljava/lang/StringBuilder;
        //   549: dup            
        //   550: invokespecial   java/lang/StringBuilder.<init>:()V
        //   553: getstatic       de/greenrobot/event/g.z:[Ljava/lang/String;
        //   556: bipush          10
        //   558: aaload         
        //   559: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   562: aload           9
        //   564: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   567: ldc             "."
        //   569: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   572: aload           24
        //   574: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   577: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   580: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   583: pop            
        //   584: goto            398
        //   587: astore          26
        //   589: aload           26
        //   591: athrow         
        //   592: aload           9
        //   594: invokevirtual   java/lang/Class.getSuperclass:()Ljava/lang/Class;
        //   597: astore          9
        //   599: goto            72
        //   602: getstatic       de/greenrobot/event/g.a:Ljava/util/Map;
        //   605: astore          11
        //   607: aload           11
        //   609: monitorenter   
        //   610: getstatic       de/greenrobot/event/g.a:Ljava/util/Map;
        //   613: aload_2        
        //   614: aload           6
        //   616: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   621: pop            
        //   622: aload           11
        //   624: monitorexit    
        //   625: aload           6
        //   627: areturn        
        //   628: astore          12
        //   630: aload           11
        //   632: monitorexit    
        //   633: aload           12
        //   635: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                   
        //  -----  -----  -----  -----  -----------------------
        //  11     27     35     42     Any
        //  37     39     35     42     Any
        //  84     109    194    199    Lde/greenrobot/event/j;
        //  114    126    199    209    Lde/greenrobot/event/j;
        //  131    189    189    194    Lde/greenrobot/event/j;
        //  196    199    199    209    Lde/greenrobot/event/j;
        //  201    204    204    209    Lde/greenrobot/event/j;
        //  367    398    524    529    Lde/greenrobot/event/j;
        //  470    483    519    524    Lde/greenrobot/event/j;
        //  529    584    587    592    Lde/greenrobot/event/j;
        //  610    625    628    636    Any
        //  630    633    628    636    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0131:
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
}
