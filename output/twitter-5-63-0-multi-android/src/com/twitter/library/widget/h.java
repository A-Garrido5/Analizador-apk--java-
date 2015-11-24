// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.view.WindowManager$LayoutParams;
import java.util.Iterator;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.AbsListView;
import android.view.ViewStub;
import android.text.TextUtils;
import android.widget.TextView;
import android.view.View$OnClickListener;
import java.util.ArrayList;
import android.app.Dialog;
import android.os.Bundle;
import android.content.Context;

public class h
{
    g a;
    Context b;
    
    h() {
        this.a = new g();
    }
    
    public static h a(final Bundle bundle) {
        final h h = new h();
        h.a = g.a(bundle);
        return h;
    }
    
    private void b() {
        if (this.b == null) {
            throw new IllegalStateException("must set context first");
        }
    }
    
    final BottomSheet a() {
        this.b();
        BottomSheet bottomSheet;
        if (this.a.b > 0) {
            bottomSheet = new BottomSheet(this.b, this.a.b);
        }
        else {
            bottomSheet = new BottomSheet(this.b);
        }
        bottomSheet.a(this.a);
        return bottomSheet;
    }
    
    public final h a(final Context b) {
        this.b = b;
        return this;
    }
}
