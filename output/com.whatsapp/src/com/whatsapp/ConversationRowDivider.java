// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.text.SpannableStringBuilder;
import android.graphics.Paint;
import com.whatsapp.util.cq;
import java.util.Vector;
import com.whatsapp.util.Log;
import android.text.TextUtils;
import com.whatsapp.protocol.bi;
import android.content.Context;
import android.view.View$OnClickListener;

public class ConversationRowDivider extends ConversationRow
{
    private static final String[] H;
    View$OnClickListener F;
    private final DividerView G;
    
    static {
        final String[] h = new String[4];
        String s = "\u0001f\b`0\u0000}!{;\u0012 \f{i";
        int n = -1;
        String[] array = h;
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
                        c2 = 'T';
                        break;
                    }
                    case 0: {
                        c2 = 'e';
                        break;
                    }
                    case 1: {
                        c2 = '\u000f';
                        break;
                    }
                    case 2: {
                        c2 = '~';
                        break;
                    }
                    case 3: {
                        c2 = '\t';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "%|P~<\u0004{\rh$\u0015!\u0010l ";
                    n2 = 1;
                    array = h;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "E|C";
                    n2 = 2;
                    array = h;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = h;
                    s = "Ee\u0017mi";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        H = h;
    }
    
    ConversationRowDivider(final Context context, final bi bi) {
        super(context, bi);
        this.F = (View$OnClickListener)new g(this);
        this.setClickable(false);
        this.setLongClickable(false);
        this.G = (DividerView)this.findViewById(2131755394);
        this.b(bi);
    }
    
