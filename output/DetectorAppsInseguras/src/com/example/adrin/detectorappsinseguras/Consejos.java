// 
// Decompiled by Procyon v0.5.30
// 

package com.example.adrin.detectorappsinseguras;

import android.view.MenuItem;
import android.view.Menu;
import android.widget.ExpandableListAdapter;
import java.util.Collection;
import java.util.ArrayList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.content.Context;
import android.widget.ExpandableListView;
import java.util.List;
import java.util.HashMap;
import android.support.v7.app.ActionBarActivity;

public class Consejos extends ActionBarActivity
{
    HashMap<String, List<String>> Advices;
    List<String> Advices_list;
    ExpandableListView Exp_list;
    PrimerAdaptador adaptador;
    Context context;
    
    public Consejos() {
        this.context = (Context)this;
    }
    
    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2130968600);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.getSupportActionBar().setDisplayShowHomeEnabled(true);
        this.getSupportActionBar().setIcon(2130837578);
        this.getSupportActionBar().setBackgroundDrawable((Drawable)new ColorDrawable(this.getResources().getColor(2131427362)));
        this.Exp_list = (ExpandableListView)this.findViewById(2131492933);
        this.Advices = DataProvider.getInfo(this.context);
        this.Advices_list = new ArrayList<String>(this.Advices.keySet());
        this.adaptador = new PrimerAdaptador((Context)this, this.Advices, this.Advices_list);
        this.Exp_list.setAdapter((ExpandableListAdapter)this.adaptador);
    }
    
    public boolean onCreateOptionsMenu(final Menu menu) {
        this.getMenuInflater().inflate(2131558402, menu);
        return true;
    }
    
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        menuItem.getItemId();
        this.onBackPressed();
        return super.onOptionsItemSelected(menuItem);
    }
}
