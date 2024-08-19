![Kotlinwind Banner](https://github.com/user-attachments/assets/5a28c38a-c7a2-4626-b58f-e9f2b1f312b1)

# Kotlinwind CSS

[![Kotlin](https://img.shields.io/badge/Kotlin-1.9.24-blue.svg?style=flat&logo=kotlin)](https://kotlinlang.org)
[![Maven Central Version](https://img.shields.io/maven-central/v/io.github.allangomes/kotlinwind-css)](https://search.maven.org/artifact/io.github.allangomes/kotlinwind-css)
[![Tests](https://github.com/allangomes/kotlinwind-css/actions/workflows/on-push.yml/badge.svg?branch=dev&event=push)](https://github.com/allangomes/kotlinwind-css/actions/workflows/on-push.yml)

<br/><br/>

## Overview

Kotlinwind CSS is a Kotlin library that enhances your experience with [kotlinx.html](https://github.com/Kotlin/kotlinx.html) by providing a more Kotlin-centric approach to styling HTML. Inspired by Tailwind CSS, this library allows you to apply CSS styles directly within your HTML-building code, utilizing Kotlin's type-safe, declarative syntax through a Kotlin DSL (Domain-Specific Language).

<p align="center">
  <img src="https://github.com/user-attachments/assets/b3310eeb-83f6-41b0-97ec-e39fbe8c1c8e" alt="Demonstration" />
</p>

<br/><br/>

## Features

- **Type-Safe CSS**: Write CSS directly in Kotlin using a type-safe API.
- **Seamless Integration**: Designed to work smoothly with `kotlinx.html`.
- **Declarative Syntax**: Benefit from Kotlin's expressive DSL to manage styles inline, reducing the need for external stylesheets.
- **Inspired by Tailwind CSS**: Leverage a similar utility-first approach for styling, now available in Kotlin.

<br/><br/>

## Code Preview

| Kotlinwind CSS Code | Resulting HTML |
| -------- | ------- |
| <img width="704" alt="Screenshot 2024-08-17 at 13 00 49" src="https://github.com/user-attachments/assets/12bc1408-f78f-4127-9e06-7e9985f08719"> | <img width="315" alt="Screenshot 2024-08-17 at 10 56 55" src="https://github.com/user-attachments/assets/dad10d8a-6ffd-4469-80bf-721da7e33290">  |

<br/><br/>

## Motivation

Kotlinwind CSS is built for developers who prefer a Kotlin-native way of styling HTML. By leveraging Kotlin's type-safe, declarative DSL and drawing inspiration from the utility-first approach of Tailwind CSS, this library eliminates the need for traditional CSS files and provides a more cohesive development experience within Kotlin projects.

<br/><br/>

## Getting Started

To start using Kotlinwind CSS in your project, add the following dependency to your `build.gradle.kts` file:

```kotlin
implementation("io.github.allangomes:kotlinwind-css:{VERSION}")
```

Replace `{VERSION}` with the latest version available on [Maven Central](https://search.maven.org/artifact/io.github.allangomes/kotlinwind-css).

<br/><br/>

## Documentation

For detailed usage instructions and examples, visit the [Wiki](https://github.com/allangomes/kotlinwind-css/wiki).

<br/><br/>

## Limitations

Currently, Kotlinwind CSS supports only inline styles. Future versions will introduce support for external stylesheets and CSS classes.

<br/><br/>

## Roadmap

- **0.0.2 - 0.0.9**
  - Grid Layout
  - Table Styling
  - SVG Styling
  - CSS Transforms

- **0.1.0 - 0.1.9**
  - Class-based Styling
  - `@media` Queries Support

- **Future Plans**
  - Kotlin Multiplatform Support
    - Jetpack Compose Integration (returning a `Modifier`)
  - Interactivity Support (JS/TS Framework Integration)

<br/><br/>

### Note

Interactivity is not a priority at this stage, as starting with a JS/TS framework may be more beneficial for projects requiring dynamic behavior.
