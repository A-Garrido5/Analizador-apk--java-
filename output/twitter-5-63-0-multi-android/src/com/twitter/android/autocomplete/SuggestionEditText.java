// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.autocomplete;

import android.graphics.Rect;
import android.text.Html;
import android.text.style.MetricAffectingSpan;
import android.view.KeyEvent;
import android.text.Editable;
import android.content.res.TypedArray;
import com.twitter.android.pa;
import android.util.AttributeSet;
import android.content.Context;

public abstract class SuggestionEditText extends ClickableDrawableEditText implements m
{
    private final int a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final int e;
    private g f;
    private e g;
    private d h;
    private b i;
    private dr j;
    private f k;
    private Object l;
    private boolean m;
    private c n;
    
    protected SuggestionEditText(final Context context) {
        this(context, null);
    }
    
    protected SuggestionEditText(final Context context, final AttributeSet set) {
        this(context, set, 2130772104);
    }
    
    public SuggestionEditText(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.m = true;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, pa.SuggestionEditText, n, 0);
        this.a = obtainStyledAttributes.getInt(1, 1);
        this.b = obtainStyledAttributes.getBoolean(2, false);
        this.c = obtainStyledAttributes.getBoolean(3, false);
        this.d = obtainStyledAttributes.getBoolean(0, false);
        this.e = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        obtainStyledAttributes.recycle();
    }
    
    protected void a(final long n, final Object o) {
        if ((this.g == null || !this.g.a(this.l, n, o)) && this.j != null) {
            String s;
            if (this.k != null) {
                s = this.k.a(this.l, o);
            }
            else {
                s = o.toString();
            }
            final Editable text = this.getText();
            final ds d = this.j.d((CharSequence)text, this.getSelectionEnd());
            if (d != null) {
                text.replace(d.a, d.b, this.j.a(s));
            }
        }
    }
    
    protected abstract boolean a(final Object p0, final ln p1);
    
    public boolean a(final boolean m) {
        final boolean i = this.m;
        if (this.m != m) {
            this.m = m;
            if (this.m) {
                this.b();
            }
        }
        return i;
    }
    
    public void b() {
        if (this.j != null && this.f != null) {
            final int selectionEnd = this.getSelectionEnd();
            if (selectionEnd >= 0) {
                Object o = this.j.b((CharSequence)this.getText(), selectionEnd);
                if (o != null && this.n != null) {
                    o = this.n.a(o);
                }
                if (o == null || (this.a != 0 && o.toString().length() < this.a)) {
                    this.c();
                    return;
                }
                this.f.a(o);
            }
        }
    }
    
    @Override
    public void b(final Object l, final ln ln) {
        if (ln.a() > 0) {
            if (this.a(l, ln)) {
                this.l = l;
                if (this.g != null) {
                    this.g.a(l, ln);
                }
            }
            return;
        }
        ln.b();
        this.c();
    }
    
    public void c() {
        if (this.f != null) {
            this.f.a();
        }
        if (this.a(null, ln.a)) {
            this.l = null;
            if (this.b) {
                this.requestFocus();
            }
            if (this.g != null) {
                this.g.D_();
            }
        }
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c();
    }
    
    public boolean onKeyPreIme(final int n, final KeyEvent keyEvent) {
        return (this.i != null && this.i.a(n, keyEvent)) || super.onKeyPreIme(n, keyEvent);
    }
    
    protected void onSelectionChanged(final int n, final int n2) {
        if (this.h != null) {
            this.h.a(n, n2);
        }
    }
    
    protected void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        if (this.m) {
            this.b();
        }
    }
    
    public boolean onTextContextMenuItem(final int n) {
        int i = 0;
        try {
            if (!super.onTextContextMenuItem(n)) {
                return false;
            }
        }
        catch (SecurityException ex) {
            return false;
        }
        catch (RuntimeException ex2) {
            return false;
        }
        if (n == 16908322) {
            final Editable text = this.getText();
            if (this.c) {
                for (MetricAffectingSpan[] array = (MetricAffectingSpan[])text.getSpans(0, this.length(), (Class)MetricAffectingSpan.class); i < array.length; ++i) {
                    text.removeSpan((Object)array[i]);
                }
            }
            if (this.d) {
                this.setText((CharSequence)Html.fromHtml(text.toString()));
            }
        }
        return true;
    }
    
    public boolean requestRectangleOnScreen(final Rect rect, final boolean b) {
        rect.bottom += this.e;
        return super.requestRectangleOnScreen(rect, b);
    }
    
    public void setKeyPreImeListener(final b i) {
        this.i = i;
    }
    
    public void setQueryTransformer(final c n) {
        this.n = n;
    }
    
    public void setSelectionChangeListener(final d h) {
        this.h = h;
    }
    
    public void setSuggestionListener(final e g) {
        this.g = g;
    }
    
    public void setSuggestionProvider(final db db) {
        if (this.f != null) {
            this.f.a();
            this.f = null;
        }
        if (db != null) {
            this.f = new g(db, this);
        }
    }
    
    public void setSuggestionStringConverter(final f k) {
        this.k = k;
    }
    
    public void setTokenizer(final dr j) {
        this.j = j;
    }
}
