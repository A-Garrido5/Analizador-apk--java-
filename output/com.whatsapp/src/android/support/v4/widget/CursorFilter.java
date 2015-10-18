// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.widget;

import android.widget.Filter$FilterResults;
import android.database.Cursor;
import android.widget.Filter;

class CursorFilter extends Filter
{
    CursorFilter$CursorFilterClient mClient;
    
    CursorFilter(final CursorFilter$CursorFilterClient mClient) {
        this.mClient = mClient;
    }
    
    public CharSequence convertResultToString(final Object o) {
        return this.mClient.convertToString((Cursor)o);
    }
    
    protected Filter$FilterResults performFiltering(final CharSequence charSequence) {
        final Cursor runQueryOnBackgroundThread = this.mClient.runQueryOnBackgroundThread(charSequence);
        final Filter$FilterResults filter$FilterResults = new Filter$FilterResults();
        if (runQueryOnBackgroundThread != null) {
            filter$FilterResults.count = runQueryOnBackgroundThread.getCount();
            filter$FilterResults.values = runQueryOnBackgroundThread;
            if (!SlidingPaneLayout.a) {
                return filter$FilterResults;
            }
        }
        filter$FilterResults.count = 0;
        filter$FilterResults.values = null;
        return filter$FilterResults;
    }
    
    protected void publishResults(final CharSequence charSequence, final Filter$FilterResults filter$FilterResults) {
        final Cursor cursor = this.mClient.getCursor();
        if (filter$FilterResults.values != null && filter$FilterResults.values != cursor) {
            this.mClient.changeCursor((Cursor)filter$FilterResults.values);
        }
    }
}
