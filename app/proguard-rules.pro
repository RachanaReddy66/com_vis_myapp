# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}
#-keep class com.cloudpos.**{*;}

#-optimizations controlflow
#
#
## Enable optimization and obfuscation
#-optimizationpasses 20
#-dontusemixedcaseclassnames
#-dontskipnonpubliclibraryclasses
#-verbose

#-assumenosideeffects class com.visiontek.com_vis_myapp.MainActivity {
#    void displayText(java.lang.String);
#}

#-optimizationpasses 5
#-mergeinterfacesaggressively
#-dontpreverify
#-optimizations !code/simplification/arithmetic
#
##-repackageclasses 'com.visiontek'
#-flattenpackagehierarchy 's.example'
#-allowaccessmodification
#-useuniqueclassmembernames
#-keeppackagenames doNotKeepAThing
#
#-obfuscationdictionary method-dictionary.txt
-packageobfuscationdictionary package-dictionary.txt
#-classobfuscationdictionary class-dictionary.txt
-repackageclasses 'o'

-keep class com.cloudpos.**{*;}
# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile