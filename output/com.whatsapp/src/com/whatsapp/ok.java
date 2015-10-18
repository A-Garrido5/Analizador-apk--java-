// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.content.Context;
import java.io.IOException;
import android.os.SystemClock;
import android.os.AsyncTask;

public class ok extends AsyncTask
{
    private static final String[] z;
    String a;
    ct b;
    Runnable c;
    Runnable d;
    final EnterPhoneNumber e;
    String f;
    
    static {
        final String[] z2 = new String[61];
        String s = "rSzT\u0013gUa_\u00048Ok@\u0014rNz\u001e";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_1557:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'a';
                        break;
                    }
                    case 0: {
                        c2 = '\u0017';
                        break;
                    }
                    case 1: {
                        c2 = '=';
                        break;
                    }
                    case 2: {
                        c2 = '\u000e';
                        break;
                    }
                    case 3: {
                        c2 = '1';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "rSzT\u0013gUa_\u00048Ok@\u0014rNz\u001e";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "rSzT\u0013gUa_\u00048Ok@\u0014rNz\u001e";
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    s = "8M|^\u0017~YkCLcTcT\u000ebI!_\u000e:Ig\\\u0004";
                    n = 2;
                    array = z2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "dXbWLdX`ULyR#C\u000ebIkB";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "rSzT\u0013gUa_\u00048Ok@\u0014rNz\u001e";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "rSzT\u0013gUa_\u00048Ok@\u0014rNz\u001e";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u007fIzA\u0012-\u0012!F\tvI}P\u0011g\u0013m^\f8\\`U\u0013xTj";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "dXbWLdX`ULcRa\u001c\fvSw\u001c\u0006bX}B\u0004d";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "8_oULg\\|P\frIkC";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "8M|^\u0017~YkCLbS|^\u0014c\\l]\u00048Sa\u001c\u0015~Pk";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "8Sa\u001c\u0013xHzT\u0012";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "rSzT\u0013gUa_\u00048Ok@\u0014rNz\u001e";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "8Ia^Lz\\`HLcOgT\u0012";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    s = "rSzT\u0013gUa_\u00048Ok@\u0014rNz\u001e";
                    n = 13;
                    n2 = 14;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    array = z2;
                    s = "rSzT\u0013gUa_\u00048[oX\rrY#E\u000e:H~U\u0000cX#T\u0019gT|P\u0015~R`";
                    n = 14;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "rSzT\u0013gUa_\u00048Ok@\u0014rNz\u001e";
                    n = 15;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "rSzT\u0013gUa_\u00048Ok@\u0014rNz\u001e";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "8Ia^LeXmT\u000fc";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "dXbWLdX`ULcRa\u001c\fvSw\u001c\u0015eTkBLvQb\u001c\frIf^\u0005d";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "8Ia^LeXmT\u000fc\u0012zX\fr\u0010`^\u0015:T`E";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "8M|^\u0017~YkCLcTcT\u000ebI!_\u000e:Ig\\\u0004";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "rSzT\u0013gUa_\u00048Ok@\u0014rNz\u001e";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    s = "rSzT\u0013gUa_\u00048Ok@\u0014rNz\u001e";
                    n = 22;
                    n2 = 23;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    array = z2;
                    s = "rSzT\u0013gUa_\u00048Ok@\u0014rNz\u001e";
                    n = 23;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "rSzT\u0013gUa_\u00048Ok@\u0014rNz\u001e";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "rSzT\u0013gUa_\u00048Ok@\u0014rNz\u001e";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "8_oULcReT\u000f";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "8H`B\u0011r^gW\brY";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "rSzT\u0013gUa_\u00048Ok@\u0014rNz\u001e";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "8M|^\u0017~YkCLbS|^\u0014c\\l]\u0004";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "8M|^\u0017~YkCLcTcT\u000ebI";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "zT}B\byZ.A\u0000e\\cT\u0015rO";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "8Ia^LeXmT\u000fc\u0012zX\fr\u0010`^\u0015:T`E";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "dXbWLdX`ULcRa\u001c\fvSw\u001c\u0015eTkB";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "dXbWLdX`ULyRz\u001c\u0011rOcX\u0015cXj";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    array[n2] = intern;
                    n2 = 36;
                    s = "8KkC\u0012~R`\u001c\u0015xR#^\rs";
                    n = 35;
                    array = z2;
                    continue;
                }
                case 35: {
                    array[n2] = intern;
                    n2 = 37;
                    s = "dXbWLdX`ULyXvELzXzY\u000es";
                    n = 36;
                    array = z2;
                    continue;
                }
                case 36: {
                    array[n2] = intern;
                    n2 = 38;
                    s = "8Ia^Lz\\`HLcOgT\u0012:\\b]LzXzY\u000esN";
                    n = 37;
                    array = z2;
                    continue;
                }
                case 37: {
                    array[n2] = intern;
                    n2 = 39;
                    s = "8_b^\u0002|Xj";
                    n = 38;
                    array = z2;
                    continue;
                }
                case 38: {
                    array[n2] = intern;
                    n2 = 40;
                    s = "rSzT\u0013gUa_\u00048Ok@\u0014rNz\u001e";
                    n = 39;
                    array = z2;
                    continue;
                }
                case 39: {
                    array[n2] = intern;
                    n2 = 41;
                    s = "rSzT\u0013gUa_\u00048Ok@\u0014rNz\u001c\u0002xYk\u001c\u0013rT`B\u0015vQb\u001e\u0007vTbT\u0005";
                    n = 40;
                    array = z2;
                    continue;
                }
                case 40: {
                    array[n2] = intern;
                    n2 = 42;
                    s = "rSzT\u0013gUa_\u00048Ok@\u0014rNz\u001e";
                    n = 41;
                    array = z2;
                    continue;
                }
                case 41: {
                    array[n2] = intern;
                    n2 = 43;
                    s = "8PgB\u0012~Si\u001c\u0011vOo\\\u0004cX|";
                    n = 42;
                    array = z2;
                    continue;
                }
                case 42: {
                    array[n2] = intern;
                    n2 = 44;
                    s = "8M|^\u0017~YkCLbS|^\u0014c\\l]\u00048Sa\u001c\u0015~Pk";
                    n = 43;
                    array = z2;
                    continue;
                }
                case 43: {
                    array[n2] = intern;
                    n2 = 45;
                    s = "8Ia^Lz\\`HLcOgT\u0012";
                    n = 44;
                    array = z2;
                    continue;
                }
                case 44: {
                    array[n2] = intern;
                    n2 = 46;
                    s = "rSzT\u0013gUa_\u00048Ok@\u0014rNz\u001e";
                    n = 45;
                    array = z2;
                    continue;
                }
                case 45: {
                    array[n2] = intern;
                    n2 = 47;
                    s = "8SkI\u0015:PkE\txY";
                    n = 46;
                    array = z2;
                    continue;
                }
                case 46: {
                    array[n2] = intern;
                    n2 = 48;
                    s = "rSzT\u0013gUa_\u00048Ok@\u0014rNz\u001e";
                    n = 47;
                    array = z2;
                    continue;
                }
                case 47: {
                    array[n2] = intern;
                    s = "8SaELgX|\\\bcIkU";
                    n = 48;
                    n2 = 49;
                    array = z2;
                    continue;
                }
                case 48: {
                    array[n2] = intern;
                    n2 = 50;
                    array = z2;
                    s = "rSzT\u0013gUa_\u00048Ok@\u0014rNz\u001e";
                    n = 49;
                    continue;
                }
                case 49: {
                    array[n2] = intern;
                    n2 = 51;
                    s = "u\\j\u0011\u0011vOo\\\u0004cX|";
                    n = 50;
                    array = z2;
                    continue;
                }
                case 50: {
                    array[n2] = intern;
                    n2 = 52;
                    s = "rSzT\u0013gUa_\u00048Ok@\u0014rNz\u001e";
                    n = 51;
                    array = z2;
                    continue;
                }
                case 51: {
                    array[n2] = intern;
                    n2 = 53;
                    s = "rSzT\u0013gUa_\u00048Ok@\u0014rNz\u001c\u0002xYk\u001c\u0013rT`B\u0015vQb";
                    n = 52;
                    array = z2;
                    continue;
                }
                case 52: {
                    array[n2] = intern;
                    n2 = 54;
                    s = "dXbW";
                    n = 53;
                    array = z2;
                    continue;
                }
                case 53: {
                    array[n2] = intern;
                    n2 = 55;
                    s = "d[";
                    n = 54;
                    array = z2;
                    continue;
                }
                case 54: {
                    array[n2] = intern;
                    n2 = 56;
                    s = "rSzT\u0013gUa_\u00048Ok@\u0014rNz\u001e";
                    n = 55;
                    array = z2;
                    continue;
                }
                case 55: {
                    array[n2] = intern;
                    n2 = 57;
                    s = "eXhD\u0012rY";
                    n = 56;
                    array = z2;
                    continue;
                }
                case 56: {
                    array[n2] = intern;
                    n2 = 58;
                    s = "8X|C\u000ee\u001d";
                    n = 57;
                    array = z2;
                    continue;
                }
                case 57: {
                    array[n2] = intern;
                    n2 = 59;
                    s = "8TaT\u0013eR|\u0011";
                    n = 58;
                    array = z2;
                    continue;
                }
                case 58: {
                    array[n2] = intern;
                    n2 = 60;
                    s = "rSzT\u0013gUa_\u00048Ok@\u0014rNz\u001e";
                    n = 59;
                    array = z2;
                    continue;
                }
                case 59: {
                    break Label_1557;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    protected ok(final EnterPhoneNumber e, final Runnable c, final Runnable d) {
        this.e = e;
        this.a = ok.z[54];
        this.f = ok.z[55];
        this.c = c;
        this.d = d;
    }
    
    private void a(final String p0, final boolean p1, final String p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: putstatic       com/whatsapp/EnterPhoneNumber.v:Ljava/lang/String;
        //     4: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //     7: getstatic       com/whatsapp/EnterPhoneNumber.v:Ljava/lang/String;
        //    10: invokestatic    com/whatsapp/VerifyNumber.a:(Ljava/lang/String;)Ljava/lang/String;
        //    13: invokestatic    com/whatsapp/App.b:(Landroid/content/Context;Ljava/lang/String;)V
        //    16: bipush          15
        //    18: putstatic       com/whatsapp/EnterPhoneNumber.s:I
        //    21: aload_0        
        //    22: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //    25: invokevirtual   com/whatsapp/EnterPhoneNumber.b:()V
        //    28: aload_0        
        //    29: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //    32: iload_2        
        //    33: putfield        com/whatsapp/EnterPhoneNumber.t:Z
        //    36: aload_3        
        //    37: ifnull          44
        //    40: aload_3        
        //    41: putstatic       com/whatsapp/VerifyNumber.m:Ljava/lang/String;
        //    44: aload_0        
        //    45: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //    48: aload_0        
        //    49: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //    52: getfield        com/whatsapp/EnterPhoneNumber.t:Z
        //    55: invokevirtual   com/whatsapp/EnterPhoneNumber.b:(Z)V
        //    58: aload_0        
        //    59: getfield        com/whatsapp/ok.c:Ljava/lang/Runnable;
        //    62: ifnull          74
        //    65: aload_0        
        //    66: getfield        com/whatsapp/ok.c:Ljava/lang/Runnable;
        //    69: invokeinterface java/lang/Runnable.run:()V
        //    74: aload_0        
        //    75: getfield        com/whatsapp/ok.d:Ljava/lang/Runnable;
        //    78: ifnull          90
        //    81: aload_0        
        //    82: getfield        com/whatsapp/ok.d:Ljava/lang/Runnable;
        //    85: invokeinterface java/lang/Runnable.run:()V
        //    90: return         
        //    91: astore          4
        //    93: aload           4
        //    95: athrow         
        //    96: astore          5
        //    98: aload           5
        //   100: athrow         
        //   101: astore          6
        //   103: aload           6
        //   105: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      36     91     96     Ljava/lang/NumberFormatException;
        //  40     44     91     96     Ljava/lang/NumberFormatException;
        //  44     74     96     101    Ljava/lang/NumberFormatException;
        //  74     90     101    106    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 47, Size: 47
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
    
    protected pf a(final String[] array) {
        while (true) {
            final pf error_UNSPECIFIED = pf.ERROR_UNSPECIFIED;
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                if (elapsedRealtime < EnterPhoneNumber.u) {
                    this.b = new ct(pf.ERROR_TOO_RECENT);
                    this.b.g = (EnterPhoneNumber.u - elapsedRealtime) / 1000L + "";
                    return pf.ERROR_TOO_RECENT;
                }
            }
            catch (IOException ex) {
                throw ex;
            }
            try {
                this.b = VerifyNumber.a((Context)this.e, EnterPhoneNumber.z, EnterPhoneNumber.w, this.a, VerifyNumber.m);
                return this.b.b;
            }
            catch (IOException ex2) {
                final String string = ex2.toString();
                try {
                    Log.e(ok.z[56] + this.f + ok.z[59] + string);
                    if (string != null && string.contains(ok.z[57])) {
                        final pf pf = com.whatsapp.pf.ERROR_UNSPECIFIED;
                        if (!App.I) {
                            return pf;
                        }
                    }
                    return pf.ERROR_CONNECTIVITY;
                }
                catch (IOException ex3) {
                    throw ex3;
                }
            }
            catch (Exception ex4) {
                Log.b(ok.z[60] + this.f + ok.z[58], ex4);
                return error_UNSPECIFIED;
            }
        }
    }
    
    protected void a(final pf p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //     8: ldc             ""
        //    10: invokevirtual   com/whatsapp/EnterPhoneNumber.c:(Ljava/lang/String;)V
        //    13: aload_0        
        //    14: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //    17: invokevirtual   com/whatsapp/EnterPhoneNumber.a:()V
        //    20: bipush          14
        //    22: putstatic       com/whatsapp/EnterPhoneNumber.s:I
        //    25: aload_0        
        //    26: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //    29: invokevirtual   com/whatsapp/EnterPhoneNumber.b:()V
        //    32: aload_0        
        //    33: getfield        com/whatsapp/ok.b:Lcom/whatsapp/ct;
        //    36: ifnonnull       80
        //    39: aload_0        
        //    40: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //    43: getfield        com/whatsapp/EnterPhoneNumber.q:Z
        //    46: istore          123
        //    48: iload           123
        //    50: ifne            1304
        //    53: aload_0        
        //    54: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //    57: invokevirtual   com/whatsapp/EnterPhoneNumber.isFinishing:()Z
        //    60: istore          124
        //    62: iload           124
        //    64: ifne            1304
        //    67: aload_0        
        //    68: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //    71: bipush          109
        //    73: invokevirtual   com/whatsapp/EnterPhoneNumber.showDialog:(I)V
        //    76: iload_2        
        //    77: ifeq            1304
        //    80: getstatic       com/whatsapp/pf.YES_WITH_CODE:Lcom/whatsapp/pf;
        //    83: astore          9
        //    85: aload_1        
        //    86: aload           9
        //    88: if_acmpne       130
        //    91: aload_0        
        //    92: getfield        com/whatsapp/ok.b:Lcom/whatsapp/ct;
        //    95: getfield        com/whatsapp/ct.h:Ljava/lang/String;
        //    98: astore          121
        //   100: aload           121
        //   102: ifnull          1333
        //   105: iconst_1       
        //   106: istore          122
        //   108: iload           122
        //   110: invokestatic    com/whatsapp/util/Log.b:(Z)V
        //   113: aload_0        
        //   114: aload_0        
        //   115: getfield        com/whatsapp/ok.b:Lcom/whatsapp/ct;
        //   118: getfield        com/whatsapp/ct.h:Ljava/lang/String;
        //   121: iconst_0       
        //   122: aconst_null    
        //   123: invokespecial   com/whatsapp/ok.a:(Ljava/lang/String;ZLjava/lang/String;)V
        //   126: iload_2        
        //   127: ifeq            1304
        //   130: getstatic       com/whatsapp/pf.OK:Lcom/whatsapp/pf;
        //   133: astore          16
        //   135: aload_1        
        //   136: aload           16
        //   138: if_acmpne       335
        //   141: aload_0        
        //   142: getfield        com/whatsapp/ok.b:Lcom/whatsapp/ct;
        //   145: getfield        com/whatsapp/ct.f:Ljava/lang/String;
        //   148: astore          108
        //   150: aload           108
        //   152: ifnull          285
        //   155: aload_0        
        //   156: getfield        com/whatsapp/ok.b:Lcom/whatsapp/ct;
        //   159: getfield        com/whatsapp/ct.e:[B
        //   162: astore          114
        //   164: aload           114
        //   166: ifnull          285
        //   169: aload_0        
        //   170: getfield        com/whatsapp/ok.b:Lcom/whatsapp/ct;
        //   173: getfield        com/whatsapp/ct.a:J
        //   176: lstore          115
        //   178: lload           115
        //   180: lconst_0       
        //   181: lcmp           
        //   182: ifeq            285
        //   185: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //   188: bipush          53
        //   190: aaload         
        //   191: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   194: aload_0        
        //   195: getfield        com/whatsapp/ok.c:Ljava/lang/Runnable;
        //   198: astore          117
        //   200: aload           117
        //   202: ifnull          214
        //   205: aload_0        
        //   206: getfield        com/whatsapp/ok.c:Ljava/lang/Runnable;
        //   209: invokeinterface java/lang/Runnable.run:()V
        //   214: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   217: aload_0        
        //   218: getfield        com/whatsapp/ok.b:Lcom/whatsapp/ct;
        //   221: getfield        com/whatsapp/ct.f:Ljava/lang/String;
        //   224: invokestatic    com/whatsapp/App.f:(Landroid/content/Context;Ljava/lang/String;)V
        //   227: aload_0        
        //   228: getfield        com/whatsapp/ok.b:Lcom/whatsapp/ct;
        //   231: getfield        com/whatsapp/ct.e:[B
        //   234: aload_0        
        //   235: getfield        com/whatsapp/ok.b:Lcom/whatsapp/ct;
        //   238: getfield        com/whatsapp/ct.f:Ljava/lang/String;
        //   241: invokestatic    com/whatsapp/al5.c:([BLjava/lang/String;)Z
        //   244: pop            
        //   245: aload_0        
        //   246: getfield        com/whatsapp/ok.b:Lcom/whatsapp/ct;
        //   249: getfield        com/whatsapp/ct.d:Z
        //   252: invokestatic    com/whatsapp/VerifyNumber.a:(Z)Z
        //   255: pop            
        //   256: getstatic       com/whatsapp/h6.WHATSAPP_INITIATED:Lcom/whatsapp/h6;
        //   259: ldc2_w          1000
        //   262: aload_0        
        //   263: getfield        com/whatsapp/ok.b:Lcom/whatsapp/ct;
        //   266: getfield        com/whatsapp/ct.a:J
        //   269: lmul           
        //   270: invokestatic    com/whatsapp/ade.a:(Lcom/whatsapp/h6;J)V
        //   273: aload_0        
        //   274: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //   277: iconst_0       
        //   278: invokevirtual   com/whatsapp/EnterPhoneNumber.c:(Z)V
        //   281: iload_2        
        //   282: ifeq            1304
        //   285: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //   288: bipush          41
        //   290: aaload         
        //   291: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   294: aload_0        
        //   295: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //   298: getfield        com/whatsapp/EnterPhoneNumber.q:Z
        //   301: istore          112
        //   303: iload           112
        //   305: ifne            1304
        //   308: aload_0        
        //   309: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //   312: invokevirtual   com/whatsapp/EnterPhoneNumber.isFinishing:()Z
        //   315: istore          113
        //   317: iload           113
        //   319: ifne            1304
        //   322: aload_0        
        //   323: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //   326: bipush          22
        //   328: invokevirtual   com/whatsapp/EnterPhoneNumber.showDialog:(I)V
        //   331: iload_2        
        //   332: ifeq            1304
        //   335: getstatic       com/whatsapp/pf.YES:Lcom/whatsapp/pf;
        //   338: astore          48
        //   340: aload_1        
        //   341: aload           48
        //   343: if_acmpeq       1304
        //   346: bipush          14
        //   348: putstatic       com/whatsapp/EnterPhoneNumber.s:I
        //   351: aload_0        
        //   352: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //   355: invokevirtual   com/whatsapp/EnterPhoneNumber.b:()V
        //   358: getstatic       com/whatsapp/pf.ERROR_TEMPORARILY_UNAVAILABLE:Lcom/whatsapp/pf;
        //   361: astore          49
        //   363: aload_1        
        //   364: aload           49
        //   366: if_acmpne       423
        //   369: new             Ljava/lang/StringBuilder;
        //   372: dup            
        //   373: invokespecial   java/lang/StringBuilder.<init>:()V
        //   376: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //   379: bipush          24
        //   381: aaload         
        //   382: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   385: aload_0        
        //   386: getfield        com/whatsapp/ok.f:Ljava/lang/String;
        //   389: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   392: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //   395: bipush          49
        //   397: aaload         
        //   398: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   401: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   404: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   407: aload_0        
        //   408: aconst_null    
        //   409: iconst_1       
        //   410: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //   413: bipush          35
        //   415: aaload         
        //   416: invokespecial   com/whatsapp/ok.a:(Ljava/lang/String;ZLjava/lang/String;)V
        //   419: iload_2        
        //   420: ifeq            1304
        //   423: getstatic       com/whatsapp/pf.ERROR_NEXT_METHOD:Lcom/whatsapp/pf;
        //   426: astore          50
        //   428: aload_1        
        //   429: aload           50
        //   431: if_acmpne       488
        //   434: new             Ljava/lang/StringBuilder;
        //   437: dup            
        //   438: invokespecial   java/lang/StringBuilder.<init>:()V
        //   441: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //   444: bipush          16
        //   446: aaload         
        //   447: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   450: aload_0        
        //   451: getfield        com/whatsapp/ok.f:Ljava/lang/String;
        //   454: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   457: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //   460: bipush          47
        //   462: aaload         
        //   463: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   466: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   469: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   472: aload_0        
        //   473: aconst_null    
        //   474: iconst_1       
        //   475: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //   478: bipush          37
        //   480: aaload         
        //   481: invokespecial   com/whatsapp/ok.a:(Ljava/lang/String;ZLjava/lang/String;)V
        //   484: iload_2        
        //   485: ifeq            1304
        //   488: getstatic       com/whatsapp/pf.ERROR_NO_ROUTES:Lcom/whatsapp/pf;
        //   491: astore          51
        //   493: aload_1        
        //   494: aload           51
        //   496: if_acmpne       552
        //   499: new             Ljava/lang/StringBuilder;
        //   502: dup            
        //   503: invokespecial   java/lang/StringBuilder.<init>:()V
        //   506: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //   509: bipush          46
        //   511: aaload         
        //   512: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   515: aload_0        
        //   516: getfield        com/whatsapp/ok.f:Ljava/lang/String;
        //   519: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   522: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //   525: bipush          11
        //   527: aaload         
        //   528: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   531: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   534: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   537: aload_0        
        //   538: aconst_null    
        //   539: iconst_1       
        //   540: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //   543: iconst_4       
        //   544: aaload         
        //   545: invokespecial   com/whatsapp/ok.a:(Ljava/lang/String;ZLjava/lang/String;)V
        //   548: iload_2        
        //   549: ifeq            1304
        //   552: getstatic       com/whatsapp/pf.ERROR_UNSPECIFIED:Lcom/whatsapp/pf;
        //   555: astore          52
        //   557: aload_1        
        //   558: aload           52
        //   560: if_acmpne       642
        //   563: new             Ljava/lang/StringBuilder;
        //   566: dup            
        //   567: invokespecial   java/lang/StringBuilder.<init>:()V
        //   570: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //   573: bipush          14
        //   575: aaload         
        //   576: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   579: aload_0        
        //   580: getfield        com/whatsapp/ok.f:Ljava/lang/String;
        //   583: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   586: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //   589: bipush          28
        //   591: aaload         
        //   592: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   595: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   598: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   601: aload_0        
        //   602: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //   605: getfield        com/whatsapp/EnterPhoneNumber.q:Z
        //   608: istore          106
        //   610: iload           106
        //   612: ifne            1304
        //   615: aload_0        
        //   616: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //   619: invokevirtual   com/whatsapp/EnterPhoneNumber.isFinishing:()Z
        //   622: istore          107
        //   624: iload           107
        //   626: ifne            1304
        //   629: aload_0        
        //   630: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //   633: bipush          109
        //   635: invokevirtual   com/whatsapp/EnterPhoneNumber.showDialog:(I)V
        //   638: iload_2        
        //   639: ifeq            1304
        //   642: getstatic       com/whatsapp/pf.ERROR_TOO_MANY:Lcom/whatsapp/pf;
        //   645: astore          53
        //   647: aload_1        
        //   648: aload           53
        //   650: if_acmpne       706
        //   653: new             Ljava/lang/StringBuilder;
        //   656: dup            
        //   657: invokespecial   java/lang/StringBuilder.<init>:()V
        //   660: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //   663: iconst_5       
        //   664: aaload         
        //   665: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   668: aload_0        
        //   669: getfield        com/whatsapp/ok.f:Ljava/lang/String;
        //   672: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   675: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //   678: bipush          45
        //   680: aaload         
        //   681: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   684: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   687: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   690: aload_0        
        //   691: aconst_null    
        //   692: iconst_1       
        //   693: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //   696: bipush          34
        //   698: aaload         
        //   699: invokespecial   com/whatsapp/ok.a:(Ljava/lang/String;ZLjava/lang/String;)V
        //   702: iload_2        
        //   703: ifeq            1304
        //   706: getstatic       com/whatsapp/pf.ERROR_TOO_MANY_ALL_METHODS:Lcom/whatsapp/pf;
        //   709: astore          54
        //   711: aload_1        
        //   712: aload           54
        //   714: if_acmpne       771
        //   717: new             Ljava/lang/StringBuilder;
        //   720: dup            
        //   721: invokespecial   java/lang/StringBuilder.<init>:()V
        //   724: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //   727: bipush          23
        //   729: aaload         
        //   730: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   733: aload_0        
        //   734: getfield        com/whatsapp/ok.f:Ljava/lang/String;
        //   737: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   740: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //   743: bipush          38
        //   745: aaload         
        //   746: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   749: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   752: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   755: aload_0        
        //   756: aconst_null    
        //   757: iconst_1       
        //   758: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //   761: bipush          19
        //   763: aaload         
        //   764: invokespecial   com/whatsapp/ok.a:(Ljava/lang/String;ZLjava/lang/String;)V
        //   767: iload_2        
        //   768: ifeq            1304
        //   771: getstatic       com/whatsapp/pf.ERROR_TOO_MANY_GUESSES:Lcom/whatsapp/pf;
        //   774: astore          55
        //   776: aload_1        
        //   777: aload           55
        //   779: if_acmpne       836
        //   782: new             Ljava/lang/StringBuilder;
        //   785: dup            
        //   786: invokespecial   java/lang/StringBuilder.<init>:()V
        //   789: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //   792: bipush          50
        //   794: aaload         
        //   795: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   798: aload_0        
        //   799: getfield        com/whatsapp/ok.f:Ljava/lang/String;
        //   802: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   805: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //   808: bipush          13
        //   810: aaload         
        //   811: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   814: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   817: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   820: aload_0        
        //   821: aconst_null    
        //   822: iconst_1       
        //   823: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //   826: bipush          8
        //   828: aaload         
        //   829: invokespecial   com/whatsapp/ok.a:(Ljava/lang/String;ZLjava/lang/String;)V
        //   832: iload_2        
        //   833: ifeq            1304
        //   836: getstatic       com/whatsapp/pf.ERROR_CONNECTIVITY:Lcom/whatsapp/pf;
        //   839: astore          56
        //   841: aload_1        
        //   842: aload           56
        //   844: if_acmpne       898
        //   847: aload_0        
        //   848: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //   851: astore          103
        //   853: aload_0        
        //   854: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //   857: astore          104
        //   859: iconst_1       
        //   860: anewarray       Ljava/lang/Object;
        //   863: astore          105
        //   865: aload           105
        //   867: iconst_0       
        //   868: aload_0        
        //   869: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //   872: ldc_w           2131230921
        //   875: invokevirtual   com/whatsapp/EnterPhoneNumber.getString:(I)Ljava/lang/String;
        //   878: aastore        
        //   879: aload           103
        //   881: aload           104
        //   883: ldc_w           2131231532
        //   886: aload           105
        //   888: invokevirtual   com/whatsapp/EnterPhoneNumber.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   891: invokevirtual   com/whatsapp/EnterPhoneNumber.d:(Ljava/lang/String;)V
        //   894: iload_2        
        //   895: ifeq            1304
        //   898: getstatic       com/whatsapp/pf.ERROR_BAD_PARAMETER:Lcom/whatsapp/pf;
        //   901: astore          57
        //   903: aload_1        
        //   904: aload           57
        //   906: if_acmpne       997
        //   909: new             Ljava/lang/StringBuilder;
        //   912: dup            
        //   913: invokespecial   java/lang/StringBuilder.<init>:()V
        //   916: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //   919: bipush          22
        //   921: aaload         
        //   922: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   925: aload_0        
        //   926: getfield        com/whatsapp/ok.f:Ljava/lang/String;
        //   929: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   932: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //   935: bipush          9
        //   937: aaload         
        //   938: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   941: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   944: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   947: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //   950: bipush          51
        //   952: aaload         
        //   953: invokestatic    com/whatsapp/App.F:(Ljava/lang/String;)V
        //   956: aload_0        
        //   957: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //   960: getfield        com/whatsapp/EnterPhoneNumber.q:Z
        //   963: istore          101
        //   965: iload           101
        //   967: ifne            1304
        //   970: aload_0        
        //   971: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //   974: invokevirtual   com/whatsapp/EnterPhoneNumber.isFinishing:()Z
        //   977: istore          102
        //   979: iload           102
        //   981: ifne            1304
        //   984: aload_0        
        //   985: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //   988: bipush          22
        //   990: invokevirtual   com/whatsapp/EnterPhoneNumber.showDialog:(I)V
        //   993: iload_2        
        //   994: ifeq            1304
        //   997: getstatic       com/whatsapp/pf.ERROR_MISSING_PARAMETER:Lcom/whatsapp/pf;
        //  1000: astore          58
        //  1002: aload_1        
        //  1003: aload           58
        //  1005: if_acmpne       1096
        //  1008: new             Ljava/lang/StringBuilder;
        //  1011: dup            
        //  1012: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1015: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //  1018: bipush          42
        //  1020: aaload         
        //  1021: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1024: aload_0        
        //  1025: getfield        com/whatsapp/ok.f:Ljava/lang/String;
        //  1028: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1031: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //  1034: bipush          43
        //  1036: aaload         
        //  1037: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1040: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1043: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  1046: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //  1049: bipush          32
        //  1051: aaload         
        //  1052: invokestatic    com/whatsapp/App.F:(Ljava/lang/String;)V
        //  1055: aload_0        
        //  1056: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //  1059: getfield        com/whatsapp/EnterPhoneNumber.q:Z
        //  1062: istore          99
        //  1064: iload           99
        //  1066: ifne            1304
        //  1069: aload_0        
        //  1070: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //  1073: invokevirtual   com/whatsapp/EnterPhoneNumber.isFinishing:()Z
        //  1076: istore          100
        //  1078: iload           100
        //  1080: ifne            1304
        //  1083: aload_0        
        //  1084: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //  1087: bipush          22
        //  1089: invokevirtual   com/whatsapp/EnterPhoneNumber.showDialog:(I)V
        //  1092: iload_2        
        //  1093: ifeq            1304
        //  1096: getstatic       com/whatsapp/pf.ERROR_OLD_VERSION:Lcom/whatsapp/pf;
        //  1099: astore          59
        //  1101: aload_1        
        //  1102: aload           59
        //  1104: if_acmpne       1162
        //  1107: new             Ljava/lang/StringBuilder;
        //  1110: dup            
        //  1111: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1114: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //  1117: bipush          17
        //  1119: aaload         
        //  1120: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1123: aload_0        
        //  1124: getfield        com/whatsapp/ok.f:Ljava/lang/String;
        //  1127: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1130: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //  1133: bipush          36
        //  1135: aaload         
        //  1136: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1139: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1142: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //  1145: iconst_1       
        //  1146: putstatic       com/whatsapp/App.aA:Z
        //  1149: aload_0        
        //  1150: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //  1153: bipush          114
        //  1155: invokevirtual   com/whatsapp/EnterPhoneNumber.d:(I)V
        //  1158: iload_2        
        //  1159: ifeq            1304
        //  1162: getstatic       com/whatsapp/pf.ERROR_TOO_RECENT:Lcom/whatsapp/pf;
        //  1165: astore          60
        //  1167: aload_1        
        //  1168: aload           60
        //  1170: if_acmpne       1672
        //  1173: new             Ljava/lang/StringBuilder;
        //  1176: dup            
        //  1177: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1180: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //  1183: bipush          12
        //  1185: aaload         
        //  1186: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1189: aload_0        
        //  1190: getfield        com/whatsapp/ok.f:Ljava/lang/String;
        //  1193: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1196: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //  1199: bipush          18
        //  1201: aaload         
        //  1202: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1205: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1208: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //  1211: aload_0        
        //  1212: getfield        com/whatsapp/ok.b:Lcom/whatsapp/ct;
        //  1215: getfield        com/whatsapp/ct.g:Ljava/lang/String;
        //  1218: astore          91
        //  1220: aload           91
        //  1222: ifnull          1613
        //  1225: ldc2_w          1000
        //  1228: aload_0        
        //  1229: getfield        com/whatsapp/ok.b:Lcom/whatsapp/ct;
        //  1232: getfield        com/whatsapp/ct.g:Ljava/lang/String;
        //  1235: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //  1238: lmul           
        //  1239: lstore          94
        //  1241: lload           94
        //  1243: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //  1246: ladd           
        //  1247: putstatic       com/whatsapp/EnterPhoneNumber.u:J
        //  1250: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  1253: lload           94
        //  1255: invokevirtual   com/whatsapp/App.c:(J)V
        //  1258: aload_0        
        //  1259: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //  1262: astore          96
        //  1264: aload_0        
        //  1265: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //  1268: astore          97
        //  1270: iconst_1       
        //  1271: anewarray       Ljava/lang/Object;
        //  1274: astore          98
        //  1276: aload           98
        //  1278: iconst_0       
        //  1279: aload_0        
        //  1280: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //  1283: lload           94
        //  1285: invokestatic    com/whatsapp/util/b6.n:(Landroid/content/Context;J)Ljava/lang/String;
        //  1288: aastore        
        //  1289: aload           96
        //  1291: aload           97
        //  1293: ldc_w           2131231570
        //  1296: aload           98
        //  1298: invokevirtual   com/whatsapp/EnterPhoneNumber.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //  1301: invokevirtual   com/whatsapp/EnterPhoneNumber.d:(Ljava/lang/String;)V
        //  1304: return         
        //  1305: astore_3       
        //  1306: aload_3        
        //  1307: athrow         
        //  1308: astore          4
        //  1310: aload           4
        //  1312: athrow         
        //  1313: astore          5
        //  1315: aload           5
        //  1317: athrow         
        //  1318: astore          6
        //  1320: aload           6
        //  1322: athrow         
        //  1323: astore          7
        //  1325: aload           7
        //  1327: athrow         
        //  1328: astore          8
        //  1330: aload           8
        //  1332: athrow         
        //  1333: iconst_0       
        //  1334: istore          122
        //  1336: goto            108
        //  1339: astore          10
        //  1341: aload           10
        //  1343: athrow         
        //  1344: astore          11
        //  1346: aload           11
        //  1348: athrow         
        //  1349: astore          12
        //  1351: aload           12
        //  1353: athrow         
        //  1354: astore          13
        //  1356: aload           13
        //  1358: athrow         
        //  1359: astore          14
        //  1361: aload           14
        //  1363: athrow         
        //  1364: astore          15
        //  1366: aload           15
        //  1368: athrow         
        //  1369: astore          120
        //  1371: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //  1374: bipush          15
        //  1376: aaload         
        //  1377: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  1380: goto            273
        //  1383: astore          109
        //  1385: aload           109
        //  1387: athrow         
        //  1388: astore          110
        //  1390: aload           110
        //  1392: athrow         
        //  1393: astore          111
        //  1395: aload           111
        //  1397: athrow         
        //  1398: astore          17
        //  1400: aload           17
        //  1402: athrow         
        //  1403: astore          18
        //  1405: aload           18
        //  1407: athrow         
        //  1408: astore          19
        //  1410: aload           19
        //  1412: athrow         
        //  1413: astore          20
        //  1415: aload           20
        //  1417: athrow         
        //  1418: astore          21
        //  1420: aload           21
        //  1422: athrow         
        //  1423: astore          22
        //  1425: aload           22
        //  1427: athrow         
        //  1428: astore          23
        //  1430: aload           23
        //  1432: athrow         
        //  1433: astore          24
        //  1435: aload           24
        //  1437: athrow         
        //  1438: astore          25
        //  1440: aload           25
        //  1442: athrow         
        //  1443: astore          26
        //  1445: aload           26
        //  1447: athrow         
        //  1448: astore          27
        //  1450: aload           27
        //  1452: athrow         
        //  1453: astore          28
        //  1455: aload           28
        //  1457: athrow         
        //  1458: astore          29
        //  1460: aload           29
        //  1462: athrow         
        //  1463: astore          30
        //  1465: aload           30
        //  1467: athrow         
        //  1468: astore          31
        //  1470: aload           31
        //  1472: athrow         
        //  1473: astore          32
        //  1475: aload           32
        //  1477: athrow         
        //  1478: astore          33
        //  1480: aload           33
        //  1482: athrow         
        //  1483: astore          34
        //  1485: aload           34
        //  1487: athrow         
        //  1488: astore          35
        //  1490: aload           35
        //  1492: athrow         
        //  1493: astore          36
        //  1495: aload           36
        //  1497: athrow         
        //  1498: astore          37
        //  1500: aload           37
        //  1502: athrow         
        //  1503: astore          38
        //  1505: aload           38
        //  1507: athrow         
        //  1508: astore          39
        //  1510: aload           39
        //  1512: athrow         
        //  1513: astore          40
        //  1515: aload           40
        //  1517: athrow         
        //  1518: astore          41
        //  1520: aload           41
        //  1522: athrow         
        //  1523: astore          42
        //  1525: aload           42
        //  1527: athrow         
        //  1528: astore          43
        //  1530: aload           43
        //  1532: athrow         
        //  1533: astore          44
        //  1535: aload           44
        //  1537: athrow         
        //  1538: astore          45
        //  1540: aload           45
        //  1542: athrow         
        //  1543: astore          46
        //  1545: aload           46
        //  1547: athrow         
        //  1548: astore          47
        //  1550: aload           47
        //  1552: athrow         
        //  1553: astore          93
        //  1555: new             Ljava/lang/StringBuilder;
        //  1558: dup            
        //  1559: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1562: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //  1565: iconst_1       
        //  1566: aaload         
        //  1567: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1570: aload_0        
        //  1571: getfield        com/whatsapp/ok.f:Ljava/lang/String;
        //  1574: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1577: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //  1580: bipush          33
        //  1582: aaload         
        //  1583: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1586: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1589: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //  1592: aload_0        
        //  1593: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //  1596: aload_0        
        //  1597: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //  1600: ldc_w           2131231571
        //  1603: invokevirtual   com/whatsapp/EnterPhoneNumber.getString:(I)Ljava/lang/String;
        //  1606: invokevirtual   com/whatsapp/EnterPhoneNumber.d:(Ljava/lang/String;)V
        //  1609: iload_2        
        //  1610: ifeq            1304
        //  1613: new             Ljava/lang/StringBuilder;
        //  1616: dup            
        //  1617: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1620: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //  1623: bipush          40
        //  1625: aaload         
        //  1626: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1629: aload_0        
        //  1630: getfield        com/whatsapp/ok.f:Ljava/lang/String;
        //  1633: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1636: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //  1639: bipush          20
        //  1641: aaload         
        //  1642: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1645: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1648: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //  1651: aload_0        
        //  1652: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //  1655: aload_0        
        //  1656: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //  1659: ldc_w           2131231571
        //  1662: invokevirtual   com/whatsapp/EnterPhoneNumber.getString:(I)Ljava/lang/String;
        //  1665: invokevirtual   com/whatsapp/EnterPhoneNumber.d:(Ljava/lang/String;)V
        //  1668: iload_2        
        //  1669: ifeq            1304
        //  1672: getstatic       com/whatsapp/pf.ERROR_BLOCKED:Lcom/whatsapp/pf;
        //  1675: astore          65
        //  1677: aload_1        
        //  1678: aload           65
        //  1680: if_acmpne       1734
        //  1683: new             Ljava/lang/StringBuilder;
        //  1686: dup            
        //  1687: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1690: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //  1693: bipush          25
        //  1695: aaload         
        //  1696: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1699: aload_0        
        //  1700: getfield        com/whatsapp/ok.f:Ljava/lang/String;
        //  1703: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1706: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //  1709: bipush          39
        //  1711: aaload         
        //  1712: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1715: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1718: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //  1721: aload_0        
        //  1722: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //  1725: bipush          23
        //  1727: invokevirtual   com/whatsapp/EnterPhoneNumber.d:(I)V
        //  1730: iload_2        
        //  1731: ifeq            1304
        //  1734: getstatic       com/whatsapp/pf.ERROR_PROVIDER_TIMEOUT:Lcom/whatsapp/pf;
        //  1737: astore          66
        //  1739: aload_1        
        //  1740: aload           66
        //  1742: if_acmpne       1995
        //  1745: new             Ljava/lang/StringBuilder;
        //  1748: dup            
        //  1749: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1752: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //  1755: bipush          29
        //  1757: aaload         
        //  1758: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1761: aload_0        
        //  1762: getfield        com/whatsapp/ok.f:Ljava/lang/String;
        //  1765: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1768: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //  1771: bipush          31
        //  1773: aaload         
        //  1774: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1777: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1780: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //  1783: aload_0        
        //  1784: getfield        com/whatsapp/ok.b:Lcom/whatsapp/ct;
        //  1787: getfield        com/whatsapp/ct.g:Ljava/lang/String;
        //  1790: astore          83
        //  1792: aload           83
        //  1794: ifnull          1937
        //  1797: ldc2_w          1000
        //  1800: aload_0        
        //  1801: getfield        com/whatsapp/ok.b:Lcom/whatsapp/ct;
        //  1804: getfield        com/whatsapp/ct.g:Ljava/lang/String;
        //  1807: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //  1810: lmul           
        //  1811: lstore          86
        //  1813: lload           86
        //  1815: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //  1818: ladd           
        //  1819: putstatic       com/whatsapp/EnterPhoneNumber.u:J
        //  1822: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  1825: lload           86
        //  1827: invokevirtual   com/whatsapp/App.c:(J)V
        //  1830: aload_0        
        //  1831: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //  1834: astore          88
        //  1836: aload_0        
        //  1837: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //  1840: astore          89
        //  1842: iconst_1       
        //  1843: anewarray       Ljava/lang/Object;
        //  1846: astore          90
        //  1848: aload           90
        //  1850: iconst_0       
        //  1851: aload_0        
        //  1852: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //  1855: lload           86
        //  1857: invokestatic    com/whatsapp/util/b6.n:(Landroid/content/Context;J)Ljava/lang/String;
        //  1860: aastore        
        //  1861: aload           88
        //  1863: aload           89
        //  1865: ldc_w           2131231559
        //  1868: aload           90
        //  1870: invokevirtual   com/whatsapp/EnterPhoneNumber.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //  1873: invokevirtual   com/whatsapp/EnterPhoneNumber.d:(Ljava/lang/String;)V
        //  1876: return         
        //  1877: astore          85
        //  1879: new             Ljava/lang/StringBuilder;
        //  1882: dup            
        //  1883: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1886: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //  1889: iconst_0       
        //  1890: aaload         
        //  1891: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1894: aload_0        
        //  1895: getfield        com/whatsapp/ok.f:Ljava/lang/String;
        //  1898: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1901: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //  1904: bipush          21
        //  1906: aaload         
        //  1907: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1910: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1913: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //  1916: aload_0        
        //  1917: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //  1920: aload_0        
        //  1921: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //  1924: ldc_w           2131231560
        //  1927: invokevirtual   com/whatsapp/EnterPhoneNumber.getString:(I)Ljava/lang/String;
        //  1930: invokevirtual   com/whatsapp/EnterPhoneNumber.d:(Ljava/lang/String;)V
        //  1933: iload_2        
        //  1934: ifeq            1304
        //  1937: new             Ljava/lang/StringBuilder;
        //  1940: dup            
        //  1941: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1944: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //  1947: bipush          48
        //  1949: aaload         
        //  1950: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1953: aload_0        
        //  1954: getfield        com/whatsapp/ok.f:Ljava/lang/String;
        //  1957: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1960: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //  1963: iconst_3       
        //  1964: aaload         
        //  1965: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1968: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1971: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //  1974: aload_0        
        //  1975: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //  1978: aload_0        
        //  1979: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //  1982: ldc_w           2131231560
        //  1985: invokevirtual   com/whatsapp/EnterPhoneNumber.getString:(I)Ljava/lang/String;
        //  1988: invokevirtual   com/whatsapp/EnterPhoneNumber.d:(Ljava/lang/String;)V
        //  1991: iload_2        
        //  1992: ifeq            1304
        //  1995: getstatic       com/whatsapp/pf.ERROR_PROVIDER_UNROUTABLE:Lcom/whatsapp/pf;
        //  1998: astore          69
        //  2000: aload_1        
        //  2001: aload           69
        //  2003: if_acmpne       2257
        //  2006: new             Ljava/lang/StringBuilder;
        //  2009: dup            
        //  2010: invokespecial   java/lang/StringBuilder.<init>:()V
        //  2013: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //  2016: iconst_2       
        //  2017: aaload         
        //  2018: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2021: aload_0        
        //  2022: getfield        com/whatsapp/ok.f:Ljava/lang/String;
        //  2025: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2028: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //  2031: bipush          30
        //  2033: aaload         
        //  2034: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2037: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2040: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //  2043: aload_0        
        //  2044: getfield        com/whatsapp/ok.b:Lcom/whatsapp/ct;
        //  2047: getfield        com/whatsapp/ct.g:Ljava/lang/String;
        //  2050: astore          75
        //  2052: aload           75
        //  2054: ifnull          2198
        //  2057: ldc2_w          1000
        //  2060: aload_0        
        //  2061: getfield        com/whatsapp/ok.b:Lcom/whatsapp/ct;
        //  2064: getfield        com/whatsapp/ct.g:Ljava/lang/String;
        //  2067: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //  2070: lmul           
        //  2071: lstore          78
        //  2073: lload           78
        //  2075: invokestatic    android/os/SystemClock.elapsedRealtime:()J
        //  2078: ladd           
        //  2079: putstatic       com/whatsapp/EnterPhoneNumber.u:J
        //  2082: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //  2085: lload           78
        //  2087: invokevirtual   com/whatsapp/App.c:(J)V
        //  2090: aload_0        
        //  2091: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //  2094: astore          80
        //  2096: aload_0        
        //  2097: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //  2100: astore          81
        //  2102: iconst_1       
        //  2103: anewarray       Ljava/lang/Object;
        //  2106: astore          82
        //  2108: aload           82
        //  2110: iconst_0       
        //  2111: aload_0        
        //  2112: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //  2115: lload           78
        //  2117: invokestatic    com/whatsapp/util/b6.n:(Landroid/content/Context;J)Ljava/lang/String;
        //  2120: aastore        
        //  2121: aload           80
        //  2123: aload           81
        //  2125: ldc_w           2131231561
        //  2128: aload           82
        //  2130: invokevirtual   com/whatsapp/EnterPhoneNumber.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //  2133: invokevirtual   com/whatsapp/EnterPhoneNumber.d:(Ljava/lang/String;)V
        //  2136: return         
        //  2137: astore          76
        //  2139: new             Ljava/lang/StringBuilder;
        //  2142: dup            
        //  2143: invokespecial   java/lang/StringBuilder.<init>:()V
        //  2146: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //  2149: bipush          52
        //  2151: aaload         
        //  2152: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2155: aload_0        
        //  2156: getfield        com/whatsapp/ok.f:Ljava/lang/String;
        //  2159: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2162: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //  2165: bipush          44
        //  2167: aaload         
        //  2168: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2171: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2174: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //  2177: aload_0        
        //  2178: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //  2181: aload_0        
        //  2182: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //  2185: ldc_w           2131231562
        //  2188: invokevirtual   com/whatsapp/EnterPhoneNumber.getString:(I)Ljava/lang/String;
        //  2191: invokevirtual   com/whatsapp/EnterPhoneNumber.d:(Ljava/lang/String;)V
        //  2194: iload_2        
        //  2195: ifeq            1304
        //  2198: new             Ljava/lang/StringBuilder;
        //  2201: dup            
        //  2202: invokespecial   java/lang/StringBuilder.<init>:()V
        //  2205: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //  2208: bipush          26
        //  2210: aaload         
        //  2211: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2214: aload_0        
        //  2215: getfield        com/whatsapp/ok.f:Ljava/lang/String;
        //  2218: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2221: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //  2224: bipush          10
        //  2226: aaload         
        //  2227: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2230: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2233: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //  2236: aload_0        
        //  2237: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //  2240: aload_0        
        //  2241: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //  2244: ldc_w           2131231562
        //  2247: invokevirtual   com/whatsapp/EnterPhoneNumber.getString:(I)Ljava/lang/String;
        //  2250: invokevirtual   com/whatsapp/EnterPhoneNumber.d:(Ljava/lang/String;)V
        //  2253: iload_2        
        //  2254: ifeq            1304
        //  2257: getstatic       com/whatsapp/pf.ERROR_BAD_TOKEN:Lcom/whatsapp/pf;
        //  2260: astore          71
        //  2262: aload_1        
        //  2263: aload           71
        //  2265: if_acmpne       1304
        //  2268: new             Ljava/lang/StringBuilder;
        //  2271: dup            
        //  2272: invokespecial   java/lang/StringBuilder.<init>:()V
        //  2275: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //  2278: bipush          6
        //  2280: aaload         
        //  2281: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2284: aload_0        
        //  2285: getfield        com/whatsapp/ok.f:Ljava/lang/String;
        //  2288: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2291: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //  2294: bipush          27
        //  2296: aaload         
        //  2297: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2300: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2303: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //  2306: getstatic       com/whatsapp/App.aS:I
        //  2309: iconst_2       
        //  2310: if_icmpne       2385
        //  2313: aload_0        
        //  2314: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //  2317: ldc_w           2131231555
        //  2320: invokevirtual   com/whatsapp/EnterPhoneNumber.getString:(I)Ljava/lang/String;
        //  2323: astore          74
        //  2325: aload_0        
        //  2326: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //  2329: aload           74
        //  2331: invokevirtual   com/whatsapp/EnterPhoneNumber.d:(Ljava/lang/String;)V
        //  2334: return         
        //  2335: astore          92
        //  2337: aload           92
        //  2339: athrow         
        //  2340: astore          61
        //  2342: aload           61
        //  2344: athrow         
        //  2345: astore          62
        //  2347: aload           62
        //  2349: athrow         
        //  2350: astore          63
        //  2352: aload           63
        //  2354: athrow         
        //  2355: astore          64
        //  2357: aload           64
        //  2359: athrow         
        //  2360: astore          84
        //  2362: aload           84
        //  2364: athrow         
        //  2365: astore          67
        //  2367: aload           67
        //  2369: athrow         
        //  2370: astore          68
        //  2372: aload           68
        //  2374: athrow         
        //  2375: astore          77
        //  2377: aload           77
        //  2379: athrow         
        //  2380: astore          70
        //  2382: aload           70
        //  2384: athrow         
        //  2385: getstatic       com/whatsapp/App.aS:I
        //  2388: ifne            2406
        //  2391: aload_0        
        //  2392: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //  2395: ldc_w           2131231556
        //  2398: invokevirtual   com/whatsapp/EnterPhoneNumber.getString:(I)Ljava/lang/String;
        //  2401: astore          74
        //  2403: goto            2325
        //  2406: aload_0        
        //  2407: getfield        com/whatsapp/ok.e:Lcom/whatsapp/EnterPhoneNumber;
        //  2410: astore          72
        //  2412: iconst_1       
        //  2413: anewarray       Ljava/lang/Object;
        //  2416: astore          73
        //  2418: aload           73
        //  2420: iconst_0       
        //  2421: getstatic       com/whatsapp/ok.z:[Ljava/lang/String;
        //  2424: bipush          7
        //  2426: aaload         
        //  2427: aastore        
        //  2428: aload           72
        //  2430: ldc_w           2131231557
        //  2433: aload           73
        //  2435: invokevirtual   com/whatsapp/EnterPhoneNumber.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //  2438: astore          74
        //  2440: goto            2325
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  4      48     1305   1308   Ljava/lang/NumberFormatException;
        //  53     62     1308   1313   Ljava/lang/NumberFormatException;
        //  67     76     1313   1318   Ljava/lang/NumberFormatException;
        //  80     85     1318   1323   Ljava/lang/NumberFormatException;
        //  91     100    1323   1333   Ljava/lang/NumberFormatException;
        //  108    126    1339   1344   Ljava/lang/NumberFormatException;
        //  130    135    1339   1344   Ljava/lang/NumberFormatException;
        //  141    150    1344   1349   Ljava/lang/NumberFormatException;
        //  155    164    1349   1354   Ljava/lang/NumberFormatException;
        //  169    178    1354   1359   Ljava/lang/NumberFormatException;
        //  185    200    1359   1364   Ljava/lang/NumberFormatException;
        //  205    214    1364   1369   Ljava/lang/NumberFormatException;
        //  256    273    1369   1383   Ljava/lang/NumberFormatException;
        //  273    281    1383   1388   Ljava/lang/NumberFormatException;
        //  285    303    1383   1388   Ljava/lang/NumberFormatException;
        //  308    317    1388   1393   Ljava/lang/NumberFormatException;
        //  322    331    1393   1398   Ljava/lang/NumberFormatException;
        //  335    340    1398   1403   Ljava/lang/NumberFormatException;
        //  346    363    1403   1408   Ljava/lang/NumberFormatException;
        //  369    419    1408   1413   Ljava/lang/NumberFormatException;
        //  423    428    1413   1418   Ljava/lang/NumberFormatException;
        //  434    484    1418   1423   Ljava/lang/NumberFormatException;
        //  488    493    1423   1428   Ljava/lang/NumberFormatException;
        //  499    548    1428   1433   Ljava/lang/NumberFormatException;
        //  552    557    1433   1438   Ljava/lang/NumberFormatException;
        //  563    610    1438   1443   Ljava/lang/NumberFormatException;
        //  615    624    1443   1448   Ljava/lang/NumberFormatException;
        //  629    638    1448   1453   Ljava/lang/NumberFormatException;
        //  642    647    1453   1458   Ljava/lang/NumberFormatException;
        //  653    702    1458   1463   Ljava/lang/NumberFormatException;
        //  706    711    1463   1468   Ljava/lang/NumberFormatException;
        //  717    767    1468   1473   Ljava/lang/NumberFormatException;
        //  771    776    1473   1478   Ljava/lang/NumberFormatException;
        //  782    832    1478   1483   Ljava/lang/NumberFormatException;
        //  836    841    1483   1488   Ljava/lang/NumberFormatException;
        //  847    894    1488   1493   Ljava/lang/NumberFormatException;
        //  898    903    1493   1498   Ljava/lang/NumberFormatException;
        //  909    965    1498   1503   Ljava/lang/NumberFormatException;
        //  970    979    1503   1508   Ljava/lang/NumberFormatException;
        //  984    993    1508   1513   Ljava/lang/NumberFormatException;
        //  997    1002   1513   1518   Ljava/lang/NumberFormatException;
        //  1008   1064   1518   1523   Ljava/lang/NumberFormatException;
        //  1069   1078   1523   1528   Ljava/lang/NumberFormatException;
        //  1083   1092   1528   1533   Ljava/lang/NumberFormatException;
        //  1096   1101   1533   1538   Ljava/lang/NumberFormatException;
        //  1107   1158   1538   1543   Ljava/lang/NumberFormatException;
        //  1162   1167   1543   1548   Ljava/lang/NumberFormatException;
        //  1173   1220   1548   1553   Ljava/lang/NumberFormatException;
        //  1225   1304   1553   1613   Ljava/lang/NumberFormatException;
        //  1306   1308   1308   1313   Ljava/lang/NumberFormatException;
        //  1310   1313   1313   1318   Ljava/lang/NumberFormatException;
        //  1315   1318   1318   1323   Ljava/lang/NumberFormatException;
        //  1320   1323   1323   1333   Ljava/lang/NumberFormatException;
        //  1325   1328   1328   1333   Ljava/lang/NumberFormatException;
        //  1341   1344   1344   1349   Ljava/lang/NumberFormatException;
        //  1346   1349   1349   1354   Ljava/lang/NumberFormatException;
        //  1351   1354   1354   1359   Ljava/lang/NumberFormatException;
        //  1356   1359   1359   1364   Ljava/lang/NumberFormatException;
        //  1361   1364   1364   1369   Ljava/lang/NumberFormatException;
        //  1385   1388   1388   1393   Ljava/lang/NumberFormatException;
        //  1390   1393   1393   1398   Ljava/lang/NumberFormatException;
        //  1395   1398   1398   1403   Ljava/lang/NumberFormatException;
        //  1400   1403   1403   1408   Ljava/lang/NumberFormatException;
        //  1405   1408   1408   1413   Ljava/lang/NumberFormatException;
        //  1410   1413   1413   1418   Ljava/lang/NumberFormatException;
        //  1415   1418   1418   1423   Ljava/lang/NumberFormatException;
        //  1420   1423   1423   1428   Ljava/lang/NumberFormatException;
        //  1425   1428   1428   1433   Ljava/lang/NumberFormatException;
        //  1430   1433   1433   1438   Ljava/lang/NumberFormatException;
        //  1435   1438   1438   1443   Ljava/lang/NumberFormatException;
        //  1440   1443   1443   1448   Ljava/lang/NumberFormatException;
        //  1445   1448   1448   1453   Ljava/lang/NumberFormatException;
        //  1450   1453   1453   1458   Ljava/lang/NumberFormatException;
        //  1455   1458   1458   1463   Ljava/lang/NumberFormatException;
        //  1460   1463   1463   1468   Ljava/lang/NumberFormatException;
        //  1465   1468   1468   1473   Ljava/lang/NumberFormatException;
        //  1470   1473   1473   1478   Ljava/lang/NumberFormatException;
        //  1475   1478   1478   1483   Ljava/lang/NumberFormatException;
        //  1480   1483   1483   1488   Ljava/lang/NumberFormatException;
        //  1485   1488   1488   1493   Ljava/lang/NumberFormatException;
        //  1490   1493   1493   1498   Ljava/lang/NumberFormatException;
        //  1495   1498   1498   1503   Ljava/lang/NumberFormatException;
        //  1500   1503   1503   1508   Ljava/lang/NumberFormatException;
        //  1505   1508   1508   1513   Ljava/lang/NumberFormatException;
        //  1510   1513   1513   1518   Ljava/lang/NumberFormatException;
        //  1515   1518   1518   1523   Ljava/lang/NumberFormatException;
        //  1520   1523   1523   1528   Ljava/lang/NumberFormatException;
        //  1525   1528   1528   1533   Ljava/lang/NumberFormatException;
        //  1530   1533   1533   1538   Ljava/lang/NumberFormatException;
        //  1535   1538   1538   1543   Ljava/lang/NumberFormatException;
        //  1540   1543   1543   1548   Ljava/lang/NumberFormatException;
        //  1545   1548   1548   1553   Ljava/lang/NumberFormatException;
        //  1555   1609   2335   2340   Ljava/lang/NumberFormatException;
        //  1613   1668   2335   2340   Ljava/lang/NumberFormatException;
        //  1672   1677   2340   2345   Ljava/lang/NumberFormatException;
        //  1683   1730   2345   2350   Ljava/lang/NumberFormatException;
        //  1734   1739   2350   2355   Ljava/lang/NumberFormatException;
        //  1745   1792   2355   2360   Ljava/lang/NumberFormatException;
        //  1797   1876   1877   1937   Ljava/lang/NumberFormatException;
        //  1879   1933   2360   2365   Ljava/lang/NumberFormatException;
        //  1937   1991   2360   2365   Ljava/lang/NumberFormatException;
        //  1995   2000   2365   2370   Ljava/lang/NumberFormatException;
        //  2006   2052   2370   2375   Ljava/lang/NumberFormatException;
        //  2057   2136   2137   2380   Ljava/lang/NumberFormatException;
        //  2139   2194   2375   2380   Ljava/lang/NumberFormatException;
        //  2198   2253   2380   2385   Ljava/lang/NumberFormatException;
        //  2257   2262   2380   2385   Ljava/lang/NumberFormatException;
        //  2337   2340   2340   2345   Ljava/lang/NumberFormatException;
        //  2342   2345   2345   2350   Ljava/lang/NumberFormatException;
        //  2347   2350   2350   2355   Ljava/lang/NumberFormatException;
        //  2352   2355   2355   2360   Ljava/lang/NumberFormatException;
        //  2362   2365   2365   2370   Ljava/lang/NumberFormatException;
        //  2367   2370   2370   2375   Ljava/lang/NumberFormatException;
        //  2377   2380   2380   2385   Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 1131, Size: 1131
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
    
    protected Object doInBackground(final Object[] array) {
        return this.a((String[])array);
    }
    
    protected void onPostExecute(final Object o) {
        this.a((pf)o);
    }
    
    protected void onPreExecute() {
        try {
            EnterPhoneNumber.v = null;
            if (!this.e.isFinishing()) {
                this.e.showDialog(9);
            }
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
    }
}
