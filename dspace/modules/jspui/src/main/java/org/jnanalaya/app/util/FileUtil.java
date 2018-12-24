package org.jnanalaya.app.util;

import org.dspace.services.factory.DSpaceServicesFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

public class FileUtil {

    private static final Logger log = LoggerFactory.getLogger(FileUtil.class);

    public static String readFile(String fileName)
    {
        String filePath = getFilePathFromInstallConfig() + fileName;
        StringBuilder text = new StringBuilder();

        try
        {
            // retrieve existing news from file
            FileInputStream fir = new FileInputStream(filePath);
            InputStreamReader ir = new InputStreamReader(fir, "UTF-8");
            BufferedReader br = new BufferedReader(ir);

            String lineIn;

            while ((lineIn = br.readLine()) != null)
            {
                text.append(lineIn);
            }

            br.close();
            ir.close();
            fir.close();
        }
        catch (IOException e)
        {
            log.warn("file_read: " + e.getLocalizedMessage());
        }

        return text.toString();
    }

    public static String getFilePathFromInstallConfig()
    {
        String filePath = DSpaceServicesFactory.getInstance().getConfigurationService().getProperty("dspace.dir")
                + File.separator + "config" + File.separator;
        return filePath;
    }

}
