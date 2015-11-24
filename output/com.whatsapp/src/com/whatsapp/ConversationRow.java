// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.app.Dialog;
import android.content.DialogInterface$OnClickListener;
import android.widget.ListAdapter;
import android.widget.ArrayAdapter;
import android.support.v7.app.AlertDialog$Builder;
import android.widget.RelativeLayout$LayoutParams;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
import com.whatsapp.util.aa;
import android.text.SpannableStringBuilder;
import java.util.HashMap;
import com.whatsapp.util.Log;
import com.whatsapp.util.cq;
import android.text.TextUtils;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.DecelerateInterpolator;
import com.whatsapp.protocol.b7;
import com.whatsapp.util.b6;
import java.util.Locale;
import com.whatsapp.preference.WaFontListPreference;
import android.content.res.Resources;
import android.graphics.Paint$Style;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View$OnLongClickListener;
import android.widget.ImageView;
import com.whatsapp.protocol.bi;
import android.view.View$OnClickListener;
import android.view.View;
import android.widget.TextView;
import android.graphics.Paint;

public abstract class ConversationRow extends BubbleRelativeLayout
{
    private static Paint C;
    private static float E;
    private static final String[] F;
    private static float w;
    private long A;
    boolean B;
    protected final TextView D;
    private int o;
    private View p;
    private boolean q;
    View$OnClickListener r;
    private TextView s;
    protected bi t;
    protected final ImageView u;
    protected View$OnLongClickListener v;
    final View x;
    private final Runnable y;
    private Drawable z;
    
