Apimap.io IntelliJ Plugin
=====

🥳 **Happy Coding** 🥳

This section is targeted to developers that want to communicate with the API directly. 

## Table of Contents

* [Introduction](#introduction)
* [Getting Started](#getting-started)
* [Other Resources](#other-resources)

## Introduction

## Getting Started

### Build and Run

#### Requirements

- Grammar-Kit
- PSI viewer 
- IntelliJ IDEA.

#### 1: If changes to BNF

If there are changes to the bnf files a new flex file has to be created. 

#### 2: Generate Lexer

> gradlew generateMetadataLexer

> gradlew generateTaxonomyLexer

#### 3: Generate Metadata Parser

> gradlew generateMetadataParser

> gradlew generateTaxonomyParser

#### 4: Build Plugin

> gradlew buildPlugin

## Other Resources
___

- [https://plugins.jetbrains.com/docs/intellij/custom-language-support-tutorial.html](https://plugins.jetbrains.com/docs/intellij/custom-language-support-tutorial.html)
- [https://plugins.jetbrains.com/docs/intellij/language-and-filetype.html](https://plugins.jetbrains.com/docs/intellij/language-and-filetype.html)
- [https://github.com/JetBrains/Grammar-Kit](https://github.com/JetBrains/Grammar-Kit)