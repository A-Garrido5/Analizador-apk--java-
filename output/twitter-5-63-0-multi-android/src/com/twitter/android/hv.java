// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import java.io.Serializable;
import android.os.Parcelable;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class hv implements FlowPresenter
{
    private final hu a;
    private List b;
    private FlowData c;
    
    public hv(final hu a) {
        this.b = new ArrayList();
        this.a = a;
    }
    
    private void a(final int n, final int n2) {
        for (int max = Math.max(n, 0), i = Math.min(n2, -1 + this.d()); i >= max; --i) {
            this.b.remove(i);
        }
    }
    
    private void a(final Flow$Step flow$Step, final FlowPresenter$Direction flowPresenter$Direction) {
        if (flow$Step == null) {
            this.a.g();
            return;
        }
        if (flow$Step.c()) {
            this.b(flow$Step, flowPresenter$Direction);
            return;
        }
        final Bundle bundle = new Bundle();
        bundle.putParcelable("extra_flow_data", (Parcelable)this.c);
        this.a.a(flow$Step.b(bundle), flowPresenter$Direction);
    }
    
    private void b(final Flow$Step flow$Step, final FlowPresenter$Direction flowPresenter$Direction) {
        this.a(this.c(flow$Step, flowPresenter$Direction), flowPresenter$Direction);
    }
    
    private Flow$Step c(final Flow$Step flow$Step, final FlowPresenter$Direction flowPresenter$Direction) {
        Flow$Step b;
        if (flowPresenter$Direction.equals(FlowPresenter$Direction.a)) {
            b = null;
            if (flow$Step != null) {
                b = flow$Step.b();
                if (b != null) {
                    this.b.add(b);
                }
            }
        }
        else {
            final boolean equals = flowPresenter$Direction.equals(FlowPresenter$Direction.b);
            b = null;
            if (equals) {
                final boolean empty = this.b.isEmpty();
                b = null;
                if (!empty) {
                    this.b.remove(-1 + this.d());
                    return this.c();
                }
            }
        }
        return b;
    }
    
    @Override
    public FlowData a() {
        return this.c;
    }
    
    @Override
    public void a(final Bundle bundle) {
        bundle.putSerializable("flow_presenter", (Serializable)this.b);
        bundle.putParcelable("flow_data", (Parcelable)this.c);
    }
    
    @Override
    public void a(Flow$Step flow$Step, final ht ht) {
        final int lastIndex = this.b.lastIndexOf(flow$Step);
        FlowPresenter$Direction a;
        if (lastIndex > -1) {
            final Flow$Step flow$Step2 = this.b.get(lastIndex);
            this.a(lastIndex + 1, -1 + this.d());
            final FlowPresenter$Direction b = FlowPresenter$Direction.b;
            flow$Step = flow$Step2;
            a = b;
        }
        else {
            this.b.add(flow$Step);
            a = FlowPresenter$Direction.a;
        }
        this.a(flow$Step, a);
        if (ht != null) {
            flow$Step.b(ht);
        }
    }
    
    @Override
    public void a(final FlowPresenter$Direction flowPresenter$Direction) {
        this.a(this.c(), flowPresenter$Direction);
    }
    
    @Override
    public void a(final ht ht) {
        while (true) {
            for (int i = -1 + this.d(); i >= 0; --i) {
                final Flow$Step flow$Step = this.b.get(i);
                if (flow$Step.a(ht)) {
                    if (flow$Step != null) {
                        this.a(flow$Step, ht);
                    }
                    return;
                }
            }
            final Flow$Step flow$Step = null;
            continue;
        }
    }
    
    @Override
    public void a(final List b, final FlowData c) {
        if (!(b instanceof Serializable)) {
            throw new ClassCastException("Flow must implement Serializable.");
        }
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void b() {
        final Flow$Step c = this.c();
        if (c == null || !c.a()) {
            this.b(c, FlowPresenter$Direction.a);
        }
    }
    
    @Override
    public void b(final Bundle bundle) {
        this.b = bundle.getParcelableArrayList("flow_presenter");
        this.c = (FlowData)bundle.getParcelable("flow_data");
    }
    
    @Override
    public void b(final FlowPresenter$Direction flowPresenter$Direction) {
        this.b(this.c(), flowPresenter$Direction);
    }
    
    protected Flow$Step c() {
        final boolean empty = this.b.isEmpty();
        Flow$Step flow$Step = null;
        if (!empty) {
            flow$Step = this.b.get(-1 + this.d());
        }
        return flow$Step;
    }
    
    protected int d() {
        return this.b.size();
    }
}
