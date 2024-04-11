package world.yzd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import world.yzd.entity.IllnessMedicine;



@RestController
@RequestMapping("illness_medicine")
public class IllnessMedicineController extends BaseController<IllnessMedicine> {

}
