package world.yzd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import world.yzd.entity.History;



@RestController
@RequestMapping("history")
public class HistoryController extends BaseController<History> {

}
