# abhiEditText - Customizable Android EditText with Dynamic Features

AbhiEditText is an advanced **Android EditText library** that allows dynamic customization of
*hint text, heading, icons, and input type* directly via XML. Designed for **Material Design**,
it simplifies user input fields with a beautiful UI.

> Step 1. Add the JitPack repository to your build file.
```gradle
dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url = uri("https://jitpack.io") }
		}
	}
```
> Step 2. Add the dependency.
```gradle
dependencies {
	        implementation("com.github.abhivishrut:abhiEditText:1.0.2")
	}
```

> XML
```xml
<com.codewati.abhiedittext.abhiEditText
        android:id="@+id/customEt"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:headingText="Enter Full Name"
        android:layout_marginTop="12dp"
        android:layout_marginHorizontal="12dp"
        app:hintText="e.g. Abhivishrut Bishnoi"
        app:iconSrc="@drawable/ic_person"
        app:inputType="text"/>
```
# Preview :
![Image](https://github.com/user-attachments/assets/7a8d648e-9da0-43df-a077-47fcdf15fdd1)
