// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.BufferedOutputStream;
import java.util.Iterator;
import java.util.Collection;
import com.whatsapp.util.dns.DnsCacheEntrySerializable;
import java.util.HashSet;
import java.io.ObjectInputStream;
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.util.ArrayList;
import android.content.Context;

final class a5
{
    private static final String[] z;
    private final Context a;
    
    static {
        final String[] z2 = new String[8];
        String s = "q\u001d\u0018cK";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0232:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '8';
                        break;
                    }
                    case 0: {
                        c2 = '\u0017';
                        break;
                    }
                    case 1: {
                        c2 = '\u007f';
                        break;
                    }
                    case 2: {
                        c2 = 'q';
                        break;
                    }
                    case 3: {
                        c2 = '\u0013';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "q\u001d\u0018cK";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "q\u001d\u0018cK";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "o\u0012\u0001c\u0017d\u001a\u0003eQt\u001a^uY{\u0013\u0013r[|P\u0002rNr9\u0010\u007fTu\u001e\u0012xK";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "o\u0012\u0001c\u0017d\u001a\u0003eQt\u001a^uY{\u0013\u0013r[|P\u001d|Ys9\u0010\u007fTu\u001e\u0012xK";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "q\u001d\u0018cK";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "T34Rj";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "q\u001d\u0018cK";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    break Label_0232;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public a5(final Context a) {
        this.a = a;
    }
    
    private ArrayList a() {
        final boolean a = e.a;
        final ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(this.a.openFileInput(a5.z[0])));
        final ArrayList list = (ArrayList)objectInputStream.readObject();
        objectInputStream.close();
        final HashSet<Object> set = new HashSet<Object>();
        for (final DnsCacheEntrySerializable dnsCacheEntrySerializable : list) {
            if (dnsCacheEntrySerializable.isExpired()) {
                set.add(dnsCacheEntrySerializable);
            }
            if (a) {
                break;
            }
        }
        if (!set.isEmpty()) {
            list.removeAll(set);
            if (list.isEmpty()) {
                this.a.deleteFile(a5.z[1]);
                if (!a) {
                    return list;
                }
            }
            this.a(list);
        }
        return list;
    }
    
    private void a(final ArrayList list) {
        final ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(this.a.openFileOutput(a5.z[7], 0)));
        objectOutputStream.writeObject(list);
        objectOutputStream.close();
    }
    
    public ArrayList a(final String[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_0       
        //     1: istore_2       
        //     2: getstatic       com/whatsapp/messaging/e.a:Z
        //     5: istore_3       
        //     6: aload_1        
        //     7: ifnonnull       73
        //    10: new             Ljava/io/File;
        //    13: dup            
        //    14: aload_0        
        //    15: getfield        com/whatsapp/messaging/a5.a:Landroid/content/Context;
        //    18: invokevirtual   android/content/Context.getFilesDir:()Ljava/io/File;
        //    21: getstatic       com/whatsapp/messaging/a5.z:[Ljava/lang/String;
        //    24: iconst_2       
        //    25: aaload         
        //    26: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    29: invokevirtual   java/io/File.canRead:()Z
        //    32: istore          15
        //    34: iload           15
        //    36: ifeq            65
        //    39: aload_0        
        //    40: invokespecial   com/whatsapp/messaging/a5.a:()Ljava/util/ArrayList;
        //    43: astore          17
        //    45: aload           17
        //    47: areturn        
        //    48: astore          14
        //    50: aload           14
        //    52: athrow         
        //    53: astore          16
        //    55: getstatic       com/whatsapp/messaging/a5.z:[Ljava/lang/String;
        //    58: iconst_4       
        //    59: aaload         
        //    60: aload           16
        //    62: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    65: new             Ljava/util/ArrayList;
        //    68: dup            
        //    69: invokespecial   java/util/ArrayList.<init>:()V
        //    72: areturn        
        //    73: aload_1        
        //    74: arraylength    
        //    75: iconst_1       
        //    76: if_icmpne       133
        //    79: aload_1        
        //    80: iconst_0       
        //    81: aaload         
        //    82: getstatic       com/whatsapp/messaging/a5.z:[Ljava/lang/String;
        //    85: bipush          6
        //    87: aaload         
        //    88: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //    91: istore          11
        //    93: iload           11
        //    95: ifeq            133
        //    98: aload_0        
        //    99: getfield        com/whatsapp/messaging/a5.a:Landroid/content/Context;
        //   102: getstatic       com/whatsapp/messaging/a5.z:[Ljava/lang/String;
        //   105: iconst_5       
        //   106: aaload         
        //   107: invokevirtual   android/content/Context.deleteFile:(Ljava/lang/String;)Z
        //   110: pop            
        //   111: new             Ljava/util/ArrayList;
        //   114: dup            
        //   115: invokespecial   java/util/ArrayList.<init>:()V
        //   118: astore          13
        //   120: aload           13
        //   122: areturn        
        //   123: astore          5
        //   125: aload           5
        //   127: athrow         
        //   128: astore          4
        //   130: aload           4
        //   132: athrow         
        //   133: new             Ljava/util/ArrayList;
        //   136: dup            
        //   137: invokespecial   java/util/ArrayList.<init>:()V
        //   140: astore          6
        //   142: aload_1        
        //   143: arraylength    
        //   144: istore          7
        //   146: iload_2        
        //   147: iload           7
        //   149: if_icmpge       172
        //   152: aload_1        
        //   153: iload_2        
        //   154: aaload         
        //   155: invokestatic    com/whatsapp/util/dns/DnsCacheEntrySerializable.parseFallbackIpString:(Ljava/lang/String;)Lcom/whatsapp/util/dns/DnsCacheEntrySerializable;
        //   158: astore          9
        //   160: aload           9
        //   162: ifnonnull       196
        //   165: iinc            2, 1
        //   168: iload_3        
        //   169: ifeq            146
        //   172: aload_0        
        //   173: aload           6
        //   175: invokespecial   com/whatsapp/messaging/a5.a:(Ljava/util/ArrayList;)V
        //   178: aload           6
        //   180: areturn        
        //   181: astore          8
        //   183: getstatic       com/whatsapp/messaging/a5.z:[Ljava/lang/String;
        //   186: iconst_3       
        //   187: aaload         
        //   188: aload           8
        //   190: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   193: aload           6
        //   195: areturn        
        //   196: aload           6
        //   198: aload           9
        //   200: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   203: pop            
        //   204: goto            165
        //   207: astore          16
        //   209: goto            55
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  10     34     48     53     Ljava/io/IOException;
        //  39     45     53     55     Ljava/io/IOException;
        //  39     45     207    212    Ljava/lang/ClassNotFoundException;
        //  73     93     128    133    Ljava/io/IOException;
        //  98     120    123    128    Ljava/io/IOException;
        //  130    133    123    128    Ljava/io/IOException;
        //  172    178    181    196    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 110, Size: 110
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
