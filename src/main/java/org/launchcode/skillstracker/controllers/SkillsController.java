package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String skillsHeader() {
        return "<h1>Skills Tracker</h1>\n" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>\n" +
                "<ol>\n" +
                "\t<li>Java</li>\n" +
                "\t<li>JavaScript</li>\n" +
                "\t<li>Python</li>\n" +
                "</ol>";
    }


    @GetMapping("form")
    @ResponseBody
    public String inputForm() {
        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'post' action = '/form'>" +
                        "<h2>Name:</h2>" +
                        "<input type = 'text' name = 'name'/>" +
                        "<h2>My favorite language:</h2>" +
                        "<select name='firstLanguage' id='first-language'>" +
                            "<option></option>" +
                            "<option value='Java'>Java</option>" +
                            "<option value='Javascript'>JavaScript</option>" +
                            "<option value='Python'>Python</option>" +
                        "</select>" +
                        "<h2>My second favorite language:</h2>" +
                        "<select name='secondLanguage' id='second-language'>" +
                            "<option></option>" +
                            "<option value='Java'>Java</option>" +
                            "<option value='Javascript'>JavaScript</option>" +
                            "<option value='Python'>Python</option>" +
                        "</select>" +
                        "<h2>My third favorite language:</h2>" +
                        "<select name='thirdLanguage' id='third-language'>" +
                            "<option></option>" +
                            "<option value='Java'>Java</option>" +
                            "<option value='Javascript'>JavaScript</option>" +
                            "<option value='Python'>Python</option>" +
                        "</select>" +
                        "<br>" +
                        "<br>" +
                        "<input type = 'submit' value = 'Submit' />" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }

    @PostMapping("/form")
    @ResponseBody
    public String formResponse(@RequestParam String name, @RequestParam String firstLanguage, @RequestParam String secondLanguage, @RequestParam String thirdLanguage) {
        return "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + firstLanguage + "</li>" +
                "<li>" + secondLanguage + "</li>" +
                "<li>" + thirdLanguage + "</li>";
    }

}
