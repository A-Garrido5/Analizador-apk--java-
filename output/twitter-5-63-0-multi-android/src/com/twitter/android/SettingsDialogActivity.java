// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.net.Uri;
import android.content.Intent;
import android.view.View;
import android.widget.ListView;
import android.widget.ListAdapter;
import android.content.Context;
import android.os.Bundle;
import com.twitter.android.client.TwitterListActivity;

public class SettingsDialogActivity extends TwitterListActivity
{
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2130969102);
        this.getListView().setAdapter((ListAdapter)new sk((Context)this, new String[] { this.getString(2131297667), this.getString(2131297921) }));
    }
    
    protected void onListItemClick(final ListView listView, final View view, final int n, final long n2) {
        switch (n) {
            case 0: {
                this.startActivityForResult(new Intent((Context)this, (Class)SettingsActivity.class), 0);
                break;
            }
            case 1: {
                this.startActivityForResult(new Intent((Context)this, (Class)WebViewActivity.class).setData(Uri.parse(this.getString(2131298171))), 1);
                break;
            }
        }
        this.finish();
    }
}
