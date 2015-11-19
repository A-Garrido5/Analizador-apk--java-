// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.support.v7.app.AlertDialog;
import com.whatsapp.util.undobar.UndoBarController;
import com.whatsapp.util.b0;
import android.content.res.Resources;
import android.support.v4.view.MenuItemCompat$OnActionExpandListener;
import android.view.View;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.SearchView$OnQueryTextListener;
import android.widget.TextView;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import com.whatsapp.util.Log;
import android.content.DialogInterface$OnClickListener;
import android.support.v7.app.AlertDialog$Builder;
import android.content.Context;
import android.app.ProgressDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.content.Intent;
import android.view.MotionEvent;
import android.app.Activity;
import java.util.Iterator;
import java.util.List;
import android.support.v4.app.Fragment;
import android.support.v4.app.DialogFragment;
import android.os.AsyncTask;
import android.view.MenuItem;

public class Conversations extends DialogToastActivity
{
    private static final String[] z;
    private MenuItem k;
    String l;
    private a_e m;
    
    static {
        final String[] z2 = new String[29];
        String s = "\u0007\u007fdKo\u0016ckIc\u000b~y\\i\u0010y|T~\u001d?iQe\u0007{'Jx\u000b~m";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0757:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\n';
                        break;
                    }
                    case 0: {
                        c2 = 'd';
                        break;
                    }
                    case 1: {
                        c2 = '\u0010';
                        break;
                    }
                    case 2: {
                        c2 = '\n';
                        break;
                    }
                    case 3: {
                        c2 = '=';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0007\u007fdKo\u0016ckIc\u000b~y\\i\u0010y|T~\u001d?iOo\u0005do";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0007\u007fdKo\u0016ckIc\u000b~y\\i\u0010y|T~\u001d?iOo\u0005do\u0012d\u000b=gX'\u000bb'Py\u0003c~Rx\u0001=n_";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "\u0007\u007fg\u0013}\fq~Nk\u0014`$Td\u0010udI$\u0005s~Te\n>I|F(C";
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "\u0007\u007fdKo\u0016ckIc\u000b~y\u001dh\u000bed^oDde\u001dg\u0005yd";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "\u0007\u007fdKo\u0016ckIc\u000b~y\\i\u0010y|T~\u001d?iOo\u0005do";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u0007\u007fdKo\u0016ckIc\u000b~y\\i\u0010y|T~\u001d?yJ'\u0001hzTx\u0001t";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u0007\u007fdKo\u0016ckIc\u000b~y\\i\u0010y|T~\u001d?nXy\u0010beD";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "\u0007\u007fdKo\u0016ckIc\u000b~y\\i\u0010y|T~\u001d?eM~\r\u007fdN%\u0017iyIo\t=iRd\u0010qiIyIqzM'\n\u007f~\u0010l\u000bedY";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "\u0005~nOe\rt$Td\u0010udI$\u0005s~Te\n>\\tO3";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    s = "\u0007\u007fdKo\u0016ckIc\u000b~y\\i\u0010y|T~\u001d?eM~\r\u007fdN%\n\u007fcS~\u0001~~\u0012y\u001dc~XgIseS~\u0005s~N'\u0005`z\u0010d\u000bd'[e\u0011~n";
                    n = 9;
                    n2 = 10;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    array = z2;
                    s = "\u0007\u007fg\u0013k\ntxRc\u0000>iRd\u0010qiIy";
                    n = 10;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = "\u0001~~Os;`eTd\u0010";
                    n = 11;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "\u0001hcIU\u0003beHz;zcY";
                    n = 12;
                    array = z2;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "\u0007\u007fg\u0013}\fq~Nk\u0014`$Td\u0010udI$\u0005s~Te\n>I|F(C";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "\u0001~nbm\u0016\u007f\u007fMU\u000eyn";
                    n = 14;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    s = "\u0007\u007fdKo\u0016ckIc\u000b~y\\i\u0010y|T~\u001d?z\\\u007f\u0017u";
                    n = 15;
                    n2 = 16;
                    array = z2;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    array = z2;
                    s = "\u0007\u007fdKo\u0016ckIc\u000b~y\\i\u0010y|T~\u001d?z\\\u007f\u0017u";
                    n = 16;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "\u0007\u007fdKo\u0016ckIc\u000b~y\\i\u0010y|T~\u001d?nTk\b\u007fm\u001dy\u000bv~Jk\u0016u'\\h\u000be~\u0010~\u000b=oEz\rbo";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "\u0007\u007fdKo\u0016ckIc\u000b~y\\i\u0010y|T~\u001d?nTk\b\u007fm\u001dy\u0001b|Ti\u0001=oE~\u0001~yTe\n=z\\s\tudI";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "\u0007\u007fdKo\u0016ckIc\u000b~y\\i\u0010y|T~\u001d?nTk\b\u007fm\u001dy\u0001b|Ti\u0001=oE~\u0001~yTe\n=fTl\u0001dcPo";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "\u0007\u007fdKo\u0016ckIc\u000b~y\\i\u0010y|T~\u001d?nTk\b\u007fm\u001dy\u0001b|Ti\u0001=oE~\u0001~yTe\n=oEz\rboY";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "\u0007\u007fdKo\u0016ckIc\u000b~y\\i\u0010y|T~\u001d?nTk\b\u007fm\u001dy\u0001b|Ti\u0001=oE~\u0001~yTe\n=k^~\rfo";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "\u0007\u007fdKo\u0016ckIc\u000b~y\\i\u0010y|T~\u001d?nTk\b\u007fm\u001dy\u0001b|Ti\u0001=oE~\u0001~yTe\n=xRf\brk^a";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "\u0007\u007fdKo\u0016ckIc\u000b~y\\i\u0010y|T~\u001d?xXy\u0011}o\u0012d\u000b=gX'\u000bb'Py\u0003c~Rx\u0001=n_";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "\u0007\u007fdKo\u0016ckIc\u000b~y\\i\u0010y|T~\u001d?xXy\u0011}o";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "\u0007\u007fdKo\u0016ckIc\u000b~y\\i\u0010y|T~\u001d?xXy\u0011}o\u0012|\u000byz\u0010o\nqhQo\u0000";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "\u0007\u007fdKo\u0016ckIc\u000b~y\u001dh\u000bed^oDde\u001dg\u0005yd";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "\u0007\u007fdIk\u0007d";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    break Label_0757;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public Conversations() {
        this.m = new a_z(this);
        this.l = null;
    }
    
    static ga a(final Conversations conversations) {
        return conversations.c();
    }
    
    private void a() {
        aqu.i();
        a8s.a(new aqr(this, null), new Void[0]);
    }
    
    static void a(final Conversations conversations, final boolean b) {
        conversations.b(b);
    }
    
    private void b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: invokestatic    com/whatsapp/aqu.c:()Z
        //     3: ifne            43
        //     6: invokestatic    com/whatsapp/aqu.g:()Z
        //     9: istore          5
        //    11: iload           5
        //    13: ifne            43
        //    16: new             Lcom/whatsapp/aqr;
        //    19: dup            
        //    20: aload_0        
        //    21: aconst_null    
        //    22: invokespecial   com/whatsapp/aqr.<init>:(Lcom/whatsapp/Conversations;Lcom/whatsapp/a_z;)V
        //    25: iconst_0       
        //    26: anewarray       Ljava/lang/Void;
        //    29: invokestatic    com/whatsapp/a8s.a:(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;
        //    32: pop            
        //    33: getstatic       com/whatsapp/App.I:Z
        //    36: istore          7
        //    38: iload           7
        //    40: ifeq            50
        //    43: aload_0        
        //    44: invokestatic    com/whatsapp/aqu.h:()Z
        //    47: invokespecial   com/whatsapp/Conversations.b:(Z)V
        //    50: return         
        //    51: astore_1       
        //    52: aload_1        
        //    53: athrow         
        //    54: astore_2       
        //    55: aload_2        
        //    56: athrow         
        //    57: astore_3       
        //    58: aload_3        
        //    59: athrow         
        //    60: astore          4
        //    62: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //    65: invokevirtual   java/lang/Thread.interrupt:()V
        //    68: aload_0        
        //    69: iconst_0       
        //    70: invokespecial   com/whatsapp/Conversations.b:(Z)V
        //    73: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      11     51     54     Ljava/lang/InterruptedException;
        //  16     38     54     57     Ljava/lang/InterruptedException;
        //  16     38     57     60     Ljava/lang/IllegalArgumentException;
        //  43     50     60     74     Ljava/lang/InterruptedException;
        //  43     50     57     60     Ljava/lang/IllegalArgumentException;
        //  52     54     54     57     Ljava/lang/InterruptedException;
        //  55     57     57     60     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 39, Size: 39
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
    
    private void b(final DialogFragment dialogFragment) {
        App.ac = true;
        App.aq.aZ();
        this.c(dialogFragment);
    }
    
    static void b(final Conversations conversations) {
        conversations.a();
    }
    
    private void b(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iload_1        
        //     1: ifne            22
        //     4: aload_0        
        //     5: invokevirtual   com/whatsapp/Conversations.isFinishing:()Z
        //     8: ifne            16
        //    11: aload_0        
        //    12: iconst_0       
        //    13: invokevirtual   com/whatsapp/Conversations.showDialog:(I)V
        //    16: return         
        //    17: astore          9
        //    19: aload           9
        //    21: athrow         
        //    22: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    25: invokevirtual   com/whatsapp/wc.e:()Lcom/whatsapp/a_d;
        //    28: invokevirtual   com/whatsapp/a_d.y:()Ljava/io/File;
        //    31: invokevirtual   java/io/File.exists:()Z
        //    34: istore          6
        //    36: iload           6
        //    38: ifne            16
        //    41: getstatic       com/whatsapp/App.a6:I
        //    44: istore          7
        //    46: iload           7
        //    48: ifeq            16
        //    51: getstatic       com/whatsapp/ProfilePhotoReminder.l:Z
        //    54: istore          8
        //    56: iload           8
        //    58: ifne            16
        //    61: invokestatic    com/whatsapp/App.O:()Z
        //    64: ifeq            16
        //    67: iconst_1       
        //    68: putstatic       com/whatsapp/ProfilePhotoReminder.l:Z
        //    71: aload_0        
        //    72: new             Landroid/content/Intent;
        //    75: dup            
        //    76: aload_0        
        //    77: ldc             Lcom/whatsapp/ProfilePhotoReminder;.class
        //    79: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //    82: invokevirtual   com/whatsapp/Conversations.startActivity:(Landroid/content/Intent;)V
        //    85: return         
        //    86: astore          5
        //    88: aload           5
        //    90: athrow         
        //    91: astore_2       
        //    92: aload_2        
        //    93: athrow         
        //    94: astore_3       
        //    95: aload_3        
        //    96: athrow         
        //    97: astore          4
        //    99: aload           4
        //   101: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  4      16     17     22     Ljava/lang/IllegalArgumentException;
        //  22     36     91     94     Ljava/lang/IllegalArgumentException;
        //  41     46     94     97     Ljava/lang/IllegalArgumentException;
        //  51     56     97     102    Ljava/lang/IllegalArgumentException;
        //  61     85     86     91     Ljava/lang/IllegalArgumentException;
        //  92     94     94     97     Ljava/lang/IllegalArgumentException;
        //  95     97     97     102    Ljava/lang/IllegalArgumentException;
        //  99     102    86     91     Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 51, Size: 51
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
    
    private ga c() {
        final boolean i = App.I;
        final List fragments = this.getSupportFragmentManager().getFragments();
        if (fragments != null) {
            for (final Fragment fragment : fragments) {
                try {
                    if (fragment instanceof ConversationsFragment) {
                        return (ga)fragment;
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                if (i) {
                    break;
                }
            }
        }
        return null;
    }
    
    private void c(final DialogFragment dialogFragment) {
        try {
            if (this.getSupportFragmentManager().findFragmentByTag(dialogFragment.getClass().getName()) == null) {
                dialogFragment.show(this.getSupportFragmentManager(), dialogFragment.getClass().getName());
            }
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    private void e() {
        try {
            if (ChangeNumber.g()) {
                return;
            }
            final Conversations conversations = this;
            final Conversations conversations2 = this;
            final boolean b = false;
            final String s = ade.a(conversations2, b);
            conversations.l = s;
            final Conversations conversations3 = this;
            final String s2 = conversations3.l;
            if (s2 != null) {
                final Conversations conversations4 = this;
                final int n = 116;
                conversations4.showDialog(n);
            }
            return;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
        try {
            final Conversations conversations = this;
            final Conversations conversations2 = this;
            final boolean b = false;
            final String s = ade.a(conversations2, b);
            conversations.l = s;
            final Conversations conversations3 = this;
            final String s2 = conversations3.l;
            if (s2 != null) {
                final Conversations conversations4 = this;
                final int n = 116;
                conversations4.showDialog(n);
            }
        }
        catch (IllegalArgumentException ex2) {
            throw ex2;
        }
    }
    
    public boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        }
        catch (IllegalArgumentException ex) {
            return false;
        }
    }
    
    @Override
    protected void onActivityResult(final int n, final int n2, final Intent intent) {
    Block_2_Outer:
        while (true) {
            switch (n) {
                default: {
                    break Label_0020;
                }
                case 1: {
                    Label_0028: {
                        break Label_0028;
                        try {
                            super.onActivityResult(n, n2, intent);
                            Label_0027: {
                                return;
                            }
                            // iftrue(Label_0027:, !App.I)
                            // iftrue(Label_0027:, n2 != -1)
                        Block_3:
                            while (true) {
                                this.startActivity(Conversation.a(App.S.e(intent.getStringExtra(Conversations.z[28]))));
                                break Block_3;
                                continue;
                            }
                            continue Block_2_Outer;
                        }
                        catch (IllegalArgumentException ex) {
                            throw ex;
                        }
                    }
                    break;
                }
            }
            break;
        }
    }
    
    public void onCreate(final Bundle p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: new             Lcom/whatsapp/util/b0;
        //     7: dup            
        //     8: getstatic       com/whatsapp/Conversations.z:[Ljava/lang/String;
        //    11: iconst_1       
        //    12: aaload         
        //    13: invokespecial   com/whatsapp/util/b0.<init>:(Ljava/lang/String;)V
        //    16: astore_3       
        //    17: getstatic       com/whatsapp/App.aS:I
        //    20: iconst_3       
        //    21: if_icmpne       28
        //    24: aload_0        
        //    25: invokestatic    com/whatsapp/util/b_.b:(Landroid/app/Activity;)V
        //    28: aload_0        
        //    29: aload_1        
        //    30: invokespecial   com/whatsapp/DialogToastActivity.onCreate:(Landroid/os/Bundle;)V
        //    33: getstatic       com/whatsapp/App.aX:Lcom/whatsapp/App$Me;
        //    36: astore          7
        //    38: aload           7
        //    40: ifnull          64
        //    43: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //    46: invokevirtual   com/whatsapp/vy.l:()Z
        //    49: ifeq            64
        //    52: aload_0        
        //    53: invokestatic    com/whatsapp/App.c:(Landroid/content/Context;)I
        //    56: istore          8
        //    58: iload           8
        //    60: iconst_3       
        //    61: if_icmpeq       115
        //    64: getstatic       com/whatsapp/Conversations.z:[Ljava/lang/String;
        //    67: iconst_2       
        //    68: aaload         
        //    69: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    72: getstatic       com/whatsapp/Conversations.z:[Ljava/lang/String;
        //    75: iconst_4       
        //    76: aaload         
        //    77: invokestatic    com/whatsapp/App.F:(Ljava/lang/String;)V
        //    80: aload_0        
        //    81: new             Landroid/content/Intent;
        //    84: dup            
        //    85: aload_0        
        //    86: ldc_w           Lcom/whatsapp/Main;.class
        //    89: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //    92: invokevirtual   com/whatsapp/Conversations.startActivity:(Landroid/content/Intent;)V
        //    95: aload_0        
        //    96: invokevirtual   com/whatsapp/Conversations.finish:()V
        //    99: return         
        //   100: astore          4
        //   102: aload           4
        //   104: athrow         
        //   105: astore          5
        //   107: aload           5
        //   109: athrow         
        //   110: astore          6
        //   112: aload           6
        //   114: athrow         
        //   115: getstatic       com/whatsapp/App.a:Landroid/media/AsyncPlayer;
        //   118: invokevirtual   android/media/AsyncPlayer.stop:()V
        //   121: getstatic       com/whatsapp/Conversations.z:[Ljava/lang/String;
        //   124: iconst_5       
        //   125: aaload         
        //   126: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   129: invokestatic    com/whatsapp/App.y:()V
        //   132: aload_0        
        //   133: ldc_w           2130903077
        //   136: invokevirtual   com/whatsapp/Conversations.setContentView:(I)V
        //   139: aload_0        
        //   140: invokevirtual   com/whatsapp/Conversations.getSupportActionBar:()Landroid/support/v7/app/ActionBar;
        //   143: iconst_0       
        //   144: invokevirtual   android/support/v7/app/ActionBar.setDisplayHomeAsUpEnabled:(Z)V
        //   147: aload_1        
        //   148: ifnonnull       175
        //   151: aload_0        
        //   152: invokevirtual   com/whatsapp/Conversations.getSupportFragmentManager:()Landroid/support/v4/app/FragmentManager;
        //   155: invokevirtual   android/support/v4/app/FragmentManager.beginTransaction:()Landroid/support/v4/app/FragmentTransaction;
        //   158: ldc_w           2131755260
        //   161: new             Lcom/whatsapp/ConversationsFragment;
        //   164: dup            
        //   165: invokespecial   com/whatsapp/ConversationsFragment.<init>:()V
        //   168: invokevirtual   android/support/v4/app/FragmentTransaction.add:(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
        //   171: invokevirtual   android/support/v4/app/FragmentTransaction.commit:()I
        //   174: pop            
        //   175: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   178: invokevirtual   com/whatsapp/App.D:()Z
        //   181: istore          16
        //   183: iload           16
        //   185: ifeq            211
        //   188: getstatic       com/whatsapp/Conversations.z:[Ljava/lang/String;
        //   191: iconst_0       
        //   192: aaload         
        //   193: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   196: aload_0        
        //   197: new             Lcom/whatsapp/DialogToastActivity$ClockWrongDialogFragment;
        //   200: dup            
        //   201: invokespecial   com/whatsapp/DialogToastActivity$ClockWrongDialogFragment.<init>:()V
        //   204: invokespecial   com/whatsapp/Conversations.b:(Landroid/support/v4/app/DialogFragment;)V
        //   207: iload_2        
        //   208: ifeq            262
        //   211: invokestatic    com/whatsapp/App.w:()Z
        //   214: istore          17
        //   216: iload           17
        //   218: ifeq            245
        //   221: getstatic       com/whatsapp/Conversations.z:[Ljava/lang/String;
        //   224: bipush          6
        //   226: aaload         
        //   227: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   230: aload_0        
        //   231: new             Lcom/whatsapp/DialogToastActivity$SoftwareExpiredDialogFragment;
        //   234: dup            
        //   235: invokespecial   com/whatsapp/DialogToastActivity$SoftwareExpiredDialogFragment.<init>:()V
        //   238: invokespecial   com/whatsapp/Conversations.b:(Landroid/support/v4/app/DialogFragment;)V
        //   241: iload_2        
        //   242: ifeq            262
        //   245: invokestatic    com/whatsapp/App.v:()Z
        //   248: ifeq            262
        //   251: aload_0        
        //   252: new             Lcom/whatsapp/HomeActivity$SoftwareAboutToExpireDialogFragment;
        //   255: dup            
        //   256: invokespecial   com/whatsapp/HomeActivity$SoftwareAboutToExpireDialogFragment.<init>:()V
        //   259: invokespecial   com/whatsapp/Conversations.c:(Landroid/support/v4/app/DialogFragment;)V
        //   262: aload_0        
        //   263: invokespecial   com/whatsapp/Conversations.e:()V
        //   266: getstatic       com/whatsapp/Conversations.z:[Ljava/lang/String;
        //   269: iconst_3       
        //   270: aaload         
        //   271: aload_0        
        //   272: invokevirtual   com/whatsapp/Conversations.getIntent:()Landroid/content/Intent;
        //   275: invokevirtual   android/content/Intent.getAction:()Ljava/lang/String;
        //   278: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   281: ifeq            290
        //   284: invokestatic    com/whatsapp/notification/w.b:()Lcom/whatsapp/notification/w;
        //   287: invokevirtual   com/whatsapp/notification/w.c:()V
        //   290: aload_0        
        //   291: invokespecial   com/whatsapp/Conversations.b:()V
        //   294: aload_3        
        //   295: invokevirtual   com/whatsapp/util/b0.c:()J
        //   298: pop2           
        //   299: return         
        //   300: astore          9
        //   302: aload           9
        //   304: athrow         
        //   305: astore          11
        //   307: aload           11
        //   309: athrow         
        //   310: astore          12
        //   312: aload           12
        //   314: athrow         
        //   315: astore          13
        //   317: aload           13
        //   319: athrow         
        //   320: astore          14
        //   322: aload           14
        //   324: athrow         
        //   325: astore          15
        //   327: aload           15
        //   329: athrow         
        //   330: astore          18
        //   332: aload           18
        //   334: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  17     28     100    105    Ljava/lang/IllegalArgumentException;
        //  28     38     105    110    Ljava/lang/IllegalArgumentException;
        //  43     58     110    115    Ljava/lang/IllegalArgumentException;
        //  107    110    110    115    Ljava/lang/IllegalArgumentException;
        //  115    147    300    305    Ljava/lang/IllegalArgumentException;
        //  151    175    300    305    Ljava/lang/IllegalArgumentException;
        //  175    183    305    310    Ljava/lang/IllegalArgumentException;
        //  188    207    310    315    Ljava/lang/IllegalArgumentException;
        //  211    216    315    320    Ljava/lang/IllegalArgumentException;
        //  221    241    320    325    Ljava/lang/IllegalArgumentException;
        //  245    262    325    330    Ljava/lang/IllegalArgumentException;
        //  262    290    330    335    Ljava/lang/IllegalArgumentException;
        //  307    310    310    315    Ljava/lang/IllegalArgumentException;
        //  312    315    315    320    Ljava/lang/IllegalArgumentException;
        //  317    320    320    325    Ljava/lang/IllegalArgumentException;
        //  322    325    325    330    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 160, Size: 160
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
    
    protected Dialog onCreateDialog(final int n) {
        switch (n) {
            default: {
                return super.onCreateDialog(n);
            }
            case 1: {
                final ProgressDialog progressDialog = new ProgressDialog((Context)this);
                progressDialog.setTitle((CharSequence)this.getString(2131231592));
                progressDialog.setMessage((CharSequence)this.getString(2131231591));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return (Dialog)progressDialog;
            }
            case 0: {
                return new AlertDialog$Builder((Context)this).setTitle(2131231248).setMessage(this.getString(2131231246, new Object[] { this.getString(2131230921) })).setCancelable(false).setPositiveButton(2131231247, (DialogInterface$OnClickListener)new a69(this)).create();
            }
            case 116: {
                return yt.a(this, this.l);
            }
            case 11: {
                return new AlertDialog$Builder((Context)this).setMessage(2131231911).setPositiveButton(2131231435, (DialogInterface$OnClickListener)new cp(this)).create();
            }
            case 115: {
                Log.i(Conversations.z[18]);
                return ade.a(this);
            }
            case 121: {
                Log.w(Conversations.z[23]);
                return yt.e(this);
            }
            case 120: {
                Log.w(Conversations.z[20]);
                return yt.a(this);
            }
            case 119: {
                Log.w(Conversations.z[19]);
                return yt.b(this, false);
            }
            case 117: {
                Log.w(Conversations.z[22]);
                return yt.d(this);
            }
            case 118: {
                Log.w(Conversations.z[21]);
                return yt.c(this);
            }
        }
    }
    
    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        final Resources resources = this.getResources();
        if (z8.h() != 0) {
            final SearchView searchView = new SearchView(this.getSupportActionBar().getThemedContext());
            ((TextView)searchView.findViewById(2131755115)).setTextColor(this.getResources().getColor(2131624031));
            searchView.setOnQueryTextListener(new ati(this));
            MenuItemCompat.setActionView(this.k = menu.add(0, 7, 0, 2131231614).setIcon(2130838731), (View)searchView);
            MenuItemCompat.setShowAsAction(this.k, 10);
            MenuItemCompat.setOnActionExpandListener(this.k, new a24(this));
        }
        try {
            MenuItemCompat.setShowAsAction(menu.add(0, 0, 0, 2131231307).setIcon(2130838715).setAlphabeticShortcut('n'), 2);
            menu.add(0, 10, 0, 2131231303).setIcon(2130838788).setAlphabeticShortcut('g');
            menu.add(0, 9, 0, 2131231304).setIcon(2130838780).setAlphabeticShortcut('b');
            menu.add(0, 11, 0, 2131231314).setIcon(2130838806).setAlphabeticShortcut('q');
            menu.add(0, 4, 0, 2131231301).setIcon(2130838785).setAlphabeticShortcut('c');
            menu.add(0, 2, 0, 2131231312).setIcon(2130838802).setAlphabeticShortcut('o');
            menu.add(0, 1, 0, 2131231313).setIcon(2130838805).setAlphabeticShortcut('s');
            if (App.aV == 3) {
                menu.add(0, 3, 0, 2131231302).setIcon(resources.getDrawable(2130838917));
            }
            return super.onCreateOptionsMenu(menu);
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    public void onDestroy() {
        Log.i(Conversations.z[7]);
        super.onDestroy();
    }
    
    public void onNewIntent(final Intent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: aload_1        
        //     2: invokespecial   com/whatsapp/DialogToastActivity.onNewIntent:(Landroid/content/Intent;)V
        //     5: aload_1        
        //     6: getstatic       com/whatsapp/Conversations.z:[Ljava/lang/String;
        //     9: bipush          13
        //    11: aaload         
        //    12: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //    15: astore_2       
        //    16: aload_2        
        //    17: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    20: istore          6
        //    22: iload           6
        //    24: ifne            65
        //    27: aload_2        
        //    28: invokestatic    com/whatsapp/adc.f:(Ljava/lang/String;)Z
        //    31: istore          10
        //    33: iload           10
        //    35: ifne            48
        //    38: aload_2        
        //    39: invokestatic    com/whatsapp/App.G:(Ljava/lang/String;)V
        //    42: getstatic       com/whatsapp/App.I:Z
        //    45: ifeq            65
        //    48: aload_2        
        //    49: iconst_1       
        //    50: invokestatic    com/whatsapp/App.a:(Ljava/lang/String;Z)V
        //    53: new             Lcom/whatsapp/yv;
        //    56: dup            
        //    57: aload_0        
        //    58: aload_2        
        //    59: invokespecial   com/whatsapp/yv.<init>:(Lcom/whatsapp/Conversations;Ljava/lang/String;)V
        //    62: invokestatic    com/whatsapp/util/bm.a:(Ljava/lang/Runnable;)V
        //    65: aload_1        
        //    66: getstatic       com/whatsapp/Conversations.z:[Ljava/lang/String;
        //    69: bipush          15
        //    71: aaload         
        //    72: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //    75: astore          7
        //    77: aload           7
        //    79: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    82: ifne            104
        //    85: aload           7
        //    87: iconst_1       
        //    88: invokestatic    com/whatsapp/App.a:(Ljava/lang/String;Z)V
        //    91: new             Lcom/whatsapp/bq;
        //    94: dup            
        //    95: aload_0        
        //    96: aload           7
        //    98: invokespecial   com/whatsapp/bq.<init>:(Lcom/whatsapp/Conversations;Ljava/lang/String;)V
        //   101: invokestatic    com/whatsapp/util/bm.a:(Ljava/lang/Runnable;)V
        //   104: getstatic       com/whatsapp/Conversations.z:[Ljava/lang/String;
        //   107: bipush          14
        //   109: aaload         
        //   110: aload_1        
        //   111: invokevirtual   android/content/Intent.getAction:()Ljava/lang/String;
        //   114: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   117: ifeq            126
        //   120: invokestatic    com/whatsapp/notification/w.b:()Lcom/whatsapp/notification/w;
        //   123: invokevirtual   com/whatsapp/notification/w.c:()V
        //   126: return         
        //   127: astore_3       
        //   128: aload_3        
        //   129: athrow         
        //   130: astore          4
        //   132: aload           4
        //   134: athrow         
        //   135: astore          5
        //   137: aload           5
        //   139: athrow         
        //   140: astore          8
        //   142: aload           8
        //   144: athrow         
        //   145: astore          9
        //   147: aload           9
        //   149: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  16     22     127    130    Ljava/lang/IllegalArgumentException;
        //  27     33     130    135    Ljava/lang/IllegalArgumentException;
        //  38     48     135    140    Ljava/lang/IllegalArgumentException;
        //  48     65     135    140    Ljava/lang/IllegalArgumentException;
        //  77     104    140    145    Ljava/lang/IllegalArgumentException;
        //  104    126    145    150    Ljava/lang/IllegalArgumentException;
        //  128    130    130    135    Ljava/lang/IllegalArgumentException;
        //  132    135    135    140    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 75, Size: 75
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
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_1        
        //     5: invokeinterface android/view/MenuItem.getItemId:()I
        //    10: tableswitch {
        //                0: 74
        //                1: 92
        //                2: 109
        //                3: 126
        //                4: 143
        //                5: 72
        //                6: 72
        //                7: 276
        //                8: 72
        //                9: 283
        //               10: 300
        //               11: 480
        //          default: 72
        //        }
        //    72: iconst_0       
        //    73: ireturn        
        //    74: aload_0        
        //    75: new             Landroid/content/Intent;
        //    78: dup            
        //    79: aload_0        
        //    80: ldc_w           Lcom/whatsapp/ContactPicker;.class
        //    83: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //    86: iconst_1       
        //    87: invokevirtual   com/whatsapp/Conversations.startActivityForResult:(Landroid/content/Intent;I)V
        //    90: iconst_1       
        //    91: ireturn        
        //    92: aload_0        
        //    93: new             Landroid/content/Intent;
        //    96: dup            
        //    97: aload_0        
        //    98: ldc_w           Lcom/whatsapp/SetStatus;.class
        //   101: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   104: invokevirtual   com/whatsapp/Conversations.startActivity:(Landroid/content/Intent;)V
        //   107: iconst_1       
        //   108: ireturn        
        //   109: aload_0        
        //   110: new             Landroid/content/Intent;
        //   113: dup            
        //   114: aload_0        
        //   115: ldc_w           Lcom/whatsapp/Settings;.class
        //   118: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   121: invokevirtual   com/whatsapp/Conversations.startActivity:(Landroid/content/Intent;)V
        //   124: iconst_1       
        //   125: ireturn        
        //   126: aload_0        
        //   127: new             Landroid/content/Intent;
        //   130: dup            
        //   131: aload_0        
        //   132: ldc_w           Lcom/whatsapp/Advanced;.class
        //   135: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   138: invokevirtual   com/whatsapp/Conversations.startActivity:(Landroid/content/Intent;)V
        //   141: iconst_1       
        //   142: ireturn        
        //   143: new             Landroid/content/Intent;
        //   146: dup            
        //   147: getstatic       com/whatsapp/Conversations.z:[Ljava/lang/String;
        //   150: bipush          9
        //   152: aaload         
        //   153: getstatic       android/provider/ContactsContract$Contacts.CONTENT_URI:Landroid/net/Uri;
        //   156: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;Landroid/net/Uri;)V
        //   159: astore          24
        //   161: aload           24
        //   163: aload           24
        //   165: aload_0        
        //   166: invokevirtual   com/whatsapp/Conversations.getPackageManager:()Landroid/content/pm/PackageManager;
        //   169: invokevirtual   android/content/Intent.resolveActivity:(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;
        //   172: invokevirtual   android/content/Intent.setComponent:(Landroid/content/ComponentName;)Landroid/content/Intent;
        //   175: pop            
        //   176: aload           24
        //   178: invokevirtual   android/content/Intent.getComponent:()Landroid/content/ComponentName;
        //   181: ifnull          194
        //   184: aload_0        
        //   185: aload           24
        //   187: invokevirtual   com/whatsapp/Conversations.startActivity:(Landroid/content/Intent;)V
        //   190: iload_2        
        //   191: ifeq            239
        //   194: aload_0        
        //   195: invokevirtual   com/whatsapp/Conversations.getPackageManager:()Landroid/content/pm/PackageManager;
        //   198: getstatic       com/whatsapp/Conversations.z:[Ljava/lang/String;
        //   201: bipush          11
        //   203: aaload         
        //   204: invokevirtual   android/content/pm/PackageManager.getLaunchIntentForPackage:(Ljava/lang/String;)Landroid/content/Intent;
        //   207: astore          28
        //   209: aload           28
        //   211: ifnonnull       233
        //   214: getstatic       com/whatsapp/Conversations.z:[Ljava/lang/String;
        //   217: bipush          10
        //   219: aaload         
        //   220: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   223: aload_0        
        //   224: bipush          11
        //   226: invokevirtual   com/whatsapp/Conversations.showDialog:(I)V
        //   229: iload_2        
        //   230: ifeq            239
        //   233: aload_0        
        //   234: aload           28
        //   236: invokevirtual   com/whatsapp/Conversations.startActivity:(Landroid/content/Intent;)V
        //   239: iconst_1       
        //   240: ireturn        
        //   241: astore          25
        //   243: aload           25
        //   245: athrow         
        //   246: astore          30
        //   248: aload           30
        //   250: athrow         
        //   251: astore          29
        //   253: aload           29
        //   255: athrow         
        //   256: astore          27
        //   258: getstatic       com/whatsapp/Conversations.z:[Ljava/lang/String;
        //   261: bipush          8
        //   263: aaload         
        //   264: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   267: aload_0        
        //   268: bipush          11
        //   270: invokevirtual   com/whatsapp/Conversations.showDialog:(I)V
        //   273: goto            239
        //   276: aload_0        
        //   277: invokevirtual   com/whatsapp/Conversations.onSearchRequested:()Z
        //   280: pop            
        //   281: iconst_1       
        //   282: ireturn        
        //   283: aload_0        
        //   284: new             Landroid/content/Intent;
        //   287: dup            
        //   288: aload_0        
        //   289: ldc_w           Lcom/whatsapp/ListMembersSelector;.class
        //   292: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   295: invokevirtual   com/whatsapp/Conversations.startActivity:(Landroid/content/Intent;)V
        //   298: iconst_1       
        //   299: ireturn        
        //   300: invokestatic    com/whatsapp/z8.j:()Ljava/util/ArrayList;
        //   303: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   306: astore          9
        //   308: iconst_0       
        //   309: istore          10
        //   311: aload           9
        //   313: invokeinterface java/util/Iterator.hasNext:()Z
        //   318: ifeq            583
        //   321: aload           9
        //   323: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   328: checkcast       Ljava/lang/String;
        //   331: astore          16
        //   333: aload           16
        //   335: invokestatic    com/whatsapp/adc.b:(Ljava/lang/String;)Z
        //   338: istore          20
        //   340: iload           20
        //   342: ifeq            576
        //   345: aload           16
        //   347: invokestatic    com/whatsapp/App.au:()Ljava/lang/String;
        //   350: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   353: istore          21
        //   355: iload           21
        //   357: ifeq            576
        //   360: aload           16
        //   362: invokestatic    com/whatsapp/a_9.c:(Ljava/lang/String;)Z
        //   365: istore          22
        //   367: iload           22
        //   369: ifne            576
        //   372: iload           10
        //   374: iconst_1       
        //   375: iadd           
        //   376: istore          11
        //   378: iload_2        
        //   379: ifeq            569
        //   382: iload           11
        //   384: getstatic       com/whatsapp/ym.e:I
        //   387: if_icmplt       441
        //   390: iconst_1       
        //   391: anewarray       Ljava/lang/Object;
        //   394: astore          15
        //   396: aload           15
        //   398: iconst_0       
        //   399: getstatic       com/whatsapp/ym.e:I
        //   402: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   405: aastore        
        //   406: aload_0        
        //   407: aload_0        
        //   408: ldc_w           2131231173
        //   411: aload           15
        //   413: invokevirtual   com/whatsapp/Conversations.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   416: invokevirtual   com/whatsapp/Conversations.f:(Ljava/lang/String;)V
        //   419: iconst_1       
        //   420: ireturn        
        //   421: astore          17
        //   423: aload           17
        //   425: athrow         
        //   426: astore          18
        //   428: aload           18
        //   430: athrow         
        //   431: astore          19
        //   433: aload           19
        //   435: athrow         
        //   436: astore          12
        //   438: aload           12
        //   440: athrow         
        //   441: new             Landroid/content/Intent;
        //   444: dup            
        //   445: aload_0        
        //   446: ldc_w           Lcom/whatsapp/NewGroup;.class
        //   449: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   452: astore          13
        //   454: aload           13
        //   456: getstatic       com/whatsapp/Conversations.z:[Ljava/lang/String;
        //   459: bipush          12
        //   461: aaload         
        //   462: getstatic       com/whatsapp/fieldstats/ak.MENU:Lcom/whatsapp/fieldstats/ak;
        //   465: invokevirtual   com/whatsapp/fieldstats/ak.getCode:()I
        //   468: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;I)Landroid/content/Intent;
        //   471: pop            
        //   472: aload_0        
        //   473: aload           13
        //   475: invokevirtual   com/whatsapp/Conversations.startActivity:(Landroid/content/Intent;)V
        //   478: iconst_1       
        //   479: ireturn        
        //   480: invokestatic    com/whatsapp/l7.p:()Z
        //   483: istore          7
        //   485: iload           7
        //   487: ifeq            509
        //   490: aload_0        
        //   491: new             Landroid/content/Intent;
        //   494: dup            
        //   495: aload_0        
        //   496: ldc_w           Lcom/whatsapp/WebSessionsActivity;.class
        //   499: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   502: invokevirtual   com/whatsapp/Conversations.startActivity:(Landroid/content/Intent;)V
        //   505: iload_2        
        //   506: ifeq            549
        //   509: invokestatic    com/whatsapp/App.O:()Z
        //   512: istore          8
        //   514: iload           8
        //   516: ifeq            538
        //   519: aload_0        
        //   520: new             Landroid/content/Intent;
        //   523: dup            
        //   524: aload_0        
        //   525: ldc_w           Lcom/whatsapp/qrcode/QrCodeActivity;.class
        //   528: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   531: invokevirtual   com/whatsapp/Conversations.startActivity:(Landroid/content/Intent;)V
        //   534: iload_2        
        //   535: ifeq            549
        //   538: aload_0        
        //   539: invokevirtual   com/whatsapp/Conversations.getBaseContext:()Landroid/content/Context;
        //   542: ldc_w           2131231385
        //   545: iconst_0       
        //   546: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //   549: iconst_1       
        //   550: ireturn        
        //   551: astore_3       
        //   552: aload_3        
        //   553: athrow         
        //   554: astore          4
        //   556: aload           4
        //   558: athrow         
        //   559: astore          5
        //   561: aload           5
        //   563: athrow         
        //   564: astore          6
        //   566: aload           6
        //   568: athrow         
        //   569: iload           11
        //   571: istore          10
        //   573: goto            311
        //   576: iload           10
        //   578: istore          11
        //   580: goto            378
        //   583: iload           10
        //   585: istore          11
        //   587: goto            382
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  161    190    241    246    Landroid/content/ActivityNotFoundException;
        //  194    209    256    276    Landroid/content/ActivityNotFoundException;
        //  214    229    246    251    Landroid/content/ActivityNotFoundException;
        //  233    239    251    256    Landroid/content/ActivityNotFoundException;
        //  248    251    251    256    Landroid/content/ActivityNotFoundException;
        //  253    256    256    276    Landroid/content/ActivityNotFoundException;
        //  333    340    421    426    Landroid/content/ActivityNotFoundException;
        //  345    355    426    431    Landroid/content/ActivityNotFoundException;
        //  360    367    431    436    Landroid/content/ActivityNotFoundException;
        //  382    419    436    441    Landroid/content/ActivityNotFoundException;
        //  423    426    426    431    Landroid/content/ActivityNotFoundException;
        //  428    431    431    436    Landroid/content/ActivityNotFoundException;
        //  480    485    551    554    Landroid/content/ActivityNotFoundException;
        //  490    505    554    559    Landroid/content/ActivityNotFoundException;
        //  509    514    559    564    Landroid/content/ActivityNotFoundException;
        //  519    534    564    569    Landroid/content/ActivityNotFoundException;
        //  538    549    564    569    Landroid/content/ActivityNotFoundException;
        //  552    554    554    559    Landroid/content/ActivityNotFoundException;
        //  556    559    559    564    Landroid/content/ActivityNotFoundException;
        //  561    564    564    569    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 260, Size: 260
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
    
    public void onPause() {
        Log.i(Conversations.z[17]);
        final b0 b0 = new b0(Conversations.z[16]);
        super.onPause();
        UndoBarController.b(this);
        b0.c();
    }
    
    protected void onPrepareDialog(final int n, final Dialog dialog) {
        final boolean i = App.I;
    Label_0089_Outer:
        while (true) {
        Label_0075_Outer:
            while (true) {
                while (true) {
                    switch (n) {
                        default: {
                            break Label_0040;
                        }
                        case 121: {
                            break Label_0075_Outer;
                        }
                        case 117: {
                            Label_0061: {
                                break Label_0061;
                                try {
                                    super.onPrepareDialog(n, dialog);
                                    Label_0046: {
                                        return;
                                    }
                                    ((AlertDialog)dialog).setMessage(yt.c());
                                    // iftrue(Label_0046:, !i)
                                    // iftrue(Label_0046:, !i)
                                    // iftrue(Label_0046:, !i)
                                    Block_2: {
                                        break Block_2;
                                        ((AlertDialog)dialog).setMessage(yt.b());
                                        ((AlertDialog)dialog).setMessage(yt.a());
                                        break Label_0075;
                                    }
                                    continue Label_0089_Outer;
                                    ((AlertDialog)dialog).setMessage(yt.d());
                                    // iftrue(Label_0046:, !i)
                                    continue Label_0075_Outer;
                                }
                                catch (IllegalArgumentException ex) {
                                    throw ex;
                                }
                            }
                            break;
                        }
                        case 118: {
                            continue;
                        }
                        case 119: {
                            continue Label_0075_Outer;
                        }
                    }
                    break;
                }
                break;
            }
            break;
        }
    }
    
    public boolean onPrepareOptionsMenu(final Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }
    
    public void onResume() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/Conversations.z:[Ljava/lang/String;
        //     3: bipush          25
        //     5: aaload         
        //     6: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //     9: aload_0        
        //    10: invokespecial   com/whatsapp/DialogToastActivity.onResume:()V
        //    13: getstatic       com/whatsapp/App.aX:Lcom/whatsapp/App$Me;
        //    16: astore          4
        //    18: aload           4
        //    20: ifnull          44
        //    23: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //    26: invokevirtual   com/whatsapp/vy.l:()Z
        //    29: istore          5
        //    31: iload           5
        //    33: ifeq            44
        //    36: aload_0        
        //    37: invokestatic    com/whatsapp/App.c:(Landroid/content/Context;)I
        //    40: iconst_3       
        //    41: if_icmpeq       62
        //    44: getstatic       com/whatsapp/Conversations.z:[Ljava/lang/String;
        //    47: bipush          24
        //    49: aaload         
        //    50: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    53: getstatic       com/whatsapp/Conversations.z:[Ljava/lang/String;
        //    56: bipush          27
        //    58: aaload         
        //    59: invokestatic    com/whatsapp/App.F:(Ljava/lang/String;)V
        //    62: getstatic       com/whatsapp/Conversations.z:[Ljava/lang/String;
        //    65: bipush          26
        //    67: aaload         
        //    68: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    71: aload_0        
        //    72: new             Landroid/content/Intent;
        //    75: dup            
        //    76: aload_0        
        //    77: ldc_w           Lcom/whatsapp/Main;.class
        //    80: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //    83: invokevirtual   com/whatsapp/Conversations.startActivity:(Landroid/content/Intent;)V
        //    86: aload_0        
        //    87: invokevirtual   com/whatsapp/Conversations.finish:()V
        //    90: return         
        //    91: astore_1       
        //    92: aload_1        
        //    93: athrow         
        //    94: astore_2       
        //    95: aload_2        
        //    96: athrow         
        //    97: astore_3       
        //    98: aload_3        
        //    99: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  0      18     91     94     Ljava/lang/IllegalArgumentException;
        //  23     31     94     97     Ljava/lang/IllegalArgumentException;
        //  36     44     97     100    Ljava/lang/IllegalArgumentException;
        //  44     62     97     100    Ljava/lang/IllegalArgumentException;
        //  92     94     94     97     Ljava/lang/IllegalArgumentException;
        //  95     97     97     100    Ljava/lang/IllegalArgumentException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 50, Size: 50
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
    
    public boolean onSearchRequested() {
        try {
            if (this.k != null) {
                MenuItemCompat.expandActionView(this.k);
            }
            return false;
        }
        catch (IllegalArgumentException ex) {
            throw ex;
        }
    }
    
    @Override
    protected void onStart() {
        super.onStart();
        ade.a(this.m);
    }
    
    @Override
    protected void onStop() {
        super.onStop();
        ade.b(this.m);
    }
}
