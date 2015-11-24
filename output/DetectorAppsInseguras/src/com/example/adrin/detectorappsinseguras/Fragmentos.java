// 
// Decompiled by Procyon v0.5.30
// 

package com.example.adrin.detectorappsinseguras;

import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.content.Context;
import android.support.v4.app.Fragment;

public class Fragmentos extends Fragment
{
    private static final String ARG_SECTION_NUMBER = "section_number";
    private static final String ARG_TAMA\u00d1O = "tama\u00f1o";
    private static final String IMAGE_VIEW = "image";
    Context context;
    private int image;
    private int section_number;
    private int tama\u00f1o;
    
    public static Fragmentos newInstance(final int n, final int n2, final int n3, final Context context) {
        final Fragmentos fragmentos = new Fragmentos();
        final Bundle arguments = new Bundle();
        arguments.putInt("section_number", n);
        arguments.putInt("tama\u00f1o", n3);
        arguments.putInt("image", n2);
        fragmentos.setArguments(arguments);
        fragmentos.setRetainInstance(true);
        return fragmentos;
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        if (this.getArguments() != null) {
            this.section_number = this.getArguments().getInt("section_number");
            this.tama\u00f1o = this.getArguments().getInt("tama\u00f1o");
            this.image = this.getArguments().getInt("image");
            return;
        }
        this.section_number = (int)(5.0 * Math.random());
    }
    
    @Override
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View inflate = layoutInflater.inflate(2130968607, viewGroup, false);
        final TextView textView = (TextView)inflate.findViewById(2131492957);
        final TextView textView2 = (TextView)inflate.findViewById(2131492959);
        if (this.section_number == 0) {
            textView.setText((CharSequence)this.getResources().getString(2131099673));
            textView2.setText((CharSequence)(String.valueOf(1 + this.section_number) + "/" + String.valueOf(this.tama\u00f1o)));
        }
        else if (this.section_number == 1) {
            textView.setText((CharSequence)this.getResources().getString(2131099674));
            textView2.setText((CharSequence)(String.valueOf(1 + this.section_number) + "/" + String.valueOf(this.tama\u00f1o)));
        }
        else if (this.section_number == 2) {
            textView.setText((CharSequence)this.getResources().getString(2131099675));
            textView2.setText((CharSequence)(String.valueOf(1 + this.section_number) + "/" + String.valueOf(this.tama\u00f1o)));
        }
        else if (this.section_number == 3) {
            textView.setText((CharSequence)this.getResources().getString(2131099676));
            textView2.setText((CharSequence)(String.valueOf(1 + this.section_number) + "/" + String.valueOf(this.tama\u00f1o)));
        }
        else if (this.section_number == 4) {
            textView.setText((CharSequence)this.getResources().getString(2131099677));
            textView2.setText((CharSequence)(String.valueOf(1 + this.section_number) + "/" + String.valueOf(this.tama\u00f1o)));
        }
        else if (this.section_number == 5) {
            textView.setText((CharSequence)this.getResources().getString(2131099678));
            textView2.setText((CharSequence)(String.valueOf(1 + this.section_number) + "/" + String.valueOf(this.tama\u00f1o)));
        }
        else if (this.section_number == 6) {
            textView.setText((CharSequence)this.getResources().getString(2131099679));
            textView2.setText((CharSequence)(String.valueOf(1 + this.section_number) + "/" + String.valueOf(this.tama\u00f1o)));
        }
        else if (this.section_number == 7) {
            textView.setText((CharSequence)this.getResources().getString(2131099680));
            textView2.setText((CharSequence)(String.valueOf(1 + this.section_number) + "/" + String.valueOf(this.tama\u00f1o)));
        }
        else if (this.section_number == 8) {
            textView.setText((CharSequence)this.getResources().getString(2131099681));
            textView2.setText((CharSequence)(String.valueOf(1 + this.section_number) + "/" + String.valueOf(this.tama\u00f1o)));
        }
        ((ImageView)inflate.findViewById(2131492958)).setImageResource(this.image);
        return inflate;
    }
}
