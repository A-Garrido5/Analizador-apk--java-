// 
// Decompiled by Procyon v0.5.30
// 

package de.greenrobot.event.util;

import android.app.Activity;
import android.content.DialogInterface;
import android.app.AlertDialog;
import de.greenrobot.event.m;
import android.app.AlertDialog$Builder;
import android.app.Dialog;
import android.content.DialogInterface$OnClickListener;
import android.os.Bundle;
import android.content.Context;

public class l
{
    public static Class a;
    public static int b;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[4];
        String s = "M-ZC\u0003L-\u001aV\u001eK'\u0000\n\u0014_-\u001aP\u0013\\;ZA\u0003['\u0006@\u0018H$\u001bC_]!\u0000H\u0014";
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
                        c2 = 'q';
                        break;
                    }
                    case 0: {
                        c2 = ')';
                        break;
                    }
                    case 1: {
                        c2 = 'H';
                        break;
                    }
                    case 2: {
                        c2 = 't';
                        break;
                    }
                    case 3: {
                        c2 = '$';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "M-ZC\u0003L-\u001aV\u001eK'\u0000\n\u0014_-\u001aP\u0013\\;ZA\u0003['\u0006@\u0018H$\u001bC_D-\u0007W\u0010N-";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "l>\u0011J\u0005\t+\u0015J\u001fF<TF\u0014\t+\u001bJ\u0002]:\u0001G\u0005L,";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "M-ZC\u0003L-\u001aV\u001eK'\u0000\n\u0014_-\u001aP\u0013\\;ZA\u0003['\u0006@\u0018H$\u001bC_O!\u001aM\u0002A\u0017\u0015B\u0005L:+@\u0018H$\u001bC";
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
        l.b = 0;
    }
    
    public static Dialog a(final Context context, final Bundle bundle, final DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        final int b = c.b;
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        try {
            alertDialog$Builder.setTitle((CharSequence)bundle.getString(l.z[0]));
            alertDialog$Builder.setMessage((CharSequence)bundle.getString(l.z[1]));
            if (l.b != 0) {
                alertDialog$Builder.setIcon(l.b);
            }
            alertDialog$Builder.setPositiveButton(17039370, dialogInterface$OnClickListener);
            final AlertDialog create = alertDialog$Builder.create();
            if (b != 0) {
                ++m.q;
            }
            return (Dialog)create;
        }
        catch (RuntimeException ex) {
            throw ex;
        }
    }
    
    public static void a(final DialogInterface p0, final int p1, final Activity p2, final Bundle p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       de/greenrobot/event/util/l.a:Ljava/lang/Class;
        //     3: ifnull          28
        //     6: getstatic       de/greenrobot/event/util/l.a:Ljava/lang/Class;
        //     9: invokevirtual   java/lang/Class.newInstance:()Ljava/lang/Object;
        //    12: astore          6
        //    14: getstatic       de/greenrobot/event/util/g.g:Lde/greenrobot/event/util/c;
        //    17: getfield        de/greenrobot/event/util/c.a:Lde/greenrobot/event/util/i;
        //    20: invokevirtual   de/greenrobot/event/util/i.a:()Lde/greenrobot/event/m;
        //    23: aload           6
        //    25: invokevirtual   de/greenrobot/event/m.b:(Ljava/lang/Object;)V
        //    28: aload_3        
        //    29: getstatic       de/greenrobot/event/util/l.z:[Ljava/lang/String;
        //    32: iconst_3       
        //    33: aaload         
        //    34: iconst_0       
        //    35: invokevirtual   android/os/Bundle.getBoolean:(Ljava/lang/String;Z)Z
        //    38: ifeq            49
        //    41: aload_2        
        //    42: ifnull          49
        //    45: aload_2        
        //    46: invokevirtual   android/app/Activity.finish:()V
        //    49: return         
        //    50: astore          5
        //    52: new             Ljava/lang/RuntimeException;
        //    55: dup            
        //    56: getstatic       de/greenrobot/event/util/l.z:[Ljava/lang/String;
        //    59: iconst_2       
        //    60: aaload         
        //    61: aload           5
        //    63: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    66: athrow         
        //    67: astore          4
        //    69: aload           4
        //    71: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  6      14     50     67     Ljava/lang/Exception;
        //  45     49     67     72     Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0049:
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
}
