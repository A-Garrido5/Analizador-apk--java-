// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Comparator;
import java.util.Arrays;
import com.whatsapp.util.Log;
import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;
import java.io.File;

public class qf
{
    private static File a;
    private static File b;
    private static File c;
    private static File d;
    private static File e;
    private static File f;
    private static File g;
    private static File h;
    private static File i;
    private static SimpleDateFormat j;
    private static boolean k;
    private static File l;
    private static File m;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[30];
        String s = "\u0002\u001c8~3\u0005\u00168d/K\u0001/h0\u0005\u00038K/\b\u00158\u007f`";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0782:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '@';
                        break;
                    }
                    case 0: {
                        c2 = 'd';
                        break;
                    }
                    case 1: {
                        c2 = 'q';
                        break;
                    }
                    case 2: {
                        c2 = ']';
                        break;
                    }
                    case 3: {
                        c2 = '\r';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "J\u001f2`%\u0000\u0018<";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = ")\u00149d!";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "3\u0019<y3%\u0001--\u0001\u0011\u00154b";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "3\u0019<y3%\u0001--\t\t\u0010:h3";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "3\u0019<y3%\u0001--\u0016\u000b\u0018>h`*\u001e)h3";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "3\u00101a\u0010\u0005\u00018\u007f";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "7\u00143y";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "7\u00143y";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "3\u0019<y3%\u0001--\u0016\r\u00158b";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "3\u0019<y3%\u0001--\u0010\u0016\u001e;d,\u0001Q\re/\u0010\u001e.";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "7\u00143y";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "3\u0019<y3%\u0001--\u0003\u0005\u001d1~";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    s = "J\"5l2\u0001\u0015";
                    n = 12;
                    n2 = 13;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    array = z2;
                    s = "\u0002\u001c8~3\u0005\u00168d/K\u00121h!\u001672a$\u0001\u0003}";
                    n = 13;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "\u0002\u001c8~3\u0005\u00168d/K\u00121h!\u001672a$\u0001\u0003}";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "D\u00152h3D\u001f2y`\u0001\t4~4";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "\u0002\u001c8~3\u0005\u00168d/K\u00121h!\u001672a$\u0001\u0003}";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "D\u0012<c`\n\u001e)-,\r\u0002)-&\r\u001d8~";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "D\u0018.-.\u000b\u0005}l`\u0000\u0018/";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "D\u00174a%D\u001c<t`\b\u0018+h`\u0002\u001e/-";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "\u0002\u001c8~3\u0005\u00168d/K\u00121h!\u001672a$\u0001\u0003}";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "D\u00028n/\n\u0015.!`\u0000\u0018/-3\r\u000b8-,\r\u001c4y`";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "D\u00158a%\u0010\u00149-";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "\u0002\u001c8~3\u0005\u00168d/K\u00121h!\u001672a$\u0001\u0003}";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "\u0002\u001c8~3\u0005\u00168d/K\u00121h!\u001672a$\u0001\u0003}";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "J\u001f2`%\u0000\u0018<";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "D\u0014/\u007f/\u0016Q*e%\nQ9h,\u0001\u00054c'D";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = ")\u00149d!";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "\u001d\b$t7\u0013";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    break Label_0782;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        qf.j = new SimpleDateFormat(qf.z[29], Locale.US);
    }
    
    public static File a() {
        if (!qf.k) {
            i();
        }
        return b(qf.c);
    }
    
    public static File a(final byte b, final int n, final boolean b2) {
        final boolean i = App.I;
        if (!qf.k) {
            i();
        }
        if (b == 2) {
            if (n == 1) {
                final File file = new File(qf.i, qf.j.format(new Date()));
                if (!i) {
                    return a(file, b2);
                }
            }
            File file;
            if (b2) {
                file = qf.d;
            }
            else {
                file = qf.f;
            }
            if (!i) {
                return a(file, b2);
            }
        }
        if (b == 1) {
            File file;
            if (b2) {
                file = qf.m;
            }
            else {
                file = qf.e;
            }
            if (!i) {
                return a(file, b2);
            }
        }
        if (b == 3) {
            File file;
            if (b2) {
                file = qf.g;
            }
            else {
                file = qf.a;
            }
            if (!i) {
                return a(file, b2);
            }
        }
        File file = new File(App.M, qf.z[28]);
        return a(file, b2);
    }
    
    private static File a(final File p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokevirtual   java/io/File.exists:()Z
        //     4: ifeq            137
        //     7: aload_0        
        //     8: invokevirtual   java/io/File.isFile:()Z
        //    11: istore          10
        //    13: iload           10
        //    15: ifeq            77
        //    18: aload_0        
        //    19: invokevirtual   java/io/File.delete:()Z
        //    22: pop            
        //    23: iconst_0       
        //    24: istore          4
        //    26: iload           4
        //    28: ifne            36
        //    31: aload_0        
        //    32: invokevirtual   java/io/File.mkdirs:()Z
        //    35: pop            
        //    36: iload_1        
        //    37: ifeq            69
        //    40: new             Ljava/io/File;
        //    43: dup            
        //    44: aload_0        
        //    45: getstatic       com/whatsapp/qf.z:[Ljava/lang/String;
        //    48: iconst_1       
        //    49: aaload         
        //    50: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    53: astore          5
        //    55: aload           5
        //    57: invokevirtual   java/io/File.exists:()Z
        //    60: ifne            69
        //    63: aload           5
        //    65: invokevirtual   java/io/File.createNewFile:()Z
        //    68: pop            
        //    69: aload_0        
        //    70: areturn        
        //    71: astore_2       
        //    72: aload_2        
        //    73: athrow         
        //    74: astore_3       
        //    75: aload_3        
        //    76: athrow         
        //    77: aload_0        
        //    78: invokevirtual   java/io/File.isDirectory:()Z
        //    81: ifeq            137
        //    84: iconst_1       
        //    85: istore          4
        //    87: goto            26
        //    90: astore          8
        //    92: aload           8
        //    94: athrow         
        //    95: astore          6
        //    97: new             Ljava/lang/StringBuilder;
        //   100: dup            
        //   101: invokespecial   java/lang/StringBuilder.<init>:()V
        //   104: getstatic       com/whatsapp/qf.z:[Ljava/lang/String;
        //   107: iconst_0       
        //   108: aaload         
        //   109: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   112: aload_0        
        //   113: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   116: ldc             " "
        //   118: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   121: aload           6
        //   123: invokevirtual   java/io/IOException.toString:()Ljava/lang/String;
        //   126: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   129: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   132: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   135: aload_0        
        //   136: areturn        
        //   137: iconst_0       
        //   138: istore          4
        //   140: goto            26
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      13     71     74     Ljava/io/IOException;
        //  18     23     74     77     Ljava/io/IOException;
        //  31     36     90     95     Ljava/io/IOException;
        //  63     69     95     137    Ljava/io/IOException;
        //  72     74     74     77     Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 73, Size: 73
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
    
    public static boolean a(final File file) {
        if (!qf.k) {
            i();
        }
        return file != null && file.getAbsolutePath().startsWith(qf.l.getAbsolutePath());
    }
    
    private static boolean a(final File file, final long n, final long n2) {
        final boolean i = App.I;
        Log.i(qf.z[14] + file + qf.z[20] + n / 1000L + qf.z[22] + n2);
        if (file == null || !file.exists()) {
            Log.e(qf.z[15] + file + qf.z[16]);
            return false;
        }
        if (!file.isDirectory()) {
            Log.e(qf.z[25] + file + qf.z[19]);
            return false;
        }
        final File[] listFiles = file.listFiles();
        if (listFiles == null) {
            Log.e(qf.z[21] + file + qf.z[18]);
            return false;
        }
        Arrays.sort(listFiles, new zv());
        final long n3 = System.currentTimeMillis() - n;
        final int length = listFiles.length;
        int j = 0;
        long n4 = n2;
        while (j < length) {
            final File file2 = listFiles[j];
            final long length2 = file2.length();
            Label_0398: {
                if (!file2.getName().equals(qf.z[26]) || i) {
                    if (file2.lastModified() >= n3 && length2 <= n4) {
                        n4 -= length2;
                        if (!i) {
                            break Label_0398;
                        }
                    }
                    if (file2.delete()) {
                        Log.i(qf.z[17] + file + qf.z[23] + file2);
                        if (!i) {
                            break Label_0398;
                        }
                    }
                    Log.e(qf.z[24] + file + qf.z[27] + file2);
                }
            }
            ++j;
            if (i) {
                break;
            }
        }
        return true;
    }
    
    public static boolean a(final boolean b) {
        if (b) {
            return a(c(), 0L, 0L);
        }
        return a(c(), 86400000L, 524288000L);
    }
    
    public static File b() {
        return new File(App.M, qf.z[13]);
    }
    
    private static File b(final File file) {
        return a(file, false);
    }
    
    public static File c() {
        if (!qf.k) {
            i();
        }
        return qf.h;
    }
    
    public static File d() {
        if (!qf.k) {
            i();
        }
        return b(qf.l);
    }
    
    public static File e() {
        if (!qf.k) {
            i();
        }
        return b(qf.b);
    }
    
    public static File f() {
        if (!qf.k) {
            i();
        }
        return qf.f;
    }
    
    public static File g() {
        if (!qf.k) {
            i();
        }
        return qf.a;
    }
    
    public static File h() {
        if (!qf.k) {
            i();
        }
        return qf.e;
    }
    
    public static void i() {
        qf.l = b(new File(App.M, qf.z[2]));
        qf.f = b(new File(qf.l, qf.z[3]));
        qf.i = a(new File(qf.l, qf.z[5]), true);
        qf.a = b(new File(qf.l, qf.z[9]));
        qf.e = b(new File(qf.l, qf.z[4]));
        qf.c = b(new File(qf.l, qf.z[6]));
        qf.b = b(new File(qf.l, qf.z[10]));
        qf.h = a(new File(qf.l, qf.z[12]), true);
        qf.d = a(new File(qf.f, qf.z[11]), true);
        qf.g = a(new File(qf.a, qf.z[8]), true);
        qf.m = a(new File(qf.e, qf.z[7]), true);
        qf.k = true;
    }
    
    public static File j() {
        if (!qf.k) {
            i();
        }
        return qf.i;
    }
}
