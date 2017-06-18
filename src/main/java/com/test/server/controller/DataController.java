package com.test.server.controller;

import com.test.server.data.CountryList;
import com.test.server.data.entity.Country;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;

/**
 * Created by Dmitriy Titov on 17.06.2017.
 */
@RequestMapping("/data_controller")
@RestController
public class DataController {

    @RequestMapping(value = "/get_countries", method = RequestMethod.GET)
    @ResponseBody
    public List<Country> getCountries() {
        return new CountryList().getCountries();
    }


    @RequestMapping(value = "/get_music", method = RequestMethod.GET)
    public void getMusic(HttpServletResponse response) {
        try {
            InputStream is = getClass().getClassLoader().getResourceAsStream("music/epic_sax_guy.mp3");
            OutputStream os = response.getOutputStream();
            IOUtils.copy(is, os);
            response.flushBuffer();
            is.close();
            os.close();
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new RuntimeException("IOError writing file to output stream");
        }
    }
}
