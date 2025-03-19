# Dependency: abhiEditText v-1.0.1
Integrate the abhiEditText library to easily create customizable EditText components in your Android app. This library enhances the standard EditText with features like headings, hints, icons, and support for various input types (text, number, email, password, etc.). Simply add the dependency, use the component in your layouts, and enjoy a consistent, reusable input field solution.
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
	        implementation("com.github.abhivishrut:abhiEditText:1.0.1")
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
