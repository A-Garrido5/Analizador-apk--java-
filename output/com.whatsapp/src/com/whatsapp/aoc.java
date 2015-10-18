// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.location.Location;
import com.whatsapp.protocol.bt;
import android.graphics.Point;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.model.LatLng;

class aoc extends ao2
{
    final GroupChatLiveLocationsActivity2 p;
    
    aoc(final GroupChatLiveLocationsActivity2 p) {
        this.p = p;
    }
    
    @Override
    public void a() {
        final boolean i = App.I;
        GroupChatLiveLocationsActivity2.d(this.p);
        if (GroupChatLiveLocationsActivity2.j(this.p) != null) {
            final LatLng latLng = new LatLng(GroupChatLiveLocationsActivity2.j(this.p).f, GroupChatLiveLocationsActivity2.j(this.p).c);
            final Point screenLocation = GroupChatLiveLocationsActivity2.h(this.p).getProjection().toScreenLocation(latLng);
            final int n = (int)(48.0f * vc.b().b);
            Label_0218: {
                if (screenLocation.x < n || screenLocation.y < n || screenLocation.x > GroupChatLiveLocationsActivity2.a(this.p).getWidth() - n || screenLocation.y > GroupChatLiveLocationsActivity2.a(this.p).getHeight() - n) {
                    final float b = GroupChatLiveLocationsActivity2.b(this.p, GroupChatLiveLocationsActivity2.j(this.p).h);
                    if (b > GroupChatLiveLocationsActivity2.h(this.p).getCameraPosition().zoom) {
                        GroupChatLiveLocationsActivity2.h(this.p).animateCamera(CameraUpdateFactory.newLatLng(latLng));
                        if (!i) {
                            break Label_0218;
                        }
                    }
                    GroupChatLiveLocationsActivity2.h(this.p).animateCamera(CameraUpdateFactory.newCameraPosition(CameraPosition.builder().target(latLng).zoom(b).build()));
                }
            }
            if (!i) {
                return;
            }
        }
        if (!GroupChatLiveLocationsActivity2.e(this.p)) {
            GroupChatLiveLocationsActivity2.g(this.p);
        }
    }
    
    @Override
    public void a(final bt bt, final boolean b) {
        final boolean i = App.I;
        GroupChatLiveLocationsActivity2.a(this.p, bt);
        GroupChatLiveLocationsActivity2.b(this.p, true);
        GroupChatLiveLocationsActivity2.a(this.p).setLocationMode(2);
        final LatLng latLng = new LatLng(bt.f, bt.c);
        Label_0222: {
            if (b && GroupChatLiveLocationsActivity2.h(this.p).getCameraPosition().zoom < 17.0f) {
                final Point screenLocation = GroupChatLiveLocationsActivity2.h(this.p).getProjection().toScreenLocation(latLng);
                Label_0203: {
                    if (screenLocation.x <= 0 || screenLocation.y <= 0 || screenLocation.x >= GroupChatLiveLocationsActivity2.a(this.p).getWidth() || screenLocation.y >= GroupChatLiveLocationsActivity2.a(this.p).getHeight()) {
                        GroupChatLiveLocationsActivity2.h(this.p).animateCamera(CameraUpdateFactory.newLatLng(latLng));
                        if (!i) {
                            break Label_0203;
                        }
                    }
                    GroupChatLiveLocationsActivity2.h(this.p).animateCamera(CameraUpdateFactory.newCameraPosition(CameraPosition.builder().target(latLng).zoom(GroupChatLiveLocationsActivity2.b(this.p, bt.h)).build()));
                }
                if (!i) {
                    break Label_0222;
                }
            }
            GroupChatLiveLocationsActivity2.h(this.p).animateCamera(CameraUpdateFactory.newLatLng(latLng));
        }
        GroupChatLiveLocationsActivity2.d(this.p);
    }
    
    @Override
    public Location e() {
        return GroupChatLiveLocationsActivity2.h(this.p).getMyLocation();
    }
}
