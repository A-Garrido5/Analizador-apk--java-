// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.widget.ListAdapter;
import java.util.Collection;
import java.util.Arrays;
import com.twitter.library.client.Session;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.File;
import com.twitter.android.widget.ct;
import com.twitter.library.api.account.p;
import android.content.DialogInterface;
import android.widget.Toast;
import android.support.v4.app.FragmentActivity;
import android.widget.ListView;
import android.graphics.Bitmap;
import com.twitter.library.media.util.m;
import android.support.v4.app.Fragment;
import com.twitter.android.widget.PromptDialogFragment;
import com.twitter.library.util.bq;
import com.twitter.ui.dialog.e;
import com.twitter.ui.dialog.b;
import com.twitter.android.client.TwitterListFragment;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import java.util.List;
import java.util.ArrayList;
import android.content.Context;
import android.widget.ArrayAdapter;

class am extends ArrayAdapter
{
    public am(final Context context, final int n, final int n2, final ArrayList list) {
        super(context, n, n2, (List)list);
    }
    
    public View getView(final int n, View inflate, final ViewGroup viewGroup) {
        super.getView(n, inflate, viewGroup);
        final String s = (String)this.getItem(n);
        if (inflate == null) {
            inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2130968609, (ViewGroup)null);
        }
        ((TextView)inflate.findViewById(2131886304)).setText((CharSequence)f(s));
        return inflate;
    }
}
