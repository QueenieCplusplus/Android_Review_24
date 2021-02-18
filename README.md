# Android_Review_24
GridView, Pass Param between two diff Destination within NavigationUI

![](https://raw.githubusercontent.com/QueenieCplusplus/Android_Review_24/main/output1.png)

![](https://raw.githubusercontent.com/QueenieCplusplus/Android_Review_24/main/output2.png)

![](https://raw.githubusercontent.com/QueenieCplusplus/Android_Review_24/main/output3.png)

# safe-args:

top level build gradle =>


    dependencies {

        def nav_version = "2.3.3"
        classpath "androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version"
        
        ...
        
      }
      
app level build gradle =>


    plugins {
        id 'com.android.application'
        id 'kotlin-android'
        id 'kotlin-kapt'
        id 'androidx.navigation.safeargs.kotlin'

    }


    dependencies {


        // Navigation
        implementation "android.arch.navigation:navigation-fragment-ktx:$version_navigation"
        implementation "android.arch.navigation:navigation-ui-ktx:$version_navigation"

     }
     
# Navigation


set Navigaton Host on Activity_Main.xml =>

     <fragment
        android:id="@+id/nav_host_fragment"
        android:name="androidx.navigation.fragment.NavHostFragment"
        android:layout_width="match_parent"
        android:layout_height="450dp"
        android:layout_gravity="center_vertical"
        android:layout_marginTop="90dp"
        android:layout_marginBottom="141dp"
        app:defaultNavHost="true"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:navGraph="@navigation/nav_graph" />
        
        
 add 2 diff fragments, then .... add them to nav_graph

 res/navigation/nav_graph.xml =>
 
     <?xml version="1.0" encoding="utf-8"?>
    <navigation xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools"
        android:id="@+id/nav_graph"
        app:startDestination="@id/mainFragment">

        <fragment
            android:id="@+id/mainFragment"
            android:name="com.katepatty.katesshop.ui.main.MainFragment"
            android:label="main_fragment"
            tools:layout="@layout/main_fragment" >
            <action
                android:id="@+id/action_mainFragment_to_detailFragment"
                app:destination="@id/detailFragment" />
            <argument
                android:name="myArg"
                app:argType="integer"
                android:defaultValue="0" />
        </fragment>
        <fragment
            android:id="@+id/detailFragment"
            android:name="com.katepatty.katesshop.ui.main.DetailFragment"
            android:label="fragment_detail"
            tools:layout="@layout/fragment_detail" />
    </navigation>

# GridView

   add GridView component in one of the fragment to do overview UI.

        <?xml version="1.0" encoding="utf-8"?>
        <RelativeLayout
            xmlns:android="http://schemas.android.com/apk/res/android"
            xmlns:app="http://schemas.android.com/apk/res-auto"
            xmlns:tools="http://schemas.android.com/tools"
            android:id="@+id/main"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            tools:context=".ui.main.MainFragment">

            <GridView
                android:id="@+id/gv"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:numColumns="auto_fit"
                android:gravity="center"
                android:columnWidth="135dp"
                android:stretchMode="columnWidth">

            </GridView>

        </RelativeLayout>


Ref:

https://www.itread01.com/content/1544675943.html (debug)

https://proandroiddev.com/migrating-the-deprecated-kotlin-android-extensions-compiler-plugin-to-viewbinding-d234c691dec7 (kotlin-android-extensions is deprecated)

https://stackoverflow.com/questions/65185166/disable-kotlin-android-extensions-deprecation-warning kotlin-android-extensions is deprecated)

https://developer.android.com/guide/navigation/navigation-pass-data (pass data)

https://www.jianshu.com/p/ffa19d26f65f (fragment)

https://stackoverflow.com/questions/44214136/what-does-r-drawable-image-return (type cast)

https://givemepass.blogspot.com/2011/11/gridview.html (SimpleAdapter & GridView)

http://hk.uwenku.com/question/p-cnphanaq-vu.html (GridView)

