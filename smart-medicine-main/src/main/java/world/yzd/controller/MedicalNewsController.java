package world.yzd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import world.yzd.entity.MedicalNews;



@RestController
@RequestMapping("medical_news")
public class MedicalNewsController extends BaseController<MedicalNews> {


}
