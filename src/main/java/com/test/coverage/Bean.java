package com.test.coverage;

public class Bean {

  private final String message;
  private final String url;

  public Bean(String message, String url) {
    this.message = message;
    this.url = url;
  }

  public String getMessage() {
    return message;
  }

  public String getUrl() {
    return url;
  }
}
