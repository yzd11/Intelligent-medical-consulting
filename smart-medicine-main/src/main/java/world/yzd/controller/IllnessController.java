package world.yzd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import world.yzd.entity.Illness;



@RestController
@RequestMapping("illness")
public class IllnessController extends BaseController<Illness> {

}
