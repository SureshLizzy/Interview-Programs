package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class sample {

	private void pUTRequestExample() throws IOException {
		URL url = new URL("https://dummy.restapiexample.com/api/v1/update/469");
		URLConnection openConnection = url.openConnection();
		HttpURLConnection connection = (HttpURLConnection)openConnection;
		connection.setRequestMethod("PUT");
//		connection.connect();
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		String jsonBody = "{\"name\":\"Rohit Sharma\",\"salary\":\"1500000\",\"age\":\"35\"}";
		byte[] inputJson = jsonBody.getBytes();
		OutputStream outputStream = connection.getOutputStream();
		outputStream.write(inputJson);
		System.out.println("PUT response code: "+connection.getResponseCode());
		System.out.println("PUT response message: "+connection.getResponseMessage());
		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//		String readLine = bufferedReader.readLine();
//		StringBuffer buffer = new StringBuffer();
//		while (buffer!=null) {
//			buffer.append(readLine);
//		}
//		System.out.println(buffer);
		
		String line;
		StringBuffer buffer = new StringBuffer();
		
		while ((line=bufferedReader.readLine())!=null) {
			buffer.append(line);
		}
		System.out.println(buffer);
	}

	public static void main(String[] args) throws IOException {
		sample s = new sample();
		s.pUTRequestExample();
	}
}
