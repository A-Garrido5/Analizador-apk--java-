// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Activity;
import com.whatsapp.util.undobar.UndoBarController;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.Menu;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.content.Intent;
import android.widget.FrameLayout;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.Collection;
import android.view.animation.TranslateAnimation;
import android.graphics.Paint;
import com.whatsapp.util.t;
import android.content.SharedPreferences$Editor;
import com.whatsapp.util.Log;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.Animation;
import android.view.animation.AlphaAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.AnimationSet;
import android.content.Context;
import android.content.ActivityNotFoundException;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import com.whatsapp.gdrive.GoogleDriveService;
import android.content.ServiceConnection;
import android.widget.ProgressBar;
import android.widget.ListView;
import android.widget.ImageView;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import android.support.v4.app.ListFragment;

public class ConversationsFragment extends ListFragment implements aws, _7, ga
{
    private static final String[] z;
    private ig b;
    private ArrayList c;
    private TextView d;
    private View e;
    TextView f;
    private ImageView g;
    private a9q h;
    View i;
    private zb j;
    private ListView k;
    TextView l;
    private String m;
    private aqv n;
    private ProgressBar o;
    private final ServiceConnection p;
    private String q;
    private int r;
    private GoogleDriveService s;
    private TextView t;
    
    static {
        final String[] z2 = new String[36];
        String s = "#c\u000bJj2\u007f\u0004Hf/b\u0016\u0013\u007f!y\u0016Y";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0932:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u000f';
                        break;
                    }
                    case 0: {
                        c2 = '@';
                        break;
                    }
                    case 1: {
                        c2 = '\f';
                        break;
                    }
                    case 2: {
                        c2 = 'e';
                        break;
                    }
                    case 3: {
                        c2 = '<';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "#~\u0000]{%S\u0002N`5|:Hf0S\u0011Ub%";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "#~\u0000]{%S\u0002N`5|:Hf0S\u0006Sz.x";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "#c\b\u0012x(m\u0011On0|:L}%j\u0000Nj.o\u0000O";
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    s = "#c\b\u0012x(m\u0011On0|:L}%j\u0000Nj.o\u0000O";
                    n = 3;
                    array = z2;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "#c\b\u0012x(m\u0011On0|:L}%j\u0000Nj.o\u0000O";
                    n = 4;
                    array = z2;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "#~\u0000]{%S\u0002N`5|:Hf0S\u0006Sz.x";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "#c\u000bJj2\u007f\u0004Hf/b\u0016\u0013}%\u007f\u0010Qjok\u0001Nf6iHJf%{HU|mb\u0010Pc";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "#c\u000bJj2\u007f\u0004Hf/b\u0016\u0013}%\u007f\u0010Qj";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "#c\u000bJj2\u007f\u0004Hf/b\u0016\u0013}%\u007f\u0010Qjok\u0001Nf6iHQj$e\u0004\u0011}%\u007f\u0011S}%!\u0015Ya$e\u000b[ #~\u0000]{%!\u0013Uj7";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "#c\u000bJj2\u007f\u0004Hf/b\u0016\u0013}%\u007f\u0010Qjok\u0001Nf6iHQj$e\u0004\u0011}%\u007f\u0011S}%!\u0001Sa%#\u0017Yb/z\u0000\u0011y)i\u0012";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    array[n2] = intern;
                    n2 = 11;
                    s = "\fc\u000b[_2i\u0016Oj$^\nKE)h";
                    n = 10;
                    array = z2;
                    continue;
                }
                case 10: {
                    array[n2] = intern;
                    s = "$i\tY{%S\u0006Tn4S\u0006Sz.x";
                    n = 11;
                    n2 = 12;
                    array = z2;
                    continue;
                }
                case 11: {
                    array[n2] = intern;
                    n2 = 13;
                    array = z2;
                    s = "#c\b\u0012x(m\u0011On0|:L}%j\u0000Nj.o\u0000O";
                    n = 12;
                    continue;
                }
                case 12: {
                    array[n2] = intern;
                    n2 = 14;
                    s = "0d\nRj";
                    n = 13;
                    array = z2;
                    continue;
                }
                case 13: {
                    array[n2] = intern;
                    s = "#c\u000bJj2\u007f\u0004Hf/b\u0016\u0013k%`\u0000Hjok\u0017Sz06";
                    n = 14;
                    n2 = 15;
                    array = z2;
                    continue;
                }
                case 14: {
                    array[n2] = intern;
                    n2 = 16;
                    array = z2;
                    s = "0d\nRj";
                    n = 15;
                    continue;
                }
                case 15: {
                    array[n2] = intern;
                    n2 = 17;
                    s = "#c\u000bJj2\u007f\u0004Hf/b\u0016\u0013l/b\u0011Yw4,\u0016E|4i\b\u001cl/b\u0011]l4,\tU|4,\u0006Sz,hER`4,\u0003Sz.h";
                    n = 16;
                    array = z2;
                    continue;
                }
                case 16: {
                    array[n2] = intern;
                    n2 = 18;
                    s = "0d\nRj\u001fx\u001cLj";
                    n = 17;
                    array = z2;
                    continue;
                }
                case 17: {
                    array[n2] = intern;
                    n2 = 19;
                    s = "!b\u0001N`)hKUa4i\u000bH!!o\u0011U`.\",r\\\u0005^1";
                    n = 18;
                    array = z2;
                    continue;
                }
                case 18: {
                    array[n2] = intern;
                    n2 = 20;
                    s = "!b\u0001N`)hKUa4i\u000bH!!o\u0011U`.\",r\\\u0005^1c@\u0012S xF\u0014";
                    n = 19;
                    array = z2;
                    continue;
                }
                case 19: {
                    array[n2] = intern;
                    n2 = 21;
                    s = "6b\u0001\u0012n.h\u0017Sf$\"\u0006I}3c\u0017\u0012f4i\b\u0013l/b\u0011]l4";
                    n = 20;
                    array = z2;
                    continue;
                }
                case 20: {
                    array[n2] = intern;
                    n2 = 22;
                    s = "\"~\n]k#m\u0016H";
                    n = 21;
                    array = z2;
                    continue;
                }
                case 21: {
                    array[n2] = intern;
                    n2 = 23;
                    s = "#c\u000bJj2\u007f\u0004Hf/b\u0016\u0013l/b\u0011Yw4#\u000bIc,";
                    n = 22;
                    array = z2;
                    continue;
                }
                case 22: {
                    array[n2] = intern;
                    n2 = 24;
                    s = "*e\u0001";
                    n = 23;
                    array = z2;
                    continue;
                }
                case 23: {
                    array[n2] = intern;
                    n2 = 25;
                    s = "#c\b\u0012x(m\u0011On0|:L}%j\u0000Nj.o\u0000O";
                    n = 24;
                    array = z2;
                    continue;
                }
                case 24: {
                    array[n2] = intern;
                    n2 = 26;
                    s = "#c\u000bJj2\u007f\u0004Hf/b\u0016\u0013|%x\u0001Yc%x\u0000_g!xJZn)`\u0000X";
                    n = 25;
                    array = z2;
                    continue;
                }
                case 25: {
                    array[n2] = intern;
                    n2 = 27;
                    s = "$i\tY{%S\u0006Tn4S\u0006Sz.x";
                    n = 26;
                    array = z2;
                    continue;
                }
                case 26: {
                    array[n2] = intern;
                    n2 = 28;
                    s = "#c\u000bJj2\u007f\u0004Hf/b\u0016\u0013}%\u007f\u0010P{o\u007f\u000eU\u007foo\nR{!o\u0011\u001ca/xE]k$i\u0001";
                    n = 27;
                    array = z2;
                    continue;
                }
                case 27: {
                    array[n2] = intern;
                    n2 = 29;
                    s = "#c\u000bHn#x";
                    n = 28;
                    array = z2;
                    continue;
                }
                case 28: {
                    array[n2] = intern;
                    n2 = 30;
                    s = "#c\u000bJj2\u007f\u0004Hf/b\u0016\u0013}%\u007f\u0010P{`o\nR{!o\u0011\u001ca/xE]k$i\u0001";
                    n = 29;
                    array = z2;
                    continue;
                }
                case 29: {
                    array[n2] = intern;
                    n2 = 31;
                    s = "%b\u0011Nv\u001f|\nUa4";
                    n = 30;
                    array = z2;
                    continue;
                }
                case 30: {
                    array[n2] = intern;
                    n2 = 32;
                    s = "#c\u000bJj2\u007f\u0004Hf/b\u0016\u0013l2i\u0004Hj";
                    n = 31;
                    array = z2;
                    continue;
                }
                case 31: {
                    array[n2] = intern;
                    n2 = 33;
                    s = "\fc\u000b[_2i\u0016Oj$^\nKE)h";
                    n = 32;
                    array = z2;
                    continue;
                }
                case 32: {
                    array[n2] = intern;
                    n2 = 34;
                    s = "#c\u000bJj2\u007f\u0004Hf/b\u0016\u0013l2i\u0004Hj";
                    n = 33;
                    array = z2;
                    continue;
                }
                case 33: {
                    array[n2] = intern;
                    n2 = 35;
                    s = "#c\u000bJj2\u007f\u0004Hf/b\u0016\u0013k%\u007f\u0011N`9";
                    n = 34;
                    array = z2;
                    continue;
                }
                case 34: {
                    break Label_0932;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public ConversationsFragment() {
        this.h = new a9q();
        this.n = null;
        this.p = (ServiceConnection)new pi(this);
    }
    
    private DialogFragment a(final a_9 a_9, final DialogFragment dialogFragment) {
        final Bundle arguments = new Bundle();
        arguments.putString(ConversationsFragment.z[24], a_9.u);
        dialogFragment.setArguments(arguments);
        return dialogFragment;
    }
    
    private View a(final String s) {
        final boolean i = App.I;
        if (s == null) {
            return null;
        }
        int n;
        for (int j = 0; j < this.k.getChildCount(); j = n) {
            final View child = this.k.getChildAt(j);
            final Object tag = child.getTag();
            Label_0101: {
                if (tag instanceof ef) {
                    final ef ef = (ef)tag;
                    try {
                        if (!(ef.c instanceof al_)) {
                            break Label_0101;
                        }
                        final String s2 = s;
                        final ef ef2 = ef;
                        final d7 d7 = ef2.c;
                        final al_ al_ = (al_)d7;
                        final String s3 = al_.a;
                        final boolean b = s2.equals(s3);
                        if (b) {
                            return child;
                        }
                        break Label_0101;
                    }
                    catch (ActivityNotFoundException ex) {
                        throw ex;
                    }
                    try {
                        final String s2 = s;
                        final ef ef2 = ef;
                        final d7 d7 = ef2.c;
                        final al_ al_ = (al_)d7;
                        final String s3 = al_.a;
                        final boolean b = s2.equals(s3);
                        if (b) {
                            return child;
                        }
                    }
                    catch (ActivityNotFoundException ex2) {
                        throw ex2;
                    }
                }
            }
            n = j + 1;
            if (i) {
                break;
            }
        }
        return null;
    }
    
    static ProgressBar a(final ConversationsFragment conversationsFragment) {
        return conversationsFragment.o;
    }
    
    static GoogleDriveService a(final ConversationsFragment conversationsFragment, final GoogleDriveService s) {
        return conversationsFragment.s = s;
    }
    
    static ig a(final ConversationsFragment conversationsFragment, final ig b) {
        return conversationsFragment.b = b;
    }
    
    static String a(final ConversationsFragment conversationsFragment, final String q) {
        return conversationsFragment.q = q;
    }
    
    static ArrayList a(final ConversationsFragment conversationsFragment, final ArrayList c) {
        return conversationsFragment.c = c;
    }
    
    private void a(final Context context, final String s) {
        if (this.j != null) {
            final View a = this.a(s);
            if (a != null) {
                final ef ef = (ef)a.getTag();
                z8.a(s);
                zb.a(this.j, context, a, (al_)ef.c, ef);
            }
        }
    }
    
    private void a(final View view) {
        final AnimationSet set = new AnimationSet(true);
        final ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        final AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        set.addAnimation((Animation)scaleAnimation);
        set.addAnimation((Animation)alphaAnimation);
        final int top = view.getTop();
        set.setDuration(300L);
        view.startAnimation((Animation)set);
        set.setAnimationListener((Animation$AnimationListener)new aax(this, top));
    }
    
    static View b(final ConversationsFragment conversationsFragment, final String s) {
        return conversationsFragment.a(s);
    }
    
    static void b(final ConversationsFragment conversationsFragment) {
        conversationsFragment.i();
    }
    
    static ig c(final ConversationsFragment conversationsFragment) {
        return conversationsFragment.b;
    }
    
    private void c() {
        try {
            if (this.j != null) {
                this.j.notifyDataSetChanged();
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    static void c(final int n) {
        d(n);
    }
    
    static int d(final ConversationsFragment conversationsFragment) {
        return conversationsFragment.r;
    }
    
    private static void d(final int n) {
        final SharedPreferences$Editor edit = App.aq.getSharedPreferences(ConversationsFragment.z[25], 0).edit();
        try {
            edit.putInt(ConversationsFragment.z[27], n);
            if (!edit.commit()) {
                Log.e(ConversationsFragment.z[26]);
            }
        }
        catch (ActivityNotFoundException ex) {
            throw ex;
        }
    }
    
    private static int e() {
        return App.aq.getSharedPreferences(ConversationsFragment.z[13], 0).getInt(ConversationsFragment.z[12], 0);
    }
    
    static TextView e(final ConversationsFragment conversationsFragment) {
        return conversationsFragment.t;
    }
    
    static void f(final ConversationsFragment conversationsFragment) {
        conversationsFragment.c();
    }
    
    static int g() {
        return e();
    }
    
    static zb g(final ConversationsFragment conversationsFragment) {
        return conversationsFragment.j;
    }
    
    static aqv h(final ConversationsFragment conversationsFragment) {
        return conversationsFragment.n;
    }
    
    static a9q i(final ConversationsFragment conversationsFragment) {
        return conversationsFragment.h;
    }
    
    private void i() {
        final View view = this.getView();
        if (view == null) {
            return;
        }
        final int d = App.S.d();
        final View viewById = view.findViewById(2131755506);
        final View viewById2 = view.findViewById(2131755504);
        Label_0109: {
            if (d <= 0) {
                break Label_0109;
            }
            viewById2.setVisibility(0);
            this.k.setEmptyView(viewById2);
            viewById.setVisibility(8);
            final TextView textView = (TextView)view.findViewById(2131755505);
            try {
                textView.setText(com.whatsapp.util.t.a(this.getResources().getString(2131231969), this.getResources().getDrawable(2130838817), (Paint)textView.getPaint()));
                if (App.I) {
                    viewById.setVisibility(0);
                    this.k.setEmptyView(viewById);
                    viewById2.setVisibility(8);
                }
            }
            catch (ActivityNotFoundException ex) {
                throw ex;
            }
        }
    }
    
    static ImageView j(final ConversationsFragment conversationsFragment) {
        return conversationsFragment.g;
    }
    
    static ListView k(final ConversationsFragment conversationsFragment) {
        return conversationsFragment.k;
    }
    
    static ArrayList l(final ConversationsFragment conversationsFragment) {
        return conversationsFragment.c;
    }
    
    static String m(final ConversationsFragment conversationsFragment) {
        return conversationsFragment.q;
    }
    
    static String n(final ConversationsFragment conversationsFragment) {
        return conversationsFragment.m;
    }
    
    static TextView o(final ConversationsFragment conversationsFragment) {
        return conversationsFragment.d;
    }
    
    static GoogleDriveService p(final ConversationsFragment conversationsFragment) {
        return conversationsFragment.s;
    }
    
    @Override
    public void a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: invokespecial   com/whatsapp/ConversationsFragment.c:()V
        //     4: aload_0        
        //     5: getfield        com/whatsapp/ConversationsFragment.j:Lcom/whatsapp/zb;
        //     8: astore_3       
        //     9: aload_3        
        //    10: ifnull          27
        //    13: aload_0        
        //    14: getfield        com/whatsapp/ConversationsFragment.j:Lcom/whatsapp/zb;
        //    17: invokevirtual   com/whatsapp/zb.getCount:()I
        //    20: ifne            27
        //    23: aload_0        
        //    24: invokespecial   com/whatsapp/ConversationsFragment.i:()V
        //    27: aload_0        
        //    28: getfield        com/whatsapp/ConversationsFragment.j:Lcom/whatsapp/zb;
        //    31: invokevirtual   com/whatsapp/zb.getFilter:()Landroid/widget/Filter;
        //    34: checkcast       Lcom/whatsapp/adj;
        //    37: invokevirtual   com/whatsapp/adj.b:()V
        //    40: return         
        //    41: astore_1       
        //    42: aload_1        
        //    43: athrow         
        //    44: astore_2       
        //    45: aload_2        
        //    46: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      9      41     44     Landroid/content/ActivityNotFoundException;
        //  13     27     44     47     Landroid/content/ActivityNotFoundException;
        //  42     44     44     47     Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0027:
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
    
    protected void a(final int n) {
        final boolean i = App.I;
        if (this.k.getLastVisiblePosition() < -1 + this.k.getAdapter().getCount()) {
            final int childCount = this.k.getChildCount();
            int n2 = 0;
            int n3;
            int n4;
            for (int j = 0; j < childCount; j = n4, n2 = n3) {
                final View child = this.k.getChildAt(j);
                if (child.getTop() >= n) {
                    final TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
                    ((Animation)translateAnimation).setDuration(150L);
                    ((Animation)translateAnimation).setStartOffset((long)(8 * (int)Math.sqrt(n2 * 300)));
                    ((Animation)translateAnimation).setFillAfter(false);
                    child.startAnimation((Animation)translateAnimation);
                    n3 = n2 + 1;
                }
                else {
                    n3 = n2;
                }
                n4 = j + 1;
                if (i) {
                    break;
                }
            }
        }
    }
    
    @Override
    public void a(final CharSequence charSequence) {
        this.j.getFilter().filter(charSequence);
    }
    
    @Override
    public void a(final String s) {
        this.a((Context)App.aq, s);
    }
    
    @Override
    public void a(final String s, final boolean b) {
        this.getActivity().runOnUiThread((Runnable)new y3(this, s, b));
    }
    
    @Override
    public void a(final Collection collection) {
    }
    
    @Override
    public void b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: aload_0        
        //     1: getfield        com/whatsapp/ConversationsFragment.j:Lcom/whatsapp/zb;
        //     4: astore          4
        //     6: aload           4
        //     8: ifnull          84
        //    11: aload_0        
        //    12: getfield        com/whatsapp/ConversationsFragment.j:Lcom/whatsapp/zb;
        //    15: invokestatic    com/whatsapp/zb.a:(Lcom/whatsapp/zb;)Ljava/lang/String;
        //    18: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    21: istore          5
        //    23: iload           5
        //    25: ifeq            42
        //    28: aload_0        
        //    29: aload_0        
        //    30: invokevirtual   com/whatsapp/ConversationsFragment.f:()Ljava/util/ArrayList;
        //    33: putfield        com/whatsapp/ConversationsFragment.c:Ljava/util/ArrayList;
        //    36: getstatic       com/whatsapp/App.I:Z
        //    39: ifeq            59
        //    42: aload_0        
        //    43: getfield        com/whatsapp/ConversationsFragment.j:Lcom/whatsapp/zb;
        //    46: invokevirtual   com/whatsapp/zb.getFilter:()Landroid/widget/Filter;
        //    49: aload_0        
        //    50: getfield        com/whatsapp/ConversationsFragment.j:Lcom/whatsapp/zb;
        //    53: invokestatic    com/whatsapp/zb.a:(Lcom/whatsapp/zb;)Ljava/lang/String;
        //    56: invokevirtual   android/widget/Filter.filter:(Ljava/lang/CharSequence;)V
        //    59: aload_0        
        //    60: invokevirtual   com/whatsapp/ConversationsFragment.d:()V
        //    63: aload_0        
        //    64: getfield        com/whatsapp/ConversationsFragment.j:Lcom/whatsapp/zb;
        //    67: invokevirtual   com/whatsapp/zb.notifyDataSetChanged:()V
        //    70: aload_0        
        //    71: getfield        com/whatsapp/ConversationsFragment.j:Lcom/whatsapp/zb;
        //    74: invokevirtual   com/whatsapp/zb.getCount:()I
        //    77: ifne            84
        //    80: aload_0        
        //    81: invokespecial   com/whatsapp/ConversationsFragment.i:()V
        //    84: return         
        //    85: astore_1       
        //    86: aload_1        
        //    87: athrow         
        //    88: astore_2       
        //    89: aload_2        
        //    90: athrow         
        //    91: astore_3       
        //    92: aload_3        
        //    93: athrow         
        //    94: astore          6
        //    96: aload           6
        //    98: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  0      6      85     88     Landroid/content/ActivityNotFoundException;
        //  11     23     88     91     Landroid/content/ActivityNotFoundException;
        //  28     42     91     94     Landroid/content/ActivityNotFoundException;
        //  42     59     91     94     Landroid/content/ActivityNotFoundException;
        //  59     84     94     99     Landroid/content/ActivityNotFoundException;
        //  86     88     88     91     Landroid/content/ActivityNotFoundException;
        //  89     91     91     94     Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 49, Size: 49
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
    
    void b(final int n) {
        ((gu)this.getActivity()).a(n);
    }
    
    protected void b(final View view) {
        App.ak.c(this.m, false);
    }
    
    @Override
    public void b(final String s) {
        this.a((Context)App.aq, s);
    }
    
    @Override
    public void c(final String s) {
        this.a((Context)App.aq, s);
    }
    
    protected void d() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: aload_0        
        //     5: invokestatic    com/whatsapp/z8.c:()I
        //     8: putfield        com/whatsapp/ConversationsFragment.r:I
        //    11: aload_0        
        //    12: getfield        com/whatsapp/ConversationsFragment.r:I
        //    15: istore          5
        //    17: iload           5
        //    19: ifle            80
        //    22: aload_0        
        //    23: getfield        com/whatsapp/ConversationsFragment.f:Landroid/widget/TextView;
        //    26: astore          22
        //    28: iconst_1       
        //    29: anewarray       Ljava/lang/Object;
        //    32: astore          23
        //    34: aload           23
        //    36: iconst_0       
        //    37: aload_0        
        //    38: getfield        com/whatsapp/ConversationsFragment.r:I
        //    41: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    44: aastore        
        //    45: aload           22
        //    47: aload_0        
        //    48: ldc_w           2131230825
        //    51: aload           23
        //    53: invokevirtual   com/whatsapp/ConversationsFragment.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //    56: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //    59: aload_0        
        //    60: getfield        com/whatsapp/ConversationsFragment.f:Landroid/widget/TextView;
        //    63: iconst_0       
        //    64: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //    67: aload_0        
        //    68: getfield        com/whatsapp/ConversationsFragment.l:Landroid/widget/TextView;
        //    71: bipush          8
        //    73: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //    76: iload_1        
        //    77: ifeq            116
        //    80: aload_0        
        //    81: getfield        com/whatsapp/ConversationsFragment.f:Landroid/widget/TextView;
        //    84: bipush          8
        //    86: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //    89: aload_0        
        //    90: getfield        com/whatsapp/ConversationsFragment.l:Landroid/widget/TextView;
        //    93: astore          6
        //    95: invokestatic    com/whatsapp/ConversationsFragment.e:()I
        //    98: istore          7
        //   100: iconst_0       
        //   101: istore          8
        //   103: iload           7
        //   105: iconst_3       
        //   106: if_icmpge       296
        //   109: aload           6
        //   111: iload           8
        //   113: invokevirtual   android/widget/TextView.setVisibility:(I)V
        //   116: invokestatic    com/whatsapp/z8.f:()Z
        //   119: istore          15
        //   121: iload           15
        //   123: ifne            236
        //   126: invokestatic    com/whatsapp/z8.a:()I
        //   129: istore          16
        //   131: iload           16
        //   133: iconst_2       
        //   134: if_icmple       236
        //   137: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   140: getstatic       com/whatsapp/ConversationsFragment.z:[Ljava/lang/String;
        //   143: iconst_3       
        //   144: aaload         
        //   145: iconst_0       
        //   146: invokevirtual   com/whatsapp/App.getSharedPreferences:(Ljava/lang/String;I)Landroid/content/SharedPreferences;
        //   149: getstatic       com/whatsapp/ConversationsFragment.z:[Ljava/lang/String;
        //   152: bipush          6
        //   154: aaload         
        //   155: iconst_0       
        //   156: invokeinterface android/content/SharedPreferences.getInt:(Ljava/lang/String;I)I
        //   161: istore          17
        //   163: iload           17
        //   165: iconst_3       
        //   166: if_icmpge       236
        //   169: ldc2_w          2592000000
        //   172: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   175: getstatic       com/whatsapp/ConversationsFragment.z:[Ljava/lang/String;
        //   178: iconst_4       
        //   179: aaload         
        //   180: iconst_0       
        //   181: invokevirtual   com/whatsapp/App.getSharedPreferences:(Ljava/lang/String;I)Landroid/content/SharedPreferences;
        //   184: getstatic       com/whatsapp/ConversationsFragment.z:[Ljava/lang/String;
        //   187: iconst_1       
        //   188: aaload         
        //   189: lconst_0       
        //   190: invokeinterface android/content/SharedPreferences.getLong:(Ljava/lang/String;J)J
        //   195: ladd           
        //   196: lstore          18
        //   198: invokestatic    java/lang/System.currentTimeMillis:()J
        //   201: lstore          20
        //   203: lload           18
        //   205: lload           20
        //   207: lcmp           
        //   208: ifge            236
        //   211: aload_0        
        //   212: getfield        com/whatsapp/ConversationsFragment.i:Landroid/view/View;
        //   215: iconst_0       
        //   216: invokevirtual   android/view/View.setVisibility:(I)V
        //   219: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   222: getstatic       com/whatsapp/fieldstats/o.IS_GROUP_CREATE_BANNER_SHOWN:Lcom/whatsapp/fieldstats/o;
        //   225: iconst_1       
        //   226: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   229: invokestatic    com/whatsapp/fieldstats/a5.a:(Landroid/content/Context;Lcom/whatsapp/fieldstats/o;Ljava/lang/Boolean;)V
        //   232: iload_1        
        //   233: ifeq            284
        //   236: aload_0        
        //   237: getfield        com/whatsapp/ConversationsFragment.i:Landroid/view/View;
        //   240: bipush          8
        //   242: invokevirtual   android/view/View.setVisibility:(I)V
        //   245: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   248: getstatic       com/whatsapp/ConversationsFragment.z:[Ljava/lang/String;
        //   251: iconst_5       
        //   252: aaload         
        //   253: iconst_0       
        //   254: invokevirtual   com/whatsapp/App.getSharedPreferences:(Ljava/lang/String;I)Landroid/content/SharedPreferences;
        //   257: getstatic       com/whatsapp/ConversationsFragment.z:[Ljava/lang/String;
        //   260: iconst_2       
        //   261: aaload         
        //   262: iconst_0       
        //   263: invokeinterface android/content/SharedPreferences.getInt:(Ljava/lang/String;I)I
        //   268: ifle            284
        //   271: getstatic       com/whatsapp/App.aq:Lcom/whatsapp/App;
        //   274: getstatic       com/whatsapp/fieldstats/o.IS_GROUP_CREATE_BANNER_SHOWN:Lcom/whatsapp/fieldstats/o;
        //   277: iconst_1       
        //   278: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   281: invokestatic    com/whatsapp/fieldstats/a5.a:(Landroid/content/Context;Lcom/whatsapp/fieldstats/o;Ljava/lang/Boolean;)V
        //   284: return         
        //   285: astore_2       
        //   286: aload_2        
        //   287: athrow         
        //   288: astore_3       
        //   289: aload_3        
        //   290: athrow         
        //   291: astore          4
        //   293: aload           4
        //   295: athrow         
        //   296: bipush          8
        //   298: istore          8
        //   300: goto            109
        //   303: astore          9
        //   305: aload           9
        //   307: athrow         
        //   308: astore          10
        //   310: aload           10
        //   312: athrow         
        //   313: astore          11
        //   315: aload           11
        //   317: athrow         
        //   318: astore          12
        //   320: aload           12
        //   322: athrow         
        //   323: astore          13
        //   325: aload           13
        //   327: athrow         
        //   328: astore          14
        //   330: aload           14
        //   332: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  4      17     285    288    Landroid/content/ActivityNotFoundException;
        //  22     76     288    291    Landroid/content/ActivityNotFoundException;
        //  80     100    291    296    Landroid/content/ActivityNotFoundException;
        //  116    121    303    308    Landroid/content/ActivityNotFoundException;
        //  126    131    308    313    Landroid/content/ActivityNotFoundException;
        //  137    163    313    318    Landroid/content/ActivityNotFoundException;
        //  169    203    318    323    Landroid/content/ActivityNotFoundException;
        //  211    232    323    328    Landroid/content/ActivityNotFoundException;
        //  236    284    328    333    Landroid/content/ActivityNotFoundException;
        //  286    288    288    291    Landroid/content/ActivityNotFoundException;
        //  289    291    291    296    Landroid/content/ActivityNotFoundException;
        //  305    308    308    313    Landroid/content/ActivityNotFoundException;
        //  310    313    313    318    Landroid/content/ActivityNotFoundException;
        //  315    318    318    323    Landroid/content/ActivityNotFoundException;
        //  320    323    323    328    Landroid/content/ActivityNotFoundException;
        //  325    328    328    333    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 162, Size: 162
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
    public void d(final String s) {
        this.a((Context)App.aq, s);
    }
    
    @Override
    public void e(final String s) {
        this.getActivity().runOnUiThread((Runnable)new zz(this));
    }
    
    protected ArrayList f() {
        final boolean i = App.I;
        final ArrayList b = z8.b();
        final ArrayList list = new ArrayList<al_>(b.size());
        final Iterator<String> iterator = b.iterator();
        while (iterator.hasNext()) {
            list.add(new al_(iterator.next()));
            if (i) {
                break;
            }
        }
        return list;
    }
    
    void f(final String s) {
        ((gu)this.getActivity()).f(s);
    }
    
    protected void h() {
        final View inflate = this.getActivity().getLayoutInflater().inflate(2130903141, (ViewGroup)this.k, false);
        this.k.addFooterView(inflate, (Object)null, true);
        this.l = (TextView)inflate.findViewById(2131755523);
        final View inflate2 = this.getActivity().getLayoutInflater().inflate(2130903141, (ViewGroup)this.k, false);
        inflate2.setBackgroundResource(2130839068);
        inflate2.setOnClickListener((View$OnClickListener)new us(this));
        this.k.addFooterView(inflate2, (Object)null, true);
        this.f = (TextView)inflate2.findViewById(2131755523);
        (this.i = alm.a(this.getActivity().getLayoutInflater(), 2130903136, (ViewGroup)this.k, false)).setBackgroundResource(2130839068);
        vc.b((TextView)this.i.findViewById(2131755507));
        ((ImageView)this.i.findViewById(2131755295)).setImageBitmap(a_9.b(2130838958));
        final FrameLayout frameLayout = new FrameLayout((Context)this.getActivity());
        frameLayout.setBackgroundColor(-11684180);
        frameLayout.addView(this.i);
        frameLayout.setOnClickListener((View$OnClickListener)new ve(this));
        this.i.findViewById(2131755303).setOnClickListener((View$OnClickListener)new hk(this));
        this.k.addHeaderView((View)frameLayout, (Object)null, true);
    }
    
    @Override
    public void onActivityCreated(final Bundle p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: iconst_1       
        //     1: istore_2       
        //     2: new             Lcom/whatsapp/util/b0;
        //     5: dup            
        //     6: getstatic       com/whatsapp/ConversationsFragment.z:[Ljava/lang/String;
        //     9: bipush          34
        //    11: aaload         
        //    12: invokespecial   com/whatsapp/util/b0.<init>:(Ljava/lang/String;)V
        //    15: astore_3       
        //    16: aload_0        
        //    17: aload_1        
        //    18: invokespecial   android/support/v4/app/ListFragment.onActivityCreated:(Landroid/os/Bundle;)V
        //    21: aload_0        
        //    22: iconst_1       
        //    23: invokevirtual   com/whatsapp/ConversationsFragment.setHasOptionsMenu:(Z)V
        //    26: aload_0        
        //    27: getfield        com/whatsapp/ConversationsFragment.n:Lcom/whatsapp/aqv;
        //    30: ifnonnull       184
        //    33: aload_0        
        //    34: new             Lcom/whatsapp/aqv;
        //    37: dup            
        //    38: invokespecial   com/whatsapp/aqv.<init>:()V
        //    41: putfield        com/whatsapp/ConversationsFragment.n:Lcom/whatsapp/aqv;
        //    44: aload_0        
        //    45: getfield        com/whatsapp/ConversationsFragment.n:Lcom/whatsapp/aqv;
        //    48: aload_0        
        //    49: ldc_w           2131231229
        //    52: invokevirtual   com/whatsapp/ConversationsFragment.getString:(I)Ljava/lang/String;
        //    55: putfield        com/whatsapp/aqv.i:Ljava/lang/String;
        //    58: aload_0        
        //    59: getfield        com/whatsapp/ConversationsFragment.n:Lcom/whatsapp/aqv;
        //    62: aload_0        
        //    63: ldc_w           2131231171
        //    66: invokevirtual   com/whatsapp/ConversationsFragment.getString:(I)Ljava/lang/String;
        //    69: putfield        com/whatsapp/aqv.h:Ljava/lang/String;
        //    72: aload_0        
        //    73: getfield        com/whatsapp/ConversationsFragment.n:Lcom/whatsapp/aqv;
        //    76: aload_0        
        //    77: ldc_w           2131231172
        //    80: invokevirtual   com/whatsapp/ConversationsFragment.getString:(I)Ljava/lang/String;
        //    83: putfield        com/whatsapp/aqv.b:Ljava/lang/String;
        //    86: aload_0        
        //    87: getfield        com/whatsapp/ConversationsFragment.n:Lcom/whatsapp/aqv;
        //    90: aload_0        
        //    91: ldc_w           2131230976
        //    94: invokevirtual   com/whatsapp/ConversationsFragment.getString:(I)Ljava/lang/String;
        //    97: putfield        com/whatsapp/aqv.d:Ljava/lang/String;
        //   100: aload_0        
        //   101: getfield        com/whatsapp/ConversationsFragment.n:Lcom/whatsapp/aqv;
        //   104: aload_0        
        //   105: ldc_w           2131230970
        //   108: invokevirtual   com/whatsapp/ConversationsFragment.getString:(I)Ljava/lang/String;
        //   111: putfield        com/whatsapp/aqv.c:Ljava/lang/String;
        //   114: aload_0        
        //   115: getfield        com/whatsapp/ConversationsFragment.n:Lcom/whatsapp/aqv;
        //   118: aload_0        
        //   119: ldc_w           2131230980
        //   122: invokevirtual   com/whatsapp/ConversationsFragment.getString:(I)Ljava/lang/String;
        //   125: putfield        com/whatsapp/aqv.g:Ljava/lang/String;
        //   128: aload_0        
        //   129: getfield        com/whatsapp/ConversationsFragment.n:Lcom/whatsapp/aqv;
        //   132: aload_0        
        //   133: ldc_w           2131230979
        //   136: invokevirtual   com/whatsapp/ConversationsFragment.getString:(I)Ljava/lang/String;
        //   139: putfield        com/whatsapp/aqv.a:Ljava/lang/String;
        //   142: aload_0        
        //   143: getfield        com/whatsapp/ConversationsFragment.n:Lcom/whatsapp/aqv;
        //   146: aload_0        
        //   147: ldc_w           2131230977
        //   150: invokevirtual   com/whatsapp/ConversationsFragment.getString:(I)Ljava/lang/String;
        //   153: putfield        com/whatsapp/aqv.f:Ljava/lang/String;
        //   156: aload_0        
        //   157: getfield        com/whatsapp/ConversationsFragment.n:Lcom/whatsapp/aqv;
        //   160: aload_0        
        //   161: ldc_w           2131230975
        //   164: invokevirtual   com/whatsapp/ConversationsFragment.getString:(I)Ljava/lang/String;
        //   167: putfield        com/whatsapp/aqv.e:Ljava/lang/String;
        //   170: aload_0        
        //   171: getfield        com/whatsapp/ConversationsFragment.n:Lcom/whatsapp/aqv;
        //   174: aload_0        
        //   175: ldc_w           2131231227
        //   178: invokevirtual   com/whatsapp/ConversationsFragment.getString:(I)Ljava/lang/String;
        //   181: putfield        com/whatsapp/aqv.j:Ljava/lang/String;
        //   184: getstatic       com/whatsapp/ConversationsFragment.z:[Ljava/lang/String;
        //   187: bipush          32
        //   189: aaload         
        //   190: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   193: invokestatic    com/whatsapp/App.y:()V
        //   196: aload_0        
        //   197: invokestatic    com/whatsapp/App.b:(Lcom/whatsapp/aws;)V
        //   200: aload_0        
        //   201: invokestatic    com/whatsapp/App.a:(Lcom/whatsapp/_7;)V
        //   204: aload_0        
        //   205: aload_0        
        //   206: invokevirtual   com/whatsapp/ConversationsFragment.f:()Ljava/util/ArrayList;
        //   209: putfield        com/whatsapp/ConversationsFragment.c:Ljava/util/ArrayList;
        //   212: aload_0        
        //   213: aload_0        
        //   214: invokevirtual   com/whatsapp/ConversationsFragment.getListView:()Landroid/widget/ListView;
        //   217: putfield        com/whatsapp/ConversationsFragment.k:Landroid/widget/ListView;
        //   220: aload_0        
        //   221: getfield        com/whatsapp/ConversationsFragment.k:Landroid/widget/ListView;
        //   224: new             Lcom/whatsapp/util/m;
        //   227: dup            
        //   228: aload_0        
        //   229: invokevirtual   com/whatsapp/ConversationsFragment.getResources:()Landroid/content/res/Resources;
        //   232: ldc_w           2130837753
        //   235: invokevirtual   android/content/res/Resources.getDrawable:(I)Landroid/graphics/drawable/Drawable;
        //   238: invokespecial   com/whatsapp/util/m.<init>:(Landroid/graphics/drawable/Drawable;)V
        //   241: invokevirtual   android/widget/ListView.setDivider:(Landroid/graphics/drawable/Drawable;)V
        //   244: aload_0        
        //   245: getfield        com/whatsapp/ConversationsFragment.k:Landroid/widget/ListView;
        //   248: astore          6
        //   250: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   253: istore          7
        //   255: iload           7
        //   257: bipush          11
        //   259: if_icmpge       432
        //   262: aload           6
        //   264: iload_2        
        //   265: invokevirtual   android/widget/ListView.setFastScrollEnabled:(Z)V
        //   268: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   271: bipush          11
        //   273: if_icmpge       286
        //   276: aload_0        
        //   277: getfield        com/whatsapp/ConversationsFragment.k:Landroid/widget/ListView;
        //   280: ldc_w           2130839068
        //   283: invokevirtual   android/widget/ListView.setSelector:(I)V
        //   286: aload_0        
        //   287: getfield        com/whatsapp/ConversationsFragment.k:Landroid/widget/ListView;
        //   290: iconst_1       
        //   291: invokevirtual   android/widget/ListView.setScrollbarFadingEnabled:(Z)V
        //   294: aload_0        
        //   295: invokevirtual   com/whatsapp/ConversationsFragment.h:()V
        //   298: aload_0        
        //   299: invokevirtual   com/whatsapp/ConversationsFragment.d:()V
        //   302: aload_0        
        //   303: getfield        com/whatsapp/ConversationsFragment.k:Landroid/widget/ListView;
        //   306: new             Lcom/whatsapp/a9w;
        //   309: dup            
        //   310: aload_0        
        //   311: invokespecial   com/whatsapp/a9w.<init>:(Lcom/whatsapp/ConversationsFragment;)V
        //   314: invokevirtual   android/widget/ListView.setOnScrollListener:(Landroid/widget/AbsListView$OnScrollListener;)V
        //   317: aload_0        
        //   318: new             Lcom/whatsapp/zb;
        //   321: dup            
        //   322: aload_0        
        //   323: invokespecial   com/whatsapp/zb.<init>:(Lcom/whatsapp/ConversationsFragment;)V
        //   326: putfield        com/whatsapp/ConversationsFragment.j:Lcom/whatsapp/zb;
        //   329: aload_0        
        //   330: getfield        com/whatsapp/ConversationsFragment.k:Landroid/widget/ListView;
        //   333: aload_0        
        //   334: getfield        com/whatsapp/ConversationsFragment.j:Lcom/whatsapp/zb;
        //   337: invokevirtual   android/widget/ListView.setAdapter:(Landroid/widget/ListAdapter;)V
        //   340: aload_0        
        //   341: getfield        com/whatsapp/ConversationsFragment.k:Landroid/widget/ListView;
        //   344: new             Lcom/whatsapp/a0x;
        //   347: dup            
        //   348: aload_0        
        //   349: invokespecial   com/whatsapp/a0x.<init>:(Lcom/whatsapp/ConversationsFragment;)V
        //   352: invokevirtual   android/widget/ListView.setOnItemClickListener:(Landroid/widget/AdapterView$OnItemClickListener;)V
        //   355: aload_0        
        //   356: getfield        com/whatsapp/ConversationsFragment.j:Lcom/whatsapp/zb;
        //   359: invokevirtual   com/whatsapp/zb.getCount:()I
        //   362: ifne            369
        //   365: aload_0        
        //   366: invokespecial   com/whatsapp/ConversationsFragment.i:()V
        //   369: aload_0        
        //   370: aload_0        
        //   371: getfield        com/whatsapp/ConversationsFragment.k:Landroid/widget/ListView;
        //   374: invokevirtual   com/whatsapp/ConversationsFragment.registerForContextMenu:(Landroid/view/View;)V
        //   377: aload_0        
        //   378: invokevirtual   com/whatsapp/ConversationsFragment.getView:()Landroid/view/View;
        //   381: ldc_w           2131755568
        //   384: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   387: new             Lcom/whatsapp/a0j;
        //   390: dup            
        //   391: aload_0        
        //   392: invokespecial   com/whatsapp/a0j.<init>:(Lcom/whatsapp/ConversationsFragment;)V
        //   395: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   398: aload_1        
        //   399: ifnull          416
        //   402: aload_0        
        //   403: aload_1        
        //   404: getstatic       com/whatsapp/ConversationsFragment.z:[Ljava/lang/String;
        //   407: bipush          33
        //   409: aaload         
        //   410: invokevirtual   android/os/Bundle.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   413: putfield        com/whatsapp/ConversationsFragment.m:Ljava/lang/String;
        //   416: aload_3        
        //   417: invokevirtual   com/whatsapp/util/b0.c:()J
        //   420: pop2           
        //   421: return         
        //   422: astore          4
        //   424: aload           4
        //   426: athrow         
        //   427: astore          5
        //   429: aload           5
        //   431: athrow         
        //   432: iconst_0       
        //   433: istore_2       
        //   434: goto            262
        //   437: astore          8
        //   439: aload           8
        //   441: athrow         
        //   442: astore          9
        //   444: aload           9
        //   446: athrow         
        //   447: astore          10
        //   449: aload           10
        //   451: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  16     184    422    427    Landroid/content/ActivityNotFoundException;
        //  184    255    427    432    Landroid/content/ActivityNotFoundException;
        //  262    286    437    442    Landroid/content/ActivityNotFoundException;
        //  286    369    442    447    Landroid/content/ActivityNotFoundException;
        //  369    398    447    452    Landroid/content/ActivityNotFoundException;
        //  402    416    447    452    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 211, Size: 211
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
    public void onActivityResult(final int p0, final int p1, final Intent p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore          4
        //     5: iload_1        
        //     6: lookupswitch {
        //                1: 41
        //               10: 82
        //               11: 158
        //          default: 40
        //        }
        //    40: return         
        //    41: iload_2        
        //    42: iconst_m1      
        //    43: if_icmpne       40
        //    46: aload_3        
        //    47: getstatic       com/whatsapp/ConversationsFragment.z:[Ljava/lang/String;
        //    50: bipush          29
        //    52: aaload         
        //    53: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //    56: astore          12
        //    58: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    61: aload           12
        //    63: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //    66: astore          13
        //    68: aload_0        
        //    69: aload           13
        //    71: invokestatic    com/whatsapp/Conversation.a:(Lcom/whatsapp/a_9;)Landroid/content/Intent;
        //    74: invokevirtual   com/whatsapp/ConversationsFragment.startActivity:(Landroid/content/Intent;)V
        //    77: iload           4
        //    79: ifeq            40
        //    82: iload_2        
        //    83: iconst_m1      
        //    84: if_icmpne       144
        //    87: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    90: aload_0        
        //    91: getfield        com/whatsapp/ConversationsFragment.m:Ljava/lang/String;
        //    94: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //    97: astore          8
        //    99: aload_3        
        //   100: ifnull          131
        //   103: aload_3        
        //   104: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //   107: astore          11
        //   109: aload           11
        //   111: ifnull          131
        //   114: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   117: aload_3        
        //   118: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //   121: aload           8
        //   123: invokevirtual   com/whatsapp/wc.a:(Landroid/net/Uri;Lcom/whatsapp/a_9;)V
        //   126: iload           4
        //   128: ifeq            139
        //   131: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   134: aload           8
        //   136: invokevirtual   com/whatsapp/wc.h:(Lcom/whatsapp/a_9;)V
        //   139: iload           4
        //   141: ifeq            40
        //   144: getstatic       com/whatsapp/ConversationsFragment.z:[Ljava/lang/String;
        //   147: bipush          30
        //   149: aaload         
        //   150: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   153: iload           4
        //   155: ifeq            40
        //   158: iload_2        
        //   159: iconst_m1      
        //   160: if_icmpne       188
        //   163: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   166: aload_0        
        //   167: getfield        com/whatsapp/ConversationsFragment.m:Ljava/lang/String;
        //   170: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   173: astore          6
        //   175: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   178: aload           6
        //   180: invokevirtual   com/whatsapp/wc.h:(Lcom/whatsapp/a_9;)V
        //   183: iload           4
        //   185: ifeq            40
        //   188: getstatic       com/whatsapp/ConversationsFragment.z:[Ljava/lang/String;
        //   191: bipush          28
        //   193: aaload         
        //   194: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   197: return         
        //   198: astore          5
        //   200: aload           5
        //   202: athrow         
        //   203: astore          14
        //   205: aload           14
        //   207: athrow         
        //   208: astore          10
        //   210: aload           10
        //   212: athrow         
        //   213: astore          9
        //   215: aload           9
        //   217: athrow         
        //   218: astore          7
        //   220: aload           7
        //   222: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  68     77     203    208    Landroid/content/ActivityNotFoundException;
        //  103    109    208    213    Landroid/content/ActivityNotFoundException;
        //  114    126    213    218    Landroid/content/ActivityNotFoundException;
        //  131    139    213    218    Landroid/content/ActivityNotFoundException;
        //  144    153    218    223    Landroid/content/ActivityNotFoundException;
        //  175    183    198    203    Landroid/content/ActivityNotFoundException;
        //  188    197    198    203    Landroid/content/ActivityNotFoundException;
        //  210    213    213    218    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 90, Size: 90
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
    public boolean onContextItemSelected(final MenuItem p0) {
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
        //          -31457264: 356
        //          -31457263: 466
        //          -31457262: 674
        //          -31457261: 66
        //          -31457260: 710
        //          -31457259: 102
        //          -31457258: 570
        //          -31457257: 728
        //          -31457256: 692
        //          default: 60
        //        }
        //    60: aload_0        
        //    61: aload_1        
        //    62: invokespecial   android/support/v4/app/ListFragment.onContextItemSelected:(Landroid/view/MenuItem;)Z
        //    65: ireturn        
        //    66: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    69: aload_0        
        //    70: getfield        com/whatsapp/ConversationsFragment.m:Ljava/lang/String;
        //    73: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //    76: astore          41
        //    78: aload           41
        //    80: getfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //    83: ifnull          95
        //    86: aload           41
        //    88: aload_0        
        //    89: invokevirtual   com/whatsapp/ConversationsFragment.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //    92: invokestatic    com/whatsapp/ContactInfo.a:(Lcom/whatsapp/a_9;Landroid/app/Activity;)V
        //    95: iconst_1       
        //    96: ireturn        
        //    97: astore          42
        //    99: aload           42
        //   101: athrow         
        //   102: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   105: aload_0        
        //   106: getfield        com/whatsapp/ConversationsFragment.m:Ljava/lang/String;
        //   109: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   112: astore          27
        //   114: aload           27
        //   116: invokevirtual   com/whatsapp/a_9.m:()Z
        //   119: ifeq            251
        //   122: new             Ljava/lang/StringBuilder;
        //   125: dup            
        //   126: invokespecial   java/lang/StringBuilder.<init>:()V
        //   129: getstatic       com/whatsapp/ConversationsFragment.z:[Ljava/lang/String;
        //   132: bipush          15
        //   134: aaload         
        //   135: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   138: aload           27
        //   140: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   143: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   146: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   149: getstatic       com/whatsapp/adc.e:Z
        //   152: istore          38
        //   154: iload           38
        //   156: ifeq            174
        //   159: aload_0        
        //   160: invokevirtual   com/whatsapp/ConversationsFragment.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //   163: ldc_w           2131231230
        //   166: iconst_0       
        //   167: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //   170: iload_2        
        //   171: ifeq            309
        //   174: aload           27
        //   176: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   179: invokestatic    com/whatsapp/adc.f:(Ljava/lang/String;)Z
        //   182: istore          39
        //   184: iload           39
        //   186: ifeq            226
        //   189: aload           27
        //   191: invokevirtual   com/whatsapp/a_9.o:()Z
        //   194: istore          40
        //   196: iload           40
        //   198: ifne            226
        //   201: aload_0        
        //   202: aload           27
        //   204: new             Lcom/whatsapp/ConversationsFragment$ExitGroupDialogFragment;
        //   207: dup            
        //   208: invokespecial   com/whatsapp/ConversationsFragment$ExitGroupDialogFragment.<init>:()V
        //   211: invokespecial   com/whatsapp/ConversationsFragment.a:(Lcom/whatsapp/a_9;Landroid/support/v4/app/DialogFragment;)Landroid/support/v4/app/DialogFragment;
        //   214: aload_0        
        //   215: invokevirtual   com/whatsapp/ConversationsFragment.getFragmentManager:()Landroid/support/v4/app/FragmentManager;
        //   218: aconst_null    
        //   219: invokevirtual   android/support/v4/app/DialogFragment.show:(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V
        //   222: iload_2        
        //   223: ifeq            309
        //   226: aload_0        
        //   227: aload           27
        //   229: new             Lcom/whatsapp/ConversationsFragment$DeleteGroupDialogFragment;
        //   232: dup            
        //   233: invokespecial   com/whatsapp/ConversationsFragment$DeleteGroupDialogFragment.<init>:()V
        //   236: invokespecial   com/whatsapp/ConversationsFragment.a:(Lcom/whatsapp/a_9;Landroid/support/v4/app/DialogFragment;)Landroid/support/v4/app/DialogFragment;
        //   239: aload_0        
        //   240: invokevirtual   com/whatsapp/ConversationsFragment.getFragmentManager:()Landroid/support/v4/app/FragmentManager;
        //   243: aconst_null    
        //   244: invokevirtual   android/support/v4/app/DialogFragment.show:(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V
        //   247: iload_2        
        //   248: ifeq            309
        //   251: aload           27
        //   253: invokevirtual   com/whatsapp/a_9.k:()Z
        //   256: istore          37
        //   258: iload           37
        //   260: ifeq            288
        //   263: aload_0        
        //   264: aload           27
        //   266: new             Lcom/whatsapp/ConversationsFragment$DeleteBroadcastListDialogFragment;
        //   269: dup            
        //   270: invokespecial   com/whatsapp/ConversationsFragment$DeleteBroadcastListDialogFragment.<init>:()V
        //   273: invokespecial   com/whatsapp/ConversationsFragment.a:(Lcom/whatsapp/a_9;Landroid/support/v4/app/DialogFragment;)Landroid/support/v4/app/DialogFragment;
        //   276: aload_0        
        //   277: invokevirtual   com/whatsapp/ConversationsFragment.getFragmentManager:()Landroid/support/v4/app/FragmentManager;
        //   280: aconst_null    
        //   281: invokevirtual   android/support/v4/app/DialogFragment.show:(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V
        //   284: iload_2        
        //   285: ifeq            309
        //   288: aload_0        
        //   289: aload           27
        //   291: new             Lcom/whatsapp/ConversationsFragment$DeleteContactDialogFragment;
        //   294: dup            
        //   295: invokespecial   com/whatsapp/ConversationsFragment$DeleteContactDialogFragment.<init>:()V
        //   298: invokespecial   com/whatsapp/ConversationsFragment.a:(Lcom/whatsapp/a_9;Landroid/support/v4/app/DialogFragment;)Landroid/support/v4/app/DialogFragment;
        //   301: aload_0        
        //   302: invokevirtual   com/whatsapp/ConversationsFragment.getFragmentManager:()Landroid/support/v4/app/FragmentManager;
        //   305: aconst_null    
        //   306: invokevirtual   android/support/v4/app/DialogFragment.show:(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V
        //   309: iconst_1       
        //   310: ireturn        
        //   311: astore          28
        //   313: aload           28
        //   315: athrow         
        //   316: astore          29
        //   318: aload           29
        //   320: athrow         
        //   321: astore          30
        //   323: aload           30
        //   325: athrow         
        //   326: astore          31
        //   328: aload           31
        //   330: athrow         
        //   331: astore          32
        //   333: aload           32
        //   335: athrow         
        //   336: astore          33
        //   338: aload           33
        //   340: athrow         
        //   341: astore          34
        //   343: aload           34
        //   345: athrow         
        //   346: astore          35
        //   348: aload           35
        //   350: athrow         
        //   351: astore          36
        //   353: aload           36
        //   355: athrow         
        //   356: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   359: aload_0        
        //   360: getfield        com/whatsapp/ConversationsFragment.m:Ljava/lang/String;
        //   363: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   366: invokevirtual   com/whatsapp/a_9.f:()Ljava/lang/String;
        //   369: astore          21
        //   371: new             Landroid/content/Intent;
        //   374: dup            
        //   375: getstatic       com/whatsapp/ConversationsFragment.z:[Ljava/lang/String;
        //   378: bipush          19
        //   380: aaload         
        //   381: getstatic       android/provider/ContactsContract$Contacts.CONTENT_URI:Landroid/net/Uri;
        //   384: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;Landroid/net/Uri;)V
        //   387: astore          22
        //   389: aload           22
        //   391: getstatic       com/whatsapp/ConversationsFragment.z:[Ljava/lang/String;
        //   394: bipush          14
        //   396: aaload         
        //   397: aload           21
        //   399: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   402: pop            
        //   403: aload           22
        //   405: aload           22
        //   407: aload_0        
        //   408: invokevirtual   com/whatsapp/ConversationsFragment.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //   411: invokevirtual   android/support/v4/app/FragmentActivity.getPackageManager:()Landroid/content/pm/PackageManager;
        //   414: invokevirtual   android/content/Intent.resolveActivity:(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;
        //   417: invokevirtual   android/content/Intent.setComponent:(Landroid/content/ComponentName;)Landroid/content/Intent;
        //   420: pop            
        //   421: aload           22
        //   423: invokevirtual   android/content/Intent.getComponent:()Landroid/content/ComponentName;
        //   426: ifnull          441
        //   429: aload_0        
        //   430: aload           22
        //   432: bipush          10
        //   434: invokevirtual   com/whatsapp/ConversationsFragment.startActivityForResult:(Landroid/content/Intent;I)V
        //   437: iload_2        
        //   438: ifeq            783
        //   441: getstatic       com/whatsapp/ConversationsFragment.z:[Ljava/lang/String;
        //   444: bipush          17
        //   446: aaload         
        //   447: invokestatic    com/whatsapp/util/Log.w:(Ljava/lang/String;)V
        //   450: invokestatic    com/whatsapp/App.N:()V
        //   453: goto            783
        //   456: astore          23
        //   458: aload           23
        //   460: athrow         
        //   461: astore          24
        //   463: aload           24
        //   465: athrow         
        //   466: new             Landroid/content/Intent;
        //   469: dup            
        //   470: getstatic       com/whatsapp/ConversationsFragment.z:[Ljava/lang/String;
        //   473: bipush          20
        //   475: aaload         
        //   476: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;)V
        //   479: astore          15
        //   481: aload           15
        //   483: getstatic       com/whatsapp/ConversationsFragment.z:[Ljava/lang/String;
        //   486: bipush          21
        //   488: aaload         
        //   489: invokevirtual   android/content/Intent.setType:(Ljava/lang/String;)Landroid/content/Intent;
        //   492: pop            
        //   493: aload           15
        //   495: getstatic       com/whatsapp/ConversationsFragment.z:[Ljava/lang/String;
        //   498: bipush          16
        //   500: aaload         
        //   501: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   504: aload_0        
        //   505: getfield        com/whatsapp/ConversationsFragment.m:Ljava/lang/String;
        //   508: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   511: aload_0        
        //   512: invokevirtual   com/whatsapp/ConversationsFragment.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //   515: invokevirtual   com/whatsapp/a_9.a:(Landroid/content/Context;)Ljava/lang/String;
        //   518: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   521: pop            
        //   522: aload           15
        //   524: getstatic       com/whatsapp/ConversationsFragment.z:[Ljava/lang/String;
        //   527: bipush          18
        //   529: aaload         
        //   530: iconst_2       
        //   531: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;I)Landroid/content/Intent;
        //   534: pop            
        //   535: aload           15
        //   537: ldc_w           524288
        //   540: invokevirtual   android/content/Intent.setFlags:(I)Landroid/content/Intent;
        //   543: pop            
        //   544: aload_0        
        //   545: aload           15
        //   547: bipush          11
        //   549: invokevirtual   com/whatsapp/ConversationsFragment.startActivityForResult:(Landroid/content/Intent;I)V
        //   552: iconst_1       
        //   553: ireturn        
        //   554: astore          20
        //   556: aload_0        
        //   557: invokevirtual   com/whatsapp/ConversationsFragment.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //   560: ldc_w           2131230786
        //   563: iconst_0       
        //   564: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //   567: goto            552
        //   570: getstatic       com/whatsapp/App.o:Z
        //   573: istore          10
        //   575: iload           10
        //   577: ifne            590
        //   580: getstatic       com/whatsapp/App.G:Z
        //   583: istore          14
        //   585: iload           14
        //   587: ifeq            615
        //   590: invokestatic    com/whatsapp/App.aw:()Z
        //   593: istore          11
        //   595: iload           11
        //   597: ifeq            661
        //   600: ldc_w           2131231383
        //   603: istore          12
        //   605: aload_0        
        //   606: iload           12
        //   608: invokevirtual   com/whatsapp/ConversationsFragment.b:(I)V
        //   611: iload_2        
        //   612: ifeq            644
        //   615: aload_0        
        //   616: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   619: aload_0        
        //   620: getfield        com/whatsapp/ConversationsFragment.m:Ljava/lang/String;
        //   623: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   626: new             Lcom/whatsapp/ConversationsFragment$EmailConversationMediaChoiceDialogFragment;
        //   629: dup            
        //   630: invokespecial   com/whatsapp/ConversationsFragment$EmailConversationMediaChoiceDialogFragment.<init>:()V
        //   633: invokespecial   com/whatsapp/ConversationsFragment.a:(Lcom/whatsapp/a_9;Landroid/support/v4/app/DialogFragment;)Landroid/support/v4/app/DialogFragment;
        //   636: aload_0        
        //   637: invokevirtual   com/whatsapp/ConversationsFragment.getFragmentManager:()Landroid/support/v4/app/FragmentManager;
        //   640: aconst_null    
        //   641: invokevirtual   android/support/v4/app/DialogFragment.show:(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V
        //   644: iconst_1       
        //   645: ireturn        
        //   646: astore          7
        //   648: aload           7
        //   650: athrow         
        //   651: astore          8
        //   653: aload           8
        //   655: athrow         
        //   656: astore          9
        //   658: aload           9
        //   660: athrow         
        //   661: ldc_w           2131231384
        //   664: istore          12
        //   666: goto            605
        //   669: astore          13
        //   671: aload           13
        //   673: athrow         
        //   674: aload_0        
        //   675: aload_1        
        //   676: invokeinterface android/view/MenuItem.getMenuInfo:()Landroid/view/ContextMenu$ContextMenuInfo;
        //   681: checkcast       Landroid/widget/AdapterView$AdapterContextMenuInfo;
        //   684: getfield        android/widget/AdapterView$AdapterContextMenuInfo.targetView:Landroid/view/View;
        //   687: invokespecial   com/whatsapp/ConversationsFragment.a:(Landroid/view/View;)V
        //   690: iconst_1       
        //   691: ireturn        
        //   692: aload_0        
        //   693: aload_1        
        //   694: invokeinterface android/view/MenuItem.getMenuInfo:()Landroid/view/ContextMenu$ContextMenuInfo;
        //   699: checkcast       Landroid/widget/AdapterView$AdapterContextMenuInfo;
        //   702: getfield        android/widget/AdapterView$AdapterContextMenuInfo.targetView:Landroid/view/View;
        //   705: invokevirtual   com/whatsapp/ConversationsFragment.b:(Landroid/view/View;)V
        //   708: iconst_1       
        //   709: ireturn        
        //   710: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   713: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   716: aload_0        
        //   717: getfield        com/whatsapp/ConversationsFragment.m:Ljava/lang/String;
        //   720: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   723: invokevirtual   com/whatsapp/wc.e:(Lcom/whatsapp/a_9;)V
        //   726: iconst_1       
        //   727: ireturn        
        //   728: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //   731: aload_0        
        //   732: getfield        com/whatsapp/ConversationsFragment.m:Ljava/lang/String;
        //   735: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //   738: astore_3       
        //   739: aload_3        
        //   740: invokevirtual   com/whatsapp/a_9.k:()Z
        //   743: istore          6
        //   745: iload           6
        //   747: ifeq            762
        //   750: aload_3        
        //   751: aload_0        
        //   752: invokevirtual   com/whatsapp/ConversationsFragment.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //   755: invokestatic    com/whatsapp/ListChatInfo.a:(Lcom/whatsapp/a_9;Landroid/app/Activity;)V
        //   758: iload_2        
        //   759: ifeq            785
        //   762: aload_3        
        //   763: aload_0        
        //   764: invokevirtual   com/whatsapp/ConversationsFragment.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //   767: invokestatic    com/whatsapp/GroupChatInfo.a:(Lcom/whatsapp/a_9;Landroid/app/Activity;)V
        //   770: goto            785
        //   773: astore          4
        //   775: aload           4
        //   777: athrow         
        //   778: astore          5
        //   780: aload           5
        //   782: athrow         
        //   783: iconst_1       
        //   784: ireturn        
        //   785: iconst_1       
        //   786: ireturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  78     95     97     102    Landroid/content/ActivityNotFoundException;
        //  114    154    311    316    Landroid/content/ActivityNotFoundException;
        //  159    170    316    321    Landroid/content/ActivityNotFoundException;
        //  174    184    321    326    Landroid/content/ActivityNotFoundException;
        //  189    196    326    331    Landroid/content/ActivityNotFoundException;
        //  201    222    331    336    Landroid/content/ActivityNotFoundException;
        //  226    247    336    341    Landroid/content/ActivityNotFoundException;
        //  251    258    341    346    Landroid/content/ActivityNotFoundException;
        //  263    284    346    351    Landroid/content/ActivityNotFoundException;
        //  288    309    351    356    Landroid/content/ActivityNotFoundException;
        //  313    316    316    321    Landroid/content/ActivityNotFoundException;
        //  318    321    321    326    Landroid/content/ActivityNotFoundException;
        //  323    326    326    331    Landroid/content/ActivityNotFoundException;
        //  328    331    331    336    Landroid/content/ActivityNotFoundException;
        //  333    336    336    341    Landroid/content/ActivityNotFoundException;
        //  338    341    341    346    Landroid/content/ActivityNotFoundException;
        //  343    346    346    351    Landroid/content/ActivityNotFoundException;
        //  348    351    351    356    Landroid/content/ActivityNotFoundException;
        //  389    437    456    461    Landroid/content/ActivityNotFoundException;
        //  441    453    461    466    Landroid/content/ActivityNotFoundException;
        //  458    461    461    466    Landroid/content/ActivityNotFoundException;
        //  544    552    554    570    Landroid/content/ActivityNotFoundException;
        //  570    575    646    651    Landroid/content/ActivityNotFoundException;
        //  580    585    651    656    Landroid/content/ActivityNotFoundException;
        //  590    595    656    661    Landroid/content/ActivityNotFoundException;
        //  605    611    669    674    Landroid/content/ActivityNotFoundException;
        //  615    644    669    674    Landroid/content/ActivityNotFoundException;
        //  648    651    651    656    Landroid/content/ActivityNotFoundException;
        //  653    656    656    661    Landroid/content/ActivityNotFoundException;
        //  739    745    773    778    Landroid/content/ActivityNotFoundException;
        //  750    758    778    783    Landroid/content/ActivityNotFoundException;
        //  762    770    778    783    Landroid/content/ActivityNotFoundException;
        //  775    778    778    783    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 351, Size: 351
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
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore          4
        //     5: aload_0        
        //     6: aload_1        
        //     7: aload_2        
        //     8: aload_3        
        //     9: invokespecial   android/support/v4/app/ListFragment.onCreateContextMenu:(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
        //    12: aload_3        
        //    13: checkcast       Landroid/widget/AdapterView$AdapterContextMenuInfo;
        //    16: getfield        android/widget/AdapterView$AdapterContextMenuInfo.targetView:Landroid/view/View;
        //    19: invokevirtual   android/view/View.getTag:()Ljava/lang/Object;
        //    22: checkcast       Lcom/whatsapp/ef;
        //    25: astore          5
        //    27: aload           5
        //    29: ifnonnull       47
        //    32: getstatic       com/whatsapp/ConversationsFragment.z:[Ljava/lang/String;
        //    35: bipush          23
        //    37: aaload         
        //    38: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    41: return         
        //    42: astore          61
        //    44: aload           61
        //    46: athrow         
        //    47: aload           5
        //    49: getfield        com/whatsapp/ef.c:Lcom/whatsapp/d7;
        //    52: instanceof      Lcom/whatsapp/al_;
        //    55: istore          7
        //    57: iload           7
        //    59: ifeq            41
        //    62: aload           5
        //    64: getfield        com/whatsapp/ef.c:Lcom/whatsapp/d7;
        //    67: checkcast       Lcom/whatsapp/al_;
        //    70: getfield        com/whatsapp/al_.a:Ljava/lang/String;
        //    73: astore          8
        //    75: aload_0        
        //    76: aload           8
        //    78: putfield        com/whatsapp/ConversationsFragment.m:Ljava/lang/String;
        //    81: getstatic       com/whatsapp/App.S:Lcom/whatsapp/wc;
        //    84: aload_0        
        //    85: getfield        com/whatsapp/ConversationsFragment.m:Ljava/lang/String;
        //    88: invokevirtual   com/whatsapp/wc.e:(Ljava/lang/String;)Lcom/whatsapp/a_9;
        //    91: astore          9
        //    93: getstatic       com/whatsapp/ConversationsFragment.z:[Ljava/lang/String;
        //    96: bipush          22
        //    98: aaload         
        //    99: aload           8
        //   101: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   104: ifeq            137
        //   107: aload_1        
        //   108: iconst_0       
        //   109: ldc_w           2131755021
        //   112: iconst_0       
        //   113: aload_0        
        //   114: ldc_w           2131231013
        //   117: invokevirtual   com/whatsapp/ConversationsFragment.getString:(I)Ljava/lang/String;
        //   120: invokeinterface android/view/ContextMenu.add:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
        //   125: pop            
        //   126: return         
        //   127: astore          10
        //   129: aload           10
        //   131: athrow         
        //   132: astore          6
        //   134: aload           6
        //   136: athrow         
        //   137: aload           9
        //   139: invokevirtual   com/whatsapp/a_9.o:()Z
        //   142: ifeq            170
        //   145: aload_1        
        //   146: iconst_0       
        //   147: ldc_w           2131755021
        //   150: iconst_0       
        //   151: aload_0        
        //   152: ldc_w           2131231019
        //   155: invokevirtual   com/whatsapp/ConversationsFragment.getString:(I)Ljava/lang/String;
        //   158: invokeinterface android/view/ContextMenu.add:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
        //   163: pop            
        //   164: return         
        //   165: astore          11
        //   167: aload           11
        //   169: athrow         
        //   170: aload           9
        //   172: getfield        com/whatsapp/a_9.e:Lcom/whatsapp/xg;
        //   175: astore          15
        //   177: aload           15
        //   179: ifnonnull       312
        //   182: aload           9
        //   184: invokevirtual   com/whatsapp/a_9.m:()Z
        //   187: istore          49
        //   189: iload           49
        //   191: ifeq            233
        //   194: aload           5
        //   196: getfield        com/whatsapp/ef.e:Landroid/view/View;
        //   199: invokevirtual   android/view/View.getVisibility:()I
        //   202: istore          56
        //   204: iload           56
        //   206: ifeq            41
        //   209: aload_1        
        //   210: iconst_0       
        //   211: ldc_w           2131755023
        //   214: iconst_0       
        //   215: aload_0        
        //   216: ldc_w           2131231204
        //   219: invokevirtual   com/whatsapp/ConversationsFragment.getString:(I)Ljava/lang/String;
        //   222: invokeinterface android/view/ContextMenu.add:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
        //   227: pop            
        //   228: iload           4
        //   230: ifeq            331
        //   233: aload           9
        //   235: invokevirtual   com/whatsapp/a_9.k:()Z
        //   238: istore          52
        //   240: iload           52
        //   242: ifeq            269
        //   245: aload_1        
        //   246: iconst_0       
        //   247: ldc_w           2131755023
        //   250: iconst_0       
        //   251: aload_0        
        //   252: ldc_w           2131231270
        //   255: invokevirtual   com/whatsapp/ConversationsFragment.getString:(I)Ljava/lang/String;
        //   258: invokeinterface android/view/ContextMenu.add:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
        //   263: pop            
        //   264: iload           4
        //   266: ifeq            331
        //   269: aload_1        
        //   270: iconst_0       
        //   271: ldc_w           2131755016
        //   274: iconst_0       
        //   275: aload_0        
        //   276: ldc_w           2131230790
        //   279: invokevirtual   com/whatsapp/ConversationsFragment.getString:(I)Ljava/lang/String;
        //   282: invokeinterface android/view/ContextMenu.add:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
        //   287: pop            
        //   288: aload_1        
        //   289: iconst_0       
        //   290: ldc_w           2131755017
        //   293: iconst_0       
        //   294: aload_0        
        //   295: ldc_w           2131230792
        //   298: invokevirtual   com/whatsapp/ConversationsFragment.getString:(I)Ljava/lang/String;
        //   301: invokeinterface android/view/ContextMenu.add:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
        //   306: pop            
        //   307: iload           4
        //   309: ifeq            331
        //   312: aload_1        
        //   313: iconst_0       
        //   314: ldc_w           2131755019
        //   317: iconst_0       
        //   318: aload_0        
        //   319: ldc_w           2131231908
        //   322: invokevirtual   com/whatsapp/ConversationsFragment.getString:(I)Ljava/lang/String;
        //   325: invokeinterface android/view/ContextMenu.add:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
        //   330: pop            
        //   331: aload           9
        //   333: invokevirtual   com/whatsapp/a_9.k:()Z
        //   336: istore          20
        //   338: iload           20
        //   340: ifne            368
        //   343: invokestatic    com/whatsapp/App.q:()Z
        //   346: ifne            368
        //   349: aload_1        
        //   350: iconst_0       
        //   351: ldc_w           2131755020
        //   354: iconst_0       
        //   355: aload_0        
        //   356: ldc_w           2131230797
        //   359: invokevirtual   com/whatsapp/ConversationsFragment.getString:(I)Ljava/lang/String;
        //   362: invokeinterface android/view/ContextMenu.add:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
        //   367: pop            
        //   368: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   371: aload           9
        //   373: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   376: invokevirtual   com/whatsapp/vy.n:(Ljava/lang/String;)Z
        //   379: istore          27
        //   381: iload           27
        //   383: ifeq            449
        //   386: aload           9
        //   388: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   391: invokestatic    com/whatsapp/a_9.f:(Ljava/lang/String;)Z
        //   394: istore          45
        //   396: iload           45
        //   398: ifeq            425
        //   401: aload_1        
        //   402: iconst_0       
        //   403: ldc_w           2131755024
        //   406: iconst_0       
        //   407: aload_0        
        //   408: ldc_w           2131231865
        //   411: invokevirtual   com/whatsapp/ConversationsFragment.getString:(I)Ljava/lang/String;
        //   414: invokeinterface android/view/ContextMenu.add:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
        //   419: pop            
        //   420: iload           4
        //   422: ifeq            507
        //   425: aload_1        
        //   426: iconst_0       
        //   427: ldc_w           2131755024
        //   430: iconst_0       
        //   431: aload_0        
        //   432: ldc_w           2131231866
        //   435: invokevirtual   com/whatsapp/ConversationsFragment.getString:(I)Ljava/lang/String;
        //   438: invokeinterface android/view/ContextMenu.add:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
        //   443: pop            
        //   444: iload           4
        //   446: ifeq            507
        //   449: aload           9
        //   451: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   454: invokestatic    com/whatsapp/a_9.f:(Ljava/lang/String;)Z
        //   457: istore          28
        //   459: iload           28
        //   461: ifeq            488
        //   464: aload_1        
        //   465: iconst_0       
        //   466: ldc_w           2131755018
        //   469: iconst_0       
        //   470: aload_0        
        //   471: ldc_w           2131230822
        //   474: invokevirtual   com/whatsapp/ConversationsFragment.getString:(I)Ljava/lang/String;
        //   477: invokeinterface android/view/ContextMenu.add:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
        //   482: pop            
        //   483: iload           4
        //   485: ifeq            507
        //   488: aload_1        
        //   489: iconst_0       
        //   490: ldc_w           2131755018
        //   493: iconst_0       
        //   494: aload_0        
        //   495: ldc_w           2131230823
        //   498: invokevirtual   com/whatsapp/ConversationsFragment.getString:(I)Ljava/lang/String;
        //   501: invokeinterface android/view/ContextMenu.add:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
        //   506: pop            
        //   507: aload           9
        //   509: invokevirtual   com/whatsapp/a_9.m:()Z
        //   512: istore          32
        //   514: iload           32
        //   516: ifeq            562
        //   519: aload           9
        //   521: getfield        com/whatsapp/a_9.u:Ljava/lang/String;
        //   524: invokestatic    com/whatsapp/adc.f:(Ljava/lang/String;)Z
        //   527: istore          40
        //   529: iload           40
        //   531: ifeq            740
        //   534: ldc_w           2131231103
        //   537: istore          41
        //   539: aload_1        
        //   540: iconst_0       
        //   541: ldc_w           2131755021
        //   544: iconst_0       
        //   545: aload_0        
        //   546: iload           41
        //   548: invokevirtual   com/whatsapp/ConversationsFragment.getString:(I)Ljava/lang/String;
        //   551: invokeinterface android/view/ContextMenu.add:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
        //   556: pop            
        //   557: iload           4
        //   559: ifeq            617
        //   562: aload           9
        //   564: invokevirtual   com/whatsapp/a_9.k:()Z
        //   567: istore          35
        //   569: iload           35
        //   571: ifeq            598
        //   574: aload_1        
        //   575: iconst_0       
        //   576: ldc_w           2131755021
        //   579: iconst_0       
        //   580: aload_0        
        //   581: ldc_w           2131231021
        //   584: invokevirtual   com/whatsapp/ConversationsFragment.getString:(I)Ljava/lang/String;
        //   587: invokeinterface android/view/ContextMenu.add:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
        //   592: pop            
        //   593: iload           4
        //   595: ifeq            617
        //   598: aload_1        
        //   599: iconst_0       
        //   600: ldc_w           2131755021
        //   603: iconst_0       
        //   604: aload_0        
        //   605: ldc_w           2131231014
        //   608: invokevirtual   com/whatsapp/ConversationsFragment.getString:(I)Ljava/lang/String;
        //   611: invokeinterface android/view/ContextMenu.add:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
        //   616: pop            
        //   617: getstatic       com/whatsapp/App.ak:Lcom/whatsapp/vy;
        //   620: aload_0        
        //   621: getfield        com/whatsapp/ConversationsFragment.m:Ljava/lang/String;
        //   624: invokevirtual   com/whatsapp/vy.C:(Ljava/lang/String;)Lcom/whatsapp/protocol/bi;
        //   627: ifnull          41
        //   630: aload_1        
        //   631: iconst_0       
        //   632: ldc_w           2131755022
        //   635: iconst_0       
        //   636: aload_0        
        //   637: ldc_w           2131231047
        //   640: invokevirtual   com/whatsapp/ConversationsFragment.getString:(I)Ljava/lang/String;
        //   643: invokeinterface android/view/ContextMenu.add:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
        //   648: pop            
        //   649: return         
        //   650: astore          37
        //   652: aload           37
        //   654: athrow         
        //   655: astore          12
        //   657: aload           12
        //   659: athrow         
        //   660: astore          13
        //   662: aload           13
        //   664: athrow         
        //   665: astore          14
        //   667: aload           14
        //   669: athrow         
        //   670: astore          57
        //   672: aload           57
        //   674: athrow         
        //   675: astore          50
        //   677: aload           50
        //   679: athrow         
        //   680: astore          51
        //   682: aload           51
        //   684: athrow         
        //   685: astore          16
        //   687: aload           16
        //   689: athrow         
        //   690: astore          18
        //   692: aload           18
        //   694: athrow         
        //   695: astore          19
        //   697: aload           19
        //   699: athrow         
        //   700: astore          21
        //   702: aload           21
        //   704: athrow         
        //   705: astore          22
        //   707: aload           22
        //   709: athrow         
        //   710: astore          23
        //   712: aload           23
        //   714: athrow         
        //   715: astore          24
        //   717: aload           24
        //   719: athrow         
        //   720: astore          25
        //   722: aload           25
        //   724: athrow         
        //   725: astore          26
        //   727: aload           26
        //   729: athrow         
        //   730: astore          30
        //   732: aload           30
        //   734: athrow         
        //   735: astore          31
        //   737: aload           31
        //   739: athrow         
        //   740: ldc_w           2131231019
        //   743: istore          41
        //   745: goto            539
        //   748: astore          42
        //   750: aload           42
        //   752: athrow         
        //   753: astore          33
        //   755: aload           33
        //   757: athrow         
        //   758: astore          34
        //   760: aload           34
        //   762: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  32     41     42     47     Landroid/content/ActivityNotFoundException;
        //  47     57     132    137    Landroid/content/ActivityNotFoundException;
        //  93     126    127    132    Landroid/content/ActivityNotFoundException;
        //  137    164    165    170    Landroid/content/ActivityNotFoundException;
        //  170    177    655    660    Landroid/content/ActivityNotFoundException;
        //  182    189    660    665    Landroid/content/ActivityNotFoundException;
        //  194    204    665    670    Landroid/content/ActivityNotFoundException;
        //  209    228    670    675    Landroid/content/ActivityNotFoundException;
        //  233    240    675    680    Landroid/content/ActivityNotFoundException;
        //  245    264    680    685    Landroid/content/ActivityNotFoundException;
        //  269    307    685    690    Landroid/content/ActivityNotFoundException;
        //  312    331    685    690    Landroid/content/ActivityNotFoundException;
        //  331    338    690    695    Landroid/content/ActivityNotFoundException;
        //  343    368    695    700    Landroid/content/ActivityNotFoundException;
        //  368    381    700    705    Landroid/content/ActivityNotFoundException;
        //  386    396    705    710    Landroid/content/ActivityNotFoundException;
        //  401    420    710    715    Landroid/content/ActivityNotFoundException;
        //  425    444    715    720    Landroid/content/ActivityNotFoundException;
        //  449    459    720    725    Landroid/content/ActivityNotFoundException;
        //  464    483    725    730    Landroid/content/ActivityNotFoundException;
        //  488    507    725    730    Landroid/content/ActivityNotFoundException;
        //  507    514    730    735    Landroid/content/ActivityNotFoundException;
        //  519    529    735    740    Landroid/content/ActivityNotFoundException;
        //  539    557    748    753    Landroid/content/ActivityNotFoundException;
        //  562    569    753    758    Landroid/content/ActivityNotFoundException;
        //  574    593    758    763    Landroid/content/ActivityNotFoundException;
        //  598    617    758    763    Landroid/content/ActivityNotFoundException;
        //  617    649    650    655    Landroid/content/ActivityNotFoundException;
        //  657    660    660    665    Landroid/content/ActivityNotFoundException;
        //  662    665    665    670    Landroid/content/ActivityNotFoundException;
        //  672    675    675    680    Landroid/content/ActivityNotFoundException;
        //  677    680    680    685    Landroid/content/ActivityNotFoundException;
        //  682    685    685    690    Landroid/content/ActivityNotFoundException;
        //  692    695    695    700    Landroid/content/ActivityNotFoundException;
        //  702    705    705    710    Landroid/content/ActivityNotFoundException;
        //  707    710    710    715    Landroid/content/ActivityNotFoundException;
        //  712    715    715    720    Landroid/content/ActivityNotFoundException;
        //  717    720    720    725    Landroid/content/ActivityNotFoundException;
        //  722    725    725    730    Landroid/content/ActivityNotFoundException;
        //  732    735    735    740    Landroid/content/ActivityNotFoundException;
        //  750    753    753    758    Landroid/content/ActivityNotFoundException;
        //  755    758    758    763    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 359, Size: 359
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
    public void onCreateOptionsMenu(final Menu menu, final MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
    }
    
    @Override
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        return HomeActivity.a(layoutInflater.inflate(2130903135, viewGroup, false), this);
    }
    
    @Override
    public void onDestroy() {
        Log.i(ConversationsFragment.z[35]);
        super.onDestroy();
        App.a((aws)this);
        App.b((_7)this);
        this.h.a();
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
        //          -31457240: 75
        //          -31457239: 52
        //          -31457238: 52
        //          -31457237: 54
        //          -31457236: 95
        //          -31457235: 52
        //          -31457234: 278
        //          default: 52
        //        }
        //    52: iconst_0       
        //    53: ireturn        
        //    54: aload_0        
        //    55: new             Landroid/content/Intent;
        //    58: dup            
        //    59: aload_0        
        //    60: invokevirtual   com/whatsapp/ConversationsFragment.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //    63: ldc_w           Lcom/whatsapp/ContactPicker;.class
        //    66: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //    69: iconst_1       
        //    70: invokevirtual   com/whatsapp/ConversationsFragment.startActivityForResult:(Landroid/content/Intent;I)V
        //    73: iconst_1       
        //    74: ireturn        
        //    75: aload_0        
        //    76: new             Landroid/content/Intent;
        //    79: dup            
        //    80: aload_0        
        //    81: invokevirtual   com/whatsapp/ConversationsFragment.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //    84: ldc_w           Lcom/whatsapp/ListMembersSelector;.class
        //    87: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //    90: invokevirtual   com/whatsapp/ConversationsFragment.startActivity:(Landroid/content/Intent;)V
        //    93: iconst_1       
        //    94: ireturn        
        //    95: invokestatic    com/whatsapp/z8.j:()Ljava/util/ArrayList;
        //    98: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   101: astore          9
        //   103: iconst_0       
        //   104: istore          10
        //   106: aload           9
        //   108: invokeinterface java/util/Iterator.hasNext:()Z
        //   113: ifeq            387
        //   116: aload           9
        //   118: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   123: checkcast       Ljava/lang/String;
        //   126: astore          16
        //   128: aload           16
        //   130: invokestatic    com/whatsapp/adc.b:(Ljava/lang/String;)Z
        //   133: istore          20
        //   135: iload           20
        //   137: ifeq            380
        //   140: aload           16
        //   142: invokestatic    com/whatsapp/App.au:()Ljava/lang/String;
        //   145: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   148: istore          21
        //   150: iload           21
        //   152: ifeq            380
        //   155: aload           16
        //   157: invokestatic    com/whatsapp/a_9.c:(Ljava/lang/String;)Z
        //   160: istore          22
        //   162: iload           22
        //   164: ifne            380
        //   167: iload           10
        //   169: iconst_1       
        //   170: iadd           
        //   171: istore          11
        //   173: iload_2        
        //   174: ifeq            373
        //   177: iload           11
        //   179: getstatic       com/whatsapp/ym.e:I
        //   182: if_icmplt       236
        //   185: iconst_1       
        //   186: anewarray       Ljava/lang/Object;
        //   189: astore          15
        //   191: aload           15
        //   193: iconst_0       
        //   194: getstatic       com/whatsapp/ym.e:I
        //   197: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   200: aastore        
        //   201: aload_0        
        //   202: aload_0        
        //   203: ldc_w           2131231173
        //   206: aload           15
        //   208: invokevirtual   com/whatsapp/ConversationsFragment.getString:(I[Ljava/lang/Object;)Ljava/lang/String;
        //   211: invokevirtual   com/whatsapp/ConversationsFragment.f:(Ljava/lang/String;)V
        //   214: iconst_1       
        //   215: ireturn        
        //   216: astore          17
        //   218: aload           17
        //   220: athrow         
        //   221: astore          18
        //   223: aload           18
        //   225: athrow         
        //   226: astore          19
        //   228: aload           19
        //   230: athrow         
        //   231: astore          12
        //   233: aload           12
        //   235: athrow         
        //   236: new             Landroid/content/Intent;
        //   239: dup            
        //   240: aload_0        
        //   241: invokevirtual   com/whatsapp/ConversationsFragment.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //   244: ldc_w           Lcom/whatsapp/NewGroup;.class
        //   247: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   250: astore          13
        //   252: aload           13
        //   254: getstatic       com/whatsapp/ConversationsFragment.z:[Ljava/lang/String;
        //   257: bipush          31
        //   259: aaload         
        //   260: getstatic       com/whatsapp/fieldstats/ak.MENU:Lcom/whatsapp/fieldstats/ak;
        //   263: invokevirtual   com/whatsapp/fieldstats/ak.getCode:()I
        //   266: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;I)Landroid/content/Intent;
        //   269: pop            
        //   270: aload_0        
        //   271: aload           13
        //   273: invokevirtual   com/whatsapp/ConversationsFragment.startActivity:(Landroid/content/Intent;)V
        //   276: iconst_1       
        //   277: ireturn        
        //   278: invokestatic    com/whatsapp/l7.p:()Z
        //   281: istore          7
        //   283: iload           7
        //   285: ifeq            310
        //   288: aload_0        
        //   289: new             Landroid/content/Intent;
        //   292: dup            
        //   293: aload_0        
        //   294: invokevirtual   com/whatsapp/ConversationsFragment.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //   297: ldc_w           Lcom/whatsapp/WebSessionsActivity;.class
        //   300: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   303: invokevirtual   com/whatsapp/ConversationsFragment.startActivity:(Landroid/content/Intent;)V
        //   306: iload_2        
        //   307: ifeq            353
        //   310: invokestatic    com/whatsapp/App.O:()Z
        //   313: istore          8
        //   315: iload           8
        //   317: ifeq            342
        //   320: aload_0        
        //   321: new             Landroid/content/Intent;
        //   324: dup            
        //   325: aload_0        
        //   326: invokevirtual   com/whatsapp/ConversationsFragment.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //   329: ldc_w           Lcom/whatsapp/qrcode/QrCodeActivity;.class
        //   332: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   335: invokevirtual   com/whatsapp/ConversationsFragment.startActivity:(Landroid/content/Intent;)V
        //   338: iload_2        
        //   339: ifeq            353
        //   342: aload_0        
        //   343: invokevirtual   com/whatsapp/ConversationsFragment.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //   346: ldc_w           2131231385
        //   349: iconst_0       
        //   350: invokestatic    com/whatsapp/App.a:(Landroid/content/Context;II)V
        //   353: iconst_1       
        //   354: ireturn        
        //   355: astore_3       
        //   356: aload_3        
        //   357: athrow         
        //   358: astore          4
        //   360: aload           4
        //   362: athrow         
        //   363: astore          5
        //   365: aload           5
        //   367: athrow         
        //   368: astore          6
        //   370: aload           6
        //   372: athrow         
        //   373: iload           11
        //   375: istore          10
        //   377: goto            106
        //   380: iload           10
        //   382: istore          11
        //   384: goto            173
        //   387: iload           10
        //   389: istore          11
        //   391: goto            177
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  128    135    216    221    Landroid/content/ActivityNotFoundException;
        //  140    150    221    226    Landroid/content/ActivityNotFoundException;
        //  155    162    226    231    Landroid/content/ActivityNotFoundException;
        //  177    214    231    236    Landroid/content/ActivityNotFoundException;
        //  218    221    221    226    Landroid/content/ActivityNotFoundException;
        //  223    226    226    231    Landroid/content/ActivityNotFoundException;
        //  278    283    355    358    Landroid/content/ActivityNotFoundException;
        //  288    306    358    363    Landroid/content/ActivityNotFoundException;
        //  310    315    363    368    Landroid/content/ActivityNotFoundException;
        //  320    338    368    373    Landroid/content/ActivityNotFoundException;
        //  342    353    368    373    Landroid/content/ActivityNotFoundException;
        //  356    358    358    363    Landroid/content/ActivityNotFoundException;
        //  360    363    363    368    Landroid/content/ActivityNotFoundException;
        //  365    368    368    373    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 169, Size: 169
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
    public void onPause() {
        Log.i(ConversationsFragment.z[0]);
        super.onPause();
        UndoBarController.b(this.getActivity());
    }
    
    @Override
    public void onResume() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore_1       
        //     4: getstatic       com/whatsapp/ConversationsFragment.z:[Ljava/lang/String;
        //     7: bipush          8
        //     9: aaload         
        //    10: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    13: aload_0        
        //    14: invokespecial   android/support/v4/app/ListFragment.onResume:()V
        //    17: invokestatic    com/whatsapp/notification/y.a:()V
        //    20: getstatic       com/whatsapp/App.a:Landroid/media/AsyncPlayer;
        //    23: invokevirtual   android/media/AsyncPlayer.stop:()V
        //    26: invokestatic    com/whatsapp/gdrive/GoogleDriveService.am:()Z
        //    29: istore          5
        //    31: iload           5
        //    33: ifeq            348
        //    36: aload_0        
        //    37: getfield        com/whatsapp/ConversationsFragment.e:Landroid/view/View;
        //    40: astore          6
        //    42: aload           6
        //    44: ifnonnull       305
        //    47: invokestatic    com/whatsapp/gdrive/GoogleDriveService.ac:()Z
        //    50: ifeq            348
        //    53: getstatic       com/whatsapp/ConversationsFragment.z:[Ljava/lang/String;
        //    56: bipush          9
        //    58: aaload         
        //    59: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //    62: aload_0        
        //    63: invokevirtual   com/whatsapp/ConversationsFragment.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //    66: new             Landroid/content/Intent;
        //    69: dup            
        //    70: aload_0        
        //    71: invokevirtual   com/whatsapp/ConversationsFragment.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //    74: ldc_w           Lcom/whatsapp/gdrive/GoogleDriveService;.class
        //    77: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //    80: aload_0        
        //    81: getfield        com/whatsapp/ConversationsFragment.p:Landroid/content/ServiceConnection;
        //    84: iconst_1       
        //    85: invokevirtual   android/support/v4/app/FragmentActivity.bindService:(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
        //    88: pop            
        //    89: aload_0        
        //    90: aload_0        
        //    91: invokevirtual   com/whatsapp/ConversationsFragment.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //    94: invokevirtual   android/support/v4/app/FragmentActivity.getLayoutInflater:()Landroid/view/LayoutInflater;
        //    97: ldc_w           2130903137
        //   100: aload_0        
        //   101: getfield        com/whatsapp/ConversationsFragment.k:Landroid/widget/ListView;
        //   104: iconst_0       
        //   105: invokestatic    com/whatsapp/alm.a:(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //   108: putfield        com/whatsapp/ConversationsFragment.e:Landroid/view/View;
        //   111: aload_0        
        //   112: getfield        com/whatsapp/ConversationsFragment.e:Landroid/view/View;
        //   115: astore          10
        //   117: aload           10
        //   119: ifnull          292
        //   122: aload_0        
        //   123: getfield        com/whatsapp/ConversationsFragment.k:Landroid/widget/ListView;
        //   126: aload_0        
        //   127: getfield        com/whatsapp/ConversationsFragment.e:Landroid/view/View;
        //   130: invokevirtual   android/widget/ListView.addHeaderView:(Landroid/view/View;)V
        //   133: aload_0        
        //   134: getfield        com/whatsapp/ConversationsFragment.k:Landroid/widget/ListView;
        //   137: iconst_1       
        //   138: invokevirtual   android/widget/ListView.setHeaderDividersEnabled:(Z)V
        //   141: aload_0        
        //   142: aload_0        
        //   143: getfield        com/whatsapp/ConversationsFragment.k:Landroid/widget/ListView;
        //   146: ldc_w           2131755509
        //   149: invokevirtual   android/widget/ListView.findViewById:(I)Landroid/view/View;
        //   152: checkcast       Landroid/widget/ImageView;
        //   155: putfield        com/whatsapp/ConversationsFragment.g:Landroid/widget/ImageView;
        //   158: aload_0        
        //   159: aload_0        
        //   160: getfield        com/whatsapp/ConversationsFragment.k:Landroid/widget/ListView;
        //   163: ldc_w           2131755191
        //   166: invokevirtual   android/widget/ListView.findViewById:(I)Landroid/view/View;
        //   169: checkcast       Landroid/widget/ProgressBar;
        //   172: putfield        com/whatsapp/ConversationsFragment.o:Landroid/widget/ProgressBar;
        //   175: aload_0        
        //   176: aload_0        
        //   177: getfield        com/whatsapp/ConversationsFragment.k:Landroid/widget/ListView;
        //   180: ldc_w           2131755510
        //   183: invokevirtual   android/widget/ListView.findViewById:(I)Landroid/view/View;
        //   186: checkcast       Landroid/widget/TextView;
        //   189: putfield        com/whatsapp/ConversationsFragment.d:Landroid/widget/TextView;
        //   192: aload_0        
        //   193: aload_0        
        //   194: getfield        com/whatsapp/ConversationsFragment.k:Landroid/widget/ListView;
        //   197: ldc_w           2131755511
        //   200: invokevirtual   android/widget/ListView.findViewById:(I)Landroid/view/View;
        //   203: checkcast       Landroid/widget/TextView;
        //   206: putfield        com/whatsapp/ConversationsFragment.t:Landroid/widget/TextView;
        //   209: new             Landroid/view/animation/RotateAnimation;
        //   212: dup            
        //   213: ldc_w           360.0
        //   216: fconst_0       
        //   217: iconst_1       
        //   218: ldc             0.5
        //   220: iconst_1       
        //   221: ldc             0.5
        //   223: invokespecial   android/view/animation/RotateAnimation.<init>:(FFIFIF)V
        //   226: astore          12
        //   228: aload           12
        //   230: ldc2_w          1000
        //   233: invokevirtual   android/view/animation/RotateAnimation.setDuration:(J)V
        //   236: aload           12
        //   238: iconst_m1      
        //   239: invokevirtual   android/view/animation/RotateAnimation.setRepeatCount:(I)V
        //   242: aload           12
        //   244: new             Landroid/view/animation/LinearInterpolator;
        //   247: dup            
        //   248: invokespecial   android/view/animation/LinearInterpolator.<init>:()V
        //   251: invokevirtual   android/view/animation/RotateAnimation.setInterpolator:(Landroid/view/animation/Interpolator;)V
        //   254: aload_0        
        //   255: getfield        com/whatsapp/ConversationsFragment.g:Landroid/widget/ImageView;
        //   258: aload           12
        //   260: invokevirtual   android/widget/ImageView.setAnimation:(Landroid/view/animation/Animation;)V
        //   263: aload_0        
        //   264: getfield        com/whatsapp/ConversationsFragment.g:Landroid/widget/ImageView;
        //   267: invokevirtual   android/widget/ImageView.getAnimation:()Landroid/view/animation/Animation;
        //   270: invokevirtual   android/view/animation/Animation.cancel:()V
        //   273: aload_0        
        //   274: getfield        com/whatsapp/ConversationsFragment.e:Landroid/view/View;
        //   277: new             Lcom/whatsapp/n5;
        //   280: dup            
        //   281: aload_0        
        //   282: invokespecial   com/whatsapp/n5.<init>:(Lcom/whatsapp/ConversationsFragment;)V
        //   285: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   288: iload_1        
        //   289: ifeq            348
        //   292: getstatic       com/whatsapp/ConversationsFragment.z:[Ljava/lang/String;
        //   295: bipush          7
        //   297: aaload         
        //   298: invokestatic    com/whatsapp/util/Log.e:(Ljava/lang/String;)V
        //   301: iload_1        
        //   302: ifeq            348
        //   305: invokestatic    com/whatsapp/gdrive/GoogleDriveService.ac:()Z
        //   308: ifne            348
        //   311: getstatic       com/whatsapp/ConversationsFragment.z:[Ljava/lang/String;
        //   314: bipush          10
        //   316: aaload         
        //   317: invokestatic    com/whatsapp/util/Log.i:(Ljava/lang/String;)V
        //   320: aload_0        
        //   321: getfield        com/whatsapp/ConversationsFragment.k:Landroid/widget/ListView;
        //   324: aload_0        
        //   325: getfield        com/whatsapp/ConversationsFragment.e:Landroid/view/View;
        //   328: invokevirtual   android/widget/ListView.removeHeaderView:(Landroid/view/View;)Z
        //   331: pop            
        //   332: aload_0        
        //   333: aconst_null    
        //   334: putfield        com/whatsapp/ConversationsFragment.e:Landroid/view/View;
        //   337: aload_0        
        //   338: invokevirtual   com/whatsapp/ConversationsFragment.getActivity:()Landroid/support/v4/app/FragmentActivity;
        //   341: aload_0        
        //   342: getfield        com/whatsapp/ConversationsFragment.p:Landroid/content/ServiceConnection;
        //   345: invokevirtual   android/support/v4/app/FragmentActivity.unbindService:(Landroid/content/ServiceConnection;)V
        //   348: return         
        //   349: astore_2       
        //   350: aload_2        
        //   351: athrow         
        //   352: astore_3       
        //   353: aload_3        
        //   354: athrow         
        //   355: astore          4
        //   357: aload           4
        //   359: athrow         
        //   360: astore          13
        //   362: aload           13
        //   364: athrow         
        //   365: astore          11
        //   367: aload           11
        //   369: athrow         
        //   370: astore          7
        //   372: aload           7
        //   374: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                       
        //  -----  -----  -----  -----  -------------------------------------------
        //  4      31     349    352    Landroid/content/ActivityNotFoundException;
        //  36     42     352    355    Landroid/content/ActivityNotFoundException;
        //  47     117    355    360    Landroid/content/ActivityNotFoundException;
        //  228    288    360    365    Landroid/content/ActivityNotFoundException;
        //  292    301    365    370    Landroid/content/ActivityNotFoundException;
        //  305    348    370    375    Landroid/content/ActivityNotFoundException;
        //  350    352    352    355    Landroid/content/ActivityNotFoundException;
        //  353    355    355    360    Landroid/content/ActivityNotFoundException;
        //  362    365    365    370    Landroid/content/ActivityNotFoundException;
        //  367    370    370    375    Landroid/content/ActivityNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 174, Size: 174
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
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString(ConversationsFragment.z[11], this.m);
    }
    
    @Override
    public void onStart() {
        super.onStart();
    }
    
    @Override
    public void onStop() {
        super.onStop();
    }
}
