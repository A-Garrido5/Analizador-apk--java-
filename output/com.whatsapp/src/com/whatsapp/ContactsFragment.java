// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.support.v4.app.Fragment;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.Menu;
import android.widget.ListView;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.View;
import android.view.ContextMenu;
import android.widget.AdapterView$AdapterContextMenuInfo;
import android.view.MenuItem;
import android.os.Bundle;
import java.util.List;
import java.util.Collection;
import android.content.Intent;
import android.os.AsyncTask;
import android.content.ActivityNotFoundException;
import com.whatsapp.util.bm;
import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import android.app.Activity;
import android.net.Uri;
import com.whatsapp.fieldstats.ag;
import com.whatsapp.fieldstats.aq;
import android.support.v7.view.ActionMode$Callback;
import java.util.HashMap;
import android.support.v7.view.ActionMode;
import android.os.Handler;
import java.util.ArrayList;
import android.support.v4.app.ListFragment;

public class ContactsFragment extends ListFragment implements ga, aws
{
    private static final a_9 h;
    private static final a_9 l;
    private static final a_9 o;
    private static final String[] z;
    private a6n b;
    private ArrayList c;
    private a9q d;
    private CharSequence e;
    private aqw f;
    private Handler g;
    private ActionMode i;
    private ArrayList j;
    private HashMap k;
    private ArrayList m;
    private ActionMode$Callback n;
    
    static {
        final String[] z2 = new String[5];
        String s = "3j9j\u0003)f|b\u0011";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'b';
                        break;
                    }
                    case 0: {
                        c2 = ']';
                        break;
                    }
                    case 1: {
                        c2 = '\u0005';
                        break;
                    }
                    case 2: {
                        c2 = '\u0014';
                        break;
                    }
                    case 3: {
                        c2 = '\u0007';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "<kpu\r4a:n\f)`zsL<f`n\r3+]I1\u0018W@";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "+kp)\u00033afh\u000b9+wr\u0010.jf)\u00064w;d\r3qud\u0016";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "5q`w\u0011g*;p\n<qgf\u0012-+wh\u000frax(";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = ".hgs\rg";
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        h = new a_9("");
        o = new a_9("");
        l = new a_9("");
    }
    
    public ContactsFragment() {
        this.c = new ArrayList();
        this.j = new ArrayList();
        this.d = new a9q();
        this.g = new Handler();
    }
    
    static ActionMode a(final ContactsFragment contactsFragment, final ActionMode i) {
        return contactsFragment.i = i;
    }
    
    static aqw a(final ContactsFragment contactsFragment) {
        return contactsFragment.f;
    }
    
    static ArrayList a(final ContactsFragment contactsFragment, final CharSequence charSequence) {
        return contactsFragment.a(charSequence);
    }
    
    static ArrayList a(final ContactsFragment contactsFragment, final ArrayList m) {
        return contactsFragment.m = m;
    }
    
