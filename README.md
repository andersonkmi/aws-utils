# AWS Utils [![Build Status](https://travis-ci.org/andersonkmi/aws-utils.svg?branch=master)](https://travis-ci.org/andersonkmi/aws-utils)
Library with common objects used in other Spark/Scala projects related to AWS services

For now I am using the Java SDK for AWS v1 due to dependency conflicts when using with Spark projects.

## 1. Introduction

This project contains some shared classes/objects used in other Spark projects I have developed so far and since I got
tired of copying and pasting the same bits of code, I realized it was about time to create this repo.

## 2. Description

Some classes found here are related to:
- S3 download/upload objects

## 3. Build and deploy

In order to build and deploy this library, perform the following commands:

```bash
$ sbt compile
$ sbt publishLocal
```