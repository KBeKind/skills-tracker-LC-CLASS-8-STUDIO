package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody
public class SkillsController {

    @GetMapping("/")
    public String displayProgramLanguages(){
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>These are programming languages</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Rust</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "<a href='/form'>Click to choose your favorite!</a>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("/form")
    public String displayForm(){
        return "<html>" +
                "<body>" +
                "<h1>Choose Your Favorite!</h1>" +
                "<form action='/favoriteDisplay'>" +
                    "<input type='text' name='name'>" +
                    "<select name='favorite1'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='JavaScript'>JavaScript</option>" +
                        "<option value='Rust'>Rust</option>" +
                        "<option value='Python'>Python</option>" +
                    "</select>" +
                    "<select name='favorite2'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='JavaScript'>JavaScript</option>" +
                        "<option value='Rust'>Rust</option>" +
                        "<option value='Python'>Python</option>" +
                    "</select>" +
                    "<select name='favorite3'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='JavaScript'>JavaScript</option>" +
                        "<option value='Rust'>Rust</option>" +
                        "<option value='Python'>Python</option>" +
                    "</select>" +
                    "<select name='favorite4'>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='JavaScript'>JavaScript</option>" +
                        "<option value='Rust'>Rust</option>" +
                        "<option value='Python'>Python</option>" +
                    "</select>" +
                    "<button type='submit'>Submit</button>" +
                "</form>" +
                "</body>" +
                "</html>";
    }


    @GetMapping("/favoriteDisplay")
    public String displayFavoriteList(@RequestParam String name, String favorite1, String favorite2, String favorite3, String favorite4) {

        return "<html>" +
                "<body>" +
                "<h1>" + name + "'s Favorite</h1>" +
                "<table>" +
                "<thead>" +
                "<th>#1</th>" +
                "<th>#2</th>" +
                "<th>#3</th>" +
                "<th>#4</th>" +
                "<tr>" +
                "</thead>" +
                "<tbody>" +
                "<tr>" +
                    "<td>" + favorite1 + "</td>" +
                    "<td>" + favorite2 + "</td>" +
                    "<td>" + favorite3 + "</td>" +
                    "<td>" + favorite4 + "</td>" +
                "</tr>" +
                "</tbody>" +
                "</table>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }


}