    public static String a(final bi bi) {
        String q;
        a_9 a_9;
        if (!TextUtils.isEmpty((CharSequence)bi.t)) {
            final a_9 e = App.S.e(bi.t);
            q = e.q();
            a_9 = e;
        }
        else {
            a_9 = null;
            q = null;
        }
        switch ((int)bi.L) {
            default: {
                return null;
            }
            case 1: {
                final String c = bi.c();
                String[] split = null;
                if (c != null) {
                    split = bi.c().split("\n");
                }
                if (split != null && split.length == 2 && (bi.t == null || (split[0].endsWith(ConversationRowDivider.H[1]) && split[1].lastIndexOf("\"") > split[1].indexOf("\"")))) {
                    final String q2 = App.S.e(split[0]).q();
                    final int index = split[1].indexOf("\"");
                    final int lastIndex = split[1].lastIndexOf("\"");
                    if (lastIndex <= index) {
                        Log.e(ConversationRowDivider.H[0] + bi.t + ConversationRowDivider.H[3] + split[0] + ConversationRowDivider.H[2] + split[1]);
                    }
                    return App.aq.getString(2131231225, new Object[] { q2, split[1].substring(index + 1, lastIndex) });
                }
                if (!App.S.f(bi.t)) {
                    return App.aq.getString(2131231225, new Object[] { q, bi.c() });
                }
                final int index2 = bi.c().indexOf("\"");
                final int lastIndex2 = bi.c().lastIndexOf("\"");
                if (index2 == 0 && lastIndex2 == -1 + bi.c().length() && index2 != lastIndex2) {
                    return App.aq.getString(2131231226, new Object[] { bi.c().substring(index2 + 1, lastIndex2) });
                }
                return App.aq.getString(2131231226, new Object[] { bi.c() });
            }
            case 11: {
                if (!App.S.f(bi.t)) {
                    return App.aq.getString(2131231169, new Object[] { q, bi.c() });
                }
                return App.aq.getString(2131231170, new Object[] { bi.c() });
            }
            case 6: {
                if (bi.t == null) {
                    return "";
                }
                if (App.S.f(bi.t)) {
                    if (bi.c() == null) {
                        return App.aq.getString(2131231471);
                    }
                    return App.aq.getString(2131231463);
                }
                else {
                    final String q3 = App.S.e(bi.t).q();
                    if (bi.c() == null) {
                        return App.aq.getString(2131231469, new Object[] { q3 });
                    }
                    return App.aq.getString(2131231461, new Object[] { q3 });
                }
                break;
            }
            case 4: {
                if (com.whatsapp.a_9.f(bi.a.a)) {
                    return App.aq.getString(2131231271, new Object[] { q });
                }
                if (App.S.f(bi.t)) {
                    return App.aq.getString(2131231209);
                }
                return App.aq.getString(2131231208, new Object[] { q });
            }
            case 5: {
                if (App.S.f(bi.t)) {
                    return App.aq.getString(2131231214);
                }
                return App.aq.getString(2131231213, new Object[] { q });
            }
            case 7: {
                if (com.whatsapp.a_9.f(bi.a.a)) {
                    return App.aq.getString(2131231272, new Object[] { q });
                }
                if (App.S.f(bi.t)) {
                    return App.aq.getString(2131231217);
                }
                return App.aq.getString(2131231216, new Object[] { q });
            }
            case 12: {
                final Vector vector = (Vector)bi.N;
                if (App.S.f(bi.t)) {
                    return App.aq.getString(2131231222, new Object[] { adc.a(vector) });
                }
                if (q == null) {
                    if (vector.size() == 1 && App.S.f(vector.get(0))) {
                        return App.aq.getString(2131231209);
                    }
                    return App.aq.getString(2131231208, new Object[] { adc.a(vector) });
                }
                else {
                    if (vector.size() == 1 && App.S.f(vector.get(0))) {
                        return App.aq.getString(2131231219, new Object[] { q });
                    }
                    return App.aq.getString(2131231218, new Object[] { q, adc.a(vector) });
                }
                break;
            }
            case 13: {
                return App.aq.getString(2131231213, new Object[] { adc.a((Vector)bi.N) });
            }
            case 14: {
                final Vector vector2 = (Vector)bi.N;
                if (App.S.f(bi.t)) {
                    return App.aq.getString(2131231223, new Object[] { adc.a(vector2) });
                }
                if (q == null) {
                    if (vector2.size() == 1 && App.S.f(vector2.get(0))) {
                        return App.aq.getString(2131231217);
                    }
                    return App.aq.getString(2131231216, new Object[] { adc.a(vector2) });
                }
                else {
                    if (vector2.size() == 1 && App.S.f(vector2.get(0))) {
                        return App.aq.getString(2131231221, new Object[] { q });
                    }
                    return App.aq.getString(2131231220, new Object[] { q, adc.a(vector2) });
                }
                break;
            }
            case 15: {
                final Vector vector3 = (Vector)bi.N;
                if (vector3.size() == 1 && App.S.f(vector3.get(0))) {
                    return App.aq.getString(2131231215);
                }
                return App.C.a(2131296272, vector3.size(), new Object[] { adc.a(vector3) });
            }
            case 16: {
                final Vector vector4 = (Vector)bi.N;
                if (vector4.size() == 1 && App.S.f(vector4.get(0))) {
                    return App.aq.getString(2131231212);
                }
                return App.C.a(2131296271, vector4.size(), new Object[] { adc.a(vector4) });
            }
            case 17: {
                if (App.S.f(bi.t)) {
                    return App.aq.getString(2131231178);
                }
                return App.aq.getString(2131231177, new Object[] { q });
            }
            case 8: {
                return App.aq.getString(2131230878);
            }
            case 9: {
                final Vector vector5 = (Vector)bi.N;
                if (TextUtils.isEmpty((CharSequence)bi.c())) {
                    return App.C.a(2131296306, vector5.size(), new Object[] { vector5.size() });
                }
                return App.C.a(2131296305, vector5.size(), new Object[] { bi.c(), vector5.size() });
            }
            case 10: {
                final String s = (String)bi.N;
                Log.b(s != null);
                final String string = Character.toString(' ');
                if (a_9.r()) {
                    return App.aq.getString(2131231211, new Object[] { q.replace(" ", string), com.whatsapp.a_9.b(s).replace(" ", string) });
                }
                return App.aq.getString(2131231210, new Object[] { q, a_9.f().replace(" ", string), com.whatsapp.a_9.b(s).replace(" ", string) });
            }
        }
    }
    
    private void b(final bi bi) {
        this.t = bi;
        this.setClickable(false);
        this.G.setTextSize(ConversationRow.a(this.getResources()));
        if (bi.c == -1 && bi.I == -1) {
            this.G.setText((CharSequence)App.aq.getString(2131231117));
            return;
        }
        final String a = a(this.m);
        SpannableStringBuilder text = cq.a(a, this.getContext(), (Paint)this.G.getPaint(), 1.4f);
        if (this.m.L == 1L || this.m.L == 11L) {
            text = this.a(a, text);
        }
        final DividerView g = this.G;
        if (text == null) {
            text = (SpannableStringBuilder)a;
        }
        g.setText((CharSequence)text);
        if (!App.S.f(this.m.t) && adc.b(bi.a.a) && this.m.L != 15L && this.m.L != 16L) {
            this.setClickable(true);
            this.G.setOnClickListener(this.F);
        }
        this.setTag((Object)bi);
    }
    
    @Override
    public void a(final bi bi, final boolean b) {
        if (this.t != bi || b) {
            this.t = bi;
            this.b(this.m = bi);
        }
        super.a(bi, b);
    }
    
    @Override
    protected int b() {
        return 2130903118;
    }
    
    @Override
    public void d() {
        this.b(this.t);
        super.d();
    }
    
    @Override
    protected int p() {
        return 2130903118;
    }
}
