// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.messaging;

import android.os.Message;
import java.util.LinkedList;
import com.whatsapp.protocol.bf;
import android.os.HandlerThread;

final class a4 extends HandlerThread
{
    private static final String[] z;
    private bf a;
    private final w b;
    private boolean c;
    private final LinkedList d;
    private final b7 e;
    
    static {
        final String[] z2 = new String[3];
        String s = "\u0018&r\u000e?=\u0000s\b?.0";
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
                        c2 = 'Z';
                        break;
                    }
                    case 0: {
                        c2 = 'O';
                        break;
                    }
                    case 1: {
                        c2 = 'T';
                        break;
                    }
                    case 2: {
                        c2 = '\u001b';
                        break;
                    }
                    case 3: {
                        c2 = 'z';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "::p\u001458:;3u\u0000t~\b( &;\r(& r\u0014=o tZ.'1;\u00192. ;\u00195!:~\u0019.&;u";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = ";&r\u001f>o tZ-==o\u001fz;;tZ6.&|\u001fz 2;\u001bz-!}\u001c?=to\u0015z;<~Z9'5oZ9 :u\u001f9;=t\u0014";
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
    
    public a4(final b7 e) {
        super(a4.z[0]);
        this.d = new LinkedList();
        this.b = new w(this, null);
        this.c = true;
        this.e = e;
    }
    
    private void a() {
        this.c = true;
    }
    
    private void a(final Message message) {
        this.a();
        message.getTarget().sendMessageAtFrontOfQueue(Message.obtain(message));
        this.e.a(this.a);
    }
    
    static void a(final a4 a4) {
        a4.a();
    }
    
    static void a(final a4 a4, final Message message) {
        a4.b(message);
    }
    
    static void a(final a4 a4, final bf bf) {
        a4.a(bf);
    }
    
    private void a(final bf a) {
        final boolean a2 = com.whatsapp.messaging.e.a;
        this.a = a;
        this.c = false;
        while (!this.c && !this.d.isEmpty()) {
            this.b(this.d.remove());
            if (a2) {
                break;
            }
        }
    }
    
    static bf b(final a4 a4) {
        return a4.a;
    }
    
    private void b(final Message p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/messaging/a4.c:Z
        //     4: ifeq            32
        //     7: aload_1        
        //     8: invokestatic    com/whatsapp/messaging/e.a:(Landroid/os/Message;)Z
        //    11: ifne            26
        //    14: aload_0        
        //    15: getfield        com/whatsapp/messaging/a4.d:Ljava/util/LinkedList;
        //    18: aload_1        
        //    19: invokestatic    android/os/Message.obtain:(Landroid/os/Message;)Landroid/os/Message;
        //    22: invokevirtual   java/util/LinkedList.add:(Ljava/lang/Object;)Z
        //    25: pop            
        //    26: getstatic       com/whatsapp/messaging/e.a:Z
        //    29: ifeq            40
        //    32: aload_0        
        //    33: getfield        com/whatsapp/messaging/a4.b:Lcom/whatsapp/messaging/w;
        //    36: aload_1        
        //    37: invokestatic    com/whatsapp/messaging/e.a:(Lcom/whatsapp/messaging/n;Landroid/os/Message;)V
        //    40: return         
        //    41: astore          4
        //    43: aload           4
        //    45: athrow         
        //    46: astore_3       
        //    47: getstatic       com/whatsapp/messaging/a4.z:[Ljava/lang/String;
        //    50: iconst_2       
        //    51: aaload         
        //    52: aload_3        
        //    53: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    56: return         
        //    57: astore_2       
        //    58: getstatic       com/whatsapp/messaging/a4.z:[Ljava/lang/String;
        //    61: iconst_1       
        //    62: aaload         
        //    63: aload_2        
        //    64: invokestatic    com/whatsapp/util/Log.b:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    67: aload_0        
        //    68: aload_1        
        //    69: invokespecial   com/whatsapp/messaging/a4.a:(Landroid/os/Message;)V
        //    72: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  14     26     41     46     Lcom/whatsapp/protocol/bu;
        //  32     40     46     57     Lcom/whatsapp/protocol/bu;
        //  32     40     57     73     Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0032:
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
    
    static b7 c(final a4 a4) {
        return a4.e;
    }
    
    protected void onLooperPrepared() {
        this.e.a(new p(this));
    }
}
