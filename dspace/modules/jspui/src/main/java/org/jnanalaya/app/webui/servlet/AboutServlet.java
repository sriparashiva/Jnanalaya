/**
 * Copyright Nithyananda Hindu University 2019
 */
package org.jnanalaya.app.webui.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.dspace.app.webui.servlet.DSpaceServlet;
import org.dspace.app.webui.util.Authenticate;
import org.dspace.app.webui.util.JSPManager;
import org.dspace.authorize.AuthorizeException;
import org.dspace.core.Context;
import org.dspace.core.LogManager;

/**
 * Servlet that display About html page.
 *
 * @author Binoy Joseph
 * @version $Revision$
 */
public class AboutServlet extends DSpaceServlet
{
    /** log4j logger */
    private static Logger log = Logger.getLogger(AboutServlet.class);

    protected void doDSGet(Context context, HttpServletRequest request,
                           HttpServletResponse response) throws ServletException, IOException,
            SQLException, AuthorizeException
    {
        log.info(LogManager.getHeader(context, "about", ""));

        JSPManager.showJSP(request, response, "/about/about.jsp");
    }
}
