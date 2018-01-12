# Mobile (Android & iOS) basic calculator sample

This example shows how to use Kotlin library compiled to either
* a framework from an existing iOS project (e.g. written in Swift or Objective-C).
* a jar from an existing Android project

To build and run the **iOS** sample do the following:

1.  Open `samples/mobile/basicCalculator.xcodeproj` with Xcode.
2.  Open the project's target through project navigator, go to tab 'General'.
    In 'Identity' section change the bundle ID to the unique string in
    reverse-DNS format. Then select the team in 'Signing' section.

    See the
    [Xcode documentation](https://developer.apple.com/library/content/documentation/IDEs/Conceptual/AppDistributionGuide/ConfiguringYourApp/ConfiguringYourApp.html#//apple_ref/doc/uid/TP40012582-CH28-SW2)
    for more info.
3.  Now build and run the application.

To build and run the **Android** sample do the following:

1. Open `samples/mobile/` with Android Studio.
2. Now build and run the application.

The sample demonstate how you can create a "shared" Kotlin library which can be used
in iOS and Android.
