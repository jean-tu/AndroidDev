# Android Development Notes 

Learning through a Lynda Course: **Android App Development Quick Start** 

Supported Android Devices: 

* Tablet 
* Phone 
* Chrome OS 
* Android TB 
* Android Auto 
* Android Wear  

## Major Parts

* **Android Studio** - where you can design the layout of the applciation, develop your code, and build your app to run which would help you manage it to know if you have any bugs (so it allows you to test) 
* **Java** - object oriented programming language that allows for Web app develpoment & desktop app development 
* **XML** - language that creates structure for the content 
	* Based on "tags" and attributes
	* The id is what you would use to link it to the Java portion 
	* Example: 

	
```
<Button 
	android:id="@+id/myButton", 
	android:text="Click Me!", 
	android:onClick="DoSomething
/> 

```

* **Android SDK** - prebuilt widgets & code
* **Starter Templates** - the starting Activities that you get to choose from 
	* It connects to the Android SDK 
	* Gives you folder & product structure 
	* Can download & install plugins 
* **Emulators** - using your computer as a device, but the draw back is that there are some sensors & components that you would not have access to so it might be hard to test certain components 
* **Hardware** - how you would be able to fully test the applciation 
* **Docs** - [developer.android.com/reference](developer.android.com/reference) is where you would be able to get some documentation

## Short Cuts 
* If you want to add a missing package `Alt + Enter` 

## Development 
* **Toast** - what you can use for pop-ups to alert the user of something 

``` 
Toast.makeText(getApplicationContext(), "Welcome to DiceOut", Toast.LENGTH_SHORT).show();
```

* Margins is the amount of space that is outside of the Widget walls 
* Padding is the amount of space that is inside the widget 









