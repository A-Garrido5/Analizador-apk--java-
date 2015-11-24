// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.jobqueue.requirement;

import java.io.InvalidObjectException;
import android.text.TextUtils;
import java.io.ObjectInputStream;
import com.whatsapp.adc;
import com.whatsapp.aol;
import com.whatsapp.App;
import org.whispersystems.jobqueue.requirements.e;
import com.whatsapp.jobqueue.b;

public final class AxolotlSenderKeyRequirement implements b, e
{
    private static final long serialVersionUID = 1L;
    private static final String[] z;
    private transient App a;
    private final String groupJid;
    
    static {
        final String[] z2 = new String[4];
        String s = "LMZPzmJ\u0007Fb|\u0010\u001aBf";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0012';
                        break;
                    }
                    case 0: {
                        c2 = '\f';
                        break;
                    }
                    case 1: {
                        c2 = '>';
                        break;
                    }
                    case 2: {
                        c2 = 't';
                        break;
                    }
                    case 3: {
                        c2 = '\'';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "kL\u001bRbFW\u0010\u0007{\u007f\u001e\u001aHf,_T@`cK\u0004\u0007xeZO\u0007u~Q\u0001WXeZI";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "kL\u001bRbFW\u0010\u0007{\u007f\u001e\u001aHf,_T@`cK\u0004\u0007xeZO\u0007u~Q\u0001WXeZI";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "kL\u001bRbFW\u0010\u0007\u007fyM\u0000\u0007|cJTEw,[\u0019Wfu";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public AxolotlSenderKeyRequirement(final String s) {
        this.groupJid = (String)aol.a((CharSequence)s);
        if (!adc.b(s)) {
            throw new IllegalArgumentException(AxolotlSenderKeyRequirement.z[1] + s);
        }
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        try {
            objectInputStream.defaultReadObject();
            if (TextUtils.isEmpty((CharSequence)this.groupJid)) {
                throw new InvalidObjectException(AxolotlSenderKeyRequirement.z[3]);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            if (!adc.b(this.groupJid)) {
                throw new InvalidObjectException(AxolotlSenderKeyRequirement.z[2] + this.groupJid);
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
    }
    
    @Override
    public void a(final App a) {
        this.a = a;
    }
    
    @Override
    public boolean a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/jobqueue/requirement/ChatConnectionRequirement.a:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/jobqueue/requirement/AxolotlSenderKeyRequirement.a:Lcom/whatsapp/App;
        //     8: getfield        com/whatsapp/App.a2:Lcom/whatsapp/ha;
        //    11: invokevirtual   com/whatsapp/ha.h:()Lcom/whatsapp/ni;
        //    14: astore_2       
        //    15: new             Ljava/lang/StringBuilder;
        //    18: dup            
        //    19: invokespecial   java/lang/StringBuilder.<init>:()V
        //    22: getstatic       com/whatsapp/App.aX:Lcom/whatsapp/App$Me;
        //    25: getfield        com/whatsapp/App$Me.jabber_id:Ljava/lang/String;
        //    28: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    31: getstatic       com/whatsapp/jobqueue/requirement/AxolotlSenderKeyRequirement.z:[Ljava/lang/String;
        //    34: iconst_0       
        //    35: aaload         
        //    36: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    39: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    42: invokestatic    com/whatsapp/ha.g:(Ljava/lang/String;)Lorg/whispersystems/V;
        //    45: astore_3       
        //    46: aload_2        
        //    47: new             Lorg/whispersystems/aq;
        //    50: dup            
        //    51: aload_0        
        //    52: getfield        com/whatsapp/jobqueue/requirement/AxolotlSenderKeyRequirement.groupJid:Ljava/lang/String;
        //    55: aload_3        
        //    56: invokespecial   org/whispersystems/aq.<init>:(Ljava/lang/String;Lorg/whispersystems/V;)V
        //    59: invokevirtual   com/whatsapp/ni.a:(Lorg/whispersystems/aq;)Lorg/whispersystems/aT;
        //    62: astore          4
        //    64: aload           4
        //    66: invokevirtual   org/whispersystems/aT.a:()Z
        //    69: istore          7
        //    71: iload           7
        //    73: ifne            136
        //    76: aload_0        
        //    77: getfield        com/whatsapp/jobqueue/requirement/AxolotlSenderKeyRequirement.groupJid:Ljava/lang/String;
        //    80: invokestatic    com/whatsapp/adc.a:(Ljava/lang/String;)Lcom/whatsapp/atf;
        //    83: invokevirtual   com/whatsapp/atf.c:()Ljava/util/Set;
        //    86: invokeinterface java/util/Set.isEmpty:()Z
        //    91: istore          12
        //    93: iload           12
        //    95: ifeq            136
        //    98: iconst_1       
        //    99: istore          8
        //   101: iload_1        
        //   102: ifeq            123
        //   105: getstatic       com/whatsapp/DialogToastActivity.h:Z
        //   108: istore          10
        //   110: iconst_0       
        //   111: istore          11
        //   113: iload           10
        //   115: ifeq            147
        //   118: iload           11
        //   120: putstatic       com/whatsapp/DialogToastActivity.h:Z
        //   123: iload           8
        //   125: ireturn        
        //   126: astore          5
        //   128: aload           5
        //   130: athrow         
        //   131: astore          6
        //   133: aload           6
        //   135: athrow         
        //   136: iconst_0       
        //   137: istore          8
        //   139: goto            101
        //   142: astore          9
        //   144: aload           9
        //   146: athrow         
        //   147: iconst_1       
        //   148: istore          11
        //   150: goto            118
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  64     71     126    131    Ljava/lang/IllegalArgumentException;
        //  76     93     131    136    Ljava/lang/IllegalArgumentException;
        //  105    110    142    147    Ljava/lang/IllegalArgumentException;
        //  128    131    131    136    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 71, Size: 71
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
