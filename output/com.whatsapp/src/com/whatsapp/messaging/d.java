// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import java.net.InetSocketAddress;
import java.io.IOException;
import com.whatsapp.util.Log;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;
import android.content.Context;

public final class d
{
    private static boolean a;
    private static String b;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = "'\u0007\n<{\u0017I\u001f17\u0000\f\u00181{\u0004\fK:r\u0010\u001c\f~\u007f\u001d\u001a\u001f";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0017';
                        break;
                    }
                    case 0: {
                        c2 = 'r';
                        break;
                    }
                    case 1: {
                        c2 = 'i';
                        break;
                    }
                    case 2: {
                        c2 = 'k';
                        break;
                    }
                    case 3: {
                        c2 = '^';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "6\f\t+pR\u0001\u0004-cR\u0004\n'7\u0010\fK\u0017G\u0004_E~C\u001a\u0000\u0018~~\u0001I\u00051cR\f\u0013.{\u001b\n\u0002*{\u000bI\u0018+g\u0002\u0006\u0019*r\u0016I\n*7\u0006\u0001\u0002-7\u0006\u0000\u0006;9";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "\u0016\f\t+p-\n\u0003?c-\u0001\u0004-c";
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    private static File a(final Context context) {
        return new File(context.getFilesDir(), d.z[2]);
    }
    
    private static String a(final File file) {
        while (true) {
            synchronized (d.class) {
                try {
                    if (d.a) {
                        return d.b;
                    }
                }
                catch (FileNotFoundException ex) {
                    throw ex;
                }
            }
            try {
                final ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
                final Object object = objectInputStream.readObject();
                objectInputStream.close();
                d.b = (String)object;
                d.a = true;
                return d.b;
            }
            catch (IOException ex2) {
                Log.c(ex2);
            }
            catch (ClassNotFoundException ex3) {
                Log.c(ex3);
            }
            catch (ClassCastException ex4) {
                Log.c(ex4);
            }
            catch (FileNotFoundException ex5) {}
            return null;
        }
    }
    
    static InetSocketAddress b(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.aV:I
        //     3: istore_2       
        //     4: iload_2        
        //     5: iconst_3       
        //     6: if_icmpge       14
        //     9: aconst_null    
        //    10: areturn        
        //    11: astore_1       
        //    12: aload_1        
        //    13: athrow         
        //    14: sipush          5222
        //    17: istore_3       
        //    18: aload_0        
        //    19: invokestatic    com/whatsapp/messaging/d.a:(Landroid/content/Context;)Ljava/io/File;
        //    22: invokestatic    com/whatsapp/messaging/d.a:(Ljava/io/File;)Ljava/lang/String;
        //    25: astore          4
        //    27: aload           4
        //    29: ifnull          9
        //    32: aload           4
        //    34: bipush          58
        //    36: invokevirtual   java/lang/String.indexOf:(I)I
        //    39: iconst_m1      
        //    40: if_icmpeq       96
        //    43: aload           4
        //    45: ldc             ":"
        //    47: iconst_m1      
        //    48: invokevirtual   java/lang/String.split:(Ljava/lang/String;I)[Ljava/lang/String;
        //    51: astore          7
        //    53: aload           7
        //    55: arraylength    
        //    56: iconst_2       
        //    57: if_icmpeq       78
        //    60: getstatic       com/whatsapp/messaging/d.z:[Ljava/lang/String;
        //    63: iconst_1       
        //    64: aaload         
        //    65: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //    68: getstatic       com/whatsapp/messaging/e.a:Z
        //    71: istore          11
        //    73: iload           11
        //    75: ifeq            96
        //    78: aload           7
        //    80: iconst_0       
        //    81: aaload         
        //    82: astore          4
        //    84: aload           7
        //    86: iconst_1       
        //    87: aaload         
        //    88: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //    91: istore          10
        //    93: iload           10
        //    95: istore_3       
        //    96: getstatic       com/whatsapp/App.g:Lcom/whatsapp/util/dns/b;
        //    99: aload           4
        //   101: invokevirtual   com/whatsapp/util/dns/b.d:(Ljava/lang/String;)Ljava/util/List;
        //   104: astore          6
        //   106: new             Ljava/net/InetSocketAddress;
        //   109: dup            
        //   110: aload           6
        //   112: iconst_0       
        //   113: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   118: checkcast       Ljava/net/InetAddress;
        //   121: iload_3        
        //   122: invokespecial   java/net/InetSocketAddress.<init>:(Ljava/net/InetAddress;I)V
        //   125: areturn        
        //   126: astore          8
        //   128: aload           8
        //   130: athrow         
        //   131: astore          9
        //   133: aload           9
        //   135: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/Throwable;)V
        //   138: aconst_null    
        //   139: areturn        
        //   140: astore          5
        //   142: getstatic       com/whatsapp/messaging/d.z:[Ljava/lang/String;
        //   145: iconst_0       
        //   146: aaload         
        //   147: aload           5
        //   149: invokestatic    com/whatsapp/util/Log.c:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   152: aconst_null    
        //   153: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      4      11     14     Ljava/lang/NumberFormatException;
        //  53     73     126    131    Ljava/lang/NumberFormatException;
        //  84     93     131    140    Ljava/lang/NumberFormatException;
        //  96     106    140    154    Ljava/net/UnknownHostException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 80, Size: 80
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
    
    public static String c(final Context context) {
        return a(a(context));
    }
}
