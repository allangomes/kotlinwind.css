




![Kotlinwind Banner](https://github.com/user-attachments/assets/5a28c38a-c7a2-4626-b58f-e9f2b1f312b1)

# Kotlinwind CSS

[![Kotlin](https://img.shields.io/badge/Kotlin-1.9.24-blue.svg?style=flat&logo=kotlin)](https://kotlinlang.org)
[![Maven Central Version](https://img.shields.io/maven-central/v/io.github.allangomessl/kotlinwind-css)](https://search.maven.org/artifact/io.github.allangomessl/kotlinwind-css)
[![Tests](https://github.com/allangomessl/kotlinwind-css/actions/workflows/on-push.yml/badge.svg?branch=dev&event=push)](https://github.com/allangomessl/kotlinwind-css/actions/workflows/on-push.yml)

## Overview

Kotlinwind CSS is a Kotlin library that simplifies styling HTML when using [kotlinx.html](https://github.com/Kotlin/kotlinx.html). This library enables a more streamlined and Kotlin-friendly approach to applying CSS styles directly in your HTML-building code.

## Code Preview

| Code Snippet    | Preview |
| -------- | ------- |
| <img width="704" alt="Screenshot 2024-08-17 at 13 00 49" src="https://github.com/user-attachments/assets/12bc1408-f78f-4127-9e06-7e9985f08719"> | <img width="315" alt="Screenshot 2024-08-17 at 10 56 55" src="https://github.com/user-attachments/assets/dad10d8a-6ffd-4469-80bf-721da7e33290">  |


## Motivation

Kotlinwind CSS is useful for developers who prefer Kotlin's type-safe, declarative syntax while styling HTML with `kotlinx.html`. It provides a more intuitive and integrated way to manage styles without relying on traditional CSS or external stylesheets.


## Installation

To include Kotlinwind CSS in your project, add the following dependency to your `build.gradle.kts` file:

```kotlin
implementation("io.github.allangomessl:kotlinwind-css:0.0.1")
```

---

This version improves clarity, enhances the structure, and adds more context to the different sections, making it easier for users to understand the purpose and usage of the library.


## Documentation
- Core
  - [colors](https://github.com/allangomessl/kotlinwind-css/edit/dev/README.md#colors)
- Features
  - [background](https://github.com/allangomessl/kotlinwind-css?tab=readme-ov-file#background)
  - [border](https://github.com/allangomessl/kotlinwind-css?tab=readme-ov-file#border)
  - [box](https://github.com/allangomessl/kotlinwind-css?tab=readme-ov-file#box)
  - [font](https://github.com/allangomessl/kotlinwind-css?tab=readme-ov-file#font)
  - [text](https://github.com/allangomessl/kotlinwind-css?tab=readme-ov-file#text)

### Colors
```kotlin
white
black
color_inherit
color_current
transparent
slate   [I50, I100, I200, I300, I400, I500, I600, I700, I800, I900, I950]
gray    [I50, I100, I200, I300, I400, I500, I600, I700, I800, I900, I950]
zinc    [I50, I100, I200, I300, I400, I500, I600, I700, I800, I900, I950]
neutral [I50, I100, I200, I300, I400, I500, I600, I700, I800, I900, I950]
stone   [I50, I100, I200, I300, I400, I500, I600, I700, I800, I900, I950]
red     [I50, I100, I200, I300, I400, I500, I600, I700, I800, I900, I950]
orange  [I50, I100, I200, I300, I400, I500, I600, I700, I800, I900, I950]
amber   [I50, I100, I200, I300, I400, I500, I600, I700, I800, I900, I950]
yellow  [I50, I100, I200, I300, I400, I500, I600, I700, I800, I900, I950]
lime    [I50, I100, I200, I300, I400, I500, I600, I700, I800, I900, I950]
green   [I50, I100, I200, I300, I400, I500, I600, I700, I800, I900, I950]
emerald [I50, I100, I200, I300, I400, I500, I600, I700, I800, I900, I950]
teal    [I50, I100, I200, I300, I400, I500, I600, I700, I800, I900, I950]
cyan    [I50, I100, I200, I300, I400, I500, I600, I700, I800, I900, I950]
sky     [I50, I100, I200, I300, I400, I500, I600, I700, I800, I900, I950]
blue    [I50, I100, I200, I300, I400, I500, I600, I700, I800, I900, I950]
indigo  [I50, I100, I200, I300, I400, I500, I600, I700, I800, I900, I950]
violet  [I50, I100, I200, I300, I400, I500, I600, I700, I800, I900, I950]
purple  [I50, I100, I200, I300, I400, I500, I600, I700, I800, I900, I950]
fuchsia [I50, I100, I200, I300, I400, I500, I600, I700, I800, I900, I950]
pink    [I50, I100, I200, I300, I400, I500, I600, I700, I800, I900, I950]
rose    [I50, I100, I200, I300, I400, I500, I600, I700, I800, I900, I950]

//example
kw.inline { background.red[I500] } //background-color: #EF4444
```

### Background
```kotlin
blue[I500]                        // background-color: #EF4444;
...see more in colors

image[IMAGE_URL]                  // background-image: url('IMAGE_URL')
image_none                        // background-image: none

origin_border                     // background-origin: border-box
origin_padding                    // background-origin: padding-box
origin_content                    // background-origin: content-box

bottom                            // background-position: bottom;
center                            // background-position: center;
left                              // background-position: left;
left_bottom                       // background-position: left bottom;
left_top                          // background-position: left top;
right                             // background-position: right;
right_bottom                      // background-position: right bottom;
right_top                         // background-position: right top;
top                               // background-position: top;

repeat                            // background-repeat: repeat;
no_repeat                         // background-repeat: no-repeat;
repeat_x                          // background-repeat: repeat-x;
repeat_y                          // background-repeat: repeat-y;
repeat_round                      // background-repeat: round;
repeat_space                      // background-repeat: space;

auto                              // background-size: auto;
cover                             // background-size: cover;
contain                           // background-size: contain;

//example: 
kw.inline { background.blue[I500].image[IMAGE_URL].origin_padding.center.no_repeat.auto }
```

### Border
```kotlin
// border color
___________________________________________________________________________
gray[I200]                        // border-color: #E5E7EB;
...see more in colors
___________________________________________________________________________

// border radius
___________________________________________________________________________
rounded[SIZE]                     // border-radius: {SIZE}rem
___________________________________________________________________________
rounded_s[SIZE]                   // border-start-start-radius: {SIZE}rem
                                  // border-end-start-radius: {SIZE}rem
___________________________________________________________________________
rounded_e[SIZE]                   // border-start-end-radius: {SIZE}rem
                                  // border-end-end-radius: {SIZE}rem
___________________________________________________________________________
rounded_t[SIZE]                   // border-top-left-radius: {SIZE}rem
                                  // border-top-right-radius: {SIZE}rem
___________________________________________________________________________
rounded_r[SIZE]                   // border-top-right-radius: {SIZE}rem
                                  // border-bottom-right-radius: {SIZE}rem
___________________________________________________________________________
rounded_r[SIZE]                   // border-bottom-right-radius: {SIZE}rem
                                  // border-bottom-left-radius: {SIZE}rem
___________________________________________________________________________
rounded_l[SIZE]                   // border-top-left-radius: {SIZE}rem
                                  // border-bottom-left-radius: {SIZE}rem
___________________________________________________________________________
rounded_ss[SIZE]                  // border-start-start-radius: {SIZE}rem
___________________________________________________________________________
rounded_se[SIZE]                  // border-start-end-radius: {SIZE}rem
___________________________________________________________________________
rounded_ee[SIZE]                  // border-end-end-radius: {SIZE}rem
___________________________________________________________________________
rounded_es[SIZE]                  // border-end-start-radius: {SIZE}rem
___________________________________________________________________________
rounded_ee[SIZE]                  // border-end-end-radius: {SIZE}rem
___________________________________________________________________________
rounded_tl[SIZE]                  // border-top-left-radius: {SIZE}rem
___________________________________________________________________________
rounded_tr[SIZE]                  // border-top-right-radius: {SIZE}rem
___________________________________________________________________________
rounded_br[SIZE]                  // border-bottom-right-radius: {SIZE}rem
___________________________________________________________________________
rounded_bl[SIZE]                  // border-bottom-left-radius: {SIZE}rem
___________________________________________________________________________

// border width
___________________________________________________________________________
all[SIZE]                         // border-width: {SIZE}px
___________________________________________________________________________
x[SIZE]                           // border-left-width: {SIZE}px
                                  // border-right-width: {SIZE}px
___________________________________________________________________________
y[SIZE]                           // border-top-width: {SIZE}px
                                  // border-bottom-width: {SIZE}px
___________________________________________________________________________
start[SIZE]                       // border-inline-start-width: {SIZE}px
___________________________________________________________________________
end[SIZE]                         // border-inline-end-width: {SIZE}px
___________________________________________________________________________
top[SIZE]                         // border-top-width: {SIZE}px
___________________________________________________________________________
right[SIZE]                       // border-right-width: {SIZE}px
___________________________________________________________________________
bottom[SIZE]                      // border-bottom-width: {SIZE}px
___________________________________________________________________________
left[SIZE]                        // border-left-width: {SIZE}px
___________________________________________________________________________
```

### Box

### Font

### Text


