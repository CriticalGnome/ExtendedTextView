# ExtendedTextView

[ ![Download](https://api.bintray.com/packages/criticalgnome/maven/exttextview/images/download.svg) ](https://bintray.com/criticalgnome/maven/exttextview/_latestVersion)

Simple wrapper for standard TextView with optional additional field below main text.
## Using
Add repository to your project ```build.gradle```:

```
repositories {
    ...
    maven {
        url  "https://dl.bintray.com/criticalgnome/maven" 
    }
}
```

Add dependensy to your app ```build.gradle```:
```
dependencies {
    ...
    implementation 'com.criticalgnome:exttextview:1.0'
}
```
Now you can add ```ExtTextView``` to your xml layout.

### Available methods:

```setMainText()``` set text to main block. May accept both ```String``` or ```@StringRes int```.

```setMainTextStyle()``` set text style to main block. May accept ```@StyleRes int```.

```setAdditionalText()``` set text to additional block. May accept both ```String``` or ```@StringRes int```. If argument is ```null``` of empty string, additional block is not shown (default state)

```setAdditionalTextStyle()``` set text style to additional block. May accept ```@StryleRes int```.

## Changelog

- 1.0
    - Initial release
- 1.1
    - Added style change methods

## License

    Copyright 2018 Sergey Kalinovsky
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
        http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.