package com.thoughtworks.davpp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringBufferInputStream;

public class Client {
	public Client() {
		in = new BufferedReader(new InputStreamReader(System.in));
        init();
	}

	public Client(String str) {
		in = new BufferedReader(new InputStreamReader(
				new StringBufferInputStream(str)));
        init();
	}

	public void init() {
		builder = new Builder();
		builder.init();
		String strInit = readLine();
		builder.setInitArea(strInit);
	}

	public void run() {
		String strPos = readLine();
		builder.setMarsRoverPositionCommand(strPos);

		String strExp = readLine();
		builder.setMarsRoverExploreCommand(strExp);

		builder.runMarsRoverManager();
		System.out.println(getResult());
	}

	public String getResult() {
		return builder.getResult();
	}

	private String readLine() {
		String str = null;
		try {
			str = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			closeIn();
		}
		return str;
	}

	private void closeIn() {
		try {
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private BufferedReader in;
	private Builder builder;

	public static void main(String[] args) {
		Client client = new Client();
		while (true)
			client.run();
	}
}
