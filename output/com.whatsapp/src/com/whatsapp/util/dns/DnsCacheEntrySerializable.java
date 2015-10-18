// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util.dns;

import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import com.whatsapp.util.Log;
import java.net.InetAddress;
import java.io.Serializable;

public final class DnsCacheEntrySerializable implements Serializable
{
    private static final long serialVersionUID = 1L;
    private static final String[] z;
    private final Long expirationTime;
    private final boolean forceOverride;
    private final InetAddress inetAddress;
    private final Short portNumber;
    private final boolean secureSocket;
    
    static {
        final String[] z2 = new String[4];
        String s = "){v\u001ct\u000e}`\u001a{\u0019g|\fp\u001f|d3|\u0017tg3pBed-f\bSd3y\u000ftf4\\\u001dFq-|\u0003r*zf";
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
                        c2 = '\u0015';
                        break;
                    }
                    case 0: {
                        c2 = 'm';
                        break;
                    }
                    case 1: {
                        c2 = '\u0015';
                        break;
                    }
                    case 2: {
                        c2 = '\u0005';
                        break;
                    }
                    case 3: {
                        c2 = '_';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "){v\u001ct\u000e}`\u001a{\u0019g|\fp\u001f|d3|\u0017tg3pBed-f\bSd3y\u000ftf4\\\u001dFq-|\u0003r*zf";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "1i";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "Hf?zqMP]\u000f\\?P?\u007f0\u0019v";
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
    
    public DnsCacheEntrySerializable(final Long n, final InetAddress inetAddress) {
        this(n, inetAddress, null, false, false);
    }
    
    public DnsCacheEntrySerializable(final Long expirationTime, final InetAddress inetAddress, final Short portNumber, final boolean secureSocket, final boolean forceOverride) {
        this.expirationTime = expirationTime;
        this.inetAddress = inetAddress;
        this.portNumber = portNumber;
        this.secureSocket = secureSocket;
        this.forceOverride = forceOverride;
    }
    
    public static DnsCacheEntrySerializable parseFallbackIpString(final String s) {
        if (s == null) {
            return null;
        }
        final String[] split = s.split(DnsCacheEntrySerializable.z[2], 6);
        try {
            if (split.length != 6) {
                Log.b(DnsCacheEntrySerializable.z[1], null, new Object[] { s });
                return null;
            }
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
        try {
            return new DnsCacheEntrySerializable(1000L * (Long.parseLong(split[2]) + Long.parseLong(split[3])), InetAddress.getByName(split[0]), Short.parseShort(split[1]), Boolean.parseBoolean(split[4]), Boolean.parseBoolean(split[5]));
        }
        catch (NumberFormatException ex2) {}
        catch (UnknownHostException ex3) {
            goto Label_0131;
        }
    }
    
    @Override
    public boolean equals(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: ifnull          13
        //     4: aload_1        
        //     5: instanceof      Lcom/whatsapp/util/dns/DnsCacheEntrySerializable;
        //     8: istore_3       
        //     9: iload_3        
        //    10: ifne            18
        //    13: iconst_0       
        //    14: ireturn        
        //    15: astore_2       
        //    16: aload_2        
        //    17: athrow         
        //    18: aload_1        
        //    19: checkcast       Lcom/whatsapp/util/dns/DnsCacheEntrySerializable;
        //    22: astore          4
        //    24: aload_0        
        //    25: getfield        com/whatsapp/util/dns/DnsCacheEntrySerializable.expirationTime:Ljava/lang/Long;
        //    28: astore          14
        //    30: aload           4
        //    32: getfield        com/whatsapp/util/dns/DnsCacheEntrySerializable.expirationTime:Ljava/lang/Long;
        //    35: astore          15
        //    37: aload           14
        //    39: aload           15
        //    41: if_acmpeq       74
        //    44: aload_0        
        //    45: getfield        com/whatsapp/util/dns/DnsCacheEntrySerializable.expirationTime:Ljava/lang/Long;
        //    48: astore          24
        //    50: aload           24
        //    52: ifnull          13
        //    55: aload_0        
        //    56: getfield        com/whatsapp/util/dns/DnsCacheEntrySerializable.expirationTime:Ljava/lang/Long;
        //    59: aload           4
        //    61: getfield        com/whatsapp/util/dns/DnsCacheEntrySerializable.expirationTime:Ljava/lang/Long;
        //    64: invokevirtual   java/lang/Long.equals:(Ljava/lang/Object;)Z
        //    67: istore          25
        //    69: iload           25
        //    71: ifeq            13
        //    74: aload_0        
        //    75: getfield        com/whatsapp/util/dns/DnsCacheEntrySerializable.inetAddress:Ljava/net/InetAddress;
        //    78: astore          16
        //    80: aload           4
        //    82: getfield        com/whatsapp/util/dns/DnsCacheEntrySerializable.inetAddress:Ljava/net/InetAddress;
        //    85: astore          17
        //    87: aload           16
        //    89: aload           17
        //    91: if_acmpeq       124
        //    94: aload_0        
        //    95: getfield        com/whatsapp/util/dns/DnsCacheEntrySerializable.inetAddress:Ljava/net/InetAddress;
        //    98: astore          22
        //   100: aload           22
        //   102: ifnull          13
        //   105: aload_0        
        //   106: getfield        com/whatsapp/util/dns/DnsCacheEntrySerializable.inetAddress:Ljava/net/InetAddress;
        //   109: aload           4
        //   111: getfield        com/whatsapp/util/dns/DnsCacheEntrySerializable.inetAddress:Ljava/net/InetAddress;
        //   114: invokevirtual   java/net/InetAddress.equals:(Ljava/lang/Object;)Z
        //   117: istore          23
        //   119: iload           23
        //   121: ifeq            13
        //   124: aload_0        
        //   125: getfield        com/whatsapp/util/dns/DnsCacheEntrySerializable.portNumber:Ljava/lang/Short;
        //   128: astore          18
        //   130: aload           4
        //   132: getfield        com/whatsapp/util/dns/DnsCacheEntrySerializable.portNumber:Ljava/lang/Short;
        //   135: astore          19
        //   137: aload           18
        //   139: aload           19
        //   141: if_acmpeq       174
        //   144: aload_0        
        //   145: getfield        com/whatsapp/util/dns/DnsCacheEntrySerializable.portNumber:Ljava/lang/Short;
        //   148: astore          20
        //   150: aload           20
        //   152: ifnull          13
        //   155: aload_0        
        //   156: getfield        com/whatsapp/util/dns/DnsCacheEntrySerializable.portNumber:Ljava/lang/Short;
        //   159: aload           4
        //   161: getfield        com/whatsapp/util/dns/DnsCacheEntrySerializable.portNumber:Ljava/lang/Short;
        //   164: invokevirtual   java/lang/Short.equals:(Ljava/lang/Object;)Z
        //   167: istore          21
        //   169: iload           21
        //   171: ifeq            13
        //   174: iconst_1       
        //   175: ireturn        
        //   176: astore          5
        //   178: aload           5
        //   180: athrow         
        //   181: astore          6
        //   183: aload           6
        //   185: athrow         
        //   186: astore          7
        //   188: aload           7
        //   190: athrow         
        //   191: astore          8
        //   193: aload           8
        //   195: athrow         
        //   196: astore          9
        //   198: aload           9
        //   200: athrow         
        //   201: astore          10
        //   203: aload           10
        //   205: athrow         
        //   206: astore          11
        //   208: aload           11
        //   210: athrow         
        //   211: astore          12
        //   213: aload           12
        //   215: athrow         
        //   216: astore          13
        //   218: aload           13
        //   220: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      9      15     18     Ljava/lang/NumberFormatException;
        //  24     37     176    181    Ljava/lang/NumberFormatException;
        //  44     50     181    186    Ljava/lang/NumberFormatException;
        //  55     69     186    191    Ljava/lang/NumberFormatException;
        //  74     87     191    196    Ljava/lang/NumberFormatException;
        //  94     100    196    201    Ljava/lang/NumberFormatException;
        //  105    119    201    206    Ljava/lang/NumberFormatException;
        //  124    137    206    211    Ljava/lang/NumberFormatException;
        //  144    150    211    216    Ljava/lang/NumberFormatException;
        //  155    169    216    221    Ljava/lang/NumberFormatException;
        //  178    181    181    186    Ljava/lang/NumberFormatException;
        //  183    186    186    191    Ljava/lang/NumberFormatException;
        //  188    191    191    196    Ljava/lang/NumberFormatException;
        //  193    196    196    201    Ljava/lang/NumberFormatException;
        //  198    201    201    206    Ljava/lang/NumberFormatException;
        //  203    206    206    211    Ljava/lang/NumberFormatException;
        //  208    211    211    216    Ljava/lang/NumberFormatException;
        //  213    216    216    221    Ljava/lang/NumberFormatException;
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
    
    public Long getExpirationTime() {
        return this.expirationTime;
    }
    
    public InetAddress getInetAddress() {
        return this.inetAddress;
    }
    
    public InetSocketAddress getInetSocketAddress() {
        try {
            if (this.inetAddress == null) {
                return null;
            }
            final DnsCacheEntrySerializable dnsCacheEntrySerializable = this;
            final Short n = dnsCacheEntrySerializable.portNumber;
            if (n == null) {
                return null;
            }
            return new InetSocketAddress(this.inetAddress, this.portNumber);
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
        try {
            final DnsCacheEntrySerializable dnsCacheEntrySerializable = this;
            final Short n = dnsCacheEntrySerializable.portNumber;
            if (n == null) {
                return null;
            }
        }
        catch (NumberFormatException ex2) {
            throw ex2;
        }
        return new InetSocketAddress(this.inetAddress, this.portNumber);
    }
    
    public Short getPortNumber() {
        return this.portNumber;
    }
    
    @Override
    public int hashCode() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/util/dns/DnsCacheEntrySerializable.expirationTime:Ljava/lang/Long;
        //     4: ifnull          92
        //     7: aload_0        
        //     8: getfield        com/whatsapp/util/dns/DnsCacheEntrySerializable.expirationTime:Ljava/lang/Long;
        //    11: invokevirtual   java/lang/Long.hashCode:()I
        //    14: istore          12
        //    16: iload           12
        //    18: istore_2       
        //    19: bipush          41
        //    21: iload_2        
        //    22: bipush          41
        //    24: iadd           
        //    25: imul           
        //    26: istore_3       
        //    27: aload_0        
        //    28: getfield        com/whatsapp/util/dns/DnsCacheEntrySerializable.inetAddress:Ljava/net/InetAddress;
        //    31: ifnull          102
        //    34: aload_0        
        //    35: getfield        com/whatsapp/util/dns/DnsCacheEntrySerializable.inetAddress:Ljava/net/InetAddress;
        //    38: invokevirtual   java/net/InetAddress.hashCode:()I
        //    41: istore          11
        //    43: iload           11
        //    45: istore          5
        //    47: bipush          41
        //    49: iload           5
        //    51: iload_3        
        //    52: iadd           
        //    53: imul           
        //    54: istore          6
        //    56: aload_0        
        //    57: getfield        com/whatsapp/util/dns/DnsCacheEntrySerializable.portNumber:Ljava/lang/Short;
        //    60: astore          8
        //    62: iconst_0       
        //    63: istore          9
        //    65: aload           8
        //    67: ifnull          83
        //    70: aload_0        
        //    71: getfield        com/whatsapp/util/dns/DnsCacheEntrySerializable.portNumber:Ljava/lang/Short;
        //    74: invokevirtual   java/lang/Short.hashCode:()I
        //    77: istore          10
        //    79: iload           10
        //    81: istore          9
        //    83: iload           6
        //    85: iload           9
        //    87: iadd           
        //    88: ireturn        
        //    89: astore_1       
        //    90: aload_1        
        //    91: athrow         
        //    92: iconst_0       
        //    93: istore_2       
        //    94: goto            19
        //    97: astore          4
        //    99: aload           4
        //   101: athrow         
        //   102: iconst_0       
        //   103: istore          5
        //   105: goto            47
        //   108: astore          7
        //   110: aload           7
        //   112: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      16     89     92     Ljava/lang/NumberFormatException;
        //  27     43     97     102    Ljava/lang/NumberFormatException;
        //  56     62     108    113    Ljava/lang/NumberFormatException;
        //  70     79     108    113    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 62, Size: 62
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
    
    public boolean isExpired() {
        try {
            if (this.expirationTime == null) {
                return false;
            }
            final long n = System.currentTimeMillis();
            final DnsCacheEntrySerializable dnsCacheEntrySerializable = this;
            final Long n2 = dnsCacheEntrySerializable.expirationTime;
            final long n3 = n2;
            final long n4 = lcmp(n, n3);
            if (n4 >= 0) {
                return true;
            }
            return false;
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
        try {
            final long n = System.currentTimeMillis();
            final DnsCacheEntrySerializable dnsCacheEntrySerializable = this;
            final Long n2 = dnsCacheEntrySerializable.expirationTime;
            final long n3 = n2;
            final long n4 = lcmp(n, n3);
            if (n4 >= 0) {
                return true;
            }
        }
        catch (NumberFormatException ex2) {
            throw ex2;
        }
        return false;
    }
    
    public boolean isForceOverride() {
        return this.forceOverride;
    }
    
    public boolean isSecureSocket() {
        return this.secureSocket;
    }
    
    @Override
    public String toString() {
        return String.format(DnsCacheEntrySerializable.z[3], this.inetAddress, this.portNumber, this.expirationTime);
    }
}
