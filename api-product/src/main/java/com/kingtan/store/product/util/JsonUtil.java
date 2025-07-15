package com.kingtan.store.product.util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kingtan.store.product.model.Product;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class JsonUtil {
	private JsonUtil() {}

	public static JsonNode getJsonNodeFromString(String jsonStr) throws IOException {
		return new ObjectMapper().readTree(jsonStr);
	}

	public static JsonNode getJsonNodeFromByte(byte[] jsonByte) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readTree(jsonByte);
	}

	public static JsonNode getJsonNodeFromFile(File jsonFile) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readTree(jsonFile);
	}

	public static JsonNode getJsonNodeFromStream(InputStream jsonStream) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readTree(jsonStream);
	}

	public static JsonNode getJsonNodeFromReader(Reader jsonReader) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readTree(jsonReader);
	}

	public static JsonNode getJsonNodeFromURL(URL jsonURL) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readTree(jsonURL);
	}

	public static JsonNode getJsonNodeFromMap(Map<String, String> jmap) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readTree(mapper.writeValueAsString(jmap));
	}

	public static Map<String, List<Map<String, String>>> getMapSLMSS(String str)
			throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		JsonNode jsonNode = mapper.readTree(str);
		Map<String, List<Map<String, String>>> result = mapper.convertValue(jsonNode,
				new TypeReference<Map<String, List<Map<String, String>>>>() {
				});
		return result;
	}

	public static Map<String, List<Map<String, String>>> getMapSLMSS2(String str)
			throws IOException {
		ObjectMapper mapper = new ObjectMapper();

		Map<String, List<Map<String, String>>> map = mapper.readValue(str,
				new TypeReference<Map<String, List<Map<String, String>>>>() {
				});
		return map;
	}

	public static Map<String, List<Product>> getMapSLProduct(String str)
			throws IOException {
		ObjectMapper mapper = new ObjectMapper();

		Map<String, List<Product>> map = mapper.readValue(str,
				new TypeReference<Map<String, List<Product>>>() {
				});
		return map;
	}
}
