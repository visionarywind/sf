package com.wind.app;

import com.wind.concurrent.hb.ThreadHappenBefore;

class App {
  public static void main(String[] args) throws Exception {
      // new CounterExecutor().start();
      // new InterceptingFilterExecutor().start();
      new ThreadHappenBefore().start();
  }

  private static String greetings() {
    return "Hi";
  }
}
