package com.google.sps.servlets;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

public class RequestUtils extends HttpServlet {
  // Obtain the cookie from the current session
  public static String getCookie(HttpServletRequest request, String name, String defaultValue) {
    Cookie[] cookies = request.getCookies();

    if (cookies != null) {
      for (Cookie cookie : cookies) {
        if (cookie.getName().equals(name)) {
          return cookie.getValue(); // Retrieve the data from the cookie for authentication
        }
      }
    }
    return defaultValue;
  }

  // Return empty string if no comment, otherwise return text
  public static String getParameter(HttpServletRequest request, String name, String defaultValue) {
    String value = request.getParameter(name);
    if (value == null) {
      return defaultValue;
    } else {
      return value;
    }
  }
}
