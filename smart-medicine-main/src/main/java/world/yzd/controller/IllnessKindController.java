package world.yzd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import world.yzd.entity.IllnessKind;


@RestController
@RequestMapping("illness_kind")
public class IllnessKindController extends BaseController<IllnessKind> {

}
