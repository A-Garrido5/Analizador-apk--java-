// 
// Decompiled by Procyon v0.5.30
// 

package de.greenrobot.event;

import android.os.Message;
import android.os.Looper;
import android.os.Handler;

final class l extends Handler
{
    private static final String[] z;
    private final m a;
    private boolean b;
    private final h c;
    private final int d;
    
    static {
        final String[] z2 = new String[2];
        String s = "\bz!L;k{;T\u007f8p:D\u007f#t:D3.gtM:8f5G:";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '_';
                        break;
                    }
                    case 0: {
                        c2 = 'K';
                        break;
                    }
                    case 1: {
                        c2 = '\u0015';
                        break;
                    }
                    case 2: {
                        c2 = 'T';
                        break;
                    }
                    case 3: {
                        c2 = ' ';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "\bz!L;k{;T\u007f8p:D\u007f#t:D3.gtM:8f5G:";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    l(final m a, final Looper looper, final int d) {
        super(looper);
        this.a = a;
        this.d = d;
        this.c = new h();
    }
    
    void a(final c c, final Object o) {
        final d a = de.greenrobot.event.d.a(c, o);
        synchronized (this) {
            this.c.a(a);
            if (!this.b) {
                try {
                    this.b = true;
                    if (!this.sendMessage(this.obtainMessage())) {
                        throw new j(l.z[1]);
                    }
                }
                catch (j j) {
                    throw j;
                }
            }
        }
    }
    // monitorexit(this)
    
    public void handleMessage(final Message p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       de/greenrobot/event/a.b:Z
        //     3: istore_2       
        //     4: invokestatic    android/os/SystemClock.uptimeMillis:()J
        //     7: lstore          4
        //     9: aload_0        
        //    10: getfield        de/greenrobot/event/l.c:Lde/greenrobot/event/h;
        //    13: invokevirtual   de/greenrobot/event/h.a:()Lde/greenrobot/event/d;
        //    16: astore          6
        //    18: aload           6
        //    20: ifnonnull       54
        //    23: aload_0        
        //    24: monitorenter   
        //    25: aload_0        
        //    26: getfield        de/greenrobot/event/l.c:Lde/greenrobot/event/h;
        //    29: invokevirtual   de/greenrobot/event/h.a:()Lde/greenrobot/event/d;
        //    32: astore          6
        //    34: aload           6
        //    36: ifnonnull       52
        //    39: aload_0        
        //    40: iconst_0       
        //    41: putfield        de/greenrobot/event/l.b:Z
        //    44: aload_0        
        //    45: monitorexit    
        //    46: aload_0        
        //    47: iconst_0       
        //    48: putfield        de/greenrobot/event/l.b:Z
        //    51: return         
        //    52: aload_0        
        //    53: monitorexit    
        //    54: aload_0        
        //    55: getfield        de/greenrobot/event/l.a:Lde/greenrobot/event/m;
        //    58: aload           6
        //    60: invokevirtual   de/greenrobot/event/m.a:(Lde/greenrobot/event/d;)V
        //    63: invokestatic    android/os/SystemClock.uptimeMillis:()J
        //    66: lstore          8
        //    68: lload           8
        //    70: lload           4
        //    72: lsub           
        //    73: lstore          10
        //    75: lload           10
        //    77: aload_0        
        //    78: getfield        de/greenrobot/event/l.d:I
        //    81: i2l            
        //    82: lcmp           
        //    83: iflt            9
        //    86: aload_0        
        //    87: aload_0        
        //    88: invokevirtual   de/greenrobot/event/l.obtainMessage:()Landroid/os/Message;
        //    91: invokevirtual   de/greenrobot/event/l.sendMessage:(Landroid/os/Message;)Z
        //    94: istore          14
        //    96: iload           14
        //    98: ifne            139
        //   101: new             Lde/greenrobot/event/j;
        //   104: dup            
        //   105: getstatic       de/greenrobot/event/l.z:[Ljava/lang/String;
        //   108: iconst_0       
        //   109: aaload         
        //   110: invokespecial   de/greenrobot/event/j.<init>:(Ljava/lang/String;)V
        //   113: athrow         
        //   114: astore          13
        //   116: aload           13
        //   118: athrow         
        //   119: astore_3       
        //   120: aload_0        
        //   121: iconst_0       
        //   122: putfield        de/greenrobot/event/l.b:Z
        //   125: aload_3        
        //   126: athrow         
        //   127: astore          7
        //   129: aload_0        
        //   130: monitorexit    
        //   131: aload           7
        //   133: athrow         
        //   134: astore          12
        //   136: aload           12
        //   138: athrow         
        //   139: aload_0        
        //   140: iconst_1       
        //   141: putfield        de/greenrobot/event/l.b:Z
        //   144: iload_2        
        //   145: ifeq            51
        //   148: iconst_1       
        //   149: getstatic       de/greenrobot/event/m.q:I
        //   152: iadd           
        //   153: putstatic       de/greenrobot/event/m.q:I
        //   156: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                   
        //  -----  -----  -----  -----  -----------------------
        //  4      9      119    127    Any
        //  9      18     119    127    Any
        //  23     25     119    127    Any
        //  25     34     127    134    Any
        //  39     46     127    134    Any
        //  52     54     127    134    Any
        //  54     68     119    127    Any
        //  75     96     134    139    Lde/greenrobot/event/j;
        //  75     96     119    127    Any
        //  101    114    114    119    Lde/greenrobot/event/j;
        //  101    114    119    127    Any
        //  116    119    119    127    Any
        //  129    131    127    134    Any
        //  131    134    119    127    Any
        //  136    139    114    119    Lde/greenrobot/event/j;
        //  136    139    119    127    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 86, Size: 86
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
