// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.support.v4.view.MenuItemCompat;
import android.view.Menu;
import com.whatsapp.util.Log;
import com.whatsapp.util.cq;
import android.text.TextUtils;
import android.app.Dialog;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.ContextMenu;
import android.widget.AdapterView$AdapterContextMenuInfo;
import android.view.MenuItem;
import android.transition.Transition;
import android.transition.Slide;
import android.transition.TransitionSet;
import android.os.Build$VERSION;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface$OnClickListener;
import android.support.v7.app.AlertDialog$Builder;
import com.whatsapp.fieldstats.bq;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.ListView;
import java.util.ArrayList;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageButton;

public class ListChatInfo extends ChatInfoActivity implements aws
{
    private static final String[] H;
    private ImageButton A;
    private a63 B;
    private TextView C;
    private View D;
    private a_9 E;
    private a9q F;
    private ArrayList G;
    private TextView q;
    private ListView r;
    private final sj s;
    private TextView t;
    private ChatInfoLayout u;
    private View v;
    private tt w;
    private a_9 x;
    private View y;
    private LinearLayout z;
    
    static {
        final String[] h = new String[22];
        String s = ":\u000f[go5\u000eIgo?\bN|\u001f5\u0014MrD3";
        int n = -1;
        String[] array = h;
        int n2 = 0;
        String intern = null;
    Label_0582:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '0';
                        break;
                    }
                    case 0: {
                        c2 = 'V';
                        break;
                    }
                    case 1: {
                        c2 = 'f';
                        break;
                    }
                    case 2: {
                        c2 = '(';
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
                    s = "%\u0003DvS\"\u0003LLZ?\u0002";
                    n2 = 1;
                    array = h;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "5\u000fZpE:\u0007ZLD$\u0007F`Y\"\u000fG}";
                    n2 = 2;
                    array = h;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "1\u000fL";
                    n2 = 3;
                    array = h;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = h;
                    s = " \bL=Q8\u0002Z|Y2HKfB%\tZ=Y\"\u0003E<S9\b\\rS\"";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "7\bLa_?\u0002\u0006z^\"\u0003Fg\u001e7\u0005\\z_8Ha]c\u00134|L\u007f\u00049mWy\u0002";
                    n = 4;
                    array = h;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "&\u000eG}U\t\u0012QcU";
                    n = 5;
                    array = h;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "&\u000eG}U";
                    n = 6;
                    array = h;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = ":\u000f[go5\u000eIgo?\bN|\u001f2\u0003[gB9\u001f";
                    n = 7;
                    array = h;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = ":\u000f[gS>\u0007\\z^0\t\u0007rT2FMkY%\u0012A}Wv\u0005G}D7\u0005\\)\u00107\u0005\\zF?\u0012Q3^9\u0012\bu_#\bL?\u0010&\u0014GqQ4\nQ3D7\u0004DvD";
                    n = 8;
                    array = h;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "1\u000fL";
                    n = 9;
                    array = h;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\u0016\u0015\u0006dX7\u0012[r@&HFvD";
                    n = 10;
                    array = h;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    n2 = 12;
                    s = ":\u000f[gS>\u0007\\z^0\t\u0007pB3\u0007\\z_8K\\z]3IMaB9\u0014\b";
                    n = 11;
                    array = h;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    s = "5\u000fZpE:\u0007ZLD$\u0007F`Y\"\u000fG}";
                    n = 12;
                    array = h;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "1\u000fL";
                    n = 13;
                    array = h;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    n2 = 15;
                    s = "&\u000eG}U";
                    n = 14;
                    array = h;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    s = "1\u0014Gf@v\u000fFu_y\u0005G}D3\u001e\\3C/\u0015\\v]v\u0005G}D7\u0005\\3\\?\u0015\\3S9\u0013Dw\u00108\t\\3V9\u0013Fw";
                    n = 15;
                    array = h;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "7\bLa_?\u0002\u0006z^\"\u0003Fg\u001e7\u0005\\z_8Ha]c\u00134|";
                    n = 16;
                    array = h;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "%\u0003DvS\"\u0003LLZ?\u0002";
                    n = 17;
                    array = h;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    s = "5\tFgQ5\u0012";
                    n = 18;
                    n2 = 19;
                    array = h;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    array = h;
                    s = ":\u000f[go5\u000eIgo?\bN|\u001f$\u0003[f\\\"IK|^\"\u0007Kg\u00108\t\\3Q2\u0002Mw";
                    n = 19;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = ":\u000f[go5\u000eIgo?\bN|\u001f$\u0003[f\\\"I[xY&IK|^\"\u0007Kg\u00108\t\\3Q2\u0002Mw";
                    n = 20;
                    array = h;
                    continue;
                }
                case 20: {
                    break Label_0582;
                }
            }
        }
        array[n2] = intern;
        H = h;
    }
    
    public ListChatInfo() {
        this.G = new ArrayList();
        this.F = new a9q();
        this.s = new sp(this);
    }
    
    static void a(final ListChatInfo listChatInfo) {
        listChatInfo.h();
    }
    
    static void a(final ListChatInfo listChatInfo, final a_9 a_9) {
        listChatInfo.a(a_9);
    }
    
    static void a(final ListChatInfo listChatInfo, final ArrayList list) {
        listChatInfo.a(list);
    }
    
    private void a(final a_9 a_9) {
        adc.a(this.E.u, a_9.u);
        this.G.remove(a_9);
        this.g();
    }
    
    public static void a(final a_9 a_9, final Activity activity) {
        a(a_9, activity, null);
    }
    
    public static void a(final a_9 a_9, final Activity activity, final ActivityOptionsCompat activityOptionsCompat) {
        while (true) {
            final Intent intent = new Intent((Context)activity, (Class)ListChatInfo.class);
            while (true) {
                try {
                    intent.putExtra(ListChatInfo.H[14], a_9.u);
                    intent.putExtra(ListChatInfo.H[13], true);
                    if (activityOptionsCompat == null) {
                        final Bundle bundle = null;
                        ActivityCompat.startActivity(activity, intent, bundle);
                        return;
                    }
                }
                catch (NumberFormatException ex) {
                    throw ex;
                }
                final Bundle bundle = activityOptionsCompat.toBundle();
                continue;
            }
        }
    }
    
    private void a(final ArrayList list) {
        while (true) {
            while (true) {
                try {
                    if (this.E == null) {
                        final String u = null;
                        this.a(list, u);
                        return;
                    }
                }
                catch (NumberFormatException ex) {
                    throw ex;
                }
                final String u = this.E.u;
                continue;
            }
        }
    }
    
    private boolean a(final a_9 a_9, final int n) {
        Label_0090: {
            switch (n) {
                case 0: {
                    try {
                        if (a_9.e != null) {
                            ContactInfo.a(a_9, this);
                            return true;
                        }
                        break;
                    }
                    catch (NumberFormatException ex) {
                        throw ex;
                    }
                }
                case 2: {
                    while (true) {
                        if (a_9 == null) {
                            try {
                                App.a((Context)this, 2131231154, 0);
                                if (App.I) {
                                    this.b(a_9);
                                    return true;
                                }
                                break;
                            }
                            catch (NumberFormatException ex2) {
                                throw ex2;
                            }
                            break Label_0090;
                        }
                        continue;
                    }
                }
                case 3: {
                    this.i();
                    return true;
                }
                case 1: {
                    this.startActivity(Conversation.a(a_9));
                    return true;
                }
                case 4: {
                    App.a(a_9, this, bq.ANDROID_LIST_CHAT_INFO);
                    return true;
                }
                case 5: {
                    this.showDialog(6);
                    return true;
                }
            }
        }
        return true;
    }
    
    static a9q b(final ListChatInfo listChatInfo) {
        return listChatInfo.F;
    }
    
    static a_9 b(final ListChatInfo listChatInfo, final a_9 x) {
        return listChatInfo.x = x;
    }
    
    private void b(final a_9 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_1        
        //     1: invokevirtual   com/whatsapp/a_9.f:()Ljava/lang/String;
        //     4: astore_2       
        //     5: new             Landroid/content/Intent;
        //     8: dup            
        //     9: getstatic       com/whatsapp/ListChatInfo.H:[Ljava/lang/String;
        //    12: bipush          17
        //    14: aaload         
        //    15: getstatic       android/provider/ContactsContract$Contacts.CONTENT_URI:Landroid/net/Uri;
        //    18: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;Landroid/net/Uri;)V
        //    21: astore_3       
        //    22: aload_3        
        //    23: getstatic       com/whatsapp/ListChatInfo.H:[Ljava/lang/String;
        //    26: bipush          15
        //    28: aaload         
        //    29: aload_2        
        //    30: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //    33: pop            
        //    34: aload_3        
        //    35: aload_3        
        //    36: aload_0        
        //    37: invokevirtual   com/whatsapp/ListChatInfo.getPackageManager:()Landroid/content/pm/PackageManager;
        //    40: invokevirtual   android/content/Intent.resolveActivity:(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;
        //    43: invokevirtual   android/content/Intent.setComponent:(Landroid/content/ComponentName;)Landroid/content/Intent;
        //    46: pop            
        //    47: aload_3        
        //    48: invokevirtual   android/content/Intent.getComponent:()Landroid/content/ComponentName;
        //    51: astore          8
        //    53: aload           8
        //    55: ifnull          71
        //    58: aload_0        
        //    59: aload_3        
        //    60: bipush          10
        //    62: invokevirtual   com/whatsapp/ListChatInfo.startActivityForResult:(Landroid/content/Intent;I)V
        //    65: getstatic       com/whatsapp/App.I:Z
        //    68: ifeq            94
        //    71: getstatic       com/whatsapp/ListChatInfo.H:[Ljava/lang/String;
        //    74: bipush          16
        //    76: aaload         
        //    77: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    80: invokestatic    com/whatsapp/App.N:()V
        //    83: return         
        //    84: astore          4
        //    86: aload           4
        //    88: athrow         
        //    89: astore          5
        //    91: aload           5
        //    93: athrow         
        //    94: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  22     53     84     89     Ljava/lang/NumberFormatException;
        //  58     71     89     94     Ljava/lang/NumberFormatException;
        //  71     83     89     94     Ljava/lang/NumberFormatException;
        //  86     89     89     94     Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0071:
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
    
    static void c(final ListChatInfo listChatInfo) {
        listChatInfo.j();
    }
    
    static a_9 d(final ListChatInfo listChatInfo) {
        return listChatInfo.x;
    }
    
    static a_9 e(final ListChatInfo listChatInfo) {
        return listChatInfo.E;
    }
    
    private void e() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        com/whatsapp/ListChatInfo.r:Landroid/widget/ListView;
        //     8: iconst_0       
        //     9: invokevirtual   android/widget/ListView.getChildAt:(I)Landroid/view/View;
        //    12: astore_2       
        //    13: aload_2        
        //    14: ifnull          116
        //    17: aload_0        
        //    18: getfield        com/whatsapp/ListChatInfo.r:Landroid/widget/ListView;
        //    21: invokevirtual   android/widget/ListView.getWidth:()I
        //    24: aload_0        
        //    25: getfield        com/whatsapp/ListChatInfo.r:Landroid/widget/ListView;
        //    28: invokevirtual   android/widget/ListView.getHeight:()I
        //    31: if_icmple       91
        //    34: aload_0        
        //    35: getfield        com/whatsapp/ListChatInfo.r:Landroid/widget/ListView;
        //    38: invokevirtual   android/widget/ListView.getFirstVisiblePosition:()I
        //    41: istore          5
        //    43: iload           5
        //    45: ifne            58
        //    48: aload_2        
        //    49: invokevirtual   android/view/View.getTop:()I
        //    52: istore          6
        //    54: iload_1        
        //    55: ifeq            70
        //    58: iconst_1       
        //    59: aload_0        
        //    60: getfield        com/whatsapp/ListChatInfo.y:Landroid/view/View;
        //    63: invokevirtual   android/view/View.getHeight:()I
        //    66: ineg           
        //    67: iadd           
        //    68: istore          6
        //    70: aload_0        
        //    71: getfield        com/whatsapp/ListChatInfo.y:Landroid/view/View;
        //    74: iload           6
        //    76: aload_0        
        //    77: getfield        com/whatsapp/ListChatInfo.y:Landroid/view/View;
        //    80: invokevirtual   android/view/View.getTop:()I
        //    83: isub           
        //    84: invokevirtual   android/view/View.offsetTopAndBottom:(I)V
        //    87: iload_1        
        //    88: ifeq            116
        //    91: aload_0        
        //    92: getfield        com/whatsapp/ListChatInfo.y:Landroid/view/View;
        //    95: invokevirtual   android/view/View.getTop:()I
        //    98: ifeq            116
        //   101: aload_0        
        //   102: getfield        com/whatsapp/ListChatInfo.y:Landroid/view/View;
        //   105: aload_0        
        //   106: getfield        com/whatsapp/ListChatInfo.y:Landroid/view/View;
        //   109: invokevirtual   android/view/View.getTop:()I
        //   112: ineg           
        //   113: invokevirtual   android/view/View.offsetTopAndBottom:(I)V
        //   116: return         
        //   117: astore_3       
        //   118: aload_3        
        //   119: athrow         
        //   120: astore          7
        //   122: aload           7
        //   124: athrow         
        //   125: astore          4
        //   127: aload           4
        //   129: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  17     43     117    120    Ljava/lang/NumberFormatException;
        //  70     87     120    125    Ljava/lang/NumberFormatException;
        //  91     116    125    130    Ljava/lang/NumberFormatException;
        //  122    125    125    130    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 65, Size: 65
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
    
    private void e(final String s) {
        adc.d(this.E.u, s);
        this.G.add(App.S.e(s));
        this.g();
    }
    
    static ArrayList f(final ListChatInfo listChatInfo) {
        return listChatInfo.G;
    }
    
    private void f() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/ListChatInfo.E:Lcom/whatsapp/a_9;
        //     4: getfield        com/whatsapp/a_9.t:Ljava/lang/String;
        //     7: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    10: istore_3       
        //    11: iload_3        
        //    12: ifeq            77
        //    15: aload_0        
        //    16: getfield        com/whatsapp/ListChatInfo.q:Landroid/widget/TextView;
        //    19: astore          4
        //    21: getstatic       com/whatsapp/App.C:Lcom/whatsapp/aai;
        //    24: ldc_w           2131296261
        //    27: aload_0        
        //    28: getfield        com/whatsapp/ListChatInfo.G:Ljava/util/ArrayList;
        //    31: invokevirtual   java/util/ArrayList.size:()I
        //    34: invokevirtual   com/whatsapp/aai.a:(II)Ljava/lang/String;
        //    37: astore          5
        //    39: iconst_1       
        //    40: anewarray       Ljava/lang/Object;
        //    43: astore          6
        //    45: aload           6
        //    47: iconst_0       
        //    48: aload_0        
        //    49: getfield        com/whatsapp/ListChatInfo.G:Ljava/util/ArrayList;
        //    52: invokevirtual   java/util/ArrayList.size:()I
        //    55: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    58: aastore        
        //    59: aload           4
        //    61: aload           5
        //    63: aload           6
        //    65: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //    68: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //    71: getstatic       com/whatsapp/App.I:Z
        //    74: ifeq            116
        //    77: aload_0        
        //    78: getfield        com/whatsapp/ListChatInfo.q:Landroid/widget/TextView;
        //    81: aload_0        
        //    82: getfield        com/whatsapp/ListChatInfo.E:Lcom/whatsapp/a_9;
        //    85: aload_0        
        //    86: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //    89: aload_0        
        //    90: invokevirtual   com/whatsapp/ListChatInfo.getBaseContext:()Landroid/content/Context;
        //    93: aload_0        
        //    94: getfield        com/whatsapp/ListChatInfo.q:Landroid/widget/TextView;
        //    97: invokevirtual   android/widget/TextView.getPaint:()Landroid/text/TextPaint;
        //   100: ldc_w           0.82
        //   103: invokestatic    com/whatsapp/util/cq.b:(Ljava/lang/String;Landroid/content/Context;Landroid/graphics/Paint;F)Ljava/lang/CharSequence;
        //   106: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   109: return         
        //   110: astore_1       
        //   111: aload_1        
        //   112: athrow         
        //   113: astore_2       
        //   114: aload_2        
        //   115: athrow         
        //   116: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      11     110    113    Ljava/lang/NumberFormatException;
        //  15     77     113    116    Ljava/lang/NumberFormatException;
        //  77     109    113    116    Ljava/lang/NumberFormatException;
        //  111    113    113    116    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0077:
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
    
    private void g() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/ym.b:I
        //     3: istore_3       
        //     4: iload_3        
        //     5: ifne            35
        //     8: aload_0        
        //     9: getfield        com/whatsapp/ListChatInfo.C:Landroid/widget/TextView;
        //    12: invokestatic    java/text/NumberFormat.getInstance:()Ljava/text/NumberFormat;
        //    15: aload_0        
        //    16: getfield        com/whatsapp/ListChatInfo.G:Ljava/util/ArrayList;
        //    19: invokevirtual   java/util/ArrayList.size:()I
        //    22: i2l            
        //    23: invokevirtual   java/text/NumberFormat.format:(J)Ljava/lang/String;
        //    26: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //    29: getstatic       com/whatsapp/App.I:Z
        //    32: ifeq            85
        //    35: aload_0        
        //    36: getfield        com/whatsapp/ListChatInfo.C:Landroid/widget/TextView;
        //    39: astore          4
        //    41: iconst_2       
        //    42: anewarray       Ljava/lang/Object;
        //    45: astore          5
        //    47: aload           5
        //    49: iconst_0       
        //    50: aload_0        
        //    51: getfield        com/whatsapp/ListChatInfo.G:Ljava/util/ArrayList;
        //    54: invokevirtual   java/util/ArrayList.size:()I
        //    57: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    60: aastore        
        //    61: aload           5
        //    63: iconst_1       
        //    64: getstatic       com/whatsapp/ym.b:I
        //    67: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    70: aastore        
        //    71: aload           4
        //    73: aload_0        
        //    74: ldc_w           2131231443
        //    77: aload           5
        //    79: invokevirtual   com/whatsapp/ListChatInfo.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //    82: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //    85: aload_0        
        //    86: getfield        com/whatsapp/ListChatInfo.G:Ljava/util/ArrayList;
        //    89: new             Lcom/whatsapp/y_;
        //    92: dup            
        //    93: aload_0        
        //    94: invokevirtual   com/whatsapp/ListChatInfo.getApplicationContext:()Landroid/content/Context;
        //    97: invokespecial   com/whatsapp/y_.<init>:(Landroid/content/Context;)V
        //   100: invokestatic    java/util/Collections.sort:(Ljava/util/List;Ljava/util/Comparator;)V
        //   103: aload_0        
        //   104: getfield        com/whatsapp/ListChatInfo.w:Lcom/whatsapp/tt;
        //   107: invokevirtual   com/whatsapp/tt.notifyDataSetChanged:()V
        //   110: aload_0        
        //   111: invokespecial   com/whatsapp/ListChatInfo.f:()V
        //   114: return         
        //   115: astore_1       
        //   116: aload_1        
        //   117: athrow         
        //   118: astore_2       
        //   119: aload_2        
        //   120: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      4      115    118    Ljava/lang/NumberFormatException;
        //  8      35     118    121    Ljava/lang/NumberFormatException;
        //  35     85     118    121    Ljava/lang/NumberFormatException;
        //  116    118    118    121    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0035:
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
    
    static void g(final ListChatInfo listChatInfo) {
        listChatInfo.f();
    }
    
    private void h() {
        Label_0055: {
            if (this.G.size() >= ym.b) {
                break Label_0055;
            }
            final Intent intent = new Intent((Context)this, (Class)ContactPicker.class);
            try {
                intent.putExtra(ListChatInfo.H[10], this.E.u);
                this.startActivityForResult(intent, 1);
                if (App.I) {
                    new AlertDialog$Builder((Context)this).setTitle(this.getString(2131230802)).setMessage(this.getString(2131230846, new Object[] { ym.b })).setPositiveButton(this.getString(2131231435), (DialogInterface$OnClickListener)new alf(this)).create().show();
                }
            }
            catch (NumberFormatException ex) {
                throw ex;
            }
        }
    }
    
    static void h(final ListChatInfo listChatInfo) {
        listChatInfo.e();
    }
    
    private void i() {
        try {
            final Intent intent = new Intent(ListChatInfo.H[5]);
            intent.setType(ListChatInfo.H[4]);
            intent.putExtra(ListChatInfo.H[7], this.x.a((Context)this));
            intent.putExtra(ListChatInfo.H[6], 2);
            intent.setFlags(524288);
            this.startActivityForResult(intent, 11);
        }
        catch (ActivityNotFoundException ex) {
            this.showDialog(4);
        }
    }
    
    private void j() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: aload_0        
        //     2: getfield        com/whatsapp/ListChatInfo.E:Lcom/whatsapp/a_9;
        //     5: getfield        com/whatsapp/a_9.m:Ljava/lang/String;
        //     8: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //    11: invokestatic    com/whatsapp/util/b6.e:(Landroid/content/Context;J)Ljava/lang/String;
        //    14: astore          5
        //    16: aload_0        
        //    17: getfield        com/whatsapp/ListChatInfo.t:Landroid/widget/TextView;
        //    20: aload_0        
        //    21: invokevirtual   com/whatsapp/ListChatInfo.getResources:()Landroid/content/res/Resources;
        //    24: ldc_w           2131231174
        //    27: iconst_1       
        //    28: anewarray       Ljava/lang/Object;
        //    31: dup            
        //    32: iconst_0       
        //    33: aload           5
        //    35: aastore        
        //    36: invokevirtual   android/content/res/Resources.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //    39: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //    42: aload_0        
        //    43: getfield        com/whatsapp/ListChatInfo.t:Landroid/widget/TextView;
        //    46: iconst_0       
        //    47: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //    50: aload_0        
        //    51: getfield        com/whatsapp/ListChatInfo.B:Lcom/whatsapp/a63;
        //    54: ifnull          66
        //    57: aload_0        
        //    58: getfield        com/whatsapp/ListChatInfo.B:Lcom/whatsapp/a63;
        //    61: iconst_1       
        //    62: invokevirtual   com/whatsapp/a63.cancel:(Z)Z
        //    65: pop            
        //    66: aload_0        
        //    67: iconst_1       
        //    68: invokevirtual   com/whatsapp/ListChatInfo.setSupportProgressBarIndeterminateVisibility:(Z)V
        //    71: aload_0        
        //    72: new             Lcom/whatsapp/a63;
        //    75: dup            
        //    76: aload_0        
        //    77: aconst_null    
        //    78: invokespecial   com/whatsapp/a63.<init>:(Lcom/whatsapp/ListChatInfo;Lcom/whatsapp/yz;)V
        //    81: putfield        com/whatsapp/ListChatInfo.B:Lcom/whatsapp/a63;
        //    84: aload_0        
        //    85: getfield        com/whatsapp/ListChatInfo.B:Lcom/whatsapp/a63;
        //    88: iconst_0       
        //    89: anewarray       Ljava/lang/Void;
        //    92: invokestatic    com/whatsapp/a8s.a:(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;
        //    95: pop            
        //    96: return         
        //    97: astore_1       
        //    98: new             Ljava/lang/StringBuilder;
        //   101: dup            
        //   102: invokespecial   java/lang/StringBuilder.<init>:()V
        //   105: getstatic       com/whatsapp/ListChatInfo.H:[Ljava/lang/String;
        //   108: bipush          12
        //   110: aaload         
        //   111: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   114: aload_1        
        //   115: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   118: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   121: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   124: aload_0        
        //   125: getfield        com/whatsapp/ListChatInfo.t:Landroid/widget/TextView;
        //   128: bipush          8
        //   130: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //   133: goto            50
        //   136: astore_2       
        //   137: aload_2        
        //   138: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  0      50     97     136    Ljava/lang/NumberFormatException;
        //  50     66     136    139    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0050:
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
    
    @Override
    public void a() {
        final boolean i = App.I;
        this.G.clear();
        final Iterator<String> iterator = (Iterator<String>)adc.a(this.E.u).l().iterator();
        while (true) {
            Label_0084: {
                if (!iterator.hasNext()) {
                    break Label_0084;
                }
                final a_9 e = App.S.e(iterator.next());
                try {
                    if (!this.G.contains(e)) {
                        this.G.add(e);
                    }
                    if (i) {
                        this.g();
                        return;
                    }
                    continue;
                }
                catch (NumberFormatException ex) {
                    throw ex;
                }
            }
        }
    }
    
    @Override
    public void a(final String s) {
    }
    
    @Override
    public void a(final Collection collection) {
    }
    
    @Override
    public void b(final String s) {
        if (!adc.b(s)) {
            final a_9 e = App.S.e(s);
            if (e != null) {
                a_9.a(this.G, new rq(e));
                this.w.notifyDataSetChanged();
            }
        }
    }
    
    @Override
    public void c(final String s) {
    }
    
    @Override
    public void d(final String s) {
        if (!s.equals(App.au() + ListChatInfo.H[11])) {
            final a_9 e = App.S.e(s);
            if (e != null) {
                a_9.a(this.G, new rw(e));
                this.w.notifyDataSetChanged();
            }
        }
    }
    
    public void finishAfterTransition() {
        if (Build$VERSION.SDK_INT >= 21) {
            this.y.setTransitionName((String)null);
            final TransitionSet returnTransition = new TransitionSet();
            final Slide slide = new Slide(48);
            ((Transition)slide).addTarget(this.y);
            returnTransition.addTransition((Transition)slide);
            final Slide slide2 = new Slide(80);
            ((Transition)slide2).addTarget((View)this.r);
            returnTransition.addTransition((Transition)slide2);
            this.getWindow().setReturnTransition((Transition)returnTransition);
        }
        super.finishAfterTransition();
    }
    
    @Override
    protected void onActivityResult(final int p0, final int p1, final Intent p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore          4
        //     5: iload_1        
        //     6: lookupswitch {
        //                1: 171
        //               10: 41
        //               11: 123
        //          default: 40
        //        }
        //    40: return         
        //    41: iload_2        
        //    42: iconst_m1      
        //    43: if_icmpne       109
        //    46: aload_3        
        //    47: ifnull          80
        //    50: aload_3        
        //    51: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //    54: astore          12
        //    56: aload           12
        //    58: ifnull          80
        //    61: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    64: aload_3        
        //    65: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //    68: aload_0        
        //    69: getfield        com/whatsapp/ListChatInfo.x:Lcom/whatsapp/a_9;
        //    72: invokevirtual   com/whatsapp/wc.a:(Landroid/net/Uri;Lcom/whatsapp/a_9;)V
        //    75: iload           4
        //    77: ifeq            90
        //    80: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    83: aload_0        
        //    84: getfield        com/whatsapp/ListChatInfo.x:Lcom/whatsapp/a_9;
        //    87: invokevirtual   com/whatsapp/wc.h:(Lcom/whatsapp/a_9;)V
        //    90: aload_0        
        //    91: invokespecial   com/whatsapp/ListChatInfo.g:()V
        //    94: aload_0        
        //    95: getfield        com/whatsapp/ListChatInfo.x:Lcom/whatsapp/a_9;
        //    98: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   101: invokestatic    com/whatsapp/Conversation.i:(Ljava/lang/String;)V
        //   104: iload           4
        //   106: ifeq            40
        //   109: getstatic       com/whatsapp/ListChatInfo.H:[Ljava/lang/String;
        //   112: bipush          20
        //   114: aaload         
        //   115: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   118: iload           4
        //   120: ifeq            40
        //   123: iload_2        
        //   124: iconst_m1      
        //   125: if_icmpne       157
        //   128: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   131: aload_0        
        //   132: getfield        com/whatsapp/ListChatInfo.x:Lcom/whatsapp/a_9;
        //   135: invokevirtual   com/whatsapp/wc.h:(Lcom/whatsapp/a_9;)V
        //   138: aload_0        
        //   139: invokespecial   com/whatsapp/ListChatInfo.g:()V
        //   142: aload_0        
        //   143: getfield        com/whatsapp/ListChatInfo.x:Lcom/whatsapp/a_9;
        //   146: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   149: invokestatic    com/whatsapp/Conversation.i:(Ljava/lang/String;)V
        //   152: iload           4
        //   154: ifeq            40
        //   157: getstatic       com/whatsapp/ListChatInfo.H:[Ljava/lang/String;
        //   160: bipush          21
        //   162: aaload         
        //   163: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   166: iload           4
        //   168: ifeq            40
        //   171: iload_2        
        //   172: iconst_m1      
        //   173: if_icmpne       40
        //   176: aload_0        
        //   177: aload_3        
        //   178: getstatic       com/whatsapp/ListChatInfo.H:[Ljava/lang/String;
        //   181: bipush          19
        //   183: aaload         
        //   184: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //   187: invokespecial   com/whatsapp/ListChatInfo.e:(Ljava/lang/String;)V
        //   190: return         
        //   191: astore          11
        //   193: aload           11
        //   195: athrow         
        //   196: astore          9
        //   198: aload           9
        //   200: athrow         
        //   201: astore          10
        //   203: aload           10
        //   205: athrow         
        //   206: astore          7
        //   208: aload           7
        //   210: athrow         
        //   211: astore          8
        //   213: aload           8
        //   215: athrow         
        //   216: astore          6
        //   218: aload           6
        //   220: athrow         
        //   221: astore          5
        //   223: aload           5
        //   225: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  50     56     191    196    Ljava/lang/NumberFormatException;
        //  61     75     196    201    Ljava/lang/NumberFormatException;
        //  80     90     196    201    Ljava/lang/NumberFormatException;
        //  90     104    201    206    Ljava/lang/NumberFormatException;
        //  109    118    206    216    Ljava/lang/NumberFormatException;
        //  128    152    216    221    Ljava/lang/NumberFormatException;
        //  157    166    221    226    Ljava/lang/NumberFormatException;
        //  193    196    196    201    Ljava/lang/NumberFormatException;
        //  203    206    206    216    Ljava/lang/NumberFormatException;
        //  208    211    211    216    Ljava/lang/NumberFormatException;
        //  213    216    216    221    Ljava/lang/NumberFormatException;
        //  218    221    221    226    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 94, Size: 94
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
    
    public boolean onContextItemSelected(final MenuItem menuItem) {
        this.a(this.x = (a_9)((AdapterView$AdapterContextMenuInfo)menuItem.getMenuInfo()).targetView.getTag(), menuItem.getItemId());
        return true;
    }
    
    @Override
    public void onCreate(final Bundle p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: getstatic       com/whatsapp/ListChatInfo.H:[Ljava/lang/String;
        //     7: iconst_0       
        //     8: aaload         
        //     9: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    12: aload_0        
        //    13: iconst_5       
        //    14: invokevirtual   com/whatsapp/ListChatInfo.supportRequestWindowFeature:(I)Z
        //    17: pop            
        //    18: aload_0        
        //    19: aload_1        
        //    20: invokespecial   com/whatsapp/ChatInfoActivity.onCreate:(Landroid/os/Bundle;)V
        //    23: aload_0        
        //    24: invokevirtual   com/whatsapp/ListChatInfo.supportPostponeEnterTransition:()V
        //    27: aload_0        
        //    28: aload_0        
        //    29: invokevirtual   com/whatsapp/ListChatInfo.getLayoutInflater:()Landroid/view/LayoutInflater;
        //    32: ldc_w           2130903165
        //    35: aconst_null    
        //    36: iconst_0       
        //    37: invokestatic    com/whatsapp/alm.a:(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //    40: checkcast       Lcom/whatsapp/ChatInfoLayout;
        //    43: putfield        com/whatsapp/ListChatInfo.u:Lcom/whatsapp/ChatInfoLayout;
        //    46: aload_0        
        //    47: aload_0        
        //    48: getfield        com/whatsapp/ListChatInfo.u:Lcom/whatsapp/ChatInfoLayout;
        //    51: invokevirtual   com/whatsapp/ListChatInfo.setContentView:(Landroid/view/View;)V
        //    54: aload_0        
        //    55: ldc_w           2131755371
        //    58: invokevirtual   com/whatsapp/ListChatInfo.findViewById:(I)Landroid/view/View;
        //    61: checkcast       Landroid/support/v7/widget/Toolbar;
        //    64: astore          4
        //    66: aload           4
        //    68: ldc_w           ""
        //    71: invokevirtual   android/support/v7/widget/Toolbar.setTitle:(Ljava/lang/CharSequence;)V
        //    74: aload           4
        //    76: iconst_0       
        //    77: iconst_0       
        //    78: invokevirtual   android/support/v7/widget/Toolbar.setContentInsetsAbsolute:(II)V
        //    81: aload_0        
        //    82: aload           4
        //    84: invokevirtual   com/whatsapp/ListChatInfo.setSupportActionBar:(Landroid/support/v7/widget/Toolbar;)V
        //    87: aload_0        
        //    88: invokevirtual   com/whatsapp/ListChatInfo.getSupportActionBar:()Landroid/support/v7/app/ActionBar;
        //    91: iconst_1       
        //    92: invokevirtual   android/support/v7/app/ActionBar.setDisplayHomeAsUpEnabled:(Z)V
        //    95: aload           4
        //    97: new             Lcom/whatsapp/util/m;
        //   100: dup            
        //   101: aload_0        
        //   102: invokevirtual   com/whatsapp/ListChatInfo.getResources:()Landroid/content/res/Resources;
        //   105: ldc_w           2130838738
        //   108: invokevirtual   android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //   111: invokespecial   com/whatsapp/util/m.<init>:(Landroid/graphics/drawable/Drawable;)V
        //   114: invokevirtual   android/support/v7/widget/Toolbar.setNavigationIcon:(Landroid/graphics/drawable/Drawable;)V
        //   117: aload_0        
        //   118: aload_0        
        //   119: invokevirtual   com/whatsapp/ListChatInfo.c:()Landroid/widget/ListView;
        //   122: putfield        com/whatsapp/ListChatInfo.r:Landroid/widget/ListView;
        //   125: aload_0        
        //   126: aload_0        
        //   127: invokevirtual   com/whatsapp/ListChatInfo.getLayoutInflater:()Landroid/view/LayoutInflater;
        //   130: ldc_w           2130903167
        //   133: aload_0        
        //   134: getfield        com/whatsapp/ListChatInfo.r:Landroid/widget/ListView;
        //   137: iconst_0       
        //   138: invokestatic    com/whatsapp/alm.a:(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //   141: putfield        com/whatsapp/ListChatInfo.D:Landroid/view/View;
        //   144: aload_0        
        //   145: getfield        com/whatsapp/ListChatInfo.r:Landroid/widget/ListView;
        //   148: aload_0        
        //   149: getfield        com/whatsapp/ListChatInfo.D:Landroid/view/View;
        //   152: aconst_null    
        //   153: iconst_0       
        //   154: invokevirtual   android/widget/ListView.addHeaderView:(Landroid/view/View;Ljava/lang/Object;Z)V
        //   157: aload_0        
        //   158: aload_0        
        //   159: ldc_w           2131755280
        //   162: invokevirtual   com/whatsapp/ListChatInfo.findViewById:(I)Landroid/view/View;
        //   165: putfield        com/whatsapp/ListChatInfo.y:Landroid/view/View;
        //   168: aload_0        
        //   169: getfield        com/whatsapp/ListChatInfo.u:Lcom/whatsapp/ChatInfoLayout;
        //   172: invokevirtual   com/whatsapp/ChatInfoLayout.b:()V
        //   175: aload_0        
        //   176: getfield        com/whatsapp/ListChatInfo.u:Lcom/whatsapp/ChatInfoLayout;
        //   179: aload_0        
        //   180: invokevirtual   com/whatsapp/ListChatInfo.getResources:()Landroid/content/res/Resources;
        //   183: ldc_w           2131624025
        //   186: invokevirtual   android/content/res/Resources.getColor:(I)I
        //   189: invokevirtual   com/whatsapp/ChatInfoLayout.setColor:(I)V
        //   192: aload_0        
        //   193: getfield        com/whatsapp/ListChatInfo.u:Lcom/whatsapp/ChatInfoLayout;
        //   196: aload_0        
        //   197: invokevirtual   com/whatsapp/ListChatInfo.getResources:()Landroid/content/res/Resources;
        //   200: ldc_w           2131361822
        //   203: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //   206: aload_0        
        //   207: invokevirtual   com/whatsapp/ListChatInfo.getResources:()Landroid/content/res/Resources;
        //   210: ldc_w           2131361822
        //   213: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //   216: invokevirtual   com/whatsapp/ChatInfoLayout.setCollapsedPadding:(II)V
        //   219: aload_0        
        //   220: aload_0        
        //   221: invokevirtual   com/whatsapp/ListChatInfo.getLayoutInflater:()Landroid/view/LayoutInflater;
        //   224: ldc_w           2130903166
        //   227: aload_0        
        //   228: getfield        com/whatsapp/ListChatInfo.r:Landroid/widget/ListView;
        //   231: iconst_0       
        //   232: invokestatic    com/whatsapp/alm.a:(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //   235: putfield        com/whatsapp/ListChatInfo.v:Landroid/view/View;
        //   238: aload_0        
        //   239: getfield        com/whatsapp/ListChatInfo.r:Landroid/widget/ListView;
        //   242: aload_0        
        //   243: getfield        com/whatsapp/ListChatInfo.v:Landroid/view/View;
        //   246: aconst_null    
        //   247: iconst_0       
        //   248: invokevirtual   android/widget/ListView.addFooterView:(Landroid/view/View;Ljava/lang/Object;Z)V
        //   251: aload_0        
        //   252: new             Landroid/widget/LinearLayout;
        //   255: dup            
        //   256: aload_0        
        //   257: invokespecial   android/widget/LinearLayout.<init>:(Landroid/content/Context;)V
        //   260: putfield        com/whatsapp/ListChatInfo.z:Landroid/widget/LinearLayout;
        //   263: aload_0        
        //   264: invokevirtual   com/whatsapp/ListChatInfo.getWindowManager:()Landroid/view/WindowManager;
        //   267: invokeinterface android/view/WindowManager.getDefaultDisplay:()Landroid/view/Display;
        //   272: invokevirtual   android/view/Display.getHeight:()I
        //   275: istore          5
        //   277: aload_0        
        //   278: getfield        com/whatsapp/ListChatInfo.z:Landroid/widget/LinearLayout;
        //   281: iconst_0       
        //   282: iconst_0       
        //   283: iconst_0       
        //   284: iload           5
        //   286: invokevirtual   android/widget/LinearLayout.setPadding:(IIII)V
        //   289: aload_0        
        //   290: getfield        com/whatsapp/ListChatInfo.r:Landroid/widget/ListView;
        //   293: aload_0        
        //   294: getfield        com/whatsapp/ListChatInfo.z:Landroid/widget/LinearLayout;
        //   297: aconst_null    
        //   298: iconst_0       
        //   299: invokevirtual   android/widget/ListView.addFooterView:(Landroid/view/View;Ljava/lang/Object;Z)V
        //   302: aload_0        
        //   303: invokevirtual   com/whatsapp/ListChatInfo.getIntent:()Landroid/content/Intent;
        //   306: getstatic       com/whatsapp/ListChatInfo.H:[Ljava/lang/String;
        //   309: iconst_3       
        //   310: aaload         
        //   311: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //   314: astore          6
        //   316: aload_0        
        //   317: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   320: aload           6
        //   322: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   325: putfield        com/whatsapp/ListChatInfo.E:Lcom/whatsapp/a_9;
        //   328: aload_0        
        //   329: aload_0        
        //   330: invokevirtual   com/whatsapp/ListChatInfo.c:()Landroid/widget/ListView;
        //   333: putfield        com/whatsapp/ListChatInfo.r:Landroid/widget/ListView;
        //   336: aload_0        
        //   337: new             Lcom/whatsapp/tt;
        //   340: dup            
        //   341: aload_0        
        //   342: aload_0        
        //   343: ldc_w           2130903201
        //   346: aload_0        
        //   347: getfield        com/whatsapp/ListChatInfo.G:Ljava/util/ArrayList;
        //   350: invokespecial   com/whatsapp/tt.<init>:(Lcom/whatsapp/ListChatInfo;Landroid/content/Context;ILjava/util/List;)V
        //   353: putfield        com/whatsapp/ListChatInfo.w:Lcom/whatsapp/tt;
        //   356: aload_0        
        //   357: aload_0        
        //   358: ldc_w           2131755280
        //   361: invokevirtual   com/whatsapp/ListChatInfo.findViewById:(I)Landroid/view/View;
        //   364: putfield        com/whatsapp/ListChatInfo.y:Landroid/view/View;
        //   367: aload_0        
        //   368: getfield        com/whatsapp/ListChatInfo.r:Landroid/widget/ListView;
        //   371: new             Lcom/whatsapp/yz;
        //   374: dup            
        //   375: aload_0        
        //   376: invokespecial   com/whatsapp/yz.<init>:(Lcom/whatsapp/ListChatInfo;)V
        //   379: invokevirtual   android/widget/ListView.setOnScrollListener:(Landroid/widget/AbsListView$OnScrollListener;)V
        //   382: aload_0        
        //   383: getfield        com/whatsapp/ListChatInfo.r:Landroid/widget/ListView;
        //   386: invokevirtual   android/widget/ListView.getViewTreeObserver:()Landroid/view/ViewTreeObserver;
        //   389: new             Lcom/whatsapp/aon;
        //   392: dup            
        //   393: aload_0        
        //   394: invokespecial   com/whatsapp/aon.<init>:(Lcom/whatsapp/ListChatInfo;)V
        //   397: invokevirtual   android/view/ViewTreeObserver.addOnGlobalLayoutListener:(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
        //   400: aload_0        
        //   401: getfield        com/whatsapp/ListChatInfo.r:Landroid/widget/ListView;
        //   404: new             Lcom/whatsapp/a8n;
        //   407: dup            
        //   408: aload_0        
        //   409: invokespecial   com/whatsapp/a8n.<init>:(Lcom/whatsapp/ListChatInfo;)V
        //   412: invokevirtual   android/widget/ListView.setOnItemClickListener:(Landroid/widget/AdapterView$OnItemClickListener;)V
        //   415: new             Lcom/whatsapp/a9y;
        //   418: dup            
        //   419: aload_0        
        //   420: invokespecial   com/whatsapp/a9y.<init>:(Lcom/whatsapp/ListChatInfo;)V
        //   423: astore          7
        //   425: aload_0        
        //   426: ldc_w           2131755588
        //   429: invokevirtual   com/whatsapp/ListChatInfo.findViewById:(I)Landroid/view/View;
        //   432: astore          8
        //   434: aload           8
        //   436: ldc_w           2131755590
        //   439: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   442: checkcast       Landroid/widget/TextView;
        //   445: ldc_w           2131230788
        //   448: invokevirtual   android/widget/TextView.setText:(I)V
        //   451: aload           8
        //   453: iconst_0       
        //   454: invokevirtual   android/view/View.setVisibility:(I)V
        //   457: aload           8
        //   459: aload           7
        //   461: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   464: aload           8
        //   466: ldc_w           2130838967
        //   469: invokevirtual   android/view/View.setBackgroundResource:(I)V
        //   472: aload_0        
        //   473: ldc_w           2131755384
        //   476: invokevirtual   com/whatsapp/ListChatInfo.findViewById:(I)Landroid/view/View;
        //   479: bipush          8
        //   481: invokevirtual   android/view/View.setVisibility:(I)V
        //   484: aload_0        
        //   485: ldc_w           2131755597
        //   488: invokevirtual   com/whatsapp/ListChatInfo.findViewById:(I)Landroid/view/View;
        //   491: bipush          8
        //   493: invokevirtual   android/view/View.setVisibility:(I)V
        //   496: aload_0        
        //   497: aload_0        
        //   498: ldc_w           2131755362
        //   501: invokevirtual   com/whatsapp/ListChatInfo.findViewById:(I)Landroid/view/View;
        //   504: checkcast       Landroid/widget/TextView;
        //   507: putfield        com/whatsapp/ListChatInfo.t:Landroid/widget/TextView;
        //   510: aload_0        
        //   511: ldc_w           2131755604
        //   514: invokevirtual   com/whatsapp/ListChatInfo.findViewById:(I)Landroid/view/View;
        //   517: checkcast       Landroid/widget/TextView;
        //   520: ldc_w           2131231513
        //   523: invokevirtual   android/widget/TextView.setText:(I)V
        //   526: new             Lcom/whatsapp/asc;
        //   529: dup            
        //   530: aload_0        
        //   531: invokespecial   com/whatsapp/asc.<init>:(Lcom/whatsapp/ListChatInfo;)V
        //   534: astore          9
        //   536: aload_0        
        //   537: ldc_w           2131755385
        //   540: invokevirtual   com/whatsapp/ListChatInfo.findViewById:(I)Landroid/view/View;
        //   543: aload           9
        //   545: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   548: aload_0        
        //   549: ldc_w           2131755386
        //   552: invokevirtual   com/whatsapp/ListChatInfo.findViewById:(I)Landroid/view/View;
        //   555: aload           9
        //   557: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   560: aload_0        
        //   561: getfield        com/whatsapp/ListChatInfo.r:Landroid/widget/ListView;
        //   564: aload_0        
        //   565: getfield        com/whatsapp/ListChatInfo.w:Lcom/whatsapp/tt;
        //   568: invokevirtual   android/widget/ListView.setAdapter:(Landroid/widget/ListAdapter;)V
        //   571: aload_0        
        //   572: aload_0        
        //   573: getfield        com/whatsapp/ListChatInfo.r:Landroid/widget/ListView;
        //   576: invokevirtual   com/whatsapp/ListChatInfo.registerForContextMenu:(Landroid/view/View;)V
        //   579: aload_0        
        //   580: aload_0        
        //   581: ldc_w           2131755361
        //   584: invokevirtual   com/whatsapp/ListChatInfo.findViewById:(I)Landroid/view/View;
        //   587: checkcast       Landroid/widget/TextView;
        //   590: putfield        com/whatsapp/ListChatInfo.q:Landroid/widget/TextView;
        //   593: aload_0        
        //   594: aload_0        
        //   595: ldc_w           2131755587
        //   598: invokevirtual   com/whatsapp/ListChatInfo.findViewById:(I)Landroid/view/View;
        //   601: checkcast       Landroid/widget/ImageButton;
        //   604: putfield        com/whatsapp/ListChatInfo.A:Landroid/widget/ImageButton;
        //   607: aload_0        
        //   608: getfield        com/whatsapp/ListChatInfo.A:Landroid/widget/ImageButton;
        //   611: new             Lcom/whatsapp/a6t;
        //   614: dup            
        //   615: aload_0        
        //   616: invokespecial   com/whatsapp/a6t.<init>:(Lcom/whatsapp/ListChatInfo;)V
        //   619: invokevirtual   android/widget/ImageButton.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   622: aload_0        
        //   623: aload_0        
        //   624: ldc_w           2131755605
        //   627: invokevirtual   com/whatsapp/ListChatInfo.findViewById:(I)Landroid/view/View;
        //   630: checkcast       Landroid/widget/TextView;
        //   633: putfield        com/whatsapp/ListChatInfo.C:Landroid/widget/TextView;
        //   636: aload_0        
        //   637: getfield        com/whatsapp/ListChatInfo.C:Landroid/widget/TextView;
        //   640: astore          10
        //   642: iconst_2       
        //   643: anewarray       Ljava/lang/Object;
        //   646: astore          11
        //   648: aload           11
        //   650: iconst_0       
        //   651: aload_0        
        //   652: getfield        com/whatsapp/ListChatInfo.G:Ljava/util/ArrayList;
        //   655: invokevirtual   java/util/ArrayList.size:()I
        //   658: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   661: aastore        
        //   662: aload           11
        //   664: iconst_1       
        //   665: getstatic       com/whatsapp/ym.b:I
        //   668: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   671: aastore        
        //   672: aload           10
        //   674: aload_0        
        //   675: ldc_w           2131231443
        //   678: aload           11
        //   680: invokevirtual   com/whatsapp/ListChatInfo.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   683: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   686: aload_0        
        //   687: aconst_null    
        //   688: ldc_w           2130837598
        //   691: ldc_w           2131623950
        //   694: invokevirtual   com/whatsapp/ListChatInfo.a:(Landroid/graphics/Bitmap;II)V
        //   697: aload_0        
        //   698: ldc_w           2131755591
        //   701: invokevirtual   com/whatsapp/ListChatInfo.findViewById:(I)Landroid/view/View;
        //   704: checkcast       Landroid/widget/Button;
        //   707: astore          12
        //   709: aload           12
        //   711: ldc_w           2131231021
        //   714: invokevirtual   android/widget/Button.setText:(I)V
        //   717: aload           12
        //   719: new             Lcom/whatsapp/k5;
        //   722: dup            
        //   723: aload_0        
        //   724: invokespecial   com/whatsapp/k5.<init>:(Lcom/whatsapp/ListChatInfo;)V
        //   727: invokevirtual   android/widget/Button.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   730: aload_0        
        //   731: getfield        com/whatsapp/ListChatInfo.E:Lcom/whatsapp/a_9;
        //   734: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   737: invokestatic    com/whatsapp/adc.a:(Ljava/lang/String;)Lcom/whatsapp/atf;
        //   740: invokevirtual   com/whatsapp/atf.l:()Ljava/util/Set;
        //   743: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   748: astore          13
        //   750: aload           13
        //   752: invokeinterface java/util/Iterator.hasNext:()Z
        //   757: ifeq            808
        //   760: aload           13
        //   762: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   767: checkcast       Ljava/lang/String;
        //   770: astore          25
        //   772: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   775: aload           25
        //   777: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   780: astore          26
        //   782: aload_0        
        //   783: getfield        com/whatsapp/ListChatInfo.G:Ljava/util/ArrayList;
        //   786: aload           26
        //   788: invokevirtual   java/util/ArrayList.contains:(Ljava/lang/Object;)Z
        //   791: ifne            804
        //   794: aload_0        
        //   795: getfield        com/whatsapp/ListChatInfo.G:Ljava/util/ArrayList;
        //   798: aload           26
        //   800: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   803: pop            
        //   804: iload_2        
        //   805: ifeq            750
        //   808: aload_0        
        //   809: invokespecial   com/whatsapp/ListChatInfo.f:()V
        //   812: aload_0        
        //   813: invokespecial   com/whatsapp/ListChatInfo.j:()V
        //   816: aload_0        
        //   817: invokespecial   com/whatsapp/ListChatInfo.g:()V
        //   820: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   823: aload_0        
        //   824: getfield        com/whatsapp/ListChatInfo.s:Lcom/whatsapp/sj;
        //   827: invokevirtual   com/whatsapp/vy.a:(Lcom/whatsapp/sj;)V
        //   830: aload_0        
        //   831: invokestatic    com/whatsapp/App.b:(Lcom/whatsapp/aws;)V
        //   834: aload_1        
        //   835: ifnull          866
        //   838: aload_1        
        //   839: getstatic       com/whatsapp/ListChatInfo.H:[Ljava/lang/String;
        //   842: iconst_1       
        //   843: aaload         
        //   844: invokevirtual   android/os/Bundle.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   847: astore          23
        //   849: aload           23
        //   851: ifnull          866
        //   854: aload_0        
        //   855: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   858: aload           23
        //   860: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   863: putfield        com/whatsapp/ListChatInfo.x:Lcom/whatsapp/a_9;
        //   866: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   869: istore          17
        //   871: iload           17
        //   873: bipush          21
        //   875: if_icmplt       933
        //   878: aload_0        
        //   879: invokevirtual   com/whatsapp/ListChatInfo.getIntent:()Landroid/content/Intent;
        //   882: getstatic       com/whatsapp/ListChatInfo.H:[Ljava/lang/String;
        //   885: iconst_2       
        //   886: aaload         
        //   887: iconst_0       
        //   888: invokevirtual   android/content/Intent.getBooleanExtra:(Ljava/lang/String;Z)Z
        //   891: istore          22
        //   893: iload           22
        //   895: ifeq            916
        //   898: aload_0        
        //   899: getfield        com/whatsapp/ListChatInfo.y:Landroid/view/View;
        //   902: aload_0        
        //   903: ldc_w           2131232142
        //   906: invokevirtual   com/whatsapp/ListChatInfo.getString:(I)Ljava/lang/String;
        //   909: invokevirtual   android/view/View.setTransitionName:(Ljava/lang/String;)V
        //   912: iload_2        
        //   913: ifeq            933
        //   916: aload_0        
        //   917: ldc_w           2131755367
        //   920: invokevirtual   com/whatsapp/ListChatInfo.findViewById:(I)Landroid/view/View;
        //   923: aload_0        
        //   924: ldc_w           2131232142
        //   927: invokevirtual   com/whatsapp/ListChatInfo.getString:(I)Ljava/lang/String;
        //   930: invokevirtual   android/view/View.setTransitionName:(Ljava/lang/String;)V
        //   933: aload_0        
        //   934: getfield        com/whatsapp/ListChatInfo.u:Lcom/whatsapp/ChatInfoLayout;
        //   937: aload_0        
        //   938: getfield        com/whatsapp/ListChatInfo.D:Landroid/view/View;
        //   941: aload_0        
        //   942: getfield        com/whatsapp/ListChatInfo.v:Landroid/view/View;
        //   945: aload_0        
        //   946: getfield        com/whatsapp/ListChatInfo.z:Landroid/widget/LinearLayout;
        //   949: aload_0        
        //   950: getfield        com/whatsapp/ListChatInfo.w:Lcom/whatsapp/tt;
        //   953: invokevirtual   com/whatsapp/ChatInfoLayout.a:(Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/widget/Adapter;)V
        //   956: getstatic       com/whatsapp/DialogToastActivity.h:Z
        //   959: istore          20
        //   961: iload           20
        //   963: ifeq            978
        //   966: iload_2        
        //   967: ifeq            1014
        //   970: iconst_0       
        //   971: istore          21
        //   973: iload           21
        //   975: putstatic       com/whatsapp/App.I:Z
        //   978: return         
        //   979: astore          27
        //   981: aload           27
        //   983: athrow         
        //   984: astore          24
        //   986: aload           24
        //   988: athrow         
        //   989: astore          14
        //   991: aload           14
        //   993: athrow         
        //   994: astore          15
        //   996: aload           15
        //   998: athrow         
        //   999: astore          16
        //  1001: aload           16
        //  1003: athrow         
        //  1004: astore          18
        //  1006: aload           18
        //  1008: athrow         
        //  1009: astore          19
        //  1011: aload           19
        //  1013: athrow         
        //  1014: iconst_1       
        //  1015: istore          21
        //  1017: goto            973
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  782    804    979    984    Ljava/lang/NumberFormatException;
        //  854    866    984    989    Ljava/lang/NumberFormatException;
        //  866    871    989    994    Ljava/lang/NumberFormatException;
        //  878    893    994    999    Ljava/lang/NumberFormatException;
        //  898    912    999    1004   Ljava/lang/NumberFormatException;
        //  916    933    999    1004   Ljava/lang/NumberFormatException;
        //  933    961    1004   1014   Ljava/lang/NumberFormatException;
        //  991    994    994    999    Ljava/lang/NumberFormatException;
        //  996    999    999    1004   Ljava/lang/NumberFormatException;
        //  1006   1009   1009   1014   Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 467, Size: 467
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
    public void onCreateContextMenu(final ContextMenu p0, final View p1, final ContextMenu$ContextMenuInfo p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: aload_1        
        //     2: aload_2        
        //     3: aload_3        
        //     4: invokespecial   com/whatsapp/ChatInfoActivity.onCreateContextMenu:(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
        //     7: aload_3        
        //     8: checkcast       Landroid/widget/AdapterView$AdapterContextMenuInfo;
        //    11: getfield        android/widget/AdapterView$AdapterContextMenuInfo.targetView:Landroid/view/View;
        //    14: invokevirtual   android/view/View.getTag:()Ljava/lang/Object;
        //    17: checkcast       Lcom/whatsapp/a_9;
        //    20: astore          4
        //    22: aload           4
        //    24: ifnonnull       28
        //    27: return         
        //    28: iconst_1       
        //    29: anewarray       Ljava/lang/Object;
        //    32: astore          7
        //    34: aload           7
        //    36: iconst_0       
        //    37: aload           4
        //    39: invokevirtual   com/whatsapp/a_9.l:()Ljava/lang/String;
        //    42: aastore        
        //    43: aload_1        
        //    44: iconst_0       
        //    45: iconst_1       
        //    46: iconst_0       
        //    47: aload_0        
        //    48: ldc_w           2131231318
        //    51: aload           7
        //    53: invokevirtual   com/whatsapp/ListChatInfo.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //    56: invokeinterface android/view/ContextMenu.add:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
        //    61: pop            
        //    62: iconst_1       
        //    63: anewarray       Ljava/lang/Object;
        //    66: astore          9
        //    68: aload           9
        //    70: iconst_0       
        //    71: aload           4
        //    73: invokevirtual   com/whatsapp/a_9.l:()Ljava/lang/String;
        //    76: aastore        
        //    77: aload_1        
        //    78: iconst_0       
        //    79: iconst_4       
        //    80: iconst_0       
        //    81: aload_0        
        //    82: ldc_w           2131230860
        //    85: aload           9
        //    87: invokevirtual   com/whatsapp/ListChatInfo.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //    90: invokeinterface android/view/ContextMenu.add:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
        //    95: pop            
        //    96: aload           4
        //    98: getfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //   101: astore          11
        //   103: aload           11
        //   105: ifnonnull       148
        //   108: aload_1        
        //   109: iconst_0       
        //   110: iconst_2       
        //   111: iconst_0       
        //   112: aload_0        
        //   113: ldc_w           2131230790
        //   116: invokevirtual   com/whatsapp/ListChatInfo.getString:(I)Ljava/lang/String;
        //   119: invokeinterface android/view/ContextMenu.add:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
        //   124: pop            
        //   125: aload_1        
        //   126: iconst_0       
        //   127: iconst_3       
        //   128: iconst_0       
        //   129: aload_0        
        //   130: ldc_w           2131230792
        //   133: invokevirtual   com/whatsapp/ListChatInfo.getString:(I)Ljava/lang/String;
        //   136: invokeinterface android/view/ContextMenu.add:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
        //   141: pop            
        //   142: getstatic       com/whatsapp/App.I:Z
        //   145: ifeq            182
        //   148: iconst_1       
        //   149: anewarray       Ljava/lang/Object;
        //   152: astore          12
        //   154: aload           12
        //   156: iconst_0       
        //   157: aload           4
        //   159: invokevirtual   com/whatsapp/a_9.l:()Ljava/lang/String;
        //   162: aastore        
        //   163: aload_1        
        //   164: iconst_0       
        //   165: iconst_0       
        //   166: iconst_0       
        //   167: aload_0        
        //   168: ldc_w           2131231910
        //   171: aload           12
        //   173: invokevirtual   com/whatsapp/ListChatInfo.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   176: invokeinterface android/view/ContextMenu.add:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
        //   181: pop            
        //   182: aload_0        
        //   183: getfield        com/whatsapp/ListChatInfo.G:Ljava/util/ArrayList;
        //   186: invokevirtual   java/util/ArrayList.size:()I
        //   189: iconst_1       
        //   190: if_icmple       27
        //   193: iconst_1       
        //   194: anewarray       Ljava/lang/Object;
        //   197: astore          15
        //   199: aload           15
        //   201: iconst_0       
        //   202: aload           4
        //   204: invokevirtual   com/whatsapp/a_9.l:()Ljava/lang/String;
        //   207: aastore        
        //   208: aload_1        
        //   209: iconst_0       
        //   210: iconst_5       
        //   211: iconst_0       
        //   212: aload_0        
        //   213: ldc_w           2131231597
        //   216: aload           15
        //   218: invokevirtual   com/whatsapp/ListChatInfo.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   221: invokeinterface android/view/ContextMenu.add:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
        //   226: pop            
        //   227: return         
        //   228: astore          14
        //   230: aload           14
        //   232: athrow         
        //   233: astore          5
        //   235: aload           5
        //   237: athrow         
        //   238: astore          6
        //   240: aload           6
        //   242: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  28     103    233    238    Ljava/lang/NumberFormatException;
        //  108    148    238    243    Ljava/lang/NumberFormatException;
        //  148    182    238    243    Ljava/lang/NumberFormatException;
        //  182    227    228    233    Ljava/lang/NumberFormatException;
        //  235    238    238    243    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0148:
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
    
    protected Dialog onCreateDialog(final int n) {
        switch (n) {
            default: {
                return super.onCreateDialog(n);
            }
            case 50: {
                return new ah6(this, 2131231042, App.S.c(this.E.u).t, new ij(this), ym.m, 0, 0);
            }
            case 2: {
                if (TextUtils.isEmpty((CharSequence)this.E.a((Context)this))) {
                    final String s = this.getString(2131231023);
                    if (!App.I) {
                        return new AlertDialog$Builder((Context)this).setMessage(cq.c(s, this.getBaseContext())).setCancelable(true).setNegativeButton(2131230874, (DialogInterface$OnClickListener)new _p(this)).setPositiveButton(2131231435, (DialogInterface$OnClickListener)new th(this)).create();
                    }
                }
                final String s = this.getString(2131231022, new Object[] { this.E.a((Context)this) });
                return new AlertDialog$Builder((Context)this).setMessage(cq.c(s, this.getBaseContext())).setCancelable(true).setNegativeButton(2131230874, (DialogInterface$OnClickListener)new _p(this)).setPositiveButton(2131231435, (DialogInterface$OnClickListener)new th(this)).create();
            }
            case 6: {
                if (this.x != null) {
                    return new AlertDialog$Builder((Context)this).setMessage(cq.c(this.getString(2131231604, new Object[] { this.x.a((Context)this) }), this.getBaseContext())).setCancelable(true).setNegativeButton(2131230874, (DialogInterface$OnClickListener)new yy(this)).setPositiveButton(2131231435, (DialogInterface$OnClickListener)new _s(this)).create();
                }
                return super.onCreateDialog(n);
            }
            case 4: {
                Log.w(ListChatInfo.H[9]);
                return new AlertDialog$Builder((Context)this).setMessage(2131230786).setPositiveButton(2131231435, (DialogInterface$OnClickListener)new g5(this)).create();
            }
        }
    }
    
    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        MenuItemCompat.setShowAsAction(menu.add(0, 1, 0, 2131230788).setIcon(2130838709), 2);
        return super.onCreateOptionsMenu(menu);
    }
    
    public void onDestroy() {
        try {
            Log.i(ListChatInfo.H[8]);
            super.onDestroy();
            if (this.B != null) {
                this.B.cancel(true);
            }
            this.F.a();
            App.ak.b(this.s);
            App.a((aws)this);
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
    }
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        try {
            switch (menuItem.getItemId()) {
                default: {
                    return super.onOptionsItemSelected(menuItem);
                }
                case 1: {
                    this.h();
                    return true;
                }
                case 16908332: {
                    break;
                }
            }
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
        ActivityCompat.finishAfterTransition(this);
        return true;
    }
    
    @Override
    protected void onSaveInstanceState(final Bundle bundle) {
        try {
            super.onSaveInstanceState(bundle);
            if (this.x != null) {
                bundle.putString(ListChatInfo.H[18], this.x.u);
            }
        }
        catch (NumberFormatException ex) {
            throw ex;
        }
    }
}
