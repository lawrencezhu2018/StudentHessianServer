package xyz.cicy.student.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import xyz.cicy.student.StudentService;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"xyz.cicy.*"})
public class WebConfig
{
	/*@Bean(name = "/StudentService")
	public HessianServiceExporter exporter(StudentService service)
	{
		HessianServiceExporter exporter = new HessianServiceExporter();
		exporter.setService(service);
		exporter.setServiceInterface(StudentService.class);

		return exporter;
	}*/

	@Bean(name = "/StudentService")
	public HttpInvokerServiceExporter exporter(StudentService service)
	{
		HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter();
		exporter.setService(service);
		exporter.setServiceInterface(StudentService.class);

		return exporter;
	}

}
