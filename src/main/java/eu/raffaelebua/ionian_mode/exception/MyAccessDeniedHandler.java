package eu.raffaelebua.ionian_mode.exception;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

@Component
public class MyAccessDeniedHandler implements AccessDeniedHandler {

	private String errorPage;

	public MyAccessDeniedHandler() {
		System.out.println("contstructor");
	}

	public MyAccessDeniedHandler(String errorPage) {
		this.errorPage = errorPage;
	}

	public String getErrorPage() {
		return errorPage;
	}

	public void setErrorPage(String errorPage) {
		this.errorPage = errorPage;
	}

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException var3) throws IOException, ServletException {

		System.out.print("--------------");
		System.out.print("--------------");
		response.setStatus(HttpServletResponse.SC_FORBIDDEN);

	}

}