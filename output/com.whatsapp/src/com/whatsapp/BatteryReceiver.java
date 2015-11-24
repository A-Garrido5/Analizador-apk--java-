// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.annotation.TargetApi;
import android.os.PowerManager;
import android.content.Context;
import de.greenrobot.event.m;
import android.content.Intent;
import android.content.BroadcastReceiver;

final class BatteryReceiver extends BroadcastReceiver
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[6];
        String s = "21_s\u0015:;\u0015h\u0014':UuT2<Oh\u0015=qy@.\u0007\u001aiX%\u0010\u0017zO=\u0016\u001b";
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
                        c2 = 'z';
                        break;
                    }
                    case 0: {
                        c2 = 'S';
                        break;
                    }
                    case 1: {
                        c2 = '_';
                        break;
                    }
                    case 2: {
                        c2 = ';';
                        break;
                    }
                    case 3: {
                        c2 = '\u0001';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "21_s\u0015:;\u0015n\t}>Xu\u0013<1\u0015Q5\u0004\u001ai^)\u0012\t~^7\u001c\u001b~^9\u001b\u001euF?\u0017";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "#0Ld\b";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "21_s\u0015:;\u0015h\u0014':UuT2<Oh\u0015=qy@.\u0007\u001aiX%\u0010\u0017zO=\u0016\u001b";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "21_s\u0015:;\u0015n\t}>Xu\u0013<1\u0015Q5\u0004\u001ai^)\u0012\t~^7\u001c\u001b~^9\u001b\u001euF?\u0017";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u00061^y\n6<Od\u001es>Xu\u0013<1\u0001!";
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
    
    private void a(final Intent intent) {
        m.b().c(new b5(intent));
    }
    
    @TargetApi(21)
    private void b(final Context context) {
        m.b().c(new a8o(((PowerManager)context.getSystemService(BatteryReceiver.z[2])).isPowerSaveMode()));
    }
    
    public void a(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: new             Landroid/content/IntentFilter;
        //     3: dup            
        //     4: invokespecial   android/content/IntentFilter.<init>:()V
        //     7: astore_2       
        //     8: aload_2        
        //     9: getstatic       com/whatsapp/BatteryReceiver.z:[Ljava/lang/String;
        //    12: iconst_0       
        //    13: aaload         
        //    14: invokevirtual   android/content/IntentFilter.addAction:(Ljava/lang/String;)V
        //    17: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    20: bipush          21
        //    22: if_icmplt       34
        //    25: aload_2        
        //    26: getstatic       com/whatsapp/BatteryReceiver.z:[Ljava/lang/String;
        //    29: iconst_1       
        //    30: aaload         
        //    31: invokevirtual   android/content/IntentFilter.addAction:(Ljava/lang/String;)V
        //    34: aload_1        
        //    35: aload_0        
        //    36: aload_2        
        //    37: invokevirtual   android/content/Context.registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
        //    40: pop            
        //    41: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    44: istore          7
        //    46: iload           7
        //    48: bipush          21
        //    50: if_icmplt       64
        //    53: aload_0        
        //    54: aload_1        
        //    55: invokespecial   com/whatsapp/BatteryReceiver.b:(Landroid/content/Context;)V
        //    58: getstatic       com/whatsapp/App.I:Z
        //    61: ifeq            78
        //    64: invokestatic    de/greenrobot/event/m.b:()Lde/greenrobot/event/m;
        //    67: new             Lcom/whatsapp/a8o;
        //    70: dup            
        //    71: iconst_0       
        //    72: invokespecial   com/whatsapp/a8o.<init>:(Z)V
        //    75: invokevirtual   de/greenrobot/event/m.c:(Ljava/lang/Object;)V
        //    78: return         
        //    79: astore_3       
        //    80: aload_3        
        //    81: athrow         
        //    82: astore          4
        //    84: aload           4
        //    86: athrow         
        //    87: astore          5
        //    89: aload           5
        //    91: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  8      34     79     82     Ljava/lang/IllegalArgumentException;
        //  34     46     82     87     Ljava/lang/IllegalArgumentException;
        //  53     64     87     92     Ljava/lang/IllegalArgumentException;
        //  64     78     87     92     Ljava/lang/IllegalArgumentException;
        //  84     87     87     92     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 48, Size: 48
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
    
    public void onReceive(final Context p0, final Intent p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_3       
        //     4: aload_2        
        //     5: invokevirtual   android/content/Intent.getAction:()Ljava/lang/String;
        //     8: astore          4
        //    10: iconst_m1      
        //    11: istore          5
        //    13: aload           4
        //    15: invokevirtual   java/lang/String.hashCode:()I
        //    18: istore          7
        //    20: iload           7
        //    22: lookupswitch {
        //          -1538406691: 110
        //          1779291251: 134
        //          default: 48
        //        }
        //    48: iload           5
        //    50: tableswitch {
        //                0: 167
        //                1: 176
        //          default: 72
        //        }
        //    72: new             Ljava/lang/IllegalArgumentException;
        //    75: dup            
        //    76: new             Ljava/lang/StringBuilder;
        //    79: dup            
        //    80: invokespecial   java/lang/StringBuilder.<init>:()V
        //    83: getstatic       com/whatsapp/BatteryReceiver.z:[Ljava/lang/String;
        //    86: iconst_5       
        //    87: aaload         
        //    88: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    91: aload_2        
        //    92: invokevirtual   android/content/Intent.getAction:()Ljava/lang/String;
        //    95: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    98: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   101: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   104: athrow         
        //   105: astore          10
        //   107: aload           10
        //   109: athrow         
        //   110: aload           4
        //   112: getstatic       com/whatsapp/BatteryReceiver.z:[Ljava/lang/String;
        //   115: iconst_3       
        //   116: aaload         
        //   117: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   120: istore          12
        //   122: iload           12
        //   124: ifeq            48
        //   127: iconst_0       
        //   128: istore          5
        //   130: iload_3        
        //   131: ifeq            48
        //   134: aload           4
        //   136: getstatic       com/whatsapp/BatteryReceiver.z:[Ljava/lang/String;
        //   139: iconst_4       
        //   140: aaload         
        //   141: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   144: istore          9
        //   146: iload           9
        //   148: ifeq            48
        //   151: iconst_1       
        //   152: istore          5
        //   154: goto            48
        //   157: astore          6
        //   159: aload           6
        //   161: athrow         
        //   162: astore          8
        //   164: aload           8
        //   166: athrow         
        //   167: aload_0        
        //   168: aload_2        
        //   169: invokespecial   com/whatsapp/BatteryReceiver.a:(Landroid/content/Intent;)V
        //   172: iload_3        
        //   173: ifeq            191
        //   176: aload_0        
        //   177: aload_1        
        //   178: invokespecial   com/whatsapp/BatteryReceiver.b:(Landroid/content/Context;)V
        //   181: iload_3        
        //   182: ifne            72
        //   185: return         
        //   186: astore          11
        //   188: aload           11
        //   190: athrow         
        //   191: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  13     20     157    162    Ljava/lang/IllegalArgumentException;
        //  72     105    105    110    Ljava/lang/IllegalArgumentException;
        //  110    122    157    162    Ljava/lang/IllegalArgumentException;
        //  134    146    162    167    Ljava/lang/IllegalArgumentException;
        //  167    172    186    191    Ljava/lang/IllegalArgumentException;
        //  176    181    105    110    Ljava/lang/IllegalArgumentException;
        //  188    191    105    110    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0134:
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
