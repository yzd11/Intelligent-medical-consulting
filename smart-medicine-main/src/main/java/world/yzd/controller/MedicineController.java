package world.yzd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import world.yzd.entity.Medicine;



@RestController
@RequestMapping("medicine")
public class MedicineController extends BaseController<Medicine> {

}
