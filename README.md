# Network Checker for Android

[![Download](https://jitpack.io/v/Sangmeebee/SMNetworkChecker.svg)](https://jitpack.io/#Sangmeebee/SMNetworkChecker)
[![Releases](https://img.shields.io/github/release/Sangmeebee/SMNetworkChecker/all.svg?style=flat-square)](https://github.com/Sangmeebee/SMNetworkChecker/releases)
![Language](https://img.shields.io/badge/language-Kotlin-orange.svg)
[![License](https://img.shields.io/badge/license-Apache%202.0-blue.svg)](https://github.com/Sangmeebee/SMNetworkChecker/blob/main/LICENSE)

SMNetworkChecker aims to help check if the network is connected or if the wifi is connected.

<br/><br/>

## Preview

   Network connection O    |    Network connection X    |    wifi connection O    |    wifi connection X    |
:-------------------------:|:--------------------------:|:-----------------------:|:-----------------------:|
![](https://github.com/Sangmeebee/SMNetworkChecker/blob/main/img/network1.gif)  |  ![](https://github.com/Sangmeebee/SMNetworkChecker/blob/main/img/network2.gif)  |  ![](https://github.com/Sangmeebee/SMNetworkChecker/blob/main/img/wifi1.gif)  |  ![](https://github.com/Sangmeebee/SMNetworkChecker/blob/main/img/wifi2.gif)


<br/><br/>

## Usage

### 1. Gradle dependency:
- Add it in your root build.gradle at the end of repositories

	```groovy
	allprojects {
	   repositories {
           	maven { url "https://jitpack.io" }
	   }
	}
 	```
- Add the dependency

    ```groovy
   implementation 'com.github.Sangmeebee:SMNetworkChecker:x.y.z'
    ```

<br/>

### 2. Set init function in the Class that inherits from Application
  ```kotlin
  // Application.kt
      override fun onCreate() {
        super.onCreate()
        
        // ...
        
        //network module build
        NetworkCheckApi.init(this)
    }
  ```
  
### 3. You have to user NetworkCheckApi
- network check function

  ```kotlin
  NetworkCheckApi.getNetWorkConnectState()  // return Boolean
  ```
- wifi check function

  ```kotlin
  NetworkCheckApi.getWifiConnectState()  // return Boolean
  ```

<br/><br/>

## License 
 ```code
Copyright 2022 Sangmeebee

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
