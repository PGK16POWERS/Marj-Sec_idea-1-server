// NETWORK SECURITY CONFIGURATION
<network-security-config xmlns:android="http://schemas.android.com/apk/res/android">
    <domain-config cleartextTrafficPermitted="true">
        <domain includeSubdomains="true">192.168.101.250</domain>
        <port>7600</port>
    </domain-config>
</network-security-config>



// PERMISSIONS
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"/>
<uses-permission android:name="android.permission.INTERNET"/>


// BASE LIB CONFIGURATION
agp = "8.2.0"
kotlin = "1.9.0"
coreKtx = "1.13.1"
junit = "4.13.2"
junitVersion = "1.1.5"
espressoCore = "3.5.1"
appcompat = "1.6.1"
material = "1.12.0"
activity = "1.8.2"
constraintlayout = "2.1.4"


// DEPENDENCIES
implementation("com.squareup.retrofit2:retrofit:2.9.0")
implementation("com.squareup.retrofit2:converter-gson:2.9.0")


// MANIFEST ATTRIBUTES
android:usesCleartextTraffic="true"
android:networkSecurityConfig="@xml/network_security_config"



// GRADLE PROPERTIES
android.enableJetifier=true


// SLIDE IN EFFECT
val fragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()

[ 
    FRAGMENT_ENTER.XML - ANIM FILE
    <set xmls:android="http://schemas.android.com/apk/res/android">
        <translate android:fromXDelta="100%" android:toXDelta="0%" android:duration="300"/>
    </set>

    FRAGMENT_EXIT.XML - ANIM FILE
    <set xmls:android="http://schemas.android.com/apk/res/android">
        <translate android:fromXDelta="100%" android:toXDelta="0%" android:duration="300"/>
    </set>
]

fragmentTransaction.setCustomAnimations (
    R.anim.fragment_enter, // ENTER ANIMATION
    R.anim.fragment_exit // EXIT ANIMATION
)

redirectButton.setOnClickListener{ _ ->
    fragmentTransaction.replace('id of activity fragment', 'id of fragment we navigating to')
    fragmentTransaction.addToBackStack(null)
    fragmentTransaction.commit()
}

// TO PREVENT PROPAGATION
android:clickable="true"
android:focusable="true"


// TO PREVENT TEXT 
android:digits="0123456789"

// TO PREVENT NUMBERS OR OTHER SPECIAL CHARACTERS
android:digits="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ "