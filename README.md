# Android_Review_24
GridView, Pass Param between two diff Destination within NavigationUI

![](https://raw.githubusercontent.com/QueenieCplusplus/Android_Review_24/main/output1.png)

![](https://raw.githubusercontent.com/QueenieCplusplus/Android_Review_24/main/output2.png)

![](https://raw.githubusercontent.com/QueenieCplusplus/Android_Review_24/main/output3.png)

safe-args:

top level build gradle =>


    dependencies {

        def nav_version = "2.3.3"
        classpath "androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version"
        
        ...
        
      }


Ref:

https://www.itread01.com/content/1544675943.html (debug)

https://proandroiddev.com/migrating-the-deprecated-kotlin-android-extensions-compiler-plugin-to-viewbinding-d234c691dec7 (kotlin-android-extensions is deprecated)

https://stackoverflow.com/questions/65185166/disable-kotlin-android-extensions-deprecation-warning kotlin-android-extensions is deprecated)

https://developer.android.com/guide/navigation/navigation-pass-data (pass data)

https://www.jianshu.com/p/ffa19d26f65f (fragment)

https://stackoverflow.com/questions/44214136/what-does-r-drawable-image-return (type cast)

https://givemepass.blogspot.com/2011/11/gridview.html (SimpleAdapter & GridView)

http://hk.uwenku.com/question/p-cnphanaq-vu.html (GridView)