    private ArrayList a(final CharSequence p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_1        
        //     5: ifnull          163
        //     8: aload_1        
        //     9: invokeinterface java/lang/CharSequence.toString:()Ljava/lang/String;
        //    14: invokestatic    com/whatsapp/vy.E:(Ljava/lang/String;)Ljava/util/ArrayList;
        //    17: astore_3       
        //    18: aload_0        
        //    19: getfield        com/whatsapp/ContactsFragment.c:Ljava/util/ArrayList;
        //    22: astore          4
        //    24: aload           4
        //    26: monitorenter   
        //    27: new             Ljava/util/ArrayList;
        //    30: dup            
        //    31: invokespecial   java/util/ArrayList.<init>:()V
        //    34: astore          5
        //    36: aload_3        
        //    37: ifnull          119
        //    40: aload_3        
        //    41: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //    44: istore          10
        //    46: iload           10
        //    48: ifne            119
        //    51: aload_0        
        //    52: getfield        com/whatsapp/ContactsFragment.c:Ljava/util/ArrayList;
        //    55: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //    58: astore          11
        //    60: aload           11
        //    62: invokeinterface java/util/Iterator.hasNext:()Z
        //    67: ifeq            115
        //    70: aload           11
        //    72: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    77: checkcast       Lcom/whatsapp/a_9;
        //    80: astore          12
        //    82: aload           12
        //    84: getfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //    87: ifnull          111
        //    90: aload           12
        //    92: aload_3        
        //    93: invokevirtual   com/whatsapp/a_9.a:(Ljava/util/ArrayList;)Z
        //    96: istore          15
        //    98: iload           15
        //   100: ifeq            111
        //   103: aload           5
        //   105: aload           12
        //   107: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   110: pop            
        //   111: iload_2        
        //   112: ifeq            60
        //   115: iload_2        
        //   116: ifeq            129
        //   119: aload           5
        //   121: aload_0        
        //   122: getfield        com/whatsapp/ContactsFragment.c:Ljava/util/ArrayList;
        //   125: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //   128: pop            
        //   129: aload           4
        //   131: monitorexit    
        //   132: aload           5
        //   134: areturn        
        //   135: astore          9
        //   137: aload           9
        //   139: athrow         
        //   140: astore          7
        //   142: aload           4
        //   144: monitorexit    
        //   145: aload           7
        //   147: athrow         
        //   148: astore          13
        //   150: aload           13
        //   152: athrow         
        //   153: astore          14
        //   155: aload           14
        //   157: athrow         
        //   158: astore          6
        //   160: aload           6
        //   162: athrow         
        //   163: aconst_null    
        //   164: astore_3       
        //   165: goto            18
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  27     36     140    148    Any
        //  40     46     135    140    Landroid/content/ActivityNotFoundException;
        //  40     46     140    148    Any
        //  51     60     140    148    Any
        //  60     82     140    148    Any
        //  82     98     148    153    Landroid/content/ActivityNotFoundException;
        //  82     98     140    148    Any
        //  103    111    153    158    Landroid/content/ActivityNotFoundException;
        //  103    111    140    148    Any
        //  119    129    158    163    Landroid/content/ActivityNotFoundException;
        //  119    129    140    148    Any
        //  129    132    140    148    Any
        //  137    140    140    148    Any
        //  142    145    140    148    Any
        //  150    153    153    158    Landroid/content/ActivityNotFoundException;
        //  150    153    140    148    Any
        //  155    158    140    148    Any
        //  160    163    140    148    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 81, Size: 81
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
    
    static HashMap a(final ContactsFragment contactsFragment, final HashMap k) {
        return contactsFragment.k = k;
    }
    
    @Deprecated
    private void a(final int n) {
    }
    
    static void a(final ContactsFragment contactsFragment, final int n) {
        contactsFragment.a(n);
    }
    
    static void a(final ContactsFragment contactsFragment, final a_9 a_9) {
        contactsFragment.a(a_9);
    }
    
    private void a(final a_9 a_9) {
        aam.a(aq.TELL_A_FRIEND, ag.INVITE_NON_WA_CONTACT);
        App.a(this.getActivity(), Uri.parse(ContactsFragment.z[4] + a_9.e.a()), this.getString(2131231849, new Object[] { ContactsFragment.z[3] }));
    }
    
    private void a(final boolean b) {
        try {
            if (App.aX == null) {
                App.a((Context)this.getActivity(), 2131231129, 1);
                if (!App.I) {
                    return;
                }
            }
            ((AppCompatActivity)this.getActivity()).setSupportProgressBarIndeterminateVisibility(true);
            bm.a(new at5(this, b));
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    static CharSequence b(final ContactsFragment contactsFragment, final CharSequence e) {
        return contactsFragment.e = e;
    }
    
    static HashMap b(final ContactsFragment contactsFragment) {
        return contactsFragment.k;
    }
    
    private void b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/ContactsFragment.i:Landroid/support/v7/view/ActionMode;
        //     4: astore          4
        //     6: aload           4
        //     8: ifnull          59
        //    11: aload_0        
        //    12: getfield        com/whatsapp/ContactsFragment.k:Ljava/util/HashMap;
        //    15: invokevirtual   java/util/HashMap.size:()I
        //    18: istore          5
        //    20: iload           5
        //    22: ifne            38
        //    25: aload_0        
        //    26: getfield        com/whatsapp/ContactsFragment.i:Landroid/support/v7/view/ActionMode;
        //    29: invokevirtual   android/support/v7/view/ActionMode.finish:()V
        //    32: getstatic       com/whatsapp/App.I:Z
        //    35: ifeq            59
        //    38: aload_0        
        //    39: getfield        com/whatsapp/ContactsFragment.i:Landroid/support/v7/view/ActionMode;
        //    42: invokestatic    java/text/NumberFormat.getInstance:()Ljava/text/NumberFormat;
        //    45: aload_0        
        //    46: getfield        com/whatsapp/ContactsFragment.k:Ljava/util/HashMap;
        //    49: invokevirtual   java/util/HashMap.size:()I
        //    52: i2l            
        //    53: invokevirtual   java/text/NumberFormat.format:(J)Ljava/lang/String;
        //    56: invokevirtual   android/support/v7/view/ActionMode.setTitle:(Ljava/lang/CharSequence;)V
        //    59: return         
        //    60: astore_1       
        //    61: aload_1        
        //    62: athrow         
        //    63: astore_2       
        //    64: aload_2        
        //    65: athrow         
        //    66: astore_3       
        //    67: aload_3        
        //    68: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      6      60     63     Landroid/content/ActivityNotFoundException;
        //  11     20     63     66     Landroid/content/ActivityNotFoundException;
        //  25     38     66     69     Landroid/content/ActivityNotFoundException;
        //  38     59     66     69     Landroid/content/ActivityNotFoundException;
        //  61     63     63     66     Landroid/content/ActivityNotFoundException;
        //  64     66     66     69     Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 35, Size: 35
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
    
    static boolean b(final a_9 a_9) {
        return c(a_9);
    }
    
    static CharSequence c(final ContactsFragment contactsFragment) {
        return contactsFragment.e;
    }
    
    @Deprecated
    private void c() {
    }
    
    private static boolean c(final a_9 a_9) {
        return ContactsFragment.z[0].equals(a_9.u);
    }
    
    static a_9 d() {
        return ContactsFragment.l;
    }
    
    static ArrayList d(final ContactsFragment contactsFragment) {
        return contactsFragment.c;
    }
    
    static void e(final ContactsFragment contactsFragment) {
        contactsFragment.f();
    }
    
    static ArrayList f(final ContactsFragment contactsFragment) {
        return contactsFragment.j;
    }
    
    private void f() {
        try {
            if (this.b != null) {
                this.b.cancel(true);
            }
            a8s.a(this.b = new a6n(this, null), new Void[0]);
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    static a9q g(final ContactsFragment contactsFragment) {
        return contactsFragment.d;
    }
    
    static a_9 g() {
        return ContactsFragment.h;
    }
    
    private void h() {
        this.startActivity(new Intent((Context)this.getActivity(), (Class)ContactPickerHelp.class));
    }
    
    static void h(final ContactsFragment contactsFragment) {
        contactsFragment.b();
    }
    
    static a_9 i() {
        return ContactsFragment.o;
    }
    
    static ArrayList i(final ContactsFragment contactsFragment) {
        return contactsFragment.m;
    }
    
    static void j(final ContactsFragment contactsFragment) {
        contactsFragment.h();
    }
    
    static Handler k(final ContactsFragment contactsFragment) {
        return contactsFragment.g;
    }
    
    static void l(final ContactsFragment contactsFragment) {
        contactsFragment.c();
    }
    
    @Override
    public void a() {
        this.f();
    }
    
    @Override
    public void a(final CharSequence charSequence) {
        this.f.getFilter().filter(charSequence);
    }
    
    @Override
    public void a(final String s) {
    }
    
    @Override
    public void a(final Collection collection) {
        this.f.notifyDataSetChanged();
    }
    
    @Override
    public void b(final String s) {
        final a_9 e = App.S.e(s);
        if (e == null) {
            return;
        }
        final rq rq = new rq(e);
        try {
            if (a_9.a(this.c, rq)) {
                this.f.notifyDataSetChanged();
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    @Override
    public void c(final String s) {
        final a_9 e = App.S.e(s);
        if (e == null) {
            return;
        }
        final q4 q4 = new q4(e);
        try {
            if (a_9.a(this.c, q4)) {
                this.f.notifyDataSetChanged();
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    @Override
    public void d(final String s) {
        final a_9 e = App.S.e(s);
        if (e == null) {
            return;
        }
        final rw rw = new rw(e);
        try {
            if (a_9.a(this.c, rw)) {
                this.f.notifyDataSetChanged();
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    public boolean e() {
        try {
            if (this.i != null) {
                return false;
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
        try {
            if (this.n == null) {
                this.n = new wv(this);
            }
            this.f.notifyDataSetChanged();
            this.i = ((AppCompatActivity)this.getActivity()).startSupportActionMode(this.n);
            return true;
        }
        catch (ActivityNotFoundException ex2) {
            throw ex2;
        }
    }
    
    @Override
    public void onActivityCreated(final Bundle p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_2       
        //     4: aload_0        
        //     5: aload_1        
        //     6: invokespecial   android/support/v4/app/ListFragment.onActivityCreated:(Landroid/os/Bundle;)V
        //     9: aload_0        
        //    10: iconst_1       
        //    11: invokevirtual   com/whatsapp/ContactsFragment.setHasOptionsMenu:(Z)V
        //    14: aload_0        
        //    15: invokespecial   com/whatsapp/ContactsFragment.f:()V
        //    18: aload_0        
        //    19: new             Lcom/whatsapp/aq6;
        //    22: dup            
        //    23: aload_0        
        //    24: aload_0        
        //    25: invokevirtual   com/whatsapp/ContactsFragment.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //    28: aload_0        
        //    29: getfield        com/whatsapp/ContactsFragment.j:Ljava/util/ArrayList;
        //    32: invokespecial   com/whatsapp/aq6.<init>:(Lcom/whatsapp/ContactsFragment;Landroid/content/Context;Ljava/util/ArrayList;)V
        //    35: putfield        com/whatsapp/ContactsFragment.f:Lcom/whatsapp/aqw;
        //    38: aload_0        
        //    39: aload_0        
        //    40: getfield        com/whatsapp/ContactsFragment.f:Lcom/whatsapp/aqw;
        //    43: invokevirtual   com/whatsapp/ContactsFragment.setListAdapter:(Landroid/widget/ListAdapter;)V
        //    46: aload_0        
        //    47: invokevirtual   com/whatsapp/ContactsFragment.getListView:()Landroid/widget/ListView;
        //    50: astore_3       
        //    51: aload_3        
        //    52: new             Lcom/whatsapp/util/m;
        //    55: dup            
        //    56: aload_0        
        //    57: invokevirtual   com/whatsapp/ContactsFragment.getResources:()Landroid/content/res/Resources;
        //    60: ldc_w           2130837753
        //    63: invokevirtual   android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //    66: invokespecial   com/whatsapp/util/m.<init>:(Landroid/graphics/drawable/Drawable;)V
        //    69: invokevirtual   android/widget/ListView.setDivider:(Landroid/graphics/drawable/Drawable;)V
        //    72: aload_3        
        //    73: iconst_1       
        //    74: invokevirtual   android/widget/ListView.setFastScrollEnabled:(Z)V
        //    77: aload_3        
        //    78: iconst_1       
        //    79: invokevirtual   android/widget/ListView.setScrollbarFadingEnabled:(Z)V
        //    82: aload_0        
        //    83: invokevirtual   com/whatsapp/ContactsFragment.getView:()Landroid/view/View;
        //    86: ldc_w           2131755408
        //    89: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    92: astore          4
        //    94: aload           4
        //    96: iconst_0       
        //    97: invokevirtual   android/view/View.setVisibility:(I)V
        //   100: aload_0        
        //   101: invokevirtual   com/whatsapp/ContactsFragment.getView:()Landroid/view/View;
        //   104: ldc_w           2131755407
        //   107: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   110: astore          5
        //   112: aload           5
        //   114: bipush          8
        //   116: invokevirtual   android/view/View.setVisibility:(I)V
        //   119: aload_3        
        //   120: aload           4
        //   122: invokevirtual   android/widget/ListView.setEmptyView:(Landroid/view/View;)V
        //   125: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   128: istore          9
        //   130: iload           9
        //   132: bipush          11
        //   134: if_icmplt       225
        //   137: getstatic       com/whatsapp/App.W:Z
        //   140: istore          13
        //   142: iload           13
        //   144: ifeq            188
        //   147: aload_3        
        //   148: iconst_1       
        //   149: invokevirtual   android/widget/ListView.setVerticalScrollbarPosition:(I)V
        //   152: aload_3        
        //   153: aload_0        
        //   154: invokevirtual   com/whatsapp/ContactsFragment.getResources:()Landroid/content/res/Resources;
        //   157: ldc_w           2131361808
        //   160: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //   163: aload_3        
        //   164: invokevirtual   android/widget/ListView.getPaddingTop:()I
        //   167: aload_0        
        //   168: invokevirtual   com/whatsapp/ContactsFragment.getResources:()Landroid/content/res/Resources;
        //   171: ldc_w           2131361807
        //   174: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //   177: aload_3        
        //   178: invokevirtual   android/widget/ListView.getPaddingBottom:()I
        //   181: invokevirtual   android/widget/ListView.setPadding:(IIII)V
        //   184: iload_2        
        //   185: ifeq            225
        //   188: aload_3        
        //   189: iconst_2       
        //   190: invokevirtual   android/widget/ListView.setVerticalScrollbarPosition:(I)V
        //   193: aload_3        
        //   194: aload_0        
        //   195: invokevirtual   com/whatsapp/ContactsFragment.getResources:()Landroid/content/res/Resources;
        //   198: ldc_w           2131361807
        //   201: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //   204: aload_3        
        //   205: invokevirtual   android/widget/ListView.getPaddingTop:()I
        //   208: aload_0        
        //   209: invokevirtual   com/whatsapp/ContactsFragment.getResources:()Landroid/content/res/Resources;
        //   212: ldc_w           2131361808
        //   215: invokevirtual   android/content/res/Resources.getDimensionPixelSize:(I)I
        //   218: aload_3        
        //   219: invokevirtual   android/widget/ListView.getPaddingBottom:()I
        //   222: invokevirtual   android/widget/ListView.setPadding:(IIII)V
        //   225: aload_0        
        //   226: invokevirtual   com/whatsapp/ContactsFragment.getView:()Landroid/view/View;
        //   229: ldc_w           2131755568
        //   232: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   235: new             Lcom/whatsapp/a0t;
        //   238: dup            
        //   239: aload_0        
        //   240: invokespecial   com/whatsapp/a0t.<init>:(Lcom/whatsapp/ContactsFragment;)V
        //   243: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   246: aload_3        
        //   247: iconst_1       
        //   248: invokevirtual   android/widget/ListView.setTextFilterEnabled:(Z)V
        //   251: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   254: istore          12
        //   256: iload           12
        //   258: bipush          11
        //   260: if_icmplt       279
        //   263: aload_3        
        //   264: iconst_1       
        //   265: invokevirtual   android/widget/ListView.setFastScrollAlwaysVisible:(Z)V
        //   268: aload_3        
        //   269: ldc_w           33554432
        //   272: invokevirtual   android/widget/ListView.setScrollBarStyle:(I)V
        //   275: iload_2        
        //   276: ifeq            286
        //   279: aload_3        
        //   280: ldc_w           2130839068
        //   283: invokevirtual   android/widget/ListView.setSelector:(I)V
        //   286: aload_0        
        //   287: aload_3        
        //   288: invokevirtual   com/whatsapp/ContactsFragment.registerForContextMenu:(Landroid/view/View;)V
        //   291: aload_3        
        //   292: new             Lcom/whatsapp/oh;
        //   295: dup            
        //   296: aload_0        
        //   297: invokespecial   com/whatsapp/oh.<init>:(Lcom/whatsapp/ContactsFragment;)V
        //   300: invokevirtual   android/widget/ListView.setOnItemClickListener:(Landroid/widget/AdapterView$OnItemClickListener;)V
        //   303: aload_3        
        //   304: new             Lcom/whatsapp/hg;
        //   307: dup            
        //   308: aload_0        
        //   309: invokespecial   com/whatsapp/hg.<init>:(Lcom/whatsapp/ContactsFragment;)V
        //   312: invokevirtual   android/widget/ListView.setOnItemLongClickListener:(Landroid/widget/AdapterView$OnItemLongClickListener;)V
        //   315: aload_0        
        //   316: invokestatic    com/whatsapp/App.b:(Lcom/whatsapp/aws;)V
        //   319: return         
        //   320: astore          6
        //   322: aload           6
        //   324: athrow         
        //   325: astore          7
        //   327: aload           7
        //   329: athrow         
        //   330: astore          8
        //   332: aload           8
        //   334: athrow         
        //   335: astore          10
        //   337: aload           10
        //   339: athrow         
        //   340: astore          11
        //   342: aload           11
        //   344: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  112    130    320    325    Landroid/content/ActivityNotFoundException;
        //  137    142    325    330    Landroid/content/ActivityNotFoundException;
        //  147    184    330    335    Landroid/content/ActivityNotFoundException;
        //  188    225    330    335    Landroid/content/ActivityNotFoundException;
        //  225    256    335    340    Landroid/content/ActivityNotFoundException;
        //  263    275    340    345    Landroid/content/ActivityNotFoundException;
        //  279    286    340    345    Landroid/content/ActivityNotFoundException;
        //  322    325    325    330    Landroid/content/ActivityNotFoundException;
        //  327    330    330    335    Landroid/content/ActivityNotFoundException;
        //  337    340    340    345    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 167, Size: 167
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
    public boolean onContextItemSelected(final MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            default: {
                return super.onContextItemSelected(menuItem);
            }
            case 2131755040: {
                App.a(this.getActivity(), false, ((a_9)this.getListView().getItemAtPosition(((AdapterView$AdapterContextMenuInfo)menuItem.getMenuInfo()).position)).u);
                return true;
            }
        }
    }
    
    @Override
    public void onCreateContextMenu(final ContextMenu contextMenu, final View view, final ContextMenu$ContextMenuInfo contextMenu$ContextMenuInfo) {
        final a_9 a_9 = (a_9)((ListView)view).getItemAtPosition(((AdapterView$AdapterContextMenuInfo)contextMenu$ContextMenuInfo).position);
        try {
            if (!App.p(a_9.u)) {
                return;
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
        contextMenu.add(0, 2131755040, 0, (CharSequence)String.format(this.getString(2131230843), a_9.t));
        super.onCreateContextMenu(contextMenu, view, contextMenu$ContextMenuInfo);
    }
    
    @Override
    public void onCreateOptionsMenu(final Menu menu, final MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
    }
    
    @Override
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        return HomeActivity.a(layoutInflater.inflate(2130903102, viewGroup, false), this);
    }
    
    @Override
    public void onDestroy() {
        try {
            super.onDestroy();
            App.a(this);
            if (this.b != null) {
                this.b.cancel(true);
            }
            this.d.a();
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    @Override
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            default: {
                return super.onOptionsItemSelected(menuItem);
            }
            case 2131755030: {
                final Intent intent = new Intent(ContactsFragment.z[1]);
                intent.setType(ContactsFragment.z[2]);
                try {
                    this.startActivity(intent);
                    return true;
                }
                catch (ActivityNotFoundException ex) {
                    App.N();
                    return true;
                }
            }
            case 2131755039: {
                aam.a(aq.TELL_A_FRIEND, ag.CONTACTS_MENU);
                App.a(this.getActivity());
                return true;
            }
            case 2131755033: {
                this.a(true);
                return true;
            }
            case 2131755015: {
                this.h();
                return true;
            }
        }
    }
}
