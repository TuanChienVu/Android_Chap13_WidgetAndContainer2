package com.vutuanchien.android_chap13_tab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MY PC on 24/03/2016.
 */
public class TabsPagerAdapter extends FragmentStatePagerAdapter {

    AnalogClock analogClock;
    DigitalClock digitalClock;
    Light light;

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
        setAnalogClock(new AnalogClock());
        setDigitalClock(new DigitalClock());
        setLight(new Light());

    }

    @Override
    public Fragment getItem(int position) {

//        return new fragments
        switch (position) {
            case 0:
                analogClock = new AnalogClock();
                return analogClock;
            case 1:
                digitalClock = new DigitalClock();
                return digitalClock;
            case 2:
                light = new Light();
                return light;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    public AnalogClock getAnalogClock() {
        return analogClock;
    }

    public void setAnalogClock(AnalogClock analogClock) {
        this.analogClock = analogClock;
    }

    public DigitalClock getDigitalClock() {
        return digitalClock;
    }

    public void setDigitalClock(DigitalClock digitalClock) {
        this.digitalClock = digitalClock;
    }

    public Light getLight() {
        return light;
    }

    public void setLight(Light light) {
        this.light = light;
    }
}

