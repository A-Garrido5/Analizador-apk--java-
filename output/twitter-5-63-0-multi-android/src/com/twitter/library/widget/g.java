// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import com.twitter.util.l;
import android.os.Bundle;
import java.util.ArrayList;

class g
{
    int a;
    int b;
    CharSequence c;
    boolean d;
    int e;
    ArrayList f;
    ArrayList g;
    
    g() {
        this.e = kx.deep_transparent_black;
        this.f = new ArrayList();
        this.g = new ArrayList();
    }
    
    public static g a(final Bundle bundle) {
        final g g = new g();
        g.a = bundle.getInt("bottom_sheet_dialog_id");
        g.b = bundle.getInt("bottom_sheet_theme");
        g.c = bundle.getCharSequence("bottom_sheet_title");
        g.e = bundle.getInt("bottom_sheet_icon_tint", 0);
        g.d = bundle.getBoolean("bottom_sheet_show_grid", false);
        g.f = bundle.getParcelableArrayList("bottom_sheet_items");
        g.g = bundle.getIntegerArrayList("bottom_sheet_hide_items");
        return g;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final g g = (g)o;
            if (this.a != g.a) {
                return false;
            }
            if (this.e != g.e) {
                return false;
            }
            if (this.d != g.d) {
                return false;
            }
            if (this.b != g.b) {
                return false;
            }
            Label_0111: {
                if (this.g != null) {
                    if (this.g.equals(g.g)) {
                        break Label_0111;
                    }
                }
                else if (g.g == null) {
                    break Label_0111;
                }
                return false;
            }
            Label_0141: {
                if (this.f != null) {
                    if (this.f.equals(g.f)) {
                        break Label_0141;
                    }
                }
                else if (g.f == null) {
                    break Label_0141;
                }
                return false;
            }
            if (this.c != null) {
                if (this.c.equals(g.c)) {
                    return true;
                }
            }
            else if (g.c == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return l.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
