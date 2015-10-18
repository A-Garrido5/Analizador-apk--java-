// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import android.os.AsyncTask;

class n6 extends AsyncTask
{
    final a2z a;
    
    n6(final a2z a) {
        this.a = a;
    }
    
    protected ArrayList a(final Void[] array) {
        final int a = a2z.a;
        final ArrayList j = z8.j();
        final ArrayList<Object> list = new ArrayList<Object>();
        for (final String s : j) {
            if (this.isCancelled()) {
                return null;
            }
            final a_9 e = App.S.e(s);
            if (e.l > 0) {
                final ArrayList c = App.ak.c(s, Math.min(e.l, 100));
                if (c != null) {
                    list.addAll(c);
                }
            }
            if (a != 0) {
                DialogToastActivity.h = !DialogToastActivity.h;
                break;
            }
        }
        Collections.sort(list, new l6(this));
        return list;
    }
    
    public void a(final ArrayList p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/a2z.a:I
        //     3: istore_2       
        //     4: aload_1        
        //     5: ifnull          404
        //     8: aload_0        
        //     9: getfield        com/whatsapp/n6.a:Lcom/whatsapp/a2z;
        //    12: new             Lcom/amazon/device/home/GroupedListHeroWidget;
        //    15: dup            
        //    16: invokespecial   com/amazon/device/home/GroupedListHeroWidget.<init>:()V
        //    19: invokestatic    com/whatsapp/a2z.a:(Lcom/whatsapp/a2z;Lcom/amazon/device/home/GroupedListHeroWidget;)Lcom/amazon/device/home/GroupedListHeroWidget;
        //    22: pop            
        //    23: aload_0        
        //    24: getfield        com/whatsapp/n6.a:Lcom/whatsapp/a2z;
        //    27: invokestatic    com/whatsapp/a2z.c:(Lcom/whatsapp/a2z;)Lcom/amazon/device/home/HomeManager;
        //    30: aload_1        
        //    31: invokevirtual   java/util/ArrayList.size:()I
        //    34: invokevirtual   com/amazon/device/home/HomeManager.updateNumericBadge:(I)V
        //    37: new             Ljava/util/ArrayList;
        //    40: dup            
        //    41: invokespecial   java/util/ArrayList.<init>:()V
        //    44: astore          4
        //    46: iconst_0       
        //    47: istore          5
        //    49: iload           5
        //    51: aload_1        
        //    52: invokevirtual   java/util/ArrayList.size:()I
        //    55: if_icmpge       323
        //    58: iload           5
        //    60: bipush          49
        //    62: if_icmpge       323
        //    65: new             Lcom/amazon/device/home/GroupedListHeroWidget$ListEntry;
        //    68: dup            
        //    69: aload_0        
        //    70: getfield        com/whatsapp/n6.a:Lcom/whatsapp/a2z;
        //    73: invokestatic    com/whatsapp/a2z.a:(Lcom/whatsapp/a2z;)Landroid/content/Context;
        //    76: invokespecial   com/amazon/device/home/GroupedListHeroWidget$ListEntry.<init>:(Landroid/content/Context;)V
        //    79: astore          10
        //    81: aload           10
        //    83: getstatic       com/amazon/device/home/GroupedListHeroWidget$VisualStyle.PEEKABLE:Lcom/amazon/device/home/GroupedListHeroWidget$VisualStyle;
        //    86: invokevirtual   com/amazon/device/home/GroupedListHeroWidget$ListEntry.setVisualStyle:(Lcom/amazon/device/home/GroupedListHeroWidget$VisualStyle;)Lcom/amazon/device/home/GroupedListHeroWidget$ListEntry;
        //    89: pop            
        //    90: aload_1        
        //    91: iload           5
        //    93: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //    96: checkcast       Lcom/whatsapp/protocol/bi;
        //    99: astore          12
        //   101: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   104: aload           12
        //   106: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   109: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //   112: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   115: astore          13
        //   117: aload           13
        //   119: aload_0        
        //   120: getfield        com/whatsapp/n6.a:Lcom/whatsapp/a2z;
        //   123: invokestatic    com/whatsapp/a2z.a:(Lcom/whatsapp/a2z;)Landroid/content/Context;
        //   126: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //   129: astore          14
        //   131: aload_0        
        //   132: getfield        com/whatsapp/n6.a:Lcom/whatsapp/a2z;
        //   135: invokestatic    com/whatsapp/a2z.a:(Lcom/whatsapp/a2z;)Landroid/content/Context;
        //   138: aload           12
        //   140: aload           13
        //   142: iconst_0       
        //   143: iconst_0       
        //   144: invokestatic    com/whatsapp/notification/y.a:(Landroid/content/Context;Lcom/whatsapp/protocol/bi;Lcom/whatsapp/a_9;ZZ)Ljava/lang/CharSequence;
        //   147: invokestatic    com/whatsapp/util/cq.a:(Ljava/lang/CharSequence;)Ljava/lang/String;
        //   150: astore          15
        //   152: aload_0        
        //   153: getfield        com/whatsapp/n6.a:Lcom/whatsapp/a2z;
        //   156: invokestatic    com/whatsapp/a2z.a:(Lcom/whatsapp/a2z;)Landroid/content/Context;
        //   159: aload           12
        //   161: invokestatic    com/whatsapp/App.i:(Lcom/whatsapp/protocol/bi;)J
        //   164: invokestatic    com/whatsapp/util/b6.k:(Landroid/content/Context;J)Ljava/lang/String;
        //   167: astore          16
        //   169: aload           10
        //   171: new             Lcom/amazon/device/home/HeroWidgetActivityStarterIntent;
        //   174: dup            
        //   175: ldc             Lcom/whatsapp/Conversation;.class
        //   177: invokevirtual   java/lang/Class.getCanonicalName:()Ljava/lang/String;
        //   180: aload           12
        //   182: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   185: getfield        com/whatsapp/protocol/c6.a:Ljava/lang/String;
        //   188: invokespecial   com/amazon/device/home/HeroWidgetActivityStarterIntent.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   191: invokevirtual   com/amazon/device/home/GroupedListHeroWidget$ListEntry.setContentIntent:(Lcom/amazon/device/home/HeroWidgetIntent;)Lcom/amazon/device/home/GroupedListHeroWidget$ListEntry;
        //   194: pop            
        //   195: aload           10
        //   197: aload           14
        //   199: invokestatic    com/whatsapp/util/cq.a:(Ljava/lang/CharSequence;)Ljava/lang/String;
        //   202: invokevirtual   com/amazon/device/home/GroupedListHeroWidget$ListEntry.setPrimaryText:(Ljava/lang/CharSequence;)Lcom/amazon/device/home/GroupedListHeroWidget$ListEntry;
        //   205: pop            
        //   206: aload           15
        //   208: bipush          29
        //   210: invokestatic    com/whatsapp/a2z.a:(Ljava/lang/String;I)[Ljava/lang/String;
        //   213: astore          19
        //   215: aload           10
        //   217: aload           19
        //   219: iconst_0       
        //   220: aaload         
        //   221: invokevirtual   com/amazon/device/home/GroupedListHeroWidget$ListEntry.setSecondaryText:(Ljava/lang/CharSequence;)Lcom/amazon/device/home/GroupedListHeroWidget$ListEntry;
        //   224: pop            
        //   225: aload           19
        //   227: iconst_1       
        //   228: aaload         
        //   229: invokevirtual   java/lang/String.length:()I
        //   232: sipush          256
        //   235: if_icmple       253
        //   238: aload           19
        //   240: iconst_1       
        //   241: aload           19
        //   243: iconst_1       
        //   244: aaload         
        //   245: iconst_0       
        //   246: sipush          256
        //   249: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   252: aastore        
        //   253: aload           10
        //   255: aload           19
        //   257: iconst_1       
        //   258: aaload         
        //   259: invokevirtual   com/amazon/device/home/GroupedListHeroWidget$ListEntry.setTertiaryText:(Ljava/lang/CharSequence;)Lcom/amazon/device/home/GroupedListHeroWidget$ListEntry;
        //   262: pop            
        //   263: aload           10
        //   265: aload           16
        //   267: invokevirtual   com/amazon/device/home/GroupedListHeroWidget$ListEntry.setQuaternaryText:(Ljava/lang/CharSequence;)Lcom/amazon/device/home/GroupedListHeroWidget$ListEntry;
        //   270: pop            
        //   271: aload           13
        //   273: invokevirtual   com/whatsapp/a_9.c:()Ljava/io/File;
        //   276: astore          24
        //   278: aload           24
        //   280: ifnull          303
        //   283: aload           24
        //   285: invokestatic    android/net/Uri.fromFile:(Ljava/io/File;)Landroid/net/Uri;
        //   288: astore          28
        //   290: aload           28
        //   292: ifnull          303
        //   295: aload           10
        //   297: aload           28
        //   299: invokevirtual   com/amazon/device/home/GroupedListHeroWidget$ListEntry.setPrimaryIcon:(Landroid/net/Uri;)Lcom/amazon/device/home/GroupedListHeroWidget$ListEntry;
        //   302: pop            
        //   303: aload           4
        //   305: aload           10
        //   307: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   312: pop            
        //   313: iload           5
        //   315: iconst_1       
        //   316: iadd           
        //   317: istore          26
        //   319: iload_2        
        //   320: ifeq            445
        //   323: new             Lcom/amazon/device/home/GroupedListHeroWidget$Group;
        //   326: dup            
        //   327: invokespecial   com/amazon/device/home/GroupedListHeroWidget$Group.<init>:()V
        //   330: astore          6
        //   332: aload_1        
        //   333: invokevirtual   java/util/ArrayList.size:()I
        //   336: ifeq            360
        //   339: aload           6
        //   341: aload_0        
        //   342: getfield        com/whatsapp/n6.a:Lcom/whatsapp/a2z;
        //   345: invokestatic    com/whatsapp/a2z.a:(Lcom/whatsapp/a2z;)Landroid/content/Context;
        //   348: ldc             2131230808
        //   350: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //   353: invokevirtual   com/amazon/device/home/GroupedListHeroWidget$Group.setGroupName:(Ljava/lang/CharSequence;)V
        //   356: iload_2        
        //   357: ifeq            367
        //   360: aload           6
        //   362: ldc             ""
        //   364: invokevirtual   com/amazon/device/home/GroupedListHeroWidget$Group.setGroupName:(Ljava/lang/CharSequence;)V
        //   367: aload           6
        //   369: aload           4
        //   371: invokevirtual   com/amazon/device/home/GroupedListHeroWidget$Group.setListEntries:(Ljava/util/List;)V
        //   374: aload_0        
        //   375: getfield        com/whatsapp/n6.a:Lcom/whatsapp/a2z;
        //   378: invokestatic    com/whatsapp/a2z.b:(Lcom/whatsapp/a2z;)Lcom/amazon/device/home/GroupedListHeroWidget;
        //   381: iconst_0       
        //   382: aload           6
        //   384: invokevirtual   com/amazon/device/home/GroupedListHeroWidget.addGroup:(ILcom/amazon/device/home/GroupedListHeroWidget$Group;)V
        //   387: aload_0        
        //   388: getfield        com/whatsapp/n6.a:Lcom/whatsapp/a2z;
        //   391: invokestatic    com/whatsapp/a2z.c:(Lcom/whatsapp/a2z;)Lcom/amazon/device/home/HomeManager;
        //   394: aload_0        
        //   395: getfield        com/whatsapp/n6.a:Lcom/whatsapp/a2z;
        //   398: invokestatic    com/whatsapp/a2z.b:(Lcom/whatsapp/a2z;)Lcom/amazon/device/home/GroupedListHeroWidget;
        //   401: invokevirtual   com/amazon/device/home/HomeManager.updateWidget:(Lcom/amazon/device/home/HeroWidget;)V
        //   404: return         
        //   405: astore          20
        //   407: aload           20
        //   409: athrow         
        //   410: astore          29
        //   412: aload           29
        //   414: athrow         
        //   415: astore          25
        //   417: aload           25
        //   419: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   422: goto            313
        //   425: astore          7
        //   427: aload           7
        //   429: athrow         
        //   430: astore          8
        //   432: aload           8
        //   434: athrow         
        //   435: astore          9
        //   437: aload           9
        //   439: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/Throwable;)V
        //   442: goto            387
        //   445: iload           26
        //   447: istore          5
        //   449: goto            49
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  215    253    405    410    Ljava/lang/Exception;
        //  295    303    410    415    Ljava/lang/Exception;
        //  303    313    415    425    Ljava/lang/Exception;
        //  332    356    425    430    Ljava/lang/Exception;
        //  360    367    430    435    Ljava/lang/Exception;
        //  374    387    435    445    Ljava/lang/Exception;
        //  427    430    430    435    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 209, Size: 209
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
    
    protected Object doInBackground(final Object[] array) {
        return this.a((Void[])array);
    }
    
    public void onPostExecute(final Object o) {
        this.a((ArrayList)o);
    }
}
