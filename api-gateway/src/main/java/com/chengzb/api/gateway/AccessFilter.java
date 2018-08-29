package com.chengzb.api.gateway;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class AccessFilter extends ZuulFilter{

	@Override
	public Object run() {
		RequestContext ctx=RequestContext.getCurrentContext();
		HttpServletRequest request=ctx.getRequest();
		String token = request.getParameter("token");
		if(token==null) {
			ctx.setSendZuulResponse(false);
			ctx.setResponseStatusCode(407);
			ctx.setResponseBody("{\"token\":\"12\"}");
			return null;
		}
		return null;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public String filterType() {
		return "pre";
	}

}
