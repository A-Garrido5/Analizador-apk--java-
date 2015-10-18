// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import java.util.ArrayList;
import java.util.Iterator;
import com.twitter.library.featureswitch.d;
import android.graphics.Paint$FontMetrics;
import android.graphics.drawable.InsetDrawable;
import android.text.style.ImageSpan;
import android.text.SpannableString;
import android.view.View;
import android.widget.TextView;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Build$VERSION;
import android.util.Log;
import com.twitter.library.client.App;
import android.support.v4.util.LongSparseArray;
import java.util.HashMap;
import java.util.HashSet;
import android.content.Context;
import android.graphics.drawable.Drawable;

public class t
{
    private static final boolean b;
    private static t c;
    private static final long[] d;
    private static final int[] e;
    Drawable a;
    private Context f;
    private HashSet g;
    private HashMap h;
    private LongSparseArray i;
    private int j;
    private int k;
    private final v l;
    private final boolean m;
    private boolean n;
    
    static {
        b = (App.l() && Log.isLoggable("EmojiManager", 3));
        d = new long[] { 547483776315893L, 547531020956152L, 547466596446711L, 547458006512106L, 547479481348601L, 547470891413991L, 547462301479416L, 547518136054266L, 547453711544819L, 547488071283191L, 150323863779L, 206158438627L, 210453405923L, 214748373219L, 219043340515L, 223338307811L, 227633275107L, 231928242403L, 236223209699L, 240518176995L, 244813144291L };
        e = new int[] { 1041637, 1041638, 1041639, 1041640, 1041641, 1041642, 1041643, 1041644, 1041645, 1041646, 1042476, 1042487, 1042478, 1042479, 1042480, 1042481, 1042482, 1042483, 1042484, 1042485, 1042486 };
    }
    
    private t(final Context context) {
        this.l = new v();
        this.m = (Build$VERSION.SDK_INT < 16);
        this.n = false;
        this.f = context.getApplicationContext();
        if (this.m) {
            this.a();
        }
    }
    
    public static t a(final Context context) {
        synchronized (t.class) {
            if (t.c == null) {
                t.c = new t(context);
            }
            return t.c;
        }
    }
    
    private void a() {
        int i = 0;
        final ih ih = new ih("emoji:init", ih.m);
        ih.b("EmojiManager");
        ih.i();
        this.i = new LongSparseArray(t.d.length);
        this.a = (Drawable)new ColorDrawable(0);
        final Resources resources = this.f.getResources();
        this.j = resources.getDimensionPixelOffset(ky.emoji_padding);
        this.k = resources.getDimensionPixelOffset(ky.emoji_horizontal_inset);
        final int[] intArray = resources.getIntArray(ku.emoji_codes);
        this.g = new HashSet(intArray.length);
        this.h = new HashMap(intArray.length);
        while (i < intArray.length) {
            this.g.add(intArray[i]);
            ++i;
        }
        for (int j = -1 + t.d.length; j >= 0; --j) {
            this.i.put(t.d[j], t.e[j]);
        }
        ih.j();
        ir.b().a(ih);
    }
    
    public static void a(final Context context, final TextView textView, final CharSequence charSequence) {
        textView.setText(a(context).a((View)textView, charSequence, textView.getPaint().getFontMetrics()));
    }
    
    private void a(final v v, final CharSequence charSequence, final View view, final int n, final int n2, final int n3, final int n4) {
        if (n2 != 0) {
            if (v.a == null) {
                v.a = new SpannableString(charSequence);
            }
            if (v.b == null) {
                v.b = new u(view);
            }
            final w w = new w(this, n2, n);
            v.b.a(w);
            v.a.setSpan((Object)new ImageSpan((Drawable)w), n3, n4, 33);
        }
    }
    
    int a(final Integer n) {
        int int1;
        if (!this.g.contains(n)) {
            int1 = 0;
        }
        else {
            final Integer n2 = this.h.get(n);
            if (n2 != null) {
                return n2;
            }
            final String string = "em_" + Integer.toHexString(n);
            while (true) {
                try {
                    int1 = kz.class.getField(string).getInt(null);
                    if (int1 != 0) {
                        this.h.put(n, int1);
                        return int1;
                    }
                }
                catch (Exception ex) {
                    int1 = 0;
                    continue;
                }
                break;
            }
            if (t.b) {
                Log.e("EmojiManager", "can not find resource for code=" + Integer.toHexString(n));
                return int1;
            }
        }
        return int1;
    }
    
