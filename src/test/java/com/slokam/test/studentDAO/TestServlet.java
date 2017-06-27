package com.slokam.test.studentDAO;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.slokam.Servlet.LoginServlet;

@RunWith(MockitoJUnitRunner.class)
public class TestServlet {

	
    @Mock
    private HttpServletRequest request;
    @Mock
    private HttpServletResponse response;
    @Mock
    private RequestDispatcher dispatcher;
    
    
    
    LoginServlet loginServlet;

    @Before
    public void setUp() {
        loginServlet = new LoginServlet();
        when(request.getRequestDispatcher(anyString())).thenReturn(dispatcher);
    }

    @Test
    public void testProcessRequest() throws Exception {
        loginServlet.service(request, response);
        ArgumentCaptor<String> dispatcherArgument = ArgumentCaptor.forClass(String.class);
        verify(request).getRequestDispatcher(dispatcherArgument.capture());
        Assert.assertEquals("login.jsp", dispatcherArgument.getValue());
    }
  /*  @Test
    public void testProcessRequestValid() throws Exception {
    	request.setAttribute("username", "syam");
    	request.setAttribute("password", "123");
        loginServlet.service(request, response);
        ArgumentCaptor<String> dispatcherArgument = ArgumentCaptor.forClass(String.class);
        verify(request).getRequestDispatcher(dispatcherArgument.capture());
        Assert.assertEquals("StudentSignup.jsp", dispatcherArgument.getValue());
    }*/
    @After
    public void tearDown() {
    }
}
