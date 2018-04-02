package com.bytesville.basics;

import java.util.Date;

public interface ITime {
  Date getDate();

  static String getThreadName(){
    return Thread.currentThread().getName();
  }

  default int getThreadGroupCount(){
    return Thread.currentThread().getThreadGroup().activeGroupCount();
  }
}
