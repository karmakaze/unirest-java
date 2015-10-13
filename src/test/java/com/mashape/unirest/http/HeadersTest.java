package com.mashape.unirest.http;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class HeadersTest {
	private Headers headers;

	@Before
	public void setUp() {
		headers = new Headers();
		headers.put("Content-Type", Arrays.asList("application/json"));
	}

	@Test
	public void testHeaderNamesCaseSensitive() {

		assertEquals("Only header \"Content-Type\" should exist", null, headers.getFirst("cOnTeNt-TyPe"));
		assertEquals("Only header \"Content-Type\" should exist", null, headers.getFirst("content-type"));
		assertEquals("Only header \"Content-Type\" should exist", "application/json", headers.getFirst("Content-Type"));
	}
}
