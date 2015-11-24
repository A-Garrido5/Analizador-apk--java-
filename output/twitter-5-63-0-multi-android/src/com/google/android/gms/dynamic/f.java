// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.dynamic;

import android.app.Activity;
import android.content.Context;
import android.view.View$OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.widget.LinearLayout;
import com.google.android.gms.common.e;
import java.util.LinkedList;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

class f implements j
{
    final /* synthetic */ FrameLayout a;
    final /* synthetic */ LayoutInflater b;
    final /* synthetic */ ViewGroup c;
    final /* synthetic */ Bundle d;
    final /* synthetic */ b e;
    
    f(final b e, final FrameLayout a, final LayoutInflater b, final ViewGroup c, final Bundle d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public int a() {
        return 2;
    }
    
    @Override
    public void a(final a a) {
        this.a.removeAllViews();
        this.a.addView(this.e.a.a(this.b, this.c, this.d));
    }
}
