// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.view.View;
import android.support.v4.util.ArrayMap;
import java.util.ArrayList;

public class BackStackRecord$TransitionState
{
    public FragmentTransitionCompat21$EpicenterView enteringEpicenterView;
    public ArrayList hiddenFragmentViews;
    public ArrayMap nameOverrides;
    public View nonExistentView;
    final /* synthetic */ BackStackRecord this$0;
    
    public BackStackRecord$TransitionState(final BackStackRecord this$0) {
        this.this$0 = this$0;
        this.nameOverrides = new ArrayMap();
        this.hiddenFragmentViews = new ArrayList();
        this.enteringEpicenterView = new FragmentTransitionCompat21$EpicenterView();
    }
}
