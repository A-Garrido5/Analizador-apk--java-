// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.dynamic;

import android.app.Activity;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;
import android.view.View$OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.widget.LinearLayout;
import com.google.android.gms.common.e;
import android.widget.FrameLayout;
import java.util.LinkedList;
import java.util.Iterator;
import android.os.Bundle;

class c implements o
{
    final /* synthetic */ b a;
    
    c(final b a) {
        this.a = a;
    }
    
    @Override
    public void a(final a a) {
        this.a.a = a;
        final Iterator iterator = this.a.c.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(this.a.a);
        }
        this.a.c.clear();
        this.a.b = null;
    }
}
