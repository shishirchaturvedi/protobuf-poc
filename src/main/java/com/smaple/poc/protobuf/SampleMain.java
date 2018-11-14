package com.smaple.poc.protobuf;

import example.simple.Simple;

import java.util.Arrays;

public class SampleMain {

  public static void main(String[] args) {
    System.out.println("Hello World");
    Simple.SimpleMessage.Builder builder = Simple.SimpleMessage.newBuilder();
    builder
        .setId(100)
        .setIsSimple(true)
        .setName("XYZ")
        .addAllSampleList(Arrays.asList(1, 2, 3, 4, 5));

    System.out.println(builder.toString());
    System.out.println(builder.build());
  }
}
