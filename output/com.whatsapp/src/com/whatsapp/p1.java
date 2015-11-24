// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.widget.ImageView$ScaleType;
import android.widget.ImageView;
import android.content.Context;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.view.View;
import android.os.AsyncTask;
import com.whatsapp.util.aw;
import android.widget.BaseAdapter;

class p1 extends BaseAdapter
{
    private o3 a;
    final WebImagePicker b;
    private boolean c;
    
    public p1(final WebImagePicker b) {
        this.b = b;
    }
    
    static o3 a(final p1 p2, final o3 a) {
        return p2.a = a;
    }
    
    private void a() {
        if (this.a != null) {
            this.a.cancel(false);
        }
    }
    
    static void a(final p1 p) {
        p.a();
    }
    
    static void a(final p1 p2, final String s) {
        p2.a(s);
    }
    
    private void a(final String s) {
        if (s != null) {
            if (this.a != null) {
                this.a.cancel(false);
            }
            this.c = true;
            WebImagePicker.a(this.b, new q7(s));
            WebImagePicker.d(this.b).clear();
            WebImagePicker.g(this.b).b();
            WebImagePicker.a(this.b, new aw(WebImagePicker.c(this.b)).a(WebImagePicker.j(this.b)).a(4194304L).b(this.b.getResources().getDrawable(2130838998)).a(this.b.getResources().getDrawable(2130838808)).a());
        }
        a8s.a(this.a = new o3(this, null), new Void[0]);
        if (s != null) {
            this.notifyDataSetChanged();
        }
    }
    
    static boolean a(final p1 p2, final boolean c) {
        return p2.c = c;
    }
    
    static boolean b(final p1 p) {
        return p.c;
    }
    
    public int getCount() {
        return (-1 + (WebImagePicker.d(this.b).size() + WebImagePicker.b(this.b))) / WebImagePicker.b(this.b);
    }
    
    public Object getItem(final int n) {
        return null;
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        final boolean i = App.I;
        LinearLayout linearLayout2 = null;
        Label_0092: {
            if (view == null || ((LinearLayout)view).getChildCount() != WebImagePicker.b(this.b)) {
                final LinearLayout linearLayout = new LinearLayout((Context)this.b);
                linearLayout.setPadding(WebImagePicker.i(this.b).f, WebImagePicker.i(this.b).q, 0, WebImagePicker.i(this.b).q);
                linearLayout.setClickable(false);
                if (!i) {
                    linearLayout2 = linearLayout;
                    break Label_0092;
                }
            }
            linearLayout2 = (LinearLayout)view;
        }
        final int childCount = linearLayout2.getChildCount();
        int j = n * WebImagePicker.b(this.b);
        int n2 = 0;
        while (j < (n + 1) * WebImagePicker.b(this.b)) {
            Label_0389: {
                if (j < WebImagePicker.d(this.b).size()) {
                    final u0 u0 = WebImagePicker.d(this.b).get(j);
                    ImageView imageView = null;
                    Label_0329: {
                        if (childCount <= n2) {
                            imageView = new ImageView((Context)this.b);
                            imageView.setScaleType(ImageView$ScaleType.CENTER_CROP);
                            final LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(WebImagePicker.j(this.b), WebImagePicker.j(this.b));
                            imageView.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                            layoutParams.rightMargin = (int)WebImagePicker.i(this.b).j;
                            imageView.setBackgroundResource(2130839068);
                            imageView.setPadding(WebImagePicker.i(this.b).l, WebImagePicker.i(this.b).l, WebImagePicker.i(this.b).l, WebImagePicker.i(this.b).l);
                            imageView.setOnClickListener(WebImagePicker.l(this.b));
                            linearLayout2.addView((View)imageView);
                            if (!i) {
                                break Label_0329;
                            }
                        }
                        imageView = (ImageView)linearLayout2.getChildAt(n2);
                        imageView.setVisibility(0);
                    }
                    WebImagePicker.g(this.b).b(u0.c, imageView);
                    ++n2;
                    if (!i) {
                        break Label_0389;
                    }
                }
                final int n3 = j - n * WebImagePicker.b(this.b);
                if (childCount > n3) {
                    ((ImageView)linearLayout2.getChildAt(n3)).setVisibility(4);
                }
            }
            final int n4 = n2;
            final int n5 = j + 1;
            if (i) {
                break;
            }
            j = n5;
            n2 = n4;
        }
        if (this.a == null && this.c && n == (-1 + WebImagePicker.d(this.b).size()) / WebImagePicker.b(this.b)) {
            this.a((String)null);
        }
        return (View)linearLayout2;
    }
}
