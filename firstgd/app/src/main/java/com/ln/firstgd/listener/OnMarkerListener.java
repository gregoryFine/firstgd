package com.ln.firstgd.listener;

import android.util.Log;
import android.view.View;

import com.amap.api.maps.AMap;
import com.amap.api.maps.model.Marker;

/**
 * 点击标记监听类
 */
public class OnMarkerListener implements AMap.OnMarkerClickListener, AMap.InfoWindowAdapter {

    @Override
    public boolean onMarkerClick(Marker marker) {
        String title = marker.getTitle();
        Log.i("htitle", title );
        return false;
    }


    /**
     * 得到标记的相关信息
     * @param marker
     * @return
     */
    @Override
    public View getInfoWindow(Marker marker) {
        return null;
    }

    /**
     * 得到标记的相关信息
     * @param marker
     * @return
     */
    @Override
    public View getInfoContents(Marker marker) {
        return null;
    }
}
