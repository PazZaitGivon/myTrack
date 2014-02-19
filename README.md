myTrack
===========

About
-----
myTrack is an application written by George Chen, David Coffill, Ziping He, Shuai Lang, and Xinzhe Wang for the Android platform.  myTrack is meant to keep track of where you've been, and organize the important moments in your life by location and time.  myTrack is intended for Android 4.0 and above.


Setting up your environment
---------------------------

In order to develop and build myTrack, you must install Android studio[1] 0.4.0 or higher (last built against 0.4.4, recommended version).  Once the SDK is installed, you must use the SDK manager (Main Menu Bar > Tools > Android > SDK Manager) to install the "Google Repository" and "Google Play Services" [2], [3].  Many of these steps have already been performed though (such as modifying AndroidManifest.xml to include the API key) so you should only need to install these files from the SDK manager.

In addition, this application will not run correctly (maps will not work, application may force close) unless the proper signing key is used in the build process (as only .apk files generated and signed by approved keys will work with the Google Maps Android API).  If you do not have an existing Android environment whose keys you care about, the easiest way to do this is to copy the debug.keystore file to the proper location on your environment [4].


Resource links
--------------

1. https://developer.android.com/sdk/installing/studio.html
2. https://developer.android.com/google/play-services/setup.html
3. https://developers.google.com/maps/documentation/android/start
4. https://developer.android.com/tools/publishing/app-signing.html


See Also
--------

For more information on the various elements used in our application, as well as example code, see the following links.

SQLite Relational Database:
- https://developer.android.com/reference/android/database/sqlite/SQLiteDatabase.html
- https://developer.android.com/reference/android/database/sqlite/SQLiteOpenHelper.html

Location class (reponsible for storing attributes of a location):
- https://developer.android.com/reference/android/location/Location.html

Map Fragment (drawing the map):
- https://developers.google.com/maps/documentation/android/reference/com/google/android/gms/maps/MapFragment

Markers (represent positions on the map):
- https://developers.google.com/maps/documentation/android/marker
- https://developers.google.com/maps/documentation/android/reference/com/google/android/gms/maps/model/Marker

Polylines (represents paths between points on the map):
- https://developers.google.com/maps/documentation/android/shapes#polylines
- https://developers.google.com/maps/documentation/android/reference/com/google/android/gms/maps/model/Polyline

Info Window (popup window shown by Marker object):
- https://developers.google.com/maps/documentation/android/infowindows

Google Play Location Services API:
- https://developer.android.com/google/play-services/location.html
- https://developer.android.com/training/location/index.html
- https://developer.android.com/reference/com/google/android/gms/location/package-summary.html

