// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class oa implements SafeParcelable
{
    public static final oa A;
    public static final oa B;
    public static final oa C;
    public static final cm CREATOR;
    public static final oa D;
    public static final oa E;
    public static final oa F;
    public static final oa G;
    public static final oa H;
    public static final oa I;
    public static final oa J;
    public static final oa K;
    public static final oa L;
    public static final oa M;
    public static final oa N;
    public static final oa O;
    public static final oa P;
    public static final oa Q;
    public static final oa R;
    public static final oa S;
    public static final oa T;
    public static final oa U;
    public static final oa V;
    public static final oa W;
    public static final oa X;
    public static final oa Y;
    public static final oa Z;
    public static final oa a;
    public static final oa aA;
    public static final oa aB;
    public static final oa aC;
    public static final oa aD;
    public static final oa aE;
    public static final oa aF;
    public static final oa aG;
    public static final oa aH;
    public static final oa aI;
    public static final oa aJ;
    public static final oa aK;
    public static final oa aL;
    public static final oa aM;
    public static final oa aN;
    public static final oa aO;
    public static final oa aP;
    public static final oa aQ;
    public static final oa aR;
    public static final oa aS;
    public static final oa aT;
    public static final oa aU;
    public static final oa aV;
    public static final oa aW;
    public static final oa aX;
    public static final oa aY;
    public static final oa aZ;
    public static final oa aa;
    public static final oa ab;
    public static final oa ac;
    public static final oa ad;
    public static final oa ae;
    public static final oa af;
    public static final oa ag;
    public static final oa ah;
    public static final oa ai;
    public static final oa aj;
    public static final oa ak;
    public static final oa al;
    public static final oa am;
    public static final oa an;
    public static final oa ao;
    public static final oa ap;
    public static final oa aq;
    public static final oa ar;
    public static final oa as;
    public static final oa at;
    public static final oa au;
    public static final oa av;
    public static final oa aw;
    public static final oa ax;
    public static final oa ay;
    public static final oa az;
    public static final oa b;
    public static final oa ba;
    public static final oa bb;
    public static final oa bc;
    public static final oa bd;
    public static final oa be;
    public static final oa bf;
    public static final oa bg;
    public static final oa bh;
    public static final oa bi;
    public static final oa bj;
    public static final oa bk;
    public static final oa bl;
    public static final oa bm;
    public static final oa bn;
    public static final oa bo;
    public static final oa bp;
    public static final oa bq;
    public static final oa br;
    public static final oa bs;
    public static final oa bt;
    public static final oa bu;
    public static final oa bv;
    public static final oa c;
    public static final oa d;
    public static final oa e;
    public static final oa f;
    public static final oa g;
    public static final oa h;
    public static final oa i;
    public static final oa j;
    public static final oa k;
    public static final oa l;
    public static final oa m;
    public static final oa n;
    public static final oa o;
    public static final oa p;
    public static final oa q;
    public static final oa r;
    public static final oa s;
    public static final oa t;
    public static final oa u;
    public static final oa v;
    public static final oa w;
    public static final oa x;
    public static final oa y;
    public static final oa z;
    final int bw;
    final String bx;
    
    static {
        a = a("accounting");
        b = a("airport");
        c = a("amusement_park");
        d = a("aquarium");
        e = a("art_gallery");
        f = a("atm");
        g = a("bakery");
        h = a("bank");
        i = a("bar");
        j = a("beauty_salon");
        k = a("bicycle_store");
        l = a("book_store");
        m = a("bowling_alley");
        n = a("bus_station");
        o = a("cafe");
        p = a("campground");
        q = a("car_dealer");
        r = a("car_rental");
        s = a("car_repair");
        t = a("car_wash");
        u = a("casino");
        v = a("cemetery");
        w = a("church");
        x = a("city_hall");
        y = a("clothing_store");
        z = a("convenience_store");
        A = a("courthouse");
        B = a("dentist");
        C = a("department_store");
        D = a("doctor");
        E = a("electrician");
        F = a("electronics_store");
        G = a("embassy");
        H = a("establishment");
        I = a("finance");
        J = a("fire_station");
        K = a("florist");
        L = a("food");
        M = a("funeral_home");
        N = a("furniture_store");
        O = a("gas_station");
        P = a("general_contractor");
        Q = a("grocery_or_supermarket");
        R = a("gym");
        S = a("hair_care");
        T = a("hardware_store");
        U = a("health");
        V = a("hindu_temple");
        W = a("home_goods_store");
        X = a("hospital");
        Y = a("insurance_agency");
        Z = a("jewelry_store");
        aa = a("laundry");
        ab = a("lawyer");
        ac = a("library");
        ad = a("liquor_store");
        ae = a("local_government_office");
        af = a("locksmith");
        ag = a("lodging");
        ah = a("meal_delivery");
        ai = a("meal_takeaway");
        aj = a("mosque");
        ak = a("movie_rental");
        al = a("movie_theater");
        am = a("moving_company");
        an = a("museum");
        ao = a("night_club");
        ap = a("painter");
        aq = a("park");
        ar = a("parking");
        as = a("pet_store");
        at = a("pharmacy");
        au = a("physiotherapist");
        av = a("place_of_worship");
        aw = a("plumber");
        ax = a("police");
        ay = a("post_office");
        az = a("real_estate_agency");
        aA = a("restaurant");
        aB = a("roofing_contractor");
        aC = a("rv_park");
        aD = a("school");
        aE = a("shoe_store");
        aF = a("shopping_mall");
        aG = a("spa");
        aH = a("stadium");
        aI = a("storage");
        aJ = a("store");
        aK = a("subway_station");
        aL = a("synagogue");
        aM = a("taxi_stand");
        aN = a("train_station");
        aO = a("travel_agency");
        aP = a("university");
        aQ = a("veterinary_care");
        aR = a("zoo");
        aS = a("administrative_area_level_1");
        aT = a("administrative_area_level_2");
        aU = a("administrative_area_level_3");
        aV = a("colloquial_area");
        aW = a("country");
        aX = a("floor");
        aY = a("geocode");
        aZ = a("intersection");
        ba = a("locality");
        bb = a("natural_feature");
        bc = a("neighborhood");
        bd = a("political");
        be = a("point_of_interest");
        bf = a("post_box");
        bg = a("postal_code");
        bh = a("postal_code_prefix");
        bi = a("postal_town");
        bj = a("premise");
        bk = a("room");
        bl = a("route");
        bm = a("street_address");
        bn = a("sublocality");
        bo = a("sublocality_level_1");
        bp = a("sublocality_level_2");
        bq = a("sublocality_level_3");
        br = a("sublocality_level_4");
        bs = a("sublocality_level_5");
        bt = a("subpremise");
        bu = a("transit_station");
        bv = a("other");
        CREATOR = new cm();
    }
    
    oa(final int bw, final String bx) {
        com.google.android.gms.internal.ap.a(bx);
        this.bw = bw;
        this.bx = bx;
    }
    
    public static oa a(final String s) {
        return new oa(0, s);
    }
    
    public int describeContents() {
        final cm creator = oa.CREATOR;
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof oa && this.bx.equals(((oa)o).bx);
    }
    
    @Override
    public int hashCode() {
        return this.bx.hashCode();
    }
    
    @Override
    public String toString() {
        return this.bx;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final cm creator = oa.CREATOR;
        cm.a(this, parcel, n);
    }
}
