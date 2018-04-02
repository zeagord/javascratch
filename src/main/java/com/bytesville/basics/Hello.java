package com.bytesville.basics;

import java.time.Instant;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hello {
  private static Logger LOG = LoggerFactory.getLogger(Hello.class);
  public static void main(String args[]){
    System.out.print("Hello World\n");
    int value = 10 + 5;
    LOG.info(Integer.toString(value));
    ITime time2 = Date::new;

    ITime timeLambda = () -> new Date();

    ITime time = new ITime() {
      public Date getDate() {
        return new Date();
      }
    };

    LOG.info(time.getDate().toString());

    LOG.info(CurrentTime.getTime().toString());

    CurrentTime timeNow = new CurrentTime();
    LOG.info(timeNow.getDate().toString());

    LOG.info(ITime.getThreadName());

    LOG.info(Integer.toString(timeNow.getThreadGroupCount()));
  }
}

class CurrentTime extends  Universe implements ITime{

  CurrentTime(){
    super();
    System.out.print("\nInstantiated");
    this.SecondThing();
  }
  public Date getDate() {
    return new Date();
  }

  static Instant getTime(){
    return Instant.now();
  }
}

class Universe {
  Universe(){
    System.out.print("\nInstantiated Super");
  }

  private void someThing(){
    System.out.print("\nSomething");
  }

  void SecondThing(){
    System.out.print("\nSecondThing");

  }
}