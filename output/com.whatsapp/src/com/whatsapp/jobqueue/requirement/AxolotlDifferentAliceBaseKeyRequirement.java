// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.jobqueue.requirement;

import java.io.InvalidObjectException;
import android.text.TextUtils;
import java.io.ObjectInputStream;
import com.whatsapp.a_9;
import com.whatsapp.adc;
import com.whatsapp.aol;
import com.whatsapp.App;
import org.whispersystems.jobqueue.requirements.e;
import com.whatsapp.jobqueue.b;

public class AxolotlDifferentAliceBaseKeyRequirement implements b, e
{
    private static final long serialVersionUID = 1L;
    private static final String[] z;
    private transient App a;
    private final String jid;
    private final byte[] oldAliceBaseKey;
    
    static {
        final String[] z2 = new String[4];
        String s = "u=-7\tj'=7\np iu\u0001?1$g\u0010f";
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
                        c2 = 'd';
                        break;
                    }
                    case 0: {
                        c2 = '\u001f';
                        break;
                    }
                    case 1: {
                        c2 = 'T';
                        break;
                    }
                    case 2: {
                        c2 = 'I';
                        break;
                    }
                    case 3: {
                        c2 = '\u0017';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "u=-7\tj'=7\u0006zt(yDv:-~\u0012v0<v\b?> s_?> sY";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "p8-V\bv7,U\u0005l1\u0002r\u001d?9<d\u0010?:&cD}1ir\to 0";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "u=-7\tj'=7\u0006zt(yDv:-~\u0012v0<v\b?> s_?> sY";
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
    
    public AxolotlDifferentAliceBaseKeyRequirement(final String s, final byte[] array) {
        this.jid = (String)aol.a((CharSequence)s);
        this.oldAliceBaseKey = aol.a(array);
        while (true) {
            if (!adc.b(s)) {
                try {
                    if (a_9.h(s)) {
                        throw new IllegalArgumentException(AxolotlDifferentAliceBaseKeyRequirement.z[3] + s);
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                return;
            }
            continue;
        }
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        try {
            objectInputStream.defaultReadObject();
            if (TextUtils.isEmpty((CharSequence)this.jid)) {
                throw new InvalidObjectException(AxolotlDifferentAliceBaseKeyRequirement.z[0]);
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            Label_0049: {
                if (this.oldAliceBaseKey == null) {
                    break Label_0049;
                }
                try {
                    if (this.oldAliceBaseKey.length == 0) {
                        throw new InvalidObjectException(AxolotlDifferentAliceBaseKeyRequirement.z[2]);
                    }
                }
                catch (IllegalArgumentException ex2) {
                    throw ex2;
                }
            }
        }
        catch (IllegalArgumentException ex3) {
            throw ex3;
        }
        try {
            Label_0094: {
                if (adc.b(this.jid)) {
                    break Label_0094;
                }
                try {
                    if (a_9.h(this.jid)) {
                        throw new InvalidObjectException(AxolotlDifferentAliceBaseKeyRequirement.z[1] + this.jid);
                    }
                }
                catch (IllegalArgumentException ex4) {
                    throw ex4;
                }
            }
        }
        catch (IllegalArgumentException ex5) {
            throw ex5;
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
        //     5: getfield        com/whatsapp/jobqueue/requirement/AxolotlDifferentAliceBaseKeyRequirement.jid:Ljava/lang/String;
        //     8: invokestatic    com/whatsapp/ha.g:(Ljava/lang/String;)Lorg/whispersystems/V;
        //    11: astore_2       
        //    12: aload_0        
        //    13: getfield        com/whatsapp/jobqueue/requirement/AxolotlDifferentAliceBaseKeyRequirement.a:Lcom/whatsapp/App;
        //    16: getfield        com/whatsapp/App.a2:Lcom/whatsapp/ha;
        //    19: aload_2        
        //    20: invokevirtual   com/whatsapp/ha.b:(Lorg/whispersystems/V;)Lorg/whispersystems/at;
        //    23: astore_3       
        //    24: aload_0        
        //    25: getfield        com/whatsapp/jobqueue/requirement/AxolotlDifferentAliceBaseKeyRequirement.oldAliceBaseKey:[B
        //    28: aload_3        
        //    29: invokevirtual   org/whispersystems/at.b:()Lorg/whispersystems/aL;
        //    32: invokevirtual   org/whispersystems/aL.l:()[B
        //    35: invokestatic    java/util/Arrays.equals:([B[B)Z
        //    38: istore          5
        //    40: iload           5
        //    42: ifne            78
        //    45: iconst_1       
        //    46: istore          6
        //    48: getstatic       com/whatsapp/DialogToastActivity.h:Z
        //    51: istore          9
        //    53: iload           9
        //    55: ifeq            70
        //    58: iconst_0       
        //    59: istore          10
        //    61: iload_1        
        //    62: ifeq            94
        //    65: iload           10
        //    67: putstatic       com/whatsapp/jobqueue/requirement/ChatConnectionRequirement.a:Z
        //    70: iload           6
        //    72: ireturn        
        //    73: astore          4
        //    75: aload           4
        //    77: athrow         
        //    78: iconst_0       
        //    79: istore          6
        //    81: goto            48
        //    84: astore          7
        //    86: aload           7
        //    88: athrow         
        //    89: astore          8
        //    91: aload           8
        //    93: athrow         
        //    94: iconst_1       
        //    95: istore          10
        //    97: goto            65
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  24     40     73     78     Ljava/lang/IllegalArgumentException;
        //  48     53     84     94     Ljava/lang/IllegalArgumentException;
        //  86     89     89     94     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0048:
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
    
    public byte[] a() {
        return this.oldAliceBaseKey;
    }
    
    public String b() {
        return this.jid;
    }
}
