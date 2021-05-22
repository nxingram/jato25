package com.jato25.myApplication.api.helper;

public interface RestCallHelper {

	public String send(String payload, String url);

	public String post(String payload, String url);

	public String get(String queryString, String url);

}
