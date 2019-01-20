package xyz.cicy.student.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class StudentWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
{
	@Override
	protected Class<?>[] getRootConfigClasses()
	{
		return new Class[0];
	}

	@Override
	protected Class<?>[] getServletConfigClasses()
	{
		return new Class[]{WebConfig.class};
	}

	@Override
	protected String[] getServletMappings()
	{
		return new String[]{"/"};
	}
}
