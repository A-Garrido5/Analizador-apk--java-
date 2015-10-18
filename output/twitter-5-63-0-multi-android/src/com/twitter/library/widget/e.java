// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.view.WindowManager$LayoutParams;
import java.util.Iterator;
import android.widget.ListAdapter;
import android.widget.AbsListView;
import android.view.ViewStub;
import android.text.TextUtils;
import android.widget.TextView;
import android.view.View$OnClickListener;
import android.os.Bundle;
import android.content.Context;
import java.util.ArrayList;
import android.app.Dialog;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;

class e implements AdapterView$OnItemClickListener
{
    final /* synthetic */ BottomSheet a;
    
    e(final BottomSheet a) {
        this.a = a;
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        this.a.a(this.a.a.get(n));
        this.a.dismiss();
    }
}
