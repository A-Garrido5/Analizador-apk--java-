// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.ArrayList;
import android.os.AsyncTask;

class asn extends AsyncTask
{
    private static final String z;
    final CallsFragment a;
    
    static {
        final char[] charArray = "D#\u001fg\u000e\b\u0010\u0016m\u000fB1\u001bH\u001cK.\u0000_\u001cT)\\o\u0012n,1j\u001eL%\u0001d\bI&".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '}';
                    break;
                }
                case 0: {
                    c2 = '\'';
                    break;
                }
                case 1: {
                    c2 = 'B';
                    break;
                }
                case 2: {
                    c2 = 's';
                    break;
                }
                case 3: {
                    c2 = '\u000b';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    private asn(final CallsFragment a) {
        this.a = a;
    }
    
    asn(final CallsFragment callsFragment, final a83 a83) {
        this(callsFragment);
    }
    
    protected ArrayList a(final Void[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: new             Lcom/whatsapp/iz;
        //     7: dup            
        //     8: aload_0        
        //     9: invokespecial   com/whatsapp/iz.<init>:(Lcom/whatsapp/asn;)V
        //    12: astore_3       
        //    13: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //    16: iconst_0       
        //    17: bipush          100
        //    19: aload_3        
        //    20: invokevirtual   com/whatsapp/vy.a:(IILcom/whatsapp/hj;)Ljava/util/ArrayList;
        //    23: astore          4
        //    25: aload_0        
        //    26: invokevirtual   com/whatsapp/asn.isCancelled:()Z
        //    29: istore          6
        //    31: iload           6
        //    33: ifeq            43
        //    36: aconst_null    
        //    37: areturn        
        //    38: astore          5
        //    40: aload           5
        //    42: athrow         
        //    43: getstatic       com/whatsapp/asn.z:Ljava/lang/String;
        //    46: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    49: new             Ljava/util/ArrayList;
        //    52: dup            
        //    53: invokespecial   java/util/ArrayList.<init>:()V
        //    56: astore          7
        //    58: new             Lcom/whatsapp/e_;
        //    61: dup            
        //    62: aload_0        
        //    63: getfield        com/whatsapp/asn.a:Lcom/whatsapp/CallsFragment;
        //    66: invokespecial   com/whatsapp/e_.<init>:(Lcom/whatsapp/CallsFragment;)V
        //    69: astore          8
        //    71: invokestatic    com/whatsapp/Voip.h:()Lcom/whatsapp/protocol/c6;
        //    74: astore          27
        //    76: aload           27
        //    78: astore          10
        //    80: aload           4
        //    82: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //    85: astore          11
        //    87: aload           11
        //    89: invokeinterface java/util/Iterator.hasNext:()Z
        //    94: ifeq            375
        //    97: aload           11
        //    99: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   104: checkcast       Lcom/whatsapp/protocol/bi;
        //   107: astore          23
        //   109: aload           23
        //   111: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   114: aload           10
        //   116: invokevirtual   com/whatsapp/protocol/c6.equals:(Ljava/lang/Object;)Z
        //   119: ifne            368
        //   122: aload           8
        //   124: aload           23
        //   126: invokevirtual   com/whatsapp/e_.a:(Lcom/whatsapp/protocol/bi;)Z
        //   129: istore          25
        //   131: iload           25
        //   133: ifne            368
        //   136: aload           7
        //   138: aload           8
        //   140: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   143: pop            
        //   144: new             Lcom/whatsapp/e_;
        //   147: dup            
        //   148: aload_0        
        //   149: getfield        com/whatsapp/asn.a:Lcom/whatsapp/CallsFragment;
        //   152: aload           23
        //   154: invokespecial   com/whatsapp/e_.<init>:(Lcom/whatsapp/CallsFragment;Lcom/whatsapp/protocol/bi;)V
        //   157: astore          12
        //   159: iload_2        
        //   160: ifeq            361
        //   163: aload           4
        //   165: invokevirtual   java/util/ArrayList.size:()I
        //   168: bipush          100
        //   170: if_icmplt       293
        //   173: iconst_1       
        //   174: anewarray       Ljava/util/ArrayList;
        //   177: astore          15
        //   179: aload           15
        //   181: iconst_0       
        //   182: new             Ljava/util/ArrayList;
        //   185: dup            
        //   186: aload           7
        //   188: invokespecial   java/util/ArrayList.<init>:(Ljava/util/Collection;)V
        //   191: aastore        
        //   192: aload_0        
        //   193: aload           15
        //   195: invokevirtual   com/whatsapp/asn.publishProgress:([Ljava/lang/Object;)V
        //   198: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   201: bipush          100
        //   203: sipush          1000
        //   206: aload_3        
        //   207: invokevirtual   com/whatsapp/vy.a:(IILcom/whatsapp/hj;)Ljava/util/ArrayList;
        //   210: astore          16
        //   212: aload_0        
        //   213: invokevirtual   com/whatsapp/asn.isCancelled:()Z
        //   216: istore          18
        //   218: iload           18
        //   220: ifne            36
        //   223: aload           16
        //   225: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   228: astore          19
        //   230: aload           12
        //   232: astore          20
        //   234: aload           19
        //   236: invokeinterface java/util/Iterator.hasNext:()Z
        //   241: ifeq            354
        //   244: aload           19
        //   246: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   251: checkcast       Lcom/whatsapp/protocol/bi;
        //   254: astore          21
        //   256: aload           20
        //   258: aload           21
        //   260: invokevirtual   com/whatsapp/e_.a:(Lcom/whatsapp/protocol/bi;)Z
        //   263: ifne            347
        //   266: aload           7
        //   268: aload           20
        //   270: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   273: pop            
        //   274: new             Lcom/whatsapp/e_;
        //   277: dup            
        //   278: aload_0        
        //   279: getfield        com/whatsapp/asn.a:Lcom/whatsapp/CallsFragment;
        //   282: aload           21
        //   284: invokespecial   com/whatsapp/e_.<init>:(Lcom/whatsapp/CallsFragment;Lcom/whatsapp/protocol/bi;)V
        //   287: astore          12
        //   289: iload_2        
        //   290: ifeq            340
        //   293: aload           12
        //   295: invokevirtual   com/whatsapp/e_.f:()Z
        //   298: ifne            309
        //   301: aload           7
        //   303: aload           12
        //   305: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   308: pop            
        //   309: aload           7
        //   311: areturn        
        //   312: astore          9
        //   314: aload           9
        //   316: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   319: aconst_null    
        //   320: astore          10
        //   322: goto            80
        //   325: astore          24
        //   327: aload           24
        //   329: athrow         
        //   330: astore          17
        //   332: aload           17
        //   334: athrow         
        //   335: astore          13
        //   337: aload           13
        //   339: athrow         
        //   340: aload           12
        //   342: astore          20
        //   344: goto            234
        //   347: aload           20
        //   349: astore          12
        //   351: goto            289
        //   354: aload           20
        //   356: astore          12
        //   358: goto            293
        //   361: aload           12
        //   363: astore          8
        //   365: goto            87
        //   368: aload           8
        //   370: astore          12
        //   372: goto            159
        //   375: aload           8
        //   377: astore          12
        //   379: goto            163
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  25     31     38     43     Ljava/lang/UnsatisfiedLinkError;
        //  71     76     312    325    Ljava/lang/UnsatisfiedLinkError;
        //  109    131    325    330    Ljava/lang/UnsatisfiedLinkError;
        //  212    218    330    335    Ljava/lang/UnsatisfiedLinkError;
        //  293    309    335    340    Ljava/lang/UnsatisfiedLinkError;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 172, Size: 172
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
    
    protected void a(final ArrayList list) {
        CallsFragment.a(this.a, (asn)null);
        if (list != null) {
            CallsFragment.b(this.a, list);
            CallsFragment.c(this.a).getFilter().filter(CallsFragment.e(this.a));
        }
        CallsFragment.g(this.a);
        CallsFragment.f(this.a);
    }
    
    protected void a(final ArrayList[] array) {
        final ArrayList list = array[0];
        if (list != null) {
            CallsFragment.b(this.a, list);
            CallsFragment.c(this.a).getFilter().filter(CallsFragment.e(this.a));
        }
    }
    
    protected Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
    
    protected void onPostExecute(final Object o) {
        this.a((ArrayList)o);
    }
    
    protected void onProgressUpdate(final Object[] array) {
        this.a((ArrayList[])array);
    }
}
