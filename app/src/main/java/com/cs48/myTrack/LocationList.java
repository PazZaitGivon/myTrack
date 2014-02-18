package com.cs48.myTrack;

import android.location.Location;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by david on 2/9/14.
 */

/*
A class intended to store locations during runtime, which can be accessed by other relevant classes
that need location data, such as MTMapFragment and myListFragment
 */
public class LocationList extends ArrayList<MTLocation> implements Serializable {

}

