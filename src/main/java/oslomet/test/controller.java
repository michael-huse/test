package oslomet.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class controller {
 @GetMapping("/")
 public String hei(String navn) {
     int antallBokstaverNavn = navn.length();
     return "Hei verden " + navn + "!" + " navnet dit er " + antallBokstaverNavn + "bokstaver langt. ";
 }

}
