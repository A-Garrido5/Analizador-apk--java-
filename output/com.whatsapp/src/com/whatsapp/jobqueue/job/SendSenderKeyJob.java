// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.jobqueue.job;

import com.whatsapp.util.Log;
import java.io.InvalidObjectException;
import android.text.TextUtils;
import java.io.ObjectInputStream;
import com.whatsapp.adc;
import com.whatsapp.aol;
import org.whispersystems.jobqueue.requirements.e;
import com.whatsapp.jobqueue.requirement.ChatConnectionRequirement;
import org.whispersystems.jobqueue.p;
import com.whatsapp.App;
import com.whatsapp.jobqueue.b;
import org.whispersystems.jobqueue.a;

public class SendSenderKeyJob extends a implements b
{
    private static final long serialVersionUID = 1L;
    private static final String[] z;
    private transient App f;
    private final String groupJid;
    private final String groupMessageId;
    private final int retryCount;
    
    static {
        final String[] z2 = new String[11];
        String s = "\u001d\u001c\u0000\u0017\u0010,\u0016\u0001\u000b\u001dO\u0014\u0001\u0016\u001dO\u0017\u001b\u0011I\r\u001cT\u000b\f\b\u0018\u0000\f\u001f\n";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0307:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'i';
                        break;
                    }
                    case 0: {
                        c2 = 'o';
                        break;
                    }
                    case 1: {
                        c2 = 'y';
                        break;
                    }
                    case 2: {
                        c2 = 't';
                        break;
                    }
                    case 3: {
                        c2 = 'e';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\b\u000b\u001b\u0010\u0019%\u0010\u0010E\u0004\u001a\n\u0000E\u000b\nY\u0015E\u000e\u001d\u0016\u0001\u0015I\u0005\u0010\u0010";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\b\u000b\u001b\u0010\u0019%\u0010\u0010E\u0004\u001a\n\u0000E\u0007\u0000\rT\u0007\fO\u001c\u0019\u0015\u001d\u0016";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\b\u000b\u001b\u0010\u0019\"\u001c\u0007\u0016\b\b\u001c=\u0001I\u0002\f\u0007\u0011I\u0001\u0016\u0000E\u000b\nY\u0011\b\u0019\u001b\u0000";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\b\u000b\u001b\u0010\u0019%\u0010\u0010E\u0004\u001a\n\u0000E\u000b\nY\u0015E\u000e\u001d\u0016\u0001\u0015I\u0005\u0010\u0010";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u001d\u001c\u0000\u0017\u0010,\u0016\u0001\u000b\u001dO\u0014\u0001\u0016\u001dO\u0017\u001b\u0011I\r\u001cT\u000b\f\b\u0018\u0000\f\u001f\n";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "TY\u0006\u0000\u001d\u001d\u00007\n\u001c\u0001\rI";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\b\u000b\u001b\u0010\u0019%\u0010\u0010X";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "TY\u0013\u0017\u0006\u001a\t9\u0000\u001a\u001c\u0018\u0013\u0000 \u000bD";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u001c\r\u0015\u0017\u001d\u0006\u0017\u0013E\u001a\n\u0017\u0010E\u001a\n\u0017\u0010\u0000\u001bO\u0012\u0011\u001cI\u0005\u0016\u0016";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "\n\u0001\u0017\u0000\u0019\u001b\u0010\u001b\u000bI\u0018\u0011\u001d\t\fO\n\u0011\u000b\r\u0006\u0017\u0013E\u001a\n\u0017\u0010\u0000\u001bO\u0012\u0011\u001c";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    break Label_0307;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public SendSenderKeyJob(final String s, final String s2, final int retryCount) {
        super(p.h().a(s).b().a(new ChatConnectionRequirement()).a());
        this.groupJid = (String)aol.a((CharSequence)s);
        this.groupMessageId = (String)aol.a((CharSequence)s2);
        this.retryCount = retryCount;
        if (!adc.b(s)) {
            throw new IllegalArgumentException(SendSenderKeyJob.z[4] + this.a());
        }
        if (retryCount < 0) {
            try {
                throw new IllegalArgumentException(SendSenderKeyJob.z[5] + this.a());
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
    }
    
    private String a() {
        return SendSenderKeyJob.z[7] + this.groupJid + SendSenderKeyJob.z[8] + this.groupMessageId + SendSenderKeyJob.z[6] + this.retryCount;
    }
    
    static String a(final SendSenderKeyJob sendSenderKeyJob) {
        return sendSenderKeyJob.groupJid;
    }
    
    static App b(final SendSenderKeyJob sendSenderKeyJob) {
        return sendSenderKeyJob.f;
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        try {
            objectInputStream.defaultReadObject();
            if (TextUtils.isEmpty((CharSequence)this.groupJid)) {
                throw new InvalidObjectException(SendSenderKeyJob.z[2] + this.a());
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            if (TextUtils.isEmpty((CharSequence)this.groupMessageId)) {
                throw new InvalidObjectException(SendSenderKeyJob.z[3] + this.a());
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
        try {
            if (!adc.b(this.groupJid)) {
                throw new InvalidObjectException(SendSenderKeyJob.z[1] + this.a());
            }
        }
        catch (IllegalArgumentException ex3) {
            throw ex3;
        }
        try {
            if (this.retryCount < 0) {
                throw new InvalidObjectException(SendSenderKeyJob.z[0] + this.a());
            }
        }
        catch (IllegalArgumentException ex4) {
            throw ex4;
        }
    }
    
    @Override
    public void a() {
    }
    
    @Override
    public void a(final App f) {
        this.f = f;
    }
    
    @Override
    public boolean a(final Exception ex) {
        Log.c(SendSenderKeyJob.z[10] + this.a(), ex);
        return true;
    }
    
    @Override
    public void f() {
    }
    
    @Override
    public void l() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_1       
        //     2: getstatic       com/whatsapp/jobqueue/job/SendE2EMessageJob.g:I
        //     5: istore_2       
        //     6: new             Ljava/lang/StringBuilder;
        //     9: dup            
        //    10: invokespecial   java/lang/StringBuilder.<init>:()V
        //    13: getstatic       com/whatsapp/jobqueue/job/SendSenderKeyJob.z:[Ljava/lang/String;
        //    16: bipush          9
        //    18: aaload         
        //    19: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    22: aload_0        
        //    23: invokespecial   com/whatsapp/jobqueue/job/SendSenderKeyJob.a:()Ljava/lang/String;
        //    26: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    29: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    32: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    35: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //    38: new             Lcom/whatsapp/protocol/c6;
        //    41: dup            
        //    42: aload_0        
        //    43: getfield        com/whatsapp/jobqueue/job/SendSenderKeyJob.groupJid:Ljava/lang/String;
        //    46: iload_1        
        //    47: aload_0        
        //    48: getfield        com/whatsapp/jobqueue/job/SendSenderKeyJob.groupMessageId:Ljava/lang/String;
        //    51: invokespecial   com/whatsapp/protocol/c6.<init>:(Ljava/lang/String;ZLjava/lang/String;)V
        //    54: invokevirtual   com/whatsapp/vy.a:(Lcom/whatsapp/protocol/c6;)Lcom/whatsapp/protocol/bi;
        //    57: astore_3       
        //    58: aload_0        
        //    59: getfield        com/whatsapp/jobqueue/job/SendSenderKeyJob.groupJid:Ljava/lang/String;
        //    62: invokestatic    com/whatsapp/adc.a:(Ljava/lang/String;)Lcom/whatsapp/atf;
        //    65: astore          4
        //    67: aload_3        
        //    68: ifnull          232
        //    71: aload_3        
        //    72: getfield        com/whatsapp/protocol/bi.I:B
        //    75: istore          11
        //    77: iload           11
        //    79: ifne            232
        //    82: aload           4
        //    84: invokevirtual   com/whatsapp/atf.m:()Ljava/lang/String;
        //    87: aload_3        
        //    88: getfield        com/whatsapp/protocol/bi.Q:Ljava/lang/String;
        //    91: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    94: istore          12
        //    96: iload           12
        //    98: ifeq            232
        //   101: getstatic       com/whatsapp/ha.a:Ljava/util/concurrent/ExecutorService;
        //   104: new             Lcom/whatsapp/jobqueue/job/b;
        //   107: dup            
        //   108: aload_0        
        //   109: iload_1        
        //   110: aload_3        
        //   111: invokespecial   com/whatsapp/jobqueue/job/b.<init>:(Lcom/whatsapp/jobqueue/job/SendSenderKeyJob;ZLcom/whatsapp/protocol/bi;)V
        //   114: invokeinterface java/util/concurrent/ExecutorService.submit:(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
        //   119: invokeinterface java/util/concurrent/Future.get:()Ljava/lang/Object;
        //   124: checkcast       Lcom/whatsapp/proto/E2E$Message;
        //   127: astore          5
        //   129: aload           4
        //   131: invokevirtual   com/whatsapp/atf.c:()Ljava/util/Set;
        //   134: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   139: astore          6
        //   141: aload           6
        //   143: invokeinterface java/util/Iterator.hasNext:()Z
        //   148: ifeq            204
        //   151: aload           6
        //   153: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   158: checkcast       Ljava/lang/String;
        //   161: astore          8
        //   163: aload_0        
        //   164: getfield        com/whatsapp/jobqueue/job/SendSenderKeyJob.f:Lcom/whatsapp/App;
        //   167: getfield        com/whatsapp/App.aG:Lorg/whispersystems/jobqueue/v;
        //   170: new             Lcom/whatsapp/jobqueue/job/SendE2EMessageJob;
        //   173: dup            
        //   174: aload           5
        //   176: aload_0        
        //   177: getfield        com/whatsapp/jobqueue/job/SendSenderKeyJob.groupMessageId:Ljava/lang/String;
        //   180: aload_0        
        //   181: getfield        com/whatsapp/jobqueue/job/SendSenderKeyJob.groupJid:Ljava/lang/String;
        //   184: aload           8
        //   186: aload_0        
        //   187: getfield        com/whatsapp/jobqueue/job/SendSenderKeyJob.retryCount:I
        //   190: aconst_null    
        //   191: aconst_null    
        //   192: aconst_null    
        //   193: aconst_null    
        //   194: invokespecial   com/whatsapp/jobqueue/job/SendE2EMessageJob.<init>:(Lcom/whatsapp/proto/E2E$Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)V
        //   197: invokevirtual   org/whispersystems/jobqueue/v.a:(Lorg/whispersystems/jobqueue/a;)V
        //   200: iload_2        
        //   201: ifeq            141
        //   204: aload           4
        //   206: invokevirtual   com/whatsapp/atf.g:()V
        //   209: getstatic       com/whatsapp/DialogToastActivity.h:Z
        //   212: ifeq            221
        //   215: iload_2        
        //   216: iconst_1       
        //   217: iadd           
        //   218: putstatic       com/whatsapp/jobqueue/job/SendE2EMessageJob.g:I
        //   221: return         
        //   222: astore          9
        //   224: aload           9
        //   226: athrow         
        //   227: astore          10
        //   229: aload           10
        //   231: athrow         
        //   232: iconst_0       
        //   233: istore_1       
        //   234: goto            101
        //   237: astore          7
        //   239: aload           7
        //   241: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  71     77     222    227    Ljava/lang/IllegalArgumentException;
        //  82     96     227    232    Ljava/lang/IllegalArgumentException;
        //  204    221    237    242    Ljava/lang/IllegalArgumentException;
        //  224    227    227    232    Ljava/lang/IllegalArgumentException;
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