    Drawable a(final int n, final int n2) {
        try {
            final InsetDrawable insetDrawable = new InsetDrawable(this.f.getResources().getDrawable(n), this.k + this.j, this.j, this.k + this.j, this.j);
            insetDrawable.setBounds(0, 0, n2 + 2 * this.k, n2);
            return (Drawable)insetDrawable;
        }
        catch (OutOfMemoryError outOfMemoryError) {
            bq.a(outOfMemoryError);
            return null;
        }
    }
    
    public CharSequence a(final View view, CharSequence charSequence, final Paint$FontMetrics paint$FontMetrics) {
        if (charSequence == null || (!this.n && (!this.m || !com.twitter.library.featureswitch.d.f("android_emoji_enabled")))) {
            return charSequence;
        }
        final long nanoTime = System.nanoTime();
        final int n = (int)(paint$FontMetrics.descent - paint$FontMetrics.ascent);
        final int length = charSequence.length();
        final v l = this.l;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int codePoint = 0;
        int charCount = 0;
        long n5;
        int n6;
        Integer n7;
        int a;
        int n8;
        int n9;
        Object a2 = null;
        u b = null;
        Iterator<w> iterator;
        w w;
        ArrayList a3;
        Label_0422_Outer:Label_0259_Outer:
        while (true) {
            while (true) {
                if (n2 < length) {
                    Label_0301_Outer:Block_12_Outer:
                    while (true) {
                        Label_0437: {
                            try {
                                codePoint = Character.codePointAt(charSequence, n2);
                                charCount = Character.charCount(codePoint);
                                n5 = (n3 << 32 | codePoint);
                                n6 = n2 + charCount;
                                n7 = (Integer)this.i.get(n5);
                                if (n7 != null) {
                                    a = this.a(n7);
                                    this.a(l, charSequence, view, n, a, n2 - n4, n2 + charCount);
                                    if (a != 0) {
                                        n8 = 0;
                                        n9 = 0;
                                        break Label_0422;
                                    }
                                    break Label_0437;
                                }
                                else {
                                    this.a(l, charSequence, view, n, this.a(Integer.valueOf(n3)), n2 - n4, n2);
                                    if (n6 == length) {
                                        this.a(l, charSequence, view, n, this.a(Integer.valueOf(codePoint)), n2, n2 + charCount);
                                    }
                                    break Label_0437;
                                }
                                a2 = l.a;
                                b = l.b;
                                // iftrue(Label_0363:, b == null)
                                // iftrue(Label_0363:, !iterator.hasNext())
                                while (true) {
                                    Block_11: {
                                        break Block_11;
                                        while (true) {
                                            while (true) {
                                                w = iterator.next();
                                                w.a();
                                                w.b();
                                                continue Label_0301_Outer;
                                            }
                                            iterator = a3.iterator();
                                            continue Block_12_Outer;
                                        }
                                    }
                                    a3 = b.a;
                                    continue;
                                }
                            }
                            // iftrue(Label_0353:, a3.size() > 5)
                            finally {
                                l.a = null;
                                l.b = null;
                            }
                            break Label_0301_Outer;
                            n2 = n6;
                            n3 = n9;
                            n4 = n8;
                            continue Label_0422_Outer;
                        }
                        n8 = charCount;
                        n9 = codePoint;
                        continue Label_0259_Outer;
                    }
                    b.execute((Object[])new Void[0]);
                    break;
                }
                continue;
            }
        }
        Label_0363: {
            if (t.b) {
                Log.d("EmojiManager", "cost of emoji markup=" + (System.nanoTime() - nanoTime));
            }
        }
        if (a2 != null) {
            charSequence = (CharSequence)a2;
        }
        l.a = null;
        l.b = null;
        return charSequence;
    }
}
