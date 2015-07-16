package com.quinn.httpknife;

import java.util.Map;

interface UrlRewriter {
	
	public String rewriteWithParam(String originUrl, Map<?, ?> params);
	
	public String rewriteWithEncoding(String originUrl);
	
}
