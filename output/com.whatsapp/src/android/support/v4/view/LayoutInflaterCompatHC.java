// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

import android.view.LayoutInflater$Factory;
import android.support.v4.app.RemoteInputCompatBase$RemoteInput;
import android.view.LayoutInflater$Factory2;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

class LayoutInflaterCompatHC
{
    private static boolean sCheckedField;
    private static Field sLayoutInflaterFactory2Field;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[7];
        String s = "/\u0001\u0005\u001d:x@\u0018\u001a3z\u0001\u0001\u0012%4I\r\u000594T\u0002\u0016$dD\u000f\u00079p\u0001\u001e\u0016/aM\u0018\u0000r";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0207:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\\';
                        break;
                    }
                    case 0: {
                        c2 = '\u0014';
                        break;
                    }
                    case 1: {
                        c2 = '!';
                        break;
                    }
                    case 2: {
                        c2 = 'l';
                        break;
                    }
                    case 3: {
                        c2 = 's';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "rN\u001e\u00109GD\u00185=wU\u0003\u0001%&\u0001/\u001c)xEL\u001d3`\u0001\n\u001a2p\u0001\n\u001a9xELT1R@\u000f\u00073fX^T|{OL\u00100uR\u001fS";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "rN\u001e\u00109GD\u00185=wU\u0003\u0001%&\u0001\u000f\u001c)xEL\u001d3`\u0001\u001f\u0016(4U\u0004\u0016|R@\u000f\u00073fX^S3z\u0001 \u0012%{T\u0018:2rM\r\u00079f\u0001";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "/\u0001\u0005\u001d:x@\u0018\u001a3z\u0001\u0001\u0012%4I\r\u000594T\u0002\u0016$dD\u000f\u00079p\u0001\u001e\u0016/aM\u0018\u0000r";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "yg\r\u0010({S\u0015A";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "X@\u0015\u001c)`h\u0002\u00150uU\t\u0001\u001f{L\u001c\u0012(\\b";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "X@\u0015\u001c)`h\u0002\u00150uU\t\u0001\u001f{L\u001c\u0012(\\b";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    break Label_0207;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    static void forceSetFactory2(final LayoutInflater p0, final LayoutInflater$Factory2 p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       android/support/v4/view/LayoutInflaterCompatHC.sCheckedField:Z
        //     3: istore_3       
        //     4: iload_3        
        //     5: ifne            32
        //     8: ldc             Landroid/view/LayoutInflater;.class
        //    10: getstatic       android/support/v4/view/LayoutInflaterCompatHC.z:[Ljava/lang/String;
        //    13: iconst_4       
        //    14: aaload         
        //    15: invokevirtual   java/lang/Class.getDeclaredField:(Ljava/lang/String;)Ljava/lang/reflect/Field;
        //    18: putstatic       android/support/v4/view/LayoutInflaterCompatHC.sLayoutInflaterFactory2Field:Ljava/lang/reflect/Field;
        //    21: getstatic       android/support/v4/view/LayoutInflaterCompatHC.sLayoutInflaterFactory2Field:Ljava/lang/reflect/Field;
        //    24: iconst_1       
        //    25: invokevirtual   java/lang/reflect/Field.setAccessible:(Z)V
        //    28: iconst_1       
        //    29: putstatic       android/support/v4/view/LayoutInflaterCompatHC.sCheckedField:Z
        //    32: getstatic       android/support/v4/view/LayoutInflaterCompatHC.sLayoutInflaterFactory2Field:Ljava/lang/reflect/Field;
        //    35: astore          5
        //    37: aload           5
        //    39: ifnull          50
        //    42: getstatic       android/support/v4/view/LayoutInflaterCompatHC.sLayoutInflaterFactory2Field:Ljava/lang/reflect/Field;
        //    45: aload_0        
        //    46: aload_1        
        //    47: invokevirtual   java/lang/reflect/Field.set:(Ljava/lang/Object;Ljava/lang/Object;)V
        //    50: return         
        //    51: astore_2       
        //    52: aload_2        
        //    53: athrow         
        //    54: astore          8
        //    56: getstatic       android/support/v4/view/LayoutInflaterCompatHC.z:[Ljava/lang/String;
        //    59: bipush          6
        //    61: aaload         
        //    62: new             Ljava/lang/StringBuilder;
        //    65: dup            
        //    66: invokespecial   java/lang/StringBuilder.<init>:()V
        //    69: getstatic       android/support/v4/view/LayoutInflaterCompatHC.z:[Ljava/lang/String;
        //    72: iconst_1       
        //    73: aaload         
        //    74: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    77: ldc             Landroid/view/LayoutInflater;.class
        //    79: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //    82: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    85: getstatic       android/support/v4/view/LayoutInflaterCompatHC.z:[Ljava/lang/String;
        //    88: iconst_0       
        //    89: aaload         
        //    90: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    93: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    96: aload           8
        //    98: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   101: pop            
        //   102: goto            28
        //   105: astore          4
        //   107: aload           4
        //   109: athrow         
        //   110: astore          6
        //   112: getstatic       android/support/v4/view/LayoutInflaterCompatHC.z:[Ljava/lang/String;
        //   115: iconst_5       
        //   116: aaload         
        //   117: new             Ljava/lang/StringBuilder;
        //   120: dup            
        //   121: invokespecial   java/lang/StringBuilder.<init>:()V
        //   124: getstatic       android/support/v4/view/LayoutInflaterCompatHC.z:[Ljava/lang/String;
        //   127: iconst_2       
        //   128: aaload         
        //   129: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   132: aload_0        
        //   133: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   136: getstatic       android/support/v4/view/LayoutInflaterCompatHC.z:[Ljava/lang/String;
        //   139: iconst_3       
        //   140: aaload         
        //   141: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   144: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   147: aload           6
        //   149: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   152: pop            
        //   153: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  0      4      51     54     Ljava/lang/IllegalAccessException;
        //  8      28     54     105    Ljava/lang/NoSuchFieldException;
        //  8      28     51     54     Ljava/lang/IllegalAccessException;
        //  32     37     105    110    Ljava/lang/NoSuchFieldException;
        //  42     50     110    154    Ljava/lang/IllegalAccessException;
        //  42     50     105    110    Ljava/lang/NoSuchFieldException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 75, Size: 75
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
    
    static void setFactory(final LayoutInflater layoutInflater, final LayoutInflaterFactory layoutInflaterFactory) {
        final boolean a = WindowInsetsCompat.a;
        Object factory2;
        if (layoutInflaterFactory != null) {
            factory2 = new LayoutInflaterCompatHC$FactoryWrapperHC(layoutInflaterFactory);
        }
        else {
            factory2 = null;
        }
        layoutInflater.setFactory2((LayoutInflater$Factory2)factory2);
        final LayoutInflater$Factory factory3 = layoutInflater.getFactory();
        if (factory3 instanceof LayoutInflater$Factory2) {
            forceSetFactory2(layoutInflater, (LayoutInflater$Factory2)factory3);
            if (!a) {
                return;
            }
            ++RemoteInputCompatBase$RemoteInput.a;
        }
        forceSetFactory2(layoutInflater, (LayoutInflater$Factory2)factory2);
    }
}
