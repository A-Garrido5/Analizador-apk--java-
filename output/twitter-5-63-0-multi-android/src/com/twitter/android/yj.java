// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.View;
import com.twitter.internal.android.widget.GroupedRowView;
import com.twitter.library.widget.UserView;
import android.widget.ListView;

public class yj
{
    public static boolean a(final ListView listView, final long n) {
        for (int n2 = -1 + listView.getChildCount(), i = 0; i <= n2; ++i) {
            final View child = listView.getChildAt(i);
            if (child != null) {
                UserView userView = null;
                Label_0044: {
                    if (child instanceof UserView) {
                        userView = (UserView)child;
                    }
                    else {
                        if (child instanceof GroupedRowView) {
                            final View child2 = ((GroupedRowView)child).getChildAt(0);
                            if (child2 instanceof UserView) {
                                userView = (UserView)child2;
                                break Label_0044;
                            }
                        }
                        userView = null;
                    }
                }
                if (userView != null && ((yk)userView.getTag()).c == n) {
                    return true;
                }
            }
        }
        return false;
    }
}
