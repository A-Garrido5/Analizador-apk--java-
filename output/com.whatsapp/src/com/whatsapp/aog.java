// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

class aog implements Runnable
{
    private static final String z;
    double a;
    double b;
    final LocationPicker2 c;
    
    static {
        final char[] charArray = "V0".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'b';
                    break;
                }
                case 0: {
                    c2 = 'z';
                    break;
                }
                case 1: {
                    c2 = '\u0010';
                    break;
                }
                case 2: {
                    c2 = '\u001b';
                    break;
                }
                case 3: {
                    c2 = ')';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    aog(final LocationPicker2 c, final double a, final double b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: new             Landroid/location/Geocoder;
        //     7: dup            
        //     8: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //    11: invokestatic    java/util/Locale.getDefault:()Ljava/util/Locale;
        //    14: invokespecial   android/location/Geocoder.<init>:(Landroid/content/Context;Ljava/util/Locale;)V
        //    17: astore_2       
        //    18: aload_0        
        //    19: getfield        com/whatsapp/aog.c:Lcom/whatsapp/LocationPicker2;
        //    22: ldc             2131755634
        //    24: invokevirtual   com/whatsapp/LocationPicker2.findViewById:(I)Landroid/view/View;
        //    27: checkcast       Landroid/widget/TextView;
        //    30: astore_3       
        //    31: aload_2        
        //    32: aload_0        
        //    33: getfield        com/whatsapp/aog.a:D
        //    36: aload_0        
        //    37: getfield        com/whatsapp/aog.b:D
        //    40: iconst_1       
        //    41: invokevirtual   android/location/Geocoder.getFromLocation:(DDI)Ljava/util/List;
        //    44: astore          5
        //    46: aload           5
        //    48: ifnull          162
        //    51: aload           5
        //    53: invokeinterface java/util/List.isEmpty:()Z
        //    58: istore          8
        //    60: iload           8
        //    62: ifne            162
        //    65: aload           5
        //    67: iconst_0       
        //    68: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    73: checkcast       Landroid/location/Address;
        //    76: astore          9
        //    78: new             Ljava/lang/StringBuilder;
        //    81: dup            
        //    82: invokespecial   java/lang/StringBuilder.<init>:()V
        //    85: astore          10
        //    87: iconst_0       
        //    88: istore          11
        //    90: aload           9
        //    92: invokevirtual   android/location/Address.getMaxAddressLineIndex:()I
        //    95: istore          12
        //    97: iload           11
        //    99: iload           12
        //   101: if_icmpge       138
        //   104: iload           11
        //   106: ifeq            118
        //   109: aload           10
        //   111: getstatic       com/whatsapp/aog.z:Ljava/lang/String;
        //   114: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   117: pop            
        //   118: aload           10
        //   120: aload           9
        //   122: iload           11
        //   124: invokevirtual   android/location/Address.getAddressLine:(I)Ljava/lang/String;
        //   127: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   130: pop            
        //   131: iinc            11, 1
        //   134: iload_1        
        //   135: ifeq            90
        //   138: aload_0        
        //   139: getfield        com/whatsapp/aog.c:Lcom/whatsapp/LocationPicker2;
        //   142: new             Lcom/whatsapp/jr;
        //   145: dup            
        //   146: aload_0        
        //   147: aload           9
        //   149: aload           10
        //   151: aload_3        
        //   152: invokespecial   com/whatsapp/jr.<init>:(Lcom/whatsapp/aog;Landroid/location/Address;Ljava/lang/StringBuilder;Landroid/widget/TextView;)V
        //   155: invokevirtual   com/whatsapp/LocationPicker2.runOnUiThread:(Ljava/lang/Runnable;)V
        //   158: iload_1        
        //   159: ifeq            178
        //   162: aload_0        
        //   163: getfield        com/whatsapp/aog.c:Lcom/whatsapp/LocationPicker2;
        //   166: new             Lcom/whatsapp/ft;
        //   169: dup            
        //   170: aload_0        
        //   171: aload_3        
        //   172: invokespecial   com/whatsapp/ft.<init>:(Lcom/whatsapp/aog;Landroid/widget/TextView;)V
        //   175: invokevirtual   com/whatsapp/LocationPicker2.runOnUiThread:(Ljava/lang/Runnable;)V
        //   178: return         
        //   179: astore          7
        //   181: aload           7
        //   183: athrow         
        //   184: astore          4
        //   186: aload_0        
        //   187: getfield        com/whatsapp/aog.c:Lcom/whatsapp/LocationPicker2;
        //   190: new             Lcom/whatsapp/__;
        //   193: dup            
        //   194: aload_0        
        //   195: aload_3        
        //   196: invokespecial   com/whatsapp/__.<init>:(Lcom/whatsapp/aog;Landroid/widget/TextView;)V
        //   199: invokevirtual   com/whatsapp/LocationPicker2.runOnUiThread:(Ljava/lang/Runnable;)V
        //   202: return         
        //   203: astore          14
        //   205: aload           14
        //   207: athrow         
        //   208: astore          6
        //   210: aload           6
        //   212: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  31     46     184    203    Ljava/lang/Exception;
        //  51     60     179    184    Ljava/lang/Exception;
        //  65     87     184    203    Ljava/lang/Exception;
        //  90     97     184    203    Ljava/lang/Exception;
        //  109    118    203    208    Ljava/lang/Exception;
        //  118    131    184    203    Ljava/lang/Exception;
        //  138    158    208    213    Ljava/lang/Exception;
        //  162    178    208    213    Ljava/lang/Exception;
        //  181    184    184    203    Ljava/lang/Exception;
        //  205    208    184    203    Ljava/lang/Exception;
        //  210    213    184    203    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 101, Size: 101
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
}