    static {
        final String[] f = new String[8];
        String s = "cY";
        int n = -1;
        String[] array = f;
        int n2 = 0;
        String intern = null;
    Label_0232:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'o';
                        break;
                    }
                    case 0: {
                        c2 = 'C';
                        break;
                    }
                    case 1: {
                        c2 = 'y';
                        break;
                    }
                    case 2: {
                        c2 = 'v';
                        break;
                    }
                    case 3: {
                        c2 = '*';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = " \u0016\u0018\\\n1\n\u0017^\u0006,\u0017)X\u00004V\u001bC\u001c0\u0010\u0018M01\u0014\u0002u\u001c1\u001aL";
                    n2 = 1;
                    array = f;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0003\nX]\u0007\"\r\u0005K\u001f3W\u0018O\u001b";
                    n2 = 2;
                    array = f;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0003\nX]\u0007\"\r\u0005K\u001f3W\u0018O\u001b";
                    n2 = 3;
                    array = f;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = f;
                    s = "\"\u000b";
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    s = "%\u0018";
                    n = 4;
                    array = f;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = " \u0016\u0018\\\n1\n\u0017^\u0006,\u0017YM\n7\u001d\u001fK\u0003,\u001e\u001f^\n.\nYX\n.\u0016\u0002O01\u001c\u0005E\u001a1\u001a\u0013\n\u00060Y\u0018_\u0003/XV";
                    n = 5;
                    array = f;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "c\u001d\u0017^\u000e~";
                    n = 6;
                    array = f;
                    continue;
                }
                case 6: {
                    break Label_0232;
                }
            }
        }
        array[n2] = intern;
        F = f;
        ConversationRow.w = 0.0f;
        ConversationRow.E = 0.0f;
    }
    
    public ConversationRow(final Context context, final bi bi) {
        int gravity = 3;
        final boolean i = App.I;
        super(context, bi);
        this.B = false;
        this.q = false;
        this.z = new aa8(this);
        this.v = (View$OnLongClickListener)new lw(this);
        this.y = new _0(this);
        this.r = (View$OnClickListener)new a6g(this);
        final vc b = vc.b();
        int n = 0;
        Label_0103: {
            if (bi.a.b) {
                n = this.p();
                if (!i) {
                    break Label_0103;
                }
            }
            n = this.b();
        }
        this.i = adc.b(bi.a.a);
        alm.a(LayoutInflater.from(this.getContext()), n, (ViewGroup)this, true);
        Label_0371: {
            if (bi.c == 6 && bi.I != 8) {
                this.setGravity(17);
                this.setPadding(b.r, b.i + ConversationRow.n.top, b.r, b.i + ConversationRow.n.bottom);
                if (!i) {
                    break Label_0371;
                }
            }
            Label_0344: {
                if (bi.a.b) {
                    int gravity2;
                    if (App.ak()) {
                        gravity2 = 5;
                    }
                    else {
                        gravity2 = gravity;
                    }
                    this.setGravity(gravity2);
                    alm.a((View)this, b.r + ConversationRow.k.right, b.i + ConversationRow.k.top, b.r + ConversationRow.k.right, b.i + ConversationRow.k.bottom);
                    if (!i) {
                        break Label_0344;
                    }
                }
                if (!App.ak()) {
                    gravity = 5;
                }
                this.setGravity(gravity);
                alm.a((View)this, b.r + ConversationRow.k.left, b.i + ConversationRow.n.top, b.r + ConversationRow.k.left, b.i + ConversationRow.n.bottom);
            }
            this.setBackgroundDrawable(this.z);
            this.setMinimumHeight((int)this.getResources().getDimension(2131361898));
            this.setLongClickable(true);
        }
        this.D = (TextView)this.findViewById(2131755472);
        this.u = (ImageView)this.findViewById(2131755296);
        this.x = this.findViewById(2131755464);
        if (App.W) {
            final TextView textView = (TextView)this.findViewById(2131755466);
            if (textView != null) {
                textView.setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(0, -2, 1.0f));
            }
        }
        this.a(bi);
        this.setOnLongClickListener(this.v);
        if (ConversationRow.C == null) {
            (ConversationRow.C = new Paint()).setColor(1295234533);
            ConversationRow.C.setStyle(Paint$Style.FILL);
            ConversationRow.C.setAntiAlias(true);
        }
        if (this.i() != null) {
            this.l();
            this.p.setSelected(this.i().containsKey(bi.a));
            if (!i) {
                return;
            }
        }
        this.e();
    }
    
    static float a(final Resources resources) {
        if (ConversationRow.w == 0.0f) {
            ConversationRow.w = resources.getDimension(2131361888) / resources.getDisplayMetrics().scaledDensity;
        }
        final int b = WaFontListPreference.b;
        int n = 0;
        if (b == -1) {
            n = -2;
            if (!App.I) {
                return ConversationRow.w + n;
            }
        }
        if (WaFontListPreference.b == 1) {
            n = 4;
        }
        return ConversationRow.w + n;
    }
    
    public static float a(final Resources resources, final int n) {
        if (ConversationRow.E == 0.0f) {
            ConversationRow.E = resources.getDimension(2131361902) / resources.getDisplayMetrics().scaledDensity;
        }
        int n2 = 0;
        Label_0051: {
            if (n == -1) {
                n2 = -2;
                if (!App.I) {
                    break Label_0051;
                }
            }
            if (n == 1) {
                n2 = 4;
            }
        }
        if (Locale.getDefault().getLanguage().equals(ConversationRow.F[4]) || Locale.getDefault().getLanguage().equals(ConversationRow.F[5])) {
            ++n2;
        }
        return ConversationRow.E + n2;
    }
    
    static View a(final ConversationRow conversationRow) {
        return conversationRow.p;
    }
    
    private void a(final bi bi) {
        final boolean i = App.I;
        boolean b;
        if (bi != this.t) {
            b = true;
        }
        else {
            b = false;
        }
        this.t = bi;
        this.setTag((Object)(super.m = bi));
        Label_0139: {
            if (this.D != null) {
                if (!this.q || bi.u != this.A) {
                    this.D.setText((CharSequence)b6.h(this.getContext(), App.i(bi)));
                    this.A = bi.u;
                }
                if (bi.x && bi.a.b && !a_9.h(bi.a.a)) {
                    this.D.setCompoundDrawablesWithIntrinsicBounds(2130837624, 0, 0, 0);
                    if (!i) {
                        break Label_0139;
                    }
                }
                this.D.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            }
        }
        if (this.u != null && bi.a.b && (!this.q || bi.c != this.o || b)) {
            Label_0263: {
                if (!b && b7.a(bi.c, 13) >= 0) {
                    final xw xw = new xw(this.u, this.b(bi.c));
                    xw.setDuration(400L);
                    xw.setInterpolator((Interpolator)new DecelerateInterpolator());
                    this.u.startAnimation((Animation)xw);
                    if (!i) {
                        break Label_0263;
                    }
                }
                this.u.setImageResource(this.b(bi.c));
            }
            this.o = bi.c;
        }
        if (!bi.a.b && adc.b(bi.a.a)) {
            Label_0529: {
                if (bi.t != null) {
                    final TextView textView = (TextView)this.findViewById(2131755465);
                    final adc ab = App.ab;
                    final wh c = adc.c(bi.a.a, bi.t);
                    Label_0360: {
                        if (c != null) {
                            textView.setTextColor(c.d);
                            if (!i) {
                                break Label_0360;
                            }
                        }
                        textView.setTextColor(-1728053248);
                    }
                    textView.setTextSize(24.0f * b(this.getResources()) / 27.0f);
                    vc.b(textView);
                    final a_9 e = App.S.e(bi.t);
                    textView.setText((CharSequence)e.a(this.getContext()));
                    final TextView textView2 = (TextView)this.findViewById(2131755466);
                    Label_0497: {
                        if (TextUtils.isEmpty((CharSequence)e.t) && !TextUtils.isEmpty((CharSequence)e.o)) {
                            textView2.setText(cq.b("~" + e.o, this.getContext()));
                            textView2.setVisibility(0);
                            if (!i) {
                                break Label_0497;
                            }
                        }
                        textView2.setVisibility(8);
                    }
                    if (!i) {
                        break Label_0529;
                    }
                }
                Log.e(ConversationRow.F[1] + Log.a(bi));
            }
            if (this.h < 2) {
                this.x.setVisibility(0);
            }
            this.x.setOnClickListener(this.r);
            this.x.setBackgroundResource(2130839068);
        }
        this.q = true;
    }
    
    public static float b(final Resources resources) {
        return a(resources, WaFontListPreference.b);
    }
    
    static HashMap b(final ConversationRow conversationRow) {
        return conversationRow.i();
    }
    
    public static boolean b(final bi bi) {
        final boolean i = App.I;
        if (!bi.a.b || i) {
            final a_9 a = z8.a(bi.a.a);
            if (a.m()) {
                if (bi.t != null) {
                    final a_9 e = App.S.e(bi.t);
                    final a_9 e2 = App.S.e(a.i());
                    String string;
                    if (App.aX != null) {
                        string = App.aX.jabber_id + ConversationRow.F[2];
                    }
                    else {
                        string = "";
                    }
                    final boolean b = adc.g(a.u) || (e2 != null && (e2.e != null || string.equals(e2.u))) || (e != null && e.e != null);
                    if (!i) {
                        return b;
                    }
                }
                final boolean b2 = false;
                if (!i) {
                    return b2;
                }
            }
            final boolean b = a.e != null;
            if (b || bi.a.a == null) {
                return b;
            }
            final int index = bi.a.a.indexOf(ConversationRow.F[3]);
            boolean b3 = true;
            int j = 0;
            while (j < index) {
                if (Character.isDigit(bi.a.a.charAt(j))) {
                    if (!i) {
                        b3 = false;
                        break;
                    }
                    b3 = false;
                }
                ++j;
                if (i) {
                    break;
                }
            }
            return b3;
        }
        return true;
    }
    
    static Paint g() {
        return ConversationRow.C;
    }
    
    private HashMap i() {
        final Conversation f = this.f();
        if (f != null) {
            return f.aw;
        }
        return null;
    }
    
    public SpannableStringBuilder a(final String s, final SpannableStringBuilder spannableStringBuilder) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            final Conversation f = this.f();
            if (f != null) {
                final ArrayList x = f.x();
                if (x != null && !x.isEmpty()) {
                    final CharSequence a = aa.a(this.getContext(), spannableStringBuilder, s, x, aa.b);
                    SpannableStringBuilder spannableStringBuilder2;
                    if (a instanceof SpannableStringBuilder) {
                        spannableStringBuilder2 = (SpannableStringBuilder)a;
                    }
                    else {
                        spannableStringBuilder2 = spannableStringBuilder;
                    }
                    return spannableStringBuilder2;
                }
            }
        }
        return spannableStringBuilder;
    }
    
    public CharSequence a(final CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            SpannableStringBuilder spannableStringBuilder;
            if (charSequence instanceof SpannableStringBuilder) {
                spannableStringBuilder = (SpannableStringBuilder)charSequence;
            }
            else {
                spannableStringBuilder = null;
            }
            final SpannableStringBuilder a = this.a(charSequence.toString(), spannableStringBuilder);
            if (a != null) {
                return (CharSequence)a;
            }
        }
        return charSequence;
    }
    
    public final void a() {
        final Handler handler = this.getHandler();
        if (handler == null) {
            this.removeCallbacks(this.y);
            this.post(this.y);
            if (!App.I) {
                return;
            }
        }
        if (!handler.hasMessages(0, (Object)this.y)) {
            final Message obtain = Message.obtain(handler, this.y);
            obtain.what = 0;
            obtain.obj = this.y;
            obtain.sendToTarget();
        }
    }
    
    public void a(final int h) {
        final boolean i = App.I;
        this.h = h;
        Label_0062: {
            if (this.x != null) {
                if (h <= 1 && !this.m.a.b && this.i) {
                    this.x.setVisibility(0);
                    if (!i) {
                        break Label_0062;
                    }
                }
                this.x.setVisibility(8);
            }
        }
        int n;
        if (this.m.a.b) {
            n = ConversationRow.k.top;
        }
        else {
            n = ConversationRow.n.top;
        }
        int n2;
        if (this.m.a.b) {
            n2 = ConversationRow.k.bottom;
        }
        else {
            n2 = ConversationRow.n.bottom;
        }
        int n3;
        if (this.m.a.b) {
            n3 = ConversationRow.k.right;
        }
        else {
            n3 = ConversationRow.n.left;
        }
        final vc b = vc.b();
        Label_0342: {
            switch (this.h) {
                case 1: {
                    alm.a((View)this, n3 + b.r, n + b.i, n3 + b.r, b.k);
                    this.setMinimumHeight((int)this.getResources().getDimension(2131361899));
                    if (i) {
                        break Label_0342;
                    }
                    return;
                }
                case 2: {
                    alm.a((View)this, n3 + b.r, b.k, n3 + b.r, b.k);
                    this.setMinimumHeight((int)this.getResources().getDimension(2131361899));
                    if (i) {
                        break Label_0342;
                    }
                    return;
                }
                case 3: {
                    alm.a((View)this, n3 + b.r, b.k, n3 + b.r, n2 + b.i);
                    this.setMinimumHeight((int)this.getResources().getDimension(2131361899));
                    if (i) {
                        break;
                    }
                    return;
                }
            }
        }
        alm.a((View)this, n3 + b.r, n + b.i, n3 + b.r, n2 + b.i);
        this.setMinimumHeight((int)this.getResources().getDimension(2131361898));
    }
    
    public void a(final bi bi, final boolean b) {
        if (this.t != bi || b) {
            this.a(bi);
        }
        if (this.i() != null) {
            this.l();
            this.p.setSelected(this.i().containsKey(this.t.a));
            if (!App.I) {
                return;
            }
        }
        this.e();
    }
    
    public void a(final String s) {
    }
    
    public void a(final boolean b) {
        if (b) {
            (this.s = (TextView)this.findViewById(2131755463)).setText((CharSequence)b6.f(this.getContext(), this.t.u));
            this.s.setTextSize(a(this.getResources()));
            this.s.setVisibility(0);
            this.B = true;
            if (!App.I) {
                return;
            }
        }
        this.findViewById(2131755463).setVisibility(8);
        this.B = false;
    }
    
    protected abstract int b();
    
    protected int b(final int n) {
        final boolean i = App.I;
        int n2 = 0;
        Label_0057: {
            if (b7.a(n, 13) >= 0) {
                n2 = 2130838919;
                if (!i) {
                    break Label_0057;
                }
            }
            if (b7.a(n, 5) >= 0) {
                n2 = 2130838923;
                if (!i) {
                    break Label_0057;
                }
            }
            if (b7.a(n, 4) == 0) {
                n2 = 2130838921;
                if (!i) {
                    break Label_0057;
                }
            }
            n2 = 2130838925;
        }
        if (App.aV == 3 && n == 7) {
            n2 = 2130838925;
        }
        return n2;
    }
    
    public int c() {
        if (this.x != null) {
            return this.x.getMeasuredHeight();
        }
        return 0;
    }
    
    public void d() {
        this.a(this.t);
    }
    
    void e() {
        if (this.p != null) {
            this.p.setVisibility(8);
        }
    }
    
    protected Conversation f() {
        if (this.getContext() instanceof Conversation) {
            return (Conversation)this.getContext();
        }
        return null;
    }
    
    public int h() {
        if (this.s == null) {
            this.s = (TextView)this.findViewById(2131755463);
        }
        return Math.round(this.getResources().getDimension(2131361886)) + this.s.getMeasuredHeight();
    }
    
    protected void j() {
    }
    
    protected void k() {
        final Conversation f = this.f();
        if (f != null) {
            (f.aw = new HashMap()).put(this.m.a, this.m);
            f.i();
            f.F();
        }
    }
    
    void l() {
        if (this.p != null) {
            this.p.setVisibility(0);
            return;
        }
        (this.p = new ConversationRow$3(this, this.getContext())).setClickable(true);
        this.p.setOnClickListener((View$OnClickListener)new add(this));
        this.setClipToPadding(false);
        this.addView(this.p, (ViewGroup$LayoutParams)new RelativeLayout$LayoutParams(-1, -1));
    }
    
    bi m() {
        return (bi)this.getTag();
    }
    
    public void n() {
        this.l = true;
        this.setOnLongClickListener((View$OnLongClickListener)null);
        this.D.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    }
    
    protected void o() {
        if (this.getContext() instanceof Conversation) {
            final Conversation conversation = (Conversation)this.getContext();
            final ArrayList<wz> list = new ArrayList<wz>();
            Label_0354: {
                if (adc.b(this.t.a.a) && (!this.t.a.b || (this.t.a.b && this.t.c == 6))) {
                    if (this.t.t != null) {
                        final a_9 e = App.S.e(this.t.t);
                        if (e.e == null) {
                            list.add(new wz(this.getResources().getString(2131230790), 7));
                            list.add(new wz(this.getResources().getString(2131230792), 8));
                        }
                        list.add(new wz(this.getResources().getString(2131231318, new Object[] { e.l() }), 14));
                        list.add(new wz(this.getResources().getString(2131230860, new Object[] { e.l() }), 16));
                        if (!App.I) {
                            break Label_0354;
                        }
                    }
                    final StringBuilder append = new StringBuilder().append(ConversationRow.F[6]).append(Log.a(this.t));
                    String string;
                    if (App.aV >= 1 && this.t.n == 0) {
                        string = ConversationRow.F[7] + this.t.c();
                    }
                    else {
                        string = "";
                    }
                    Log.e(append.append(string).toString());
                }
            }
            if (!list.isEmpty()) {
                final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.getContext());
                alertDialog$Builder.setAdapter((ListAdapter)new ArrayAdapter(this.getContext(), 17367057, (List)list), (DialogInterface$OnClickListener)new dh(this, conversation, list, App.S.e(this.t.t), this.m()));
                conversation.a(alertDialog$Builder.create());
            }
        }
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (this.p != null) {
            this.p.layout(0, 0, this.getWidth(), this.getHeight());
        }
    }
    
    protected abstract int p();
    
    public void setMessageText(final String p0, final TextEmojiLabel p1, final int p2, final bi p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     0: getstatic       com/whatsapp/App.I:Z
        //     3: istore          5
        //     5: aload_2        
        //     6: aload_1        
        //     7: invokestatic    com/whatsapp/alm.a:(Landroid/widget/TextView;Ljava/lang/CharSequence;)V
        //    10: aload_2        
        //    11: aload_2        
        //    12: invokevirtual   com/whatsapp/TextEmojiLabel.getResources:()Landroid/content/res/Resources;
        //    15: invokestatic    com/whatsapp/ConversationRow.b:(Landroid/content/res/Resources;)F
        //    18: invokevirtual   com/whatsapp/TextEmojiLabel.setTextSize:(F)V
        //    21: aload_1        
        //    22: aload_2        
        //    23: invokevirtual   com/whatsapp/TextEmojiLabel.getContext:()Landroid/content/Context;
        //    26: aload_2        
        //    27: invokevirtual   com/whatsapp/TextEmojiLabel.getPaint:()Landroid/text/TextPaint;
        //    30: ldc_w           1.4
        //    33: invokestatic    com/whatsapp/util/cq.a:(Ljava/lang/String;Landroid/content/Context;Landroid/graphics/Paint;F)Landroid/text/SpannableStringBuilder;
        //    36: astore          6
        //    38: aload           6
        //    40: ifnonnull       425
        //    43: new             Landroid/text/SpannableStringBuilder;
        //    46: dup            
        //    47: aload_1        
        //    48: invokespecial   android/text/SpannableStringBuilder.<init>:(Ljava/lang/CharSequence;)V
        //    51: astore          7
        //    53: iload_3        
        //    54: ifeq            124
        //    57: aload           7
        //    59: getstatic       com/whatsapp/ConversationRow.F:[Ljava/lang/String;
        //    62: iconst_0       
        //    63: aaload         
        //    64: invokevirtual   android/text/SpannableStringBuilder.append:(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;
        //    67: pop            
        //    68: aload           7
        //    70: new             Lcom/whatsapp/a8l;
        //    73: dup            
        //    74: aload_0        
        //    75: iload_3        
        //    76: aload_2        
        //    77: invokevirtual   com/whatsapp/TextEmojiLabel.getPaint:()Landroid/text/TextPaint;
        //    80: ldc_w           " "
        //    83: invokevirtual   android/text/TextPaint.measureText:(Ljava/lang/String;)F
        //    86: f2i            
        //    87: isub           
        //    88: aload_2        
        //    89: invokevirtual   com/whatsapp/TextEmojiLabel.getTextSize:()F
        //    92: aload_2        
        //    93: invokevirtual   com/whatsapp/TextEmojiLabel.getResources:()Landroid/content/res/Resources;
        //    96: invokevirtual   android/content/res/Resources.getDisplayMetrics:()Landroid/util/DisplayMetrics;
        //    99: getfield        android/util/DisplayMetrics.scaledDensity:F
        //   102: fsub           
        //   103: f2i            
        //   104: invokespecial   com/whatsapp/a8l.<init>:(Lcom/whatsapp/ConversationRow;II)V
        //   107: iconst_m1      
        //   108: aload           7
        //   110: invokevirtual   android/text/SpannableStringBuilder.length:()I
        //   113: iadd           
        //   114: aload           7
        //   116: invokevirtual   android/text/SpannableStringBuilder.length:()I
        //   119: bipush          33
        //   121: invokevirtual   android/text/SpannableStringBuilder.setSpan:(Ljava/lang/Object;III)V
        //   124: aload           7
        //   126: bipush          15
        //   128: invokestatic    android/text/util/Linkify.addLinks:(Landroid/text/Spannable;I)Z
        //   131: pop            
        //   132: aload           7
        //   134: iconst_0       
        //   135: aload           7
        //   137: invokevirtual   android/text/SpannableStringBuilder.length:()I
        //   140: ldc_w           Landroid/text/style/URLSpan;.class
        //   143: invokevirtual   android/text/SpannableStringBuilder.getSpans:(IILjava/lang/Class;)[Ljava/lang/Object;
        //   146: checkcast       [Landroid/text/style/URLSpan;
        //   149: astore          9
        //   151: aload           9
        //   153: ifnull          358
        //   156: aload           9
        //   158: arraylength    
        //   159: ifle            358
        //   162: aload           4
        //   164: invokestatic    com/whatsapp/ConversationRow.b:(Lcom/whatsapp/protocol/bi;)Z
        //   167: istore          11
        //   169: iload           11
        //   171: ifeq            325
        //   174: aload           9
        //   176: arraylength    
        //   177: istore          14
        //   179: iconst_0       
        //   180: istore          15
        //   182: iload           15
        //   184: iload           14
        //   186: if_icmpge       325
        //   189: aload           9
        //   191: iload           15
        //   193: aaload         
        //   194: astore          16
        //   196: aload           7
        //   198: aload           16
        //   200: invokevirtual   android/text/SpannableStringBuilder.getSpanEnd:(Ljava/lang/Object;)I
        //   203: istore          17
        //   205: aload           7
        //   207: invokevirtual   android/text/SpannableStringBuilder.length:()I
        //   210: istore          20
        //   212: iload           20
        //   214: iload           17
        //   216: if_icmple       418
        //   219: aload           7
        //   221: iload           17
        //   223: invokevirtual   android/text/SpannableStringBuilder.charAt:(I)C
        //   226: istore          28
        //   228: iload           28
        //   230: bipush          47
        //   232: if_icmpne       418
        //   235: iload           17
        //   237: iconst_1       
        //   238: iadd           
        //   239: istore          21
        //   241: aload_2        
        //   242: invokevirtual   com/whatsapp/TextEmojiLabel.getContext:()Landroid/content/Context;
        //   245: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //   248: astore          23
        //   250: aload           4
        //   252: getfield        com/whatsapp/protocol/bi.a:Lcom/whatsapp/protocol/c6;
        //   255: getfield        com/whatsapp/protocol/c6.b:Z
        //   258: istore          24
        //   260: iload           24
        //   262: ifeq            398
        //   265: ldc_w           2131624008
        //   268: istore          25
        //   270: aload           23
        //   272: iload           25
        //   274: invokevirtual   android/content/res/Resources.getColor:(I)I
        //   277: istore          26
        //   279: aload           7
        //   281: new             Lcom/whatsapp/iw;
        //   284: dup            
        //   285: aload           16
        //   287: invokevirtual   android/text/style/URLSpan.getURL:()Ljava/lang/String;
        //   290: iload           26
        //   292: invokespecial   com/whatsapp/iw.<init>:(Ljava/lang/String;I)V
        //   295: aload           7
        //   297: aload           16
        //   299: invokevirtual   android/text/SpannableStringBuilder.getSpanStart:(Ljava/lang/Object;)I
        //   302: iload           21
        //   304: aload           7
        //   306: aload           16
        //   308: invokevirtual   android/text/SpannableStringBuilder.getSpanFlags:(Ljava/lang/Object;)I
        //   311: invokevirtual   android/text/SpannableStringBuilder.setSpan:(Ljava/lang/Object;III)V
        //   314: iload           15
        //   316: iconst_1       
        //   317: iadd           
        //   318: istore          27
        //   320: iload           5
        //   322: ifeq            411
        //   325: aload           9
        //   327: arraylength    
        //   328: istore          12
        //   330: iconst_0       
        //   331: istore          13
        //   333: iload           13
        //   335: iload           12
        //   337: if_icmpge       358
        //   340: aload           7
        //   342: aload           9
        //   344: iload           13
        //   346: aaload         
        //   347: invokevirtual   android/text/SpannableStringBuilder.removeSpan:(Ljava/lang/Object;)V
        //   350: iinc            13, 1
        //   353: iload           5
        //   355: ifeq            333
        //   358: aload_2        
        //   359: aload_0        
        //   360: aload_1        
        //   361: aload           7
        //   363: invokevirtual   com/whatsapp/ConversationRow.a:(Ljava/lang/String;Landroid/text/SpannableStringBuilder;)Landroid/text/SpannableStringBuilder;
        //   366: getstatic       android/widget/TextView$BufferType.SPANNABLE:Landroid/widget/TextView$BufferType;
        //   369: invokevirtual   com/whatsapp/TextEmojiLabel.setText:(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V
        //   372: return         
        //   373: astore          30
        //   375: aload           30
        //   377: athrow         
        //   378: astore          10
        //   380: aload           10
        //   382: athrow         
        //   383: astore          18
        //   385: aload           18
        //   387: athrow         
        //   388: astore          19
        //   390: aload           19
        //   392: athrow         
        //   393: astore          22
        //   395: aload           22
        //   397: athrow         
        //   398: ldc_w           2131624007
        //   401: istore          25
        //   403: goto            270
        //   406: astore          8
        //   408: goto            132
        //   411: iload           27
        //   413: istore          15
        //   415: goto            182
        //   418: iload           17
        //   420: istore          21
        //   422: goto            241
        //   425: aload           6
        //   427: astore          7
        //   429: goto            53
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  57     124    373    378    Ljava/lang/Exception;
        //  124    132    406    411    Ljava/lang/Exception;
        //  156    169    378    383    Ljava/lang/Exception;
        //  205    212    383    388    Ljava/lang/Exception;
        //  219    228    388    393    Ljava/lang/Exception;
        //  241    260    393    398    Ljava/lang/Exception;
        //  385    388    388    393    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 206, Size: 206
        //     at java.util.ArrayList.rangeCheck(ArrayList.java:653)
        //     at java.util.ArrayList.get(ArrayList.java:429)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3303)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3417)
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
